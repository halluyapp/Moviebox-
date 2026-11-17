package com.transsion.rewardscenter.p309ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.AbstractC2468u;
import androidx.core.text.C2448a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.InterfaceC3165t;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.InterfaceC3233y0;
import aq.C4698a;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.cloud.tmc.integration.event.EventConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$mipmap;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.dialog.BaseMemberLoadingDialog;
import com.transsion.baseui.util.C14569o;
import com.transsion.rewardscenter.R$string;
import com.transsion.rewardscenter.model.RewardsCenterModel;
import com.transsion.rewardscenter.prize.PrizeListView;
import com.transsion.rewardscenter.redeem.RedeemView;
import com.transsion.rewardscenter.utils.AbstractC18021p;
import com.transsion.rewardscenter.utils.AbstractC18022q;
import com.transsion.rewardscenter.utils.AppInstallBroadcastHelper;
import com.transsion.rewardscenter.utils.C18007b;
import com.transsion.rewardscenter.view.PrizeFlowView;
import com.transsion.rewardscenter.view.RewardsCenterTaskView;
import com.transsion.rewardscenterapi.Banner;
import com.transsion.rewardscenterapi.DrawResult;
import com.transsion.rewardscenterapi.Lottery;
import com.transsion.rewardscenterapi.PrizeFlow;
import com.transsion.rewardscenterapi.Redeem;
import com.transsion.rewardscenterapi.Rule;
import com.transsion.rewardscenterapi.SkuPoint;
import com.transsion.rewardscenterapi.Task;
import com.transsion.rewardscenterapi.TopUpType;
import com.transsion.rewardscenterapi.User;
import com.transsion.rewardscenterapi.UserPrize;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p329cq.InterfaceC22763a;
import p393f.C23284j;
import p441gz.InterfaceC23704a;
import p441gz.InterfaceC23705b;
import p462hj.C23860f;
import p550kj.C24655b;
import p986zp.C29215d;
import p986zp.C29219h;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 j2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001kB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b \u0010\u001fJ\u0019\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0005J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0005J\u0017\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0005J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u0005J\u000f\u00103\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\u0005J\u000f\u00104\u001a\u00020\bH\u0016¢\u0006\u0004\b4\u0010\u0005J\r\u00105\u001a\u00020\b¢\u0006\u0004\b5\u0010\u0005J\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010\u0005J\r\u00107\u001a\u00020\b¢\u0006\u0004\b7\u0010\u0005J\u0015\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J!\u0010D\u001a\u00020\b2\u0006\u0010A\u001a\u00020@2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010[R\u001d\u0010a\u001a\u0004\u0018\u00010]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010T\u001a\u0004\b_\u0010`R\u0016\u0010c\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010MR\"\u0010i\u001a\u0010\u0012\f\u0012\n f*\u0004\u0018\u00010e0e0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006l"}, m97100d2 = {"Lcom/transsion/rewardscenter/ui/RewardsCenterFragment;", "Lcom/transsion/rewardscenter/ui/FitStatusBarFragment;", "Lzp/d;", "Lgz/b;", "<init>", "()V", "Lcom/transsion/rewardscenterapi/Lottery;", "lottery", "", "u1", "(Lcom/transsion/rewardscenterapi/Lottery;)V", "Lcom/transsion/rewardscenterapi/User;", "info", "x1", "(Lcom/transsion/rewardscenterapi/User;)V", "", "point", "", "R0", "(I)Ljava/lang/String;", "prizeId", "l1", "(Ljava/lang/String;)V", "s1", "y1", "p1", "v1", "Q0", "n1", "Landroid/view/View;", "n0", "()Landroid/view/View;", "o0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "U0", "(Landroid/view/LayoutInflater;)Lzp/d;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "initViewData", "initViewModel", "initListener", "retryLoadData", "q1", "showLoading", "P0", "Lcom/transsion/rewardscenterapi/DrawResult;", "drawResult", "k1", "(Lcom/transsion/rewardscenterapi/DrawResult;)V", "Lcom/transsnet/loginapi/bean/UserInfo;", "user", "onLogin", "(Lcom/transsnet/loginapi/bean/UserInfo;)V", "Lcom/transsion/rewardscenterapi/TopUpType;", "topUpType", "Lcom/transsion/rewardscenterapi/SkuPoint;", "skuPoint", "z1", "(Lcom/transsion/rewardscenterapi/TopUpType;Lcom/transsion/rewardscenterapi/SkuPoint;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", EventConstants.KEY_SOURCE, "c", "sceneId", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "isFromAdTask", "e", "Lcom/transsion/rewardscenterapi/SkuPoint;", "bannerSkuPoint", "Lcom/transsion/rewardscenter/model/RewardsCenterModel;", "f", "Lkotlin/Lazy;", "T0", "()Lcom/transsion/rewardscenter/model/RewardsCenterModel;", "rewardsCenterModel", "Lcom/transsion/baseui/dialog/BaseMemberLoadingDialog;", "g", "S0", "()Lcom/transsion/baseui/dialog/BaseMemberLoadingDialog;", "loadingDialog", "Lgz/a;", "h", "getLoginApi", "()Lgz/a;", "loginApi", "i", "isFirstResume", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "j", "Landroidx/activity/result/b;", "claimRewardLauncher", CampaignEx.JSON_KEY_AD_K, "a", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RewardsCenterFragment extends FitStatusBarFragment<C29215d> implements InterfaceC23705b {

    /* JADX INFO: renamed from: l */
    public static final int f58923l = 8;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String sceneId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isFromAdTask;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private SkuPoint bannerSkuPoint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy rewardsCenterModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy loadingDialog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy loginApi;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isFirstResume;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AbstractC0249b claimRewardLauncher;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.ui.RewardsCenterFragment$b */
    static final class C17960b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f58933a;

        C17960b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f58933a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f58933a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f58933a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.ui.RewardsCenterFragment$c */
    public static final class C17961c implements RequestListener {
        C17961c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bumptech.glide.request.RequestListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(Drawable resource, Object model, Target target, DataSource dataSource, boolean z11) {
            CardView cardView;
            Intrinsics.m97802h(resource, "resource");
            Intrinsics.m97802h(model, "model");
            Intrinsics.m97802h(dataSource, "dataSource");
            C29215d c29215d = (C29215d) RewardsCenterFragment.this.getMViewBinding();
            if (c29215d != null && (cardView = c29215d.f89134g) != null) {
                ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                } else {
                    layoutParams = null;
                }
                cardView.setLayoutParams(layoutParams);
                AbstractC18022q.m76646c("banner", null, 2, null);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bumptech.glide.request.RequestListener
        public boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z11) {
            CardView cardView;
            Intrinsics.m97802h(target, "target");
            C29215d c29215d = (C29215d) RewardsCenterFragment.this.getMViewBinding();
            if (c29215d != null && (cardView = c29215d.f89134g) != null) {
                AbstractC26006c.m102054g(cardView);
            }
            C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "--> banner image load failed", false, 4, null);
            return false;
        }
    }

    public RewardsCenterFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.rewardscenter.ui.RewardsCenterFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.rewardsCenterModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(RewardsCenterModel.class), new Function0<C3231x0>() { // from class: com.transsion.rewardscenter.ui.RewardsCenterFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.rewardscenter.ui.RewardsCenterFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                Object objInvoke = function0.invoke();
                InterfaceC3208m interfaceC3208m = objInvoke instanceof InterfaceC3208m ? (InterfaceC3208m) objInvoke : null;
                C3227v0.c defaultViewModelProviderFactory = interfaceC3208m != null ? interfaceC3208m.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.loadingDialog = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.ui.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsCenterFragment.m76574m1();
            }
        });
        this.loginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.ui.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsCenterFragment.loginApi_delegate$lambda$1();
            }
        });
        this.isFirstResume = true;
        AbstractC0249b abstractC0249bRegisterForActivityResult = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.rewardscenter.ui.q0
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                RewardsCenterFragment.m76553O0(this.f58965a, (ActivityResult) obj);
            }
        });
        Intrinsics.m97801g(abstractC0249bRegisterForActivityResult, "registerForActivityResult(...)");
        this.claimRewardLauncher = abstractC0249bRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: A1 */
    public static /* synthetic */ void m76539A1(RewardsCenterFragment rewardsCenterFragment, TopUpType topUpType, SkuPoint skuPoint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            skuPoint = null;
        }
        rewardsCenterFragment.m76598z1(topUpType, skuPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public static final void m76553O0(RewardsCenterFragment rewardsCenterFragment, ActivityResult it) {
        C29215d c29215d;
        PrizeListView prizeListView;
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() != -1) {
            rewardsCenterFragment.m76557T0().m76106A(null);
            return;
        }
        String strM76119q = rewardsCenterFragment.m76557T0().m76119q();
        rewardsCenterFragment.m76557T0().m76106A(null);
        if (strM76119q != null && (c29215d = (C29215d) rewardsCenterFragment.getMViewBinding()) != null && (prizeListView = c29215d.f89136i) != null) {
            prizeListView.markClaimed(strM76119q);
        }
        String string = rewardsCenterFragment.getString(R$string.success_claim);
        Intrinsics.m97801g(string, "getString(...)");
        AbstractC18021p.m76643a(true, string);
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m76554Q0() {
        Fragment fragmentM14547k0 = getParentFragmentManager().m14547k0("PhoneBottomSheetFragment");
        PhoneBottomSheetFragment phoneBottomSheetFragment = fragmentM14547k0 instanceof PhoneBottomSheetFragment ? (PhoneBottomSheetFragment) fragmentM14547k0 : null;
        if (phoneBottomSheetFragment == null) {
            return;
        }
        phoneBottomSheetFragment.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: R0 */
    private final String m76555R0(int point) {
        if (point < 1000) {
            return String.valueOf(point);
        }
        if (point < 10000) {
            String str = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(point)}, 1));
            Intrinsics.m97801g(str, "format(...)");
            return str;
        }
        if (point < 1000000) {
            return (point / 1000) + CampaignEx.JSON_KEY_AD_K;
        }
        return (point / 1000000) + "M";
    }

    /* JADX INFO: renamed from: S0 */
    private final BaseMemberLoadingDialog m76556S0() {
        return (BaseMemberLoadingDialog) this.loadingDialog.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    private final RewardsCenterModel m76557T0() {
        return (RewardsCenterModel) this.rewardsCenterModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final Unit m76558V0(RewardsCenterFragment rewardsCenterFragment, View it) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.m97802h(it, "it");
        rewardsCenterFragment.getParentFragmentManager().m14538g1();
        FragmentActivity activity = rewardsCenterFragment.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.m944l();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final Unit m76559W0(RewardsCenterFragment rewardsCenterFragment, View it) {
        Intrinsics.m97802h(it, "it");
        rewardsCenterFragment.m76577p1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m76560X0(RewardsCenterFragment rewardsCenterFragment, View it) {
        Intrinsics.m97802h(it, "it");
        rewardsCenterFragment.m76577p1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m76561Y0(RewardsCenterFragment rewardsCenterFragment, View it) {
        Intrinsics.m97802h(it, "it");
        rewardsCenterFragment.m76575n1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z0 */
    public static final Unit m76562Z0(RewardsCenterFragment rewardsCenterFragment, View it) {
        RewardsCenterTaskView rewardsCenterTaskView;
        Intrinsics.m97802h(it, "it");
        C29215d c29215d = (C29215d) rewardsCenterFragment.getMViewBinding();
        if (c29215d != null && (rewardsCenterTaskView = c29215d.f89141n) != null) {
            rewardsCenterTaskView.scrollToSelf();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m76563a1(RewardsCenterFragment rewardsCenterFragment, View view) {
        User userM76124w = rewardsCenterFragment.m76557T0().m76124w();
        if (userM76124w == null || userM76124w.isLogin()) {
            return;
        }
        rewardsCenterFragment.m76592y1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    public static final Unit m76564b1(RewardsCenterFragment rewardsCenterFragment, Redeem redeem) {
        CardView cardView;
        List<SkuPoint> skuPointList;
        RedeemView redeemView;
        if (redeem != null) {
            C29215d c29215d = (C29215d) rewardsCenterFragment.getMViewBinding();
            if (c29215d != null && (redeemView = c29215d.f89139l) != null) {
                redeemView.setRedeemData(redeem);
            }
            if (redeem.getLotteryPrize() != null || ((skuPointList = redeem.getSkuPointList()) != null && !skuPointList.isEmpty())) {
                C29215d c29215d2 = (C29215d) rewardsCenterFragment.getMViewBinding();
                if (c29215d2 != null && (cardView = c29215d2.f89138k) != null) {
                    AbstractC26006c.m102058k(cardView);
                }
                AbstractC18022q.m76646c("redeem_rewards", null, 2, null);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m76565c1(final RewardsCenterFragment rewardsCenterFragment, Task task) {
        C29215d c29215d;
        RewardsCenterTaskView rewardsCenterTaskView;
        CardView cardView;
        RewardsCenterTaskView rewardsCenterTaskView2;
        if (task != null) {
            C29215d c29215d2 = (C29215d) rewardsCenterFragment.getMViewBinding();
            if (c29215d2 != null && (rewardsCenterTaskView2 = c29215d2.f89141n) != null) {
                rewardsCenterTaskView2.setTaskData(task);
            }
            C29215d c29215d3 = (C29215d) rewardsCenterFragment.getMViewBinding();
            if (c29215d3 != null && (cardView = c29215d3.f89140m) != null) {
                AbstractC26006c.m102058k(cardView);
            }
            AbstractC18022q.m76646c("earn_points", null, 2, null);
            if (rewardsCenterFragment.isFromAdTask && (c29215d = (C29215d) rewardsCenterFragment.getMViewBinding()) != null && (rewardsCenterTaskView = c29215d.f89141n) != null) {
                rewardsCenterTaskView.postDelayed(new Runnable() { // from class: com.transsion.rewardscenter.ui.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RewardsCenterFragment.m76566d1(this.f58950a);
                    }
                }, 500L);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d1 */
    public static final void m76566d1(RewardsCenterFragment rewardsCenterFragment) {
        RewardsCenterTaskView rewardsCenterTaskView;
        C29215d c29215d = (C29215d) rewardsCenterFragment.getMViewBinding();
        if (c29215d == null || (rewardsCenterTaskView = c29215d.f89141n) == null) {
            return;
        }
        rewardsCenterTaskView.scrollToSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    public static final Unit m76567e1(RewardsCenterFragment rewardsCenterFragment, Rule rule) {
        ArrayList arrayList;
        String strS0;
        AppCompatTextView appCompatTextView;
        if (rule != null) {
            List<String> terms = rule.getTerms();
            if (terms != null) {
                arrayList = new ArrayList();
                for (Object obj : terms) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.size() != 0) {
                List<String> terms2 = rule.getTerms();
                if (terms2 == null || (strS0 = CollectionsKt.m97369s0(terms2, "\n", null, null, 0, null, null, 62, null)) == null) {
                    strS0 = "";
                }
                C29215d c29215d = (C29215d) rewardsCenterFragment.getMViewBinding();
                if (c29215d != null && (appCompatTextView = c29215d.f89145r) != null) {
                    appCompatTextView.setText(strS0);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final Unit m76568f1(RewardsCenterFragment rewardsCenterFragment, Boolean bool) {
        if (bool.booleanValue()) {
            rewardsCenterFragment.showLoading();
        } else {
            rewardsCenterFragment.m76594P0();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final Unit m76569g1(RewardsCenterFragment rewardsCenterFragment, Pair pair) {
        String string;
        if (pair == null) {
            return Unit.f75682a;
        }
        rewardsCenterFragment.m76557T0().m76115m().mo14855n(null);
        if (Intrinsics.m97797c((String) pair.getFirst(), "400")) {
            string = (String) pair.getSecond();
            if (string == null) {
                string = rewardsCenterFragment.getString(R$string.claim_failed);
                Intrinsics.m97801g(string, "getString(...)");
            }
        } else {
            string = rewardsCenterFragment.getString(R$string.claim_failed);
            Intrinsics.m97801g(string, "getString(...)");
        }
        AbstractC18021p.m76643a(false, string);
        return Unit.f75682a;
    }

    private final InterfaceC23704a getLoginApi() {
        return (InterfaceC23704a) this.loginApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h1 */
    public static final Unit m76570h1(RewardsCenterFragment rewardsCenterFragment, Pair pair) {
        PrizeListView prizeListView;
        PrizeListView prizeListView2;
        if (pair == null) {
            return Unit.f75682a;
        }
        String str = (String) pair.component1();
        boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
        rewardsCenterFragment.m76557T0().m76116n().mo14855n(null);
        if (zBooleanValue) {
            C29215d c29215d = (C29215d) rewardsCenterFragment.getMViewBinding();
            if (c29215d != null && (prizeListView2 = c29215d.f89136i) != null) {
                prizeListView2.markClaimed(str);
            }
            String string = rewardsCenterFragment.getString(R$string.success_claim);
            Intrinsics.m97801g(string, "getString(...)");
            AbstractC18021p.m76643a(true, string);
        } else {
            C29215d c29215d2 = (C29215d) rewardsCenterFragment.getMViewBinding();
            if (c29215d2 != null && (prizeListView = c29215d2.f89136i) != null) {
                prizeListView.markTopUp(str);
            }
        }
        InterfaceC22763a interfaceC22763a = (InterfaceC22763a) TheRouter.m61774d(InterfaceC22763a.class, new Object[0]);
        if (interfaceC22763a != null) {
            interfaceC22763a.mo76084b();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final Unit m76571i1(RewardsCenterFragment rewardsCenterFragment, Lottery lottery) {
        rewardsCenterFragment.m76584u1(lottery);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final Unit m76572j1(RewardsCenterFragment rewardsCenterFragment, User user) {
        if (user != null) {
            rewardsCenterFragment.m76590x1(user);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: l1 */
    private final void m76573l1(String prizeId) {
        Intent intentM61861l = TheRouter.m61773c("/rewards/claim_reward").m61861l(requireContext());
        intentM61861l.putExtra("prize_id", prizeId);
        this.claimRewardLauncher.m999a(intentM61861l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a loginApi_delegate$lambda$1() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final BaseMemberLoadingDialog m76574m1() {
        return new BaseMemberLoadingDialog();
    }

    /* JADX INFO: renamed from: n1 */
    private final void m76575n1() {
        User userM76124w = m76557T0().m76124w();
        if (userM76124w != null) {
            if (userM76124w.isLogin()) {
                m76598z1(TopUpType.BANNER, this.bannerSkuPoint);
            } else {
                m76592y1();
            }
            HashMap map = new HashMap();
            map.put("is_login", userM76124w.isLogin() ? "1" : "0");
            AbstractC18022q.m76644a("banner", map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o1 */
    public static final Unit m76576o1(RewardsCenterFragment rewardsCenterFragment, String it) {
        RewardsCenterTaskView rewardsCenterTaskView;
        Intrinsics.m97802h(it, "it");
        C29215d c29215d = (C29215d) rewardsCenterFragment.getMViewBinding();
        if (c29215d != null && (rewardsCenterTaskView = c29215d.f89141n) != null) {
            rewardsCenterTaskView.onPackageInstall(it);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: p1 */
    private final void m76577p1() {
        Navigator.m61845x(TheRouter.m61773c("/member/point_history"), requireContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final Unit m76578r1(RewardsCenterFragment rewardsCenterFragment) {
        rewardsCenterFragment.m76594P0();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: s1 */
    private final void m76580s1() {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.m14497G1("treasure_wheel_result_dismissed", getViewLifecycleOwner(), new InterfaceC3165t() { // from class: com.transsion.rewardscenter.ui.f0
            @Override // androidx.fragment.app.InterfaceC3165t
            /* JADX INFO: renamed from: a */
            public final void mo14589a(String str, Bundle bundle) {
                RewardsCenterFragment.m76582t1(this.f58946a, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final void m76582t1(RewardsCenterFragment rewardsCenterFragment, String str, Bundle bundle) {
        Intrinsics.m97802h(str, "<unused var>");
        Intrinsics.m97802h(bundle, "<unused var>");
        C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "--> TreasureWheelStateDialog dismissed", false, 4, null);
        RewardsCenterModel.m76103j(rewardsCenterFragment.m76557T0(), null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u1 */
    private final void m76584u1(Lottery lottery) {
        ConstraintLayout constraintLayout;
        List<DrawResult> prizeItems;
        PrizeListView prizeListView;
        String imageUrl;
        AppCompatImageView appCompatImageView;
        CardView cardView;
        PrizeFlowView prizeFlowView;
        PrizeFlowView prizeFlowView2;
        if (lottery != null) {
            List<PrizeFlow> prizeFlows = lottery.getPrizeFlows();
            if (prizeFlows != null && !prizeFlows.isEmpty()) {
                C29215d c29215d = (C29215d) getMViewBinding();
                if (c29215d != null && (prizeFlowView2 = c29215d.f89133f) != null) {
                    prizeFlowView2.setPrizeFlows(prizeFlows);
                }
                C29215d c29215d2 = (C29215d) getMViewBinding();
                if (c29215d2 != null && (prizeFlowView = c29215d2.f89133f) != null) {
                    AbstractC26006c.m102058k(prizeFlowView);
                }
            }
            Banner banner = lottery.getBanner();
            if (banner != null && (imageUrl = banner.getImageUrl()) != null && !StringsKt.m98160q0(imageUrl) && banner.getEnable()) {
                this.bannerSkuPoint = banner.getSku();
                C29215d c29215d3 = (C29215d) getMViewBinding();
                if (c29215d3 != null && (cardView = c29215d3.f89134g) != null) {
                    AbstractC26006c.m102058k(cardView);
                    ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                    layoutParams.height = 0;
                    cardView.setLayoutParams(layoutParams);
                }
                C29215d c29215d4 = (C29215d) getMViewBinding();
                if (c29215d4 != null && (appCompatImageView = c29215d4.f89130c) != null) {
                    Glide.with(this).load2(banner.getImageUrl()).listener(new C17961c()).into(appCompatImageView);
                }
            }
            UserPrize userPrize = lottery.getUserPrize();
            if (userPrize != null) {
                C29215d c29215d5 = (C29215d) getMViewBinding();
                if (c29215d5 != null && (prizeListView = c29215d5.f89136i) != null) {
                    prizeListView.setData(userPrize);
                }
                if (userPrize.getDrawChance() == null && ((prizeItems = userPrize.getPrizeItems()) == null || prizeItems.isEmpty())) {
                    return;
                }
                C29215d c29215d6 = (C29215d) getMViewBinding();
                if (c29215d6 != null && (constraintLayout = c29215d6.f89137j) != null) {
                    AbstractC26006c.m102058k(constraintLayout);
                }
                AbstractC18022q.m76646c("prize_list", null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    private final void m76586v1() {
        getParentFragmentManager().m14497G1("phone_bottom_sheet_result", getViewLifecycleOwner(), new InterfaceC3165t() { // from class: com.transsion.rewardscenter.ui.i0
            @Override // androidx.fragment.app.InterfaceC3165t
            /* JADX INFO: renamed from: a */
            public final void mo14589a(String str, Bundle bundle) {
                RewardsCenterFragment.m76588w1(this.f58952a, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public static final void m76588w1(RewardsCenterFragment rewardsCenterFragment, String str, Bundle bundle) {
        Intrinsics.m97802h(str, "<unused var>");
        Intrinsics.m97802h(bundle, "bundle");
        rewardsCenterFragment.m76554Q0();
        TopUpType topUpType = TopUpType.BANNER;
        int i11 = bundle.getInt(EventConstants.KEY_SOURCE, topUpType.getValue());
        String string = bundle.getString("number");
        if (string == null) {
            string = "";
        }
        String string2 = bundle.getString("cc");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = bundle.getString("iso");
        String str2 = string3 != null ? string3 : "";
        C18007b.f58982a.m76632g(string2, str2, string);
        if (i11 != topUpType.getValue() && i11 != TopUpType.REDEEM.getValue()) {
            if (i11 == TopUpType.PHONE_CREDIT.getValue()) {
                rewardsCenterFragment.m76557T0().m76107B(string2, string, str2);
            }
        } else {
            RewardsCenterModel rewardsCenterModelM76557T0 = rewardsCenterFragment.m76557T0();
            FragmentActivity activity = rewardsCenterFragment.getActivity();
            Intrinsics.m97800f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            rewardsCenterModelM76557T0.m76126y((AppCompatActivity) activity, string, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private final void m76590x1(User info) {
        String nickname;
        C29215d c29215d;
        C29219h c29219h;
        ShapeableImageView shapeableImageView;
        C29219h c29219h2;
        AppCompatTextView appCompatTextView;
        C29219h c29219h3;
        AppCompatTextView appCompatTextView2;
        C29215d c29215d2 = (C29215d) getMViewBinding();
        if (c29215d2 != null && (c29219h3 = c29215d2.f89132e) != null && (appCompatTextView2 = c29219h3.f89175g) != null) {
            appCompatTextView2.setText(m76555R0(info.getPoint()));
        }
        if (info.isLogin()) {
            nickname = info.getNickname();
            if (nickname == null) {
                nickname = "";
            }
        } else {
            nickname = "Log in";
        }
        String strM12009m = C2448a.m11999c().m12009m(nickname, AbstractC2468u.f8605a);
        C29215d c29215d3 = (C29215d) getMViewBinding();
        if (c29215d3 != null && (c29219h2 = c29215d3.f89132e) != null && (appCompatTextView = c29219h2.f89174f) != null) {
            appCompatTextView.setText(strM12009m);
        }
        String avatar = info.getAvatar();
        if (avatar == null || (c29215d = (C29215d) getMViewBinding()) == null || (c29219h = c29215d.f89132e) == null || (shapeableImageView = c29219h.f89171c) == null) {
            return;
        }
        C23860f.a aVar = C23860f.f72909a;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        aVar.m94457m(contextRequireContext).m94468g(avatar).m94470i(R$mipmap.profile_default_avatar).m94465d(shapeableImageView);
    }

    /* JADX INFO: renamed from: y1 */
    private final void m76592y1() {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            InterfaceC23704a loginApi = getLoginApi();
            if (loginApi != null) {
                loginApi.mo90391m(this);
            }
            InterfaceC23704a loginApi2 = getLoginApi();
            if (loginApi2 != null) {
                loginApi2.mo90392n(this);
            }
            InterfaceC23704a loginApi3 = getLoginApi();
            if (loginApi3 != null) {
                Context contextRequireContext = requireContext();
                Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
                loginApi3.mo90387i(contextRequireContext);
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m76594P0() {
        try {
            Result.Companion companion = Result.INSTANCE;
            m76556S0().dismissAllowingStateLoss();
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C29215d getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C29215d c29215dM112087c = C29215d.m112087c(inflater);
        Intrinsics.m97801g(c29215dM112087c, "inflate(...)");
        return c29215dM112087c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        C29219h c29219h;
        C29219h c29219h2;
        C29219h c29219h3;
        AppCompatTextView appCompatTextView;
        AppCompatImageView appCompatImageView;
        C29219h c29219h4;
        AppCompatTextView appCompatTextView2;
        C29219h c29219h5;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        C29215d c29215d = (C29215d) getMViewBinding();
        if (c29215d != null && (appCompatImageView3 = c29215d.f89129b) != null) {
            AbstractC26006c.m102050c(appCompatImageView3, 0L, new Function1() { // from class: com.transsion.rewardscenter.ui.g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsCenterFragment.m76558V0(this.f58948a, (View) obj);
                }
            }, 1, null);
        }
        C29215d c29215d2 = (C29215d) getMViewBinding();
        if (c29215d2 != null && (c29219h5 = c29215d2.f89132e) != null && (appCompatImageView2 = c29219h5.f89170b) != null) {
            AbstractC26006c.m102050c(appCompatImageView2, 0L, new Function1() { // from class: com.transsion.rewardscenter.ui.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsCenterFragment.m76559W0(this.f58954a, (View) obj);
                }
            }, 1, null);
        }
        C29215d c29215d3 = (C29215d) getMViewBinding();
        if (c29215d3 != null && (c29219h4 = c29215d3.f89132e) != null && (appCompatTextView2 = c29219h4.f89175g) != null) {
            AbstractC26006c.m102050c(appCompatTextView2, 0L, new Function1() { // from class: com.transsion.rewardscenter.ui.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsCenterFragment.m76560X0(this.f58955a, (View) obj);
                }
            }, 1, null);
        }
        C29215d c29215d4 = (C29215d) getMViewBinding();
        if (c29215d4 != null && (appCompatImageView = c29215d4.f89130c) != null) {
            AbstractC26006c.m102050c(appCompatImageView, 0L, new Function1() { // from class: com.transsion.rewardscenter.ui.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsCenterFragment.m76561Y0(this.f58957a, (View) obj);
                }
            }, 1, null);
        }
        C29215d c29215d5 = (C29215d) getMViewBinding();
        if (c29215d5 != null && (c29219h3 = c29215d5.f89132e) != null && (appCompatTextView = c29219h3.f89173e) != null) {
            AbstractC26006c.m102050c(appCompatTextView, 0L, new Function1() { // from class: com.transsion.rewardscenter.ui.m0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsCenterFragment.m76562Z0(this.f58959a, (View) obj);
                }
            }, 1, null);
        }
        C14569o c14569o = C14569o.f51128a;
        C29215d c29215d6 = (C29215d) getMViewBinding();
        ShapeableImageView shapeableImageView = null;
        AppCompatTextView appCompatTextView3 = (c29215d6 == null || (c29219h2 = c29215d6.f89132e) == null) ? null : c29219h2.f89174f;
        C29215d c29215d7 = (C29215d) getMViewBinding();
        if (c29215d7 != null && (c29219h = c29215d7.f89132e) != null) {
            shapeableImageView = c29219h.f89171c;
        }
        c14569o.m65703a(new View[]{appCompatTextView3, shapeableImageView}, new View.OnClickListener() { // from class: com.transsion.rewardscenter.ui.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RewardsCenterFragment.m76563a1(this.f58961a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.rewardscenter.p309ui.FitStatusBarFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        PrizeListView prizeListView;
        RewardsCenterTaskView rewardsCenterTaskView;
        RedeemView redeemView;
        super.initViewData();
        InterfaceC3224u viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.m97801g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        RewardsCenterModel rewardsCenterModelM76557T0 = m76557T0();
        WeakReference weakReference = new WeakReference(this);
        InterfaceC3224u viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.m97801g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C4698a c4698a = new C4698a(viewLifecycleOwner, rewardsCenterModelM76557T0, weakReference, AbstractC3226v.m14968a(viewLifecycleOwner2));
        C29215d c29215d = (C29215d) getMViewBinding();
        if (c29215d != null && (redeemView = c29215d.f89139l) != null) {
            redeemView.setCtxConfig(c4698a);
        }
        C29215d c29215d2 = (C29215d) getMViewBinding();
        if (c29215d2 != null && (rewardsCenterTaskView = c29215d2.f89141n) != null) {
            rewardsCenterTaskView.setCtxConfig(c4698a);
        }
        C29215d c29215d3 = (C29215d) getMViewBinding();
        if (c29215d3 == null || (prizeListView = c29215d3.f89136i) == null) {
            return;
        }
        prizeListView.setCtxConfig(c4698a);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m76557T0().m76118p().m14851j(getViewLifecycleOwner(), new C17960b(new Function1() { // from class: com.transsion.rewardscenter.ui.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsCenterFragment.m76571i1(this.f58972a, (Lottery) obj);
            }
        }));
        m76557T0().m76125x().m14851j(getViewLifecycleOwner(), new C17960b(new Function1() { // from class: com.transsion.rewardscenter.ui.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsCenterFragment.m76572j1(this.f58973a, (User) obj);
            }
        }));
        m76557T0().m76120r().m14851j(getViewLifecycleOwner(), new C17960b(new Function1() { // from class: com.transsion.rewardscenter.ui.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsCenterFragment.m76564b1(this.f58974a, (Redeem) obj);
            }
        }));
        m76557T0().m76123v().m14851j(getViewLifecycleOwner(), new C17960b(new Function1() { // from class: com.transsion.rewardscenter.ui.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsCenterFragment.m76565c1(this.f58936a, (Task) obj);
            }
        }));
        m76557T0().m76121t().m14851j(getViewLifecycleOwner(), new C17960b(new Function1() { // from class: com.transsion.rewardscenter.ui.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsCenterFragment.m76567e1(this.f58938a, (Rule) obj);
            }
        }));
        m76557T0().m76117o().m14851j(getViewLifecycleOwner(), new C17960b(new Function1() { // from class: com.transsion.rewardscenter.ui.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsCenterFragment.m76568f1(this.f58940a, (Boolean) obj);
            }
        }));
        m76557T0().m76115m().m14851j(getViewLifecycleOwner(), new C17960b(new Function1() { // from class: com.transsion.rewardscenter.ui.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsCenterFragment.m76569g1(this.f58942a, (Pair) obj);
            }
        }));
        m76557T0().m76116n().m14851j(getViewLifecycleOwner(), new C17960b(new Function1() { // from class: com.transsion.rewardscenter.ui.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsCenterFragment.m76570h1(this.f58944a, (Pair) obj);
            }
        }));
        m76586v1();
        m76580s1();
    }

    /* JADX INFO: renamed from: k1 */
    public final void m76596k1(DrawResult drawResult) {
        Intrinsics.m97802h(drawResult, "drawResult");
        User userM76124w = m76557T0().m76124w();
        if (userM76124w == null || !userM76124w.isLogin()) {
            m76592y1();
            return;
        }
        String drawResultId = drawResult.getDrawResultId();
        if (drawResultId == null) {
            String string = getString(com.p282tn.lib.widget.R$string.common_failed);
            Intrinsics.m97801g(string, "getString(...)");
            AbstractC18021p.m76643a(false, string);
            return;
        }
        m76557T0().m76106A(drawResultId);
        String prizeType = drawResult.getPrizeType();
        if (prizeType != null) {
            int iHashCode = prizeType.hashCode();
            if (iHashCode == -277650678) {
                if (prizeType.equals("PHONE_CREDIT")) {
                    m76539A1(this, TopUpType.PHONE_CREDIT, null, 2, null);
                }
            } else if (iHashCode == -206450473) {
                if (prizeType.equals("PHYSICAL")) {
                    m76573l1(drawResultId);
                }
            } else if (iHashCode == 84989 && prizeType.equals("VIP")) {
                m76557T0().m76110f(drawResultId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.rewardscenter.p309ui.FitStatusBarFragment
    /* JADX INFO: renamed from: n0 */
    protected View mo76503n0() {
        C29215d c29215d = (C29215d) getMViewBinding();
        if (c29215d != null) {
            return c29215d.f89144q;
        }
        return null;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        UserInfo userInfoMo90386h;
        String userId = null;
        C24655b c24655b = new C24655b("rewards_center", false, 2, null);
        c24655b.m96844g().put("user_status", "me");
        HashMap mapM96844g = c24655b.m96844g();
        InterfaceC23704a loginApi = getLoginApi();
        if (loginApi != null && (userInfoMo90386h = loginApi.mo90386h()) != null) {
            userId = userInfoMo90386h.getUserId();
        }
        mapM96844g.put("user_id", String.valueOf(userId));
        return c24655b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.rewardscenter.p309ui.FitStatusBarFragment
    /* JADX INFO: renamed from: o0 */
    protected View mo76504o0() {
        C29215d c29215d = (C29215d) getMViewBinding();
        if (c29215d != null) {
            return c29215d.f89142o;
        }
        return null;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.source = arguments.getString(EventConstants.KEY_SOURCE);
            this.sceneId = arguments.getString("scene_id");
            this.isFromAdTask = arguments.getBoolean("is_from_ad_task", false);
            C24655b logViewConfig = getLogViewConfig();
            if (logViewConfig != null && (mapM96844g2 = logViewConfig.m96844g()) != null) {
            }
            C24655b logViewConfig2 = getLogViewConfig();
            if (logViewConfig2 != null && (mapM96844g = logViewConfig2.m96844g()) != null) {
            }
        }
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null) {
            logViewConfig3.m96848k(true);
        }
        AppInstallBroadcastHelper appInstallBroadcastHelper = AppInstallBroadcastHelper.f58975a;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        appInstallBroadcastHelper.m76600a(contextRequireContext, new Function1() { // from class: com.transsion.rewardscenter.ui.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsCenterFragment.m76576o1(this.f58970a, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        Unit unit;
        RewardsCenterTaskView rewardsCenterTaskView;
        PrizeFlowView prizeFlowView;
        super.onDestroy();
        AppInstallBroadcastHelper appInstallBroadcastHelper = AppInstallBroadcastHelper.f58975a;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        appInstallBroadcastHelper.m76601b(contextRequireContext);
        C29215d c29215d = (C29215d) getMViewBinding();
        if (c29215d != null && (prizeFlowView = c29215d.f89133f) != null) {
            prizeFlowView.destroy();
        }
        C29215d c29215d2 = (C29215d) getMViewBinding();
        if (c29215d2 != null && (rewardsCenterTaskView = c29215d2.f89141n) != null) {
            rewardsCenterTaskView.destroy();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            InterfaceC23704a loginApi = getLoginApi();
            if (loginApi != null) {
                loginApi.mo90391m(this);
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogin(UserInfo user) {
        Intrinsics.m97802h(user, "user");
        InterfaceC23705b.a.m93655a(this, user);
        RewardsCenterModel.m76103j(m76557T0(), null, 1, null);
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogout() {
        InterfaceC23705b.a.m93656b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        RewardsCenterTaskView rewardsCenterTaskView;
        super.onPause();
        C29215d c29215d = (C29215d) getMViewBinding();
        if (c29215d == null || (rewardsCenterTaskView = c29215d.f89141n) == null) {
            return;
        }
        rewardsCenterTaskView.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        RewardsCenterTaskView rewardsCenterTaskView;
        super.onResume();
        if (this.isFirstResume) {
            this.isFirstResume = false;
            m76597q1();
        }
        C29215d c29215d = (C29215d) getMViewBinding();
        if (c29215d == null || (rewardsCenterTaskView = c29215d.f89141n) == null) {
            return;
        }
        rewardsCenterTaskView.onResume();
    }

    @Override // p441gz.InterfaceC23705b
    public void onUpdateUserInfo(UserInfo userInfo) {
        InterfaceC23705b.a.m93657c(this, userInfo);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m76597q1() {
        showLoading();
        m76557T0().m76112i(new Function0() { // from class: com.transsion.rewardscenter.ui.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsCenterFragment.m76578r1(this.f58971a);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    public final void showLoading() {
        m76556S0().m65437l0(this, "LoadingDialog");
    }

    /* JADX INFO: renamed from: z1 */
    public final void m76598z1(TopUpType topUpType, SkuPoint skuPoint) {
        Intrinsics.m97802h(topUpType, "topUpType");
        if (getParentFragmentManager().m14547k0("PhoneBottomSheetFragment") != null) {
            return;
        }
        PhoneBottomSheetFragment.INSTANCE.m76536a(topUpType, skuPoint).show(getParentFragmentManager(), "PhoneBottomSheetFragment");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EventConstants.KEY_SOURCE, String.valueOf(topUpType.getValue()));
        AbstractC18022q.m76645b("payment", linkedHashMap);
    }
}
