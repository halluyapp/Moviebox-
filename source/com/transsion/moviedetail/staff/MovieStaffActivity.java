package com.transsion.moviedetail.staff;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5127x;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5790i;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$mipmap;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.report.C14492k;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetail.p1001enum.SeenStatus;
import com.transsion.moviedetail.staff.bean.MovieStaffList;
import com.transsion.moviedetail.staff.bean.MovieStaffSubject;
import com.transsion.moviedetail.staff.bean.MovieStaffSubjectList;
import com.transsion.moviedetail.view.InfoExtendView;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.StaffType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.ninegridview.ImageInfo;
import com.transsion.ninegridview.helper.FileHelper;
import com.transsion.ninegridview.preview.ImagePreviewActivity;
import com.transsion.postdetail.bean.Pager;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.usercenter.R$string;
import com.transsion.usercenterapi.ReportType;
import com.transsnet.downloader.DownloadManagerApi;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23595c;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p550kj.C24655b;
import p581ln.C25651a;
import p669p1.AbstractC26781a;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p944yh.C28951b;
import pg.C26866a;
import sh.C27616c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0019\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010\u0004J+\u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020$H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0005H\u0002¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\u0005H\u0002¢\u0006\u0004\b/\u0010\u0004J\u0019\u00101\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b5\u0010\nJ\u000f\u00106\u001a\u00020\u0005H\u0014¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u00020\u0015H\u0016¢\u0006\u0004\b7\u0010 J\u000f\u00108\u001a\u00020\u0015H\u0016¢\u0006\u0004\b8\u0010 J\u0011\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0005H\u0016¢\u0006\u0004\b<\u0010\u0004J\u001f\u0010A\u001a\u00020\u00052\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0007H\u0014¢\u0006\u0004\bD\u0010\nJ\u000f\u0010E\u001a\u00020\u0005H\u0016¢\u0006\u0004\bE\u0010\u0004J\u000f\u0010F\u001a\u00020\u0005H\u0016¢\u0006\u0004\bF\u0010\u0004R\u0018\u0010I\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001b\u0010O\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010k\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010m\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010jR\u0016\u0010o\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010jR\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR*\u0010x\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001b0tj\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b`u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010w¨\u0006y"}, m97100d2 = {"Lcom/transsion/moviedetail/staff/MovieStaffActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lgn/c;", "<init>", "()V", "", "initData", "Landroid/os/Bundle;", "savedInstanceState", "N0", "(Landroid/os/Bundle;)V", "Lcom/transsion/moviedetail/staff/bean/MovieStaffSubjectList;", "it", "y0", "(Lcom/transsion/moviedetail/staff/bean/MovieStaffSubjectList;)V", "u0", "Lcom/transsion/moviedetailapi/bean/Staff;", "info", "Y0", "(Lcom/transsion/moviedetailapi/bean/Staff;)V", "z0", "", "isExpanded", "V0", "(Z)V", "F0", "I0", "", "module", "U0", "(Ljava/lang/String;)V", "S0", "()Z", "d1", "W0", "t0", "", RequestParameters.POSITION, "Lkotlin/Pair;", "", "", "data", "T0", "(ILkotlin/Pair;)V", "w0", "()I", "b1", "c1", "itemCount", "X0", "(Ljava/lang/Integer;)V", "x0", "()Lgn/c;", "onCreate", "onDestroy", "isTranslucent", "isStatusDark", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDisconnected", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "outState", "onSaveInstanceState", "onPause", "onResume", "a", "Ljava/lang/String;", "id", "Lcom/transsion/moviedetail/staff/y;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "v0", "()Lcom/transsion/moviedetail/staff/y;", "mMovieStaffViewModel", "Lcom/transsion/moviedetail/staff/s;", "c", "Lcom/transsion/moviedetail/staff/s;", "mMovieStaffAdapter", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/moviedetailapi/bean/Staff;", "staff", "e", "Ljava/lang/Integer;", "staffType", "f", "I", "showCount", "Lcom/transsion/moviedetail/staff/w;", "g", "Lcom/transsion/moviedetail/staff/w;", "mMovieStaffSubRecyclerVIewScrollListener", "Lcom/transsion/moviedetail/staff/v;", "h", "Lcom/transsion/moviedetail/staff/v;", "mMovieStaffScrollListener", "Lln/a;", "i", "Lln/a;", "mMovieStaffItemMore", "j", "Z", "mIsLoadFinish", CampaignEx.JSON_KEY_AD_K, "dealWith80", "l", "dealWithElse", "Lcom/transsion/share/share/ShareDialogFragment;", "m", "Lcom/transsion/share/share/ShareDialogFragment;", "mShareDialog", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "n", "Ljava/util/HashSet;", "subjectIdSet", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MovieStaffActivity extends BaseActivity<C23595c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mMovieStaffViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C16141s mMovieStaffAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Staff staff;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Integer staffType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C16145w mMovieStaffSubRecyclerVIewScrollListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private C16144v mMovieStaffScrollListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C25651a mMovieStaffItemMore;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean mIsLoadFinish;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean dealWith80;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean dealWithElse;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private ShareDialogFragment mShareDialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int showCount = 9;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private HashSet subjectIdSet = new HashSet();

    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.MovieStaffActivity$a */
    public static final class C16120a extends GridLayoutManager.AbstractC4187c {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f54840f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f54841g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ int f54842h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ int f54843i;

        C16120a(int i11, int i12, int i13, int i14) {
            this.f54840f = i11;
            this.f54841g = i12;
            this.f54842h = i13;
            this.f54843i = i14;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC4187c
        /* JADX INFO: renamed from: f */
        public int mo20742f(int i11) {
            if (i11 < 0) {
                return this.f54843i;
            }
            C16141s c16141s = MovieStaffActivity.this.mMovieStaffAdapter;
            if (c16141s == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
                c16141s = null;
            }
            if (!(c16141s.getItem(i11) instanceof Subject)) {
                return this.f54843i;
            }
            int i12 = this.f54840f;
            int i13 = i11 % i12;
            return (i13 == 0 || i13 == i12 + (-1)) ? this.f54841g + this.f54842h : this.f54841g;
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.MovieStaffActivity$b */
    static final class C16121b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54844a;

        C16121b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54844a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54844a;
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
            this.f54844a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.MovieStaffActivity$c */
    public static final class C16122c implements InterfaceC18701a {
        C16122c() {
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
            Intrinsics.m97802h(id2, "id");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: e */
        public void mo70525e(String str) {
            InterfaceC18701a.a.m78649c(this, str);
        }
    }

    public MovieStaffActivity() {
        final Function0 function0 = null;
        this.mMovieStaffViewModel = new ViewModelLazy(Reflection.m97823b(C16147y.class), new Function0<C3231x0>() { // from class: com.transsion.moviedetail.staff.MovieStaffActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.moviedetail.staff.MovieStaffActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<AbstractC26781a>() { // from class: com.transsion.moviedetail.staff.MovieStaffActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final AbstractC26781a invoke() {
                AbstractC26781a abstractC26781a;
                Function0 function1 = function0;
                return (function1 == null || (abstractC26781a = (AbstractC26781a) function1.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : abstractC26781a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A0 */
    public static final void m70671A0(MovieStaffActivity movieStaffActivity, AppBarLayout appBarLayout, int i11) {
        C16144v c16144v = movieStaffActivity.mMovieStaffScrollListener;
        if (c16144v != null) {
            Intrinsics.m97799e(appBarLayout);
            c16144v.m70738d(appBarLayout, i11);
        }
        if (Math.abs(i11) <= AbstractC5776a0.m27313a(260.0f)) {
            if (movieStaffActivity.dealWithElse) {
                return;
            }
            movieStaffActivity.dealWithElse = true;
            movieStaffActivity.dealWith80 = false;
            movieStaffActivity.m70692V0(true);
            C23595c c23595c = (C23595c) movieStaffActivity.getMViewBinding();
            ShapeableImageView ivCoverSmall = c23595c.f71904f;
            Intrinsics.m97801g(ivCoverSmall, "ivCoverSmall");
            AbstractC26006c.m102054g(ivCoverSmall);
            AppCompatTextView tvTitle = c23595c.f71916r;
            Intrinsics.m97801g(tvTitle, "tvTitle");
            AbstractC26006c.m102054g(tvTitle);
            c23595c.f71905g.setSelected(false);
            c23595c.f71911m.setBackgroundResource(R$color.transparent);
            c23595c.f71903e.setImageResource(R$mipmap.icon_white_back);
            Log.e("zxb_log_download", "initAppBar: setDownloadIcon  333333");
            c23595c.f71906h.setImageResource(com.transsion.moviedetail.R$mipmap.movie_share_night);
            ImmersionBar immersionBarWith = ImmersionBar.with(movieStaffActivity);
            immersionBarWith.statusBarDarkFont(false);
            immersionBarWith.init();
            return;
        }
        if (movieStaffActivity.dealWith80) {
            return;
        }
        movieStaffActivity.dealWith80 = true;
        movieStaffActivity.dealWithElse = false;
        movieStaffActivity.m70692V0(false);
        C23595c c23595c2 = (C23595c) movieStaffActivity.getMViewBinding();
        ShapeableImageView ivCoverSmall2 = c23595c2.f71904f;
        Intrinsics.m97801g(ivCoverSmall2, "ivCoverSmall");
        AbstractC26006c.m102058k(ivCoverSmall2);
        AppCompatTextView tvTitle2 = c23595c2.f71916r;
        Intrinsics.m97801g(tvTitle2, "tvTitle");
        AbstractC26006c.m102058k(tvTitle2);
        c23595c2.f71905g.setSelected(true);
        if (C5127x.f17620a.m23969a()) {
            c23595c2.f71911m.setBackgroundResource(R$color.gray_0);
            c23595c2.f71903e.setImageResource(R$mipmap.icon_white_back);
            AppCompatTextView appCompatTextView = c23595c2.f71916r;
            appCompatTextView.setTextColor(AbstractC2397b.getColor(appCompatTextView.getContext(), R$color.white));
            Log.e("zxb_log_download", "initAppBar: setDownloadIcon  11111");
            c23595c2.f71906h.setImageResource(com.transsion.moviedetail.R$mipmap.movie_share_night);
            ImmersionBar immersionBarWith2 = ImmersionBar.with(movieStaffActivity);
            immersionBarWith2.statusBarDarkFont(false);
            immersionBarWith2.init();
            return;
        }
        c23595c2.f71911m.setBackgroundResource(R$color.white);
        c23595c2.f71903e.setImageResource(com.transsion.baseui.R$mipmap.movie_detail_icon_black_back);
        AppCompatTextView appCompatTextView2 = c23595c2.f71916r;
        appCompatTextView2.setTextColor(AbstractC2397b.getColor(appCompatTextView2.getContext(), R$color.text_01));
        Log.e("zxb_log_download", "initAppBar: setDownloadIcon   22222");
        c23595c2.f71906h.setImageResource(com.transsion.moviedetail.R$mipmap.movie_share_light);
        ImmersionBar immersionBarWith3 = ImmersionBar.with(movieStaffActivity);
        immersionBarWith3.statusBarDarkFont(true);
        immersionBarWith3.init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final Unit m70672B0(MovieStaffActivity movieStaffActivity, int i11, int i12) {
        C16145w c16145w = movieStaffActivity.mMovieStaffSubRecyclerVIewScrollListener;
        if (c16145w != null) {
            c16145w.m70745d(i11, i12);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final Unit m70673C0(MovieStaffActivity movieStaffActivity, int i11, Pair data) {
        Intrinsics.m97802h(data, "data");
        movieStaffActivity.m70690T0(i11, data);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D0 */
    public static final void m70674D0(final MovieStaffActivity movieStaffActivity, BaseQuickAdapter adapter, View view, int i11) {
        String staffId;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        C16141s c16141s = movieStaffActivity.mMovieStaffAdapter;
        C16141s c16141s2 = null;
        C16141s c16141s3 = null;
        if (c16141s == null) {
            Intrinsics.m97819y("mMovieStaffAdapter");
            c16141s = null;
        }
        Object item = c16141s.getItem(i11);
        if (!(item instanceof C25651a)) {
            if (item instanceof Subject) {
                HashMap map = new HashMap();
                map.put("module_name", "subject");
                Subject subject = (Subject) item;
                String subjectId = subject.getSubjectId();
                String str = "";
                if (subjectId == null) {
                    subjectId = "";
                }
                map.put("subject_id", subjectId);
                String ops = subject.getOps();
                if (ops == null) {
                    ops = "";
                }
                map.put("ops", ops);
                Staff staff = movieStaffActivity.staff;
                if (staff != null && (staffId = staff.getStaffId()) != null) {
                    str = staffId;
                }
                map.put("staff_id", str);
                C14450a.f50860a.m65146i("staff_info", map);
                Integer subjectType = subject.getSubjectType();
                int value = SubjectType.SHORT_TV.getValue();
                if (subjectType != null && subjectType.intValue() == value) {
                    DownloadManagerApi.f66480j.m87093a().m87086d0(movieStaffActivity, movieStaffActivity.getPageName(), (384 & 4) != 0 ? "" : "", subject.getOps(), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : false, (384 & 64) != 0 ? null : subject, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                    return;
                }
                Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
                Integer subjectType2 = subject.getSubjectType();
                Navigator.m61845x(navigatorM61773c.m61852F("subject_type", subjectType2 != null ? subjectType2.intValue() : SubjectType.MOVIE.getValue()).m61857K("id", subject.getSubjectId()).m61857K("ops", subject.getOps()), movieStaffActivity, null, 2, null);
                return;
            }
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C13806h.f49015a.m62324k(R$string.network_fail);
            return;
        }
        if (!movieStaffActivity.mIsLoadFinish) {
            C16147y c16147yM70721v0 = movieStaffActivity.m70721v0();
            Staff staff2 = movieStaffActivity.staff;
            c16147yM70721v0.m70764q(staff2 != null ? staff2.getStaffId() : null, movieStaffActivity.showCount);
            return;
        }
        C25651a c25651a = movieStaffActivity.mMovieStaffItemMore;
        if (c25651a != null) {
            C16141s c16141s4 = movieStaffActivity.mMovieStaffAdapter;
            if (c16141s4 == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
                c16141s4 = null;
            }
            int iIndexOf = c16141s4.getData().indexOf(c25651a);
            if (c25651a.m100971d()) {
                List listM100969b = c25651a.m100969b();
                if (listM100969b == null) {
                    listM100969b = Collections.emptyList();
                }
                c25651a.m100972e(c25651a.m100968a() + listM100969b.size());
                C16141s c16141s5 = movieStaffActivity.mMovieStaffAdapter;
                if (c16141s5 == null) {
                    Intrinsics.m97819y("mMovieStaffAdapter");
                    c16141s5 = null;
                }
                List<Object> data = c16141s5.getData();
                Intrinsics.m97799e(listM100969b);
                data.addAll(iIndexOf, listM100969b);
                C16141s c16141s6 = movieStaffActivity.mMovieStaffAdapter;
                if (c16141s6 == null) {
                    Intrinsics.m97819y("mMovieStaffAdapter");
                } else {
                    c16141s2 = c16141s6;
                }
                c16141s2.notifyItemRangeChanged(iIndexOf, listM100969b.size() + 1);
                ((C23595c) movieStaffActivity.getMViewBinding()).f71909k.postDelayed(new Runnable() { // from class: com.transsion.moviedetail.staff.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        MovieStaffActivity.m70675E0(this.f54851a);
                    }
                }, 200L);
                return;
            }
            C16144v c16144v = movieStaffActivity.mMovieStaffScrollListener;
            if (c16144v != null) {
                c16144v.m70739e(movieStaffActivity.showCount, iIndexOf);
            }
            ArrayList arrayList = new ArrayList();
            C16141s c16141s7 = movieStaffActivity.mMovieStaffAdapter;
            if (c16141s7 == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
                c16141s7 = null;
            }
            arrayList.addAll(c16141s7.getData().subList(0, movieStaffActivity.showCount));
            C16141s c16141s8 = movieStaffActivity.mMovieStaffAdapter;
            if (c16141s8 == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
                c16141s8 = null;
            }
            List<Object> data2 = c16141s8.getData();
            C16141s c16141s9 = movieStaffActivity.mMovieStaffAdapter;
            if (c16141s9 == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
                c16141s9 = null;
            }
            arrayList.addAll(data2.subList(iIndexOf, c16141s9.getData().size()));
            int iM100968a = c25651a.m100968a();
            C16141s c16141s10 = movieStaffActivity.mMovieStaffAdapter;
            if (c16141s10 == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
                c16141s10 = null;
            }
            c25651a.m100972e(iM100968a - (c16141s10.getData().size() - arrayList.size()));
            C16141s c16141s11 = movieStaffActivity.mMovieStaffAdapter;
            if (c16141s11 == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
                c16141s11 = null;
            }
            c25651a.m100973f(CollectionsKt.m97343U0(c16141s11.getData().subList(movieStaffActivity.showCount, iIndexOf)));
            C16141s c16141s12 = movieStaffActivity.mMovieStaffAdapter;
            if (c16141s12 == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
                c16141s12 = null;
            }
            c16141s12.getData().clear();
            C16141s c16141s13 = movieStaffActivity.mMovieStaffAdapter;
            if (c16141s13 == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
                c16141s13 = null;
            }
            c16141s13.getData().addAll(arrayList);
            C16141s c16141s14 = movieStaffActivity.mMovieStaffAdapter;
            if (c16141s14 == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
            } else {
                c16141s3 = c16141s14;
            }
            c16141s3.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E0 */
    public static final void m70675E0(MovieStaffActivity movieStaffActivity) {
        C16144v c16144v = movieStaffActivity.mMovieStaffScrollListener;
        if (c16144v != null) {
            RecyclerView rv2 = ((C23595c) movieStaffActivity.getMViewBinding()).f71909k;
            Intrinsics.m97801g(rv2, "rv");
            c16144v.onScrolled(rv2, 0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F0 */
    private final void m70676F0() {
        ((C23595c) getMViewBinding()).f71905g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.staff.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MovieStaffActivity.m70677G0(this.f54858a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public static final void m70677G0(MovieStaffActivity movieStaffActivity, View view) {
        movieStaffActivity.m70691U0("save_picture");
        FileHelper fileHelper = FileHelper.f55226a;
        C27616c.a aVar = C27616c.f84741a;
        AppCompatImageView ivStaff = ((C23595c) movieStaffActivity.getMViewBinding()).f71907i;
        Intrinsics.m97801g(ivStaff, "ivStaff");
        Bitmap bitmapM107447a = aVar.m107447a(ivStaff);
        Staff staff = movieStaffActivity.staff;
        fileHelper.m71370r(movieStaffActivity, bitmapM107447a, fileHelper.m71366j(staff != null ? staff.getAvatarUrl() : null), new Function2() { // from class: com.transsion.moviedetail.staff.i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MovieStaffActivity.m70678H0(((Boolean) obj).booleanValue(), (File) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final Unit m70678H0(boolean z11, File file) {
        Intrinsics.m97802h(file, "<unused var>");
        if (z11) {
            C28951b.f88586a.m111454d(com.transsion.ninegridview.R$string.has_been_saved);
        } else {
            C28951b.f88586a.m111454d(com.transsion.ninegridview.R$string.image_save_success);
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    private final void m70679I0() {
        C23595c c23595c = (C23595c) getMViewBinding();
        c23595c.f71903e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.staff.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MovieStaffActivity.m70680J0(this.f54860a, view);
            }
        });
        c23595c.f71906h.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.staff.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MovieStaffActivity.m70681K0(this.f54846a, view);
            }
        });
        c23595c.f71908j.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.staff.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MovieStaffActivity.m70682L0(this.f54847a, view);
            }
        });
        c23595c.f71907i.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.staff.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MovieStaffActivity.m70683M0(this.f54848a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m70680J0(MovieStaffActivity movieStaffActivity, View view) {
        movieStaffActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m70681K0(MovieStaffActivity movieStaffActivity, View view) {
        movieStaffActivity.m70693W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final void m70682L0(MovieStaffActivity movieStaffActivity, View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 1000L)) {
            return;
        }
        movieStaffActivity.m70703d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m70683M0(MovieStaffActivity movieStaffActivity, View view) {
        Staff staff = movieStaffActivity.staff;
        if (staff != null) {
            movieStaffActivity.m70691U0("preview");
            ImageInfo imageInfo = new ImageInfo();
            imageInfo.bigImageUrl = staff.getAvatarUrl();
            ImagePreviewActivity.INSTANCE.m71396a(movieStaffActivity, 0, CollectionsKt.m97511q(imageInfo));
        }
    }

    /* JADX INFO: renamed from: N0 */
    private final void m70684N0(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            m70721v0().m70761n();
            List list = (List) m70721v0().m70767u().m14847f();
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List<MovieStaffSubject> items = ((MovieStaffSubjectList) it.next()).getItems();
                    if (items != null) {
                        arrayList.addAll(items);
                    }
                }
                m70723y0(new MovieStaffSubjectList(arrayList, ((MovieStaffSubjectList) list.get(list.size() - 1)).getPager()));
            }
        }
        m70721v0().m70766t().m14851j(this, new C16121b(new Function1() { // from class: com.transsion.moviedetail.staff.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MovieStaffActivity.m70685O0(this.f54854a, (Staff) obj);
            }
        }));
        m70721v0().m70768v().m14851j(this, new C16121b(new Function1() { // from class: com.transsion.moviedetail.staff.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MovieStaffActivity.m70686P0(this.f54855a, (MovieStaffSubjectList) obj);
            }
        }));
        m70721v0().m70769w().m14851j(this, new C16121b(new Function1() { // from class: com.transsion.moviedetail.staff.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MovieStaffActivity.m70687Q0(this.f54856a, (Integer) obj);
            }
        }));
        m70721v0().m70765s().m14851j(this, new C16121b(new Function1() { // from class: com.transsion.moviedetail.staff.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MovieStaffActivity.m70688R0(this.f54857a, (MovieStaffList) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final Unit m70685O0(MovieStaffActivity movieStaffActivity, Staff staff) {
        movieStaffActivity.m70695Y0(staff);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final Unit m70686P0(MovieStaffActivity movieStaffActivity, MovieStaffSubjectList movieStaffSubjectList) {
        movieStaffActivity.m70723y0(movieStaffSubjectList);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public static final Unit m70687Q0(MovieStaffActivity movieStaffActivity, Integer num) {
        if (num == null) {
            return Unit.f75682a;
        }
        Staff staff = movieStaffActivity.staff;
        if (staff != null) {
            staff.setSeenStatus(num.intValue());
        }
        ((C23595c) movieStaffActivity.getMViewBinding()).f71908j.setImageResource(num.intValue() == 0 ? com.transsion.moviedetail.R$mipmap.movie_staff_icon_want_to_see_white : com.transsion.moviedetail.R$mipmap.movie_detail_icon_want_to_see_selected);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final Unit m70688R0(MovieStaffActivity movieStaffActivity, MovieStaffList movieStaffList) {
        if (movieStaffList != null) {
            List<Staff> items = movieStaffList.getItems();
            if (items != null && !items.isEmpty()) {
                C16141s c16141s = movieStaffActivity.mMovieStaffAdapter;
                C16141s c16141s2 = null;
                if (c16141s == null) {
                    Intrinsics.m97819y("mMovieStaffAdapter");
                    c16141s = null;
                }
                List<Object> data = c16141s.getData();
                C16145w c16145w = movieStaffActivity.mMovieStaffSubRecyclerVIewScrollListener;
                if (c16145w != null) {
                    c16145w.m70746e(movieStaffList.getItems());
                }
                if (data.isEmpty() || !(data.get(data.size() - 1) instanceof MovieStaffList)) {
                    C16141s c16141s3 = movieStaffActivity.mMovieStaffAdapter;
                    if (c16141s3 == null) {
                        Intrinsics.m97819y("mMovieStaffAdapter");
                    } else {
                        c16141s2 = c16141s3;
                    }
                    c16141s2.mo36205p(movieStaffList);
                }
            }
            movieStaffActivity.m70719t0();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: S0 */
    private final boolean m70689S0() {
        Staff staff = this.staff;
        return staff != null && staff.getSeenStatus() == SeenStatus.WANT_TO_SEE.ordinal();
    }

    /* JADX INFO: renamed from: T0 */
    private final void m70690T0(int position, Pair data) {
        C16145w c16145w;
        String strM96843f;
        Object first = data.getFirst();
        long jLongValue = ((Number) data.getSecond()).longValue();
        C26866a.a.m104898f(C26866a.f81698a, "staff_info", "reportBrowseEvent  position:" + position + "  duration:" + jLongValue, false, 4, null);
        if (first instanceof MovieStaffSubject) {
            MovieStaffSubject movieStaffSubject = (MovieStaffSubject) first;
            if (this.subjectIdSet.add(movieStaffSubject.getSubjectId())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("item_type", "subject");
                String subjectId = movieStaffSubject.getSubjectId();
                String str = "";
                if (subjectId == null) {
                    subjectId = "";
                }
                linkedHashMap.put("subject_id", subjectId);
                String ops = movieStaffSubject.getOps();
                if (ops == null) {
                    ops = "";
                }
                linkedHashMap.put("ops", ops);
                Boolean hasResource = movieStaffSubject.getHasResource();
                linkedHashMap.put("has_resource", String.valueOf(hasResource != null ? hasResource.booleanValue() : false));
                linkedHashMap.put(RequestParameters.POSITION, String.valueOf(position));
                linkedHashMap.put("browse_duration", String.valueOf(jLongValue));
                C14450a c14450a = C14450a.f50860a;
                C24655b logViewConfig = getLogViewConfig();
                if (logViewConfig != null && (strM96843f = logViewConfig.m96843f()) != null) {
                    str = strM96843f;
                }
                c14450a.m65142e(str, linkedHashMap);
                return;
            }
            return;
        }
        if (!(first instanceof MovieStaffList) || (c16145w = this.mMovieStaffSubRecyclerVIewScrollListener) == null) {
            return;
        }
        int iM70742a = c16145w.m70742a();
        int iM70743b = c16145w.m70743b();
        if (iM70742a < 0 || iM70743b < 0 || iM70743b < iM70742a || iM70742a > iM70743b) {
            return;
        }
        while (true) {
            c16145w.m70744c(iM70742a, jLongValue);
            if (iM70742a == iM70743b) {
                return;
            } else {
                iM70742a++;
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    private final void m70691U0(String module) {
        String staffId;
        HashMap map = new HashMap();
        map.put("module_name", module);
        Staff staff = this.staff;
        if (staff == null || (staffId = staff.getStaffId()) == null) {
            staffId = "";
        }
        map.put("staff_id", staffId);
        C14450a.f50860a.m65146i("staff_info", map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V0 */
    private final void m70692V0(boolean isExpanded) {
        if (!isExpanded) {
            ((C23595c) getMViewBinding()).f71911m.getLayoutParams().height = AbstractC5776a0.m27313a(44.0f) + AbstractC5781d.m27351c();
            ((C23595c) getMViewBinding()).f71911m.setPadding(0, AbstractC5781d.m27351c(), 0, 0);
            ViewGroup.LayoutParams layoutParams = ((C23595c) getMViewBinding()).f71911m.getLayoutParams();
            if (layoutParams instanceof CollapsingToolbarLayout.C9959c) {
                ((FrameLayout.LayoutParams) ((CollapsingToolbarLayout.C9959c) layoutParams)).topMargin = 0;
                return;
            }
            return;
        }
        ((C23595c) getMViewBinding()).f71911m.getLayoutParams().height = AbstractC5776a0.m27313a(44.0f);
        ((C23595c) getMViewBinding()).f71911m.setPadding(0, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams2 = ((C23595c) getMViewBinding()).f71911m.getLayoutParams();
        if (layoutParams2 instanceof CollapsingToolbarLayout.C9959c) {
            ((FrameLayout.LayoutParams) ((CollapsingToolbarLayout.C9959c) layoutParams2)).topMargin = AbstractC5781d.m27351c();
        }
    }

    /* JADX INFO: renamed from: W0 */
    private final void m70693W0() {
        String staffId;
        ShareDialogFragment shareDialogFragment;
        if (this.staff == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("module_name", "share");
        Staff staff = this.staff;
        if (staff == null || (staffId = staff.getStaffId()) == null) {
            staffId = "";
        }
        map.put("staff_id", staffId);
        C14450a.f50860a.m65146i("staff_info", map);
        if (this.mShareDialog == null) {
            ShareDialogFragment.Companion companion = ShareDialogFragment.INSTANCE;
            PostType postType = PostType.STAFF_TYPE;
            Staff staff2 = this.staff;
            String staffId2 = staff2 != null ? staff2.getStaffId() : null;
            String value = ReportType.STAFF.getValue();
            Staff staff3 = this.staff;
            String name = staff3 != null ? staff3.getName() : null;
            Staff staff4 = this.staff;
            ShareDialogFragment shareDialogFragmentM78645a = companion.m78645a(postType, staffId2, "", value, (3328 & 16) != 0 ? "" : name, (3328 & 32) != 0 ? "" : staff4 != null ? staff4.getDescription() : null, (3328 & 64) != 0 ? false : false, (3328 & 128) != 0 ? false : false, (3328 & 256) != 0 ? false : false, "staff_info", (3328 & 1024) != 0 ? "" : null, (3328 & 2048) != 0 ? "" : null);
            this.mShareDialog = shareDialogFragmentM78645a;
            if (shareDialogFragmentM78645a != null) {
                shareDialogFragmentM78645a.m78642G0(new C16122c());
            }
        }
        try {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.m14537g0();
            ShareDialogFragment shareDialogFragment2 = this.mShareDialog;
            if ((shareDialogFragment2 == null || !shareDialogFragment2.isAdded()) && supportFragmentManager.m14547k0("share") == null && (shareDialogFragment = this.mShareDialog) != null) {
                shareDialogFragment.show(supportFragmentManager, "share");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    private final void m70694X0(Integer itemCount) {
        TextView textView = ((C23595c) getMViewBinding()).f71913o;
        Integer num = this.staffType;
        textView.setText(getString((num != null && num.intValue() == 6) ? com.transsion.moviedetail.R$string.staff_music_title : com.transsion.moviedetail.R$string.movie_staff_filmography, Integer.valueOf(itemCount != null ? itemCount.intValue() : 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    private final void m70695Y0(Staff info) {
        if (info == null) {
            return;
        }
        m70719t0();
        this.staff = info;
        m70701c1();
        ((C23595c) getMViewBinding()).f71915q.setText(info.getName());
        ((C23595c) getMViewBinding()).f71916r.setText(info.getName());
        List<StaffType> staffTypes = info.getStaffTypes();
        String str = "";
        if (staffTypes != null) {
            for (StaffType staffType : staffTypes) {
                if (str.length() > 0) {
                    str = ((Object) str) + "/";
                }
                str = ((Object) str) + staffType.getName();
            }
        }
        ViewGroup.LayoutParams layoutParams = ((C23595c) getMViewBinding()).f71913o.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        ((C23595c) getMViewBinding()).f71914p.setText(str);
        String description = info.getDescription();
        if (description == null || description.length() == 0) {
            InfoExtendView infoExtendView = ((C23595c) getMViewBinding()).f71902d;
            Intrinsics.m97801g(infoExtendView, "infoExtendView");
            AbstractC26006c.m102054g(infoExtendView);
            ((C23595c) getMViewBinding()).f71913o.setPadding(((C23595c) getMViewBinding()).f71913o.getPaddingLeft(), 0, ((C23595c) getMViewBinding()).f71913o.getPaddingRight(), ((C23595c) getMViewBinding()).f71913o.getPaddingBottom());
        } else {
            ((C23595c) getMViewBinding()).f71902d.showData(info.getDescription());
            InfoExtendView infoExtendView2 = ((C23595c) getMViewBinding()).f71902d;
            Intrinsics.m97801g(infoExtendView2, "infoExtendView");
            AbstractC26006c.m102058k(infoExtendView2);
            layoutParams2.topMargin = 0;
        }
        String avatarUrl = info.getAvatarUrl();
        if (((C23595c) getMViewBinding()).f71907i.getTag() == null || !Intrinsics.m97797c(((C23595c) getMViewBinding()).f71907i.getTag(), avatarUrl)) {
            ((C23595c) getMViewBinding()).f71907i.setTag(avatarUrl);
            if (avatarUrl == null || avatarUrl.length() == 0) {
                AppCompatImageView appCompatImageView = ((C23595c) getMViewBinding()).f71907i;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
                appCompatImageView.setScaleType(scaleType);
                ((C23595c) getMViewBinding()).f71907i.setImageResource(com.transsion.moviedetail.R$mipmap.movie_staff_empty);
                ((C23595c) getMViewBinding()).f71904f.setScaleType(scaleType);
                ((C23595c) getMViewBinding()).f71904f.setImageResource(com.transsion.moviedetail.R$mipmap.movie_staff_empty);
            } else {
                AppCompatImageView appCompatImageView2 = ((C23595c) getMViewBinding()).f71907i;
                ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER_CROP;
                appCompatImageView2.setScaleType(scaleType2);
                ((C23595c) getMViewBinding()).f71904f.setScaleType(scaleType2);
                int iM27489e = AbstractC5806y.m27489e();
                C23860f.a aVar = C23860f.f72909a;
                C23860f.b bVarM94463b = aVar.m94457m(this).m94468g(avatarUrl).m94474m(iM27489e).m94464c((iM27489e * 480) / 360).m94463b(new Function3() { // from class: com.transsion.moviedetail.staff.f
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MovieStaffActivity.m70696Z0(this.f54849a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
                    }
                });
                AppCompatImageView ivStaff = ((C23595c) getMViewBinding()).f71907i;
                Intrinsics.m97801g(ivStaff, "ivStaff");
                bVarM94463b.m94465d(ivStaff);
                C23860f.b bVarM94463b2 = aVar.m94457m(this).m94468g(avatarUrl).m94474m(AbstractC5790i.m27411e(24.0f)).m94464c(AbstractC5790i.m27411e(32.0f)).m94463b(new Function3() { // from class: com.transsion.moviedetail.staff.g
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MovieStaffActivity.m70697a1(this.f54850a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
                    }
                });
                ShapeableImageView ivCoverSmall = ((C23595c) getMViewBinding()).f71904f;
                Intrinsics.m97801g(ivCoverSmall, "ivCoverSmall");
                bVarM94463b2.m94465d(ivCoverSmall);
            }
        }
        ((C23595c) getMViewBinding()).f71908j.setImageResource(info.getSeenStatus() == 0 ? com.transsion.moviedetail.R$mipmap.movie_staff_icon_want_to_see_white : com.transsion.moviedetail.R$mipmap.movie_detail_icon_want_to_see_selected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z0 */
    public static final Unit m70696Z0(MovieStaffActivity movieStaffActivity, boolean z11, boolean z12, long j11) {
        if (!z11) {
            ((C23595c) movieStaffActivity.getMViewBinding()).f71907i.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((C23595c) movieStaffActivity.getMViewBinding()).f71907i.setImageResource(com.transsion.moviedetail.R$mipmap.movie_staff_empty);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a1 */
    public static final Unit m70697a1(MovieStaffActivity movieStaffActivity, boolean z11, boolean z12, long j11) {
        if (!z11) {
            ((C23595c) movieStaffActivity.getMViewBinding()).f71904f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((C23595c) movieStaffActivity.getMViewBinding()).f71904f.setImageResource(com.transsion.moviedetail.R$mipmap.movie_staff_empty);
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000d  */
    /* JADX INFO: renamed from: b1 */
    private final void m70699b1() {
        int i11;
        Integer num = this.staffType;
        if (num != null) {
            i11 = num.intValue() != 6 ? 9 : 6;
        }
        this.showCount = i11;
    }

    /* JADX INFO: renamed from: c1 */
    private final void m70701c1() {
        Staff staff;
        Integer staffType;
        StaffType staffType2;
        if (this.staffType == null && (staff = this.staff) != null) {
            if (staff.getStaffType() == null) {
                List<StaffType> staffTypes = staff.getStaffTypes();
                staffType = (staffTypes == null || (staffType2 = (StaffType) CollectionsKt.m97372v0(staffTypes)) == null) ? null : Integer.valueOf(staffType2.getId());
            } else {
                staffType = staff.getStaffType();
            }
            this.staffType = staffType;
            m70699b1();
        }
    }

    /* JADX INFO: renamed from: d1 */
    private final void m70703d1() {
        String staffId;
        String staffId2;
        String str = "";
        if (m70689S0()) {
            C16147y c16147yM70721v0 = m70721v0();
            Staff staff = this.staff;
            c16147yM70721v0.m70770y(staff != null ? staff.getStaffId() : null, 0);
            HashMap map = new HashMap();
            map.put("module_name", "want_to_see_cancel");
            Staff staff2 = this.staff;
            if (staff2 != null && (staffId2 = staff2.getStaffId()) != null) {
                str = staffId2;
            }
            map.put("staff_id", str);
            C14450a.f50860a.m65146i("staff_info", map);
            return;
        }
        C16147y c16147yM70721v1 = m70721v0();
        Staff staff3 = this.staff;
        c16147yM70721v1.m70770y(staff3 != null ? staff3.getStaffId() : null, 1);
        HashMap map2 = new HashMap();
        map2.put("module_name", "want_to_see");
        Staff staff4 = this.staff;
        if (staff4 != null && (staffId = staff4.getStaffId()) != null) {
            str = staffId;
        }
        map2.put("staff_id", str);
        C14450a.f50860a.m65146i("staff_info", map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        Staff staff = this.staff;
        C16141s c16141s = null;
        this.mMovieStaffAdapter = new C16141s(staff != null ? staff.getStaffId() : null, this.staffType, new Function2() { // from class: com.transsion.moviedetail.staff.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MovieStaffActivity.m70672B0(this.f54845a, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
        this.mMovieStaffSubRecyclerVIewScrollListener = new C16145w();
        C16141s c16141s2 = this.mMovieStaffAdapter;
        if (c16141s2 == null) {
            Intrinsics.m97819y("mMovieStaffAdapter");
            c16141s2 = null;
        }
        C16144v c16144v = new C16144v(c16141s2, new Function2() { // from class: com.transsion.moviedetail.staff.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MovieStaffActivity.m70673C0(this.f54852a, ((Integer) obj).intValue(), (Pair) obj2);
            }
        });
        ((C23595c) getMViewBinding()).f71909k.addOnScrollListener(c16144v);
        this.mMovieStaffScrollListener = c16144v;
        C16141s c16141s3 = this.mMovieStaffAdapter;
        if (c16141s3 == null) {
            Intrinsics.m97819y("mMovieStaffAdapter");
            c16141s3 = null;
        }
        c16141s3.m36149M0(false);
        C16141s c16141s4 = this.mMovieStaffAdapter;
        if (c16141s4 == null) {
            Intrinsics.m97819y("mMovieStaffAdapter");
            c16141s4 = null;
        }
        c16141s4.m36227w1(new InterfaceC27566d() { // from class: com.transsion.moviedetail.staff.k
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                MovieStaffActivity.m70674D0(this.f54853a, baseQuickAdapter, view, i11);
            }
        });
        ((C23595c) getMViewBinding()).f71909k.setAnimation(null);
        RecyclerView recyclerView = ((C23595c) getMViewBinding()).f71909k;
        C16141s c16141s5 = this.mMovieStaffAdapter;
        if (c16141s5 == null) {
            Intrinsics.m97819y("mMovieStaffAdapter");
        } else {
            c16141s = c16141s5;
        }
        recyclerView.setAdapter(c16141s);
        int iM27489e = AbstractC5806y.m27489e();
        int iM27411e = AbstractC5790i.m27411e(8.0f);
        int iM70722w0 = m70722w0() + (AbstractC14556b.m65670a(this) ? 1 : 0);
        ((C23595c) getMViewBinding()).f71909k.addItemDecoration(new C16143u(AbstractC5790i.m27411e(12.0f), AbstractC5790i.m27411e(4.0f), 0, AbstractC5790i.m27411e(12.0f), iM70722w0));
        RecyclerView recyclerView2 = ((C23595c) getMViewBinding()).f71909k;
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this, iM27489e, 1, false);
        gridLayoutManager.m20740d0(new C16120a(iM70722w0, (iM27489e - (iM27411e * 2)) / iM70722w0, iM27411e, iM27489e));
        recyclerView2.setLayoutManager(gridLayoutManager);
        m70694X0(0);
        m70695Y0(this.staff);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m70719t0() {
        C24655b logViewConfig;
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 == null || !logViewConfig2.m96846i()) {
            Staff staff = this.staff;
            String mySeeTime = staff != null ? staff.getMySeeTime() : null;
            if (mySeeTime == null || mySeeTime.length() == 0 || m70721v0().m70765s().m14847f() == null || m70721v0().m70768v().m14847f() == null || (logViewConfig = getLogViewConfig()) == null) {
                return;
            }
            logViewConfig.m96848k(true);
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m70720u0() {
        if (m70721v0().m70766t().m14847f() == null) {
            C16147y c16147yM70721v0 = m70721v0();
            Staff staff = this.staff;
            c16147yM70721v0.m70763p(staff != null ? staff.getStaffId() : null);
        }
        if (m70721v0().m70767u().m14847f() == null) {
            C16147y c16147yM70721v1 = m70721v0();
            Staff staff2 = this.staff;
            c16147yM70721v1.m70764q(staff2 != null ? staff2.getStaffId() : null, this.showCount);
        }
        if (m70721v0().m70765s().m14847f() == null) {
            C16147y c16147yM70721v2 = m70721v0();
            Staff staff3 = this.staff;
            c16147yM70721v2.m70762o(staff3 != null ? staff3.getStaffId() : null);
        }
    }

    /* JADX INFO: renamed from: v0 */
    private final C16147y m70721v0() {
        return (C16147y) this.mMovieStaffViewModel.getValue();
    }

    /* JADX INFO: renamed from: w0 */
    private final int m70722w0() {
        Integer num = this.staffType;
        return (num != null && num.intValue() == 6) ? 2 : 3;
    }

    /* JADX INFO: renamed from: y0 */
    private final void m70723y0(MovieStaffSubjectList it) {
        Integer totalCount;
        if (it == null) {
            return;
        }
        m70719t0();
        Pager pager = it.getPager();
        this.mIsLoadFinish = pager != null ? Intrinsics.m97797c(pager.getHasMore(), Boolean.FALSE) : false;
        List<MovieStaffSubject> items = it.getItems();
        Pager pager2 = it.getPager();
        C16141s c16141s = null;
        m70694X0(pager2 != null ? pager2.getTotalCount() : null);
        List<MovieStaffSubject> list = items;
        if (list == null || list.isEmpty()) {
            return;
        }
        C25651a c25651a = this.mMovieStaffItemMore;
        if (c25651a == null) {
            Pager pager3 = it.getPager();
            c25651a = new C25651a((pager3 == null || (totalCount = pager3.getTotalCount()) == null) ? 0 : totalCount.intValue(), 0, 2, null);
        }
        this.mMovieStaffItemMore = c25651a;
        C16141s c16141s2 = this.mMovieStaffAdapter;
        if (c16141s2 == null) {
            Intrinsics.m97819y("mMovieStaffAdapter");
            c16141s2 = null;
        }
        int iIndexOf = c16141s2.getData().indexOf(c25651a);
        if (iIndexOf < 0) {
            C16141s c16141s3 = this.mMovieStaffAdapter;
            if (c16141s3 == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
                c16141s3 = null;
            }
            List<Object> listU0 = CollectionsKt.m97343U0(c16141s3.getData());
            Pager pager4 = it.getPager();
            if ((pager4 != null ? Intrinsics.m97797c(pager4.getHasMore(), Boolean.TRUE) : false) || items.size() >= this.showCount) {
                int iH = RangesKt.m97938h(this.showCount, items.size());
                listU0.addAll(0, items.subList(0, iH));
                listU0.add(iH, c25651a);
                c25651a.m100972e(iH);
            } else {
                listU0.addAll(0, items);
            }
            C16141s c16141s4 = this.mMovieStaffAdapter;
            if (c16141s4 == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
            } else {
                c16141s = c16141s4;
            }
            c16141s.mo36210q1(listU0);
            return;
        }
        c25651a.m100972e(c25651a.m100968a() + items.size());
        Pager pager5 = it.getPager();
        if (pager5 != null ? Intrinsics.m97797c(pager5.getHasMore(), Boolean.TRUE) : false) {
            C16141s c16141s5 = this.mMovieStaffAdapter;
            if (c16141s5 == null) {
                Intrinsics.m97819y("mMovieStaffAdapter");
            } else {
                c16141s = c16141s5;
            }
            c16141s.mo36202o(iIndexOf, items);
            return;
        }
        C16141s c16141s6 = this.mMovieStaffAdapter;
        if (c16141s6 == null) {
            Intrinsics.m97819y("mMovieStaffAdapter");
            c16141s6 = null;
        }
        c16141s6.getData().addAll(iIndexOf, items);
        C16141s c16141s7 = this.mMovieStaffAdapter;
        if (c16141s7 == null) {
            Intrinsics.m97819y("mMovieStaffAdapter");
        } else {
            c16141s = c16141s7;
        }
        c16141s.notifyItemRangeChanged(iIndexOf, items.size() + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    private final void m70724z0() {
        ((C23595c) getMViewBinding()).f71900b.addOnOffsetChangedListener(new AppBarLayout.InterfaceC9956g() { // from class: com.transsion.moviedetail.staff.q
            @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC9951b
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                MovieStaffActivity.m70671A0(this.f54859a, appBarLayout, i11);
            }
        });
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public C24655b newLogViewConfig() {
        return new C24655b("staff_info", false, 2, null);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity, p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        super.onConnected(network, networkCapabilities);
        m70720u0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        HashMap mapM96844g;
        TheRouter.m61781l(this);
        super.onCreate(savedInstanceState);
        C14492k.f50955a.m65329w(3, this);
        Staff staff = (Staff) getIntent().getSerializableExtra("staff");
        this.staff = staff;
        if (staff == null) {
            Staff staff2 = new Staff();
            staff2.setStaffId(this.id);
            this.staff = staff2;
        }
        m70701c1();
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            Staff staff3 = this.staff;
        }
        ViewGroup.LayoutParams layoutParams = ((C23595c) getMViewBinding()).f71911m.getLayoutParams();
        if (layoutParams instanceof CollapsingToolbarLayout.C9959c) {
            ((FrameLayout.LayoutParams) ((CollapsingToolbarLayout.C9959c) layoutParams)).topMargin = AbstractC5781d.m27351c();
        }
        ((C23595c) getMViewBinding()).f71906h.init(this);
        m70724z0();
        initData();
        m70684N0(savedInstanceState);
        m70679I0();
        m70676F0();
        m70720u0();
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C27287m.f83003a.m106337m(this);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity, p743rh.InterfaceC27288n
    public void onDisconnected() {
        super.onDisconnected();
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C16144v c16144v = this.mMovieStaffScrollListener;
        if (c16144v != null) {
            c16144v.m70740f();
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseMusicFloatActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C16144v c16144v = this.mMovieStaffScrollListener;
        if (c16144v != null) {
            c16144v.m70741g();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public C23595c getViewBinding() {
        C23595c c23595cM93356c = C23595c.m93356c(getLayoutInflater());
        Intrinsics.m97801g(c23595cM93356c, "inflate(...)");
        return c23595cM93356c;
    }
}
