package com.transsion.usercenter.profile;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.AbstractC2397b;
import androidx.core.text.AbstractC2468u;
import androidx.core.text.C2448a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ck.C5127x;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.NoTouchToolBar;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.TnTextView;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.C14486e;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.util.AbstractC14558d;
import com.transsion.baseui.util.C14557c;
import com.transsion.p285ad.scene.C14050d;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$mipmap;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.edit.C20470u;
import com.transsion.usercenter.edit.ProfileEditCenterActivity;
import com.transsion.usercenter.message.UserMessageActivity;
import com.transsion.usercenter.profile.adapter.C20645b;
import com.transsion.usercenter.profile.bean.BlockInfo;
import com.transsion.usercenter.profile.bean.CoverUrl;
import com.transsion.usercenter.profile.bean.EntranceInfo;
import com.transsion.usercenter.profile.bean.Group;
import com.transsion.usercenter.profile.bean.ProfileEntranceInfo;
import com.transsion.usercenter.profile.bean.ProfileInfo;
import com.transsion.usercenter.profile.dialog.BlockDialog;
import com.transsion.usercenter.profile.report.ReportDialog;
import com.transsion.usercenter.profile.see.ProfileSeeActivity;
import com.transsion.usercenter.setting.SettingActivity;
import com.transsion.usercenter.widget.MyRoomView;
import com.transsion.usercenterapi.ReportType;
import com.transsion.usercenterapi.UpdateResultEvent;
import com.transsion.version.update.UpdateManager;
import com.transsion.web.api.WebPageIdentity;
import com.transsion.wrapperad.view.NativeSlideshowView;
import com.transsnet.downloader.adapter.InterfaceC21324u0;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26004a;
import ng.AbstractC26006c;
import p038bk.C4836b;
import p352dn.InterfaceC22998b;
import p381ek.DialogC23167h;
import p393f.C23284j;
import p441gz.InterfaceC23704a;
import p441gz.InterfaceC23705b;
import p462hj.C23860f;
import p550kj.C24655b;
import p550kj.C24662i;
import p585lw.C25715j0;
import p585lw.C25731r0;
import p886ww.C28461c;
import pg.C26866a;
import sh.C27620g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 §\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001[B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010#\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\u0007H\u0002¢\u0006\u0004\b*\u0010\u0006J\u001b\u0010,\u001a\u00020\u0007*\u00020+2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001dH\u0002¢\u0006\u0004\b.\u0010\u001fJ\u0019\u00101\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u0010\u0006J\u0017\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u000204H\u0002¢\u0006\u0004\b9\u00107J\u000f\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b:\u0010\u0006J\u0017\u0010=\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010A\u001a\u00020\u00072\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020+2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bD\u0010EJ!\u0010F\u001a\u00020\u00072\u0006\u0010C\u001a\u00020+2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bF\u0010EJ\u000f\u0010G\u001a\u00020\u0007H\u0016¢\u0006\u0004\bG\u0010\u0006J\u0017\u0010I\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u001dH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0007H\u0016¢\u0006\u0004\bK\u0010\u0006J\u000f\u0010L\u001a\u00020\u0007H\u0016¢\u0006\u0004\bL\u0010\u0006J\u000f\u0010M\u001a\u00020\u0007H\u0016¢\u0006\u0004\bM\u0010\u0006J\u000f\u0010N\u001a\u00020\u0007H\u0016¢\u0006\u0004\bN\u0010\u0006J\u0017\u0010O\u001a\u00020\u00072\u0006\u0010C\u001a\u00020+H\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0007H\u0016¢\u0006\u0004\bQ\u0010\u0006J\u0017\u0010S\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\fH\u0016¢\u0006\u0004\bS\u0010\u000fJ\u0017\u0010T\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\fH\u0016¢\u0006\u0004\bT\u0010\u000fJ\u000f\u0010U\u001a\u00020\u0007H\u0016¢\u0006\u0004\bU\u0010\u0006J\u000f\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XJ\u0015\u0010Z\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u001d¢\u0006\u0004\bZ\u0010JR\u0018\u0010]\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001b\u0010f\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u001d\u0010o\u001a\u0004\u0018\u00010k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010c\u001a\u0004\bm\u0010nR\u001e\u0010t\u001a\n\u0012\u0004\u0012\u00020q\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001e\u0010v\u001a\n\u0012\u0004\u0012\u00020q\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010sR\u0016\u0010y\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010}\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010\u007f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010xR \u0010\u0082\u0001\u001a\u0004\u0018\u00010k8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010c\u001a\u0005\b\u0081\u0001\u0010nR\u0019\u0010\u0085\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0084\u0001R \u0010\u008c\u0001\u001a\u00030\u0088\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0001\u0010c\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001f\u0010\u0090\u0001\u001a\u00020\u00148\u0006X\u0086D¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0084\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001f\u0010\u0093\u0001\u001a\u00020\u00148\u0006X\u0086D¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0084\u0001\u001a\u0006\b\u0092\u0001\u0010\u008f\u0001R)\u0010\u0098\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0084\u0001\u001a\u0006\b\u0095\u0001\u0010\u008f\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001a\u0010\u009c\u0001\u001a\u00030\u0099\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R(\u0010¦\u0001\u001a\u00020z8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b¡\u0001\u0010|\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001¨\u0006¨\u0001"}, m97100d2 = {"Lcom/transsion/usercenter/profile/ProfileFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Llw/j0;", "Landroid/view/View$OnClickListener;", "Lgz/b;", "<init>", "()V", "", "g1", "G0", "D0", "O0", "Lcom/transsnet/loginapi/bean/UserInfo;", "userInfo", "m1", "(Lcom/transsnet/loginapi/bean/UserInfo;)V", "Lcom/transsion/usercenter/profile/bean/ProfileInfo;", "profileInfo", "k1", "(Lcom/transsion/usercenter/profile/bean/ProfileInfo;)V", "", RewardPlus.AMOUNT, "Lcom/transsion/usercenter/profile/bean/CoverUrl;", "url1", "url2", "url3", "url4", "h1", "(ILcom/transsion/usercenter/profile/bean/CoverUrl;Lcom/transsion/usercenter/profile/bean/CoverUrl;Lcom/transsion/usercenter/profile/bean/CoverUrl;Lcom/transsion/usercenter/profile/bean/CoverUrl;)V", "", "X0", "()Z", "W0", "", "alpha", "j1", "(Llw/j0;F)V", TtmlNode.ATTR_TTS_COLOR, "fraction", "z0", "(IF)I", "d1", ToolBar.REFRESH, "Landroid/view/View;", "A0", "(Landroid/view/View;F)V", "checkLogin", "Lcom/transsion/usercenter/profile/bean/EntranceInfo;", "entranceInfo", "F0", "(Lcom/transsion/usercenter/profile/bean/EntranceInfo;)V", "C0", "", "moduleName", "e1", "(Ljava/lang/String;)V", "tabName", "f1", "c1", "Landroid/view/LayoutInflater;", "inflater", "I0", "(Landroid/view/LayoutInflater;)Llw/j0;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "initData", "onResume", "hidden", "onHiddenChanged", "(Z)V", "logPause", "onPause", "logResume", "lazyLoadData", "onClick", "(Landroid/view/View;)V", "onDestroy", "user", "onUpdateUserInfo", "onLogin", "onLogout", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "isExpand", "B0", "a", "Lcom/transsnet/loginapi/bean/UserInfo;", "mUserInfo", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/usercenter/profile/bean/ProfileInfo;", "mProfileInfo", "Lcom/transsion/usercenter/profile/ProfileViewModel;", "c", "Lkotlin/Lazy;", "H0", "()Lcom/transsion/usercenter/profile/ProfileViewModel;", "mProfileViewModel", "Lcom/transsion/usercenter/profile/f;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/usercenter/profile/f;", "mNoticeMessageViewModel", "Lgz/a;", "e", "getLoginApi", "()Lgz/a;", "loginApi", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "f", "Landroidx/activity/result/b;", "loginLaunch", "g", "seeListLaunch", "h", "Z", "isNeedShowLoginActivity", "", "i", "J", "recordRefreshingTime", "j", "isSelf", CampaignEx.JSON_KEY_AD_K, "getMLoginApi", "mLoginApi", "l", "I", "mTabSelectIndex", "m", "refreshTime", "Landroid/os/Handler;", "n", "getMHandler", "()Landroid/os/Handler;", "mHandler", "o", "getMaxStep", "()I", "maxStep", TtmlNode.TAG_P, "getStep", "step", CampaignEx.JSON_KEY_AD_Q, "getDefault", "setDefault", "(I)V", "default", "Lek/h;", CampaignEx.JSON_KEY_AD_R, "Lek/h;", "mLoadingDialog", "Landroid/view/animation/DecelerateInterpolator;", "s", "Landroid/view/animation/DecelerateInterpolator;", "appbarChildAlphaDecelerateInterpolator", "t", "getResumeTimeStamp", "()J", "setResumeTimeStamp", "(J)V", "resumeTimeStamp", TmcStartParams.KEY_URL_SHORT, "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ProfileFragment extends BaseFragment<C25715j0> implements View.OnClickListener, InterfaceC23705b {

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private UserInfo mUserInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ProfileInfo mProfileInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy mProfileViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C20664f mNoticeMessageViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy loginApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private AbstractC0249b loginLaunch;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private AbstractC0249b seeListLaunch;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isNeedShowLoginActivity;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long recordRefreshingTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isSelf;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Lazy mLoginApi;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int mTabSelectIndex;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int refreshTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final Lazy mHandler;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int maxStep;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int step;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int default;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private DialogC23167h mLoadingDialog;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final DecelerateInterpolator appbarChildAlphaDecelerateInterpolator;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private long resumeTimeStamp;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.ProfileFragment$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ProfileFragment m85209a(String str, UserInfo userInfo) {
            ProfileFragment profileFragment = new ProfileFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("userInfo", userInfo);
            bundle.putString("userId", str);
            profileFragment.setArguments(bundle);
            return profileFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.ProfileFragment$b */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class C20630b implements TabLayout.OnTabSelectedListener {
        C20630b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            View customView = tab != null ? tab.getCustomView() : null;
            Intrinsics.m97800f(customView, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) customView;
            Context context = textView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            textView.setTypeface(AbstractC26004a.m102044a(context));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            TextView textView = (TextView) (tab != null ? tab.getCustomView() : null);
            if (textView == null) {
                return;
            }
            Context context = textView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            textView.setTypeface(AbstractC26004a.m102047d(context));
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.ProfileFragment$c */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class C20631c extends ViewPager2.OnPageChangeCallback {
        C20631c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            super.onPageSelected(i11);
            ProfileFragment.this.mTabSelectIndex = i11;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.ProfileFragment$d */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class C20632d implements InterfaceC21324u0.b {
        C20632d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final Unit m85211d(ProfileFragment profileFragment) {
            profileFragment.m85173d1();
            return Unit.f75682a;
        }

        @Override // com.transsnet.downloader.adapter.InterfaceC21324u0.b
        /* JADX INFO: renamed from: a */
        public void mo85212a(int i11, int i12) {
        }

        @Override // com.transsnet.downloader.adapter.InterfaceC21324u0.b
        /* JADX INFO: renamed from: b */
        public void mo85213b(int i11, int i12, int i13, boolean z11) {
            String userId;
            UserInfo userInfo;
            if (i13 == 1) {
                BlockDialog.Companion c20654a = BlockDialog.INSTANCE;
                String value = ReportType.USER.getValue();
                ProfileInfo profileInfo = ProfileFragment.this.mProfileInfo;
                BlockDialog blockDialogM85321a = c20654a.m85321a(value, z11, profileInfo != null ? profileInfo.getUserInfo() : null);
                Context contextRequireContext = ProfileFragment.this.requireContext();
                final ProfileFragment profileFragment = ProfileFragment.this;
                blockDialogM85321a.m85320A0(contextRequireContext, "block", new Function0() { // from class: com.transsion.usercenter.profile.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileFragment.C20632d.m85211d(profileFragment);
                    }
                });
                return;
            }
            ReportDialog.Companion c20727a = ReportDialog.INSTANCE;
            String value2 = ReportType.USER.getValue();
            ProfileInfo profileInfo2 = ProfileFragment.this.mProfileInfo;
            if (profileInfo2 == null || (userInfo = profileInfo2.getUserInfo()) == null || (userId = userInfo.getUserId()) == null) {
                userId = "";
            }
            c20727a.m85461a(value2, userId).m65436k0(ProfileFragment.this.requireContext(), "report");
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.ProfileFragment$e */
    /* JADX INFO: loaded from: classes7.dex */
    static final class C20633e implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65139a;

        C20633e(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65139a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65139a;
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
            this.f65139a.invoke(obj);
        }
    }

    public ProfileFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.usercenter.profile.ProfileFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.mProfileViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(ProfileViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.usercenter.profile.ProfileFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.usercenter.profile.ProfileFragment$special$$inlined$viewModels$default$3
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
        this.loginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileFragment.m85165Z0();
            }
        });
        this.mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileFragment.mLoginApi_delegate$lambda$1();
            }
        });
        this.refreshTime = 15;
        this.mHandler = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileFragment.m85167a1();
            }
        });
        this.maxStep = 128;
        this.step = 2;
        this.default = 1;
        this.appbarChildAlphaDecelerateInterpolator = new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: A0 */
    private final void m85142A0(View view, float f11) {
        view.setAlpha(f11);
    }

    /* JADX INFO: renamed from: C0 */
    private final void m85143C0() {
        if (isAdded()) {
            C27620g c27620g = C27620g.f84744a;
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            if (c27620g.m107450a(contextRequireContext)) {
                refresh();
                return;
            }
            DialogC23167h dialogC23167h = this.mLoadingDialog;
            if (dialogC23167h == null) {
                Intrinsics.m97819y("mLoadingDialog");
                dialogC23167h = null;
            }
            dialogC23167h.dismiss();
            C13806h.f49015a.m62324k(R$string.no_network);
        }
    }

    /* JADX INFO: renamed from: D0 */
    private final void m85144D0() {
        LinearLayoutCompat linearLayoutCompat;
        View view;
        View view2;
        TabLayout tabLayout;
        View view3;
        LinearLayoutCompat linearLayoutCompat2;
        LinearLayoutCompat linearLayoutCompat3;
        TnTextView tnTextView;
        LinearLayoutCompat linearLayoutCompat4;
        View view4;
        TnTextView tnTextView2;
        View view5;
        TabLayout tabLayout2;
        View view6;
        LinearLayoutCompat linearLayoutCompat5;
        LinearLayoutCompat linearLayoutCompat6;
        BlockInfo blockInfo;
        BlockInfo blockInfo2;
        ProfileInfo profileInfo = this.mProfileInfo;
        boolean block = (profileInfo == null || (blockInfo2 = profileInfo.getBlockInfo()) == null) ? false : blockInfo2.getBlock();
        ProfileInfo profileInfo2 = this.mProfileInfo;
        boolean blocked = (profileInfo2 == null || (blockInfo = profileInfo2.getBlockInfo()) == null) ? false : blockInfo.getBlocked();
        if (getIsSelf() || !(block || blocked)) {
            C25715j0 mViewBinding = getMViewBinding();
            if (mViewBinding != null && (linearLayoutCompat3 = mViewBinding.f78213B) != null) {
                linearLayoutCompat3.setVisibility(0);
            }
            C25715j0 mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (linearLayoutCompat2 = mViewBinding2.f78259w) != null) {
                linearLayoutCompat2.setVisibility(0);
            }
            C25715j0 mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (view3 = mViewBinding3.f78229R) != null) {
                view3.setVisibility(0);
            }
            C25715j0 mViewBinding4 = getMViewBinding();
            if (mViewBinding4 != null && (tabLayout = mViewBinding4.f78216E) != null) {
                tabLayout.setVisibility(0);
            }
            C25715j0 mViewBinding5 = getMViewBinding();
            if (mViewBinding5 != null && (view2 = mViewBinding5.f78241e) != null) {
                view2.setVisibility(0);
            }
            C25715j0 mViewBinding6 = getMViewBinding();
            if (mViewBinding6 != null && (view = mViewBinding6.f78236Y) != null) {
                view.setVisibility(8);
            }
            C25715j0 mViewBinding7 = getMViewBinding();
            if (mViewBinding7 == null || (linearLayoutCompat = mViewBinding7.f78257u) == null) {
                return;
            }
            linearLayoutCompat.setVisibility(8);
            return;
        }
        C25715j0 mViewBinding8 = getMViewBinding();
        if (mViewBinding8 != null && (linearLayoutCompat6 = mViewBinding8.f78213B) != null) {
            linearLayoutCompat6.setVisibility(4);
        }
        C25715j0 mViewBinding9 = getMViewBinding();
        if (mViewBinding9 != null && (linearLayoutCompat5 = mViewBinding9.f78259w) != null) {
            linearLayoutCompat5.setVisibility(4);
        }
        C25715j0 mViewBinding10 = getMViewBinding();
        if (mViewBinding10 != null && (view6 = mViewBinding10.f78229R) != null) {
            view6.setVisibility(4);
        }
        C25715j0 mViewBinding11 = getMViewBinding();
        if (mViewBinding11 != null && (tabLayout2 = mViewBinding11.f78216E) != null) {
            tabLayout2.setVisibility(4);
        }
        C25715j0 mViewBinding12 = getMViewBinding();
        if (mViewBinding12 != null && (view5 = mViewBinding12.f78241e) != null) {
            view5.setVisibility(4);
        }
        if (blocked) {
            C25715j0 mViewBinding13 = getMViewBinding();
            if (mViewBinding13 != null && (tnTextView2 = mViewBinding13.f78219H) != null) {
                tnTextView2.setTextById(R$string.str_block_been);
            }
        } else {
            C25715j0 mViewBinding14 = getMViewBinding();
            if (mViewBinding14 != null && (tnTextView = mViewBinding14.f78219H) != null) {
                tnTextView.setTextAction(new Function0() { // from class: com.transsion.usercenter.profile.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileFragment.m85145E0(this.f65361a);
                    }
                });
            }
        }
        C25715j0 mViewBinding15 = getMViewBinding();
        if (mViewBinding15 != null && (view4 = mViewBinding15.f78236Y) != null) {
            view4.setVisibility(0);
        }
        C25715j0 mViewBinding16 = getMViewBinding();
        if (mViewBinding16 == null || (linearLayoutCompat4 = mViewBinding16.f78257u) == null) {
            return;
        }
        linearLayoutCompat4.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final CharSequence m85145E0(ProfileFragment profileFragment) {
        UserInfo userInfo;
        String string = profileFragment.getString(R$string.str_block_blocked);
        ProfileInfo profileInfo = profileFragment.mProfileInfo;
        return string + " " + ((profileInfo == null || (userInfo = profileInfo.getUserInfo()) == null) ? null : userInfo.getNickname());
    }

    /* JADX INFO: renamed from: F0 */
    private final void m85146F0(EntranceInfo entranceInfo) {
        C25731r0 c25731r0;
        String jumpUrl;
        String title;
        C25715j0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (c25731r0 = mViewBinding.f78242f) == null) {
            return;
        }
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        boolean zMo69843B = interfaceC22998b != null ? interfaceC22998b.mo69843B() : false;
        if (!getIsSelf() || entranceInfo == null || (jumpUrl = entranceInfo.getJumpUrl()) == null || jumpUrl.length() == 0 || (title = entranceInfo.getTitle()) == null || title.length() == 0 || !zMo69843B) {
            ConstraintLayout root = c25731r0.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            AbstractC26006c.m102054g(root);
        } else {
            ConstraintLayout root2 = c25731r0.getRoot();
            Intrinsics.m97801g(root2, "getRoot(...)");
            AbstractC26006c.m102058k(root2);
            c25731r0.f78369d.setText(entranceInfo.getTitle());
            c25731r0.f78367b.setText(entranceInfo.getDescription());
        }
    }

    /* JADX INFO: renamed from: G0 */
    private final void m85147G0() {
        ConstraintLayout constraintLayout;
        NoTouchToolBar noTouchToolBar;
        C25715j0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (noTouchToolBar = mViewBinding.f78217F) != null) {
            AbstractC26006c.m102052e(noTouchToolBar);
        }
        C25715j0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (constraintLayout = mViewBinding2.f78218G) != null) {
            AbstractC26006c.m102052e(constraintLayout);
        }
        FragmentActivity activity = getActivity();
        ProfileActivity profileActivity = activity instanceof ProfileActivity ? (ProfileActivity) activity : null;
        if (profileActivity != null) {
            profileActivity.m65397t0();
        }
    }

    /* JADX INFO: renamed from: H0 */
    private final ProfileViewModel m85148H0() {
        return (ProfileViewModel) this.mProfileViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final Unit m85149J0(ProfileFragment profileFragment, ProfileInfo profileInfo) {
        if (profileInfo != null) {
            profileFragment.m85187k1(profileInfo);
        }
        DialogC23167h dialogC23167h = profileFragment.mLoadingDialog;
        if (dialogC23167h == null) {
            Intrinsics.m97819y("mLoadingDialog");
            dialogC23167h = null;
        }
        dialogC23167h.dismiss();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final Unit m85150K0(final ProfileFragment profileFragment, Pair pair) {
        MyRoomView myRoomView;
        List list;
        Unit unit = null;
        ArrayList arrayListH = CollectionsKt.m97502h(null, null, null);
        profileFragment.getClass();
        if (pair != null && (list = (List) pair.getSecond()) != null) {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                DownloadBean downloadBean = (DownloadBean) obj;
                arrayListH.set(i11, new MyRoomView.C20871b(downloadBean.getCover(), downloadBean.getType()));
                i11 = i12;
            }
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C25715j0 mViewBinding = profileFragment.getMViewBinding();
            if (mViewBinding != null && (myRoomView = mViewBinding.f78261y) != null) {
                myRoomView.showDownloadsData(2, Integer.valueOf(pair != null ? ((Number) pair.getFirst()).intValue() : 0), (MyRoomView.C20871b) arrayListH.get(0), (MyRoomView.C20871b) arrayListH.get(1), (MyRoomView.C20871b) arrayListH.get(2), new Function0() { // from class: com.transsion.usercenter.profile.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileFragment.m85151L0(this.f65296a);
                    }
                });
                unit = Unit.f75682a;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final Unit m85151L0(ProfileFragment profileFragment) {
        profileFragment.m85175e1("downloads");
        Navigator.m61845x(TheRouter.m61773c("/download/panel_activity"), profileFragment.requireContext(), null, 2, null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final Unit m85152M0(ProfileFragment profileFragment, ProfileEntranceInfo profileEntranceInfo) {
        profileFragment.m85146F0(profileEntranceInfo != null ? profileEntranceInfo.getEntranceInfo() : null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final Unit m85153N0(ProfileFragment profileFragment, Integer num) {
        View view;
        View view2;
        C25715j0 mViewBinding = profileFragment.getMViewBinding();
        if (mViewBinding != null && (view2 = mViewBinding.f78234W) != null) {
            view2.setVisibility(num.intValue() > 0 ? 0 : 8);
        }
        C25715j0 mViewBinding2 = profileFragment.getMViewBinding();
        if (mViewBinding2 != null && (view = mViewBinding2.f78235X) != null) {
            view.setVisibility(num.intValue() > 0 ? 0 : 8);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: O0 */
    private final void m85154O0() {
        C25715j0 mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(mViewBinding.f78216E, mViewBinding.f78230S, new TabLayoutMediator.TabConfigurationStrategy() { // from class: com.transsion.usercenter.profile.m
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i11) {
                    ProfileFragment.m85155P0(this.f65295a, tab, i11);
                }
            });
            mViewBinding.f78216E.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20630b());
            tabLayoutMediator.attach();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m85155P0(final ProfileFragment profileFragment, final TabLayout.Tab tab, int i11) {
        Intrinsics.m97802h(tab, "tab");
        Context contextRequireContext = profileFragment.requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        TnTextView tnTextView = new TnTextView(contextRequireContext);
        Integer[] numArr = {Integer.valueOf(R$string.profile_post), Integer.valueOf(R$string.profile_like)};
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{AbstractC2397b.getColor(profileFragment.requireContext(), R$color.text_01), AbstractC2397b.getColor(profileFragment.requireContext(), R$color.text_02)});
        tnTextView.setTextById(numArr[i11].intValue());
        tnTextView.setGravity(17);
        tnTextView.setTextSize(16.0f);
        tnTextView.setTextColor(colorStateList);
        tab.setCustomView(tnTextView);
        tab.view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.profile.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileFragment.m85156Q0(tab, profileFragment, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final void m85156Q0(TabLayout.Tab tab, ProfileFragment profileFragment, View view) {
        ViewPager2 viewPager2;
        tab.select();
        C25715j0 mViewBinding = profileFragment.getMViewBinding();
        if (mViewBinding == null || (viewPager2 = mViewBinding.f78230S) == null || viewPager2.getCurrentItem() != 0) {
            profileFragment.m85177f1("like");
        } else {
            profileFragment.m85177f1("post");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final Unit m85157R0(C25715j0 c25715j0, ProfileFragment profileFragment, UpdateResultEvent it) {
        Intrinsics.m97802h(it, "it");
        if (it.getHasUpdate()) {
            c25715j0.f78215D.setVisibility(profileFragment.isSelf ? 0 : 8);
            c25715j0.f78214C.setVisibility(profileFragment.isSelf ? 0 : 8);
            c25715j0.f78255s.setVisibility(profileFragment.isSelf ? 0 : 8);
            c25715j0.f78256t.setVisibility(profileFragment.isSelf ? 0 : 8);
            c25715j0.f78226O.setVisibility(profileFragment.isSelf ? 0 : 8);
        } else {
            View settingRedTips = c25715j0.f78215D;
            Intrinsics.m97801g(settingRedTips, "settingRedTips");
            AbstractC26006c.m102054g(settingRedTips);
            View settingBlankRedTips = c25715j0.f78214C;
            Intrinsics.m97801g(settingBlankRedTips, "settingBlankRedTips");
            AbstractC26006c.m102054g(settingBlankRedTips);
            AppCompatImageView ivUpdate = c25715j0.f78255s;
            Intrinsics.m97801g(ivUpdate, "ivUpdate");
            AbstractC26006c.m102054g(ivUpdate);
            AppCompatImageView updateRedTips = c25715j0.f78227P;
            Intrinsics.m97801g(updateRedTips, "updateRedTips");
            AbstractC26006c.m102054g(updateRedTips);
            AppCompatImageView ivUpdateBlank = c25715j0.f78256t;
            Intrinsics.m97801g(ivUpdateBlank, "ivUpdateBlank");
            AbstractC26006c.m102054g(ivUpdateBlank);
            View updateBlankRedTips = c25715j0.f78226O;
            Intrinsics.m97801g(updateBlankRedTips, "updateBlankRedTips");
            AbstractC26006c.m102054g(updateBlankRedTips);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final void m85158S0(ProfileFragment profileFragment, C25715j0 c25715j0, AppBarLayout appBarLayout, int i11) {
        profileFragment.m85185j1(c25715j0, Math.abs(i11 * 1.0f) / (appBarLayout != null ? appBarLayout.getTotalScrollRange() : i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final void m85159T0(ProfileFragment profileFragment, float f11, boolean z11) {
        if (!z11 || f11 <= 0.0f || f11 >= 0.1f) {
            return;
        }
        DialogC23167h dialogC23167h = profileFragment.mLoadingDialog;
        if (dialogC23167h == null) {
            Intrinsics.m97819y("mLoadingDialog");
            dialogC23167h = null;
        }
        if (dialogC23167h.isShowing() || System.currentTimeMillis() - profileFragment.recordRefreshingTime <= 500) {
            return;
        }
        profileFragment.recordRefreshingTime = System.currentTimeMillis();
        profileFragment.m85143C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m85160U0(ActivityResult it) {
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() == -1) {
            C26866a.a.m104898f(C26866a.f81698a, "loginStatus", "登录成功", false, 4, null);
        } else {
            C26866a.a.m104898f(C26866a.f81698a, "loginStatus", "登录失败或者取消", false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m85161V0(ProfileFragment profileFragment, ActivityResult it) {
        Intent data;
        ProfileInfo profileInfo;
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() != -1 || (data = it.getData()) == null || (profileInfo = profileFragment.mProfileInfo) == null) {
            return;
        }
        profileInfo.getMySubject().setWantToSeeCount(data.getIntExtra("want2SeeCount", profileInfo.getMySubject().getWantToSeeCount()));
    }

    /* JADX INFO: renamed from: W0, reason: from getter */
    private final boolean getIsSelf() {
        return this.isSelf;
    }

    /* JADX INFO: renamed from: X0 */
    private final boolean m85163X0() {
        UserInfo userInfoMo90386h;
        InterfaceC23704a mLoginApi = getMLoginApi();
        if (mLoginApi != null && (userInfoMo90386h = mLoginApi.mo90386h()) != null && userInfoMo90386h.getUserType() == 0 && getIsSelf()) {
            return true;
        }
        ProfileInfo profileInfo = this.mProfileInfo;
        return profileInfo != null && profileInfo.isVisitor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final void m85164Y0(C25715j0 c25715j0) {
        c25715j0.f78230S.setCurrentItem(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final InterfaceC23704a m85165Z0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final Handler m85167a1() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final Unit m85169b1(ProfileFragment profileFragment) {
        EntranceInfo entranceInfo;
        ProfileEntranceInfo profileEntranceInfo = (ProfileEntranceInfo) profileFragment.m85148H0().m85265l().m14847f();
        if (profileEntranceInfo != null && (entranceInfo = profileEntranceInfo.getEntranceInfo()) != null) {
            String jumpUrl = entranceInfo.getJumpUrl();
            int jumpType = entranceInfo.getJumpType();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("jumpUrl :");
            sb2.append(jumpUrl);
            sb2.append(", jumpType:");
            sb2.append(jumpType);
            if (jumpUrl == null || jumpUrl.length() == 0) {
                return Unit.f75682a;
            }
            if (entranceInfo.getJumpType() == 2) {
                Navigator.m61845x(TheRouter.m61773c(WebPageIdentity.WEB_VIEW).m61857K("url", jumpUrl), profileFragment.requireContext(), null, 2, null);
            } else {
                C4836b c4836b = C4836b.f17101a;
                Context contextRequireContext = profileFragment.requireContext();
                Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
                C4836b.m23266d(c4836b, contextRequireContext, jumpUrl, null, 4, null);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: c1 */
    private final void m85171c1() {
        Navigator.m61845x(TheRouter.m61773c("/profile/qr_code"), requireContext(), null, 2, null);
    }

    private final boolean checkLogin() {
        InterfaceC23704a loginApi = getLoginApi();
        if (loginApi == null || loginApi.mo90379a()) {
            return true;
        }
        AbstractC0249b abstractC0249b = this.loginLaunch;
        if (abstractC0249b == null) {
            this.isNeedShowLoginActivity = true;
        }
        if (abstractC0249b == null) {
            return false;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        abstractC0249b.m999a(loginApi.mo90394p(contextRequireContext));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public final void m85173d1() {
        if (isHidden()) {
            return;
        }
        ProfileViewModel profileViewModelM85148H0 = m85148H0();
        UserInfo userInfo = this.mUserInfo;
        profileViewModelM85148H0.m85264k(userInfo != null ? userInfo.getUserId() : null);
        if (this.isSelf) {
            m85148H0().m85263j();
            m85148H0().m85262i();
        }
    }

    /* JADX INFO: renamed from: e1 */
    private final void m85175e1(String moduleName) {
        String userId;
        String strM96843f;
        HashMap map = new HashMap();
        UserInfo userInfo = this.mUserInfo;
        String str = "";
        if (userInfo == null || (userId = userInfo.getUserId()) == null) {
            userId = "";
        }
        map.put("user_id", userId);
        map.put("user_status", this.isSelf ? "me" : "others");
        map.put("module_name", moduleName);
        C24662i c24662i = C24662i.f75350a;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (strM96843f = logViewConfig.m96843f()) != null) {
            str = strM96843f;
        }
        c24662i.m96881p(str, map);
    }

    /* JADX INFO: renamed from: f1 */
    private final void m85177f1(String tabName) {
        String strM96843f;
        HashMap map = new HashMap();
        map.put("page_tab_name", tabName);
        C24662i c24662i = C24662i.f75350a;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (strM96843f = logViewConfig.m96843f()) == null) {
            strM96843f = "";
        }
        c24662i.m96881p(strM96843f, map);
    }

    /* JADX INFO: renamed from: g1 */
    private final void m85179g1() {
        MyRoomView myRoomView;
        MyRoomView myRoomView2;
        View view;
        View view2;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        TnTextView tnTextView;
        TnTextView tnTextView2;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        ShapeableImageView shapeableImageView;
        TnTextView tnTextView3;
        TnTextView tnTextView4;
        AppCompatTextView appCompatTextView3;
        ShapeableImageView shapeableImageView2;
        C25715j0 mViewBinding = getMViewBinding();
        ViewGroup.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = (mViewBinding == null || (shapeableImageView2 = mViewBinding.f78243g) == null) ? null : shapeableImageView2.getLayoutParams();
        Intrinsics.m97800f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams2;
        C25715j0 mViewBinding2 = getMViewBinding();
        ViewGroup.LayoutParams layoutParams3 = (mViewBinding2 == null || (appCompatTextView3 = mViewBinding2.f78225N) == null) ? null : appCompatTextView3.getLayoutParams();
        Intrinsics.m97800f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams3;
        C25715j0 mViewBinding3 = getMViewBinding();
        ViewGroup.LayoutParams layoutParams4 = (mViewBinding3 == null || (tnTextView4 = mViewBinding3.f78221J) == null) ? null : tnTextView4.getLayoutParams();
        Intrinsics.m97800f(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b3 = (ConstraintLayout.C2308b) layoutParams4;
        C25715j0 mViewBinding4 = getMViewBinding();
        ViewGroup.LayoutParams layoutParams5 = (mViewBinding4 == null || (tnTextView3 = mViewBinding4.f78224M) == null) ? null : tnTextView3.getLayoutParams();
        Intrinsics.m97800f(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b4 = (ConstraintLayout.C2308b) layoutParams5;
        c2308b.f7994v = 0;
        c2308b.setMarginStart(0);
        ((ViewGroup.MarginLayoutParams) c2308b).topMargin = AbstractC23384a.m92908b(32);
        C25715j0 mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (shapeableImageView = mViewBinding5.f78243g) != null) {
            shapeableImageView.setLayoutParams(c2308b);
        }
        ((ViewGroup.MarginLayoutParams) c2308b2).topMargin = AbstractC23384a.m92908b(8);
        c2308b2.setMarginStart(0);
        c2308b2.setMarginEnd(0);
        ((ViewGroup.MarginLayoutParams) c2308b2).width = -2;
        c2308b2.f7968i = -1;
        c2308b2.f7972k = -1;
        c2308b2.f7988s = -1;
        c2308b2.f7994v = -1;
        c2308b2.f7940O = -1;
        c2308b2.f7939N = 2;
        int i11 = R$id.iv_avatar;
        c2308b2.f7970j = i11;
        c2308b2.f7990t = i11;
        c2308b2.f7992u = R$id.tv_gender;
        C25715j0 mViewBinding6 = getMViewBinding();
        if (mViewBinding6 != null && (appCompatTextView2 = mViewBinding6.f78225N) != null) {
            appCompatTextView2.setLayoutParams(c2308b2);
        }
        C25715j0 mViewBinding7 = getMViewBinding();
        if (mViewBinding7 != null && (appCompatTextView = mViewBinding7.f78225N) != null) {
            appCompatTextView.setMaxWidth(AbstractC23384a.m92908b(200));
        }
        ((ViewGroup.MarginLayoutParams) c2308b3).topMargin = 0;
        c2308b3.setMarginStart(AbstractC23384a.m92908b(4));
        c2308b3.f7990t = -1;
        c2308b3.f7970j = -1;
        int i12 = R$id.tv_user_name;
        c2308b3.f7988s = i12;
        c2308b3.f7968i = i12;
        c2308b3.f7994v = R$id.iv_avatar;
        c2308b3.f7974l = i12;
        C25715j0 mViewBinding8 = getMViewBinding();
        if (mViewBinding8 != null && (tnTextView2 = mViewBinding8.f78221J) != null) {
            tnTextView2.setLayoutParams(c2308b3);
        }
        c2308b4.setMarginStart(0);
        c2308b4.f7988s = -1;
        c2308b4.f7974l = -1;
        int i13 = R$id.iv_avatar;
        c2308b4.f7990t = i13;
        c2308b4.f7994v = i13;
        c2308b4.f7970j = R$id.tv_user_name;
        C25715j0 mViewBinding9 = getMViewBinding();
        if (mViewBinding9 != null && (tnTextView = mViewBinding9.f78224M) != null) {
            tnTextView.setLayoutParams(c2308b4);
        }
        C25715j0 mViewBinding10 = getMViewBinding();
        ViewGroup.LayoutParams layoutParams6 = (mViewBinding10 == null || (linearLayoutCompat2 = mViewBinding10.f78259w) == null) ? null : linearLayoutCompat2.getLayoutParams();
        Intrinsics.m97800f(layoutParams6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b5 = (ConstraintLayout.C2308b) layoutParams6;
        c2308b5.f7998x = AbstractC23384a.m92908b(71);
        C25715j0 mViewBinding11 = getMViewBinding();
        if (mViewBinding11 != null && (linearLayoutCompat = mViewBinding11.f78259w) != null) {
            linearLayoutCompat.setLayoutParams(c2308b5);
        }
        C25715j0 mViewBinding12 = getMViewBinding();
        if (mViewBinding12 != null && (view2 = mViewBinding12.f78228Q) != null) {
            layoutParams = view2.getLayoutParams();
        }
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b6 = (ConstraintLayout.C2308b) layoutParams;
        c2308b6.f7998x = AbstractC23384a.m92908b(71);
        C25715j0 mViewBinding13 = getMViewBinding();
        if (mViewBinding13 != null && (view = mViewBinding13.f78228Q) != null) {
            view.setLayoutParams(c2308b6);
        }
        C25715j0 mViewBinding14 = getMViewBinding();
        if (mViewBinding14 != null && (myRoomView2 = mViewBinding14.f78260x) != null) {
            myRoomView2.resetUserUi();
        }
        C25715j0 mViewBinding15 = getMViewBinding();
        if (mViewBinding15 == null || (myRoomView = mViewBinding15.f78262z) == null) {
            return;
        }
        myRoomView.resetUserUi();
    }

    private final InterfaceC23704a getLoginApi() {
        return (InterfaceC23704a) this.loginApi.getValue();
    }

    private final Handler getMHandler() {
        return (Handler) this.mHandler.getValue();
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    /* JADX INFO: renamed from: h1 */
    private final void m85181h1(int amount, CoverUrl url1, CoverUrl url2, CoverUrl url3, CoverUrl url4) {
        MyRoomView myRoomView;
        C25715j0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (myRoomView = mViewBinding.f78262z) == null) {
            return;
        }
        myRoomView.showCollectionData(3, getIsSelf(), Integer.valueOf(amount), url1, url2, url3, url4, new Function0() { // from class: com.transsion.usercenter.profile.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileFragment.m85183i1(this.f65301a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final Unit m85183i1(ProfileFragment profileFragment) {
        ProfileInfo profileInfo = profileFragment.mProfileInfo;
        if (profileInfo != null) {
            profileFragment.m85175e1("want_to_see");
            Intent intent = new Intent(profileFragment.requireContext(), (Class<?>) ProfileSeeActivity.class);
            intent.putExtra("userId", profileInfo.getUserInfo().getUserId());
            AbstractC0249b abstractC0249b = profileFragment.seeListLaunch;
            if (abstractC0249b != null) {
                abstractC0249b.m999a(intent);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: j1 */
    private final void m85185j1(C25715j0 c25715j0, float f11) {
        float interpolation;
        View view;
        View view2;
        View view3;
        if (isAdded()) {
            if (f11 < 0.2f) {
                interpolation = 0.0f;
            } else {
                interpolation = f11 < 0.4f ? this.appbarChildAlphaDecelerateInterpolator.getInterpolation((f11 - 0.2f) * 5.0f) : 1.0f;
            }
            m85207B0(interpolation == 1.0f);
            if (getIsSelf()) {
                AppCompatImageView ivSetting = c25715j0.f78252p;
                Intrinsics.m97801g(ivSetting, "ivSetting");
                float f12 = 1 - interpolation;
                m85142A0(ivSetting, f12);
                AppCompatImageView ivSettingBlank = c25715j0.f78253q;
                Intrinsics.m97801g(ivSettingBlank, "ivSettingBlank");
                m85142A0(ivSettingBlank, interpolation);
                if (UpdateManager.f65568f.m85865a().m85862g()) {
                    View settingRedTips = c25715j0.f78215D;
                    Intrinsics.m97801g(settingRedTips, "settingRedTips");
                    m85142A0(settingRedTips, f12);
                    View settingBlankRedTips = c25715j0.f78214C;
                    Intrinsics.m97801g(settingBlankRedTips, "settingBlankRedTips");
                    m85142A0(settingBlankRedTips, interpolation);
                    AppCompatImageView ivUpdate = c25715j0.f78255s;
                    Intrinsics.m97801g(ivUpdate, "ivUpdate");
                    m85142A0(ivUpdate, f12);
                    AppCompatImageView updateRedTips = c25715j0.f78227P;
                    Intrinsics.m97801g(updateRedTips, "updateRedTips");
                    m85142A0(updateRedTips, f12);
                    AppCompatImageView ivUpdateBlank = c25715j0.f78256t;
                    Intrinsics.m97801g(ivUpdateBlank, "ivUpdateBlank");
                    m85142A0(ivUpdateBlank, interpolation);
                    View updateBlankRedTips = c25715j0.f78226O;
                    Intrinsics.m97801g(updateBlankRedTips, "updateBlankRedTips");
                    m85142A0(updateBlankRedTips, interpolation);
                }
                AppCompatImageView ivNotice = c25715j0.f78248l;
                Intrinsics.m97801g(ivNotice, "ivNotice");
                m85142A0(ivNotice, f12);
                View viewRed = c25715j0.f78234W;
                Intrinsics.m97801g(viewRed, "viewRed");
                m85142A0(viewRed, f12);
                AppCompatImageView ivQrCode = c25715j0.f78250n;
                Intrinsics.m97801g(ivQrCode, "ivQrCode");
                m85142A0(ivQrCode, f12);
                AppCompatImageView ivNoticeBlank = c25715j0.f78249m;
                Intrinsics.m97801g(ivNoticeBlank, "ivNoticeBlank");
                m85142A0(ivNoticeBlank, interpolation);
                View viewRedBlank = c25715j0.f78235X;
                Intrinsics.m97801g(viewRedBlank, "viewRedBlank");
                m85142A0(viewRedBlank, interpolation);
                AppCompatImageView ivQrCodeBlank = c25715j0.f78251o;
                Intrinsics.m97801g(ivQrCodeBlank, "ivQrCodeBlank");
                m85142A0(ivQrCodeBlank, interpolation);
                C25715j0 mViewBinding = getMViewBinding();
                if (mViewBinding != null && (view = mViewBinding.f78234W) != null && view.getVisibility() == 0) {
                    C25715j0 mViewBinding2 = getMViewBinding();
                    if (mViewBinding2 != null && (view3 = mViewBinding2.f78234W) != null) {
                        m85142A0(view3, f12);
                    }
                    C25715j0 mViewBinding3 = getMViewBinding();
                    if (mViewBinding3 != null && (view2 = mViewBinding3.f78235X) != null) {
                        m85142A0(view2, interpolation);
                    }
                }
                AppCompatImageView ivMore = c25715j0.f78246j;
                Intrinsics.m97801g(ivMore, "ivMore");
                AbstractC26006c.m102054g(ivMore);
                AppCompatImageView ivMoreBlank = c25715j0.f78247k;
                Intrinsics.m97801g(ivMoreBlank, "ivMoreBlank");
                AbstractC26006c.m102054g(ivMoreBlank);
            } else {
                AppCompatImageView ivMore2 = c25715j0.f78246j;
                Intrinsics.m97801g(ivMore2, "ivMore");
                m85142A0(ivMore2, 1 - interpolation);
                AppCompatImageView ivMoreBlank2 = c25715j0.f78247k;
                Intrinsics.m97801g(ivMoreBlank2, "ivMoreBlank");
                m85142A0(ivMoreBlank2, interpolation);
                ConstraintLayout root = c25715j0.f78242f.getRoot();
                Intrinsics.m97801g(root, "getRoot(...)");
                AbstractC26006c.m102054g(root);
            }
            if (getActivity() instanceof ProfileActivity) {
                AppCompatImageView ivBack = c25715j0.f78244h;
                Intrinsics.m97801g(ivBack, "ivBack");
                AbstractC26006c.m102058k(ivBack);
                TnTextView ivBackBlack = c25715j0.f78245i;
                Intrinsics.m97801g(ivBackBlack, "ivBackBlack");
                AbstractC26006c.m102058k(ivBackBlack);
                AppCompatImageView ivBack2 = c25715j0.f78244h;
                Intrinsics.m97801g(ivBack2, "ivBack");
                m85142A0(ivBack2, 1 - interpolation);
                TnTextView ivBackBlack2 = c25715j0.f78245i;
                Intrinsics.m97801g(ivBackBlack2, "ivBackBlack");
                m85142A0(ivBackBlack2, interpolation);
            } else {
                c25715j0.f78244h.setVisibility(8);
                c25715j0.f78245i.setVisibility(8);
            }
            c25715j0.f78217F.setIntercept(!(interpolation == 0.0f));
            ShapeableImageView ivTitleAvatar = c25715j0.f78254r;
            Intrinsics.m97801g(ivTitleAvatar, "ivTitleAvatar");
            m85142A0(ivTitleAvatar, interpolation);
            TnTextView tvTitleUserName = c25715j0.f78223L;
            Intrinsics.m97801g(tvTitleUserName, "tvTitleUserName");
            m85142A0(tvTitleUserName, interpolation);
            c25715j0.f78217F.setBackgroundColor(m85206z0(AbstractC2397b.getColor(requireContext(), R$color.bg_01), interpolation));
        }
    }

    /* JADX INFO: renamed from: k1 */
    private final void m85187k1(ProfileInfo profileInfo) {
        C20664f c20664f;
        MyRoomView myRoomView;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        this.mProfileInfo = profileInfo;
        m85191m1(profileInfo.getUserInfo());
        C25715j0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (myRoomView = mViewBinding.f78260x) != null) {
            boolean isSelf = getIsSelf();
            Group myGroup = profileInfo.getMyGroup();
            myRoomView.showMyRoomData(1, isSelf, myGroup != null ? myGroup.getCount() : null, profileInfo.getMyGroupIconByIndex(0), profileInfo.getMyGroupIconByIndex(1), profileInfo.getMyGroupIconByIndex(2), profileInfo.getMyGroupIconByIndex(3), new Function1() { // from class: com.transsion.usercenter.profile.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfileFragment.m85189l1(this.f65293a, ((Integer) obj).intValue());
                }
            });
        }
        ArrayList arrayListH = CollectionsKt.m97502h(null, null, null, null);
        List<CoverUrl> wantSubjects = profileInfo.getMySubject().getWantSubjects();
        if (wantSubjects != null) {
            int i11 = 0;
            for (Object obj : wantSubjects) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                CoverUrl coverUrl = (CoverUrl) obj;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    arrayListH.set(i11, coverUrl);
                    Result.m112707constructorimpl(Unit.f75682a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m112707constructorimpl(ResultKt.m97106a(th2));
                }
                i11 = i12;
            }
        }
        m85181h1(profileInfo.getMySubject().getWantToSeeCount(), (CoverUrl) arrayListH.get(0), (CoverUrl) arrayListH.get(1), (CoverUrl) arrayListH.get(2), (CoverUrl) arrayListH.get(3));
        if (getIsSelf() && (c20664f = this.mNoticeMessageViewModel) != null) {
            c20664f.m85335d();
        }
        m85144D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final Unit m85189l1(ProfileFragment profileFragment, int i11) {
        if (i11 == 4) {
            profileFragment.m85175e1("myrooms");
            if (profileFragment.getIsSelf()) {
                Navigator.m61845x(TheRouter.m61773c("/room/list"), profileFragment.requireContext(), null, 2, null);
            } else {
                Navigator navigatorM61773c = TheRouter.m61773c("/room/others_list");
                UserInfo userInfo = profileFragment.mUserInfo;
                Navigator.m61845x(navigatorM61773c.m61857K("user_id", userInfo != null ? userInfo.getUserId() : null), profileFragment.requireContext(), null, 2, null);
            }
        } else if (i11 == 5 && profileFragment.getIsSelf()) {
            profileFragment.m85175e1("addroom");
            Navigator.m61845x(TheRouter.m61773c("/room/home"), profileFragment.requireContext(), null, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: m1 */
    private final void m85191m1(final UserInfo userInfo) {
        int i11;
        HashMap mapM96844g;
        if (userInfo == null) {
            return;
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            String userId = userInfo.getUserId();
            if (userId == null) {
                userId = "";
            }
            mapM96844g.put("user_id", userId);
            mapM96844g.put("user_status", this.isSelf ? "me" : "others");
        }
        C25715j0 mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f78239c.setForeground(AbstractC2397b.getDrawable(requireContext(), R$color.cl31_30_p));
            ViewGroup.LayoutParams layoutParams = mViewBinding.f78239c.getLayoutParams();
            Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            ViewGroup.LayoutParams layoutParams3 = mViewBinding.f78228Q.getLayoutParams();
            Intrinsics.m97800f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams3;
            if (m85163X0()) {
                mViewBinding.f78222K.setVisibility(0);
                mViewBinding.f78221J.setVisibility(8);
                mViewBinding.f78220I.setVisibility(8);
                C23860f.a aVar = C23860f.f72909a;
                Context context = mViewBinding.f78243g.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                String avatar = userInfo.getAvatar();
                if (avatar == null) {
                    avatar = "";
                }
                C23860f.b bVarM94470i = bVarM94457m.m94468g(avatar).m94470i(R$mipmap.profile_visitor_avatar);
                ShapeableImageView ivAvatar = mViewBinding.f78243g;
                Intrinsics.m97801g(ivAvatar, "ivAvatar");
                bVarM94470i.m94465d(ivAvatar);
                Context context2 = mViewBinding.f78254r.getContext();
                Intrinsics.m97801g(context2, "getContext(...)");
                C23860f.b bVarM94457m2 = aVar.m94457m(context2);
                String avatar2 = userInfo.getAvatar();
                C23860f.b bVarM94470i2 = bVarM94457m2.m94468g(avatar2 != null ? avatar2 : "").m94470i(R$mipmap.profile_visitor_avatar);
                ShapeableImageView ivTitleAvatar = mViewBinding.f78254r;
                Intrinsics.m97801g(ivTitleAvatar, "ivTitleAvatar");
                bVarM94470i2.m94465d(ivTitleAvatar);
                layoutParams2.height = AbstractC5776a0.m27313a(getIsSelf() ? 176.0f : 185.0f) + AbstractC5781d.m27351c();
                ((ViewGroup.MarginLayoutParams) c2308b).height = AbstractC5776a0.m27313a(106.0f) + AbstractC5781d.m27351c();
                c2308b.f7970j = mViewBinding.f78222K.getId();
            } else {
                mViewBinding.f78222K.setVisibility(8);
                mViewBinding.f78220I.setVisibility(getIsSelf() ? 0 : 8);
                C23860f.a aVar2 = C23860f.f72909a;
                Context context3 = mViewBinding.f78243g.getContext();
                Intrinsics.m97801g(context3, "getContext(...)");
                C23860f.b bVarM94470i3 = aVar2.m94457m(context3).m94468g(userInfo.getAvatar()).m94470i(com.p282tn.lib.widget.R$mipmap.profile_default_avatar);
                ShapeableImageView ivAvatar2 = mViewBinding.f78243g;
                Intrinsics.m97801g(ivAvatar2, "ivAvatar");
                bVarM94470i3.m94465d(ivAvatar2);
                Context context4 = mViewBinding.f78254r.getContext();
                Intrinsics.m97801g(context4, "getContext(...)");
                C23860f.b bVarM94470i4 = aVar2.m94457m(context4).m94468g(userInfo.getAvatar()).m94470i(com.p282tn.lib.widget.R$mipmap.profile_default_avatar);
                ShapeableImageView ivTitleAvatar2 = mViewBinding.f78254r;
                Intrinsics.m97801g(ivTitleAvatar2, "ivTitleAvatar");
                bVarM94470i4.m94465d(ivTitleAvatar2);
                if (userInfo.getGender() == 0) {
                    i11 = 0;
                } else {
                    i11 = userInfo.getGender() == 1 ? R$mipmap.profile_man : R$mipmap.profile_female;
                }
                mViewBinding.f78221J.setCompoundDrawablesWithIntrinsicBounds(i11, 0, 0, 0);
                if (userInfo.getAge() <= 0) {
                    mViewBinding.f78221J.setTextWithString("");
                } else if (userInfo.getGender() == 0) {
                    mViewBinding.f78221J.setTextAction(new Function0() { // from class: com.transsion.usercenter.profile.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProfileFragment.m85193n1(this.f65297a, userInfo);
                        }
                    });
                } else {
                    mViewBinding.f78221J.setTextWithString(String.valueOf(userInfo.getAge()));
                }
                if (userInfo.getGender() != 0 || userInfo.getAge() > 0) {
                    if (mViewBinding.f78221J.getVisibility() != 0) {
                        mViewBinding.f78221J.setVisibility(0);
                        ViewGroup.LayoutParams layoutParams4 = mViewBinding.f78220I.getLayoutParams();
                        Intrinsics.m97800f(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams4;
                        c2308b2.setMarginStart(AbstractC5776a0.m27313a(8.0f));
                        mViewBinding.f78220I.setLayoutParams(c2308b2);
                    }
                } else if (mViewBinding.f78221J.getVisibility() != 8) {
                    mViewBinding.f78221J.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams5 = mViewBinding.f78220I.getLayoutParams();
                    Intrinsics.m97800f(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.C2308b c2308b3 = (ConstraintLayout.C2308b) layoutParams5;
                    c2308b3.setMarginStart(AbstractC5776a0.m27313a(16.0f));
                    mViewBinding.f78220I.setLayoutParams(c2308b3);
                }
                layoutParams2.height = AbstractC5776a0.m27313a(getIsSelf() ? 156.0f : 175.0f) + AbstractC5781d.m27351c();
                c2308b.f7970j = (mViewBinding.f78221J.getVisibility() == 0 ? mViewBinding.f78221J : mViewBinding.f78220I).getId();
            }
            mViewBinding.f78239c.setLayoutParams(layoutParams2);
            mViewBinding.f78228Q.setLayoutParams(c2308b);
            mViewBinding.f78223L.setText(userInfo.getNickname());
            mViewBinding.f78225N.setText(C2448a.m11999c().m12009m(userInfo.getNickname(), AbstractC2468u.f8605a));
            mViewBinding.f78224M.setTextAction(new Function0() { // from class: com.transsion.usercenter.profile.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProfileFragment.m85195o1(this.f65299a, userInfo);
                }
            });
            mViewBinding.f78252p.setVisibility(getIsSelf() ? 0 : 8);
            if (UpdateManager.f65568f.m85865a().m85862g()) {
                mViewBinding.f78215D.setVisibility(getIsSelf() ? 0 : 8);
                mViewBinding.f78214C.setVisibility(getIsSelf() ? 0 : 8);
                mViewBinding.f78255s.setVisibility(getIsSelf() ? 0 : 8);
                mViewBinding.f78227P.setVisibility(getIsSelf() ? 0 : 8);
                mViewBinding.f78256t.setVisibility(getIsSelf() ? 0 : 8);
                mViewBinding.f78226O.setVisibility(getIsSelf() ? 0 : 8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a mLoginApi_delegate$lambda$1() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final CharSequence m85193n1(ProfileFragment profileFragment, UserInfo userInfo) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
        String string = profileFragment.getString(R$string.years_old);
        Intrinsics.m97801g(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(userInfo.getAge())}, 1));
        Intrinsics.m97801g(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final CharSequence m85195o1(ProfileFragment profileFragment, UserInfo userInfo) {
        return profileFragment.getString(R$string.profile_one_room_id, userInfo.getUsername());
    }

    private final void refresh() {
        ViewPager2 viewPager2;
        ViewPager2 viewPager3;
        RecyclerView.Adapter adapter;
        m85173d1();
        C25715j0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (viewPager3 = mViewBinding.f78230S) != null && (adapter = viewPager3.getAdapter()) != null && (adapter instanceof C20645b)) {
            ((C20645b) adapter).m85277h(this.mTabSelectIndex);
        }
        C25715j0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (viewPager2 = mViewBinding2.f78230S) == null) {
            return;
        }
        viewPager2.setCurrentItem(this.mTabSelectIndex);
    }

    /* JADX INFO: renamed from: z0 */
    private final int m85206z0(int color, float fraction) {
        return Color.argb((int) (Color.alpha(color) * fraction), Color.red(color), Color.green(color), Color.blue(color));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m85207B0(boolean isExpand) {
        ImmersionBar immersionBarWith = ImmersionBar.with(this);
        boolean z11 = false;
        if (isExpand && !C5127x.f17620a.m23969a()) {
            z11 = true;
        }
        immersionBarWith.statusBarDarkFont(z11).init();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public C25715j0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25715j0 c25715j0M101159c = C25715j0.m101159c(inflater);
        Intrinsics.m97801g(c25715j0M101159c, "inflate(...)");
        return c25715j0M101159c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        C3187b0 c3187b0M85338h;
        InterfaceC23704a mLoginApi;
        Intrinsics.m97802h(view, "view");
        super.initData(view, savedInstanceState);
        if (getIsSelf() && (mLoginApi = getMLoginApi()) != null) {
            mLoginApi.mo90392n(this);
        }
        ProfileViewModel profileViewModelM85148H0 = m85148H0();
        profileViewModelM85148H0.m85267p().m14851j(getViewLifecycleOwner(), new C20633e(new Function1() { // from class: com.transsion.usercenter.profile.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileFragment.m85149J0(this.f65362a, (ProfileInfo) obj);
            }
        }));
        profileViewModelM85148H0.m85266m().m14851j(getViewLifecycleOwner(), new C20633e(new Function1() { // from class: com.transsion.usercenter.profile.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileFragment.m85150K0(this.f65390a, (Pair) obj);
            }
        }));
        profileViewModelM85148H0.m85265l().m14851j(getViewLifecycleOwner(), new C20633e(new Function1() { // from class: com.transsion.usercenter.profile.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileFragment.m85152M0(this.f65393a, (ProfileEntranceInfo) obj);
            }
        }));
        m85191m1(this.mUserInfo);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C20664f c20664f = (C20664f) new C3227v0(activity).m14969a(C20664f.class);
            this.mNoticeMessageViewModel = c20664f;
            if (c20664f != null && (c3187b0M85338h = c20664f.m85338h()) != null) {
                c3187b0M85338h.m14851j(getViewLifecycleOwner(), new C20633e(new Function1() { // from class: com.transsion.usercenter.profile.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProfileFragment.m85153N0(this.f65394a, (Integer) obj);
                    }
                }));
            }
        }
        if (getIsSelf()) {
            m85148H0().m85263j();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        MyRoomView myRoomView;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        AppCompatImageView appCompatImageView5;
        AppCompatImageView appCompatImageView6;
        MyRoomView myRoomView2;
        View view2;
        View view3;
        MyRoomView myRoomView3;
        View view4;
        MyRoomView myRoomView4;
        MyRoomView myRoomView5;
        Intrinsics.m97802h(view, "view");
        m85147G0();
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        this.mLoadingDialog = new DialogC23167h(contextRequireContext);
        this.loginLaunch = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.usercenter.profile.b0
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                ProfileFragment.m85160U0((ActivityResult) obj);
            }
        });
        this.seeListLaunch = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.usercenter.profile.h
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                ProfileFragment.m85161V0(this.f65284a, (ActivityResult) obj);
            }
        });
        final C25715j0 mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f78238b.addOnOffsetChangedListener(new AppBarLayout.InterfaceC9956g() { // from class: com.transsion.usercenter.profile.i
                @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC9951b
                public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                    ProfileFragment.m85158S0(this.f65287a, mViewBinding, appBarLayout, i11);
                }
            });
            m85185j1(mViewBinding, 0.0f);
            mViewBinding.f78252p.setVisibility(this.isSelf ? 0 : 8);
            if (UpdateManager.f65568f.m85865a().m85862g()) {
                mViewBinding.f78215D.setVisibility(this.isSelf ? 0 : 8);
                mViewBinding.f78255s.setVisibility(this.isSelf ? 0 : 8);
                mViewBinding.f78227P.setVisibility(this.isSelf ? 0 : 8);
                mViewBinding.f78256t.setVisibility(this.isSelf ? 0 : 8);
                mViewBinding.f78226O.setVisibility(this.isSelf ? 0 : 8);
            }
            ViewGroup.LayoutParams layoutParams = mViewBinding.f78238b.getLayoutParams();
            Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.AbstractC2319c abstractC2319cM11414f = ((CoordinatorLayout.C2322f) layoutParams).m11414f();
            if (abstractC2319cM11414f instanceof FixAppBarLayoutBehavior) {
                ((FixAppBarLayoutBehavior) abstractC2319cM11414f).m85138S0(new FixAppBarLayoutBehavior.InterfaceC20627d() { // from class: com.transsion.usercenter.profile.j
                    @Override // com.transsion.usercenter.profile.FixAppBarLayoutBehavior.InterfaceC20627d
                    /* JADX INFO: renamed from: a */
                    public final void mo85139a(float f11, boolean z11) {
                        ProfileFragment.m85159T0(this.f65290a, f11, z11);
                    }
                });
            }
            Function1 function1 = new Function1() { // from class: com.transsion.usercenter.profile.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfileFragment.m85157R0(mViewBinding, this, (UpdateResultEvent) obj);
                }
            };
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = UpdateResultEvent.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
            mViewBinding.f78252p.setOnClickListener(this);
            mViewBinding.f78253q.setOnClickListener(this);
            mViewBinding.f78255s.setOnClickListener(this);
            mViewBinding.f78256t.setOnClickListener(this);
            mViewBinding.f78246j.setOnClickListener(this);
            mViewBinding.f78247k.setOnClickListener(this);
            mViewBinding.f78248l.setOnClickListener(this);
            mViewBinding.f78249m.setOnClickListener(this);
            mViewBinding.f78222K.setOnClickListener(this);
            mViewBinding.f78220I.setOnClickListener(this);
            mViewBinding.f78243g.setOnClickListener(this);
            mViewBinding.f78244h.setOnClickListener(this);
            mViewBinding.f78245i.setOnClickListener(this);
            mViewBinding.f78250n.setOnClickListener(this);
            mViewBinding.f78242f.f78368c.setOnClickListener(this);
        }
        C25715j0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (myRoomView5 = mViewBinding2.f78260x) != null) {
            myRoomView5.setTitle(R$string.profile_my_room);
        }
        C25715j0 mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (myRoomView4 = mViewBinding3.f78261y) != null) {
            myRoomView4.setTitle(R$string.profile_my_downloads);
        }
        if (getIsSelf()) {
            C25715j0 mViewBinding4 = getMViewBinding();
            if (mViewBinding4 == null || (myRoomView = mViewBinding4.f78262z) == null) {
                return;
            }
            myRoomView.setTitle(R$string.profile_your_list);
            return;
        }
        C25715j0 mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (view4 = mViewBinding5.f78231T) != null) {
            view4.setVisibility(8);
        }
        C25715j0 mViewBinding6 = getMViewBinding();
        if (mViewBinding6 != null && (myRoomView3 = mViewBinding6.f78261y) != null) {
            myRoomView3.setVisibility(8);
        }
        C25715j0 mViewBinding7 = getMViewBinding();
        if (mViewBinding7 != null && (view3 = mViewBinding7.f78232U) != null) {
            view3.setVisibility(8);
        }
        C25715j0 mViewBinding8 = getMViewBinding();
        if (mViewBinding8 != null && (view2 = mViewBinding8.f78233V) != null) {
            view2.setVisibility(0);
        }
        C25715j0 mViewBinding9 = getMViewBinding();
        if (mViewBinding9 != null && (myRoomView2 = mViewBinding9.f78262z) != null) {
            myRoomView2.setTitle(R$string.profile_list);
        }
        C25715j0 mViewBinding10 = getMViewBinding();
        if (mViewBinding10 != null && (appCompatImageView6 = mViewBinding10.f78250n) != null) {
            AbstractC26006c.m102054g(appCompatImageView6);
        }
        C25715j0 mViewBinding11 = getMViewBinding();
        if (mViewBinding11 != null && (appCompatImageView5 = mViewBinding11.f78251o) != null) {
            AbstractC26006c.m102054g(appCompatImageView5);
        }
        C25715j0 mViewBinding12 = getMViewBinding();
        if (mViewBinding12 != null && (appCompatImageView4 = mViewBinding12.f78246j) != null) {
            AbstractC26006c.m102054g(appCompatImageView4);
        }
        C25715j0 mViewBinding13 = getMViewBinding();
        if (mViewBinding13 != null && (appCompatImageView3 = mViewBinding13.f78247k) != null) {
            AbstractC26006c.m102054g(appCompatImageView3);
        }
        C25715j0 mViewBinding14 = getMViewBinding();
        if (mViewBinding14 != null && (appCompatImageView2 = mViewBinding14.f78248l) != null) {
            AbstractC26006c.m102054g(appCompatImageView2);
        }
        C25715j0 mViewBinding15 = getMViewBinding();
        if (mViewBinding15 != null && (appCompatImageView = mViewBinding15.f78249m) != null) {
            AbstractC26006c.m102054g(appCompatImageView);
        }
        m85179g1();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        final C25715j0 mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f78230S.setOffscreenPageLimit(1);
            ViewPager2 viewPager2 = mViewBinding.f78230S;
            UserInfo userInfo = this.mUserInfo;
            viewPager2.setAdapter(new C20645b(userInfo != null ? userInfo.getUserId() : null, this));
            mViewBinding.f78230S.registerOnPageChangeCallback(new C20631c());
            m85154O0();
            if (m85163X0()) {
                mViewBinding.f78230S.post(new Runnable() { // from class: com.transsion.usercenter.profile.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProfileFragment.m85164Y0(mViewBinding);
                    }
                });
            }
        }
        m85148H0().m85262i();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void logPause() {
        super.logPause();
        if (this.resumeTimeStamp != 0) {
            C14486e.f50941a.m65288n("profiledetail", Long.valueOf(SystemClock.elapsedRealtime() - this.resumeTimeStamp), getContext());
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void logResume() {
        super.logResume();
        this.resumeTimeStamp = SystemClock.elapsedRealtime();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b("profiledetail", false, 2, null);
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
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View view2;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        BlockInfo blockInfo;
        BlockInfo blockInfo2;
        ShapeableImageView shapeableImageView;
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 1000L)) {
            return;
        }
        int id2 = view.getId();
        if (id2 == R$id.tv_login) {
            m85175e1("login");
            InterfaceC23704a mLoginApi = getMLoginApi();
            if (mLoginApi != null) {
                Context contextRequireContext = requireContext();
                Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
                mLoginApi.mo90387i(contextRequireContext);
                return;
            }
            return;
        }
        boolean block = false;
        if (id2 == R$id.tv_find_movie) {
            m85175e1("findmovies");
            Navigator.m61845x(TheRouter.m61773c("/main/tab").m61852F("tabIndex", 0).m61857K("topTab", "Trending"), requireContext(), null, 2, null);
            return;
        }
        if (id2 == R$id.iv_setting || id2 == R$id.iv_setting_blank) {
            m85175e1("setting");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                SettingActivity.Companion c20782a = SettingActivity.INSTANCE;
                ProfileInfo profileInfo = this.mProfileInfo;
                c20782a.m85655a(activity, profileInfo != null ? profileInfo.getFissionState() : null);
                return;
            }
            return;
        }
        if (id2 == R$id.iv_update || id2 == R$id.iv_update_blank) {
            m85175e1("update");
            if (UpdateManager.f65568f.m85865a().m85862g()) {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new ProfileFragment$onClick$2$1(activity2, this, null), 3, null);
                    return;
                }
                return;
            }
            C25715j0 mViewBinding = getMViewBinding();
            if (mViewBinding != null && (appCompatImageView3 = mViewBinding.f78255s) != null) {
                AbstractC26006c.m102054g(appCompatImageView3);
            }
            C25715j0 mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (appCompatImageView2 = mViewBinding2.f78227P) != null) {
                AbstractC26006c.m102054g(appCompatImageView2);
            }
            C25715j0 mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (appCompatImageView = mViewBinding3.f78256t) != null) {
                AbstractC26006c.m102054g(appCompatImageView);
            }
            C25715j0 mViewBinding4 = getMViewBinding();
            if (mViewBinding4 == null || (view2 = mViewBinding4.f78226O) == null) {
                return;
            }
            AbstractC26006c.m102054g(view2);
            return;
        }
        if (id2 == R$id.iv_notice_blank || id2 == R$id.iv_notice) {
            m85175e1("notice");
            startActivity(new Intent(getActivity(), (Class<?>) UserMessageActivity.class));
            C20664f c20664f = this.mNoticeMessageViewModel;
            if (c20664f != null) {
                c20664f.m85336e();
                return;
            }
            return;
        }
        if (id2 == R$id.tv_edit) {
            m85175e1("editinfo");
            if (checkLogin()) {
                C20470u c20470uM84645a = C20470u.f64806b.m84645a();
                C25715j0 mViewBinding5 = getMViewBinding();
                c20470uM84645a.m84644f((mViewBinding5 == null || (shapeableImageView = mViewBinding5.f78243g) == null) ? null : shapeableImageView.getDrawable());
                FragmentActivity activity3 = getActivity();
                if (activity3 != null) {
                    ProfileEditCenterActivity.Companion c20443a = ProfileEditCenterActivity.INSTANCE;
                    ProfileInfo profileInfo2 = this.mProfileInfo;
                    c20443a.m84607a(activity3, profileInfo2 != null ? profileInfo2.getUserInfo() : null);
                    return;
                }
                return;
            }
            return;
        }
        if (id2 == R$id.iv_back || id2 == R$id.iv_back_black) {
            FragmentActivity activity4 = getActivity();
            if (activity4 != null) {
                activity4.onBackPressed();
                return;
            }
            return;
        }
        if (id2 != R$id.iv_more && id2 != R$id.iv_more_blank) {
            if (id2 == R$id.tvJump) {
                AbstractC14558d.m65673b(0L, new Function0() { // from class: com.transsion.usercenter.profile.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileFragment.m85169b1(this.f65395a);
                    }
                }, 1, null);
                return;
            } else {
                if (id2 == R$id.iv_qr_code || id2 == R$id.iv_qr_code_blank) {
                    m85171c1();
                    return;
                }
                return;
            }
        }
        if (this.mProfileInfo == null) {
            return;
        }
        C28461c c28461c = new C28461c();
        C25715j0 mViewBinding6 = getMViewBinding();
        if (mViewBinding6 == null || (appCompatImageView4 = mViewBinding6.f78246j) == null) {
            return;
        }
        ProfileInfo profileInfo3 = this.mProfileInfo;
        if (profileInfo3 != null && (blockInfo2 = profileInfo3.getBlockInfo()) != null) {
            block = blockInfo2.getBlock();
        }
        ProfileInfo profileInfo4 = this.mProfileInfo;
        c28461c.m109937g(appCompatImageView4, (profileInfo4 == null || (blockInfo = profileInfo4.getBlockInfo()) == null || !blockInfo.getBlocked()) ? block : true);
        c28461c.m109936f(new C20632d());
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        boolean z11;
        NativeSlideshowView nativeSlideshowView;
        NativeSlideshowView nativeSlideshowView2;
        JsonElement jsonElement;
        UserInfo userInfoMo90386h;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String userId = null;
        this.mUserInfo = (UserInfo) (arguments != null ? arguments.getSerializable("userInfo") : null);
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("userId") : null;
        if (this.mUserInfo == null) {
            if (string == null || string.length() == 0) {
                InterfaceC23704a loginApi = getLoginApi();
                this.mUserInfo = loginApi != null ? loginApi.mo90386h() : null;
            } else {
                UserInfo userInfo = new UserInfo();
                userInfo.setUserId(string);
                this.mUserInfo = userInfo;
            }
        }
        UserInfo userInfo2 = this.mUserInfo;
        String userId2 = userInfo2 != null ? userInfo2.getUserId() : null;
        if (userId2 == null || userId2.length() == 0) {
            z11 = true;
        } else {
            UserInfo userInfo3 = this.mUserInfo;
            String userId3 = userInfo3 != null ? userInfo3.getUserId() : null;
            InterfaceC23704a mLoginApi = getMLoginApi();
            if (mLoginApi != null && (userInfoMo90386h = mLoginApi.mo90386h()) != null) {
                userId = userInfoMo90386h.getUserId();
            }
            if (Intrinsics.m97797c(userId3, userId)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.isSelf = z11;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("ProfileDetailBottomScene");
        this.refreshTime = (jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("refreshTime")) == null) ? 15 : jsonElement.getAsInt();
        C25715j0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (nativeSlideshowView2 = mViewBinding.f78212A) != null) {
            nativeSlideshowView2.setSceneId("ProfileDetailBottomScene");
        }
        C25715j0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (nativeSlideshowView = mViewBinding2.f78212A) == null) {
            return;
        }
        nativeSlideshowView.initAd();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        NativeSlideshowView nativeSlideshowView;
        InterfaceC23704a mLoginApi;
        super.onDestroy();
        if (getIsSelf() && (mLoginApi = getMLoginApi()) != null) {
            mLoginApi.mo90391m(this);
        }
        getMHandler().removeCallbacksAndMessages(null);
        C25715j0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (nativeSlideshowView = mViewBinding.f78212A) == null) {
            return;
        }
        nativeSlideshowView.destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                m85173d1();
                logResume();
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogin(UserInfo user) {
        ViewPager2 viewPager2;
        ViewPager2 viewPager3;
        RecyclerView.Adapter adapter;
        ViewPager2 viewPager4;
        Intrinsics.m97802h(user, "user");
        if (getIsSelf()) {
            this.mUserInfo = user;
            this.mProfileInfo = null;
            C25715j0 mViewBinding = getMViewBinding();
            if (mViewBinding != null && (viewPager4 = mViewBinding.f78230S) != null) {
                UserInfo userInfo = this.mUserInfo;
                viewPager4.setAdapter(new C20645b(userInfo != null ? userInfo.getUserId() : null, this));
            }
            C25715j0 mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (viewPager3 = mViewBinding2.f78230S) != null && (adapter = viewPager3.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            C25715j0 mViewBinding3 = getMViewBinding();
            if (mViewBinding3 == null || (viewPager2 = mViewBinding3.f78230S) == null) {
                return;
            }
            viewPager2.setCurrentItem(this.mTabSelectIndex);
        }
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogout() {
        ViewPager2 viewPager2;
        ViewPager2 viewPager3;
        RecyclerView.Adapter adapter;
        ViewPager2 viewPager4;
        if (getIsSelf()) {
            InterfaceC23704a loginApi = getLoginApi();
            this.mUserInfo = loginApi != null ? loginApi.mo90386h() : null;
            this.mProfileInfo = null;
            ProfileViewModel profileViewModelM85148H0 = m85148H0();
            UserInfo userInfo = this.mUserInfo;
            profileViewModelM85148H0.m85264k(userInfo != null ? userInfo.getUserId() : null);
            this.mTabSelectIndex = 1;
            C25715j0 mViewBinding = getMViewBinding();
            if (mViewBinding != null && (viewPager4 = mViewBinding.f78230S) != null) {
                UserInfo userInfo2 = this.mUserInfo;
                viewPager4.setAdapter(new C20645b(userInfo2 != null ? userInfo2.getUserId() : null, this));
            }
            C25715j0 mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (viewPager3 = mViewBinding2.f78230S) != null && (adapter = viewPager3.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            C25715j0 mViewBinding3 = getMViewBinding();
            if (mViewBinding3 == null || (viewPager2 = mViewBinding3.f78230S) == null) {
                return;
            }
            viewPager2.setCurrentItem(this.mTabSelectIndex);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AbstractC14517k.m65414l(null, this, null, 5, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m85173d1();
        AbstractC14517k.m65418p(null, this, "visible=" + isVisible(), 1, null);
    }

    @Override // p441gz.InterfaceC23705b
    public void onUpdateUserInfo(UserInfo user) {
        Intrinsics.m97802h(user, "user");
        if (getIsSelf()) {
            m85191m1(user);
        }
    }
}
