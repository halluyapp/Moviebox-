package com.transsion.rewardscenter.task.p308ad;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq.C4698a;
import com.cloud.config.utils.XLogUtil;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.p285ad.bidding.video.BiddingVideoManager;
import com.transsion.push.PushConstants;
import com.transsion.rewardscenter.utils.C18020o;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\fJ\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\fJ\u0015\u0010%\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b%\u0010\u0014J\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\fJ\u0017\u0010)\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000208078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, m97100d2 = {"Lcom/transsion/rewardscenter/task/ad/MemberTaskAdView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", CampaignEx.JSON_KEY_AD_R, "()V", "s", TtmlNode.TAG_P, "n", TmcStartParams.KEY_URL_SHORT, "", "packageName", "m", "(Ljava/lang/String;)V", CampaignEx.JSON_KEY_AD_K, "l", "Lcom/transsion/rewardscenter/task/ad/v$c;", WebConstants.FIELD_ITEM, "index", "w", "(Lcom/transsion/rewardscenter/task/ad/v$c;I)V", "Lcom/transsion/rewardscenter/task/ad/v$a;", "v", "(Lcom/transsion/rewardscenter/task/ad/v$a;I)V", "Laq/a;", XLogUtil.TAG, "setCtxConfig", "(Laq/a;)V", "onPause", "onResume", "onPackageInstall", PushConstants.PROVIDER_FIELD_DESTROY, "Lcom/transsion/rewardscenter/task/ad/BaseStageTaskAdHelper$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setClaimListener", "(Lcom/transsion/rewardscenter/task/ad/BaseStageTaskAdHelper$a;)V", "Lcom/transsion/rewardscenter/task/ad/MemberTaskAdHelper;", "a", "Lcom/transsion/rewardscenter/task/ad/MemberTaskAdHelper;", "adHelper", "Lcom/transsion/rewardscenter/task/ad/d;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/rewardscenter/task/ad/d;", "taskAdAdapter", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "taskAdRecycler", "", "Lcom/transsion/rewardscenter/task/ad/v;", "getFullList", "()Ljava/util/List;", "fullList", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MemberTaskAdView extends ConstraintLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private MemberTaskAdHelper adHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C17892d taskAdAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private RecyclerView taskAdRecycler;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MemberTaskAdView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MemberTaskAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MemberTaskAdView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        m76272r();
    }

    public /* synthetic */ MemberTaskAdView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final List<AbstractC17914v> getFullList() {
        ArrayList arrayList = new ArrayList();
        List listM76338e = C17913u.f58813a.m76338e();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m97516v(listM76338e, 10));
        Iterator it = listM76338e.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AbstractC17914v.c) it.next()).m76379i());
        }
        Set setW0 = CollectionsKt.m97345W0(arrayList2);
        C17913u c17913u = C17913u.f58813a;
        if (!c17913u.m76338e().isEmpty()) {
            arrayList.addAll(c17913u.m76338e());
        }
        if (!c17913u.m76337d().isEmpty()) {
            List listM76337d = c17913u.m76337d();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : listM76337d) {
                if (!setW0.contains(((AbstractC17914v.a) obj).m76362i())) {
                    arrayList3.add(obj);
                }
            }
            arrayList.addAll(arrayList3);
        }
        arrayList.add(new AbstractC17914v.b(null, 1, null));
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    private final void m76265k() {
        List<Object> listL;
        MemberTaskAdHelper memberTaskAdHelper;
        C17892d c17892d = this.taskAdAdapter;
        if (c17892d == null || (listL = c17892d.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        Iterator<T> it = listL.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            AbstractC17914v abstractC17914v = (AbstractC17914v) it.next();
            if (abstractC17914v instanceof AbstractC17914v.c) {
                MemberTaskAdHelper memberTaskAdHelper2 = this.adHelper;
                if (memberTaskAdHelper2 != null) {
                    AbstractC17914v.c cVar = (AbstractC17914v.c) abstractC17914v;
                    if (memberTaskAdHelper2.m76210n(cVar)) {
                        C26866a.a.m104898f(C26866a.f81698a, "StageTaskAd", "MemberTaskAdView----> update stage index: " + i11 + " state: " + cVar.m76375e(), false, 4, null);
                        C17892d c17892d2 = this.taskAdAdapter;
                        if (c17892d2 != null) {
                            c17892d2.notifyItemChanged(i11);
                        }
                    }
                }
            } else if ((abstractC17914v instanceof AbstractC17914v.a) && (memberTaskAdHelper = this.adHelper) != null) {
                AbstractC17914v.a aVar = (AbstractC17914v.a) abstractC17914v;
                if (memberTaskAdHelper.m76209m(aVar)) {
                    C26866a.a.m104898f(C26866a.f81698a, "StageTaskAd", "MemberTaskAdView----> update regular index: " + i11 + " state: " + aVar.m76358e(), false, 4, null);
                    C17892d c17892d3 = this.taskAdAdapter;
                    if (c17892d3 != null) {
                        c17892d3.notifyItemChanged(i11);
                    }
                }
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m76266l() {
        List<Object> listL;
        C17892d c17892d;
        MemberTaskAdHelper memberTaskAdHelper = this.adHelper;
        if (memberTaskAdHelper == null || memberTaskAdHelper.m76204h() != 0) {
            C17892d c17892d2 = this.taskAdAdapter;
            if (c17892d2 == null || (listL = c17892d2.getData()) == null) {
                listL = CollectionsKt.m97506l();
            }
            Iterator<T> it = listL.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                int i12 = i11 + 1;
                AbstractC17914v abstractC17914v = (AbstractC17914v) it.next();
                if (abstractC17914v instanceof AbstractC17914v.c) {
                    MemberTaskAdHelper memberTaskAdHelper2 = this.adHelper;
                    if (memberTaskAdHelper2 != null && memberTaskAdHelper2.m76208l((AbstractC17914v.c) abstractC17914v) && (c17892d = this.taskAdAdapter) != null) {
                        c17892d.notifyItemChanged(i11);
                    }
                } else if (abstractC17914v instanceof AbstractC17914v.a) {
                    AbstractC17914v.a aVar = (AbstractC17914v.a) abstractC17914v;
                    if (aVar.m76358e() == AdTaskState.PLAYING) {
                        aVar.m76366m(AdTaskState.PLAYED);
                        C17892d c17892d3 = this.taskAdAdapter;
                        if (c17892d3 != null) {
                            c17892d3.notifyItemChanged(i11);
                        }
                    }
                }
                i11 = i12;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m76267m(String packageName) {
        List<Object> listL;
        C26866a.a.m104898f(C26866a.f81698a, "StageTaskAd", "MemberTaskAdView --> checkAdsInstallStatus packageName = " + packageName, false, 4, null);
        C17892d c17892d = this.taskAdAdapter;
        if (c17892d == null || (listL = c17892d.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        Iterator<T> it = listL.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            AbstractC17914v abstractC17914v = (AbstractC17914v) it.next();
            if (abstractC17914v instanceof AbstractC17914v.c) {
                AbstractC17914v.c cVar = (AbstractC17914v.c) abstractC17914v;
                if (Intrinsics.m97797c(cVar.m76379i(), packageName)) {
                    m76277w(cVar, i11);
                }
            } else if (abstractC17914v instanceof AbstractC17914v.a) {
                AbstractC17914v.a aVar = (AbstractC17914v.a) abstractC17914v;
                if (Intrinsics.m97797c(aVar.m76362i(), packageName)) {
                    m76276v(aVar, i11);
                }
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m76268n() {
        MemberTaskAdHelper memberTaskAdHelper = this.adHelper;
        if (memberTaskAdHelper != null) {
            memberTaskAdHelper.m76255X(new Function1() { // from class: com.transsion.rewardscenter.task.ad.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MemberTaskAdView.m76269o(this.f58781a, (List) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x00c1  */
    /* JADX INFO: renamed from: o */
    public static final Unit m76269o(MemberTaskAdView memberTaskAdView, List newRegularItems) {
        boolean z11;
        Intrinsics.m97802h(newRegularItems, "newRegularItems");
        List<AbstractC17914v.a> list = newRegularItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
        for (AbstractC17914v.a aVarM76355a : list) {
            AdTaskState adTaskStateM76344l = C17913u.f58813a.m76344l(aVarM76355a.m76362i());
            if (adTaskStateM76344l != null) {
                aVarM76355a = aVarM76355a.m76355a((495 & 1) != 0 ? aVarM76355a.f58824a : null, (495 & 2) != 0 ? aVarM76355a.f58825b : null, (495 & 4) != 0 ? aVarM76355a.f58826c : null, (495 & 8) != 0 ? aVarM76355a.f58827d : null, (495 & 16) != 0 ? aVarM76355a.f58828e : adTaskStateM76344l, (495 & 32) != 0 ? aVarM76355a.f58829f : null, (495 & 64) != 0 ? aVarM76355a.f58830g : false, (495 & 128) != 0 ? aVarM76355a.f58831h : false, (495 & 256) != 0 ? aVarM76355a.f58832i : 0L);
            }
            arrayList.add(aVarM76355a);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            AbstractC17914v.a aVar = (AbstractC17914v.a) obj;
            boolean z12 = aVar.m76358e().ordinal() > AdTaskState.NORMAL.ordinal();
            C18020o c18020o = C18020o.f58998a;
            Context context = memberTaskAdView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            boolean zM76641a = c18020o.m76641a(context, aVar.m76362i());
            C26866a.a.m104898f(C26866a.f81698a, "StageTaskAd", "Regular ----> restoreItem: " + z12 + ", isPullNewAd: " + aVar.m76364k() + ", isAppInstalled: " + zM76641a, false, 4, null);
            if (!z12) {
                if (aVar.m76364k()) {
                    zM76641a = !zM76641a;
                }
                z11 = zM76641a;
            }
            if (z11) {
                arrayList2.add(obj);
            }
        }
        List listB0 = CollectionsKt.m97324B0(C17913u.f58813a.m76337d(), arrayList2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listB0) {
            if (hashSet.add(((AbstractC17914v.a) obj2).m76362i())) {
                arrayList3.add(obj2);
            }
        }
        C17913u.f58813a.m76350s(CollectionsKt.m97333K0(arrayList3, MemberTaskAdHelper.f58727r.m76258a()));
        memberTaskAdView.m76275u();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: p */
    private final void m76270p() {
        MemberTaskAdHelper memberTaskAdHelper = this.adHelper;
        if (memberTaskAdHelper != null) {
            memberTaskAdHelper.m76257Z(new Function1() { // from class: com.transsion.rewardscenter.task.ad.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MemberTaskAdView.m76271q(this.f58780a, (List) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Unit m76271q(MemberTaskAdView memberTaskAdView, List newStageItems) {
        Intrinsics.m97802h(newStageItems, "newStageItems");
        List<AbstractC17914v.c> list = newStageItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
        for (AbstractC17914v.c cVarM76372a : list) {
            AdTaskState adTaskStateM76344l = C17913u.f58813a.m76344l(cVarM76372a.m76379i());
            if (adTaskStateM76344l != null) {
                cVarM76372a = cVarM76372a.m76372a((495 & 1) != 0 ? cVarM76372a.f58834a : null, (495 & 2) != 0 ? cVarM76372a.f58835b : null, (495 & 4) != 0 ? cVarM76372a.f58836c : null, (495 & 8) != 0 ? cVarM76372a.f58837d : null, (495 & 16) != 0 ? cVarM76372a.f58838e : adTaskStateM76344l, (495 & 32) != 0 ? cVarM76372a.f58839f : null, (495 & 64) != 0 ? cVarM76372a.f58840g : false, (495 & 128) != 0 ? cVarM76372a.f58841h : 0L, (495 & 256) != 0 ? cVarM76372a.f58842i : 0L);
            }
            arrayList.add(cVarM76372a);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            AbstractC17914v.c cVar = (AbstractC17914v.c) obj;
            boolean z11 = cVar.m76375e().ordinal() > AdTaskState.NORMAL.ordinal();
            C18020o c18020o = C18020o.f58998a;
            Context context = memberTaskAdView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            boolean zM76641a = c18020o.m76641a(context, cVar.m76379i());
            C26866a.a.m104898f(C26866a.f81698a, "StageTaskAd", "Stage ----> restoreItem: " + z11 + ", isAppInstalled: " + zM76641a, false, 4, null);
            if (z11 || !zM76641a) {
                arrayList2.add(obj);
            }
        }
        List listB0 = CollectionsKt.m97324B0(C17913u.f58813a.m76338e(), arrayList2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listB0) {
            if (hashSet.add(((AbstractC17914v.c) obj2).m76379i())) {
                arrayList3.add(obj2);
            }
        }
        C17913u.f58813a.m76351t(CollectionsKt.m97333K0(arrayList3, MemberTaskAdHelper.f58727r.m76259b()));
        memberTaskAdView.m76275u();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: r */
    private final void m76272r() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        addView(recyclerView, new ConstraintLayout.C2308b(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new C17892d.a(16, 0, 2, null));
        this.taskAdRecycler = recyclerView;
    }

    /* JADX INFO: renamed from: s */
    private final void m76273s() {
        MemberTaskAdHelper memberTaskAdHelper = this.adHelper;
        if (memberTaskAdHelper != null) {
            boolean z11 = memberTaskAdHelper.m76218v() <= 0;
            boolean z12 = memberTaskAdHelper.m76219w() <= 0;
            boolean z13 = memberTaskAdHelper.m76217u() <= 0;
            boolean z14 = memberTaskAdHelper.m76216t() <= 0;
            if (z11) {
                C17913u c17913u = C17913u.f58813a;
                List listM76338e = c17913u.m76338e();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM76338e) {
                    if (((AbstractC17914v.c) obj).m76375e().ordinal() >= AdTaskState.CLAIMED_STAGE1.ordinal()) {
                        arrayList.add(obj);
                    }
                }
                c17913u.m76351t(arrayList);
            }
            if (z12) {
                C17913u.f58813a.m76351t(CollectionsKt.m97506l());
            }
            for (AbstractC17914v.c cVar : C17913u.f58813a.m76338e()) {
                AdTaskState adTaskStateM76344l = C17913u.f58813a.m76344l(cVar.m76379i());
                if (adTaskStateM76344l != null && cVar.m76375e() != adTaskStateM76344l) {
                    cVar.m76383m(adTaskStateM76344l);
                }
            }
            if (z13) {
                C17913u c17913u2 = C17913u.f58813a;
                List listM76337d = c17913u2.m76337d();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listM76337d) {
                    if (!((AbstractC17914v.a) obj2).m76364k()) {
                        arrayList2.add(obj2);
                    }
                }
                c17913u2.m76350s(arrayList2);
            }
            if (z14) {
                C17913u c17913u3 = C17913u.f58813a;
                List listM76337d2 = c17913u3.m76337d();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listM76337d2) {
                    if (((AbstractC17914v.a) obj3).m76364k()) {
                        arrayList3.add(obj3);
                    }
                }
                c17913u3.m76350s(arrayList3);
            }
            for (AbstractC17914v.a aVar : C17913u.f58813a.m76337d()) {
                AdTaskState adTaskStateM76344l2 = C17913u.f58813a.m76344l(aVar.m76362i());
                if (adTaskStateM76344l2 != null && aVar.m76358e() != adTaskStateM76344l2) {
                    aVar.m76366m(adTaskStateM76344l2);
                }
            }
            C17913u c17913u4 = C17913u.f58813a;
            int size = c17913u4.m76338e().size();
            MemberTaskAdHelper.C17882a c17882a = MemberTaskAdHelper.f58727r;
            boolean z15 = size < c17882a.m76259b();
            boolean z16 = c17913u4.m76337d().size() < c17882a.m76258a();
            if (!z11 && z15) {
                m76270p();
            }
            if ((!z13 || !z14) && z16) {
                m76268n();
            }
            C17892d c17892d = this.taskAdAdapter;
            if (c17892d != null) {
                c17892d.mo36201n1(getFullList());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Unit m76274t(MemberTaskAdView memberTaskAdView) {
        memberTaskAdView.m76273s();
        BiddingVideoManager.Companion.m63266b(BiddingVideoManager.f49576t, "MemberTaskRewardedScene", null, 2, null);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: u */
    private final void m76275u() {
        C17892d c17892d = this.taskAdAdapter;
        if (c17892d != null) {
            c17892d.mo36201n1(getFullList());
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m76276v(AbstractC17914v.a item, int index) {
        if (item.m76358e() == AdTaskState.NORMAL || item.m76358e() == AdTaskState.DOWNLOADING) {
            item.m76366m(AdTaskState.INSTALLED);
            C17913u.f58813a.m76353v(item.m76362i(), item.m76358e());
            C26866a.a.m104898f(C26866a.f81698a, "StageTaskAd", "MemberTaskAdView --> update regular index:" + index + " installed", false, 4, null);
            C17892d c17892d = this.taskAdAdapter;
            if (c17892d != null) {
                c17892d.notifyItemChanged(index);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private final void m76277w(AbstractC17914v.c item, int index) {
        if (item.m76375e() == AdTaskState.NORMAL || item.m76375e() == AdTaskState.DOWNLOADING) {
            item.m76383m(AdTaskState.INSTALLED);
            C17913u.f58813a.m76353v(item.m76379i(), item.m76375e());
            C26866a.a.m104898f(C26866a.f81698a, "StageTaskAd", "MemberTaskAdView --> update stage index:" + index + " installed", false, 4, null);
            C17892d c17892d = this.taskAdAdapter;
            if (c17892d != null) {
                c17892d.notifyItemChanged(index);
            }
        }
    }

    public final void destroy() {
        for (AbstractC17914v.c cVar : C17913u.f58813a.m76338e()) {
            cVar.m76384n(false);
            cVar.m76386p(null);
            cVar.m76382l(null);
            cVar.m76388r(null);
        }
        for (AbstractC17914v.a aVar : C17913u.f58813a.m76337d()) {
            aVar.m76367n(false);
            aVar.m76369p(null);
            aVar.m76365l(null);
            aVar.m76370q(null);
        }
        MemberTaskAdHelper memberTaskAdHelper = this.adHelper;
        if (memberTaskAdHelper != null) {
            memberTaskAdHelper.mo76200d();
        }
        this.adHelper = null;
    }

    public final void onPackageInstall(String packageName) {
        Intrinsics.m97802h(packageName, "packageName");
        m76267m(packageName);
    }

    public final void onPause() {
        MemberTaskAdHelper memberTaskAdHelper = this.adHelper;
        if (memberTaskAdHelper != null) {
            memberTaskAdHelper.m76211o();
        }
    }

    public final void onResume() {
        MemberTaskAdHelper memberTaskAdHelper = this.adHelper;
        if (memberTaskAdHelper != null) {
            memberTaskAdHelper.m76212p();
        }
        m76265k();
        m76266l();
    }

    public final void setClaimListener(BaseStageTaskAdHelper.InterfaceC17880a listener) {
        MemberTaskAdHelper memberTaskAdHelper = this.adHelper;
        if (memberTaskAdHelper != null) {
            memberTaskAdHelper.m76220x(listener);
        }
    }

    public final void setCtxConfig(C4698a config) {
        Intrinsics.m97802h(config, "config");
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        this.adHelper = new MemberTaskAdHelper(context, config.m22755b());
        C17892d c17892d = new C17892d(this.adHelper);
        this.taskAdAdapter = c17892d;
        RecyclerView recyclerView = this.taskAdRecycler;
        if (recyclerView != null) {
            recyclerView.setAdapter(c17892d);
        }
        MemberTaskAdHelper memberTaskAdHelper = this.adHelper;
        if (memberTaskAdHelper != null) {
            memberTaskAdHelper.m76202f(new Function0() { // from class: com.transsion.rewardscenter.task.ad.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MemberTaskAdView.m76274t(this.f58779a);
                }
            });
        }
    }
}
