package com.transsion.room.fragment;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.AbstractC0256u;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.AbstractC2397b;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5775a;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.noober.background.drawable.DrawableCreator;
import com.noober.background.view.BLLinearLayout;
import com.p282tn.lib.view.RoomJoinAnimationView;
import com.p282tn.lib.view.RoomJoinStatus;
import com.p282tn.lib.view.expand.ExpandView;
import com.therouter.TheRouter;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.R$string;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.widget.GradientTextView;
import com.transsion.baseui.widget.PileLayout;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.moviedetailapi.bean.RoomNet;
import com.transsion.publish.bean.PublishResult;
import com.transsion.publish.view.UploadView;
import com.transsion.room.R$color;
import com.transsion.room.R$id;
import com.transsion.room.R$layout;
import com.transsion.room.view.RoomHomeTabTitleView;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.usercenterapi.ReportType;
import com.transsion.web.api.WebConstants;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import gp.InterfaceC23624b;
import gq.C23653o;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C25220y0;
import l00.C25472a;
import net.lucode.hackware.magicindicator.MagicIndicator;
import ng.AbstractC26006c;
import p344db.C22966n;
import p393f.C23284j;
import p415fq.C23420k;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p465hp.InterfaceC23888a;
import p550kj.C24655b;
import p743rh.C27287m;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0086\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0087\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0005J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0005J\u0017\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\u0005J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\u0005J\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\u0005J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0011\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b:09H\u0016¢\u0006\u0004\b;\u0010<J\u0019\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010\u0005J\u0017\u0010C\u001a\u00020\u00062\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bC\u0010DJ-\u0010I\u001a\u00020\u00062\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020=2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000309H\u0016¢\u0006\u0004\bI\u0010JR\u001f\u0010M\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010OR\u0014\u0010T\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010OR\u0014\u0010V\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010OR\u0014\u0010X\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010OR\u0014\u0010Z\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010OR\u0014\u0010\\\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010OR\u0014\u0010^\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010OR\u0018\u0010a\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010g\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010p\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001d\u0010z\u001a\u0004\u0018\u00010u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR#\u0010\u0080\u0001\u001a\u0010\u0012\f\u0012\n }*\u0004\u0018\u00010|0|0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\"\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0081\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0082\u0001\u0010w\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0088\u0001"}, m97100d2 = {"Lcom/transsion/room/fragment/RoomDetailFragmentNew;", "Lcom/transsion/room/fragment/RoomBaseFragment;", "Lgq/o;", "", "<init>", "()V", "", "j1", "h1", "Landroid/content/Context;", "context", "p1", "(Landroid/content/Context;)V", "S0", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "roomItem", "q1", "(Lcom/transsion/moviedetailapi/bean/RoomItem;)V", "d1", "e1", "m1", "l1", "checkToShowEmptyView", "", "collapsePercentage", "Q0", "(Landroid/content/Context;F)V", "", "checkLogin", "()Z", "Landroid/view/LayoutInflater;", "inflater", "T0", "(Landroid/view/LayoutInflater;)Lgq/o;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "initViewData", "initViewModel", "Lcom/transsion/publish/bean/PublishResult;", "eventBean", "n1", "(Lcom/transsion/publish/bean/PublishResult;)V", "initListener", "retryLoadData", "loadDefaultData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Landroidx/viewpager2/widget/ViewPager2;", "z0", "()Landroidx/viewpager2/widget/ViewPager2;", "Lnet/lucode/hackware/magicindicator/MagicIndicator;", "u0", "()Lnet/lucode/hackware/magicindicator/MagicIndicator;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "y0", "()Ljava/util/List;", "", RequestParameters.POSITION, "Landroidx/fragment/app/Fragment;", "m0", "(I)Landroidx/fragment/app/Fragment;", "k1", "v0", "(I)V", "Lcom/transsion/room/view/RoomHomeTabTitleView;", "tabView", "index", "tabList", "x0", "(Lcom/transsion/room/view/RoomHomeTabTitleView;ILjava/util/List;)V", "g", "Ljava/util/List;", "mTabs", "h", "I", "dp22", "i", "initialRoomCoverSize", "j", "finalRoomCoverSize", CampaignEx.JSON_KEY_AD_K, "finalRoomHeaderSize", "l", "finalMarginStart", "m", "initialMarginStart", "n", "finalMarginTop", "o", "initialMarginTop", TtmlNode.TAG_P, "Ljava/lang/String;", "mGroupId", CampaignEx.JSON_KEY_AD_Q, "Z", "mIsNeedStartRoomHome", CampaignEx.JSON_KEY_AD_R, "Lcom/transsion/moviedetailapi/bean/RoomItem;", "mRoomDetailItem", "Lcom/transsion/share/share/ShareDialogFragment;", "s", "Lcom/transsion/share/share/ShareDialogFragment;", "mShareDialog", "t", "Lcom/transsion/publish/bean/PublishResult;", TmcStartParams.KEY_URL_SHORT, "Landroid/view/View;", "mLoadingView", "Ldb/n;", "v", "Ldb/n;", "mMemberAvatarShapeModel", "Lgz/a;", "w", "Lkotlin/Lazy;", "getMLoginApi", "()Lgz/a;", "mLoginApi", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "x", "Landroidx/activity/result/b;", "mLoginLaunch", "Lhp/a;", "y", "R0", "()Lhp/a;", "mPublishedApi", "z", "a", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RoomDetailFragmentNew extends RoomBaseFragment<C23653o, String> {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List mTabs = CollectionsKt.m97509o(Utils.m27275a().getString(R$string.Popular), Utils.m27275a().getString(R$string.Newest));

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int dp22 = AbstractC23384a.m92908b(24);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int initialRoomCoverSize = AbstractC23384a.m92908b(52);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int finalRoomCoverSize = AbstractC23384a.m92908b(24);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int finalRoomHeaderSize = AbstractC23384a.m92908b(28);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int finalMarginStart = AbstractC23384a.m92908b(48);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int initialMarginStart = AbstractC23384a.m92908b(12);

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int finalMarginTop = AbstractC23384a.m92908b(12);

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int initialMarginTop = AbstractC23384a.m92908b(54);

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String mGroupId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean mIsNeedStartRoomHome;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private RoomItem mRoomDetailItem;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private ShareDialogFragment mShareDialog;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private PublishResult eventBean;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private View mLoadingView;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final C22966n mMemberAvatarShapeModel;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Lazy mLoginApi;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final AbstractC0249b mLoginLaunch;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Lazy mPublishedApi;

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragmentNew$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final RoomDetailFragmentNew m76879a(RoomItem roomItem, String str, boolean z11) {
            RoomDetailFragmentNew roomDetailFragmentNew = new RoomDetailFragmentNew();
            roomDetailFragmentNew.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a(WebConstants.FIELD_ITEM, roomItem), TuplesKt.m97108a("id", str), TuplesKt.m97108a("need_start_room_home", Boolean.valueOf(z11))));
            return roomDetailFragmentNew;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragmentNew$b */
    public static final class C18060b extends AbstractC0256u {
        C18060b() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            RoomDetailFragmentNew.this.m76870j1();
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragmentNew$c */
    static final class C18061c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59150a;

        C18061c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59150a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59150a;
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
            this.f59150a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragmentNew$d */
    public static final class C18062d implements InterfaceC18701a {
        C18062d() {
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: a */
        public void mo70521a(String id2, PostType postType) {
            Intrinsics.m97802h(id2, "id");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: b */
        public void mo70522b(String str) {
            InterfaceC18701a.a.m78648b(this, str);
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: c */
        public void mo70523c(String url, String fileName, String fileSize, String fileImage) {
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(fileName, "fileName");
            Intrinsics.m97802h(fileSize, "fileSize");
            Intrinsics.m97802h(fileImage, "fileImage");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: d */
        public void mo70524d(String id2) {
            String str;
            Intrinsics.m97802h(id2, "id");
            if (C14557c.f51100a.m65671a(2, 2000L) || (str = RoomDetailFragmentNew.this.mGroupId) == null) {
                return;
            }
            RoomDetailFragmentNew.this.m76775p0().m77399x(str);
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: e */
        public void mo70525e(String str) {
            InterfaceC18701a.a.m78649c(this, str);
        }
    }

    public RoomDetailFragmentNew() {
        C22966n c22966nM91443m = C22966n.m91391a().m91446q(0, 10.0f).m91445p(C22966n.f70075m).m91443m();
        Intrinsics.m97801g(c22966nM91443m, "build(...)");
        this.mMemberAvatarShapeModel = c22966nM91443m;
        this.mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.fragment.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomDetailFragmentNew.mLoginApi_delegate$lambda$0();
            }
        });
        AbstractC0249b abstractC0249bRegisterForActivityResult = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.room.fragment.b0
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                RoomDetailFragmentNew.m76866f1(this.f59239a, (ActivityResult) obj);
            }
        });
        Intrinsics.m97801g(abstractC0249bRegisterForActivityResult, "registerForActivityResult(...)");
        this.mLoginLaunch = abstractC0249bRegisterForActivityResult;
        this.mPublishedApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.fragment.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomDetailFragmentNew.m76867g1();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    private final void m76852Q0(Context context, float collapsePercentage) {
        int color;
        RoomJoinAnimationView roomJoinAnimationView;
        RoomJoinAnimationView roomJoinAnimationView2;
        RoomJoinAnimationView roomJoinAnimationView3;
        ExpandView expandView;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        ShapeableImageView shapeableImageView;
        ShapeableImageView shapeableImageView2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        View view;
        ConstraintLayout constraintLayout;
        FrameLayout frameLayout;
        ImageView imageView;
        RoomItem roomItem;
        Cover cover;
        String averageHueDark;
        Cover cover2;
        Cover cover3;
        int i11 = this.initialRoomCoverSize;
        float f11 = i11 - ((i11 - this.finalRoomCoverSize) * collapsePercentage);
        float f12 = i11 - ((i11 - this.finalRoomHeaderSize) * collapsePercentage);
        int i12 = this.initialMarginStart;
        float f13 = i12 - ((i12 - this.finalMarginStart) * collapsePercentage);
        int i13 = this.initialMarginTop;
        float f14 = i13 - ((i13 - this.finalMarginTop) * collapsePercentage);
        RoomItem roomItem2 = this.mRoomDetailItem;
        ViewGroup.LayoutParams layoutParams = null;
        String averageHueDark2 = (roomItem2 == null || (cover3 = roomItem2.getCover()) == null) ? null : cover3.getAverageHueDark();
        if (averageHueDark2 == null || averageHueDark2.length() == 0 || (roomItem = this.mRoomDetailItem) == null || (cover = roomItem.getCover()) == null || (averageHueDark = cover.getAverageHueDark()) == null || !StringsKt.m98242W(averageHueDark, com.transsion.gslb.Utils.SEPARATOR, false, 2, null)) {
            color = context.getResources().getColor(R$color.post_detail_top_bg);
        } else {
            RoomItem roomItem3 = this.mRoomDetailItem;
            color = Color.parseColor((roomItem3 == null || (cover2 = roomItem3.getCover()) == null) ? null : cover2.getAverageHueDark());
        }
        int iM100075a = C25472a.m100075a(collapsePercentage, color, context.getResources().getColor(com.p282tn.lib.widget.R$color.bg_01));
        C23653o c23653o = (C23653o) getMViewBinding();
        if (c23653o != null && (imageView = c23653o.f72278k) != null) {
            imageView.setBackgroundColor(iM100075a);
        }
        C23653o c23653o2 = (C23653o) getMViewBinding();
        if (c23653o2 != null && (frameLayout = c23653o2.f72272e) != null) {
            frameLayout.setBackgroundColor(iM100075a);
        }
        C23653o c23653o3 = (C23653o) getMViewBinding();
        if (c23653o3 != null && (constraintLayout = c23653o3.f72270c) != null) {
            constraintLayout.setBackgroundColor(iM100075a);
        }
        C23653o c23653o4 = (C23653o) getMViewBinding();
        if (c23653o4 != null && (view = c23653o4.f72286s) != null) {
            view.setBackgroundColor(iM100075a);
        }
        C23653o c23653o5 = (C23653o) getMViewBinding();
        ViewGroup.LayoutParams layoutParams2 = (c23653o5 == null || (linearLayout2 = c23653o5.f72279l) == null) ? null : linearLayout2.getLayoutParams();
        Intrinsics.m97800f(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMarginStart((int) f13);
        marginLayoutParams.topMargin = (int) f14;
        marginLayoutParams.height = (int) f12;
        C23653o c23653o6 = (C23653o) getMViewBinding();
        if (c23653o6 != null && (linearLayout = c23653o6.f72279l) != null) {
            linearLayout.setLayoutParams(marginLayoutParams);
        }
        C23653o c23653o7 = (C23653o) getMViewBinding();
        if (c23653o7 != null && (shapeableImageView2 = c23653o7.f72276i) != null) {
            layoutParams = shapeableImageView2.getLayoutParams();
        }
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        int i14 = (int) f11;
        layoutParams.width = i14;
        layoutParams.height = i14;
        C23653o c23653o8 = (C23653o) getMViewBinding();
        if (c23653o8 != null && (shapeableImageView = c23653o8.f72276i) != null) {
            shapeableImageView.setLayoutParams(layoutParams);
        }
        C23653o c23653o9 = (C23653o) getMViewBinding();
        if (c23653o9 != null && (appCompatTextView = c23653o9.f72284q) != null) {
            appCompatTextView.setMaxLines(collapsePercentage > 0.9f ? 1 : 2);
        }
        float f15 = collapsePercentage * 2;
        if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        C23653o c23653o10 = (C23653o) getMViewBinding();
        if (c23653o10 != null && (appCompatImageView = c23653o10.f72277j) != null) {
            appCompatImageView.setAlpha(1 - f15);
        }
        C23653o c23653o11 = (C23653o) getMViewBinding();
        if (c23653o11 != null && (expandView = c23653o11.f72271d) != null) {
            expandView.setAlpha(1 - f15);
        }
        C23653o c23653o12 = (C23653o) getMViewBinding();
        if (c23653o12 != null && (roomJoinAnimationView3 = c23653o12.f72285r) != null) {
            roomJoinAnimationView3.setAlpha(1 - f15);
        }
        float f16 = 1 - f15;
        boolean z11 = f16 > 0.0f;
        C23653o c23653o13 = (C23653o) getMViewBinding();
        if (c23653o13 != null && (roomJoinAnimationView2 = c23653o13.f72285r) != null) {
            if ((roomJoinAnimationView2.getVisibility() == 0) == z11) {
                return;
            }
        }
        C23653o c23653o14 = (C23653o) getMViewBinding();
        if (c23653o14 == null || (roomJoinAnimationView = c23653o14.f72285r) == null) {
            return;
        }
        roomJoinAnimationView.setVisibility(f16 > 0.0f ? 0 : 8);
    }

    /* JADX INFO: renamed from: R0 */
    private final InterfaceC23888a m76853R0() {
        return (InterfaceC23888a) this.mPublishedApi.getValue();
    }

    /* JADX INFO: renamed from: S0 */
    private final void m76854S0() {
        String str = this.mGroupId;
        if (str != null) {
            m76775p0().m77393p(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m76855U0(RoomDetailFragmentNew roomDetailFragmentNew, View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        roomDetailFragmentNew.m76872m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m76856V0(RoomDetailFragmentNew roomDetailFragmentNew, View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        RoomItem roomItem = roomDetailFragmentNew.mRoomDetailItem;
        if (roomItem != null ? Intrinsics.m97797c(roomItem.getHasJoin(), Boolean.TRUE) : false) {
            roomDetailFragmentNew.m76865e1();
        } else {
            roomDetailFragmentNew.m76864d1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final void m76857W0(RoomDetailFragmentNew roomDetailFragmentNew, View view) {
        roomDetailFragmentNew.m76877k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final void m76858X0(RoomDetailFragmentNew roomDetailFragmentNew, View view) {
        roomDetailFragmentNew.m76877k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final void m76859Y0(RoomDetailFragmentNew roomDetailFragmentNew, AppBarLayout appBarLayout, int i11) {
        float fAbs = Math.abs(i11) / appBarLayout.getTotalScrollRange();
        Context context = appBarLayout.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        roomDetailFragmentNew.m76852Q0(context, fAbs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final void m76860Z0(RoomDetailFragmentNew roomDetailFragmentNew, View view) {
        roomDetailFragmentNew.m76870j1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final Unit m76861a1(RoomDetailFragmentNew roomDetailFragmentNew, RoomItem roomItem) {
        if (roomItem == null) {
            roomDetailFragmentNew.checkToShowEmptyView();
        } else {
            roomDetailFragmentNew.showContentView();
            roomDetailFragmentNew.m76875q1(roomItem);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    public static final Unit m76862b1(RoomDetailFragmentNew roomDetailFragmentNew, RoomNet roomNet) {
        RoomJoinAnimationView roomJoinAnimationView;
        RoomJoinAnimationView roomJoinAnimationView2;
        roomDetailFragmentNew.m76854S0();
        if (roomNet == null) {
            C23653o c23653o = (C23653o) roomDetailFragmentNew.getMViewBinding();
            if (c23653o != null && (roomJoinAnimationView2 = c23653o.f72285r) != null) {
                roomJoinAnimationView2.setStatus(RoomJoinStatus.JOIN);
            }
        } else {
            C23653o c23653o2 = (C23653o) roomDetailFragmentNew.getMViewBinding();
            if (c23653o2 != null && (roomJoinAnimationView = c23653o2.f72285r) != null) {
                roomJoinAnimationView.setStatus(RoomJoinStatus.JOINED);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m76863c1(RoomDetailFragmentNew roomDetailFragmentNew, RoomNet roomNet) {
        if (roomNet != null) {
            roomDetailFragmentNew.m76854S0();
        }
        return Unit.f75682a;
    }

    private final boolean checkLogin() {
        InterfaceC23704a mLoginApi;
        InterfaceC23704a mLoginApi2 = getMLoginApi();
        if (mLoginApi2 != null && mLoginApi2.mo90379a()) {
            return true;
        }
        AbstractC0249b abstractC0249b = this.mLoginLaunch;
        Context context = getContext();
        Intent intentMo90394p = null;
        if (context != null && (mLoginApi = getMLoginApi()) != null) {
            intentMo90394p = mLoginApi.mo90394p(context);
        }
        abstractC0249b.m999a(intentMo90394p);
        return false;
    }

    private final void checkToShowEmptyView() {
        if (C27287m.f83003a.m106330e()) {
            showEmptyView(false);
        } else {
            showNoNetworkView(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d1 */
    private final void m76864d1() {
        RoomJoinAnimationView roomJoinAnimationView;
        RoomJoinAnimationView roomJoinAnimationView2;
        C23653o c23653o = (C23653o) getMViewBinding();
        if ((c23653o == null || (roomJoinAnimationView2 = c23653o.f72285r) == null || !roomJoinAnimationView2.isLoading()) && checkLogin() && !C14557c.f51100a.m65671a(1001, 2000L)) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
                return;
            }
            String groupId = this.mGroupId;
            if (groupId == null) {
                RoomItem roomItem = this.mRoomDetailItem;
                groupId = roomItem != null ? roomItem.getGroupId() : null;
            }
            if (groupId != null) {
                C23653o c23653o2 = (C23653o) getMViewBinding();
                if (c23653o2 != null && (roomJoinAnimationView = c23653o2.f72285r) != null) {
                    roomJoinAnimationView.setStatus(RoomJoinStatus.LOADING);
                }
                m76775p0().m77398w(groupId);
                C14450a.f50860a.m65145h("room_detail", "join", (60 & 4) != 0 ? "" : this.mGroupId, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    private final void m76865e1() {
        RoomJoinAnimationView roomJoinAnimationView;
        RoomJoinAnimationView roomJoinAnimationView2;
        C23653o c23653o = (C23653o) getMViewBinding();
        if (c23653o == null || (roomJoinAnimationView2 = c23653o.f72285r) == null || !roomJoinAnimationView2.isLoading()) {
            String groupId = this.mGroupId;
            if (groupId == null) {
                RoomItem roomItem = this.mRoomDetailItem;
                groupId = roomItem != null ? roomItem.getGroupId() : null;
            }
            if (groupId != null) {
                C23653o c23653o2 = (C23653o) getMViewBinding();
                if (c23653o2 != null && (roomJoinAnimationView = c23653o2.f72285r) != null) {
                    roomJoinAnimationView.setStatus(RoomJoinStatus.LOADING);
                }
                m76775p0().m77399x(groupId);
                C14450a.f50860a.m65145h("room_detail", "leave", (60 & 4) != 0 ? "" : this.mGroupId, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f1 */
    public static final void m76866f1(RoomDetailFragmentNew roomDetailFragmentNew, ActivityResult it) {
        RoomJoinAnimationView roomJoinAnimationView;
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() == -1) {
            roomDetailFragmentNew.m76854S0();
            roomDetailFragmentNew.m76864d1();
            return;
        }
        C23653o c23653o = (C23653o) roomDetailFragmentNew.getMViewBinding();
        if (c23653o == null || (roomJoinAnimationView = c23653o.f72285r) == null) {
            return;
        }
        roomJoinAnimationView.setStatus(RoomJoinStatus.JOIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final InterfaceC23888a m76867g1() {
        return (InterfaceC23888a) TheRouter.m61774d(InterfaceC23888a.class, new Object[0]);
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    /* JADX INFO: renamed from: h1 */
    private final void m76868h1() {
        Object context = getContext();
        if (context instanceof ComponentActivity) {
            Function1 function1 = new Function1() { // from class: com.transsion.room.fragment.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomDetailFragmentNew.m76869i1(this.f59300a, (PublishResult) obj);
                }
            };
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = PublishResult.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.observeEvent((InterfaceC3224u) context, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final Unit m76869i1(RoomDetailFragmentNew roomDetailFragmentNew, PublishResult it) {
        Intrinsics.m97802h(it, "it");
        roomDetailFragmentNew.m76878n1(it);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public final void m76870j1() {
        if (this.mIsNeedStartRoomHome) {
            C23420k.m92971i(C23420k.f71413a, null, null, null, false, 15, null);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l1 */
    private final void m76871l1(RoomItem roomItem) {
        Group group;
        String strM23921d;
        ColorStateList colorStateList;
        int color;
        PileLayout pileLayout;
        Cover cover;
        String averageHueDark;
        PileLayout pileLayout2;
        Cover cover2;
        String averageHueDark2;
        PileLayout pileLayout3;
        AppCompatTextView appCompatTextView;
        Group group2;
        List<String> memberAvatars = roomItem.getMemberAvatars();
        List<String> listU0 = memberAvatars != null ? CollectionsKt.m97343U0(memberAvatars) : null;
        List list = listU0;
        if (list == null || list.isEmpty()) {
            C23653o c23653o = (C23653o) getMViewBinding();
            if (c23653o == null || (group = c23653o.f72273f) == null) {
                return;
            }
            AbstractC26006c.m102054g(group);
            return;
        }
        C23653o c23653o2 = (C23653o) getMViewBinding();
        if (c23653o2 != null && (group2 = c23653o2.f72273f) != null) {
            AbstractC26006c.m102058k(group2);
        }
        if (roomItem.getUserCount() != null) {
            Long userCount = roomItem.getUserCount();
            Intrinsics.m97799e(userCount);
            strM23921d = AbstractC5114k.m23921d(userCount.longValue());
        } else {
            strM23921d = "0";
        }
        C23653o c23653o3 = (C23653o) getMViewBinding();
        if (c23653o3 != null && (appCompatTextView = c23653o3.f72282o) != null) {
            Long userCount2 = roomItem.getUserCount();
            appCompatTextView.setText((userCount2 != null ? userCount2.longValue() : 0L) == 1 ? Utils.m27275a().getString(com.transsion.room.R$string.one_members) : Utils.m27275a().getString(com.transsion.room.R$string.x_members, strM23921d));
        }
        C23653o c23653o4 = (C23653o) getMViewBinding();
        if (c23653o4 != null && (pileLayout3 = c23653o4.f72281n) != null) {
            pileLayout3.removeAllViews();
        }
        Long userCount3 = roomItem.getUserCount();
        boolean z11 = (userCount3 != null ? userCount3.longValue() : 0L) > 8;
        Cover cover3 = roomItem.getCover();
        String averageHueDark3 = cover3 != null ? cover3.getAverageHueDark() : null;
        if (averageHueDark3 == null || averageHueDark3.length() == 0 || (cover2 = roomItem.getCover()) == null || (averageHueDark2 = cover2.getAverageHueDark()) == null || !StringsKt.m98242W(averageHueDark2, com.transsion.gslb.Utils.SEPARATOR, false, 2, null)) {
            colorStateList = AbstractC2397b.getColorStateList(Utils.m27275a(), R$color.post_detail_top_bg);
        } else {
            Cover cover4 = roomItem.getCover();
            colorStateList = ColorStateList.valueOf(Color.parseColor(cover4 != null ? cover4.getAverageHueDark() : null));
        }
        for (String str : listU0) {
            C23653o c23653o5 = (C23653o) getMViewBinding();
            if (c23653o5 != null && (pileLayout2 = c23653o5.f72281n) != null) {
                ShapeableImageView shapeableImageView = new ShapeableImageView(pileLayout2.getContext());
                shapeableImageView.setStrokeWidth(AbstractC23384a.m92908b(2));
                shapeableImageView.setStrokeColor(colorStateList);
                shapeableImageView.setShapeAppearanceModel(this.mMemberAvatarShapeModel);
                int iM92908b = AbstractC23384a.m92908b(1);
                shapeableImageView.setPadding(iM92908b, iM92908b, iM92908b, iM92908b);
                shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                C23860f.a aVar = C23860f.f72909a;
                Context context = pileLayout2.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                aVar.m94457m(context).m94468g(str).m94474m(this.dp22).m94464c(this.dp22).m94470i(com.p282tn.lib.widget.R$color.transparent).m94465d(shapeableImageView);
                int i11 = this.dp22;
                pileLayout2.addView(shapeableImageView, i11, i11);
            }
        }
        if (z11) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.layout_member_avatar_more, (ViewGroup) null);
            Cover cover5 = roomItem.getCover();
            String averageHueDark4 = cover5 != null ? cover5.getAverageHueDark() : null;
            if (averageHueDark4 == null || averageHueDark4.length() == 0 || (cover = roomItem.getCover()) == null || (averageHueDark = cover.getAverageHueDark()) == null || !StringsKt.m98242W(averageHueDark, com.transsion.gslb.Utils.SEPARATOR, false, 2, null)) {
                color = viewInflate.getContext().getResources().getColor(R$color.post_detail_top_bg);
            } else {
                Cover cover6 = roomItem.getCover();
                color = Color.parseColor(cover6 != null ? cover6.getAverageHueDark() : null);
            }
            ((BLLinearLayout) viewInflate.findViewById(R$id.v_more)).setBackgroundDrawable(new DrawableCreator.Builder().setCornersRadius(AbstractC23384a.m92908b(12)).setSolidColor(viewInflate.getContext().getResources().getColor(com.p282tn.lib.widget.R$color.gray_dark_30)).setStrokeColor(color).setStrokeWidth(AbstractC23384a.m92908b(2)).build());
            C23653o c23653o6 = (C23653o) getMViewBinding();
            if (c23653o6 == null || (pileLayout = c23653o6.f72281n) == null) {
                return;
            }
            int i12 = this.dp22;
            pileLayout.addView(viewInflate, i12, i12);
        }
    }

    /* JADX INFO: renamed from: m1 */
    private final void m76872m1() {
        ShareDialogFragment shareDialogFragment;
        ShareDialogFragment.Companion companion = ShareDialogFragment.INSTANCE;
        PostType postType = PostType.GROUP_TYPE;
        String str = this.mGroupId;
        RoomItem roomItem = this.mRoomDetailItem;
        String creatorId = roomItem != null ? roomItem.getCreatorId() : null;
        String value = ReportType.GROUP.getValue();
        RoomItem roomItem2 = this.mRoomDetailItem;
        ShareDialogFragment shareDialogFragmentM78645a = companion.m78645a(postType, str, creatorId, value, (3328 & 16) != 0 ? "" : roomItem2 != null ? roomItem2.getName() : null, (3328 & 32) != 0 ? "" : "", (3328 & 64) != 0 ? false : false, (3328 & 128) != 0 ? false : false, (3328 & 256) != 0 ? false : false, "groupdetail", (3328 & 1024) != 0 ? "" : null, (3328 & 2048) != 0 ? "" : null);
        this.mShareDialog = shareDialogFragmentM78645a;
        if (shareDialogFragmentM78645a != null) {
            shareDialogFragmentM78645a.m78642G0(new C18062d());
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.m14537g0();
        ShareDialogFragment shareDialogFragment2 = this.mShareDialog;
        if ((shareDialogFragment2 == null || !shareDialogFragment2.isAdded()) && childFragmentManager.m14547k0("share") == null && (shareDialogFragment = this.mShareDialog) != null) {
            shareDialogFragment.show(childFragmentManager, "share");
        }
        C14450a.f50860a.m65145h("room_detail", "share", (60 & 4) != 0 ? "" : this.mGroupId, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a mLoginApi_delegate$lambda$0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final void m76873o1(RoomDetailFragmentNew roomDetailFragmentNew) {
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        roomDetailFragmentNew.m76874p1(applicationM27275a);
    }

    /* JADX INFO: renamed from: p1 */
    private final void m76874p1(Context context) {
        UploadView uploadView = new UploadView(context);
        uploadView.setPageName("room_detail");
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
        uploadView.showFloatView(this.eventBean);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q1 */
    private final void m76875q1(RoomItem roomItem) {
        RoomJoinAnimationView roomJoinAnimationView;
        ExpandView expandView;
        AppCompatTextView appCompatTextView;
        ShapeableImageView shapeableImageView;
        this.mRoomDetailItem = roomItem;
        C23653o c23653o = (C23653o) getMViewBinding();
        if (c23653o != null && (shapeableImageView = c23653o.f72276i) != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = shapeableImageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            String avatar = roomItem.getAvatar();
            if (avatar == null) {
                avatar = "";
            }
            bVarM94457m.m94468g(avatar).m94474m(this.dp22).m94464c(this.dp22).m94465d(shapeableImageView);
        }
        C23653o c23653o2 = (C23653o) getMViewBinding();
        if (c23653o2 != null && (appCompatTextView = c23653o2.f72284q) != null) {
            appCompatTextView.setText(roomItem.getName());
        }
        C23653o c23653o3 = (C23653o) getMViewBinding();
        if (c23653o3 != null && (expandView = c23653o3.f72271d) != null) {
            expandView.m62195m(roomItem.getDescription());
        }
        C23653o c23653o4 = (C23653o) getMViewBinding();
        if (c23653o4 != null && (roomJoinAnimationView = c23653o4.f72285r) != null) {
            roomJoinAnimationView.setStatus(Intrinsics.m97797c(roomItem.getHasJoin(), Boolean.TRUE) ? RoomJoinStatus.JOINED : RoomJoinStatus.JOIN);
        }
        m76871l1(roomItem);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public C23653o getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23653o c23653oM93562c = C23653o.m93562c(inflater);
        Intrinsics.m97801g(c23653oM93562c, "inflate(...)");
        return c23653oM93562c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        if (this.mLoadingView == null) {
            this.mLoadingView = LayoutInflater.from(requireContext()).inflate(R$layout.layout_room_detail_loading, (ViewGroup) getFlStateView(), false);
        }
        return this.mLoadingView;
    }

    @Override // com.transsion.room.fragment.RoomBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        GradientTextView gradientTextView;
        AppCompatImageView appCompatImageView;
        RoomJoinAnimationView roomJoinAnimationView;
        AppCompatImageView appCompatImageView2;
        C23653o c23653o = (C23653o) getMViewBinding();
        if (c23653o != null && (appCompatImageView2 = c23653o.f72277j) != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomDetailFragmentNew.m76855U0(this.f59251a, view);
                }
            });
        }
        C23653o c23653o2 = (C23653o) getMViewBinding();
        if (c23653o2 != null && (roomJoinAnimationView = c23653o2.f72285r) != null) {
            roomJoinAnimationView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomDetailFragmentNew.m76856V0(this.f59254a, view);
                }
            });
        }
        C23653o c23653o3 = (C23653o) getMViewBinding();
        if (c23653o3 != null && (appCompatImageView = c23653o3.f72275h) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomDetailFragmentNew.m76857W0(this.f59295a, view);
                }
            });
        }
        C23653o c23653o4 = (C23653o) getMViewBinding();
        if (c23653o4 == null || (gradientTextView = c23653o4.f72283p) == null) {
            return;
        }
        gradientTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomDetailFragmentNew.m76858X0(this.f59298a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.room.fragment.RoomBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        C24655b logViewConfig;
        HashMap mapM96844g;
        OnBackPressedDispatcher onBackPressedDispatcher;
        AppCompatImageView appCompatImageView;
        AppBarLayout appBarLayout;
        ImageView imageView;
        String groupId;
        Bundle arguments = getArguments();
        String string = null;
        RoomItem roomItem = arguments != null ? (RoomItem) arguments.getParcelable(WebConstants.FIELD_ITEM) : null;
        if (roomItem == null || (groupId = roomItem.getGroupId()) == null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                string = arguments2.getString("id");
            }
        } else {
            string = groupId;
        }
        this.mGroupId = string;
        Bundle arguments3 = getArguments();
        this.mIsNeedStartRoomHome = arguments3 != null ? arguments3.getBoolean("need_start_room_home") : false;
        C23653o c23653o = (C23653o) getMViewBinding();
        if (c23653o != null && (imageView = c23653o.f72278k) != null) {
            AbstractC26006c.m102052e(imageView);
        }
        C23653o c23653o2 = (C23653o) getMViewBinding();
        if (c23653o2 != null && (appBarLayout = c23653o2.f72269b) != null) {
            appBarLayout.addOnOffsetChangedListener(new AppBarLayout.InterfaceC9956g() { // from class: com.transsion.room.fragment.d0
                @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC9951b
                public final void onOffsetChanged(AppBarLayout appBarLayout2, int i11) {
                    RoomDetailFragmentNew.m76859Y0(this.f59245a, appBarLayout2, i11);
                }
            });
        }
        C23653o c23653o3 = (C23653o) getMViewBinding();
        if (c23653o3 != null && (appCompatImageView = c23653o3.f72274g) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomDetailFragmentNew.m76860Z0(this.f59249a, view);
                }
            });
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            InterfaceC3224u viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.m97801g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.m942i(viewLifecycleOwner, new C18060b());
        }
        super.initViewData();
        String str = this.mGroupId;
        if (str == null || (logViewConfig = getLogViewConfig()) == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
    }

    @Override // com.transsion.room.fragment.RoomBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        super.initViewModel();
        m76775p0().m77394q().m14851j(this, new C18061c(new Function1() { // from class: com.transsion.room.fragment.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomDetailFragmentNew.m76861a1(this.f59292a, (RoomItem) obj);
            }
        }));
        m76775p0().m77395s().m14851j(this, new C18061c(new Function1() { // from class: com.transsion.room.fragment.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomDetailFragmentNew.m76862b1(this.f59307a, (RoomNet) obj);
            }
        }));
        m76775p0().m77396t().m14851j(this, new C18061c(new Function1() { // from class: com.transsion.room.fragment.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomDetailFragmentNew.m76863c1(this.f59310a, (RoomNet) obj);
            }
        }));
        m76868h1();
        String str = this.mGroupId;
        if (str != null) {
            m76775p0().m77392C(str);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m76877k1() {
        Context context;
        InterfaceC23888a interfaceC23888aM76853R0;
        RoomItem roomItem = this.mRoomDetailItem;
        if (roomItem == null || (context = getContext()) == null || (interfaceC23888aM76853R0 = m76853R0()) == null) {
            return;
        }
        String groupId = roomItem.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        String name = roomItem.getName();
        if (name == null) {
            name = "";
        }
        String avatar = roomItem.getAvatar();
        interfaceC23888aM76853R0.mo75357a(context, groupId, name, avatar != null ? avatar : "");
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        showLoadingView();
        m76854S0();
    }

    @Override // com.transsion.room.fragment.RoomBaseFragment
    /* JADX INFO: renamed from: m0 */
    public Fragment mo76772m0(int position) {
        if (position == 0) {
            InterfaceC23624b interfaceC23624bM76776q0 = m76776q0();
            if (interfaceC23624bM76776q0 != null) {
                return interfaceC23624bM76776q0.mo93478k(this.mGroupId);
            }
            return null;
        }
        InterfaceC23624b interfaceC23624bM76776q1 = m76776q0();
        if (interfaceC23624bM76776q1 != null) {
            return interfaceC23624bM76776q1.mo93472e(this.mGroupId);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n1 */
    public final void m76878n1(PublishResult eventBean) {
        C23653o c23653o;
        AppCompatImageView appCompatImageView;
        this.eventBean = eventBean;
        Integer numValueOf = eventBean != null ? Integer.valueOf(eventBean.getState()) : null;
        if (numValueOf == null || numValueOf.intValue() != 0 || (c23653o = (C23653o) getMViewBinding()) == null || (appCompatImageView = c23653o.f72275h) == null) {
            return;
        }
        appCompatImageView.postDelayed(new Runnable() { // from class: com.transsion.room.fragment.x
            @Override // java.lang.Runnable
            public final void run() {
                RoomDetailFragmentNew.m76873o1(this.f59303a);
            }
        }, 1500L);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("room_detail", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        m76854S0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.room.fragment.RoomBaseFragment
    /* JADX INFO: renamed from: u0 */
    public MagicIndicator mo76779u0() {
        C23653o c23653o = (C23653o) getMViewBinding();
        if (c23653o != null) {
            return c23653o.f72280m;
        }
        return null;
    }

    @Override // com.transsion.room.fragment.RoomBaseFragment
    /* JADX INFO: renamed from: v0 */
    public void mo76780v0(int position) {
    }

    @Override // com.transsion.room.fragment.RoomBaseFragment
    /* JADX INFO: renamed from: x0 */
    public void mo76782x0(RoomHomeTabTitleView tabView, int index, List tabList) {
        Intrinsics.m97802h(tabView, "tabView");
        Intrinsics.m97802h(tabList, "tabList");
        tabView.setTitle((String) tabList.get(index));
    }

    @Override // com.transsion.room.fragment.RoomBaseFragment
    /* JADX INFO: renamed from: y0, reason: from getter */
    public List getMTabs() {
        return this.mTabs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.room.fragment.RoomBaseFragment
    /* JADX INFO: renamed from: z0 */
    public ViewPager2 mo76784z0() {
        C23653o c23653o = (C23653o) getMViewBinding();
        if (c23653o != null) {
            return c23653o.f72287t;
        }
        return null;
    }
}
