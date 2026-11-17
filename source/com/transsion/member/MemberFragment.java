package com.transsion.member;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
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
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import androidx.core.text.AbstractC2468u;
import androidx.core.text.C2448a;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bn.C4860i;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.tmc.integration.event.EventConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.report.InterfaceC14488g;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.dialog.BaseMemberLoadingDialog;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.widget.GradientBorderView;
import com.transsion.member.adapter.C15779a;
import com.transsion.member.adapter.C15783e;
import com.transsion.member.adapter.C15785g;
import com.transsion.member.adapter.C15786h;
import com.transsion.member.bean.RedeemResult;
import com.transsion.member.dialog.MemberPromoCodeDialog;
import com.transsion.member.widget.PointView;
import com.transsion.memberapi.MemberDetail;
import com.transsion.memberapi.MemberInfo;
import com.transsion.memberapi.MemberSource;
import com.transsion.memberapi.MemberTaskItem;
import com.transsion.memberapi.MemberTaskItemCheckInInfo;
import com.transsion.memberapi.MemberTaskItemInvite;
import com.transsion.memberapi.MemberTaskRewardInfo;
import com.transsion.memberapi.MemberTaskSubmitCheckInRes;
import com.transsion.memberapi.MembershipDetailType;
import com.transsion.memberapi.PointInfo;
import com.transsion.memberapi.SkuCategory;
import com.transsion.memberapi.SkuData;
import com.transsion.memberapi.SkuItem;
import com.transsion.payment.lib.C16386f;
import com.transsion.payment.lib.InterfaceC16364b;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p352dn.C23001e;
import p352dn.InterfaceC22998b;
import p393f.C23284j;
import p441gz.InterfaceC23704a;
import p441gz.InterfaceC23705b;
import p462hj.C23860f;
import p550kj.C24655b;
import p550kj.C24662i;
import p743rh.C27287m;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 £\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001hB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0007J\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0 H\u0002¢\u0006\u0004\b\"\u0010#J!\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\u0007J\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\u0007J\u000f\u0010+\u001a\u00020\u0013H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\u0007J#\u00100\u001a\u00020\b2\u0006\u0010.\u001a\u00020$2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\b2\u0006\u0010/\u001a\u00020$H\u0002¢\u0006\u0004\b2\u00103J+\u00107\u001a\u00020\b2\u0006\u0010/\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u0002042\u0006\u0010=\u001a\u0002042\u0006\u0010>\u001a\u000209H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u00022\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020$H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\bH\u0016¢\u0006\u0004\bG\u0010\u0007J\u000f\u0010H\u001a\u00020\bH\u0016¢\u0006\u0004\bH\u0010\u0007J\u0011\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0013H\u0016¢\u0006\u0004\bL\u0010,J\u000f\u0010M\u001a\u00020\bH\u0016¢\u0006\u0004\bM\u0010\u0007J\u0019\u0010P\u001a\u00020\b2\b\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\bH\u0016¢\u0006\u0004\bR\u0010\u0007J\u000f\u0010S\u001a\u00020\bH\u0016¢\u0006\u0004\bS\u0010\u0007J\u0017\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u0010\u0016J\r\u0010V\u001a\u00020\b¢\u0006\u0004\bV\u0010\u0007J\r\u0010W\u001a\u00020\b¢\u0006\u0004\bW\u0010\u0007J\u0017\u0010Y\u001a\u00020\b2\u0006\u0010X\u001a\u00020\nH\u0016¢\u0006\u0004\bY\u0010\rJ\u000f\u0010Z\u001a\u00020\bH\u0016¢\u0006\u0004\bZ\u0010\u0007J\u0017\u0010[\u001a\u00020\b2\u0006\u0010X\u001a\u00020\nH\u0016¢\u0006\u0004\b[\u0010\rJ\u0015\u0010]\u001a\u00020\b2\u0006\u0010\\\u001a\u000204¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\bH\u0016¢\u0006\u0004\b_\u0010\u0007J\u000f\u0010`\u001a\u00020\bH\u0016¢\u0006\u0004\b`\u0010\u0007J\u0019\u0010c\u001a\u00020\b2\b\u0010b\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\bH\u0016¢\u0006\u0004\be\u0010\u0007J\u000f\u0010f\u001a\u00020\bH\u0016¢\u0006\u0004\bf\u0010\u0007R$\u0010n\u001a\u0004\u0018\u00010g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010s\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010F\"\u0004\br\u00103R\u0018\u0010v\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u001b\u0010~\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\"\u0010\u0083\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0080\u0001\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\"\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0090\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0091\u0001\u0010{\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u0099\u0001\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010{\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009b\u0001R\u0019\u0010 \u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009b\u0001R\u0019\u0010¢\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u009b\u0001¨\u0006¤\u0001"}, m97100d2 = {"Lcom/transsion/member/MemberFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lbn/i;", "Landroid/view/View$OnClickListener;", "Lgz/b;", "Lcom/transsion/baselib/report/g;", "<init>", "()V", "", "h1", "Lcom/transsnet/loginapi/bean/UserInfo;", "userInfo", "w1", "(Lcom/transsnet/loginapi/bean/UserInfo;)V", "Lcom/transsion/memberapi/SkuItem;", "skuItem", "g1", "(Lcom/transsion/memberapi/SkuItem;)V", "I0", "", "isAutoRenew", "f1", "(Z)V", "Lcom/transsion/memberapi/MemberDetail;", "memberDetail", "n1", "(Lcom/transsion/memberapi/MemberDetail;)V", "i1", "Lcom/transsion/memberapi/SkuData;", "data", "p1", "(Lcom/transsion/memberapi/SkuData;)V", "", "redeemList", "j1", "(Ljava/util/List;)V", "", "productId", "isSubscription", "u1", "(Ljava/lang/String;Z)V", "P0", "L0", "d1", "()Z", "H0", "optType", "skuId", "k1", "(Ljava/lang/String;Ljava/lang/String;)V", "m1", "(Ljava/lang/String;)V", "", "code", "message", "l1", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "", "alpha", "v1", "(F)V", TtmlNode.ATTR_TTS_COLOR, "fraction", "G0", "(IF)I", "Landroid/view/LayoutInflater;", "inflater", "O0", "(Landroid/view/LayoutInflater;)Lbn/i;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "loadDefaultData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "isShowPageStateLayoutTitle", "initViewModel", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "onResume", "hidden", "onHiddenChanged", "showLoading", "K0", "user", "onLogin", "onLogout", "onUpdateUserInfo", "points", "t1", "(I)V", "initListener", "retryLoadData", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "logResume", "onDestroy", "Lcom/transsion/memberapi/MemberSource;", "a", "Lcom/transsion/memberapi/MemberSource;", "getSource", "()Lcom/transsion/memberapi/MemberSource;", "s1", "(Lcom/transsion/memberapi/MemberSource;)V", EventConstants.KEY_SOURCE, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "getSceneId", "o1", "sceneId", "c", "Lcom/transsnet/loginapi/bean/UserInfo;", "mUserInfo", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/memberapi/MemberDetail;", "Lcom/transsion/baseui/dialog/BaseMemberLoadingDialog;", "e", "Lkotlin/Lazy;", "M0", "()Lcom/transsion/baseui/dialog/BaseMemberLoadingDialog;", "mLoadingDialog", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "f", "Landroidx/activity/result/b;", "loginLaunch", "Lcom/transsion/member/adapter/h;", "g", "Lcom/transsion/member/adapter/h;", "taskAdapter", "Lcom/transsion/member/adapter/g;", "h", "Lcom/transsion/member/adapter/g;", "skuListAdapter", "Lcom/transsion/member/adapter/e;", "i", "Lcom/transsion/member/adapter/e;", "redeemListAdapter", "Lgz/a;", "j", "getMLoginApi", "()Lgz/a;", "mLoginApi", "Lcom/transsion/member/MemberViewModel;", CampaignEx.JSON_KEY_AD_K, "N0", "()Lcom/transsion/member/MemberViewModel;", "memberViewModel", "l", "Z", "isFirstResume", "m", "shouldRefreshPurchasedInfo", "n", "isPremium", "o", "isSelf", TtmlNode.TAG_P, "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MemberFragment extends PageStatusFragment<C4860i> implements View.OnClickListener, InterfaceC23705b, InterfaceC14488g {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q */
    public static final int f54131q = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private MemberSource source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private UserInfo mUserInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private MemberDetail memberDetail;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private AbstractC0249b loginLaunch;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C15786h taskAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private C15785g skuListAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C15783e redeemListAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Lazy memberViewModel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isFirstResume;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean shouldRefreshPurchasedInfo;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isPremium;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isSelf;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String sceneId = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy mLoadingDialog = LazyKt.m97097b(new Function0() { // from class: com.transsion.member.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MemberFragment.m69783e1();
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Lazy mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.member.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MemberFragment.mLoginApi_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.transsion.member.MemberFragment$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final MemberFragment m69821a(MemberSource memberSource, String str) {
            MemberFragment memberFragment = new MemberFragment();
            memberFragment.m69819s1(memberSource);
            memberFragment.m69818o1(str);
            return memberFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberFragment$b */
    /* JADX INFO: loaded from: classes5.dex */
    public /* synthetic */ class C15751b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54147a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f54148b;

        static {
            int[] iArr = new int[MembershipDetailType.values().length];
            try {
                iArr[MembershipDetailType.TRIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MembershipDetailType.SUBSCRIPTION_MEMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MembershipDetailType.FINANCIAL_MEMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MembershipDetailType.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f54147a = iArr;
            int[] iArr2 = new int[MemberSource.values().length];
            try {
                iArr2[MemberSource.SOURCE_LANDSCAPE_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MemberSource.SOURCE_HDDL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MemberSource.SOURCE_AD_DIALOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MemberSource.SOURCE_DOWNLOAD_DIALOG.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MemberSource.SOURCE_OTHER_DOWNLOAD_DIALOG.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MemberSource.SOURCE_MULTI_DL.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f54148b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberFragment$c */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15752c implements Function0 {
        C15752c() {
        }

        /* JADX INFO: renamed from: a */
        public void m69822a() {
            MemberFragment.this.m69786h1();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m69822a();
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberFragment$d */
    /* JADX INFO: loaded from: classes5.dex */
    static final class C15753d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54150a;

        C15753d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54150a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54150a;
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
            this.f54150a.invoke(obj);
        }
    }

    public MemberFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.member.MemberFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.memberViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MemberViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.member.MemberFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.member.MemberFragment$special$$inlined$viewModels$default$3
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
        this.isFirstResume = true;
    }

    /* JADX INFO: renamed from: G0 */
    private final int m69761G0(int color, float fraction) {
        return Color.argb((int) (Color.alpha(color) * fraction), Color.red(color), Color.green(color), Color.blue(color));
    }

    /* JADX INFO: renamed from: H0 */
    private final void m69762H0() {
        ImmersionBar.with(this).statusBarDarkFont(false).init();
    }

    /* JADX INFO: renamed from: I0 */
    private final void m69763I0() {
        Intent intent;
        Intent intent2;
        RecyclerView recyclerView;
        FragmentActivity activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null || !intent.getBooleanExtra("extra_member_scroll_bottom", false)) {
            return;
        }
        C4860i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f17242t) != null) {
            recyclerView.postDelayed(new Runnable() { // from class: com.transsion.member.d
                @Override // java.lang.Runnable
                public final void run() {
                    MemberFragment.m69764J0(this.f54244a);
                }
            }, 500L);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 == null || (intent2 = activity2.getIntent()) == null) {
            return;
        }
        intent2.removeExtra("extra_member_scroll_bottom");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m69764J0(MemberFragment memberFragment) {
        NestedScrollView nestedScrollView;
        C4860i mViewBinding = memberFragment.getMViewBinding();
        if (mViewBinding == null || (nestedScrollView = mViewBinding.f17243u) == null) {
            return;
        }
        nestedScrollView.fullScroll(130);
    }

    /* JADX INFO: renamed from: L0 */
    private final void m69765L0() {
        ConstraintLayout constraintLayout;
        C4860i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (constraintLayout = mViewBinding.f17245w) != null) {
            AbstractC26006c.m102052e(constraintLayout);
        }
        FragmentActivity activity = getActivity();
        MemberActivity memberActivity = activity instanceof MemberActivity ? (MemberActivity) activity : null;
        if (memberActivity != null) {
            memberActivity.m65397t0();
        }
    }

    /* JADX INFO: renamed from: M0 */
    private final BaseMemberLoadingDialog m69766M0() {
        return (BaseMemberLoadingDialog) this.mLoadingDialog.getValue();
    }

    /* JADX INFO: renamed from: N0 */
    private final MemberViewModel m69767N0() {
        return (MemberViewModel) this.memberViewModel.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX INFO: renamed from: P0 */
    private final void m69768P0() {
        String string;
        String string2;
        if (this.isPremium) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(R$string.member_successfully_renewed);
            } else {
                string = null;
            }
        } else {
            Context context2 = getContext();
            if (context2 != null) {
                string = context2.getString(R$string.member_successfully_upgraded_to_premium);
            } else {
                string = null;
            }
        }
        MemberSource memberSource = this.source;
        switch (memberSource == null ? -1 : C15751b.f54148b[memberSource.ordinal()]) {
            case 1:
                Context context3 = getContext();
                if (context3 == null) {
                    string2 = null;
                } else {
                    string2 = context3.getString(R$string.member_back_to_watch);
                }
                break;
            case 2:
                Context context4 = getContext();
                if (context4 == null) {
                    string2 = null;
                } else {
                    string2 = context4.getString(R$string.member_back);
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                Context context5 = getContext();
                if (context5 == null) {
                    string2 = null;
                } else {
                    string2 = context5.getString(R$string.member_back_to_download);
                }
                break;
            default:
                if (!(getActivity() instanceof MemberActivity)) {
                    Context context6 = getContext();
                    if (context6 == null) {
                        string2 = null;
                    } else {
                        string2 = context6.getString(R$string.member_explore_now);
                    }
                } else {
                    Context context7 = getContext();
                    if (context7 == null) {
                        string2 = null;
                    } else {
                        string2 = context7.getString(R$string.member_back);
                    }
                }
                break;
        }
        C26866a.a.m104899g(C26866a.f81698a, "The source is " + this.source + ", title: " + string + ", buttonTitle: " + string2, false, 2, null);
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new MemberFragment$handlePurchaseSucceed$1(this, string, string2, null), 3, null);
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            InterfaceC22998b.a.m91585a(interfaceC22998b, null, 1, null);
        }
        ObserveLoginAction.f54204c.m69946a().m69943i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final void m69769Q0(MemberFragment memberFragment, View view) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        FragmentActivity activity = memberFragment.getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.m944l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final void m69770R0(MemberFragment memberFragment, View view) {
        Navigator.m61845x(TheRouter.m61773c("/member/point_history"), memberFragment.requireContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final void m69771S0(MemberFragment memberFragment, View view) {
        Navigator.m61845x(TheRouter.m61773c("/member/point_history"), memberFragment.requireContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final Unit m69772T0(View it) {
        Intrinsics.m97802h(it, "it");
        Navigator.m61845x(TheRouter.m61773c("/rewards/center").m61857K(EventConstants.KEY_SOURCE, "memberdetail"), null, null, 3, null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m69773U0(ActivityResult it) {
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() == -1) {
            C26866a.a.m104898f(C26866a.f81698a, "loginStatus", "登录成功", false, 4, null);
        } else {
            C26866a.a.m104898f(C26866a.f81698a, "loginStatus", "登录失败或者取消", false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m69774V0(MemberFragment memberFragment, View view) {
        MemberPromoCodeDialog memberPromoCodeDialogM70033a = MemberPromoCodeDialog.INSTANCE.m70033a(memberFragment.new C15752c());
        FragmentManager childFragmentManager = memberFragment.getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        memberPromoCodeDialogM70033a.show(childFragmentManager, "MemberPromoCodeDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final void m69775W0(C4860i c4860i, MemberFragment memberFragment, View view, int i11, int i12, int i13, int i14) {
        memberFragment.m69810v1(Math.abs(i12 * 1.0f) / (c4860i.f17245w.getMeasuredHeight() < 1 ? AbstractC5776a0.m27313a(48.0f) : c4860i.f17245w.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m69776X0(MemberFragment memberFragment, SkuData skuData) {
        if (skuData != null) {
            memberFragment.m69800p1(skuData);
        }
        memberFragment.m69816K0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m69777Y0(MemberFragment memberFragment, RedeemResult redeemResult) {
        String string;
        String str;
        if (redeemResult != null) {
            int vipDurationDays = redeemResult.getVipDurationDays();
            if (vipDurationDays == 1) {
                Context context = memberFragment.getContext();
                if (context != null) {
                    string = context.getString(R$string.member_claimed_succeed_1_day);
                    str = string;
                } else {
                    str = null;
                }
            } else {
                Context context2 = memberFragment.getContext();
                if (context2 != null) {
                    string = context2.getString(R$string.member_claimed_succeed_days, Integer.valueOf(vipDurationDays));
                    str = string;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                C28951b.f88586a.m111457g(R$layout.claim_succeed_layout, str, (24 & 4) != 0 ? 0 : 80, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? 0 : AbstractC5776a0.m27313a(66.0f));
            }
            memberFragment.m69786h1();
            InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
            if (interfaceC22998b != null) {
                InterfaceC22998b.a.m91585a(interfaceC22998b, null, 1, null);
            }
        } else {
            C13806h.f49015a.m62324k(com.p282tn.lib.widget.R$string.failed_toast);
        }
        memberFragment.m69816K0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final Unit m69778Z0(MemberFragment memberFragment, List list) {
        C15786h c15786h = memberFragment.taskAdapter;
        if (c15786h != null) {
            c15786h.mo36201n1(list);
        }
        memberFragment.m69763I0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final Unit m69779a1(MemberFragment memberFragment, C23001e c23001e) {
        List<Object> data;
        Object obj;
        Object next;
        List<MemberTaskItemInvite> inviteList;
        memberFragment.m69786h1();
        C15786h c15786h = memberFragment.taskAdapter;
        if (c15786h != null && (data = c15786h.getData()) != null) {
            Iterator<T> it = data.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer taskSubType = ((MemberTaskItem) next).getTaskSubType();
                if (taskSubType != null && taskSubType.intValue() == 2) {
                    break;
                }
            }
            MemberTaskItem memberTaskItem = (MemberTaskItem) next;
            if (memberTaskItem != null) {
                int iM91590a = c23001e.m91590a();
                String strM91593d = c23001e.m91593d();
                MemberTaskRewardInfo memberTaskRewardInfoM91591b = c23001e.m91591b();
                if (memberTaskRewardInfoM91591b != null) {
                    if (Intrinsics.m97797c(strM91593d, "0")) {
                        List<MemberTaskItemInvite> inviteList2 = memberTaskItem.getInviteList();
                        if (inviteList2 != null) {
                            for (MemberTaskItemInvite memberTaskItemInvite : inviteList2) {
                                if (memberTaskItemInvite.getStatus() == 1) {
                                    memberTaskItemInvite.setStatus(2);
                                }
                            }
                        }
                    } else if (iM91590a >= 0 && (inviteList = memberTaskItem.getInviteList()) != null) {
                        for (Object obj2 : inviteList) {
                            if (Intrinsics.m97797c(strM91593d, ((MemberTaskItemInvite) obj2).getRewardId())) {
                                obj = obj2;
                                break;
                            }
                        }
                        MemberTaskItemInvite memberTaskItemInvite2 = (MemberTaskItemInvite) obj;
                        if (memberTaskItemInvite2 != null) {
                            memberTaskItemInvite2.setStatus(2);
                        }
                    }
                    memberTaskItem.setRewardInfo(memberTaskRewardInfoM91591b);
                }
                C15786h c15786h2 = memberFragment.taskAdapter;
                if (c15786h2 != null) {
                    c15786h2.notifyDataSetChanged();
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final Unit m69780b1(MemberFragment memberFragment, Pair pair) {
        List<Object> data;
        Object next;
        List<MemberTaskItemCheckInInfo> checkInList;
        MemberTaskItemCheckInInfo memberTaskItemCheckInInfo;
        memberFragment.m69786h1();
        C15786h c15786h = memberFragment.taskAdapter;
        if (c15786h != null && (data = c15786h.getData()) != null) {
            Iterator<T> it = data.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer taskSubType = ((MemberTaskItem) next).getTaskSubType();
                if (taskSubType != null && taskSubType.intValue() == 8) {
                    break;
                }
            }
            MemberTaskItem memberTaskItem = (MemberTaskItem) next;
            if (memberTaskItem != null) {
                int iIntValue = ((Number) pair.getFirst()).intValue();
                if (((MemberTaskSubmitCheckInRes) pair.getSecond()) != null && (checkInList = memberTaskItem.getCheckInList()) != null && (memberTaskItemCheckInInfo = checkInList.get(iIntValue)) != null) {
                    memberTaskItemCheckInInfo.setHasCheckIn(true);
                }
                C15786h c15786h2 = memberFragment.taskAdapter;
                if (c15786h2 != null) {
                    c15786h2.notifyDataSetChanged();
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m69781c1(MemberFragment memberFragment, MemberDetail memberDetail) {
        if (memberDetail != null) {
            memberFragment.memberDetail = memberDetail;
            C24655b logViewConfig = memberFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            memberFragment.m69797n1(memberDetail);
            memberFragment.m69812w1(memberDetail.getUserInfo());
        }
        if (memberDetail == null) {
            if (C27287m.f83003a.m106330e()) {
                C13806h.f49015a.m62324k(com.p282tn.lib.widget.R$string.failed_toast);
            } else {
                C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
            }
        }
        memberFragment.m69816K0();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: d1, reason: from getter */
    private final boolean getIsSelf() {
        return this.isSelf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final BaseMemberLoadingDialog m69783e1() {
        return new BaseMemberLoadingDialog();
    }

    /* JADX INFO: renamed from: f1 */
    private final void m69784f1(boolean isAutoRenew) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        int id2 = 0;
        if (isAutoRenew) {
            C4860i mViewBinding = getMViewBinding();
            if (mViewBinding == null || (appCompatTextView3 = mViewBinding.f17235m) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = appCompatTextView3.getLayoutParams();
            Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            c2308b.f7990t = -1;
            C4860i mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (appCompatTextView4 = mViewBinding2.f17238p) != null) {
                id2 = appCompatTextView4.getId();
            }
            c2308b.f7988s = id2;
            c2308b.setMarginStart(AbstractC5776a0.m27313a(2.0f));
            ((ViewGroup.MarginLayoutParams) c2308b).topMargin = AbstractC5776a0.m27313a(18.5f);
            appCompatTextView3.setLayoutParams(c2308b);
            return;
        }
        C4860i mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (appCompatTextView = mViewBinding3.f17235m) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = appCompatTextView.getLayoutParams();
        Intrinsics.m97800f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
        c2308b2.f7988s = -1;
        C4860i mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (appCompatTextView2 = mViewBinding4.f17238p) != null) {
            id2 = appCompatTextView2.getId();
        }
        c2308b2.f7990t = id2;
        c2308b2.setMarginStart(AbstractC5776a0.m27313a(0.0f));
        ((ViewGroup.MarginLayoutParams) c2308b2).topMargin = AbstractC5776a0.m27313a(44.0f);
        appCompatTextView.setLayoutParams(c2308b2);
    }

    /* JADX INFO: renamed from: g1 */
    private final void m69785g1(SkuItem skuItem) {
        showLoading();
        m69767N0().m69907J(skuItem);
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public final void m69786h1() {
        m69767N0().m69912q();
        m69767N0().m69914s();
        C15786h c15786h = this.taskAdapter;
        if (c15786h != null) {
            c15786h.notifyDataSetChanged();
        }
        m69763I0();
    }

    /* JADX INFO: renamed from: i1 */
    private final void m69787i1() {
        if (this.shouldRefreshPurchasedInfo) {
            m69768P0();
            this.shouldRefreshPurchasedInfo = false;
        }
    }

    /* JADX INFO: renamed from: j1 */
    private final void m69789j1(List redeemList) {
        C4860i mViewBinding;
        RecyclerView recyclerView;
        PointInfo pointInfo;
        RecyclerView recyclerView2;
        C4860i mViewBinding2 = getMViewBinding();
        RecyclerView.Adapter adapter = null;
        if ((mViewBinding2 != null ? mViewBinding2.f17239q : null) != null) {
            C4860i mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (recyclerView2 = mViewBinding3.f17239q) != null) {
                adapter = recyclerView2.getAdapter();
            }
            if (adapter == null || (mViewBinding = getMViewBinding()) == null || (recyclerView = mViewBinding.f17239q) == null) {
                return;
            }
            MemberDetail memberDetail = this.memberDetail;
            int point = (memberDetail == null || (pointInfo = memberDetail.getPointInfo()) == null) ? 0 : pointInfo.getPoint();
            Iterator it = redeemList.iterator();
            while (it.hasNext()) {
                ((SkuItem) it.next()).setUserPoints(Integer.valueOf(point));
            }
            if (recyclerView.getAdapter() != null) {
                RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                Intrinsics.m97800f(adapter2, "null cannot be cast to non-null type com.transsion.member.adapter.RedeemInfoAdapter");
                ((C15783e) adapter2).mo36210q1(CollectionsKt.m97343U0(redeemList));
            }
        }
    }

    /* JADX INFO: renamed from: k1 */
    private final void m69791k1(String optType, String skuId) {
        String strM96843f;
        HashMap map = new HashMap();
        map.put("opt_type", optType);
        if (skuId != null) {
            map.put("skuId", skuId);
        }
        C24662i c24662i = C24662i.f75350a;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (strM96843f = logViewConfig.m96843f()) == null) {
            strM96843f = "";
        }
        c24662i.m96881p(strM96843f, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public final void m69793l1(String skuId, Integer code, String message) {
        String strM96843f;
        HashMap map = new HashMap();
        map.put("opt_type", "pay_result");
        map.put("sku_id", skuId);
        map.put("fail_code", String.valueOf(code));
        String str = "";
        if (message == null) {
            message = "";
        }
        map.put("fail_message", message);
        map.put("result_type", "result_fail");
        C24662i c24662i = C24662i.f75350a;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (strM96843f = logViewConfig.m96843f()) != null) {
            str = strM96843f;
        }
        c24662i.m96884s(str, "purchase", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public final void m69795m1(String skuId) {
        String strM96843f;
        HashMap map = new HashMap();
        map.put("opt_type", "pay_result");
        map.put("sku_id", skuId);
        map.put("result_type", "result_success");
        C24662i c24662i = C24662i.f75350a;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (strM96843f = logViewConfig.m96843f()) == null) {
            strM96843f = "";
        }
        c24662i.m96884s(strM96843f, "purchase", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a mLoginApi_delegate$lambda$1() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:163:0x020d  */
    /* JADX INFO: renamed from: n1 */
    private final void m69797n1(MemberDetail memberDetail) {
        AppCompatTextView appCompatTextView;
        MemberInfo memberInfo;
        Integer daysLeft;
        MemberInfo memberInfo2;
        Integer daysLeft2;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        GradientBorderView gradientBorderView;
        AppCompatImageView appCompatImageView;
        GradientBorderView gradientBorderView2;
        boolean z11;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        AppCompatTextView appCompatTextView7;
        MemberInfo memberInfo3;
        Integer daysLeft3;
        MemberInfo memberInfo4;
        Integer daysLeft4;
        AppCompatTextView appCompatTextView8;
        AppCompatTextView appCompatTextView9;
        String string;
        AppCompatTextView appCompatTextView10;
        MemberInfo memberInfo5;
        String nextRenewDate;
        AppCompatTextView appCompatTextView11;
        GradientBorderView gradientBorderView3;
        AppCompatImageView appCompatImageView2;
        GradientBorderView gradientBorderView4;
        AppCompatTextView appCompatTextView12;
        MemberInfo memberInfo6;
        Integer daysLeft5;
        MemberInfo memberInfo7;
        Integer daysLeft6;
        AppCompatTextView appCompatTextView13;
        AppCompatTextView appCompatTextView14;
        AppCompatTextView appCompatTextView15;
        GradientBorderView gradientBorderView5;
        AppCompatImageView appCompatImageView3;
        GradientBorderView gradientBorderView6;
        AppCompatTextView appCompatTextView16;
        GradientBorderView gradientBorderView7;
        AppCompatImageView appCompatImageView4;
        GradientBorderView gradientBorderView8;
        AppCompatTextView appCompatTextView17;
        GradientBorderView gradientBorderView9;
        AppCompatImageView appCompatImageView5;
        GradientBorderView gradientBorderView10;
        PointInfo pointInfo;
        String string2 = null;
        C26866a.a.m104899g(C26866a.f81698a, "member detail is " + memberDetail, false, 2, null);
        int point = (memberDetail == null || (pointInfo = memberDetail.getPointInfo()) == null) ? 0 : pointInfo.getPoint();
        int i11 = C15751b.f54147a[(memberDetail != null ? MembershipDetailType.INSTANCE.m70139a(memberDetail.getMemberInfo()) : MembershipDetailType.GUEST).ordinal()];
        if (i11 == 1) {
            C4860i mViewBinding = getMViewBinding();
            if (mViewBinding != null && (gradientBorderView2 = mViewBinding.f17234l) != null) {
                AbstractC26006c.m102058k(gradientBorderView2);
            }
            C4860i mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (appCompatImageView = mViewBinding2.f17236n) != null) {
                AbstractC26006c.m102058k(appCompatImageView);
            }
            C4860i mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (gradientBorderView = mViewBinding3.f17227e) != null) {
                AbstractC26006c.m102054g(gradientBorderView);
            }
            C4860i mViewBinding4 = getMViewBinding();
            if (mViewBinding4 != null && (appCompatTextView4 = mViewBinding4.f17238p) != null) {
                Context context = getContext();
                appCompatTextView4.setText(context != null ? context.getString(R$string.member_free_trial) : null);
            }
            C4860i mViewBinding5 = getMViewBinding();
            if (mViewBinding5 != null && (appCompatTextView3 = mViewBinding5.f17231i) != null) {
                AbstractC26006c.m102054g(appCompatTextView3);
            }
            C4860i mViewBinding6 = getMViewBinding();
            if (mViewBinding6 != null && (appCompatTextView2 = mViewBinding6.f17226d) != null) {
                Context context2 = getContext();
                appCompatTextView2.setText(context2 != null ? context2.getString(R$string.member_extend_your_premium_benefits) : null);
            }
            C4860i mViewBinding7 = getMViewBinding();
            if (mViewBinding7 != null && (appCompatTextView = mViewBinding7.f17235m) != null) {
                Context context3 = getContext();
                if (context3 != null) {
                    string2 = context3.getString(((memberDetail == null || (memberInfo2 = memberDetail.getMemberInfo()) == null || (daysLeft2 = memberInfo2.getDaysLeft()) == null) ? 0 : daysLeft2.intValue()) > 1 ? R$string.member_days_left : R$string.member_day_left, Integer.valueOf((memberDetail == null || (memberInfo = memberDetail.getMemberInfo()) == null || (daysLeft = memberInfo.getDaysLeft()) == null) ? 0 : daysLeft.intValue()));
                }
                appCompatTextView.setText(string2);
            }
            m69784f1(false);
        } else if (i11 == 2) {
            C4860i mViewBinding8 = getMViewBinding();
            if (mViewBinding8 != null && (gradientBorderView4 = mViewBinding8.f17234l) != null) {
                AbstractC26006c.m102058k(gradientBorderView4);
            }
            C4860i mViewBinding9 = getMViewBinding();
            if (mViewBinding9 != null && (appCompatImageView2 = mViewBinding9.f17236n) != null) {
                AbstractC26006c.m102058k(appCompatImageView2);
            }
            C4860i mViewBinding10 = getMViewBinding();
            if (mViewBinding10 != null && (gradientBorderView3 = mViewBinding10.f17227e) != null) {
                AbstractC26006c.m102054g(gradientBorderView3);
            }
            C4860i mViewBinding11 = getMViewBinding();
            if (mViewBinding11 != null && (appCompatTextView11 = mViewBinding11.f17238p) != null) {
                Context context4 = getContext();
                appCompatTextView11.setText(context4 != null ? context4.getString(R$string.member_premium_title) : null);
            }
            if (memberDetail == null || (memberInfo5 = memberDetail.getMemberInfo()) == null || (nextRenewDate = memberInfo5.getNextRenewDate()) == null) {
                z11 = false;
            } else {
                if (nextRenewDate.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                C4860i mViewBinding12 = getMViewBinding();
                if (mViewBinding12 != null && (appCompatTextView10 = mViewBinding12.f17231i) != null) {
                    AbstractC26006c.m102058k(appCompatTextView10);
                }
                C4860i mViewBinding13 = getMViewBinding();
                if (mViewBinding13 != null && (appCompatTextView9 = mViewBinding13.f17231i) != null) {
                    Context context5 = getContext();
                    if (context5 != null) {
                        int i12 = R$string.member_next_billing_date;
                        MemberInfo memberInfo8 = memberDetail.getMemberInfo();
                        string = context5.getString(i12, memberInfo8 != null ? memberInfo8.getNextRenewDate() : null);
                    } else {
                        string = null;
                    }
                    appCompatTextView9.setText(string);
                }
            } else {
                C4860i mViewBinding14 = getMViewBinding();
                if (mViewBinding14 != null && (appCompatTextView5 = mViewBinding14.f17231i) != null) {
                    AbstractC26006c.m102054g(appCompatTextView5);
                }
            }
            C4860i mViewBinding15 = getMViewBinding();
            if (mViewBinding15 != null && (appCompatTextView8 = mViewBinding15.f17226d) != null) {
                Context context6 = getContext();
                appCompatTextView8.setText(context6 != null ? context6.getString(R$string.member_extend_your_premium_benefits) : null);
            }
            C4860i mViewBinding16 = getMViewBinding();
            if (mViewBinding16 != null && (appCompatTextView7 = mViewBinding16.f17235m) != null) {
                Context context7 = getContext();
                if (context7 != null) {
                    string2 = context7.getString(((memberDetail == null || (memberInfo4 = memberDetail.getMemberInfo()) == null || (daysLeft4 = memberInfo4.getDaysLeft()) == null) ? 0 : daysLeft4.intValue()) > 1 ? R$string.member_days_left : R$string.member_day_left, Integer.valueOf((memberDetail == null || (memberInfo3 = memberDetail.getMemberInfo()) == null || (daysLeft3 = memberInfo3.getDaysLeft()) == null) ? 0 : daysLeft3.intValue()));
                }
                appCompatTextView7.setText(string2);
            }
            C4860i mViewBinding17 = getMViewBinding();
            if (mViewBinding17 != null && (appCompatTextView6 = mViewBinding17.f17235m) != null) {
                appCompatTextView6.setCompoundDrawablesWithIntrinsicBounds(com.transsion.baseui.R$mipmap.ic_premium, 0, 0, 0);
            }
            m69784f1(true);
        } else if (i11 == 3) {
            C4860i mViewBinding18 = getMViewBinding();
            if (mViewBinding18 != null && (gradientBorderView6 = mViewBinding18.f17234l) != null) {
                AbstractC26006c.m102058k(gradientBorderView6);
            }
            C4860i mViewBinding19 = getMViewBinding();
            if (mViewBinding19 != null && (appCompatImageView3 = mViewBinding19.f17236n) != null) {
                AbstractC26006c.m102058k(appCompatImageView3);
            }
            C4860i mViewBinding20 = getMViewBinding();
            if (mViewBinding20 != null && (gradientBorderView5 = mViewBinding20.f17227e) != null) {
                AbstractC26006c.m102054g(gradientBorderView5);
            }
            C4860i mViewBinding21 = getMViewBinding();
            if (mViewBinding21 != null && (appCompatTextView15 = mViewBinding21.f17238p) != null) {
                Context context8 = getContext();
                appCompatTextView15.setText(context8 != null ? context8.getString(R$string.member_premium_title) : null);
            }
            C4860i mViewBinding22 = getMViewBinding();
            if (mViewBinding22 != null && (appCompatTextView14 = mViewBinding22.f17231i) != null) {
                AbstractC26006c.m102054g(appCompatTextView14);
            }
            C4860i mViewBinding23 = getMViewBinding();
            if (mViewBinding23 != null && (appCompatTextView13 = mViewBinding23.f17226d) != null) {
                Context context9 = getContext();
                appCompatTextView13.setText(context9 != null ? context9.getString(R$string.member_extend_your_premium_benefits) : null);
            }
            C4860i mViewBinding24 = getMViewBinding();
            if (mViewBinding24 != null && (appCompatTextView12 = mViewBinding24.f17235m) != null) {
                Context context10 = getContext();
                if (context10 != null) {
                    string2 = context10.getString(((memberDetail == null || (memberInfo7 = memberDetail.getMemberInfo()) == null || (daysLeft6 = memberInfo7.getDaysLeft()) == null) ? 0 : daysLeft6.intValue()) > 1 ? R$string.member_days_left : R$string.member_day_left, Integer.valueOf((memberDetail == null || (memberInfo6 = memberDetail.getMemberInfo()) == null || (daysLeft5 = memberInfo6.getDaysLeft()) == null) ? 0 : daysLeft5.intValue()));
                }
                appCompatTextView12.setText(string2);
            }
            m69784f1(false);
        } else if (i11 != 4) {
            C4860i mViewBinding25 = getMViewBinding();
            if (mViewBinding25 != null && (gradientBorderView10 = mViewBinding25.f17234l) != null) {
                AbstractC26006c.m102054g(gradientBorderView10);
            }
            C4860i mViewBinding26 = getMViewBinding();
            if (mViewBinding26 != null && (appCompatImageView5 = mViewBinding26.f17236n) != null) {
                AbstractC26006c.m102054g(appCompatImageView5);
            }
            C4860i mViewBinding27 = getMViewBinding();
            if (mViewBinding27 != null && (gradientBorderView9 = mViewBinding27.f17227e) != null) {
                AbstractC26006c.m102058k(gradientBorderView9);
            }
            C4860i mViewBinding28 = getMViewBinding();
            if (mViewBinding28 != null && (appCompatTextView17 = mViewBinding28.f17226d) != null) {
                Context context11 = getContext();
                appCompatTextView17.setText(context11 != null ? context11.getString(R$string.member_your_premium_benefits) : null);
            }
        } else {
            C4860i mViewBinding29 = getMViewBinding();
            if (mViewBinding29 != null && (gradientBorderView8 = mViewBinding29.f17234l) != null) {
                AbstractC26006c.m102054g(gradientBorderView8);
            }
            C4860i mViewBinding30 = getMViewBinding();
            if (mViewBinding30 != null && (appCompatImageView4 = mViewBinding30.f17236n) != null) {
                AbstractC26006c.m102054g(appCompatImageView4);
            }
            C4860i mViewBinding31 = getMViewBinding();
            if (mViewBinding31 != null && (gradientBorderView7 = mViewBinding31.f17227e) != null) {
                AbstractC26006c.m102058k(gradientBorderView7);
            }
            C4860i mViewBinding32 = getMViewBinding();
            if (mViewBinding32 != null && (appCompatTextView16 = mViewBinding32.f17226d) != null) {
                Context context12 = getContext();
                appCompatTextView16.setText(context12 != null ? context12.getString(R$string.member_your_premium_benefits) : null);
            }
        }
        m69820t1(point);
        m69787i1();
    }

    /* JADX INFO: renamed from: p1 */
    private final void m69800p1(SkuData data) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        PointInfo pointInfo;
        List<SkuItem> skuList = data.getSkuList();
        List listK0 = skuList != null ? CollectionsKt.m97333K0(skuList, 3) : null;
        if (listK0 == null) {
            listK0 = CollectionsKt.m97506l();
        }
        List<SkuItem> skuPointList = data.getSkuPointList();
        List listK1 = skuPointList != null ? CollectionsKt.m97333K0(skuPointList, 3) : null;
        if (listK1 == null) {
            listK1 = CollectionsKt.m97506l();
        }
        List<SkuItem> list = listK0;
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
        for (SkuItem skuItem : list) {
            skuItem.setMemberDetail(this.memberDetail);
            arrayList.add(skuItem);
        }
        MemberDetail memberDetail = this.memberDetail;
        int point = (memberDetail == null || (pointInfo = memberDetail.getPointInfo()) == null) ? 0 : pointInfo.getPoint();
        List<SkuItem> list2 = listK1;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m97516v(list2, 10));
        for (SkuItem skuItem2 : list2) {
            skuItem2.setUserPoints(Integer.valueOf(point));
            arrayList2.add(skuItem2);
        }
        C15785g c15785g = this.skuListAdapter;
        if (Intrinsics.m97797c(c15785g != null ? c15785g.getData() : null, CollectionsKt.m97343U0(arrayList))) {
            C15783e c15783e = this.redeemListAdapter;
            if (Intrinsics.m97797c(c15783e != null ? c15783e.getData() : null, CollectionsKt.m97343U0(arrayList2))) {
                return;
            }
        }
        C15785g c15785g2 = new C15785g(CollectionsKt.m97343U0(arrayList));
        c15785g2.m36193l(R$id.item_root);
        c15785g2.m69963F1(new Function2() { // from class: com.transsion.member.k
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MemberFragment.m69802q1(this.f54348a, (SkuItem) obj, (View) obj2);
            }
        });
        this.skuListAdapter = c15785g2;
        C4860i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView2 = mViewBinding.f17240r) != null) {
            recyclerView2.setLayoutManager(new NpaGridLayoutManager(recyclerView2.getContext(), 3));
            if (recyclerView2.getItemDecorationCount() <= 0) {
                recyclerView2.addItemDecoration(new C15779a(3, AbstractC5776a0.m27313a(8.0f)));
            }
            recyclerView2.setAdapter(this.skuListAdapter);
        }
        C15783e c15783e2 = new C15783e(CollectionsKt.m97343U0(arrayList2));
        c15783e2.m36193l(R$id.item_root);
        c15783e2.m69957F1(new Function2() { // from class: com.transsion.member.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MemberFragment.m69804r1(this.f54349a, (SkuItem) obj, (View) obj2);
            }
        });
        this.redeemListAdapter = c15783e2;
        C4860i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (recyclerView = mViewBinding2.f17239q) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaGridLayoutManager(recyclerView.getContext(), 3));
        if (recyclerView.getItemDecorationCount() <= 0) {
            recyclerView.addItemDecoration(new C15779a(3, AbstractC5776a0.m27313a(8.0f)));
        }
        recyclerView.setAdapter(this.redeemListAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final Unit m69802q1(MemberFragment memberFragment, SkuItem item, View view) {
        String str;
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return Unit.f75682a;
        }
        C26866a.a.m104899g(C26866a.f81698a, "The productId and coins: " + item.getSkuId() + ", " + item.getCoin(), false, 2, null);
        String category = item.getCategory();
        SkuCategory skuCategory = SkuCategory.AUTO_RENEW;
        if (Intrinsics.m97797c(category, skuCategory.getValue())) {
            str = item.getDuration() + "_subscription";
        } else {
            str = item.getDuration() + "_purchased";
        }
        memberFragment.m69791k1(str, item.getSkuId());
        InterfaceC23704a mLoginApi = memberFragment.getMLoginApi();
        if (mLoginApi != null && mLoginApi.mo90379a()) {
            memberFragment.m69808u1(item.getSkuId(), Intrinsics.m97797c(item.getCategory(), skuCategory.getValue()));
            return Unit.f75682a;
        }
        InterfaceC23704a mLoginApi2 = memberFragment.getMLoginApi();
        if (mLoginApi2 != null) {
            mLoginApi2.mo90392n(memberFragment);
        }
        InterfaceC23704a mLoginApi3 = memberFragment.getMLoginApi();
        if (mLoginApi3 != null) {
            Context contextRequireContext = memberFragment.requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            mLoginApi3.mo90387i(contextRequireContext);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final Unit m69804r1(MemberFragment memberFragment, SkuItem item, View view) {
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return Unit.f75682a;
        }
        C26866a.a.m104899g(C26866a.f81698a, "The productId and coins: " + item.getSkuId() + ", " + item.getCoin(), false, 2, null);
        String duration = item.getDuration();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(duration);
        sb2.append("_reward");
        memberFragment.m69791k1(sb2.toString(), item.getSkuId());
        memberFragment.m69785g1(item);
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX INFO: renamed from: u1 */
    private final void m69808u1(final String productId, boolean isSubscription) {
        boolean z11;
        MemberInfo memberInfo;
        MemberInfo memberInfo2;
        MemberDetail memberDetail = this.memberDetail;
        if ((memberDetail == null || (memberInfo2 = memberDetail.getMemberInfo()) == null) ? false : memberInfo2.isActive()) {
            MemberDetail memberDetail2 = this.memberDetail;
            z11 = memberDetail2 != null && (memberInfo = memberDetail2.getMemberInfo()) != null && memberInfo.getMemberType() == 2;
        }
        this.isPremium = z11;
        C26866a.a.m104899g(C26866a.f81698a, "before pay isPremium: " + z11, false, 2, null);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        FragmentActivity activity = getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            C16386f.f55336b.m71513a().m71511e(appCompatActivity, productId, null, isSubscription, null, new InterfaceC16364b() { // from class: com.transsion.member.MemberFragment$startPay$1$1
                @Override // com.transsion.payment.lib.InterfaceC16364b
                /* JADX INFO: renamed from: a */
                public void mo66214a(Integer num, String str, boolean z12, String str2) {
                    C26866a.a.m104902m(C26866a.f81698a, "Payment failed " + str + ", " + num, false, 2, null);
                    if (num != null && num.intValue() == -30) {
                        Ref.BooleanRef booleanRef2 = booleanRef;
                        if (booleanRef2.element) {
                            return;
                        }
                        booleanRef2.element = true;
                        C13806h c13806h = C13806h.f49015a;
                        Context context = this.f54152a.getContext();
                        c13806h.m62325l(context != null ? context.getString(R$string.member_pay_pending) : null);
                        return;
                    }
                    if (num != null && num.intValue() == 1003) {
                        this.f54152a.m69793l1(productId, num, str);
                        C13806h c13806h2 = C13806h.f49015a;
                        Context context2 = this.f54152a.getContext();
                        c13806h2.m62325l(context2 != null ? context2.getString(R$string.member_pay_processing) : null);
                        if (this.f54152a.getContext() != null) {
                            this.f54152a.m69816K0();
                            return;
                        }
                        return;
                    }
                    this.f54152a.m69793l1(productId, num, str);
                    C13806h c13806h3 = C13806h.f49015a;
                    Context context3 = this.f54152a.getContext();
                    c13806h3.m62325l(context3 != null ? context3.getString(R$string.member_pay_failed) : null);
                    if (this.f54152a.getContext() != null) {
                        this.f54152a.m69816K0();
                    }
                }

                @Override // com.transsion.payment.lib.InterfaceC16364b
                /* JADX INFO: renamed from: b */
                public void mo66215b(boolean z12) {
                    if (z12) {
                        this.f54152a.showLoading();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0050  */
                @Override // com.transsion.payment.lib.InterfaceC16364b
                /* JADX INFO: renamed from: c */
                public void mo66216c(int i11, String balance, String str) {
                    boolean z12;
                    MemberInfo memberInfo3;
                    MemberInfo memberInfo4;
                    Intrinsics.m97802h(balance, "balance");
                    C26866a.a aVar = C26866a.f81698a;
                    C26866a.a.m104899g(aVar, "Payment succeed " + str, false, 2, null);
                    MemberDetail memberDetail3 = this.f54152a.memberDetail;
                    if ((memberDetail3 == null || (memberInfo4 = memberDetail3.getMemberInfo()) == null) ? false : memberInfo4.isActive()) {
                        MemberDetail memberDetail4 = this.f54152a.memberDetail;
                        if ((memberDetail4 == null || (memberInfo3 = memberDetail4.getMemberInfo()) == null || memberInfo3.getMemberType() != 2) ? false : true) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                    C26866a.a.m104899g(aVar, "after pay isPremium:  " + z12, false, 2, null);
                    this.f54152a.shouldRefreshPurchasedInfo = true;
                    C26866a.a.m104899g(aVar, "Should refresh purchased info", false, 2, null);
                    this.f54152a.m69795m1(productId);
                    AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new MemberFragment$startPay$1$1$success$1(this.f54152a, null), 3, null);
                    AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f54152a), null, null, new MemberFragment$startPay$1$1$success$2(str, null), 3, null);
                    if (this.f54152a.getContext() != null) {
                        this.f54152a.m69816K0();
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: v1 */
    private final void m69810v1(float alpha) {
        C4860i mViewBinding;
        ConstraintLayout constraintLayout;
        if (!isAdded() || (mViewBinding = getMViewBinding()) == null || (constraintLayout = mViewBinding.f17245w) == null) {
            return;
        }
        constraintLayout.setBackgroundColor(m69761G0(AbstractC2397b.getColor(requireContext(), com.p282tn.lib.widget.R$color.gray_dark_00), RangesKt.m97937g(alpha, 1.0f)));
    }

    /* JADX INFO: renamed from: w1 */
    private final void m69812w1(UserInfo userInfo) {
        C4860i mViewBinding;
        if (userInfo == null || (mViewBinding = getMViewBinding()) == null) {
            return;
        }
        C23860f.a aVar = C23860f.f72909a;
        Context context = mViewBinding.f17224b.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        C23860f.b bVarM94470i = aVar.m94457m(context).m94468g(userInfo.getAvatar()).m94470i(com.p282tn.lib.widget.R$mipmap.profile_default_avatar);
        ShapeableImageView ivAvatarPremium = mViewBinding.f17224b;
        Intrinsics.m97801g(ivAvatarPremium, "ivAvatarPremium");
        bVarM94470i.m94465d(ivAvatarPremium);
        mViewBinding.f17230h.setText(C2448a.m11999c().m12009m(userInfo.getNickname(), AbstractC2468u.f8605a));
    }

    /* JADX INFO: renamed from: K0 */
    public final void m69816K0() {
        if (m69766M0().isAdded()) {
            m69766M0().dismissAllowingStateLoss();
        } else {
            C26866a.a.m104899g(C26866a.f81698a, "Dialog not is added", false, 2, null);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C4860i getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C4860i c4860iM23370c = C4860i.m23370c(inflater);
        Intrinsics.m97801g(c4860iM23370c, "inflate(...)");
        return c4860iM23370c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatTextView appCompatTextView;
        PointView pointView;
        PointView pointView2;
        AppCompatImageView appCompatImageView;
        C4860i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatImageView = mViewBinding.f17225c) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MemberFragment.m69769Q0(this.f54350a, view);
                }
            });
        }
        C4860i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (pointView2 = mViewBinding2.f17228f) != null) {
            pointView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MemberFragment.m69770R0(this.f54351a, view);
                }
            });
        }
        C4860i mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (pointView = mViewBinding3.f17237o) != null) {
            pointView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MemberFragment.m69771S0(this.f54352a, view);
                }
            });
        }
        C4860i mViewBinding4 = getMViewBinding();
        if (mViewBinding4 == null || (appCompatTextView = mViewBinding4.f17248z) == null) {
            return;
        }
        AbstractC26006c.m102050c(appCompatTextView, 0L, new Function1() { // from class: com.transsion.member.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MemberFragment.m69772T0((View) obj);
            }
        }, 1, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        RecyclerView recyclerView;
        InterfaceC23704a mLoginApi;
        m69765L0();
        if (getIsSelf() && (mLoginApi = getMLoginApi()) != null) {
            mLoginApi.mo90392n(this);
        }
        this.loginLaunch = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.member.q
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                MemberFragment.m69773U0((ActivityResult) obj);
            }
        });
        final C4860i mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            if (getActivity() instanceof MemberActivity) {
                mViewBinding.f17225c.setVisibility(0);
            } else {
                mViewBinding.f17225c.setVisibility(8);
            }
            mViewBinding.f17247y.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MemberFragment.m69774V0(this.f54353a, view);
                }
            });
            C4860i mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (recyclerView = mViewBinding2.f17242t) != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
                recyclerView.addItemDecoration(new C15786h.a());
                C15786h c15786h = new C15786h(this, m69767N0(), this);
                this.taskAdapter = c15786h;
                recyclerView.setAdapter(c15786h);
            }
            m69762H0();
            mViewBinding.f17243u.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.transsion.member.s
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                    MemberFragment.m69775W0(mViewBinding, this, view, i11, i12, i13, i14);
                }
            });
            m69810v1(0.0f);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        MemberViewModel memberViewModelM69767N0 = m69767N0();
        memberViewModelM69767N0.m69916v().m14851j(getViewLifecycleOwner(), new C15753d(new Function1() { // from class: com.transsion.member.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MemberFragment.m69781c1(this.f54356a, (MemberDetail) obj);
            }
        }));
        memberViewModelM69767N0.m69902A().m14851j(getViewLifecycleOwner(), new C15753d(new Function1() { // from class: com.transsion.member.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MemberFragment.m69776X0(this.f54357a, (SkuData) obj);
            }
        }));
        memberViewModelM69767N0.m69917x().m14851j(getViewLifecycleOwner(), new C15753d(new Function1() { // from class: com.transsion.member.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MemberFragment.m69777Y0(this.f54323a, (RedeemResult) obj);
            }
        }));
        memberViewModelM69767N0.m69905D().m14851j(getViewLifecycleOwner(), new C15753d(new Function1() { // from class: com.transsion.member.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MemberFragment.m69778Z0(this.f54324a, (List) obj);
            }
        }));
        memberViewModelM69767N0.m69904C().m14851j(getViewLifecycleOwner(), new C15753d(new Function1() { // from class: com.transsion.member.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MemberFragment.m69779a1(this.f54325a, (C23001e) obj);
            }
        }));
        memberViewModelM69767N0.m69903B().m14851j(getViewLifecycleOwner(), new C15753d(new Function1() { // from class: com.transsion.member.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MemberFragment.m69780b1(this.f54326a, (Pair) obj);
            }
        }));
        m69767N0().m69906E();
        m69812w1(this.mUserInfo);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        LinearLayoutCompat linearLayoutCompat;
        RecyclerView recyclerView;
        LinearLayoutCompat linearLayoutCompat2;
        RecyclerView recyclerView2;
        super.loadDefaultData();
        try {
            Result.Companion companion = Result.INSTANCE;
            InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
            if (interfaceC22998b != null ? interfaceC22998b.mo69850d() : false) {
                C4860i mViewBinding = getMViewBinding();
                if (mViewBinding != null && (recyclerView2 = mViewBinding.f17240r) != null) {
                    recyclerView2.setVisibility(0);
                }
                C4860i mViewBinding2 = getMViewBinding();
                if (mViewBinding2 != null && (linearLayoutCompat2 = mViewBinding2.f17232j) != null) {
                    linearLayoutCompat2.setVisibility(0);
                }
            } else {
                C4860i mViewBinding3 = getMViewBinding();
                if (mViewBinding3 != null && (recyclerView = mViewBinding3.f17240r) != null) {
                    recyclerView.setVisibility(8);
                }
                C4860i mViewBinding4 = getMViewBinding();
                if (mViewBinding4 != null && (linearLayoutCompat = mViewBinding4.f17232j) != null) {
                    linearLayoutCompat.setVisibility(8);
                }
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void logResume() {
        super.logResume();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("memberdetail", false, 2, null);
    }

    /* JADX INFO: renamed from: o1 */
    public final void m69818o1(String str) {
        this.sceneId = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        boolean z11;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        HashMap mapM96844g3;
        HashMap mapM96844g4;
        UserInfo userInfoMo90386h;
        super.onCreate(savedInstanceState);
        InterfaceC23704a mLoginApi = getMLoginApi();
        String userId = null;
        UserInfo userInfoMo90386h2 = mLoginApi != null ? mLoginApi.mo90386h() : null;
        this.mUserInfo = userInfoMo90386h2;
        String userId2 = userInfoMo90386h2 != null ? userInfoMo90386h2.getUserId() : null;
        if (userId2 == null || userId2.length() == 0) {
            z11 = true;
        } else {
            UserInfo userInfo = this.mUserInfo;
            String userId3 = userInfo != null ? userInfo.getUserId() : null;
            InterfaceC23704a mLoginApi2 = getMLoginApi();
            if (mLoginApi2 != null && (userInfoMo90386h = mLoginApi2.mo90386h()) != null) {
                userId = userInfoMo90386h.getUserId();
            }
            if (Intrinsics.m97797c(userId3, userId)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.isSelf = z11;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g4 = logViewConfig.m96844g()) != null) {
        }
        if (this.source != null) {
            C24655b logViewConfig2 = getLogViewConfig();
            if (logViewConfig2 == null || (mapM96844g3 = logViewConfig2.m96844g()) == null) {
                return;
            }
            MemberSource memberSource = this.source;
            Intrinsics.m97799e(memberSource);
            return;
        }
        if (getActivity() instanceof MemberActivity) {
            C24655b logViewConfig3 = getLogViewConfig();
            if (logViewConfig3 == null || (mapM96844g2 = logViewConfig3.m96844g()) == null) {
                return;
            }
            return;
        }
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 == null || (mapM96844g = logViewConfig4.m96844g()) == null) {
            return;
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC23704a mLoginApi = getMLoginApi();
        if (mLoginApi != null) {
            mLoginApi.mo90391m(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                m69786h1();
                logResume();
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogin(UserInfo user) {
        Intrinsics.m97802h(user, "user");
        InterfaceC23705b.a.m93655a(this, user);
        m69786h1();
        m69767N0().m69913r();
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogout() {
        InterfaceC23705b.a.m93656b(this);
        m69786h1();
        m69767N0().m69913r();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AbstractC14517k.m65414l(null, this, null, 5, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m69786h1();
        AbstractC14517k.m65418p(null, this, "visible=" + isVisible(), 1, null);
        if (this.isFirstResume) {
            this.isFirstResume = false;
        } else {
            m69767N0().m69913r();
        }
    }

    @Override // p441gz.InterfaceC23705b
    public void onUpdateUserInfo(UserInfo user) {
        Intrinsics.m97802h(user, "user");
        if (getIsSelf()) {
            m69812w1(user);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            InterfaceC22998b.a.m91585a(interfaceC22998b, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m69819s1(MemberSource memberSource) {
        this.source = memberSource;
    }

    public final void showLoading() {
        m69766M0().m65437l0(this, "LoadingDialog");
    }

    /* JADX INFO: renamed from: t1 */
    public final void m69820t1(int points) {
        List<SkuItem> skuPointList;
        PointView pointView;
        PointView pointView2;
        PointInfo pointInfo;
        MemberDetail memberDetail = this.memberDetail;
        if (memberDetail != null && (pointInfo = memberDetail.getPointInfo()) != null) {
            pointInfo.setPoint(points);
        }
        C4860i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (pointView2 = mViewBinding.f17237o) != null) {
            pointView2.setPoints(points);
        }
        C4860i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (pointView = mViewBinding2.f17228f) != null) {
            pointView.setPoints(points);
        }
        SkuData skuDataM69919z = m69767N0().m69919z();
        if (skuDataM69919z == null || (skuPointList = skuDataM69919z.getSkuPointList()) == null) {
            return;
        }
        m69789j1(skuPointList);
    }
}
