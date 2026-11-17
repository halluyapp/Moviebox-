package com.transsion.usercenter.profile.fragment;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.AbstractC0256u;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.palette.graphics.C4127a;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import ck.C5110g;
import ck.C5118o;
import com.blankj.utilcode.util.AbstractC5775a;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.cloud.tmc.integration.event.EventConstants;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.google.android.gms.common.Scopes;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.RoomJoinAnimationView;
import com.p282tn.lib.view.RoomJoinStatus;
import com.p282tn.lib.view.expand.ExpandView;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.AbstractC14567m;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.widget.PileLayout;
import com.transsion.baseui.widget.magicindicator.ORCommonNavigator;
import com.transsion.moviedetailapi.InterfaceC16246g;
import com.transsion.publish.bean.PublishResult;
import com.transsion.publish.view.UploadView;
import com.transsion.push.PushConstants;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.usercenter.R$drawable;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$mipmap;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.profile.ProfileSubjectListViewModel;
import com.transsion.usercenter.profile.bean.BffSubscribeInfo;
import com.transsion.usercenter.profile.bean.BffSubscribeItem;
import com.transsion.usercenter.profile.bean.BffUserInfo;
import com.transsion.usercenter.profile.bean.BffUserProfileData;
import com.transsion.usercenter.profile.viewmodel.UserProfileViewModel;
import com.transsion.usercenter.profile.widget.UserProfileTabTitleView;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C25220y0;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import ng.AbstractC26006c;
import p344db.C22966n;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p465hp.InterfaceC23888a;
import p550kj.C24655b;
import p551kk.AbstractC24664a;
import p585lw.C25719l0;
import p822uv.C28041d;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0096\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001OB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J!\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010 \u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00050\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070%2\u0006\u0010'\u001a\u00020\u001cH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0005H\u0002¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\u0005H\u0002¢\u0006\u0004\b/\u0010\u0004J\u0017\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0005H\u0002¢\u0006\u0004\b4\u0010\u0004J\u0017\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001cH\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0005H\u0002¢\u0006\u0004\b=\u0010\u0004J\u0017\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0007H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0005H\u0016¢\u0006\u0004\bG\u0010\u0004J\u000f\u0010H\u001a\u00020\u0005H\u0016¢\u0006\u0004\bH\u0010\u0004J\u000f\u0010I\u001a\u00020\u0005H\u0016¢\u0006\u0004\bI\u0010\u0004J\u000f\u0010J\u001a\u00020\u0005H\u0016¢\u0006\u0004\bJ\u0010\u0004J\u0017\u0010M\u001a\u00020\u00052\b\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u0016\u0010]\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010PR\u0016\u0010_\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010PR\u0016\u0010b\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010aR\u0016\u0010f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010aR\u0016\u0010h\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010aR\u0016\u0010j\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010aR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u001c0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010aR\u0014\u0010r\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010aR\u0014\u0010t\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010aR\u0014\u0010v\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010aR\u0014\u0010x\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010aR\u0014\u0010z\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010aR\u0014\u0010|\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010aR\u0014\u0010~\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010aR\u0015\u0010\u0080\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010aR\u0016\u0010\u0082\u0001\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010aR\u0018\u0010\u0084\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010PR\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\"\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010T\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\"\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0092\u0001\u0010T\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0097\u0001"}, m97100d2 = {"Lcom/transsion/usercenter/profile/fragment/UserProfileFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Llw/l0;", "<init>", "()V", "", "S0", "", "targetUserId", "Lcom/transsion/usercenter/profile/fragment/UserProfileVideoFragment;", "V0", "(Ljava/lang/String;)Lcom/transsion/usercenter/profile/fragment/UserProfileVideoFragment;", "Landroidx/fragment/app/Fragment;", "U0", "()Landroidx/fragment/app/Fragment;", "l1", "m1", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Lnet/lucode/hackware/magicindicator/MagicIndicator;", "indicator", "T0", "(Landroidx/viewpager2/widget/ViewPager2;Lnet/lucode/hackware/magicindicator/MagicIndicator;)V", "Lcom/transsion/usercenter/profile/bean/BffUserProfileData;", Scopes.PROFILE, "P0", "(Lcom/transsion/usercenter/profile/bean/BffUserProfileData;)V", "imageUrl", "", "fallbackColor", "Lkotlin/Function1;", "onColorReady", "W0", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "inputColor", "R0", "(I)I", "", "avatarUrls", "finalBfColor", "v1", "(Ljava/util/List;I)V", "", "subscribed", "x1", "(Z)V", "n1", "j1", "Landroid/content/Context;", "context", "w1", "(Landroid/content/Context;)V", "z1", "", "collapsePercentage", "O0", "(F)V", "verticalOffset", "totalScrollRange", "y1", "(II)V", "p1", "Landroid/view/LayoutInflater;", "inflater", "a1", "(Landroid/view/LayoutInflater;)Llw/l0;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "initViewData", "initViewModel", "retryLoadData", "initListener", "Lcom/transsion/publish/bean/PublishResult;", NotificationCompat.CATEGORY_EVENT, "t1", "(Lcom/transsion/publish/bean/PublishResult;)V", "a", "Z", "isSubscribed", "Lcom/transsion/usercenter/profile/viewmodel/UserProfileViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "X0", "()Lcom/transsion/usercenter/profile/viewmodel/UserProfileViewModel;", "mViewModel", "c", "Ljava/lang/String;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "fromOptId", "e", "lastSubscribeBeforeToggle", "f", "shouldShowSubscribeToast", "g", "I", "statusBarFixedHeight", "h", "titleBarFixedHeight", "i", "topContentExpandedHeight", "j", "lastAppBarOffset", CampaignEx.JSON_KEY_AD_K, "lastAppBarTotalScrollRange", "", "l", "Ljava/util/List;", "tabTitleResIds", "m", "dp22", "n", "initialCoverSize", "o", "finalCoverSize", TtmlNode.TAG_P, "finalHeaderSize", CampaignEx.JSON_KEY_AD_Q, "finalMarginStart", CampaignEx.JSON_KEY_AD_R, "initialMarginStart", "s", "finalMarginTop", "t", "initialMarginTop", TmcStartParams.KEY_URL_SHORT, "collapsedTitlePaddingEnd", "v", "expandedTitlePaddingEnd", "w", "hasMarkLoadResult", "x", "Lcom/transsion/publish/bean/PublishResult;", "publishEventBean", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "y", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "firstUgcVideo", "Lcom/transsion/moviedetailapi/g;", "z", "Y0", "()Lcom/transsion/moviedetailapi/g;", "movieDetailService", "Lhp/a;", "A", "Z0", "()Lhp/a;", "publishedApi", "B", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UserProfileFragment extends PageStatusFragment<C25719l0> {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final Lazy publishedApi;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isSubscribed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String targetUserId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String fromOptId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean lastSubscribeBeforeToggle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean shouldShowSubscribeToast;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int statusBarFixedHeight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int titleBarFixedHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int topContentExpandedHeight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int lastAppBarOffset;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int lastAppBarTotalScrollRange;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final List tabTitleResIds;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int dp22;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int initialCoverSize;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int finalCoverSize;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int finalHeaderSize;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int finalMarginStart;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int initialMarginStart;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int finalMarginTop;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int initialMarginTop;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int collapsedTitlePaddingEnd;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int expandedTitlePaddingEnd;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean hasMarkLoadResult;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private PublishResult publishEventBean;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private UGCVideo firstUgcVideo;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final Lazy movieDetailService;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.UserProfileFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UserProfileFragment m85409a(String str, String fromOptId) {
            Intrinsics.m97802h(fromOptId, "fromOptId");
            UserProfileFragment userProfileFragment = new UserProfileFragment();
            Bundle bundle = new Bundle();
            bundle.putString("userId", str);
            bundle.putString("fromOptId", fromOptId);
            userProfileFragment.setArguments(bundle);
            return userProfileFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.UserProfileFragment$b */
    public static final class C20667b extends FragmentStateAdapter {
        C20667b() {
            super(UserProfileFragment.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            if (i11 != 0) {
                Fragment fragmentM85360U0 = UserProfileFragment.this.m85360U0();
                if (fragmentM85360U0 != null) {
                    return fragmentM85360U0;
                }
                UserProfileFragment userProfileFragment = UserProfileFragment.this;
                return userProfileFragment.m85361V0(userProfileFragment.targetUserId);
            }
            if (UserProfileFragment.this.tabTitleResIds.size() != 1) {
                UserProfileFragment userProfileFragment2 = UserProfileFragment.this;
                return userProfileFragment2.m85361V0(userProfileFragment2.targetUserId);
            }
            Fragment fragmentM85360U1 = UserProfileFragment.this.m85360U0();
            if (fragmentM85360U1 != null) {
                return fragmentM85360U1;
            }
            UserProfileFragment userProfileFragment3 = UserProfileFragment.this;
            return userProfileFragment3.m85361V0(userProfileFragment3.targetUserId);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return UserProfileFragment.this.tabTitleResIds.size();
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.UserProfileFragment$c */
    public static final class C20668c extends AbstractC24664a {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ViewPager2 f65231c;

        C20668c(ViewPager2 viewPager2) {
            this.f65231c = viewPager2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final void m85411j(ViewPager2 viewPager2, int i11, View view) {
            viewPager2.setCurrentItem(i11, true);
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            return UserProfileFragment.this.tabTitleResIds.size();
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            Intrinsics.m97802h(context, "context");
            LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
            linePagerIndicator.setMode(2);
            linePagerIndicator.setLineHeight(0.0f);
            linePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
            linePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
            linePagerIndicator.setColors(Integer.valueOf(AbstractC2397b.getColor(context, R$color.transparent)));
            return linePagerIndicator;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, final int i11) {
            Intrinsics.m97802h(context, "context");
            UserProfileTabTitleView userProfileTabTitleView = new UserProfileTabTitleView(context);
            UserProfileFragment userProfileFragment = UserProfileFragment.this;
            final ViewPager2 viewPager2 = this.f65231c;
            userProfileTabTitleView.setTextById(((Number) userProfileFragment.tabTitleResIds.get(i11)).intValue());
            userProfileTabTitleView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.fragment.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserProfileFragment.C20668c.m85411j(viewPager2, i11, view);
                }
            });
            return userProfileTabTitleView;
        }

        @Override // p551kk.AbstractC24664a
        /* JADX INFO: renamed from: h */
        public LinearLayout.LayoutParams mo76788h(Context context, int i11) {
            Intrinsics.m97802h(context, "context");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            int iM27313a = AbstractC5776a0.m27313a(6.0f);
            layoutParams.setMargins(iM27313a, 0, iM27313a, 0);
            return layoutParams;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.UserProfileFragment$d */
    public static final class C20669d extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MagicIndicator f65232a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ UserProfileFragment f65233b;

        C20669d(MagicIndicator magicIndicator, UserProfileFragment userProfileFragment) {
            this.f65232a = magicIndicator;
            this.f65233b = userProfileFragment;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            super.onPageScrollStateChanged(i11);
            MagicIndicator magicIndicator = this.f65232a;
            if (magicIndicator != null) {
                magicIndicator.onPageScrollStateChanged(i11);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            super.onPageScrolled(i11, f11, i12);
            MagicIndicator magicIndicator = this.f65232a;
            if (magicIndicator != null) {
                magicIndicator.onPageScrolled(i11, f11, i12);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            HashMap mapM96844g;
            super.onPageSelected(i11);
            MagicIndicator magicIndicator = this.f65232a;
            if (magicIndicator != null) {
                magicIndicator.onPageSelected(i11);
            }
            if (i11 < this.f65233b.tabTitleResIds.size()) {
                UserProfileFragment userProfileFragment = this.f65233b;
                String string = userProfileFragment.getString(((Number) userProfileFragment.tabTitleResIds.get(i11)).intValue());
                Intrinsics.m97801g(string, "getString(...)");
                C24655b logViewConfig = this.f65233b.getLogViewConfig();
                if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.UserProfileFragment$e */
    public static final class C20670e implements UserProfileVideoFragment.InterfaceC20676b {
        C20670e() {
        }

        @Override // com.transsion.usercenter.profile.fragment.UserProfileVideoFragment.InterfaceC20676b
        /* JADX INFO: renamed from: a */
        public void mo85412a(Long l11, String str, UGCVideo uGCVideo) {
            HashMap mapM96844g;
            HashMap mapM96844g2;
            String string;
            if (UserProfileFragment.this.hasMarkLoadResult) {
                return;
            }
            UserProfileFragment.this.firstUgcVideo = uGCVideo;
            UserProfileFragment.this.hasMarkLoadResult = true;
            C24655b logViewConfig = UserProfileFragment.this.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            C24655b logViewConfig2 = UserProfileFragment.this.getLogViewConfig();
            if (logViewConfig2 != null && (mapM96844g2 = logViewConfig2.m96844g()) != null) {
                if (l11 == null || (string = l11.toString()) == null) {
                    string = "";
                }
            }
            C24655b logViewConfig3 = UserProfileFragment.this.getLogViewConfig();
            if (logViewConfig3 == null || (mapM96844g = logViewConfig3.m96844g()) == null) {
                return;
            }
            if (str == null) {
                str = "";
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.UserProfileFragment$f */
    public static final class C20671f extends CustomTarget {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f65235a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ UserProfileFragment f65236b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f65237c;

        C20671f(Function1 function1, UserProfileFragment userProfileFragment, int i11) {
            this.f65235a = function1;
            this.f65236b = userProfileFragment;
            this.f65237c = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:28:0x0042 A[PHI: r1
          0x0042: PHI (r1v2 androidx.palette.graphics.a$e) = 
          (r1v1 androidx.palette.graphics.a$e)
          (r1v4 androidx.palette.graphics.a$e)
          (r1v6 androidx.palette.graphics.a$e)
          (r1v8 androidx.palette.graphics.a$e)
          (r1v10 androidx.palette.graphics.a$e)
         binds: [B:9:0x0011, B:13:0x001b, B:17:0x0025, B:21:0x002f, B:25:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: b */
        public static final void m85414b(int i11, Function1 function1, UserProfileFragment userProfileFragment, C4127a c4127a) {
            C4127a.e eVarM20483j;
            if (c4127a == null || (eVarM20483j = c4127a.m20482i()) == null) {
                eVarM20483j = null;
                C4127a.e eVarM20487o = c4127a != null ? c4127a.m20487o() : null;
                if (eVarM20487o != null) {
                    eVarM20483j = eVarM20487o;
                } else {
                    eVarM20487o = c4127a != null ? c4127a.m20485m() : null;
                    if (eVarM20487o != null) {
                        eVarM20483j = eVarM20487o;
                    } else {
                        eVarM20487o = c4127a != null ? c4127a.m20480g() : null;
                        if (eVarM20487o != null) {
                            eVarM20483j = eVarM20487o;
                        } else {
                            eVarM20487o = c4127a != null ? c4127a.m20484k() : null;
                            if (eVarM20487o != null) {
                                eVarM20483j = eVarM20487o;
                            } else {
                                eVarM20487o = c4127a != null ? c4127a.m20479f() : null;
                                if (eVarM20487o != null) {
                                    eVarM20483j = eVarM20487o;
                                } else if (c4127a != null) {
                                    eVarM20483j = c4127a.m20483j();
                                }
                            }
                        }
                    }
                }
            }
            if (eVarM20483j != null) {
                i11 = eVarM20483j.m20504e();
            } else if (c4127a != null) {
                i11 = c4127a.m20481h(i11);
            }
            function1.invoke(Integer.valueOf(userProfileFragment.m85357R0(i11)));
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
        public void onLoadFailed(Drawable drawable) {
            this.f65235a.invoke(Integer.valueOf(this.f65236b.m85357R0(this.f65237c)));
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(Bitmap resource, Transition transition) {
            Intrinsics.m97802h(resource, "resource");
            try {
                C4127a.b bVarM20494a = C4127a.m20473b(resource).m20494a();
                final int i11 = this.f65237c;
                final Function1 function1 = this.f65235a;
                final UserProfileFragment userProfileFragment = this.f65236b;
                Intrinsics.m97799e(bVarM20494a.m20495b(new C4127a.d() { // from class: com.transsion.usercenter.profile.fragment.q
                    @Override // androidx.palette.graphics.C4127a.d
                    /* JADX INFO: renamed from: a */
                    public final void mo20499a(C4127a c4127a) {
                        UserProfileFragment.C20671f.m85414b(i11, function1, userProfileFragment, c4127a);
                    }
                }));
            } catch (Exception unused) {
                this.f65235a.invoke(Integer.valueOf(this.f65236b.m85357R0(this.f65237c)));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.UserProfileFragment$g */
    public static final class C20672g implements ExpandView.InterfaceC13757c {
        C20672g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final void m85419g(UserProfileFragment userProfileFragment) {
            userProfileFragment.m85406z1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final void m85420h(UserProfileFragment userProfileFragment) {
            userProfileFragment.m85404y1(userProfileFragment.lastAppBarOffset, userProfileFragment.lastAppBarTotalScrollRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final void m85421i(UserProfileFragment userProfileFragment) {
            userProfileFragment.m85406z1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final void m85422j(UserProfileFragment userProfileFragment) {
            userProfileFragment.m85404y1(userProfileFragment.lastAppBarOffset, userProfileFragment.lastAppBarTotalScrollRange);
        }

        @Override // com.p282tn.lib.view.expand.ExpandView.InterfaceC13757c
        /* JADX INFO: renamed from: a */
        public void mo62199a(ExpandView expandView) {
            ConstraintLayout constraintLayoutM101177b;
            ExpandView expandView2;
            C25719l0 mViewBinding = UserProfileFragment.this.getMViewBinding();
            if (mViewBinding != null && (expandView2 = mViewBinding.f78293d) != null) {
                final UserProfileFragment userProfileFragment = UserProfileFragment.this;
                expandView2.post(new Runnable() { // from class: com.transsion.usercenter.profile.fragment.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserProfileFragment.C20672g.m85421i(userProfileFragment);
                    }
                });
            }
            C25719l0 mViewBinding2 = UserProfileFragment.this.getMViewBinding();
            if (mViewBinding2 == null || (constraintLayoutM101177b = mViewBinding2.getRoot()) == null) {
                return;
            }
            final UserProfileFragment userProfileFragment2 = UserProfileFragment.this;
            constraintLayoutM101177b.post(new Runnable() { // from class: com.transsion.usercenter.profile.fragment.s
                @Override // java.lang.Runnable
                public final void run() {
                    UserProfileFragment.C20672g.m85422j(userProfileFragment2);
                }
            });
        }

        @Override // com.p282tn.lib.view.expand.ExpandView.InterfaceC13757c
        /* JADX INFO: renamed from: b */
        public void mo62200b(ExpandView expandView) {
            ConstraintLayout constraintLayoutM101177b;
            ExpandView expandView2;
            C25719l0 mViewBinding = UserProfileFragment.this.getMViewBinding();
            if (mViewBinding != null && (expandView2 = mViewBinding.f78293d) != null) {
                final UserProfileFragment userProfileFragment = UserProfileFragment.this;
                expandView2.post(new Runnable() { // from class: com.transsion.usercenter.profile.fragment.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserProfileFragment.C20672g.m85419g(userProfileFragment);
                    }
                });
            }
            C25719l0 mViewBinding2 = UserProfileFragment.this.getMViewBinding();
            if (mViewBinding2 == null || (constraintLayoutM101177b = mViewBinding2.getRoot()) == null) {
                return;
            }
            final UserProfileFragment userProfileFragment2 = UserProfileFragment.this;
            constraintLayoutM101177b.post(new Runnable() { // from class: com.transsion.usercenter.profile.fragment.u
                @Override // java.lang.Runnable
                public final void run() {
                    UserProfileFragment.C20672g.m85420h(userProfileFragment2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.UserProfileFragment$h */
    public static final class C20673h extends AbstractC0256u {
        C20673h() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            UserProfileFragment.this.m85379l1();
        }
    }

    public UserProfileFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.usercenter.profile.fragment.UserProfileFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UserProfileViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.usercenter.profile.fragment.UserProfileFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.usercenter.profile.fragment.UserProfileFragment$special$$inlined$viewModels$default$3
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
        this.tabTitleResIds = new ArrayList();
        this.dp22 = AbstractC23384a.m92908b(24);
        this.initialCoverSize = AbstractC23384a.m92908b(52);
        this.finalCoverSize = AbstractC23384a.m92908b(24);
        this.finalHeaderSize = AbstractC23384a.m92908b(28);
        this.finalMarginStart = AbstractC23384a.m92908b(48);
        this.initialMarginStart = AbstractC23384a.m92908b(12);
        this.finalMarginTop = AbstractC23384a.m92908b(12);
        this.initialMarginTop = AbstractC23384a.m92908b(54);
        this.collapsedTitlePaddingEnd = AbstractC23384a.m92908b(105);
        this.movieDetailService = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.fragment.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserProfileFragment.m85373i1();
            }
        });
        this.publishedApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.fragment.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserProfileFragment.m85385o1();
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    private final void m85354O0(float collapsePercentage) {
        AppCompatTextView appCompatTextView;
        RoomJoinAnimationView roomJoinAnimationView;
        C25719l0 mViewBinding;
        RoomJoinAnimationView roomJoinAnimationView2;
        RoomJoinAnimationView roomJoinAnimationView3;
        C25719l0 mViewBinding2;
        RoomJoinAnimationView roomJoinAnimationView4;
        RoomJoinAnimationView roomJoinAnimationView5;
        RoomJoinAnimationView roomJoinAnimationView6;
        ExpandView expandView;
        AppCompatImageView appCompatImageView;
        ShapeableImageView shapeableImageView;
        ShapeableImageView shapeableImageView2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        int i11 = this.initialCoverSize;
        float f11 = i11 - ((i11 - this.finalCoverSize) * collapsePercentage);
        float f12 = i11 - ((i11 - this.finalHeaderSize) * collapsePercentage);
        int i12 = this.initialMarginStart;
        float f13 = i12 - ((i12 - this.finalMarginStart) * collapsePercentage);
        int i13 = this.initialMarginTop;
        float f14 = i13 - ((i13 - this.finalMarginTop) * collapsePercentage);
        C25719l0 mViewBinding3 = getMViewBinding();
        ViewGroup.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = (mViewBinding3 == null || (linearLayout2 = mViewBinding3.f78302m) == null) ? null : linearLayout2.getLayoutParams();
        Intrinsics.m97800f(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMarginStart((int) f13);
        marginLayoutParams.topMargin = (int) f14;
        marginLayoutParams.height = (int) f12;
        C25719l0 mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (linearLayout = mViewBinding4.f78302m) != null) {
            linearLayout.setLayoutParams(marginLayoutParams);
        }
        C25719l0 mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (shapeableImageView2 = mViewBinding5.f78298i) != null) {
            layoutParams = shapeableImageView2.getLayoutParams();
        }
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        int i14 = (int) f11;
        layoutParams.width = i14;
        layoutParams.height = i14;
        C25719l0 mViewBinding6 = getMViewBinding();
        if (mViewBinding6 != null && (shapeableImageView = mViewBinding6.f78298i) != null) {
            shapeableImageView.setLayoutParams(layoutParams);
        }
        float f15 = 2 * collapsePercentage;
        if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        C25719l0 mViewBinding7 = getMViewBinding();
        if (mViewBinding7 != null && (appCompatImageView = mViewBinding7.f78299j) != null) {
            appCompatImageView.setAlpha(1 - f15);
        }
        C25719l0 mViewBinding8 = getMViewBinding();
        if (mViewBinding8 != null && (expandView = mViewBinding8.f78293d) != null) {
            expandView.setAlpha(1 - f15);
        }
        if (!Intrinsics.m97797c(m85363X0().m85575q().m14847f(), Boolean.TRUE)) {
            C25719l0 mViewBinding9 = getMViewBinding();
            if (mViewBinding9 != null && (roomJoinAnimationView6 = mViewBinding9.f78308s) != null) {
                roomJoinAnimationView6.setAlpha(1 - f15);
            }
            boolean z11 = ((float) 1) - f15 > 0.0f;
            C25719l0 mViewBinding10 = getMViewBinding();
            if (((mViewBinding10 == null || (roomJoinAnimationView5 = mViewBinding10.f78308s) == null || roomJoinAnimationView5.getVisibility() != 0) ? false : true) != z11 && (mViewBinding2 = getMViewBinding()) != null && (roomJoinAnimationView4 = mViewBinding2.f78308s) != null) {
                roomJoinAnimationView4.setVisibility((!z11 || C5118o.f17608a.m23948i()) ? 8 : 0);
            }
            boolean z12 = collapsePercentage > 0.5f && !this.isSubscribed;
            C25719l0 mViewBinding11 = getMViewBinding();
            if (((mViewBinding11 == null || (roomJoinAnimationView3 = mViewBinding11.f78309t) == null || roomJoinAnimationView3.getVisibility() != 0) ? false : true) != z12 && (mViewBinding = getMViewBinding()) != null && (roomJoinAnimationView2 = mViewBinding.f78309t) != null) {
                roomJoinAnimationView2.setVisibility((!z12 || C5118o.f17608a.m23948i()) ? 8 : 0);
            }
        }
        C25719l0 mViewBinding12 = getMViewBinding();
        int i15 = (mViewBinding12 == null || (roomJoinAnimationView = mViewBinding12.f78309t) == null || roomJoinAnimationView.getVisibility() != 0) ? this.expandedTitlePaddingEnd : this.collapsedTitlePaddingEnd;
        C25719l0 mViewBinding13 = getMViewBinding();
        if (mViewBinding13 == null || (appCompatTextView = mViewBinding13.f78307r) == null) {
            return;
        }
        appCompatTextView.setPaddingRelative(appCompatTextView.getPaddingStart(), appCompatTextView.getPaddingTop(), i15, appCompatTextView.getPaddingBottom());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX INFO: renamed from: P0 */
    private final void m85355P0(BffUserProfileData profile) {
        BffUserInfo userInfo;
        Integer userType;
        BffUserInfo userInfo2;
        String username;
        final List listL;
        Integer followerCount;
        Boolean boolIsSubscribed;
        List<BffSubscribeItem> followerItems;
        String avatar;
        Integer publishCount;
        Integer userType2;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        final C25719l0 mViewBinding = getMViewBinding();
        if (mViewBinding == null) {
            return;
        }
        BffUserInfo userInfo3 = profile.getUserInfo();
        if ((userInfo3 == null || (userType2 = userInfo3.getUserType()) == null || userType2.intValue() != 0) && (((userInfo = profile.getUserInfo()) == null || (userType = userInfo.getUserType()) == null || userType.intValue() != 1) && C5110g.f17601a.m23911b())) {
            this.tabTitleResIds.add(Integer.valueOf(R$string.profile_video));
            this.tabTitleResIds.add(Integer.valueOf(R$string.profile_post));
        } else {
            this.tabTitleResIds.add(Integer.valueOf(R$string.profile_post));
        }
        m85358S0();
        BffUserInfo userInfo4 = profile.getUserInfo();
        String str = "";
        if (userInfo4 == null || (username = userInfo4.getNickname()) == null) {
            userInfo2 = profile.getUserInfo();
            if (userInfo2 != null) {
                username = userInfo2.getUsername();
            } else {
                username = null;
            }
            if (username == null) {
                username = "";
            }
        } else {
            if (StringsKt.m98160q0(username)) {
                username = null;
            }
            if (username == null) {
                userInfo2 = profile.getUserInfo();
                if (userInfo2 != null) {
                    username = userInfo2.getUsername();
                } else {
                    username = null;
                }
                if (username == null) {
                    username = "";
                }
            }
        }
        mViewBinding.f78307r.setText(username);
        BffUserInfo userInfo5 = profile.getUserInfo();
        String profile2 = userInfo5 != null ? userInfo5.getProfile() : null;
        if (profile2 == null) {
            profile2 = "";
        }
        String string = StringsKt.m98155n1(profile2).toString();
        if (string.length() == 0) {
            mViewBinding.f78293d.setVisibility(8);
            mViewBinding.f78292c.setPadding(AbstractC23384a.m92908b(12), AbstractC23384a.m92908b(55), AbstractC23384a.m92908b(12), AbstractC23384a.m92908b(12));
        } else {
            mViewBinding.f78293d.setVisibility(0);
            mViewBinding.f78293d.m62195m(string);
        }
        int i11 = R$string.user_profile_video_count;
        BffSubscribeInfo subscribeInfo = profile.getSubscribeInfo();
        String string2 = getString(i11, String.valueOf((subscribeInfo == null || (publishCount = subscribeInfo.getPublishCount()) == null) ? 0 : publishCount.intValue()));
        Intrinsics.m97801g(string2, "getString(...)");
        mViewBinding.f78312w.setText(string2);
        BffUserInfo userInfo6 = profile.getUserInfo();
        if (userInfo6 != null && (avatar = userInfo6.getAvatar()) != null) {
            str = avatar;
        }
        C23860f.a aVar = C23860f.f72909a;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        C23860f.b bVarM94470i = aVar.m94457m(contextRequireContext).m94468g(str).m94470i(R$mipmap.profile_visitor_avatar);
        ShapeableImageView ivRoomCover = mViewBinding.f78298i;
        Intrinsics.m97801g(ivRoomCover, "ivRoomCover");
        bVarM94470i.m94465d(ivRoomCover);
        int color = AbstractC2397b.getColor(requireContext(), com.transsion.usercenter.R$color.post_detail_top_bg);
        BffSubscribeInfo subscribeInfo2 = profile.getSubscribeInfo();
        if (subscribeInfo2 == null || (followerItems = subscribeInfo2.getFollowerItems()) == null) {
            listL = CollectionsKt.m97506l();
        } else {
            listL = new ArrayList();
            Iterator<T> it = followerItems.iterator();
            while (it.hasNext()) {
                String avatar2 = ((BffSubscribeItem) it.next()).getAvatar();
                if (avatar2 != null) {
                    listL.add(avatar2);
                }
            }
        }
        m85362W0(str, color, new Function1() { // from class: com.transsion.usercenter.profile.fragment.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserProfileFragment.m85356Q0(this.f65258a, listL, mViewBinding, ((Integer) obj).intValue());
            }
        });
        BffSubscribeInfo subscribeInfo3 = profile.getSubscribeInfo();
        if (subscribeInfo3 != null && (boolIsSubscribed = subscribeInfo3.isSubscribed()) != null) {
            m85402x1(boolIsSubscribed.booleanValue());
        }
        BffSubscribeInfo subscribeInfo4 = profile.getSubscribeInfo();
        int iIntValue = (subscribeInfo4 == null || (followerCount = subscribeInfo4.getFollowerCount()) == null) ? 0 : followerCount.intValue();
        if (iIntValue <= 0) {
            mViewBinding.f78306q.setVisibility(4);
        } else {
            mViewBinding.f78306q.setVisibility(0);
        }
        mViewBinding.f78306q.setText(iIntValue == 1 ? getString(R$string.one_follower) : getString(R$string.x_followers, String.valueOf(iIntValue)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final Unit m85356Q0(UserProfileFragment userProfileFragment, List list, C25719l0 c25719l0, int i11) {
        userProfileFragment.m85398v1(list, i11);
        c25719l0.getRoot().findViewById(R$id.v_top_bg_color).setBackgroundColor(i11);
        c25719l0.f78295f.setBackgroundColor(i11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public final int m85357R0(int inputColor) {
        float[] fArr = new float[3];
        Color.colorToHSV(inputColor, fArr);
        return Color.HSVToColor(new float[]{fArr[0], fArr[1], RangesKt.m97937g(fArr[2], 0.6f)});
    }

    /* JADX INFO: renamed from: S0 */
    private final void m85358S0() {
        ViewPager2 viewPager2;
        C25719l0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (viewPager2 = mViewBinding.f78313x) == null) {
            return;
        }
        viewPager2.setAdapter(new C20667b());
        C25719l0 mViewBinding2 = getMViewBinding();
        m85359T0(viewPager2, mViewBinding2 != null ? mViewBinding2.f78303n : null);
    }

    /* JADX INFO: renamed from: T0 */
    private final void m85359T0(ViewPager2 viewPager, MagicIndicator indicator) {
        if (indicator != null) {
            ORCommonNavigator oRCommonNavigator = new ORCommonNavigator(requireContext());
            oRCommonNavigator.setFollowTouch(true);
            oRCommonNavigator.setAdapter(new C20668c(viewPager));
            indicator.setNavigator(oRCommonNavigator);
        }
        viewPager.registerOnPageChangeCallback(new C20669d(indicator, this));
        if (indicator != null) {
            indicator.onPageSelected(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public final Fragment m85360U0() {
        Bundle bundle = new Bundle();
        bundle.putInt(EventConstants.KEY_SOURCE, 0);
        bundle.putString("userId", this.targetUserId);
        InterfaceC16246g interfaceC16246gM85364Y0 = m85364Y0();
        if (interfaceC16246gM85364Y0 != null) {
            return interfaceC16246gM85364Y0.mo71008e(bundle, ProfileSubjectListViewModel.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public final UserProfileVideoFragment m85361V0(String targetUserId) {
        UserProfileVideoFragment userProfileVideoFragmentM85446a = UserProfileVideoFragment.INSTANCE.m85446a(targetUserId);
        userProfileVideoFragmentM85446a.m85445m0(new C20670e());
        return userProfileVideoFragmentM85446a;
    }

    /* JADX INFO: renamed from: W0 */
    private final void m85362W0(String imageUrl, int fallbackColor, Function1 onColorReady) {
        if (imageUrl == null || StringsKt.m98160q0(imageUrl)) {
            onColorReady.invoke(Integer.valueOf(m85357R0(fallbackColor)));
        } else {
            Glide.with(requireContext()).asBitmap().load2(imageUrl).into(new C20671f(onColorReady, this, fallbackColor));
        }
    }

    /* JADX INFO: renamed from: X0 */
    private final UserProfileViewModel m85363X0() {
        return (UserProfileViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: renamed from: Y0 */
    private final InterfaceC16246g m85364Y0() {
        return (InterfaceC16246g) this.movieDetailService.getValue();
    }

    /* JADX INFO: renamed from: Z0 */
    private final InterfaceC23888a m85365Z0() {
        return (InterfaceC23888a) this.publishedApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m85366b1(UserProfileFragment userProfileFragment, View view) {
        userProfileFragment.m85381m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final void m85367c1(UserProfileFragment userProfileFragment, View view) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        FragmentActivity activity = userProfileFragment.getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.m944l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final void m85368d1(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final void m85369e1(UserProfileFragment userProfileFragment, View view) {
        userProfileFragment.m85381m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final void m85370f1(UserProfileFragment userProfileFragment, AppBarLayout appBarLayout, int i11) {
        userProfileFragment.lastAppBarOffset = i11;
        userProfileFragment.lastAppBarTotalScrollRange = appBarLayout.getTotalScrollRange();
        userProfileFragment.m85354O0(Math.abs(i11) / appBarLayout.getTotalScrollRange());
        userProfileFragment.m85404y1(i11, appBarLayout.getTotalScrollRange());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final void m85371g1(UserProfileFragment userProfileFragment, View view) {
        userProfileFragment.m85379l1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final void m85372h1(UserProfileFragment userProfileFragment, View view) {
        C26866a.f81698a.m104912c("Userpage", "click iv_publish", false);
        userProfileFragment.m85383n1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final InterfaceC16246g m85373i1() {
        return (InterfaceC16246g) TheRouter.m61774d(InterfaceC16246g.class, new Object[0]);
    }

    /* JADX INFO: renamed from: j1 */
    private final void m85375j1() {
        Object context = getContext();
        if (context instanceof ComponentActivity) {
            Function1 function1 = new Function1() { // from class: com.transsion.usercenter.profile.fragment.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UserProfileFragment.m85377k1(this.f65264a, (PublishResult) obj);
                }
            };
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = PublishResult.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.observeEvent((InterfaceC3224u) context, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final Unit m85377k1(UserProfileFragment userProfileFragment, PublishResult evt) {
        Intrinsics.m97802h(evt, "evt");
        userProfileFragment.m85408t1(evt);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public final void m85379l1() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: m1 */
    private final void m85381m1() {
        String str;
        RoomJoinAnimationView roomJoinAnimationView;
        RoomJoinAnimationView roomJoinAnimationView2;
        UserInfo userInfoMo90386h;
        if (C14557c.f51100a.m65671a(2, 2000L) || (str = this.targetUserId) == null || Intrinsics.m97797c(m85363X0().m85575q().m14847f(), Boolean.TRUE)) {
            return;
        }
        HashMap map = new HashMap();
        map.put("module_name", PushConstants.TOPIC_SUBSCRIBE);
        map.put("page_tab_name", getString(R$string.profile_video));
        String str2 = this.targetUserId;
        InterfaceC23704a interfaceC23704a = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
        map.put("uploader_type", Intrinsics.m97797c(str2, (interfaceC23704a == null || (userInfoMo90386h = interfaceC23704a.mo90386h()) == null) ? null : userInfoMo90386h.getUserId()) ? "me" : "others");
        C14450a.f50860a.m65143f("Userpage", map);
        boolean z11 = this.isSubscribed;
        this.lastSubscribeBeforeToggle = z11;
        boolean z12 = !z11;
        C25719l0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (roomJoinAnimationView2 = mViewBinding.f78308s) != null) {
            roomJoinAnimationView2.setStatus(RoomJoinStatus.LOADING);
        }
        C25719l0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (roomJoinAnimationView = mViewBinding2.f78309t) != null) {
            roomJoinAnimationView.setStatus(RoomJoinStatus.LOADING);
        }
        this.shouldShowSubscribeToast = true;
        C26866a.f81698a.m104912c("Userpage", "click subscribe toggle -> " + z12, false);
        m85363X0().m85576u(str, z12);
    }

    /* JADX INFO: renamed from: n1 */
    private final void m85383n1() {
        InterfaceC23888a interfaceC23888aM85365Z0;
        Context context = getContext();
        if (context == null || (interfaceC23888aM85365Z0 = m85365Z0()) == null) {
            return;
        }
        interfaceC23888aM85365Z0.mo75358b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final InterfaceC23888a m85385o1() {
        return (InterfaceC23888a) TheRouter.m61774d(InterfaceC23888a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: p1 */
    private final void m85387p1() {
        m85363X0().m85575q().m14851j(getViewLifecycleOwner(), new C20702v(new Function1() { // from class: com.transsion.usercenter.profile.fragment.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserProfileFragment.m85389q1(this.f65265a, (Boolean) obj);
            }
        }));
        m85363X0().m85572n().m14851j(getViewLifecycleOwner(), new C20702v(new Function1() { // from class: com.transsion.usercenter.profile.fragment.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserProfileFragment.m85391r1(this.f65266a, (Boolean) obj);
            }
        }));
        m85363X0().m85573o().m14851j(getViewLifecycleOwner(), new C20702v(new Function1() { // from class: com.transsion.usercenter.profile.fragment.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserProfileFragment.m85393s1(this.f65267a, (BffUserProfileData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final Unit m85389q1(UserProfileFragment userProfileFragment, Boolean bool) {
        AppCompatImageView appCompatImageView;
        RoomJoinAnimationView roomJoinAnimationView;
        RoomJoinAnimationView roomJoinAnimationView2;
        C25719l0 mViewBinding = userProfileFragment.getMViewBinding();
        if (mViewBinding != null && (roomJoinAnimationView2 = mViewBinding.f78308s) != null) {
            roomJoinAnimationView2.setVisibility((Intrinsics.m97797c(bool, Boolean.TRUE) || C5118o.f17608a.m23948i()) ? 8 : 0);
        }
        C25719l0 mViewBinding2 = userProfileFragment.getMViewBinding();
        if (mViewBinding2 != null && (roomJoinAnimationView = mViewBinding2.f78309t) != null) {
            roomJoinAnimationView.setVisibility((Intrinsics.m97797c(bool, Boolean.TRUE) || C5118o.f17608a.m23948i()) ? 8 : 0);
        }
        C25719l0 mViewBinding3 = userProfileFragment.getMViewBinding();
        if (mViewBinding3 != null && (appCompatImageView = mViewBinding3.f78297h) != null) {
            appCompatImageView.setVisibility(Intrinsics.m97797c(bool, Boolean.TRUE) ? 0 : 8);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX INFO: renamed from: r1 */
    public static final Unit m85391r1(UserProfileFragment userProfileFragment, Boolean bool) {
        Unit unit;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            userProfileFragment.m85402x1(zBooleanValue);
            String str = userProfileFragment.targetUserId;
            if (str != null) {
                C28041d c28041d = new C28041d(str, zBooleanValue);
                FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                String name = C28041d.class.getName();
                Intrinsics.m97801g(name, "getName(...)");
                flowEventBus.postEvent(name, c28041d, 0L);
                if (userProfileFragment.shouldShowSubscribeToast) {
                    AbstractC14567m.m65696c(zBooleanValue ? com.transsion.baseui.R$string.ugc_video_detail_followed : com.transsion.baseui.R$string.ugc_video_detail_unfollowed);
                    userProfileFragment.shouldShowSubscribeToast = false;
                }
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            if (unit == null) {
                userProfileFragment.m85402x1(userProfileFragment.lastSubscribeBeforeToggle);
                userProfileFragment.shouldShowSubscribeToast = false;
            }
        } else {
            userProfileFragment.m85402x1(userProfileFragment.lastSubscribeBeforeToggle);
            userProfileFragment.shouldShowSubscribeToast = false;
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final Unit m85393s1(UserProfileFragment userProfileFragment, BffUserProfileData bffUserProfileData) {
        if (bffUserProfileData != null) {
            userProfileFragment.m85355P0(bffUserProfileData);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final void m85396u1(UserProfileFragment userProfileFragment) {
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        userProfileFragment.m85400w1(applicationM27275a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v1 */
    private final void m85398v1(List avatarUrls, int finalBfColor) {
        C25719l0 mViewBinding;
        if (!isAdded() || isDetached() || isRemoving() || (mViewBinding = getMViewBinding()) == null) {
            return;
        }
        PileLayout plMemberIc = mViewBinding.f78304o;
        Intrinsics.m97801g(plMemberIc, "plMemberIc");
        plMemberIc.removeAllViews();
        int i11 = this.dp22;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(finalBfColor);
        Intrinsics.m97801g(colorStateListValueOf, "valueOf(...)");
        C22966n c22966nM91443m = C22966n.m91391a().m91446q(0, 10.0f).m91445p(C22966n.f70075m).m91443m();
        Intrinsics.m97801g(c22966nM91443m, "build(...)");
        for (String str : CollectionsKt.m97333K0(avatarUrls, 8)) {
            ShapeableImageView shapeableImageView = new ShapeableImageView(requireContext());
            shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            shapeableImageView.setShapeAppearanceModel(c22966nM91443m);
            shapeableImageView.setStrokeWidth(AbstractC23384a.m92908b(2));
            shapeableImageView.setStrokeColor(colorStateListValueOf);
            int iM92908b = AbstractC23384a.m92908b(1);
            shapeableImageView.setPadding(iM92908b, iM92908b, iM92908b, iM92908b);
            C23860f.a aVar = C23860f.f72909a;
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            aVar.m94457m(contextRequireContext).m94468g(str).m94470i(R$mipmap.profile_visitor_avatar).m94474m(i11).m94464c(i11).m94465d(shapeableImageView);
            plMemberIc.addView(shapeableImageView, i11, i11);
        }
        if (avatarUrls.size() > 8) {
            FrameLayout frameLayout = new FrameLayout(requireContext());
            View view = new View(requireContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(colorStateListValueOf.getDefaultColor());
            view.setBackground(gradientDrawable);
            ShapeableImageView shapeableImageView2 = new ShapeableImageView(requireContext());
            shapeableImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            shapeableImageView2.setShapeAppearanceModel(c22966nM91443m);
            shapeableImageView2.setStrokeWidth(AbstractC23384a.m92908b(2));
            shapeableImageView2.setStrokeColor(colorStateListValueOf);
            int iM92908b2 = AbstractC23384a.m92908b(1);
            shapeableImageView2.setPadding(iM92908b2, iM92908b2, iM92908b2, iM92908b2);
            shapeableImageView2.setImageResource(R$drawable.ic_member_more);
            frameLayout.addView(view, new FrameLayout.LayoutParams(i11, i11));
            frameLayout.addView(shapeableImageView2, new FrameLayout.LayoutParams(i11, i11));
            plMemberIc.addView(frameLayout, i11, i11);
        }
    }

    /* JADX INFO: renamed from: w1 */
    private final void m85400w1(Context context) {
        UploadView uploadView = new UploadView(context);
        uploadView.setPageName("Userpage");
        if (!uploadView.getIsShow()) {
            uploadView.setVisibility(0);
            uploadView.setAlpha(1.0f);
            Activity activityM27311b = AbstractC5775a.m27311b();
            if (activityM27311b == null || activityM27311b.isFinishing() || activityM27311b.isDestroyed()) {
                activityM27311b = AbstractC5775a.m27311b();
            }
            if (activityM27311b == null || activityM27311b.isFinishing() || activityM27311b.isDestroyed()) {
                return;
            } else {
                uploadView.show(activityM27311b);
            }
        }
        uploadView.showFloatView(this.publishEventBean);
    }

    /* JADX INFO: renamed from: x1 */
    private final void m85402x1(boolean subscribed) {
        RoomJoinAnimationView roomJoinAnimationView;
        RoomJoinAnimationView roomJoinAnimationView2;
        this.isSubscribed = subscribed;
        RoomJoinStatus roomJoinStatus = subscribed ? RoomJoinStatus.JOINED : RoomJoinStatus.JOIN;
        C25719l0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (roomJoinAnimationView2 = mViewBinding.f78308s) != null) {
            roomJoinAnimationView2.setStatus(roomJoinStatus);
        }
        C25719l0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (roomJoinAnimationView = mViewBinding2.f78309t) == null) {
            return;
        }
        roomJoinAnimationView.setStatus(roomJoinStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public final void m85404y1(int verticalOffset, int totalScrollRange) {
        C25719l0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && totalScrollRange >= 0) {
            mViewBinding.f78301l.setAlpha(1.0f - (totalScrollRange == 0 ? 0.0f : Math.abs(verticalOffset) / totalScrollRange));
            if (this.statusBarFixedHeight == 0 || this.topContentExpandedHeight == 0) {
                this.statusBarFixedHeight = mViewBinding.f78300k.getHeight();
                this.titleBarFixedHeight = mViewBinding.f78310u.getHeight();
                this.topContentExpandedHeight = mViewBinding.f78292c.getHeight();
            }
            int i11 = this.topContentExpandedHeight;
            if (i11 == 0) {
                return;
            }
            int iE = this.statusBarFixedHeight + this.titleBarFixedHeight + RangesKt.m97935e(i11 - Math.abs(verticalOffset), 0);
            View viewFindViewById = mViewBinding.getRoot().findViewById(R$id.v_top_bg_color);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            if (((ViewGroup.MarginLayoutParams) c2308b).height != iE) {
                ((ViewGroup.MarginLayoutParams) c2308b).height = iE + 300;
                viewFindViewById.setLayoutParams(c2308b);
            }
            ViewGroup.LayoutParams layoutParams2 = mViewBinding.f78301l.getLayoutParams();
            Intrinsics.m97800f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
            if (((ViewGroup.MarginLayoutParams) c2308b2).height != iE) {
                ((ViewGroup.MarginLayoutParams) c2308b2).height = iE;
                mViewBinding.f78301l.setLayoutParams(c2308b2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public final void m85406z1() {
        final C25719l0 mViewBinding = getMViewBinding();
        if (mViewBinding == null) {
            return;
        }
        mViewBinding.getRoot().post(new Runnable() { // from class: com.transsion.usercenter.profile.fragment.UserProfileFragment$updateTopMaskHeight$tryUpdate$1
            @Override // java.lang.Runnable
            public void run() {
                int height = mViewBinding.f78300k.getHeight();
                int height2 = mViewBinding.f78310u.getHeight();
                int height3 = mViewBinding.f78292c.getHeight();
                int i11 = height + height2 + height3;
                if (i11 <= 0) {
                    mViewBinding.getRoot().post(this);
                    return;
                }
                this.statusBarFixedHeight = height;
                this.titleBarFixedHeight = height2;
                this.topContentExpandedHeight = height3;
                View viewFindViewById = mViewBinding.getRoot().findViewById(R$id.v_top_bg_color);
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
                ((ViewGroup.MarginLayoutParams) c2308b).height = i11 + 300;
                viewFindViewById.setLayoutParams(c2308b);
                ViewGroup.LayoutParams layoutParams2 = mViewBinding.f78301l.getLayoutParams();
                Intrinsics.m97800f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
                ((ViewGroup.MarginLayoutParams) c2308b2).height = i11;
                mViewBinding.f78301l.setLayoutParams(c2308b2);
                View ivTopBg = mViewBinding.f78300k;
                Intrinsics.m97801g(ivTopBg, "ivTopBg");
                AbstractC26006c.m102052e(ivTopBg);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C25719l0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25719l0 c25719l0M101175c = C25719l0.m101175c(inflater);
        Intrinsics.m97801g(c25719l0M101175c, "inflate(...)");
        return c25719l0M101175c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        RoomJoinAnimationView roomJoinAnimationView;
        RoomJoinAnimationView roomJoinAnimationView2;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        C25719l0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatImageView2 = mViewBinding.f78296g) != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.fragment.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserProfileFragment.m85367c1(this.f65252a, view);
                }
            });
        }
        C25719l0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatImageView = mViewBinding2.f78299j) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.fragment.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserProfileFragment.m85368d1(view);
                }
            });
        }
        C25719l0 mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (roomJoinAnimationView2 = mViewBinding3.f78308s) != null) {
            roomJoinAnimationView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.fragment.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserProfileFragment.m85369e1(this.f65262a, view);
                }
            });
        }
        C25719l0 mViewBinding4 = getMViewBinding();
        if (mViewBinding4 == null || (roomJoinAnimationView = mViewBinding4.f78309t) == null) {
            return;
        }
        roomJoinAnimationView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.fragment.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileFragment.m85366b1(this.f65263a, view);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        AppCompatImageView appCompatImageView;
        OnBackPressedDispatcher onBackPressedDispatcher;
        AppCompatImageView appCompatImageView2;
        AppBarLayout appBarLayout;
        View view;
        ExpandView expandView;
        C25719l0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (expandView = mViewBinding.f78293d) != null) {
            expandView.setExpandListener(new C20672g());
        }
        C25719l0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (view = mViewBinding2.f78300k) != null) {
            AbstractC26006c.m102052e(view);
        }
        C25719l0 mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (appBarLayout = mViewBinding3.f78291b) != null) {
            appBarLayout.addOnOffsetChangedListener(new AppBarLayout.InterfaceC9956g() { // from class: com.transsion.usercenter.profile.fragment.b
                @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC9951b
                public final void onOffsetChanged(AppBarLayout appBarLayout2, int i11) {
                    UserProfileFragment.m85370f1(this.f65254a, appBarLayout2, i11);
                }
            });
        }
        C25719l0 mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (appCompatImageView2 = mViewBinding4.f78296g) != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.fragment.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UserProfileFragment.m85371g1(this.f65256a, view2);
                }
            });
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            InterfaceC3224u viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.m97801g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.m942i(viewLifecycleOwner, new C20673h());
        }
        m85406z1();
        C25719l0 mViewBinding5 = getMViewBinding();
        if (mViewBinding5 == null || (appCompatImageView = mViewBinding5.f78297h) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.fragment.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserProfileFragment.m85372h1(this.f65257a, view2);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        String userId;
        UserInfo userInfoMo90386h;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        UserInfo userInfoMo90386h2;
        HashMap mapM96844g3;
        HashMap mapM96844g4;
        C24655b logViewConfig;
        HashMap mapM96844g5;
        Bundle arguments = getArguments();
        String userId2 = null;
        if (arguments == null || (userId = arguments.getString("userId")) == null) {
            InterfaceC23704a interfaceC23704a = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
            userId = (interfaceC23704a == null || (userInfoMo90386h = interfaceC23704a.mo90386h()) == null) ? null : userInfoMo90386h.getUserId();
        }
        this.targetUserId = userId;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("fromOptId") : null;
        this.fromOptId = string;
        if (string != null && (logViewConfig = getLogViewConfig()) != null && (mapM96844g5 = logViewConfig.m96844g()) != null) {
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null && (mapM96844g4 = logViewConfig2.m96844g()) != null) {
        }
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null && (mapM96844g3 = logViewConfig3.m96844g()) != null) {
        }
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null && (mapM96844g2 = logViewConfig4.m96844g()) != null) {
            String str = this.targetUserId;
            InterfaceC23704a interfaceC23704a2 = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
            if (interfaceC23704a2 != null && (userInfoMo90386h2 = interfaceC23704a2.mo90386h()) != null) {
                userId2 = userInfoMo90386h2.getUserId();
            }
        }
        if (!this.tabTitleResIds.isEmpty()) {
            String string2 = getString(((Number) this.tabTitleResIds.get(0)).intValue());
            Intrinsics.m97801g(string2, "getString(...)");
            C24655b logViewConfig5 = getLogViewConfig();
            if (logViewConfig5 != null && (mapM96844g = logViewConfig5.m96844g()) != null) {
            }
        }
        m85387p1();
        m85363X0().m85574p(this.targetUserId);
        m85375j1();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("Userpage", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        UserProfileViewModel userProfileViewModelM85363X0 = m85363X0();
        String str = this.targetUserId;
        if (str == null) {
            str = "";
        }
        userProfileViewModelM85363X0.m85574p(str);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m85408t1(PublishResult event) {
        C25719l0 mViewBinding;
        AppCompatImageView appCompatImageView;
        this.publishEventBean = event;
        Integer numValueOf = event != null ? Integer.valueOf(event.getState()) : null;
        if (numValueOf == null || numValueOf.intValue() != 0 || (mViewBinding = getMViewBinding()) == null || (appCompatImageView = mViewBinding.f78297h) == null) {
            return;
        }
        appCompatImageView.postDelayed(new Runnable() { // from class: com.transsion.usercenter.profile.fragment.f
            @Override // java.lang.Runnable
            public final void run() {
                UserProfileFragment.m85396u1(this.f65261a);
            }
        }, 1500L);
    }
}
