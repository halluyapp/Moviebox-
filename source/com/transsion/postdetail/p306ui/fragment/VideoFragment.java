package com.transsion.postdetail.p306ui.fragment;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.AbstractC0256u;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.mbridge.msdk.MBridgeConstans;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.DefaultView;
import com.p282tn.lib.widget.R$mipmap;
import com.p282tn.lib.widget.TnTextView;
import com.p282tn.lib.widget.dialog.TRDialog;
import com.p282tn.lib.widget.dialog.TRDialogListener;
import com.therouter.TheRouter;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.report.C14486e;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.util.AbstractC14567m;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.ninegridview.helper.C16323b;
import com.transsion.ninegridview.helper.FileHelper;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.player.config.RenderType;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.control.VideoPagerChangeControl;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.postdetail.helper.ImmVideoHelper;
import com.transsion.postdetail.helper.NegativeFeedbackHelper;
import com.transsion.postdetail.p306ui.adapter.C16978e;
import com.transsion.postdetail.p306ui.fragment.preload.VideoDataLoader;
import com.transsion.postdetail.p306ui.fragment.preload.VideoImmersiveDataLoaderV2;
import com.transsion.postdetail.p306ui.view.ImmVideoLoadMoreView;
import com.transsion.postdetail.p306ui.view.ImmVideoNoNetworkView;
import com.transsion.postdetail.util.PostSaveHelper;
import com.transsion.postdetail.viewmodel.PostDetailViewModel;
import com.transsion.shorttv.base.pager.PagerLayoutManager;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import ng.AbstractC26006c;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC23002f;
import p415fq.C23420k;
import p415fq.InterfaceC23410a;
import p438go.C23622d;
import p550kj.C24655b;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p843vm.C28135e;
import p844vo.C28168p;
import p888wy.C28465b;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¡\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002¢\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u0006J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010\u0006J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0007H\u0002¢\u0006\u0004\b1\u0010\u0006J\u000f\u00102\u001a\u00020\u0007H\u0002¢\u0006\u0004\b2\u0010\u0006J\u0017\u00105\u001a\u00020\u00022\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0019\u00109\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J!\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u001a2\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u001a2\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\bA\u0010@J\u000f\u0010B\u001a\u00020\u0007H\u0016¢\u0006\u0004\bB\u0010\u0006J\u000f\u0010C\u001a\u00020\u0007H\u0016¢\u0006\u0004\bC\u0010\u0006J\u000f\u0010D\u001a\u00020\u0007H\u0016¢\u0006\u0004\bD\u0010\u0006J\u0017\u0010F\u001a\u00020\u00072\u0006\u0010E\u001a\u00020(H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u0010\u0006J\u000f\u0010I\u001a\u00020\u0007H\u0016¢\u0006\u0004\bI\u0010\u0006J\u000f\u0010J\u001a\u00020\u0007H\u0016¢\u0006\u0004\bJ\u0010\u0006J\u0017\u0010L\u001a\u00020\u00072\u0006\u0010K\u001a\u000207H\u0016¢\u0006\u0004\bL\u0010:J\u000f\u0010M\u001a\u00020\u0007H\u0016¢\u0006\u0004\bM\u0010\u0006J\u0017\u0010P\u001a\u00020\u00072\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00072\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bR\u0010QJ1\u0010X\u001a\u00020\u00072\u0006\u0010S\u001a\u00020#2\u0010\u0010U\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0T2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u0016\u0010]\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R$\u0010a\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010[\u001a\u0004\bb\u0010c\"\u0004\bd\u0010\u0010R\u0016\u0010e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010[R\u0016\u0010f\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010^R\u0016\u0010g\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010`R\u0016\u0010h\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010[R\u0018\u0010i\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010[R\u001b\u0010o\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001d\u0010t\u001a\u0004\u0018\u00010p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010l\u001a\u0004\br\u0010sR\u0018\u0010v\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0084\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010`R\u0018\u0010\u0085\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010`R\u0018\u0010\u0086\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010`R\u0018\u0010\u0087\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010`R/\u0010\u008a\u0001\u001a\u0018\u0012\u0004\u0012\u00020-\u0018\u00010\u0088\u0001j\u000b\u0012\u0004\u0012\u00020-\u0018\u0001`\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008c\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010`R\u0018\u0010\u008d\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010`R\u0018\u0010\u008e\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010^R\u0018\u0010\u008f\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010^R\u0018\u0010\u0090\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010`R\u0018\u0010\u0091\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010^R#\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020\r0\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001¨\u0006£\u0001"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/VideoFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lvo/p;", "Ldn/f;", "Lcom/tn/lib/widget/dialog/TRDialogListener;", "<init>", "()V", "", "initPlayer", "initAdapter", "initViewModel", "initBack", "initAudioListener", "", "postId", "removeVideoByPostId", "(Ljava/lang/String;)V", "observeRemoveVideo", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "subjectBean", "updateData", "(Lcom/transsion/moviedetailapi/bean/PostSubjectBean;)V", "showNotNetError", "showEmpty", "Landroid/content/Context;", "context", "Landroid/view/View;", "getEmptyView", "(Landroid/content/Context;)Landroid/view/View;", "getNotNetErrorView", "hideProgress", "showProgress", "loadMore", "loadData", "doLoadData", "", "it", "scrollToPosition", "(I)V", "itemType", "", "checkItemType", "(Ljava/lang/String;)Z", "localLogPause", "initAd", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", WebConstants.FIELD_ITEM, "setPTParams", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "initNonAd", "showSettingDialog", "Landroid/view/LayoutInflater;", "inflater", "getViewBinding", "(Landroid/view/LayoutInflater;)Lvo/p;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "initData", "lazyLoadData", "onResume", "onPause", "hidden", "onHiddenChanged", "(Z)V", "logPause", "logResume", "onDestroy", "outState", "onSaveInstanceState", "onMemberStateChange", "Lcom/tn/lib/widget/dialog/TRDialog;", "dialog", "onLeftButtonClick", "(Lcom/tn/lib/widget/dialog/TRDialog;)V", "onRightButtonClick", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "mPostId", "Ljava/lang/String;", "mItemType", "mTabId", "I", "fromComment", "Z", "tran_ops", "getTran_ops", "()Ljava/lang/String;", "setTran_ops", "mNextPage", "mPerPage", "videoLoadMore", "commentId", "pageFrom", "Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "mVideoViewModel$delegate", "Lkotlin/Lazy;", "getMVideoViewModel", "()Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "mVideoViewModel", "Lfq/a;", "mAudioApi$delegate", "getMAudioApi", "()Lfq/a;", "mAudioApi", "Lcom/transsion/shorttv/base/pager/PagerLayoutManager;", "mPagerLayoutManager", "Lcom/transsion/shorttv/base/pager/PagerLayoutManager;", "Lcom/transsion/postdetail/control/VideoPagerChangeControl;", "mPagerChangeControl", "Lcom/transsion/postdetail/control/VideoPagerChangeControl;", "Lcom/transsion/postdetail/ui/adapter/e;", "mAdapter", "Lcom/transsion/postdetail/ui/adapter/e;", "Lcom/transsion/player/orplayer/g;", "mOrPlayer", "Lcom/transsion/player/orplayer/g;", "Lcom/transsion/player/ui/ORPlayerView;", "mOrPlayerView", "Lcom/transsion/player/ui/ORPlayerView;", "isLoadingData", "isFirstLoadMore", "attachToMain", "needBackToRoom", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "downloadedShortsList", "Ljava/util/ArrayList;", "prioritizeDownloaded", "isFromDownloaded", "currentDownloadedIndex", "startDownloadedIndex", "hasShownOnlineToast", "savedCurrentIndex", "", "list", "Ljava/util/List;", "getList", "()Ljava/util/List;", "", "resumeTimeStamp", "J", "getResumeTimeStamp", "()J", "setResumeTimeStamp", "(J)V", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "v3ListManager", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "Companion", "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class VideoFragment extends BaseFragment<C28168p> implements InterfaceC23002f, TRDialogListener {
    private static final String CURRENT_INDEX = "CURRENT_INDEX";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String PAGE_NAME = "postdetail_video";
    private boolean attachToMain;
    private int currentDownloadedIndex;
    private ArrayList<PostSubjectItem> downloadedShortsList;
    private boolean fromComment;
    private boolean hasShownOnlineToast;
    private boolean isFirstLoadMore;
    private boolean isFromDownloaded;
    private boolean isLoadingData;
    private final List<String> list;
    private C16978e mAdapter;

    /* JADX INFO: renamed from: mAudioApi$delegate, reason: from kotlin metadata */
    private final Lazy mAudioApi;
    private InterfaceC16634g mOrPlayer;
    private ORPlayerView mOrPlayerView;
    private VideoPagerChangeControl mPagerChangeControl;
    private PagerLayoutManager mPagerLayoutManager;
    private int mTabId;

    /* JADX INFO: renamed from: mVideoViewModel$delegate, reason: from kotlin metadata */
    private final Lazy mVideoViewModel;
    private boolean needBackToRoom;
    private String pageFrom;
    private boolean prioritizeDownloaded;
    private long resumeTimeStamp;
    private int savedCurrentIndex;
    private int startDownloadedIndex;
    private String tran_ops;
    private BiddingListManager v3ListManager;
    private boolean videoLoadMore;
    private String mPostId = "";
    private String mItemType = "";
    private String mNextPage = "1";
    private int mPerPage = 5;
    private String commentId = "";

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.VideoFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final VideoFragment m74528a(String str, String str2, Integer num, boolean z11, boolean z12, String str3, boolean z13, String str4, String str5, boolean z14, ArrayList arrayList, boolean z15, boolean z16) {
            int iM109268c;
            VideoFragment videoFragment = new VideoFragment();
            if (str == null || str.length() == 0) {
                iM109268c = C28135e.f86323a.m109268c(new VideoImmersiveDataLoaderV2(str5, "0", "1", 8));
            } else {
                iM109268c = C28135e.f86323a.m109268c(new VideoDataLoader(str));
            }
            videoFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("id", str), TuplesKt.m97108a("item_type", str2), TuplesKt.m97108a("tab_id", num), TuplesKt.m97108a("video_load_more", Boolean.valueOf(z11)), TuplesKt.m97108a("from_comment", Boolean.valueOf(z12)), TuplesKt.m97108a("rec_ops", str3), TuplesKt.m97108a("attach_to_main", Boolean.valueOf(z13)), TuplesKt.m97108a("yy_preload_id", Integer.valueOf(iM109268c)), TuplesKt.m97108a("comment_id", str4), TuplesKt.m97108a(WebConstants.PAGE_FROM, str5), TuplesKt.m97108a("need_back_to_room", Boolean.valueOf(z14)), TuplesKt.m97108a("downloaded_shorts_list", arrayList), TuplesKt.m97108a("prioritize_downloaded", Boolean.valueOf(z15)), TuplesKt.m97108a("is_from_downloaded", Boolean.valueOf(z16))));
            return videoFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.VideoFragment$b */
    public static final class C17082b extends AbstractC0256u {
        C17082b() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            if (VideoFragment.this.needBackToRoom) {
                C23420k.m92971i(C23420k.f71413a, null, null, null, false, 15, null);
            }
            FragmentActivity activity = VideoFragment.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.VideoFragment$c */
    public static final class C17083c implements InterfaceC27288n {
        C17083c() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            C27941f c27941fM36186h0;
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            if (((PostSubjectBean) VideoFragment.this.getMVideoViewModel().m75056v().m14847f()) == null) {
                VideoFragment.this.loadData();
                return;
            }
            C16978e c16978e = VideoFragment.this.mAdapter;
            if (((c16978e == null || (c27941fM36186h0 = c16978e.m36186h0()) == null) ? null : c27941fM36186h0.m108661i()) == LoadMoreStatus.Fail) {
                VideoFragment.this.loadMore();
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.VideoFragment$d */
    public static final class C17084d extends VideoPagerChangeControl {
        C17084d(boolean z11, C16978e c16978e, InterfaceC16634g interfaceC16634g, ORPlayerView oRPlayerView, PagerLayoutManager pagerLayoutManager, String str) {
            super(VideoFragment.this, z11, c16978e, interfaceC16634g, oRPlayerView, pagerLayoutManager, str);
        }

        @Override // com.transsion.postdetail.control.VideoPagerChangeControl, p467hs.AbstractC23893a
        /* JADX INFO: renamed from: f */
        public void mo72960f(int i11, boolean z11, View view) {
            super.mo72960f(i11, z11, view);
            if (VideoFragment.this.isFromDownloaded) {
                ArrayList arrayList = VideoFragment.this.downloadedShortsList;
                int size = VideoFragment.this.startDownloadedIndex >= 0 ? (arrayList != null ? arrayList.size() : 0) - VideoFragment.this.startDownloadedIndex : 0;
                if (size <= 0 || i11 < size) {
                    VideoFragment.this.hasShownOnlineToast = false;
                } else {
                    if (VideoFragment.this.hasShownOnlineToast) {
                        return;
                    }
                    VideoFragment.this.hasShownOnlineToast = true;
                    AbstractC14567m.m65694a(R$string.shorts_view_online_content);
                    C14450a.f50860a.m65140c(VideoFragment.PAGE_NAME, "online");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.VideoFragment$e */
    public static final class C17085e extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        private long f57280a;

        C17085e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            List<Object> data;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            if (!VideoFragment.this.isFromDownloaded || C27287m.f83003a.m106330e() || i11 == 0) {
                return;
            }
            VideoPagerChangeControl videoPagerChangeControl = VideoFragment.this.mPagerChangeControl;
            int size = 0;
            int iM72982h = videoPagerChangeControl != null ? videoPagerChangeControl.m72982h() : 0;
            C16978e c16978e = VideoFragment.this.mAdapter;
            if (c16978e != null && (data = c16978e.getData()) != null) {
                size = data.size();
            }
            boolean zCanScrollVertically = recyclerView.canScrollVertically(1);
            if (iM72982h < size - 1 || zCanScrollVertically) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f57280a > 2000) {
                this.f57280a = jCurrentTimeMillis;
                AbstractC14567m.m65698e(R$string.shorts_no_more_downloaded);
                C14450a.f50860a.m65140c(VideoFragment.PAGE_NAME, OfflineConstantsKt.OFFLINE);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.VideoFragment$f */
    static final class C17086f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57282a;

        C17086f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57282a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57282a;
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
            this.f57282a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.VideoFragment$onDestroy$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.VideoFragment$onDestroy$1", m97637f = "VideoFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C170871 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C170871(Continuation<? super C170871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VideoFragment.this.new C170871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C170871) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            InterfaceC16634g interfaceC16634g = VideoFragment.this.mOrPlayer;
            if (interfaceC16634g != null) {
                interfaceC16634g.stop();
            }
            InterfaceC16634g interfaceC16634g2 = VideoFragment.this.mOrPlayer;
            if (interfaceC16634g2 != null) {
                interfaceC16634g2.release();
            }
            return Unit.f75682a;
        }
    }

    public VideoFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.postdetail.ui.fragment.VideoFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.mVideoViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(PostDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.fragment.VideoFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.fragment.VideoFragment$special$$inlined$viewModels$default$3
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
        this.mAudioApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.j6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoFragment.mAudioApi_delegate$lambda$0();
            }
        });
        this.isFirstLoadMore = true;
        this.currentDownloadedIndex = -1;
        this.savedCurrentIndex = -1;
        this.list = CollectionsKt.m97499e(PostItemType.SUBJECT.getValue());
    }

    private final boolean checkItemType(String itemType) {
        return this.list.contains(itemType);
    }

    private final void doLoadData() {
        ArrayList<PostSubjectItem> arrayList;
        if (this.isLoadingData) {
            return;
        }
        if (this.prioritizeDownloaded && (arrayList = this.downloadedShortsList) != null && !arrayList.isEmpty()) {
            int i11 = this.currentDownloadedIndex + 1;
            this.currentDownloadedIndex = i11;
            ArrayList<PostSubjectItem> arrayList2 = this.downloadedShortsList;
            Intrinsics.m97799e(arrayList2);
            if (i11 < arrayList2.size()) {
                ArrayList<PostSubjectItem> arrayList3 = this.downloadedShortsList;
                Intrinsics.m97799e(arrayList3);
                PostSubjectItem postSubjectItem = arrayList3.get(this.currentDownloadedIndex);
                Intrinsics.m97801g(postSubjectItem, "get(...)");
                updateData(new PostSubjectBean(CollectionsKt.m97511q(postSubjectItem), null, null, null));
                return;
            }
            this.prioritizeDownloaded = false;
        }
        this.isLoadingData = true;
        PostDetailViewModel mVideoViewModel = getMVideoViewModel();
        String str = this.mPostId;
        mVideoViewModel.m75055u(str, this.mTabId, this.mNextPage, this.mPerPage, this.videoLoadMore, (this.attachToMain && (str == null || str.length() == 0)) ? 1 : 0);
    }

    private final View getEmptyView(Context context) {
        final DefaultView defaultView = new DefaultView(context, DefaultView.ModelStyle.MODEL_STYLE_NIGHT);
        defaultView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        defaultView.setGravity(17);
        defaultView.setDefaultImageViewVisibility(0);
        defaultView.setDefaultImage(R$mipmap.ic_no_content);
        String string = context.getString(com.p282tn.lib.widget.R$string.no_content);
        Intrinsics.m97801g(string, "getString(...)");
        defaultView.setDescText(string);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_IMAGE_DESC_BTN);
        defaultView.setBtnVisibility(0);
        String string2 = context.getString(com.transsion.baseui.R$string.retry_text);
        Intrinsics.m97801g(string2, "getString(...)");
        defaultView.setBtnText(string2);
        defaultView.setBtnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.u5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFragment.getEmptyView$lambda$25$lambda$24(this.f57471a, defaultView, view);
            }
        });
        defaultView.setVisibility(0);
        return defaultView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getEmptyView$lambda$25$lambda$24(VideoFragment videoFragment, DefaultView defaultView, View view) {
        videoFragment.loadData();
        defaultView.setVisibility(8);
    }

    private final InterfaceC23410a getMAudioApi() {
        return (InterfaceC23410a) this.mAudioApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostDetailViewModel getMVideoViewModel() {
        return (PostDetailViewModel) this.mVideoViewModel.getValue();
    }

    private final View getNotNetErrorView(Context context) {
        final ImmVideoNoNetworkView immVideoNoNetworkView = new ImmVideoNoNetworkView(context);
        AbstractC26006c.m102052e(immVideoNoNetworkView);
        immVideoNoNetworkView.retry(new Function0() { // from class: com.transsion.postdetail.ui.fragment.x5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoFragment.getNotNetErrorView$lambda$28$lambda$26(immVideoNoNetworkView, this);
            }
        });
        immVideoNoNetworkView.goToSetting(new Function0() { // from class: com.transsion.postdetail.ui.fragment.y5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoFragment.getNotNetErrorView$lambda$28$lambda$27();
            }
        });
        AbstractC13772o.m62233a(PAGE_NAME);
        return immVideoNoNetworkView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getNotNetErrorView$lambda$28$lambda$26(ImmVideoNoNetworkView immVideoNoNetworkView, VideoFragment videoFragment) {
        AbstractC26006c.m102054g(immVideoNoNetworkView);
        videoFragment.showProgress();
        videoFragment.loadData();
        AbstractC13772o.m62234b(PAGE_NAME);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getNotNetErrorView$lambda$28$lambda$27() {
        AbstractC13772o.m62235c(PAGE_NAME);
        return Unit.f75682a;
    }

    private final void hideProgress() {
        ProgressBar progressBar;
        C28168p mViewBinding = getMViewBinding();
        if (mViewBinding == null || (progressBar = mViewBinding.f86584d) == null) {
            return;
        }
        AbstractC26006c.m102054g(progressBar);
    }

    private final void initAd() {
        BiddingListManager biddingListManager = new BiddingListManager();
        this.v3ListManager = biddingListManager;
        C28168p mViewBinding = getMViewBinding();
        biddingListManager.m63184F(mViewBinding != null ? mViewBinding.f86585e : null);
        BiddingListManager biddingListManager2 = this.v3ListManager;
        if (biddingListManager2 != null) {
            biddingListManager2.m63179A(AbstractC3226v.m14968a(this));
        }
        BiddingListManager biddingListManager3 = this.v3ListManager;
        if (biddingListManager3 != null) {
            biddingListManager3.m63185G("VideoForYouListScene");
        }
        BiddingListManager biddingListManager4 = this.v3ListManager;
        if (biddingListManager4 != null) {
            biddingListManager4.m63192z(new Function2() { // from class: com.transsion.postdetail.ui.fragment.a6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VideoFragment.initAd$lambda$34(this.f57289a, ((Integer) obj).intValue(), (BiddingNativeManager) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initAd$lambda$34(VideoFragment videoFragment, int i11, BiddingNativeManager current) {
        List<Object> data;
        Intrinsics.m97802h(current, "current");
        if (current != null) {
            PostSubjectItem postSubjectItem = new PostSubjectItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, false, false, false, null, -1, 1, null);
            postSubjectItem.setNonAdDelegate(current);
            C16978e c16978e = videoFragment.mAdapter;
            int size = (c16978e == null || (data = c16978e.getData()) == null) ? 0 : data.size();
            if (i11 <= size) {
                C16978e c16978e2 = videoFragment.mAdapter;
                if (c16978e2 != null) {
                    c16978e2.mo36199n(i11, postSubjectItem);
                }
            } else {
                C16978e c16978e3 = videoFragment.mAdapter;
                if (c16978e3 != null) {
                    c16978e3.mo36199n(size, postSubjectItem);
                }
            }
        }
        return Unit.f75682a;
    }

    private final void initAdapter() {
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.videoLoadMore;
        String str = this.mPostId;
        String str2 = this.mItemType;
        boolean z12 = this.attachToMain;
        String str3 = this.commentId;
        String str4 = this.pageFrom;
        if (str4 == null) {
            str4 = "";
        }
        C16978e c16978e = new C16978e(arrayList, this, z11, str, str2, z12, str3, str4, this.isFromDownloaded);
        c16978e.m36186h0().m108673z(this.videoLoadMore);
        if (this.videoLoadMore) {
            c16978e.m36186h0().m108655C(new ImmVideoLoadMoreView());
            c16978e.m36186h0().m108673z(true);
            c16978e.m36186h0().m108672y(true);
            c16978e.m36186h0().m108657E(2);
            c16978e.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.postdetail.ui.fragment.z5
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    VideoFragment.initAdapter$lambda$7$lambda$6(this.f57505a);
                }
            });
        }
        this.mAdapter = c16978e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAdapter$lambda$7$lambda$6(final VideoFragment videoFragment) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ArrayList<PostSubjectItem> arrayList;
        boolean zM106330e = C27287m.f83003a.m106330e();
        boolean z11 = (!videoFragment.prioritizeDownloaded || (arrayList = videoFragment.downloadedShortsList) == null || arrayList.isEmpty()) ? false : true;
        if (!zM106330e && !z11) {
            C28168p mViewBinding = videoFragment.getMViewBinding();
            if (mViewBinding == null || (recyclerView2 = mViewBinding.f86585e) == null) {
                return;
            }
            recyclerView2.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.e6
                @Override // java.lang.Runnable
                public final void run() {
                    VideoFragment.initAdapter$lambda$7$lambda$6$lambda$5(this.f57324a);
                }
            }, 500L);
            return;
        }
        if (videoFragment.isFirstLoadMore) {
            videoFragment.isFirstLoadMore = false;
            videoFragment.loadMore();
            return;
        }
        C28168p mViewBinding2 = videoFragment.getMViewBinding();
        if (mViewBinding2 == null || (recyclerView = mViewBinding2.f86585e) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.d6
            @Override // java.lang.Runnable
            public final void run() {
                this.f57316a.loadMore();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAdapter$lambda$7$lambda$6$lambda$5(VideoFragment videoFragment) {
        C27941f c27941fM36186h0;
        videoFragment.isLoadingData = false;
        C16978e c16978e = videoFragment.mAdapter;
        if (c16978e == null || (c27941fM36186h0 = c16978e.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    private final void initAudioListener() {
        InterfaceC23410a mAudioApi = getMAudioApi();
        if (mAudioApi != null) {
            mAudioApi.pause();
        }
    }

    private final void initBack() {
        AppCompatImageView appCompatImageView;
        TnTextView tnTextView;
        AppCompatImageView appCompatImageView2;
        C28168p mViewBinding;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        ConstraintLayout constraintLayout;
        C28168p mViewBinding2 = getMViewBinding();
        ViewGroup.LayoutParams layoutParams = (mViewBinding2 == null || (constraintLayout = mViewBinding2.f86586f) == null) ? null : constraintLayout.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).topMargin = AbstractC5781d.m27351c();
        C28168p mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (appCompatImageView4 = mViewBinding3.f86583c) != null) {
            appCompatImageView4.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.v5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoFragment.initBack$lambda$14(this.f57478a, view);
                }
            });
        }
        if (this.isFromDownloaded && (mViewBinding = getMViewBinding()) != null && (appCompatImageView3 = mViewBinding.f86583c) != null) {
            AbstractC26006c.m102054g(appCompatImageView3);
        }
        if (this.mPostId.length() == 0) {
            C28168p mViewBinding4 = getMViewBinding();
            if (mViewBinding4 == null || (appCompatImageView2 = mViewBinding4.f86582b) == null) {
                return;
            }
            AbstractC26006c.m102054g(appCompatImageView2);
            return;
        }
        C28168p mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (tnTextView = mViewBinding5.f86587g) != null) {
            AbstractC26006c.m102054g(tnTextView);
        }
        C28168p mViewBinding6 = getMViewBinding();
        if (mViewBinding6 != null && (appCompatImageView = mViewBinding6.f86582b) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.w5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoFragment.initBack$lambda$15(this.f57485a, view);
                }
            });
        }
        requireActivity().getOnBackPressedDispatcher().m942i(this, new C17082b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBack$lambda$14(final VideoFragment videoFragment, View view) {
        final String postId;
        String userId;
        View viewM79145T;
        List<Object> data;
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        PagerLayoutManager pagerLayoutManager = videoFragment.mPagerLayoutManager;
        PostSubjectItem postSubjectItem = null;
        if (pagerLayoutManager != null && (viewM79145T = pagerLayoutManager.m79145T()) != null) {
            PagerLayoutManager pagerLayoutManager2 = videoFragment.mPagerLayoutManager;
            Integer numValueOf = pagerLayoutManager2 != null ? Integer.valueOf(pagerLayoutManager2.getPosition(viewM79145T)) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                C16978e c16978e = videoFragment.mAdapter;
                if (c16978e != null && (data = c16978e.getData()) != null) {
                    postSubjectItem = (PostSubjectItem) CollectionsKt.m97362l0(data, iIntValue);
                }
            }
        }
        if (postSubjectItem == null || (postId = postSubjectItem.getPostId()) == null) {
            return;
        }
        User user = postSubjectItem.getUser();
        if (user == null || (userId = user.getUserId()) == null) {
            userId = "";
        }
        String str = userId;
        C16768a.f56378a.m73076l(postSubjectItem, PAGE_NAME, videoFragment.pageFrom);
        NegativeFeedbackHelper negativeFeedbackHelper = NegativeFeedbackHelper.f56361a;
        Context contextRequireContext = videoFragment.requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        InterfaceC3224u viewLifecycleOwner = videoFragment.getViewLifecycleOwner();
        Intrinsics.m97801g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        negativeFeedbackHelper.m73022k(postId, str, contextRequireContext, AbstractC3226v.m14968a(viewLifecycleOwner), PAGE_NAME, new Function0() { // from class: com.transsion.postdetail.ui.fragment.f6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoFragment.initBack$lambda$14$lambda$13(this.f57331a, postId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initBack$lambda$14$lambda$13(VideoFragment videoFragment, String str) {
        videoFragment.removeVideoByPostId(str);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBack$lambda$15(VideoFragment videoFragment, View view) {
        if (videoFragment.needBackToRoom) {
            C23420k.m92971i(C23420k.f71413a, null, null, null, false, 15, null);
        }
        videoFragment.requireActivity().finish();
    }

    private final void initNonAd() {
    }

    private final void initPlayer() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        this.mOrPlayer = new InterfaceC16634g.a(contextRequireContext).m72450b(new C23622d(null, false, 0, 0, 0, 0, 0, 0, 0L, 0, 0, false, true, false, false, false, null, 126975, null)).m72449a();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        ORPlayerView oRPlayerView = new ORPlayerView(fragmentActivityRequireActivity, RenderType.TEXTURE_VIEW);
        this.mOrPlayerView = oRPlayerView;
        InterfaceC16634g interfaceC16634g = this.mOrPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setTextureView(oRPlayerView.getTextureView());
        }
        InterfaceC16634g interfaceC16634g2 = this.mOrPlayer;
        if (interfaceC16634g2 != null) {
            interfaceC16634g2.setLooping(true);
        }
    }

    private final void initViewModel() {
        getMVideoViewModel().m75056v().m14851j(this, new C17086f(new Function1() { // from class: com.transsion.postdetail.ui.fragment.g6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoFragment.initViewModel$lambda$8(this.f57358a, (PostSubjectBean) obj);
            }
        }));
        getMVideoViewModel().m75054t().m14851j(this, new C17086f(new Function1() { // from class: com.transsion.postdetail.ui.fragment.h6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoFragment.initViewModel$lambda$9(this.f57365a, (String) obj);
            }
        }));
        if (this.attachToMain) {
            ImmVideoHelper.f56352h.m73010a().m73000i().m14851j(this, new C17086f(new Function1() { // from class: com.transsion.postdetail.ui.fragment.i6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VideoFragment.initViewModel$lambda$10(this.f57372a, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$10(VideoFragment videoFragment, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            videoFragment.showProgress();
            videoFragment.loadData();
        } else {
            C26866a.a.m104898f(C26866a.f81698a, PAGE_NAME, "get cache " + ((PostSubjectItem) list.get(0)).getTitle(), false, 4, null);
            videoFragment.updateData(new PostSubjectBean(CollectionsKt.m97343U0(list), null, null, null));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$8(VideoFragment videoFragment, PostSubjectBean postSubjectBean) {
        C27941f c27941fM36186h0;
        C16978e c16978e;
        C27941f c27941fM36186h1;
        List<Object> data;
        videoFragment.isLoadingData = false;
        if (postSubjectBean == null) {
            C16978e c16978e2 = videoFragment.mAdapter;
            if (c16978e2 == null || (data = c16978e2.getData()) == null || data.size() != 0) {
                C16978e c16978e3 = videoFragment.mAdapter;
                if (c16978e3 != null && (c27941fM36186h0 = c16978e3.m36186h0()) != null && c27941fM36186h0.m108666r() && (c16978e = videoFragment.mAdapter) != null && (c27941fM36186h1 = c16978e.m36186h0()) != null) {
                    c27941fM36186h1.m108669v();
                }
            } else if (C27287m.f83003a.m106330e()) {
                videoFragment.showEmpty();
            } else {
                videoFragment.showNotNetError();
            }
        } else {
            C24655b logViewConfig = videoFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            videoFragment.updateData(postSubjectBean);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$9(VideoFragment videoFragment, String str) {
        if (TextUtils.equals("0", str)) {
            C28465b.f87467a.m109954a().m109949e(videoFragment.mPostId);
            FragmentActivity activity = videoFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else {
            C28951b.a aVar = C28951b.f88586a;
            FragmentActivity activity2 = videoFragment.getActivity();
            aVar.m111455e(activity2 != null ? activity2.getString(R$string.delete_post_failed) : null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        doLoadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMore() {
        loadData();
    }

    private final void localLogPause() {
        HashMap mapM96844g;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C24655b logViewConfig = getLogViewConfig();
        long jM96845h = jElapsedRealtime - (logViewConfig != null ? logViewConfig.m96845h() : 0L);
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 == null || (mapM96844g = logViewConfig2.m96844g()) == null) {
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23410a mAudioApi_delegate$lambda$0() {
        return (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
    }

    private final void observeRemoveVideo() {
        getMVideoViewModel().m75050C().m14851j(this, new C17086f(new Function1() { // from class: com.transsion.postdetail.ui.fragment.c6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoFragment.observeRemoveVideo$lambda$18(this.f57306a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeRemoveVideo$lambda$18(final VideoFragment videoFragment, final Integer num) {
        RecyclerView recyclerView;
        try {
            if (num.intValue() >= 0) {
                VideoPagerChangeControl videoPagerChangeControl = videoFragment.mPagerChangeControl;
                if (videoPagerChangeControl != null) {
                    videoPagerChangeControl.m72985n();
                }
                C16978e c16978e = videoFragment.mAdapter;
                if (c16978e != null) {
                    Intrinsics.m97799e(num);
                    c16978e.mo36138G0(num.intValue());
                }
                C28168p mViewBinding = videoFragment.getMViewBinding();
                if (mViewBinding != null && (recyclerView = mViewBinding.f86585e) != null) {
                    recyclerView.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.b6
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoFragment.observeRemoveVideo$lambda$18$lambda$17(this.f57296a, num);
                        }
                    });
                }
            }
        } catch (Throwable unused) {
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeRemoveVideo$lambda$18$lambda$17(VideoFragment videoFragment, Integer num) {
        RecyclerView.AbstractC4203b0 abstractC4203b0FindViewHolderForAdapterPosition;
        RecyclerView recyclerView;
        Integer numValueOf;
        C28168p mViewBinding = videoFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f86585e) == null) {
            abstractC4203b0FindViewHolderForAdapterPosition = null;
        } else {
            C16978e c16978e = videoFragment.mAdapter;
            if (c16978e != null) {
                int iM36174a0 = c16978e.m36174a0();
                Intrinsics.m97799e(num);
                numValueOf = Integer.valueOf(iM36174a0 + num.intValue());
            } else {
                numValueOf = num;
            }
            Intrinsics.m97799e(numValueOf);
            abstractC4203b0FindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(numValueOf.intValue());
        }
        VideoPagerChangeControl videoPagerChangeControl = videoFragment.mPagerChangeControl;
        if (videoPagerChangeControl != null) {
            Intrinsics.m97799e(num);
            videoPagerChangeControl.mo72960f(num.intValue(), true, abstractC4203b0FindViewHolderForAdapterPosition != null ? abstractC4203b0FindViewHolderForAdapterPosition.itemView : null);
        }
    }

    private final void removeVideoByPostId(String postId) {
        List<Object> data;
        C16978e c16978e = this.mAdapter;
        int i11 = -1;
        if (c16978e != null && (data = c16978e.getData()) != null) {
            Iterator<Object> it = data.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (Intrinsics.m97797c(((PostSubjectItem) it.next()).getPostId(), postId)) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 >= 0) {
            getMVideoViewModel().m75050C().mo14858q(Integer.valueOf(i11));
            NegativeFeedbackHelper.f56361a.m73020i(postId);
        }
    }

    private final void scrollToPosition(final int it) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        List<Object> data;
        C16978e c16978e = this.mAdapter;
        if (((c16978e == null || (data = c16978e.getData()) == null) ? 0 : data.size()) <= it) {
            return;
        }
        C28168p mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView2 = mViewBinding.f86585e) != null) {
            recyclerView2.scrollToPosition(it);
        }
        C28168p mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (recyclerView = mViewBinding2.f86585e) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.t5
            @Override // java.lang.Runnable
            public final void run() {
                VideoFragment.scrollToPosition$lambda$31(this.f57463a, it);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToPosition$lambda$31(VideoFragment videoFragment, int i11) {
        PagerLayoutManager pagerLayoutManager = videoFragment.mPagerLayoutManager;
        if (pagerLayoutManager != null) {
            View viewM79145T = pagerLayoutManager.m79145T();
            if (viewM79145T != null) {
                C26866a.a.m104905r(C26866a.f81698a, "ImmVideoPlayer", new String[]{"initView2， scrollToPosition ：" + i11}, false, 4, null);
                VideoPagerChangeControl videoPagerChangeControl = videoFragment.mPagerChangeControl;
                if (videoPagerChangeControl != null) {
                    videoPagerChangeControl.mo72960f(i11, true, viewM79145T);
                    return;
                }
                return;
            }
            int childCount = pagerLayoutManager.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = pagerLayoutManager.getChildAt(i12);
                if (childAt != null && pagerLayoutManager.getPosition(childAt) == i11) {
                    C26866a.a.m104905r(C26866a.f81698a, "ImmVideoPlayer", new String[]{"initView， scrollToPosition ：" + i11}, false, 4, null);
                    VideoPagerChangeControl videoPagerChangeControl2 = videoFragment.mPagerChangeControl;
                    if (videoPagerChangeControl2 != null) {
                        videoPagerChangeControl2.mo72960f(i11, true, childAt);
                        return;
                    }
                    return;
                }
            }
        }
    }

    private final void setPTParams(PostSubjectItem item) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        HashMap mapM96844g3;
        String mediaType;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null) {
            logViewConfig2.m96851n(item.getRec_ops());
        }
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null && (mapM96844g3 = logViewConfig3.m96844g()) != null) {
            Media media = item.getMedia();
            if (media == null || (mediaType = media.getMediaType()) == null) {
                mediaType = "";
            }
            mapM96844g3.put("post_media_type", mediaType);
        }
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null && (mapM96844g2 = logViewConfig4.m96844g()) != null) {
            Subject subject = item.getSubject();
            mapM96844g2.put("subject_id", subject != null ? subject.getSubjectId() : null);
        }
        C24655b logViewConfig5 = getLogViewConfig();
        if (logViewConfig5 == null || (mapM96844g = logViewConfig5.m96844g()) == null) {
            return;
        }
        Subject subject2 = item.getSubject();
        mapM96844g.put("has_resource", String.valueOf(subject2 != null ? subject2.getHasResource() : null));
    }

    private final void showEmpty() {
        C16978e c16978e;
        List<Object> data;
        hideProgress();
        C16978e c16978e2 = this.mAdapter;
        if (c16978e2 == null || (data = c16978e2.getData()) == null || !(!data.isEmpty())) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            View emptyView = getEmptyView(contextRequireContext);
            if (emptyView == null || (c16978e = this.mAdapter) == null) {
                return;
            }
            c16978e.m36171Y0(emptyView);
        }
    }

    private final void showNotNetError() {
        C16978e c16978e;
        TnTextView tnTextView;
        List<Object> data;
        hideProgress();
        C16978e c16978e2 = this.mAdapter;
        if (c16978e2 == null || (data = c16978e2.getData()) == null || !(!data.isEmpty())) {
            C28168p mViewBinding = getMViewBinding();
            if (mViewBinding != null && (tnTextView = mViewBinding.f86587g) != null) {
                AbstractC26006c.m102054g(tnTextView);
            }
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            View notNetErrorView = getNotNetErrorView(contextRequireContext);
            if (notNetErrorView == null || (c16978e = this.mAdapter) == null) {
                return;
            }
            c16978e.m36171Y0(notNetErrorView);
        }
    }

    private final void showProgress() {
        ProgressBar progressBar;
        C28168p mViewBinding = getMViewBinding();
        if (mViewBinding == null || (progressBar = mViewBinding.f86584d) == null) {
            return;
        }
        AbstractC26006c.m102058k(progressBar);
    }

    private final void showSettingDialog() {
        String string = Utils.m27275a().getString(com.transsion.ninegridview.R$string.permission_deny_down_tip, "\"" + Utils.m27275a().getString(com.transsion.baseui.R$string.base_app_name) + "\"", "\"" + Utils.m27275a().getString(com.transsion.ninegridview.R$string.system_settings) + "\"");
        Intrinsics.m97801g(string, "getString(...)");
        TRDialog.C13786a c13786aM62288g = new TRDialog.C13786a().m62288g(string);
        String string2 = Utils.m27275a().getString(com.transsion.ninegridview.R$string.cancel);
        Intrinsics.m97801g(string2, "getString(...)");
        TRDialog.C13786a c13786aM62286e = c13786aM62288g.m62286e(string2);
        String string3 = Utils.m27275a().getString(com.transsion.ninegridview.R$string.system_settings);
        Intrinsics.m97801g(string3, "getString(...)");
        c13786aM62286e.m62291j(string3).m62287f(this).m62282a().show(getChildFragmentManager(), "settings");
    }

    private final void updateData(PostSubjectBean subjectBean) {
        String nextPage;
        C16978e c16978e;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C16978e c16978e2;
        C27941f c27941fM36186h2;
        hideProgress();
        Pager pager = subjectBean.getPager();
        if (pager == null || (nextPage = pager.getNextPage()) == null) {
            nextPage = "1";
        }
        this.mNextPage = nextPage;
        List<PostSubjectItem> items = subjectBean.getItems();
        if (items != null) {
            Iterator<PostSubjectItem> it = items.iterator();
            while (it.hasNext()) {
                PostSubjectItem next = it.next();
                Media media = next.getMedia();
                if ((media != null ? media.getVideo() : null) != null) {
                    Media media2 = next.getMedia();
                    List<Video> video = media2 != null ? media2.getVideo() : null;
                    Intrinsics.m97799e(video);
                    if (video.isEmpty()) {
                    }
                }
                it.remove();
            }
            C16978e c16978e3 = this.mAdapter;
            List<Object> data = c16978e3 != null ? c16978e3.getData() : null;
            ArrayList arrayList = new ArrayList();
            if (data == null || !(!data.isEmpty())) {
                arrayList.addAll(items);
            } else {
                PostSubjectItem postSubjectItem = (PostSubjectItem) CollectionsKt.m97361k0(data);
                if (postSubjectItem != null) {
                    setPTParams(postSubjectItem);
                }
                for (PostSubjectItem postSubjectItem2 : items) {
                    if (data.contains(postSubjectItem2)) {
                        Subject subject = postSubjectItem2.getSubject();
                        if (subject != null) {
                            Integer subjectType = subject.getSubjectType();
                            int value = SubjectType.SHORT_TV.getValue();
                            if (subjectType != null && subjectType.intValue() == value) {
                            }
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ImmVideoList", "find same item title..." + postSubjectItem2.getTitle() + " id  " + postSubjectItem2.getPostId(), false, 4, null);
                    }
                    arrayList.add(postSubjectItem2);
                }
            }
            C16978e c16978e4 = this.mAdapter;
            if (c16978e4 != null) {
                c16978e4.mo36208q(arrayList);
            }
            VideoPagerChangeControl videoPagerChangeControl = this.mPagerChangeControl;
            if (videoPagerChangeControl != null) {
                videoPagerChangeControl.m72983k();
            }
            if (this.attachToMain) {
                ImmVideoHelper immVideoHelperM73010a = ImmVideoHelper.f56352h.m73010a();
                C16978e c16978e5 = this.mAdapter;
                immVideoHelperM73010a.m73006r(c16978e5 != null ? c16978e5.getData() : null);
            }
        }
        C16978e c16978e6 = this.mAdapter;
        if (c16978e6 != null && (c27941fM36186h1 = c16978e6.m36186h0()) != null && c27941fM36186h1.m108666r() && (c16978e2 = this.mAdapter) != null && (c27941fM36186h2 = c16978e2.m36186h0()) != null) {
            c27941fM36186h2.m108667s();
        }
        Pager pager2 = subjectBean.getPager();
        if ((pager2 != null ? Intrinsics.m97797c(pager2.getHasMore(), Boolean.FALSE) : false) && (c16978e = this.mAdapter) != null && (c27941fM36186h0 = c16978e.m36186h0()) != null) {
            C27941f.m108652u(c27941fM36186h0, false, 1, null);
        }
        int i11 = this.savedCurrentIndex;
        if (i11 >= 0) {
            scrollToPosition(i11);
            this.savedCurrentIndex = -1;
        }
    }

    public final List<String> getList() {
        return this.list;
    }

    public final long getResumeTimeStamp() {
        return this.resumeTimeStamp;
    }

    public final String getTran_ops() {
        return this.tran_ops;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C28168p getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28168p c28168pM109356c = C28168p.m109356c(inflater);
        Intrinsics.m97801g(c28168pM109356c, "inflate(...)");
        return c28168pM109356c;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        List listM72998g;
        ArrayList<PostSubjectItem> arrayList;
        String nextPage;
        Intrinsics.m97802h(view, "view");
        setNetListener(new C17083c());
        initViewModel();
        PostSubjectBean postSubjectBeanM75049B = getMVideoViewModel().m75049B();
        if (postSubjectBeanM75049B == null) {
            listM72998g = ImmVideoHelper.f56352h.m73010a().m72998g();
        } else {
            Pager pager = postSubjectBeanM75049B.getPager();
            if (pager == null || (nextPage = pager.getNextPage()) == null) {
                nextPage = "1";
            }
            this.mNextPage = nextPage;
            listM72998g = postSubjectBeanM75049B.getItems();
            if (listM72998g == null) {
                listM72998g = ImmVideoHelper.f56352h.m73010a().m72998g();
            }
        }
        if (listM72998g.isEmpty()) {
            if (this.attachToMain) {
                ImmVideoHelper.f56352h.m73010a().m73005p();
                return;
            } else {
                showProgress();
                loadData();
                return;
            }
        }
        if (!this.isFromDownloaded || (arrayList = this.downloadedShortsList) == null || arrayList.isEmpty()) {
            PostSubjectItem postSubjectItem = (PostSubjectItem) CollectionsKt.m97361k0(listM72998g);
            if (postSubjectItem != null) {
                setPTParams(postSubjectItem);
            }
            C16978e c16978e = this.mAdapter;
            if (c16978e != null) {
                c16978e.mo36208q(listM72998g);
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<PostSubjectItem> arrayList3 = this.downloadedShortsList;
        Intrinsics.m97799e(arrayList3);
        int size = arrayList3.size();
        for (int i11 = this.startDownloadedIndex; i11 < size; i11++) {
            ArrayList<PostSubjectItem> arrayList4 = this.downloadedShortsList;
            Intrinsics.m97799e(arrayList4);
            PostSubjectItem postSubjectItem2 = arrayList4.get(i11);
            Intrinsics.m97801g(postSubjectItem2, "get(...)");
            arrayList2.add(postSubjectItem2);
        }
        C16978e c16978e2 = this.mAdapter;
        if (c16978e2 != null) {
            c16978e2.mo36201n1(arrayList2);
        }
        this.prioritizeDownloaded = false;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        HashMap mapM96844g;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        Intrinsics.m97802h(view, "view");
        int i11 = savedInstanceState != null ? savedInstanceState.getInt(CURRENT_INDEX) : -1;
        this.savedCurrentIndex = i11;
        C26866a.a.m104905r(C26866a.f81698a, "ImmVideoPlayer", new String[]{"initView， savedCurrentIndex ：" + i11}, false, 4, null);
        initAd();
        initNonAd();
        initAdapter();
        initPlayer();
        initBack();
        initAudioListener();
        observeRemoveVideo();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        PagerLayoutManager pagerLayoutManager = new PagerLayoutManager(fragmentActivityRequireActivity);
        this.mPagerLayoutManager = pagerLayoutManager;
        C17084d c17084d = new C17084d(this.fromComment, this.mAdapter, this.mOrPlayer, this.mOrPlayerView, pagerLayoutManager, this.pageFrom);
        this.mPagerChangeControl = c17084d;
        PagerLayoutManager pagerLayoutManager2 = this.mPagerLayoutManager;
        if (pagerLayoutManager2 != null) {
            pagerLayoutManager2.m79147X(c17084d);
        }
        C28168p mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView3 = mViewBinding.f86585e) != null) {
            recyclerView3.setLayoutManager(this.mPagerLayoutManager);
        }
        C28168p mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (recyclerView2 = mViewBinding2.f86585e) != null) {
            recyclerView2.setAdapter(this.mAdapter);
        }
        C28168p mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (recyclerView = mViewBinding3.f86585e) != null) {
            recyclerView.addOnScrollListener(new C17085e());
        }
        ImmVideoHelper immVideoHelperM73010a = ImmVideoHelper.f56352h.m73010a();
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity2, "requireActivity(...)");
        immVideoHelperM73010a.m73002k(fragmentActivityRequireActivity2);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void logPause() {
        super.logPause();
        if (this.resumeTimeStamp != 0) {
            C14486e.f50941a.m65288n(PAGE_NAME, Long.valueOf(SystemClock.elapsedRealtime() - this.resumeTimeStamp), getContext());
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void logResume() {
        super.logResume();
        this.resumeTimeStamp = SystemClock.elapsedRealtime();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b(PAGE_NAME, false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        String string2;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        HashMap mapM96844g3;
        ArrayList<PostSubjectItem> arrayList;
        String string3;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("id")) == null) {
            string = "";
        }
        this.mPostId = string;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("comment_id")) == null) {
            string2 = "";
        }
        this.commentId = string2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string3 = arguments3.getString("item_type")) != null) {
            str = string3;
        }
        this.mItemType = str;
        Bundle arguments4 = getArguments();
        this.mTabId = arguments4 != null ? arguments4.getInt("tab_id") : 0;
        Bundle arguments5 = getArguments();
        this.videoLoadMore = arguments5 != null ? arguments5.getBoolean("video_load_more", true) : true;
        Bundle arguments6 = getArguments();
        this.fromComment = arguments6 != null ? arguments6.getBoolean("from_comment") : false;
        Bundle arguments7 = getArguments();
        this.tran_ops = arguments7 != null ? arguments7.getString("rec_ops") : null;
        Bundle arguments8 = getArguments();
        this.attachToMain = arguments8 != null ? arguments8.getBoolean("attach_to_main") : false;
        Bundle arguments9 = getArguments();
        this.pageFrom = arguments9 != null ? arguments9.getString(WebConstants.PAGE_FROM) : null;
        Bundle arguments10 = getArguments();
        this.needBackToRoom = arguments10 != null ? arguments10.getBoolean("need_back_to_room") : false;
        Bundle arguments11 = getArguments();
        Serializable serializable = arguments11 != null ? arguments11.getSerializable("downloaded_shorts_list") : null;
        this.downloadedShortsList = serializable instanceof ArrayList ? (ArrayList) serializable : null;
        Bundle arguments12 = getArguments();
        this.prioritizeDownloaded = arguments12 != null ? arguments12.getBoolean("prioritize_downloaded") : false;
        Bundle arguments13 = getArguments();
        this.isFromDownloaded = arguments13 != null ? arguments13.getBoolean("is_from_downloaded") : false;
        if (this.prioritizeDownloaded && (arrayList = this.downloadedShortsList) != null && !arrayList.isEmpty()) {
            ArrayList<PostSubjectItem> arrayList2 = this.downloadedShortsList;
            int i11 = -1;
            if (arrayList2 != null) {
                Iterator<PostSubjectItem> it = arrayList2.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.m97797c(it.next().getPostId(), this.mPostId)) {
                        i11 = i12;
                        break;
                    }
                    i12++;
                }
            }
            this.currentDownloadedIndex = i11;
            if (i11 < 0) {
                i11 = 0;
            }
            this.startDownloadedIndex = i11;
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g3 = logViewConfig.m96844g()) != null) {
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null && (mapM96844g2 = logViewConfig2.m96844g()) != null) {
        }
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null && (mapM96844g = logViewConfig3.m96844g()) != null) {
        }
        PostDetailViewModel mVideoViewModel = getMVideoViewModel();
        if (mVideoViewModel != null) {
            Bundle arguments14 = getArguments();
            mVideoViewModel.m75051F(arguments14 != null ? Integer.valueOf(arguments14.getInt("yy_preload_id")) : null, this.pageFrom);
        }
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69862p(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new C170871(null), 3, null);
        ImmVideoHelper.f56352h.m73010a().m72997f();
        BiddingListManager biddingListManager = this.v3ListManager;
        if (biddingListManager != null) {
            biddingListManager.m63187o();
        }
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69849c(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                InterfaceC16634g interfaceC16634g = this.mOrPlayer;
                if (interfaceC16634g != null) {
                    interfaceC16634g.pause();
                }
                logPause();
            } else {
                InterfaceC16634g interfaceC16634g2 = this.mOrPlayer;
                if (interfaceC16634g2 != null) {
                    interfaceC16634g2.play();
                }
                logResume();
            }
            VideoPagerChangeControl videoPagerChangeControl = this.mPagerChangeControl;
            if (videoPagerChangeControl != null) {
                videoPagerChangeControl.m72984l(hidden);
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onLeftButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
    }

    @Override // p352dn.InterfaceC23002f
    public void onMemberStateChange() {
        C26866a.a.m104898f(C26866a.f81698a, "co_mem", "VideoFragment --> onMemberStateChange() --> refresh list", false, 4, null);
        C16978e c16978e = this.mAdapter;
        if (c16978e != null) {
            c16978e.mo36201n1(null);
        }
        loadData();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        localLogPause();
        super.onPause();
        AbstractC14517k.m65414l(null, this, null, 5, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        PostSubjectItem postSubjectItem;
        List<Object> data;
        Intrinsics.m97802h(permissions, "permissions");
        Intrinsics.m97802h(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == FileHelper.f55226a.m71367l()) {
            if (grantResults.length > 1) {
                if (grantResults[0] == 0 && grantResults[1] == 0) {
                    PostSaveHelper postSaveHelper = PostSaveHelper.f57808a;
                    C16978e c16978e = this.mAdapter;
                    if (c16978e == null || (data = c16978e.getData()) == null) {
                        postSubjectItem = null;
                    } else {
                        VideoPagerChangeControl videoPagerChangeControl = this.mPagerChangeControl;
                        postSubjectItem = (PostSubjectItem) data.get(videoPagerChangeControl != null ? videoPagerChangeControl.m72982h() : 0);
                    }
                    postSaveHelper.m74906c(postSubjectItem);
                    return;
                }
            }
            FragmentActivity activity = getActivity();
            Intrinsics.m97800f(activity, "null cannot be cast to non-null type android.app.Activity");
            if (ActivityCompat.m11450j(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                return;
            }
            showSettingDialog();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        String strM73019f = NegativeFeedbackHelper.f56361a.m73019f();
        if (strM73019f != null) {
            removeVideoByPostId(strM73019f);
        }
        AbstractC14517k.m65418p(null, this, "visible=" + isVisible(), 1, null);
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onRightButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
        C16323b c16323b = C16323b.f55235a;
        FragmentActivity activity = getActivity();
        Intrinsics.m97800f(activity, "null cannot be cast to non-null type android.app.Activity");
        c16323b.m71374a(activity, 101);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        VideoPagerChangeControl videoPagerChangeControl = this.mPagerChangeControl;
        outState.putInt(CURRENT_INDEX, videoPagerChangeControl != null ? videoPagerChangeControl.m72982h() : 0);
    }

    public final void setResumeTimeStamp(long j11) {
        this.resumeTimeStamp = j11;
    }

    public final void setTran_ops(String str) {
        this.tran_ops = str;
    }
}
