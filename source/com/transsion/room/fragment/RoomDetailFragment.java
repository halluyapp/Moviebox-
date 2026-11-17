package com.transsion.room.fragment;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.AbstractC2397b;
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
import androidx.viewpager2.widget.ViewPager2;
import ck.C5127x;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.CheckInAnimationView;
import com.p282tn.lib.view.ToolBarCheckInAnimationView;
import com.p282tn.lib.view.expand.ExpandView;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$mipmap;
import com.therouter.TheRouter;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.widget.PileLayout;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.moviedetailapi.bean.RoomNet;
import com.transsion.publish.view.PublishStateView;
import com.transsion.room.R$drawable;
import com.transsion.room.R$string;
import com.transsion.room.activity.CreateRoomActivity;
import com.transsion.room.adapter.C18038c;
import com.transsion.room.viewmodel.RoomDetailViewModel;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.usercenterapi.ReportType;
import com.transsion.web.api.WebConstants;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23652n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p344db.C22966n;
import p393f.C23284j;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p550kj.C24655b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 o2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002>pB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0013\u0010\n\u001a\u00020\u0005*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J)\u0010-\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\"H\u0016¢\u0006\u0004\b/\u0010$J\u0017\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0019H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0005H\u0016¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u00020\u0005H\u0016¢\u0006\u0004\b7\u0010\u0004J\u000f\u00108\u001a\u00020\u0005H\u0016¢\u0006\u0004\b8\u0010\u0004J\u000f\u00109\u001a\u00020\u0005H\u0016¢\u0006\u0004\b9\u0010\u0004J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0005H\u0016¢\u0006\u0004\b=\u0010\u0004R\u0016\u0010@\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0018\u0010L\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010BR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001d\u0010d\u001a\u0004\u0018\u00010`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010X\u001a\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010?R\u0016\u0010l\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010BR\u0016\u0010n\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010B¨\u0006q"}, m97100d2 = {"Lcom/transsion/room/fragment/RoomDetailFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lgq/n;", "<init>", "()V", "", "D0", "N0", "H0", "Lcom/tn/lib/view/CheckInAnimationView;", "B0", "(Lcom/tn/lib/view/CheckInAnimationView;)V", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "roomItem", "c1", "(Lcom/transsion/moviedetailapi/bean/RoomItem;)V", "Landroid/view/View;", "tvCheckIn", "Landroid/widget/TextView;", "tvEdit", "X0", "(Landroid/view/View;Landroid/widget/TextView;)V", "C0", "V0", "b1", "", "coverUrl", "Z0", "(Ljava/lang/String;)V", "", RequestParameters.POSITION, "F0", "(I)Ljava/lang/String;", "U0", "", "checkLogin", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "isAudioShowNoNetworkLayout", "Landroid/view/LayoutInflater;", "inflater", "G0", "(Landroid/view/LayoutInflater;)Lgq/n;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "loadDefaultData", "a", "I", "mTabSelectIndex", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Z", "isNeedShowLoginActivity", "Landroidx/activity/result/b;", "c", "Landroidx/activity/result/b;", "loginLaunch", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "updateInfoLaunch", "e", "Ljava/lang/String;", "mGroupId", "f", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "mRoomDetailItem", "Lcom/transsion/share/share/ShareDialogFragment;", "g", "Lcom/transsion/share/share/ShareDialogFragment;", "mShareDialog", "h", "netResultSuccess", "Lcom/transsion/room/viewmodel/RoomDetailViewModel;", "i", "Lkotlin/Lazy;", "E0", "()Lcom/transsion/room/viewmodel/RoomDetailViewModel;", "roomDetailViewModel", "Ldb/n;", "j", "Ldb/n;", "shapeModel", "Lgz/a;", CampaignEx.JSON_KEY_AD_K, "getLoginApi", "()Lgz/a;", "loginApi", "Lcom/transsion/room/fragment/RoomDetailFragment$CollapsingToolbarLayoutState;", "l", "Lcom/transsion/room/fragment/RoomDetailFragment$CollapsingToolbarLayoutState;", "state", "m", "sz", "n", "dealWith80", "o", "dealWithElse", TtmlNode.TAG_P, "CollapsingToolbarLayoutState", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@Deprecated
@SourceDebugExtension
public final class RoomDetailFragment extends PageStatusFragment<C23652n> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mTabSelectIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isNeedShowLoginActivity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private AbstractC0249b loginLaunch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private AbstractC0249b updateInfoLaunch;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mGroupId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private RoomItem mRoomDetailItem;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private ShareDialogFragment mShareDialog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean netResultSuccess;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy roomDetailViewModel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private C22966n shapeModel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Lazy loginApi;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private CollapsingToolbarLayoutState state;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int sz;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean dealWith80;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean dealWithElse;

    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m97100d2 = {"Lcom/transsion/room/fragment/RoomDetailFragment$CollapsingToolbarLayoutState;", "", "<init>", "(Ljava/lang/String;I)V", "EXPANDED", "COLLAPSED", "INTERNEDIATE", "TOOLBAR", "APPBAR", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    private enum CollapsingToolbarLayoutState {
        EXPANDED,
        COLLAPSED,
        INTERNEDIATE,
        TOOLBAR,
        APPBAR;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m97650a(values());

        public static EnumEntries<CollapsingToolbarLayoutState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragment$b */
    public static final class C18051b implements TabLayout.OnTabSelectedListener {
        C18051b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            TextView textView = (TextView) (tab != null ? tab.getCustomView() : null);
            if (textView != null) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            }
            if (RoomDetailFragment.this.isVisible()) {
                HashMap map = new HashMap();
                String str = RoomDetailFragment.this.mGroupId;
                if (str == null) {
                    str = "";
                }
                map.put("group_id", str);
                map.put("page_tab_name", RoomDetailFragment.this.m76794F0(tab != null ? tab.getPosition() : 0));
                C14450a.f50860a.m65148l("groupdetail", map);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            TextView textView = (TextView) (tab != null ? tab.getCustomView() : null);
            if (textView != null) {
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragment$c */
    public static final class C18052c extends ViewPager2.OnPageChangeCallback {
        C18052c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            super.onPageSelected(i11);
            RoomDetailFragment.this.mTabSelectIndex = i11;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragment$d */
    static final class C18053d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59122a;

        C18053d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59122a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59122a;
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
            this.f59122a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomDetailFragment$e */
    public static final class C18054e implements InterfaceC18701a {
        C18054e() {
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
            if (C14557c.f51100a.m65671a(2, 2000L) || (str = RoomDetailFragment.this.mGroupId) == null) {
                return;
            }
            RoomDetailFragment.this.m76793E0().m77399x(str);
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: e */
        public void mo70525e(String str) {
            InterfaceC18701a.a.m78649c(this, str);
        }
    }

    public RoomDetailFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.room.fragment.RoomDetailFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.roomDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(RoomDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.room.fragment.RoomDetailFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.room.fragment.RoomDetailFragment$special$$inlined$viewModels$default$3
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
        C22966n c22966nM91443m = C22966n.m91391a().m91446q(0, 20.0f).m91445p(C22966n.f70075m).m91443m();
        Intrinsics.m97801g(c22966nM91443m, "build(...)");
        this.shapeModel = c22966nM91443m;
        this.loginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.fragment.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomDetailFragment.m76807T0();
            }
        });
        this.sz = AbstractC5776a0.m27313a(20.0f);
    }

    /* JADX INFO: renamed from: B0 */
    private final void m76790B0(CheckInAnimationView checkInAnimationView) {
        String str;
        int currentState = checkInAnimationView.getCurrentState();
        if (currentState == 2 || currentState == 4) {
            return;
        }
        if (currentState == 1) {
            checkInAnimationView.upDateState(2);
            m76791C0();
        } else {
            if (currentState != 3) {
                return;
            }
            checkInAnimationView.upDateState(4);
            if (C14557c.f51100a.m65671a(2, 2000L) || (str = this.mGroupId) == null) {
                return;
            }
            m76793E0().m77399x(str);
        }
    }

    /* JADX INFO: renamed from: C0 */
    private final void m76791C0() {
        RoomItem roomItem;
        String groupId;
        ToolBarCheckInAnimationView toolBarCheckInAnimationView;
        CheckInAnimationView checkInAnimationView;
        if (!checkLogin() || C14557c.f51100a.m65671a(1, 2000L) || (roomItem = this.mRoomDetailItem) == null || (groupId = roomItem.getGroupId()) == null) {
            return;
        }
        m76793E0().m77398w(groupId);
        C23652n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (checkInAnimationView = mViewBinding.f72261t) != null) {
            checkInAnimationView.upDateState(2);
        }
        C23652n mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (toolBarCheckInAnimationView = mViewBinding2.f72259r) != null) {
            toolBarCheckInAnimationView.upDateState(2);
        }
        m76792D0();
        C14450a.f50860a.m65145h("groupdetail", "checkin", (60 & 4) != 0 ? "" : this.mGroupId, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
    }

    /* JADX INFO: renamed from: D0 */
    private final void m76792D0() {
        String str = this.mGroupId;
        if (str != null) {
            m76793E0().m77393p(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public final RoomDetailViewModel m76793E0() {
        return (RoomDetailViewModel) this.roomDetailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public final String m76794F0(int position) {
        String string = getString(position == 0 ? R$string.hot : R$string.s_new);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: H0 */
    private final void m76795H0() {
        AppBarLayout appBarLayout;
        PublishStateView publishStateView;
        AppCompatImageView appCompatImageView;
        C23652n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatImageView = mViewBinding.f72247f) != null) {
            appCompatImageView.setImageResource(R$mipmap.icon_white_back);
        }
        C23652n mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (publishStateView = mViewBinding2.f72249h) != null) {
            publishStateView.setImageResource(R$mipmap.libui_ic_base_whit_publish);
        }
        C23652n mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (appBarLayout = mViewBinding3.f72243b) == null) {
            return;
        }
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.InterfaceC9956g() { // from class: com.transsion.room.fragment.i
            @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC9951b
            public final void onOffsetChanged(AppBarLayout appBarLayout2, int i11) {
                RoomDetailFragment.m76796I0(this.f59258a, appBarLayout2, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: I0 */
    public static final void m76796I0(RoomDetailFragment roomDetailFragment, AppBarLayout appBarLayout, int i11) {
        AppCompatTextView appCompatTextView;
        TextView textView;
        ToolBarCheckInAnimationView toolBarCheckInAnimationView;
        ShapeableImageView shapeableImageView;
        PublishStateView publishStateView;
        PublishStateView publishStateView2;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        Toolbar toolbar;
        Toolbar toolbar2;
        Toolbar toolbar3;
        Toolbar toolbar4;
        ViewGroup.LayoutParams layoutParams;
        PublishStateView publishStateView3;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        PublishStateView publishStateView4;
        AppCompatTextView appCompatTextView2;
        ShapeableImageView shapeableImageView2;
        PublishStateView publishStateView5;
        AppCompatImageView appCompatImageView5;
        AppCompatImageView appCompatImageView6;
        Toolbar toolbar5;
        Toolbar toolbar6;
        Toolbar toolbar7;
        Toolbar toolbar8;
        ViewGroup.LayoutParams layoutParams2;
        if (i11 == 0) {
            roomDetailFragment.state = CollapsingToolbarLayoutState.EXPANDED;
            return;
        }
        if (Math.abs(i11) >= appBarLayout.getTotalScrollRange()) {
            roomDetailFragment.state = CollapsingToolbarLayoutState.COLLAPSED;
            return;
        }
        roomDetailFragment.state = CollapsingToolbarLayoutState.INTERNEDIATE;
        if (Math.abs(i11) <= AbstractC5776a0.m27313a(80.0f)) {
            if (roomDetailFragment.dealWithElse) {
                return;
            }
            roomDetailFragment.dealWithElse = true;
            roomDetailFragment.dealWith80 = false;
            roomDetailFragment.state = CollapsingToolbarLayoutState.APPBAR;
            C23652n mViewBinding = roomDetailFragment.getMViewBinding();
            if (mViewBinding != null && (toolbar4 = mViewBinding.f72256o) != null && (layoutParams = toolbar4.getLayoutParams()) != null) {
                layoutParams.height = AbstractC5776a0.m27313a(44.0f);
            }
            C23652n mViewBinding2 = roomDetailFragment.getMViewBinding();
            if (mViewBinding2 != null && (toolbar3 = mViewBinding2.f72256o) != null) {
                toolbar3.setPadding(0, 0, 0, 0);
            }
            C23652n mViewBinding3 = roomDetailFragment.getMViewBinding();
            ViewGroup.LayoutParams layoutParams3 = (mViewBinding3 == null || (toolbar2 = mViewBinding3.f72256o) == null) ? null : toolbar2.getLayoutParams();
            if (layoutParams3 instanceof CollapsingToolbarLayout.C9959c) {
                ((FrameLayout.LayoutParams) ((CollapsingToolbarLayout.C9959c) layoutParams3)).topMargin = AbstractC5781d.m27351c();
            }
            C23652n mViewBinding4 = roomDetailFragment.getMViewBinding();
            if (mViewBinding4 != null && (toolbar = mViewBinding4.f72256o) != null) {
                toolbar.setBackgroundResource(R$color.transparent);
            }
            C23652n mViewBinding5 = roomDetailFragment.getMViewBinding();
            if (mViewBinding5 != null && (appCompatImageView2 = mViewBinding5.f72247f) != null) {
                appCompatImageView2.setImageResource(R$mipmap.icon_white_back);
            }
            C23652n mViewBinding6 = roomDetailFragment.getMViewBinding();
            if (mViewBinding6 != null && (appCompatImageView = mViewBinding6.f72252k) != null) {
                appCompatImageView.setImageResource(R$mipmap.libui_ic_base_whit_share);
            }
            C23652n mViewBinding7 = roomDetailFragment.getMViewBinding();
            if (mViewBinding7 != null && (publishStateView2 = mViewBinding7.f72249h) != null) {
                publishStateView2.setImageResource(R$mipmap.libui_ic_base_whit_publish);
            }
            C23652n mViewBinding8 = roomDetailFragment.getMViewBinding();
            if (mViewBinding8 != null && (publishStateView = mViewBinding8.f72249h) != null) {
                publishStateView.setProgressColor(Color.parseColor("#FF5ABF"));
            }
            C23652n mViewBinding9 = roomDetailFragment.getMViewBinding();
            CheckInAnimationView checkInAnimationView = mViewBinding9 != null ? mViewBinding9.f72261t : null;
            C23652n mViewBinding10 = roomDetailFragment.getMViewBinding();
            roomDetailFragment.m76811X0(checkInAnimationView, mViewBinding10 != null ? mViewBinding10.f72262u : null);
            C23652n mViewBinding11 = roomDetailFragment.getMViewBinding();
            if (mViewBinding11 != null && (shapeableImageView = mViewBinding11.f72248g) != null) {
                AbstractC26006c.m102054g(shapeableImageView);
            }
            C23652n mViewBinding12 = roomDetailFragment.getMViewBinding();
            if (mViewBinding12 != null && (toolBarCheckInAnimationView = mViewBinding12.f72259r) != null) {
                AbstractC26006c.m102054g(toolBarCheckInAnimationView);
            }
            C23652n mViewBinding13 = roomDetailFragment.getMViewBinding();
            if (mViewBinding13 != null && (textView = mViewBinding13.f72260s) != null) {
                AbstractC26006c.m102054g(textView);
            }
            C23652n mViewBinding14 = roomDetailFragment.getMViewBinding();
            if (mViewBinding14 == null || (appCompatTextView = mViewBinding14.f72266y) == null) {
                return;
            }
            AbstractC26006c.m102054g(appCompatTextView);
            return;
        }
        if (roomDetailFragment.dealWith80) {
            return;
        }
        roomDetailFragment.dealWith80 = true;
        roomDetailFragment.dealWithElse = false;
        roomDetailFragment.state = CollapsingToolbarLayoutState.TOOLBAR;
        C23652n mViewBinding15 = roomDetailFragment.getMViewBinding();
        if (mViewBinding15 != null && (toolbar8 = mViewBinding15.f72256o) != null && (layoutParams2 = toolbar8.getLayoutParams()) != null) {
            layoutParams2.height = AbstractC5776a0.m27313a(44.0f) + AbstractC5781d.m27351c();
        }
        C23652n mViewBinding16 = roomDetailFragment.getMViewBinding();
        if (mViewBinding16 != null && (toolbar7 = mViewBinding16.f72256o) != null) {
            toolbar7.setPadding(0, AbstractC5781d.m27351c(), 0, 0);
        }
        C23652n mViewBinding17 = roomDetailFragment.getMViewBinding();
        ViewGroup.LayoutParams layoutParams4 = (mViewBinding17 == null || (toolbar6 = mViewBinding17.f72256o) == null) ? null : toolbar6.getLayoutParams();
        if (layoutParams4 instanceof CollapsingToolbarLayout.C9959c) {
            ((FrameLayout.LayoutParams) ((CollapsingToolbarLayout.C9959c) layoutParams4)).topMargin = 0;
        }
        C23652n mViewBinding18 = roomDetailFragment.getMViewBinding();
        if (mViewBinding18 != null && (toolbar5 = mViewBinding18.f72256o) != null) {
            toolbar5.setBackgroundResource(R$color.bg_01);
        }
        if (C5127x.f17620a.m23969a()) {
            C23652n mViewBinding19 = roomDetailFragment.getMViewBinding();
            if (mViewBinding19 != null && (appCompatImageView6 = mViewBinding19.f72247f) != null) {
                appCompatImageView6.setImageResource(R$mipmap.icon_white_back);
            }
            C23652n mViewBinding20 = roomDetailFragment.getMViewBinding();
            if (mViewBinding20 != null && (appCompatImageView5 = mViewBinding20.f72252k) != null) {
                appCompatImageView5.setImageResource(R$mipmap.libui_ic_base_whit_share);
            }
            C23652n mViewBinding21 = roomDetailFragment.getMViewBinding();
            if (mViewBinding21 != null && (publishStateView5 = mViewBinding21.f72249h) != null) {
                publishStateView5.setImageResource(R$mipmap.libui_ic_base_whit_publish);
            }
        } else {
            C23652n mViewBinding22 = roomDetailFragment.getMViewBinding();
            if (mViewBinding22 != null && (appCompatImageView4 = mViewBinding22.f72247f) != null) {
                appCompatImageView4.setImageResource(R$mipmap.libui_ic_base_black_left);
            }
            C23652n mViewBinding23 = roomDetailFragment.getMViewBinding();
            if (mViewBinding23 != null && (appCompatImageView3 = mViewBinding23.f72252k) != null) {
                appCompatImageView3.setImageResource(R$mipmap.libui_ic_base_black_share);
            }
            C23652n mViewBinding24 = roomDetailFragment.getMViewBinding();
            if (mViewBinding24 != null && (publishStateView3 = mViewBinding24.f72249h) != null) {
                publishStateView3.setImageResource(R$mipmap.libui_ic_base_black_publish);
            }
        }
        C23652n mViewBinding25 = roomDetailFragment.getMViewBinding();
        if (mViewBinding25 != null && (shapeableImageView2 = mViewBinding25.f72248g) != null) {
            AbstractC26006c.m102058k(shapeableImageView2);
        }
        C23652n mViewBinding26 = roomDetailFragment.getMViewBinding();
        ToolBarCheckInAnimationView toolBarCheckInAnimationView2 = mViewBinding26 != null ? mViewBinding26.f72259r : null;
        C23652n mViewBinding27 = roomDetailFragment.getMViewBinding();
        roomDetailFragment.m76811X0(toolBarCheckInAnimationView2, mViewBinding27 != null ? mViewBinding27.f72260s : null);
        C23652n mViewBinding28 = roomDetailFragment.getMViewBinding();
        if (mViewBinding28 != null && (appCompatTextView2 = mViewBinding28.f72266y) != null) {
            RoomItem roomItem = roomDetailFragment.mRoomDetailItem;
            appCompatTextView2.setText(roomItem != null ? roomItem.getName() : null);
            AbstractC26006c.m102058k(appCompatTextView2);
        }
        C23652n mViewBinding29 = roomDetailFragment.getMViewBinding();
        if (mViewBinding29 == null || (publishStateView4 = mViewBinding29.f72249h) == null) {
            return;
        }
        publishStateView4.setProgressColor(Color.parseColor(IntegrationConstants.NAVIGATION_BAR_BACKGROUND_COLOR_DEFAULT));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m76797J0(RoomDetailFragment roomDetailFragment, CheckInAnimationView checkInAnimationView, View view) {
        roomDetailFragment.m76790B0(checkInAnimationView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m76798K0(RoomDetailFragment roomDetailFragment, ToolBarCheckInAnimationView toolBarCheckInAnimationView, View view) {
        roomDetailFragment.m76790B0(toolBarCheckInAnimationView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final void m76799L0(RoomDetailFragment roomDetailFragment, ActivityResult it) {
        ToolBarCheckInAnimationView toolBarCheckInAnimationView;
        CheckInAnimationView checkInAnimationView;
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() == -1) {
            roomDetailFragment.m76791C0();
            return;
        }
        C23652n mViewBinding = roomDetailFragment.getMViewBinding();
        if (mViewBinding != null && (checkInAnimationView = mViewBinding.f72261t) != null) {
            checkInAnimationView.upDateState(1);
        }
        C23652n mViewBinding2 = roomDetailFragment.getMViewBinding();
        if (mViewBinding2 == null || (toolBarCheckInAnimationView = mViewBinding2.f72259r) == null) {
            return;
        }
        toolBarCheckInAnimationView.upDateState(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m76800M0(RoomDetailFragment roomDetailFragment, ActivityResult it) {
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() == -1) {
            roomDetailFragment.m76792D0();
        }
    }

    /* JADX INFO: renamed from: N0 */
    private final void m76801N0() {
        C23652n mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(mViewBinding.f72253l.f72189d, mViewBinding.f72267z, new TabLayoutMediator.TabConfigurationStrategy() { // from class: com.transsion.room.fragment.s
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i11) {
                    RoomDetailFragment.m76802O0(this.f59290a, tab, i11);
                }
            });
            mViewBinding.f72253l.f72189d.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C18051b());
            if (mViewBinding.f72267z.getAdapter() != null) {
                tabLayoutMediator.attach();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m76802O0(RoomDetailFragment roomDetailFragment, TabLayout.Tab tab, int i11) {
        Intrinsics.m97802h(tab, "tab");
        TextView textView = new TextView(roomDetailFragment.requireContext());
        String[] strArr = {roomDetailFragment.getString(R$string.hot), roomDetailFragment.getString(R$string.s_new)};
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{AbstractC2397b.getColor(roomDetailFragment.requireContext(), R$color.text_01), AbstractC2397b.getColor(roomDetailFragment.requireContext(), R$color.text_02)});
        textView.setText(strArr[i11]);
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setTextColor(colorStateList);
        tab.setCustomView(textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m76803P0(RoomDetailFragment roomDetailFragment, View view) {
        FragmentActivity activity = roomDetailFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final Unit m76804Q0(RoomDetailFragment roomDetailFragment, RoomItem roomItem) {
        roomDetailFragment.showContentView();
        if (roomItem == null) {
            PageStatusFragment.showEmptyView$default(roomDetailFragment, false, 1, null);
        } else {
            roomDetailFragment.m76816c1(roomItem);
            roomDetailFragment.netResultSuccess = true;
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final Unit m76805R0(RoomDetailFragment roomDetailFragment, RoomNet roomNet) {
        ToolBarCheckInAnimationView toolBarCheckInAnimationView;
        CheckInAnimationView checkInAnimationView;
        CheckInAnimationView checkInAnimationView2;
        ToolBarCheckInAnimationView toolBarCheckInAnimationView2;
        CheckInAnimationView checkInAnimationView3;
        ToolBarCheckInAnimationView toolBarCheckInAnimationView3;
        if (roomNet == null) {
            if (roomDetailFragment.state == CollapsingToolbarLayoutState.INTERNEDIATE) {
                C23652n mViewBinding = roomDetailFragment.getMViewBinding();
                if (mViewBinding != null && (toolBarCheckInAnimationView3 = mViewBinding.f72259r) != null) {
                    toolBarCheckInAnimationView3.setVisibility(0);
                }
            } else {
                C23652n mViewBinding2 = roomDetailFragment.getMViewBinding();
                if (mViewBinding2 != null && (checkInAnimationView2 = mViewBinding2.f72261t) != null) {
                    checkInAnimationView2.setVisibility(0);
                }
            }
            C23652n mViewBinding3 = roomDetailFragment.getMViewBinding();
            if (mViewBinding3 != null && (checkInAnimationView3 = mViewBinding3.f72261t) != null) {
                checkInAnimationView3.upDateState(1);
            }
            C23652n mViewBinding4 = roomDetailFragment.getMViewBinding();
            if (mViewBinding4 != null && (toolBarCheckInAnimationView2 = mViewBinding4.f72259r) != null) {
                toolBarCheckInAnimationView2.upDateState(1);
            }
        } else {
            RoomItem roomItem = roomDetailFragment.mRoomDetailItem;
            if (roomItem != null) {
                roomItem.setHasJoin(Boolean.TRUE);
            }
            C23652n mViewBinding5 = roomDetailFragment.getMViewBinding();
            if (mViewBinding5 != null && (checkInAnimationView = mViewBinding5.f72261t) != null) {
                checkInAnimationView.upDateState(3);
            }
            C23652n mViewBinding6 = roomDetailFragment.getMViewBinding();
            if (mViewBinding6 != null && (toolBarCheckInAnimationView = mViewBinding6.f72259r) != null) {
                toolBarCheckInAnimationView.upDateState(3);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final Unit m76806S0(RoomDetailFragment roomDetailFragment, RoomNet roomNet) {
        if (roomNet != null) {
            roomDetailFragment.m76792D0();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final InterfaceC23704a m76807T0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: U0 */
    private final void m76808U0() {
        C23652n mViewBinding;
        PublishStateView publishStateView;
        RoomItem roomItem = this.mRoomDetailItem;
        if (roomItem == null || (mViewBinding = getMViewBinding()) == null || (publishStateView = mViewBinding.f72249h) == null) {
            return;
        }
        String str = this.mGroupId;
        String str2 = str == null ? "" : str;
        String avatar = roomItem.getAvatar();
        String str3 = avatar == null ? "" : avatar;
        String name = roomItem.getName();
        publishStateView.publishSource(4, (30 & 2) != 0 ? "" : null, (30 & 4) != 0 ? "" : null, (30 & 8) != 0 ? "" : null, (30 & 16) != 0 ? "" : null, (30 & 32) != 0 ? "" : str2, (30 & 64) != 0 ? "" : name == null ? "" : name, (30 & 128) == 0 ? str3 : "", (30 & 256) != 0 ? false : false);
    }

    /* JADX INFO: renamed from: V0 */
    private final void m76809V0() {
        AppCompatImageView appCompatImageView;
        C23652n mViewBinding = getMViewBinding();
        if (mViewBinding == null || (appCompatImageView = mViewBinding.f72252k) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomDetailFragment.m76810W0(this.f59253a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final void m76810W0(RoomDetailFragment roomDetailFragment, View view) {
        ShareDialogFragment shareDialogFragment;
        ShareDialogFragment.Companion companion = ShareDialogFragment.INSTANCE;
        PostType postType = PostType.GROUP_TYPE;
        String str = roomDetailFragment.mGroupId;
        RoomItem roomItem = roomDetailFragment.mRoomDetailItem;
        String creatorId = roomItem != null ? roomItem.getCreatorId() : null;
        String value = ReportType.GROUP.getValue();
        RoomItem roomItem2 = roomDetailFragment.mRoomDetailItem;
        ShareDialogFragment shareDialogFragmentM78645a = companion.m78645a(postType, str, creatorId, value, (3328 & 16) != 0 ? "" : roomItem2 != null ? roomItem2.getName() : null, (3328 & 32) != 0 ? "" : "", (3328 & 64) != 0 ? false : false, (3328 & 128) != 0 ? false : false, (3328 & 256) != 0 ? false : false, "groupdetail", (3328 & 1024) != 0 ? "" : null, (3328 & 2048) != 0 ? "" : null);
        roomDetailFragment.mShareDialog = shareDialogFragmentM78645a;
        if (shareDialogFragmentM78645a != null) {
            shareDialogFragmentM78645a.m78642G0(roomDetailFragment.new C18054e());
        }
        FragmentManager childFragmentManager = roomDetailFragment.getChildFragmentManager();
        childFragmentManager.m14537g0();
        ShareDialogFragment shareDialogFragment2 = roomDetailFragment.mShareDialog;
        if ((shareDialogFragment2 == null || !shareDialogFragment2.isAdded()) && childFragmentManager.m14547k0("share") == null && (shareDialogFragment = roomDetailFragment.mShareDialog) != null) {
            shareDialogFragment.show(childFragmentManager, "share");
        }
        C14450a.f50860a.m65145h("groupdetail", "share", (60 & 4) != 0 ? "" : roomDetailFragment.mGroupId, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
    }

    /* JADX INFO: renamed from: X0 */
    private final void m76811X0(View tvCheckIn, TextView tvEdit) {
        ToolBarCheckInAnimationView toolBarCheckInAnimationView;
        CheckInAnimationView checkInAnimationView;
        ToolBarCheckInAnimationView toolBarCheckInAnimationView2;
        CheckInAnimationView checkInAnimationView2;
        UserInfo userInfoMo90386h;
        RoomItem roomItem = this.mRoomDetailItem;
        if (!TextUtils.isEmpty(roomItem != null ? roomItem.getCreatorId() : null)) {
            InterfaceC23704a loginApi = getLoginApi();
            String userId = (loginApi == null || (userInfoMo90386h = loginApi.mo90386h()) == null) ? null : userInfoMo90386h.getUserId();
            RoomItem roomItem2 = this.mRoomDetailItem;
            if (TextUtils.equals(userId, roomItem2 != null ? roomItem2.getCreatorId() : null)) {
                if (tvCheckIn != null) {
                    AbstractC26006c.m102054g(tvCheckIn);
                }
                if (tvEdit != null) {
                    AbstractC26006c.m102058k(tvEdit);
                }
                if (tvEdit != null) {
                    tvEdit.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            RoomDetailFragment.m76812Y0(this.f59256a, view);
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (tvCheckIn != null) {
            AbstractC26006c.m102058k(tvCheckIn);
        }
        if (tvEdit != null) {
            AbstractC26006c.m102054g(tvEdit);
        }
        RoomItem roomItem3 = this.mRoomDetailItem;
        if (roomItem3 != null ? Intrinsics.m97797c(roomItem3.getHasJoin(), Boolean.TRUE) : false) {
            C23652n mViewBinding = getMViewBinding();
            if (mViewBinding != null && (checkInAnimationView2 = mViewBinding.f72261t) != null) {
                checkInAnimationView2.upDateState(3);
            }
            C23652n mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (toolBarCheckInAnimationView2 = mViewBinding2.f72259r) == null) {
                return;
            }
            toolBarCheckInAnimationView2.upDateState(3);
            return;
        }
        C23652n mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (checkInAnimationView = mViewBinding3.f72261t) != null) {
            checkInAnimationView.upDateState(1);
        }
        C23652n mViewBinding4 = getMViewBinding();
        if (mViewBinding4 == null || (toolBarCheckInAnimationView = mViewBinding4.f72259r) == null) {
            return;
        }
        toolBarCheckInAnimationView.upDateState(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final void m76812Y0(RoomDetailFragment roomDetailFragment, View view) {
        Intent intent = new Intent(roomDetailFragment.requireActivity(), (Class<?>) CreateRoomActivity.class);
        intent.putExtra("field_key", roomDetailFragment.mRoomDetailItem);
        intent.putExtra("field_type", "type_edit");
        AbstractC0249b abstractC0249b = roomDetailFragment.updateInfoLaunch;
        if (abstractC0249b != null) {
            abstractC0249b.m999a(intent);
        }
        C14450a.f50860a.m65145h("groupdetail", "edit_room", (60 & 4) != 0 ? "" : roomDetailFragment.mGroupId, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m76813Z0(String coverUrl) {
        ExpandView expandView;
        ShapeableImageView shapeableImageView;
        ViewGroup.LayoutParams layoutParams;
        C23652n mViewBinding = getMViewBinding();
        Integer numValueOf = (mViewBinding == null || (shapeableImageView = mViewBinding.f72251j) == null || (layoutParams = shapeableImageView.getLayoutParams()) == null) ? null : Integer.valueOf(layoutParams.width);
        C23860f.a aVar = C23860f.f72909a;
        String strM94447e = C23860f.a.m94447e(aVar, coverUrl, numValueOf != null ? numValueOf.intValue() : 0, false, false, 12, null);
        C23652n mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            C23860f.b bVarM94468g = aVar.m94457m(contextRequireContext).m94468g(coverUrl);
            ShapeableImageView ivRoomCover = mViewBinding2.f72251j;
            Intrinsics.m97801g(ivRoomCover, "ivRoomCover");
            bVarM94468g.m94465d(ivRoomCover);
            Context contextRequireContext2 = requireContext();
            Intrinsics.m97801g(contextRequireContext2, "requireContext(...)");
            C23860f.b bVarM94468g2 = aVar.m94457m(contextRequireContext2).m94468g(coverUrl);
            ShapeableImageView ivCoverSmall = mViewBinding2.f72248g;
            Intrinsics.m97801g(ivCoverSmall, "ivCoverSmall");
            bVarM94468g2.m94465d(ivCoverSmall);
        }
        Glide.with(requireContext()).asBitmap().load2(strM94447e).into(new CustomTarget() { // from class: com.transsion.room.fragment.RoomDetailFragment$showCover$2
            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
            }

            @Override // com.bumptech.glide.request.target.Target
            public void onResourceReady(Bitmap resource, Transition transition) {
                Intrinsics.m97802h(resource, "resource");
                C26866a.a.m104898f(C26866a.f81698a, "RoomDetailFragment", NativeComponentConstants.KEY_COMPONENT_RESULT_SUCCESS, false, 4, null);
                AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f59124a), C25220y0.m99269c(), null, new RoomDetailFragment$showCover$2$onResourceReady$1(resource, this.f59124a, null), 2, null);
            }
        });
        C23652n mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (expandView = mViewBinding3.f72264w) == null) {
            return;
        }
        expandView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.transsion.room.fragment.j
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                RoomDetailFragment.m76814a1(this.f59261a, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m76814a1(RoomDetailFragment roomDetailFragment, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        C23652n mViewBinding = roomDetailFragment.getMViewBinding();
        if (mViewBinding != null) {
            ViewGroup.LayoutParams layoutParams = mViewBinding.f72244c.getLayoutParams();
            int i19 = i14 - i12;
            int i20 = i18 - i16;
            if (layoutParams != null) {
                layoutParams.height += i19 - i20;
            }
            mViewBinding.f72244c.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: b1 */
    private final void m76815b1() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        Long postCount;
        PileLayout pileLayout;
        List<String> memberAvatars;
        List<String> memberAvatars2;
        PileLayout pileLayout2;
        C23652n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (pileLayout2 = mViewBinding.f72254m) != null) {
            pileLayout2.removeAllViews();
        }
        RoomItem roomItem = this.mRoomDetailItem;
        int size = (roomItem == null || (memberAvatars2 = roomItem.getMemberAvatars()) == null) ? 0 : memberAvatars2.size();
        for (int i11 = 0; i11 < size; i11++) {
            RoomItem roomItem2 = this.mRoomDetailItem;
            String str = (roomItem2 == null || (memberAvatars = roomItem2.getMemberAvatars()) == null) ? null : memberAvatars.get(i11);
            ShapeableImageView shapeableImageView = new ShapeableImageView(getContext());
            shapeableImageView.setShapeAppearanceModel(this.shapeModel);
            if (str != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context contextRequireContext = requireContext();
                Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
                aVar.m94457m(contextRequireContext).m94468g(str).m94470i(R$drawable.ic_avatar_default).m94474m(this.sz).m94464c(this.sz).m94465d(shapeableImageView);
            }
            C23652n mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (pileLayout = mViewBinding2.f72254m) != null) {
                int i12 = this.sz;
                pileLayout.addView(shapeableImageView, i12, i12);
            }
        }
        RoomItem roomItem3 = this.mRoomDetailItem;
        long jLongValue = (roomItem3 == null || (postCount = roomItem3.getPostCount()) == null) ? 0L : postCount.longValue();
        if (jLongValue > 0) {
            C23652n mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (appCompatTextView2 = mViewBinding3.f72263v) != null) {
                AbstractC26006c.m102058k(appCompatTextView2);
            }
            C23652n mViewBinding4 = getMViewBinding();
            if (mViewBinding4 == null || (appCompatTextView = mViewBinding4.f72263v) == null) {
                return;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String string = getString(R$string.member_count_check_in);
            Intrinsics.m97801g(string, "getString(...)");
            String str2 = String.format(string, Arrays.copyOf(new Object[]{Long.valueOf(jLongValue)}, 1));
            Intrinsics.m97801g(str2, "format(...)");
            appCompatTextView.setText(str2);
        }
    }

    /* JADX INFO: renamed from: c1 */
    private final void m76816c1(RoomItem roomItem) {
        HashMap mapM96844g;
        String avatar;
        ExpandView expandView;
        AppCompatTextView appCompatTextView;
        this.mRoomDetailItem = roomItem;
        if (TextUtils.equals(roomItem.getLevel(), "LIMIT") && C14496b.f50966a.m65344b().getBoolean("adult_restricted", true)) {
            new AdultRestrictedDialogFragment().show(requireActivity().getSupportFragmentManager(), "AdultRestrictedDialogFragment");
        }
        C23652n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatTextView = mViewBinding.f72265x) != null) {
            appCompatTextView.setText(roomItem.getName());
        }
        C23652n mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (expandView = mViewBinding2.f72264w) != null) {
            RoomItem roomItem2 = this.mRoomDetailItem;
            expandView.m62195m(roomItem2 != null ? roomItem2.getDescription() : null);
        }
        CollapsingToolbarLayoutState collapsingToolbarLayoutState = this.state;
        if (collapsingToolbarLayoutState == CollapsingToolbarLayoutState.INTERNEDIATE || collapsingToolbarLayoutState == CollapsingToolbarLayoutState.COLLAPSED) {
            C23652n mViewBinding3 = getMViewBinding();
            ToolBarCheckInAnimationView toolBarCheckInAnimationView = mViewBinding3 != null ? mViewBinding3.f72259r : null;
            C23652n mViewBinding4 = getMViewBinding();
            m76811X0(toolBarCheckInAnimationView, mViewBinding4 != null ? mViewBinding4.f72260s : null);
        } else {
            C23652n mViewBinding5 = getMViewBinding();
            CheckInAnimationView checkInAnimationView = mViewBinding5 != null ? mViewBinding5.f72261t : null;
            C23652n mViewBinding6 = getMViewBinding();
            m76811X0(checkInAnimationView, mViewBinding6 != null ? mViewBinding6.f72262u : null);
        }
        m76815b1();
        RoomItem roomItem3 = this.mRoomDetailItem;
        if (roomItem3 != null && (avatar = roomItem3.getAvatar()) != null) {
            m76813Z0(avatar);
        }
        m76801N0();
        m76793E0().m77397v(roomItem);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null && (mapM96844g = logViewConfig2.m96844g()) != null) {
            RoomItem roomItem4 = this.mRoomDetailItem;
            mapM96844g.put("group_id", roomItem4 != null ? roomItem4.getGroupId() : null);
        }
        m76809V0();
        m76808U0();
    }

    private final boolean checkLogin() {
        Intent intentMo90394p;
        AbstractC0249b abstractC0249b;
        InterfaceC23704a loginApi = getLoginApi();
        if (loginApi == null || loginApi.mo90379a()) {
            return true;
        }
        if (this.loginLaunch == null) {
            this.isNeedShowLoginActivity = true;
        }
        Context context = getContext();
        if (context == null || (intentMo90394p = loginApi.mo90394p(context)) == null || (abstractC0249b = this.loginLaunch) == null) {
            return false;
        }
        abstractC0249b.m999a(intentMo90394p);
        return false;
    }

    private final InterfaceC23704a getLoginApi() {
        return (InterfaceC23704a) this.loginApi.getValue();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public C23652n getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23652n c23652nM93558c = C23652n.m93558c(inflater);
        Intrinsics.m97801g(c23652nM93558c, "inflate(...)");
        return c23652nM93558c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        final ToolBarCheckInAnimationView toolBarCheckInAnimationView;
        final CheckInAnimationView checkInAnimationView;
        this.loginLaunch = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.room.fragment.k
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                RoomDetailFragment.m76799L0(this.f59263a, (ActivityResult) obj);
            }
        });
        this.updateInfoLaunch = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.room.fragment.l
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                RoomDetailFragment.m76800M0(this.f59266a, (ActivityResult) obj);
            }
        });
        C23652n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (checkInAnimationView = mViewBinding.f72261t) != null) {
            checkInAnimationView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomDetailFragment.m76797J0(this.f59269a, checkInAnimationView, view);
                }
            });
        }
        C23652n mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (toolBarCheckInAnimationView = mViewBinding2.f72259r) != null) {
            toolBarCheckInAnimationView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomDetailFragment.m76798K0(this.f59273a, toolBarCheckInAnimationView, view);
                }
            });
        }
        m76808U0();
        m76809V0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        AppCompatImageView appCompatImageView;
        Toolbar toolbar;
        pageStateFitStatusBar();
        C23652n mViewBinding = getMViewBinding();
        ViewGroup.LayoutParams layoutParams = (mViewBinding == null || (toolbar = mViewBinding.f72256o) == null) ? null : toolbar.getLayoutParams();
        if (layoutParams instanceof CollapsingToolbarLayout.C9959c) {
            ((FrameLayout.LayoutParams) ((CollapsingToolbarLayout.C9959c) layoutParams)).topMargin = AbstractC5781d.m27351c();
        }
        C23652n mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatImageView = mViewBinding2.f72247f) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomDetailFragment.m76803P0(this.f59277a, view);
                }
            });
        }
        C23652n mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null) {
            mViewBinding3.f72267z.setAdapter(new C18038c(this.mGroupId, this));
            mViewBinding3.f72267z.registerOnPageChangeCallback(new C18052c());
            m76801N0();
        }
        m76795H0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        RoomDetailViewModel roomDetailViewModelM76793E0 = m76793E0();
        roomDetailViewModelM76793E0.m77394q().m14851j(this, new C18053d(new Function1() { // from class: com.transsion.room.fragment.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomDetailFragment.m76804Q0(this.f59280a, (RoomItem) obj);
            }
        }));
        roomDetailViewModelM76793E0.m77395s().m14851j(this, new C18053d(new Function1() { // from class: com.transsion.room.fragment.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomDetailFragment.m76805R0(this.f59283a, (RoomNet) obj);
            }
        }));
        roomDetailViewModelM76793E0.m77396t().m14851j(this, new C18053d(new Function1() { // from class: com.transsion.room.fragment.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomDetailFragment.m76806S0(this.f59286a, (RoomNet) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        showLoadingView();
        m76792D0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("groupdetail", false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            m76792D0();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String groupId;
        super.onCreate(savedInstanceState);
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
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
