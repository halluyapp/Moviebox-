package com.transsion.moviedetail.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.core.app.ActivityCompat;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.hisavana.common.bean.TAdErrorCode;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.p282tn.lib.net.bean.BaseDto;
import com.p282tn.lib.view.StateView;
import com.p282tn.lib.widget.R$string;
import com.p282tn.lib.widget.dialog.TRDialog;
import com.p282tn.lib.widget.dialog.TRDialogListener;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetail.R$layout;
import com.transsion.moviedetail.adapter.C15929j;
import com.transsion.moviedetail.view.SubjectCommentsLoadMoreView;
import com.transsion.moviedetail.viewmodel.HotViewModel;
import com.transsion.moviedetailapi.AbsSubjectListViewModel;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Audio;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.LikeBean;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.RoomBean;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.moviedetailapi.bean.Stat;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.moviedetailapi.p1002enum.PostListSource;
import com.transsion.moviedetailapi.p1002enum.ProfileSubSource;
import com.transsion.ninegridview.C16316a;
import com.transsion.ninegridview.helper.C16323b;
import com.transsion.ninegridview.helper.FileHelper;
import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.scene.C14047a;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.postdetail.util.PostSaveHelper;
import com.transsion.room.api.RoomsViewType;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.user.action.sync.event.CommentEvent;
import com.transsion.usercenterapi.ReportType;
import com.transsion.web.api.WebConstants;
import com.transsion.web.api.WebPageIdentity;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.LikeEvent;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23599g;
import gn.C23616x;
import gn.C23617y;
import gp.InterfaceC23624b;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import mg.C25832i;
import ng.AbstractC26006c;
import p393f.C23284j;
import p415fq.C23420k;
import p415fq.InterfaceC23410a;
import p415fq.InterfaceC23411b;
import p415fq.InterfaceC23414e;
import p415fq.InterfaceC23415f;
import p441gz.InterfaceC23704a;
import p461hi.AbstractC23854a;
import p550kj.C24655b;
import p550kj.C24662i;
import p561kx.InterfaceC25451b;
import p620nn.AbstractC26037d;
import p620nn.C26035b;
import p743rh.C27287m;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p913xm.C28615f;
import p925xy.C28672b;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 ¼\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002½\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J#\u0010\u001d\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0006J\u0019\u0010%\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b%\u0010\"J!\u0010'\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010&\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00072\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b1\u0010/J\u0019\u00103\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b3\u0010\"J\u000f\u00104\u001a\u00020\u0007H\u0002¢\u0006\u0004\b4\u0010\u0006J\u000f\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u0010\u0006J\u000f\u00106\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\u0007H\u0002¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010;\u001a\u00020\u0019H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0019H\u0002¢\u0006\u0004\b=\u0010<J\u001b\u0010@\u001a\u0004\u0018\u00010\u001f2\b\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ\u0019\u0010G\u001a\u00020\u00072\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00022\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0019H\u0016¢\u0006\u0004\bM\u0010<J\u000f\u0010N\u001a\u00020\u001bH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0007H\u0016¢\u0006\u0004\bP\u0010\u0006J\u001f\u0010U\u001a\u00020\u00072\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0007H\u0016¢\u0006\u0004\bW\u0010\u0006J\u000f\u0010X\u001a\u00020\u0007H\u0016¢\u0006\u0004\bX\u0010\u0006J\u000f\u0010Y\u001a\u00020\u0007H\u0016¢\u0006\u0004\bY\u0010\u0006J\r\u0010Z\u001a\u00020\u0007¢\u0006\u0004\bZ\u0010\u0006J\u0017\u0010]\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b_\u0010^J1\u0010f\u001a\u00020\u00072\u0006\u0010a\u001a\u00020`2\u0010\u0010c\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00190b2\u0006\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u0007H\u0016¢\u0006\u0004\bh\u0010\u0006J\u000f\u0010i\u001a\u00020\u0007H\u0016¢\u0006\u0004\bi\u0010\u0006J\u000f\u0010j\u001a\u00020\u0007H\u0016¢\u0006\u0004\bj\u0010\u0006J\u0011\u0010l\u001a\u0004\u0018\u00010kH\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020k2\u0006\u0010n\u001a\u00020\u001bH\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020k2\u0006\u0010n\u001a\u00020\u001bH\u0016¢\u0006\u0004\bq\u0010pJ\u0017\u0010s\u001a\u00020\u00072\u0006\u0010r\u001a\u00020\u001bH\u0016¢\u0006\u0004\bs\u0010tJ\u000f\u0010v\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u001bH\u0016¢\u0006\u0004\by\u0010tR\u0018\u0010{\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R#\u0010\u008f\u0001\u001a\f\u0012\u0005\u0012\u00030\u008e\u0001\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R#\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R#\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0093\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R#\u0010 \u0001\u001a\u0005\u0018\u00010\u009c\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u0093\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001b\u0010¤\u0001\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R#\u0010ª\u0001\u001a\u0005\u0018\u00010¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0001\u0010\u0093\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001c\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0019\u0010±\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001b\u0010³\u0001\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R2\u0010º\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00190µ\u0001j\t\u0012\u0004\u0012\u00020\u0019`¶\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b·\u0001\u0010\u0093\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0019\u0010»\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010²\u0001¨\u0006¾\u0001"}, m97100d2 = {"Lcom/transsion/moviedetail/fragment/SubjectListFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lgn/g;", "Lkx/b;", "Lcom/tn/lib/widget/dialog/TRDialogListener;", "<init>", "()V", "", "initExposureHelper", "initLaunch", "initLiveData", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "postSubjectBean", "updateSubjectList", "(Lcom/transsion/moviedetailapi/bean/PostSubjectBean;)V", "initScrollListener", "initPlayer", "checkToShowEmptyView", "Lcom/transsion/moviedetailapi/bean/LikeBean;", "likeBean", "updateLikeStatus", "(Lcom/transsion/moviedetailapi/bean/LikeBean;)V", "lazyLoadData", "loadMore", "initClickListener", "", "postId", "", "hasLike", "like", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "postItem", "onDownLoadClick", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "requestPermission", "showSettingDialog", "share", "fromComment", "openDetail", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;Z)V", "Lcom/tn/lib/net/bean/BaseDto;", "data", "updateDeletePost", "(Lcom/tn/lib/net/bean/BaseDto;)V", "id", "removePost", "(Ljava/lang/String;)V", "url", "toWeb", WebConstants.FIELD_ITEM, "showAudioFloating", "observeDelete", "observeLike", "observeComment", "initAd", "insertLast", "initListVideoPreload", "localLogPause", "pageName", "()Ljava/lang/String;", "subpageName", "Lcom/transsion/moviedetailapi/bean/RoomBean;", "bean", "getRecommendRoomsBean", "(Lcom/transsion/moviedetailapi/bean/RoomBean;)Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "", "getPostExposurePercent", "()F", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "getViewBinding", "(Landroid/view/LayoutInflater;)Lgn/g;", "getPageStateLayoutTitle", "isAudioShowNoNetworkLayout", "()Z", "initViewData", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "initViewModel", "initListener", "retryLoadData", ToolBar.REFRESH, "Lcom/tn/lib/widget/dialog/TRDialog;", "dialog", "onLeftButtonClick", "(Lcom/tn/lib/widget/dialog/TRDialog;)V", "onRightButtonClick", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onResume", "onPause", "onDestroy", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "isShowTitleLayout", "getLocalNoNetworkView", "(Z)Landroid/view/View;", "getEmptyView", "hidden", "onHiddenChanged", "(Z)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "fullscreen", "onScreenChange", "Lvj/b;", "mExposureHelper", "Lvj/b;", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "middleListManager", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "nativeManager", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "Lcom/transsion/moviedetailapi/AbsSubjectListViewModel;", "mHotViewModel", "Lcom/transsion/moviedetailapi/AbsSubjectListViewModel;", "Lcom/transsion/moviedetail/adapter/j;", "mAdapter", "Lcom/transsion/moviedetail/adapter/j;", "mPostSubjectBean", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "mPostSubjectItem", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "postDetailLauncher", "Landroidx/activity/result/b;", "Lgz/a;", "mLoginApi$delegate", "Lkotlin/Lazy;", "getMLoginApi", "()Lgz/a;", "mLoginApi", "Lfq/a;", "mAudioApi$delegate", "getMAudioApi", "()Lfq/a;", "mAudioApi", "Lfq/b;", "mFloatApi$delegate", "getMFloatApi", "()Lfq/b;", "mFloatApi", "Lfq/e;", "mRoomView", "Lfq/e;", "mEmptyLayout", "Landroid/view/View;", "Lfq/f;", "mRoomApi$delegate", "getMRoomApi", "()Lfq/f;", "mRoomApi", "Lcom/transsion/ninegridview/a;", "mGifPlayerManager", "Lcom/transsion/ninegridview/a;", "Lcom/transsion/moviedetailapi/bean/Subject;", "mSubject", "Lcom/transsion/moviedetailapi/bean/Subject;", "firstLoad", "Z", "curPageName", "Ljava/lang/String;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "mExposureList$delegate", "getMExposureList", "()Ljava/util/HashSet;", "mExposureList", "isFirst", "Companion", "a", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public class SubjectListFragment extends PageStatusFragment<C23599g> implements InterfaceC25451b, TRDialogListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KEY_POST_EXPOSURE_PERCENT = "sa_post_exposure_percent";
    public static final String TAG = "MoveListFragment";
    private String curPageName;
    private boolean firstLoad;
    private C15929j mAdapter;
    private View mEmptyLayout;
    private C28117b mExposureHelper;
    private C16316a mGifPlayerManager;
    private AbsSubjectListViewModel mHotViewModel;
    private PostSubjectBean mPostSubjectBean;
    private PostSubjectItem mPostSubjectItem;
    private InterfaceC23414e mRoomView;
    private Subject mSubject;
    private BiddingListManager middleListManager;
    private BiddingNativeManager nativeManager;
    private AbstractC0249b postDetailLauncher;

    /* JADX INFO: renamed from: mLoginApi$delegate, reason: from kotlin metadata */
    private final Lazy mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.fragment.d2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubjectListFragment.mLoginApi_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mAudioApi$delegate, reason: from kotlin metadata */
    private final Lazy mAudioApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.fragment.e2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubjectListFragment.mAudioApi_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: mFloatApi$delegate, reason: from kotlin metadata */
    private final Lazy mFloatApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.fragment.f2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubjectListFragment.mFloatApi_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: mRoomApi$delegate, reason: from kotlin metadata */
    private final Lazy mRoomApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.fragment.g2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubjectListFragment.mRoomApi_delegate$lambda$3();
        }
    });

    /* JADX INFO: renamed from: mExposureList$delegate, reason: from kotlin metadata */
    private final Lazy mExposureList = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.fragment.h2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubjectListFragment.mExposureList_delegate$lambda$4();
        }
    });
    private boolean isFirst = true;

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.SubjectListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SubjectListFragment m70517a(Bundle params, Class type) {
            Intrinsics.m97802h(params, "params");
            Intrinsics.m97802h(type, "type");
            SubjectListFragment subjectListFragment = new SubjectListFragment();
            params.putSerializable("view_model_type", type);
            subjectListFragment.setArguments(params);
            return subjectListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.SubjectListFragment$b */
    public static final class C15979b implements InterfaceC28116a {
        C15979b() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            PostSubjectItem postSubjectItem;
            AbsSubjectListViewModel absSubjectListViewModelM70199S1;
            PostListSource postListSourceMo69056A;
            SubjectListFragment subjectListFragment = SubjectListFragment.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                C15929j c15929j = subjectListFragment.mAdapter;
                if (c15929j != null && (postSubjectItem = (PostSubjectItem) c15929j.getItem(i11)) != null) {
                    String strName = "";
                    if (subjectListFragment.mAdapter != null) {
                        C15929j c15929j2 = subjectListFragment.mAdapter;
                        strName = (c15929j2 == null || (absSubjectListViewModelM70199S1 = c15929j2.getViewModel()) == null || (postListSourceMo69056A = absSubjectListViewModelM70199S1.mo69056A()) == null) ? null : postListSourceMo69056A.name();
                    }
                    String str = strName;
                    if (!CollectionsKt.m97352b0(subjectListFragment.getMExposureList(), postSubjectItem.getPostId())) {
                        String postId = postSubjectItem.getPostId();
                        if (postId != null) {
                            subjectListFragment.getMExposureList().add(postId);
                        }
                        C16768a.f56378a.m73082w(str, subjectListFragment.pageName(), subjectListFragment.subpageName(), i11, j11, postSubjectItem, (64 & 64) != 0 ? null : null);
                    }
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.SubjectListFragment$c */
    public static final class C15980c extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        private int f54626a;

        /* JADX INFO: renamed from: b */
        private int f54627b;

        C15980c() {
        }

        /* JADX INFO: renamed from: d */
        private final void m70518d(RecyclerView recyclerView) {
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                throw new RuntimeException("Unsupported layoutManager.");
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.f54626a = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            this.f54627b = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            C15929j c15929j;
            C27941f c27941fM36186h0;
            C27941f c27941fM36186h1;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            int childCount = layoutManager != null ? layoutManager.getChildCount() : 0;
            int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
            if (i11 != 0 || childCount <= 0 || this.f54626a < itemCount - 1) {
                return;
            }
            C15929j c15929j2 = SubjectListFragment.this.mAdapter;
            if (((c15929j2 == null || (c27941fM36186h1 = c15929j2.m36186h0()) == null) ? null : c27941fM36186h1.m108661i()) != LoadMoreStatus.Fail || (c15929j = SubjectListFragment.this.mAdapter) == null || (c27941fM36186h0 = c15929j.m36186h0()) == null) {
                return;
            }
            c27941fM36186h0.m108670w();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            m70518d(recyclerView);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.SubjectListFragment$d */
    public static final class C15981d extends DiffUtil.AbstractC4174e {
        C15981d() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(PostSubjectItem oldItem, PostSubjectItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(String.valueOf(oldItem.getPostId()), String.valueOf(newItem.getPostId()));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(PostSubjectItem oldItem, PostSubjectItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            Subject subject = oldItem.getSubject();
            String subjectId = subject != null ? subject.getSubjectId() : null;
            Subject subject2 = newItem.getSubject();
            return Intrinsics.m97797c(subjectId, subject2 != null ? subject2.getSubjectId() : null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.SubjectListFragment$e */
    public static final class C15982e implements InterfaceC18701a {
        C15982e() {
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: a */
        public void mo70521a(String id2, PostType postType) {
            Intrinsics.m97802h(id2, "id");
            AbsSubjectListViewModel absSubjectListViewModel = SubjectListFragment.this.mHotViewModel;
            if (absSubjectListViewModel != null) {
                absSubjectListViewModel.m70953m(id2);
            }
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: b */
        public void mo70522b(String str) {
            C26866a.a.m104898f(C26866a.f81698a, SubjectListFragment.TAG, "id" + str, false, 4, null);
            SubjectListFragment.this.removePost(str);
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

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.SubjectListFragment$insertLast$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.moviedetail.fragment.SubjectListFragment$insertLast$1", m97637f = "SubjectListFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C159831 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<PostSubjectItem> $dataList;
        int label;

        /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.SubjectListFragment$insertLast$1$2, reason: invalid class name */
        @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
        @DebugMetadata(m97636c = "com.transsion.moviedetail.fragment.SubjectListFragment$insertLast$1$2", m97637f = "SubjectListFragment.kt", m97638l = {1174}, m97639m = "invokeSuspend")
        static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SubjectListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SubjectListFragment subjectListFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = subjectListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = IntrinsicsKt.m97630f();
                int i11 = this.label;
                if (i11 == 0) {
                    ResultKt.m97107b(obj);
                    BiddingNativeManager biddingNativeManager = this.this$0.nativeManager;
                    if (biddingNativeManager != null) {
                        this.label = 1;
                        if (AbsAdBidding.m62816t0(biddingNativeManager, 0, false, this, 3, null) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
        }

        /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.SubjectListFragment$insertLast$1$a */
        public static final class a extends AbstractC23854a {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ SubjectListFragment f54630d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ List f54631e;

            a(SubjectListFragment subjectListFragment, List list) {
                this.f54630d = subjectListFragment;
                this.f54631e = list;
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: i */
            public void mo62846i(TAdErrorCode tAdErrorCode) {
                super.mo62846i(tAdErrorCode);
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: j */
            public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                Function2 function2M63188r;
                super.mo62778j(biddingIntermediateMaterialBean);
                BiddingNativeManager biddingNativeManager = this.f54630d.nativeManager;
                if (biddingNativeManager != null) {
                    SubjectListFragment subjectListFragment = this.f54630d;
                    List list = this.f54631e;
                    BiddingListManager biddingListManager = subjectListFragment.middleListManager;
                    if (biddingListManager != null && (function2M63188r = biddingListManager.m63188r()) != null) {
                    }
                    BiddingListManager biddingListManager2 = subjectListFragment.middleListManager;
                    if (biddingListManager2 != null) {
                        biddingListManager2.m63182D(null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C159831(List<PostSubjectItem> list, Continuation<? super C159831> continuation) {
            super(2, continuation);
            this.$dataList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SubjectListFragment.this.new C159831(this.$dataList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C159831) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            SubjectListFragment.this.nativeManager = new BiddingNativeManager();
            BiddingNativeManager biddingNativeManager = SubjectListFragment.this.nativeManager;
            if (biddingNativeManager != null) {
                biddingNativeManager.m62830L0("SubjectDetailRecommendScene");
            }
            BiddingNativeManager biddingNativeManager2 = SubjectListFragment.this.nativeManager;
            if (biddingNativeManager2 != null) {
                biddingNativeManager2.m62829K0(new a(SubjectListFragment.this, this.$dataList));
            }
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(SubjectListFragment.this), null, null, new AnonymousClass2(SubjectListFragment.this, null), 3, null);
            return Unit.f75682a;
        }
    }

    private final void checkToShowEmptyView() {
        PostSubjectItem recommendRoomsBean;
        InterfaceC23414e interfaceC23414e;
        View view;
        Unit unit;
        InterfaceC23414e interfaceC23414e2;
        View view2;
        String value;
        ProfileSubSource profileSubSourceMo70864B;
        RecyclerView recyclerView;
        C23599g mViewBinding;
        RecyclerView recyclerView2;
        C15929j c15929j = this.mAdapter;
        if (c15929j == null || c15929j.getItemCount() != 0) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C23599g mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (recyclerView = mViewBinding2.f71940b) != null && recyclerView.getItemDecorationCount() == 0 && (mViewBinding = getMViewBinding()) != null && (recyclerView2 = mViewBinding.f71940b) != null) {
                recyclerView2.addItemDecoration(new C25832i(AbstractC5776a0.m27313a(16.0f), 0));
            }
            Context context = getContext();
            Unit unit2 = null;
            if (context != null) {
                if (this.mRoomView == null) {
                    InterfaceC23415f mRoomApi = getMRoomApi();
                    this.mRoomView = mRoomApi != null ? mRoomApi.mo92965c(context, RoomsViewType.TYPE_SUBJECT_DETAIL) : null;
                }
                AbsSubjectListViewModel absSubjectListViewModel = this.mHotViewModel;
                if (absSubjectListViewModel instanceof HotViewModel) {
                    Intrinsics.m97800f(absSubjectListViewModel, "null cannot be cast to non-null type com.transsion.moviedetail.viewmodel.HotViewModel");
                    RoomBean roomBean = (RoomBean) ((HotViewModel) absSubjectListViewModel).m70868d0().m14847f();
                    if (roomBean != null && (recommendRoomsBean = getRecommendRoomsBean(roomBean)) != null) {
                        List<RoomItem> roomList = recommendRoomsBean.getRoomList();
                        if (roomList != null) {
                            InterfaceC23414e interfaceC23414e3 = this.mRoomView;
                            if (interfaceC23414e3 != null) {
                                String strPageName = pageName();
                                AbsSubjectListViewModel absSubjectListViewModel2 = this.mHotViewModel;
                                if (absSubjectListViewModel2 == null || (profileSubSourceMo70864B = absSubjectListViewModel2.mo70864B()) == null || (value = profileSubSourceMo70864B.getValue()) == null) {
                                    value = ProfileSubSource.COMMENTS.getValue();
                                }
                                interfaceC23414e3.setReportName(strPageName, value);
                            }
                            InterfaceC23414e interfaceC23414e4 = this.mRoomView;
                            if (interfaceC23414e4 != null) {
                                interfaceC23414e4.setList(roomList);
                                unit = Unit.f75682a;
                            } else {
                                unit = null;
                            }
                            if (unit != null && (interfaceC23414e2 = this.mRoomView) != null && (view2 = interfaceC23414e2.getView()) != null) {
                                AbstractC26006c.m102054g(view2);
                                unit2 = Unit.f75682a;
                            }
                        }
                        if (unit2 != null && (interfaceC23414e = this.mRoomView) != null && (view = interfaceC23414e.getView()) != null) {
                            AbstractC26006c.m102054g(view);
                        }
                    }
                }
                C15929j c15929j2 = this.mAdapter;
                if (c15929j2 != null) {
                    c15929j2.m36171Y0(getEmptyView(false));
                }
                C15929j c15929j3 = this.mAdapter;
                if (c15929j3 != null) {
                    c15929j3.m36233z1(true);
                }
                unit2 = Unit.f75682a;
            }
            Result.m112707constructorimpl(unit2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    private final InterfaceC23410a getMAudioApi() {
        return (InterfaceC23410a) this.mAudioApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HashSet<String> getMExposureList() {
        return (HashSet) this.mExposureList.getValue();
    }

    private final InterfaceC23411b getMFloatApi() {
        return (InterfaceC23411b) this.mFloatApi.getValue();
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    private final InterfaceC23415f getMRoomApi() {
        return (InterfaceC23415f) this.mRoomApi.getValue();
    }

    private final float getPostExposurePercent() {
        Float fT;
        ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), KEY_POST_EXPOSURE_PERCENT, false, 2, null);
        String value = configBeanM110355d != null ? configBeanM110355d.getValue() : null;
        if (value == null || value.length() == 0 || (fT = StringsKt.m98214t(value)) == null) {
            return 0.6f;
        }
        return fT.floatValue();
    }

    private final PostSubjectItem getRecommendRoomsBean(RoomBean bean) {
        List<Object> data;
        PostSubjectItem postSubjectItem;
        List<RoomItem> items = bean != null ? bean.getItems() : null;
        List<RoomItem> list = items;
        if (list == null || list.isEmpty()) {
            return null;
        }
        C15929j c15929j = this.mAdapter;
        if (c15929j != null && (data = c15929j.getData()) != null && (postSubjectItem = (PostSubjectItem) CollectionsKt.m97361k0(data)) != null && postSubjectItem.isRoomList()) {
            return null;
        }
        if (items.size() > 3) {
            items = items.subList(0, 3);
        }
        PostSubjectItem postSubjectItem2 = new PostSubjectItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, false, false, false, null, -1, 1, null);
        postSubjectItem2.setRoomList(true);
        postSubjectItem2.setRoomList(items);
        return postSubjectItem2;
    }

    private final void initAd() {
        AbsSubjectListViewModel absSubjectListViewModel = this.mHotViewModel;
        if ((absSubjectListViewModel != null ? absSubjectListViewModel.mo69056A() : null) != PostListSource.SUBJECT) {
            return;
        }
        BiddingListManager biddingListManager = new BiddingListManager();
        this.middleListManager = biddingListManager;
        C23599g mViewBinding = getMViewBinding();
        biddingListManager.m63184F(mViewBinding != null ? mViewBinding.f71940b : null);
        BiddingListManager biddingListManager2 = this.middleListManager;
        if (biddingListManager2 != null) {
            biddingListManager2.m63179A(AbstractC3226v.m14968a(this));
        }
        BiddingListManager biddingListManager3 = this.middleListManager;
        if (biddingListManager3 != null) {
            biddingListManager3.m63185G("SubjectDetailRecommendScene");
        }
        BiddingListManager biddingListManager4 = this.middleListManager;
        if (biddingListManager4 != null) {
            biddingListManager4.m63192z(new Function2() { // from class: com.transsion.moviedetail.fragment.q1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SubjectListFragment.initAd$lambda$60(this.f54753a, ((Integer) obj).intValue(), (BiddingNativeManager) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initAd$lambda$60(SubjectListFragment subjectListFragment, int i11, BiddingNativeManager current) {
        List<Object> data;
        Intrinsics.m97802h(current, "current");
        if (current != null) {
            PostSubjectItem postSubjectItem = new PostSubjectItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, false, false, false, null, -1, 1, null);
            postSubjectItem.setNonAdDelegate(current);
            C15929j c15929j = subjectListFragment.mAdapter;
            int size = (c15929j == null || (data = c15929j.getData()) == null) ? 0 : data.size();
            if (i11 <= size) {
                C15929j c15929j2 = subjectListFragment.mAdapter;
                if (c15929j2 != null) {
                    c15929j2.mo36199n(i11, postSubjectItem);
                }
            } else {
                C15929j c15929j3 = subjectListFragment.mAdapter;
                if (c15929j3 != null) {
                    c15929j3.mo36199n(size, postSubjectItem);
                }
            }
        }
        return Unit.f75682a;
    }

    private final void initClickListener() {
    }

    private final void initExposureHelper() {
        RecyclerView recyclerView;
        float postExposurePercent = getPostExposurePercent();
        C26866a.a.m104898f(C26866a.f81698a, "PostList", "initExposureHelper, postExposurePercent:" + postExposurePercent, false, 4, null);
        C28117b c28117b = new C28117b(postExposurePercent, new C15979b(), false, 4, null);
        c28117b.m109199n(2);
        C23599g mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f71940b) != null) {
            recyclerView.addOnScrollListener(c28117b);
        }
        this.mExposureHelper = c28117b;
    }

    private final void initLaunch() {
        this.postDetailLauncher = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.moviedetail.fragment.u1
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                SubjectListFragment.initLaunch$lambda$13(this.f54773a, (ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLaunch$lambda$13(SubjectListFragment subjectListFragment, ActivityResult it) {
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() == -1) {
            Intent data = it.getData();
            Serializable serializableExtra = data != null ? data.getSerializableExtra(MimeTypes.BASE_TYPE_AUDIO) : null;
            if (serializableExtra instanceof AudioBean) {
                C26866a.a.m104898f(C26866a.f81698a, TAG, "showFloating", false, 4, null);
                InterfaceC23411b interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0]);
                if (interfaceC23411b != null) {
                    interfaceC23411b.mo23884a(new WeakReference(subjectListFragment.requireActivity()), (AudioBean) serializableExtra);
                }
            }
            Intent data2 = it.getData();
            subjectListFragment.removePost(data2 != null ? data2.getStringExtra("id") : null);
        }
    }

    private final void initListVideoPreload() {
        RecyclerView recyclerView;
        AbsSubjectListViewModel absSubjectListViewModel = this.mHotViewModel;
        if (absSubjectListViewModel != null) {
            if ((absSubjectListViewModel != null ? absSubjectListViewModel.mo69056A() : null) != PostListSource.SUBJECT) {
                return;
            }
            C26035b c26035b = new C26035b(0.75f, new Function1() { // from class: com.transsion.moviedetail.fragment.v1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubjectListFragment.initListVideoPreload$lambda$61(this.f54775a, ((Integer) obj).intValue());
                }
            });
            C23599g mViewBinding = getMViewBinding();
            if (mViewBinding == null || (recyclerView = mViewBinding.f71940b) == null) {
                return;
            }
            recyclerView.addOnScrollListener(c26035b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PostSubjectItem initListVideoPreload$lambda$61(SubjectListFragment subjectListFragment, int i11) {
        List<Object> data;
        try {
            C15929j c15929j = subjectListFragment.mAdapter;
            if (c15929j == null || (data = c15929j.getData()) == null) {
                return null;
            }
            return (PostSubjectItem) data.get(i11);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void initLiveData() {
        AbsSubjectListViewModel absSubjectListViewModel = this.mHotViewModel;
        if (absSubjectListViewModel != null) {
            if (absSubjectListViewModel instanceof HotViewModel) {
                ((HotViewModel) absSubjectListViewModel).m70868d0().m14851j(this, new C16043k2(new Function1() { // from class: com.transsion.moviedetail.fragment.w1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SubjectListFragment.initLiveData$lambda$22$lambda$14(this.f54778a, (RoomBean) obj);
                    }
                }));
            }
            absSubjectListViewModel.m70963x().m14851j(this, new C16043k2(new Function1() { // from class: com.transsion.moviedetail.fragment.x1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubjectListFragment.initLiveData$lambda$22$lambda$16(this.f54782a, (PostSubjectBean) obj);
                }
            }));
            absSubjectListViewModel.m70958r().m14851j(this, new C16043k2(new Function1() { // from class: com.transsion.moviedetail.fragment.y1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubjectListFragment.initLiveData$lambda$22$lambda$17(this.f54786a, (LikeBean) obj);
                }
            }));
            absSubjectListViewModel.m70954n().m14851j(getViewLifecycleOwner(), new C16043k2(new Function1() { // from class: com.transsion.moviedetail.fragment.a2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubjectListFragment.initLiveData$lambda$22$lambda$20(this.f54685a, (List) obj);
                }
            }));
            absSubjectListViewModel.m70956p().m14851j(getViewLifecycleOwner(), new C16043k2(new Function1() { // from class: com.transsion.moviedetail.fragment.b2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubjectListFragment.initLiveData$lambda$22$lambda$21(this.f54690a, (BaseDto) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initLiveData$lambda$22$lambda$14(SubjectListFragment subjectListFragment, RoomBean roomBean) {
        AbsSubjectListViewModel absSubjectListViewModel;
        C15929j c15929j = subjectListFragment.mAdapter;
        List<Object> data = c15929j != null ? c15929j.getData() : null;
        if ((data == null || data.isEmpty()) && (absSubjectListViewModel = subjectListFragment.mHotViewModel) != null) {
            absSubjectListViewModel.mo69057E(true);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initLiveData$lambda$22$lambda$16(final SubjectListFragment subjectListFragment, final PostSubjectBean postSubjectBean) {
        RecyclerView recyclerView;
        C24655b logViewConfig = subjectListFragment.getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        subjectListFragment.showContentView();
        subjectListFragment.mPostSubjectBean = postSubjectBean;
        AbstractC26037d.m102102d(subjectListFragment.getContext(), postSubjectBean != null ? postSubjectBean.getItems() : null);
        if (subjectListFragment.firstLoad) {
            C23599g mViewBinding = subjectListFragment.getMViewBinding();
            if (mViewBinding != null && (recyclerView = mViewBinding.f71940b) != null) {
                recyclerView.postDelayed(new Runnable() { // from class: com.transsion.moviedetail.fragment.o1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f54742a.updateSubjectList(postSubjectBean);
                    }
                }, 300L);
            }
        } else {
            subjectListFragment.firstLoad = true;
            subjectListFragment.updateSubjectList(postSubjectBean);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initLiveData$lambda$22$lambda$17(SubjectListFragment subjectListFragment, LikeBean likeBean) {
        if (likeBean != null) {
            subjectListFragment.updateLikeStatus(likeBean);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initLiveData$lambda$22$lambda$20(SubjectListFragment subjectListFragment, List list) {
        List<Object> arrayList;
        C15929j c15929j;
        C27941f c27941fM36186h0;
        RecyclerView recyclerView;
        RecyclerView.AbstractC4214m layoutManager;
        List<Object> data;
        PostSubjectItem postSubjectItem;
        if (list != null) {
            C15929j c15929j2 = subjectListFragment.mAdapter;
            if (c15929j2 == null || (arrayList = c15929j2.getData()) == null) {
                arrayList = new ArrayList<>();
            }
            ArrayList arrayList2 = new ArrayList();
            if (arrayList.isEmpty()) {
                arrayList2.addAll(list);
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    PostSubjectItem postSubjectItem2 = (PostSubjectItem) it.next();
                    if (!arrayList.contains(postSubjectItem2)) {
                        arrayList2.add(postSubjectItem2);
                    }
                }
            }
            C15929j c15929j3 = subjectListFragment.mAdapter;
            int i11 = (c15929j3 == null || (data = c15929j3.getData()) == null || (postSubjectItem = (PostSubjectItem) CollectionsKt.m97361k0(data)) == null || !postSubjectItem.isRoomList()) ? 0 : 1;
            C15929j c15929j4 = subjectListFragment.mAdapter;
            if (c15929j4 != null) {
                c15929j4.mo36202o(i11, arrayList2);
            }
            C23599g mViewBinding = subjectListFragment.getMViewBinding();
            if (mViewBinding != null && (recyclerView = mViewBinding.f71940b) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                try {
                    if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() <= 1) {
                        ((LinearLayoutManager) layoutManager).scrollToPosition(0);
                    }
                } catch (Exception unused) {
                }
            }
            C15929j c15929j5 = subjectListFragment.mAdapter;
            if ((c15929j5 != null ? c15929j5.getItemCount() : 0) == list.size() && (c15929j = subjectListFragment.mAdapter) != null && (c27941fM36186h0 = c15929j.m36186h0()) != null) {
                c27941fM36186h0.m108668t(false);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initLiveData$lambda$22$lambda$21(SubjectListFragment subjectListFragment, BaseDto baseDto) {
        subjectListFragment.updateDeletePost(baseDto);
        return Unit.f75682a;
    }

    private final void initPlayer() {
        RecyclerView recyclerView;
        C16316a c16316a = new C16316a();
        C23599g mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f71940b) != null) {
            c16316a.m71346n(recyclerView, this.mAdapter);
        }
        this.mGifPlayerManager = c16316a;
    }

    private final void initScrollListener() {
        RecyclerView recyclerView;
        C23599g mViewBinding = getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f71940b) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C15980c());
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static final void initViewData$lambda$11$lambda$10(SubjectListFragment subjectListFragment, BaseQuickAdapter adapter, View view, int i11) {
        User user;
        User user2;
        User user3;
        User user4;
        Media media;
        Subject subject;
        Subject subject2;
        Subject subject3;
        Integer subjectType;
        AbsSubjectListViewModel absSubjectListViewModelM70199S1;
        PostListSource postListSourceMo69056A;
        Group group;
        AbsSubjectListViewModel absSubjectListViewModel;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        String str = null;
        str = null;
        PostSubjectItem postSubjectItem = item instanceof PostSubjectItem ? (PostSubjectItem) item : null;
        int id2 = view.getId();
        if (id2 == R$id.v_post_share) {
            subjectListFragment.share(postSubjectItem);
            str = "share";
        } else if (id2 == R$id.v_post_download) {
            subjectListFragment.onDownLoadClick(postSubjectItem);
            subjectListFragment.mPostSubjectItem = postSubjectItem;
            str = "download";
        } else if (id2 == R$id.v_post_like) {
            String str2 = postSubjectItem != null ? Intrinsics.m97797c(postSubjectItem.getHasLike(), Boolean.TRUE) : false ? "dislike" : "like";
            subjectListFragment.like(postSubjectItem != null ? postSubjectItem.getPostId() : null, postSubjectItem != null ? postSubjectItem.getHasLike() : null);
            str = str2;
        } else if (id2 == R$id.v_post_comment) {
            subjectListFragment.openDetail(postSubjectItem, true);
            str = "comment";
        } else if (id2 == R$id.tv_room_tag) {
            Navigator.m61845x(TheRouter.m61773c("/room/detail").m61857K("id", (postSubjectItem == null || (group = postSubjectItem.getGroup()) == null) ? null : group.getGroupId()), subjectListFragment.requireContext(), null, 2, null);
            str = "group";
        } else if (id2 == R$id.fl_cover || id2 == R$id.tv_room_name || id2 == R$id.tv_post_date) {
            AbsSubjectListViewModel absSubjectListViewModel2 = subjectListFragment.mHotViewModel;
            if ((absSubjectListViewModel2 != null ? absSubjectListViewModel2.mo70864B() : null) == ProfileSubSource.POSTS) {
                Navigator.m61845x(TheRouter.m61773c("/post/detail").m61857K(WebConstants.PAGE_FROM, subjectListFragment.pageName()).m61856J("item_object", postSubjectItem).m61857K("rec_ops", postSubjectItem != null ? postSubjectItem.getOps() : null).m61857K("id", postSubjectItem != null ? postSubjectItem.getPostId() : null).m61857K("item_type", postSubjectItem != null ? postSubjectItem.getItemType() : null).m61857K("media_type", (postSubjectItem == null || (media = postSubjectItem.getMedia()) == null) ? null : media.getMediaType()), subjectListFragment.requireContext(), null, 2, null);
            } else {
                UserInfo userInfo = new UserInfo();
                userInfo.setUserId((postSubjectItem == null || (user4 = postSubjectItem.getUser()) == null) ? null : user4.getUserId());
                userInfo.setAvatar((postSubjectItem == null || (user3 = postSubjectItem.getUser()) == null) ? null : user3.getAvatar());
                userInfo.setUsername((postSubjectItem == null || (user2 = postSubjectItem.getUser()) == null) ? null : user2.getUsername());
                userInfo.setNickname((postSubjectItem == null || (user = postSubjectItem.getUser()) == null) ? null : user.getNickname());
                Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", userInfo.getUserId()), subjectListFragment.requireContext(), null, 2, null);
                str = "user_center";
            }
        } else if (id2 == com.transsion.moviedetail.R$id.cl_audio) {
            subjectListFragment.showAudioFloating(postSubjectItem);
            str = "audio_play";
        } else if (id2 == R$id.cl_subject_content) {
            C15929j c15929j = subjectListFragment.mAdapter;
            if (c15929j != null && (absSubjectListViewModelM70199S1 = c15929j.getViewModel()) != null && (postListSourceMo69056A = absSubjectListViewModelM70199S1.mo69056A()) != null) {
                postListSourceMo69056A.name();
            }
            Navigator.m61845x(TheRouter.m61773c("/movie/detail").m61852F("subject_type", (postSubjectItem == null || (subject3 = postSubjectItem.getSubject()) == null || (subjectType = subject3.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue()).m61857K("id", (postSubjectItem == null || (subject2 = postSubjectItem.getSubject()) == null) ? null : subject2.getSubjectId()).m61857K("ops", (postSubjectItem == null || (subject = postSubjectItem.getSubject()) == null) ? null : subject.getOps()), subjectListFragment.requireContext(), null, 2, null);
            str = "subject";
        }
        if (postSubjectItem == null || (absSubjectListViewModel = subjectListFragment.mHotViewModel) == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        absSubjectListViewModel.m70949J(postSubjectItem, i11, str, subjectListFragment.subpageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewData$lambda$11$lambda$8(SubjectListFragment subjectListFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        if (item instanceof PostSubjectItem) {
            PostSubjectItem postSubjectItem = (PostSubjectItem) item;
            subjectListFragment.openDetail(postSubjectItem, false);
            AbsSubjectListViewModel absSubjectListViewModel = subjectListFragment.mHotViewModel;
            if (absSubjectListViewModel != null) {
                absSubjectListViewModel.m70948I(postSubjectItem, i11, subjectListFragment.subpageName());
            }
        }
    }

    private final void insertLast() {
        List<Object> arrayList;
        AbsSubjectListViewModel absSubjectListViewModel = this.mHotViewModel;
        if ((absSubjectListViewModel != null ? absSubjectListViewModel.mo69056A() : null) == PostListSource.SUBJECT) {
            C15929j c15929j = this.mAdapter;
            if (c15929j == null || (arrayList = c15929j.getData()) == null) {
                arrayList = new ArrayList<>();
            }
            if (arrayList.size() <= C14047a.m63582p(C14047a.f49716a, "SubjectDetailRecommendScene", 0, 2, null)) {
                AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new C159831(arrayList, null), 3, null);
            }
        }
    }

    private final void lazyLoadData() {
        if (!C27287m.f83003a.m106330e()) {
            C15929j c15929j = this.mAdapter;
            if (c15929j != null) {
                c15929j.m36171Y0(getLocalNoNetworkView(false));
                return;
            }
            return;
        }
        showLoadingView();
        if ((this.mHotViewModel instanceof HotViewModel) && C23420k.f71413a.m92973a()) {
            AbsSubjectListViewModel absSubjectListViewModel = this.mHotViewModel;
            Intrinsics.m97800f(absSubjectListViewModel, "null cannot be cast to non-null type com.transsion.moviedetail.viewmodel.HotViewModel");
            HotViewModel.m70858c0((HotViewModel) absSubjectListViewModel, null, 0, 3, null);
        } else {
            AbsSubjectListViewModel absSubjectListViewModel2 = this.mHotViewModel;
            if (absSubjectListViewModel2 != null) {
                absSubjectListViewModel2.mo69057E(true);
            }
        }
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
    private final void like(String postId, Boolean hasLike) {
        boolean zM97797c = Intrinsics.m97797c(hasLike, Boolean.TRUE);
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_tips);
            return;
        }
        AbsSubjectListViewModel absSubjectListViewModel = this.mHotViewModel;
        if (absSubjectListViewModel != null) {
            absSubjectListViewModel.m70946C(postId, zM97797c ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMore() {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            AbsSubjectListViewModel absSubjectListViewModel = this.mHotViewModel;
            if (absSubjectListViewModel != null) {
                absSubjectListViewModel.mo69057E(false);
                return;
            }
            return;
        }
        C28951b.f88586a.m111454d(R$string.no_network_tips);
        C23599g mViewBinding = getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f71940b) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.moviedetail.fragment.s1
            @Override // java.lang.Runnable
            public final void run() {
                SubjectListFragment.loadMore$lambda$42(this.f54765a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadMore$lambda$42(SubjectListFragment subjectListFragment) {
        C27941f c27941fM36186h0;
        C15929j c15929j = subjectListFragment.mAdapter;
        if (c15929j == null || (c27941fM36186h0 = c15929j.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    private final void localLogPause() {
        C28117b c28117b = this.mExposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23410a mAudioApi_delegate$lambda$1() {
        return (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashSet mExposureList_delegate$lambda$4() {
        return new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23411b mFloatApi_delegate$lambda$2() {
        return (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a mLoginApi_delegate$lambda$0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23415f mRoomApi_delegate$lambda$3() {
        return (InterfaceC23415f) TheRouter.m61774d(InterfaceC23415f.class, new Object[0]);
    }

    @JvmStatic
    public static final SubjectListFragment newInstance(Bundle bundle, Class<? extends AbsSubjectListViewModel> cls) {
        return INSTANCE.m70517a(bundle, cls);
    }

    private final void observeComment() {
        Function1 function1 = new Function1() { // from class: com.transsion.moviedetail.fragment.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectListFragment.observeComment$lambda$58(this.f54695a, (CommentEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = CommentEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:3:0x000a, B:5:0x000f, B:7:0x0015, B:8:0x001a, B:10:0x0020, B:13:0x0036, B:17:0x003e, B:19:0x0042, B:21:0x0048, B:24:0x0052, B:41:0x008d, B:42:0x00a5, B:45:0x00ab, B:47:0x00b1, B:26:0x0058, B:28:0x0060, B:30:0x0066, B:34:0x006f, B:35:0x0078, B:37:0x007e, B:39:0x0084), top: B:53:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    public static final Unit observeComment$lambda$58(SubjectListFragment subjectListFragment, CommentEvent value) {
        C15929j c15929j;
        int iM36174a0;
        Stat stat;
        List<Object> data;
        List<Object> data2;
        Intrinsics.m97802h(value, "value");
        try {
            C15929j c15929j2 = subjectListFragment.mAdapter;
            int i11 = -1;
            if (c15929j2 != null && (data2 = c15929j2.getData()) != null) {
                Iterator<Object> it = data2.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.m97797c(((PostSubjectItem) it.next()).getPostId(), value.getSubjectId())) {
                        i11 = i12;
                        break;
                    }
                    i12++;
                }
            }
            if (i11 >= 0) {
                C15929j c15929j3 = subjectListFragment.mAdapter;
                PostSubjectItem postSubjectItem = (c15929j3 == null || (data = c15929j3.getData()) == null) ? null : (PostSubjectItem) data.get(i11);
                if (postSubjectItem == null || (stat = postSubjectItem.getStat()) == null) {
                    c15929j = subjectListFragment.mAdapter;
                    if (c15929j != null) {
                        if (c15929j != null) {
                            iM36174a0 = c15929j.m36174a0();
                        } else {
                            iM36174a0 = 0;
                        }
                        c15929j.notifyItemChanged(i11 + iM36174a0);
                    }
                } else {
                    try {
                        if (value.getStatus()) {
                            Long commentCount = stat.getCommentCount();
                            stat.setCommentCount(Long.valueOf((commentCount != null ? commentCount.longValue() : 0L) + 1));
                        } else {
                            Long commentCount2 = stat.getCommentCount();
                            stat.setCommentCount(Long.valueOf((commentCount2 != null ? commentCount2.longValue() : 1L) - 1));
                        }
                    } catch (Exception e11) {
                        C26866a.a.m104899g(C26866a.f81698a, " callback change data fail " + e11.getMessage(), false, 2, null);
                    }
                    c15929j = subjectListFragment.mAdapter;
                    if (c15929j != null) {
                        if (c15929j != null) {
                            iM36174a0 = c15929j.m36174a0();
                        } else {
                            iM36174a0 = 0;
                        }
                        c15929j.notifyItemChanged(i11 + iM36174a0);
                    }
                }
            }
        } catch (Exception e12) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail " + e12.getMessage(), false, 2, null);
        }
        return Unit.f75682a;
    }

    private final void observeDelete() {
        Function1 function1 = new Function1() { // from class: com.transsion.moviedetail.fragment.r1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectListFragment.observeDelete$lambda$51(this.f54758a, (C28672b) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C28672b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeDelete$lambda$51(SubjectListFragment subjectListFragment, C28672b value) {
        C15929j c15929j;
        List<Object> data;
        Intrinsics.m97802h(value, "value");
        try {
            C15929j c15929j2 = subjectListFragment.mAdapter;
            int i11 = -1;
            if (c15929j2 != null && (data = c15929j2.getData()) != null) {
                Iterator<Object> it = data.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.m97797c(((PostSubjectItem) it.next()).getPostId(), value.m110502a())) {
                        i11 = i12;
                        break;
                    }
                    i12++;
                }
            }
            if (i11 >= 0 && (c15929j = subjectListFragment.mAdapter) != null) {
                c15929j.mo36138G0(i11);
            }
            subjectListFragment.checkToShowEmptyView();
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    private final void observeLike() {
        Function1 function1 = new Function1() { // from class: com.transsion.moviedetail.fragment.t1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectListFragment.observeLike$lambda$55(this.f54770a, (LikeEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = LikeEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009b A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:3:0x0008, B:5:0x000d, B:7:0x0013, B:8:0x0018, B:10:0x001e, B:16:0x0038, B:18:0x003c, B:20:0x0042, B:23:0x004c, B:25:0x0059, B:40:0x0092, B:39:0x0088, B:41:0x0095, B:44:0x009b, B:46:0x00a1, B:13:0x0033, B:27:0x005f, B:29:0x0067, B:33:0x0070, B:37:0x0078), top: B:51:0x0008, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    public static final Unit observeLike$lambda$55(SubjectListFragment subjectListFragment, LikeEvent value) {
        int i11;
        C15929j c15929j;
        int iM36174a0;
        Stat stat;
        Object objM112707constructorimpl;
        List<Object> data;
        List<Object> data2;
        int i12 = 1;
        Intrinsics.m97802h(value, "value");
        try {
            C15929j c15929j2 = subjectListFragment.mAdapter;
            if (c15929j2 != null && (data2 = c15929j2.getData()) != null) {
                Iterator<Object> it = data2.iterator();
                i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (Intrinsics.m97797c(((PostSubjectItem) it.next()).getPostId(), value.getSubjectId())) {
                        break;
                    }
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
            if (i11 >= 0) {
                C15929j c15929j3 = subjectListFragment.mAdapter;
                PostSubjectItem postSubjectItem = (c15929j3 == null || (data = c15929j3.getData()) == null) ? null : (PostSubjectItem) data.get(i11);
                if (postSubjectItem != null) {
                    postSubjectItem.setHasLike(Boolean.valueOf(value.getLike()));
                }
                if (postSubjectItem == null || (stat = postSubjectItem.getStat()) == null) {
                    c15929j = subjectListFragment.mAdapter;
                    if (c15929j != null) {
                        if (c15929j != null) {
                            iM36174a0 = c15929j.m36174a0();
                        } else {
                            iM36174a0 = 0;
                        }
                        c15929j.notifyItemChanged(i11 + iM36174a0, Boolean.valueOf(value.getLike()));
                    }
                } else {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Long likeCount = stat.getLikeCount();
                        long jLongValue = likeCount != null ? likeCount.longValue() : 0L;
                        if (!value.getLike()) {
                            i12 = -1;
                        }
                        stat.setLikeCount(Long.valueOf(jLongValue + ((long) i12)));
                        objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
                    }
                    Result.m112706boximpl(objM112707constructorimpl);
                    c15929j = subjectListFragment.mAdapter;
                    if (c15929j != null) {
                        if (c15929j != null) {
                            iM36174a0 = c15929j.m36174a0();
                        } else {
                            iM36174a0 = 0;
                        }
                        c15929j.notifyItemChanged(i11 + iM36174a0, Boolean.valueOf(value.getLike()));
                    }
                }
            }
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    private final void onDownLoadClick(PostSubjectItem postItem) {
        if (Build.VERSION.SDK_INT >= 29) {
            PostSaveHelper.f57808a.m74907e(postItem);
            return;
        }
        Context context = getContext();
        if (context == null) {
            context = Utils.m27275a();
        }
        if (AbstractC2397b.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            Context context2 = getContext();
            if (context2 == null) {
                context2 = Utils.m27275a();
            }
            if (AbstractC2397b.checkSelfPermission(context2, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                PostSaveHelper.f57808a.m74907e(postItem);
                return;
            }
        }
        requestPermission();
    }

    private final void openDetail(PostSubjectItem postItem, boolean fromComment) {
        Media media;
        InterfaceC23624b interfaceC23624b = (InterfaceC23624b) TheRouter.m61774d(InterfaceC23624b.class, new Object[0]);
        AbsSubjectListViewModel absSubjectListViewModel = this.mHotViewModel;
        PostListSource postListSourceMo69056A = absSubjectListViewModel != null ? absSubjectListViewModel.mo69056A() : null;
        PostListSource postListSource = PostListSource.PROFILE;
        if (postListSourceMo69056A != postListSource && postItem != null && interfaceC23624b != null) {
            interfaceC23624b.mo93476i(postItem);
        }
        Navigator navigatorM61872z = TheRouter.m61773c("/post/detail").m61857K(WebConstants.PAGE_FROM, pageName()).m61856J("item_object", postItem).m61857K("rec_ops", postItem != null ? postItem.getOps() : null).m61857K("id", postItem != null ? postItem.getPostId() : null).m61857K("item_type", postItem != null ? postItem.getItemType() : null).m61857K("media_type", (postItem == null || (media = postItem.getMedia()) == null) ? null : media.getMediaType()).m61872z("from_comment", fromComment);
        AbsSubjectListViewModel absSubjectListViewModel2 = this.mHotViewModel;
        Navigator.m61845x(navigatorM61872z.m61872z("video_load_more", (absSubjectListViewModel2 != null ? absSubjectListViewModel2.mo69056A() : null) != postListSource), getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String pageName() {
        String str = this.curPageName;
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePost(String id2) {
        C15929j c15929j = this.mAdapter;
        if (c15929j != null) {
            int i11 = 0;
            for (Object obj : c15929j.getData()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                if (Intrinsics.m97797c(((PostSubjectItem) obj).getPostId(), id2)) {
                    if (c15929j.getItemCount() > 2) {
                        c15929j.getData().remove(i11);
                        c15929j.notifyDataSetChanged();
                        return;
                    } else {
                        c15929j.getData().clear();
                        c15929j.notifyDataSetChanged();
                        checkToShowEmptyView();
                        return;
                    }
                }
                i11 = i12;
            }
        }
    }

    private final void requestPermission() {
        requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, FileHelper.f55226a.m71367l());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    private final void share(PostSubjectItem postItem) {
        boolean z11;
        User user;
        User user2;
        InterfaceC23704a mLoginApi = getMLoginApi();
        UserInfo userInfoMo90386h = mLoginApi != null ? mLoginApi.mo90386h() : null;
        if ((userInfoMo90386h != null ? userInfoMo90386h.getUserId() : null) != null) {
            if (Intrinsics.m97797c(userInfoMo90386h.getUserId(), (postItem == null || (user2 = postItem.getUser()) == null) ? null : user2.getUserId())) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        ShareDialogFragment shareDialogFragmentM78645a = ShareDialogFragment.INSTANCE.m78645a(PostType.POST_TYPE, postItem != null ? postItem.getPostId() : null, (postItem == null || (user = postItem.getUser()) == null) ? null : user.getUserId(), ReportType.POST.getValue(), (3328 & 16) != 0 ? "" : postItem != null ? postItem.getTitle() : null, (3328 & 32) != 0 ? "" : "", (3328 & 64) != 0 ? false : false, (3328 & 128) != 0 ? false : z11, (3328 & 256) != 0 ? false : false, "postdetail", (3328 & 1024) != 0 ? "" : null, (3328 & 2048) != 0 ? "" : null);
        shareDialogFragmentM78645a.m78642G0(new C15982e());
        shareDialogFragmentM78645a.show(getChildFragmentManager(), "share");
    }

    private final void showAudioFloating(PostSubjectItem item) {
        String url;
        Integer size;
        List<Audio> audio;
        if (item != null) {
            String coverUrl$default = PostSubjectItem.getCoverUrl$default(item, false, 1, null);
            Media media = item.getMedia();
            Audio audio2 = (media == null || (audio = media.getAudio()) == null || audio.isEmpty()) ? null : audio.get(0);
            if (audio2 == null || (url = audio2.getUrl()) == null) {
                url = "";
            }
            Long duration = audio2 != null ? audio2.getDuration() : null;
            Long lValueOf = (audio2 == null || (size = audio2.getSize()) == null) ? null : Long.valueOf(size.intValue());
            String url2 = audio2 != null ? audio2.getUrl() : null;
            String title = item.getTitle();
            String content = item.getContent();
            if (content == null) {
                content = "";
            }
            Integer bitrate = audio2 != null ? audio2.getBitrate() : null;
            String postId = item.getPostId();
            Subject subject = item.getSubject();
            String subjectId = subject != null ? subject.getSubjectId() : null;
            Subject subject2 = item.getSubject();
            String title2 = subject2 != null ? subject2.getTitle() : null;
            Group group = item.getGroup();
            AudioBean audioBean = new AudioBean(url, coverUrl$default, duration, lValueOf, url2, title, content, bitrate, null, null, null, null, null, postId, subjectId, group != null ? group.getGroupId() : null, 0, title2, 0, 0, 859904, null);
            InterfaceC23411b mFloatApi = getMFloatApi();
            if (mFloatApi != null) {
                mFloatApi.mo23884a(new WeakReference((Activity) getContext()), audioBean);
            }
            audioBean.setOps(item.getRec_ops());
            InterfaceC23410a mAudioApi = getMAudioApi();
            if (mAudioApi != null) {
                InterfaceC23410a.a.m92962a(mAudioApi, audioBean, false, 2, null);
            }
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public final String subpageName() {
        AbsSubjectListViewModel absSubjectListViewModel = this.mHotViewModel;
        if (absSubjectListViewModel != null) {
            ProfileSubSource profileSubSourceMo70864B = absSubjectListViewModel.mo70864B();
            String value = profileSubSourceMo70864B != null ? profileSubSourceMo70864B.getValue() : null;
            if (value != null) {
                return value;
            }
        }
        return "";
    }

    private final void toWeb(String url) {
        Navigator.m61845x(TheRouter.m61773c(WebPageIdentity.WEB_VIEW).m61857K("url", url), requireContext(), null, 2, null);
    }

    private final void updateDeletePost(BaseDto<String> data) {
        List<Object> data2;
        List<Object> data3;
        List<Object> data4;
        if (!Intrinsics.m97797c(data != null ? data.getCode() : null, "0")) {
            C28951b.f88586a.m111455e(getString(com.transsion.moviedetail.R$string.delete_post_failed));
            return;
        }
        C15929j c15929j = this.mAdapter;
        List<Object> data5 = c15929j != null ? c15929j.getData() : null;
        if (data5 != null) {
            int i11 = 0;
            for (Object obj : data5) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                PostSubjectItem postSubjectItem = (PostSubjectItem) obj;
                if (Intrinsics.m97797c(postSubjectItem.getPostId(), data.getData())) {
                    C15929j c15929j2 = this.mAdapter;
                    if (c15929j2 == null || (data3 = c15929j2.getData()) == null || data3.size() != 1) {
                        C15929j c15929j3 = this.mAdapter;
                        if (c15929j3 != null) {
                            c15929j3.notifyItemRemoved(i11);
                        }
                        C15929j c15929j4 = this.mAdapter;
                        if (c15929j4 == null || (data2 = c15929j4.getData()) == null) {
                            return;
                        }
                        data2.remove(postSubjectItem);
                        return;
                    }
                    C15929j c15929j5 = this.mAdapter;
                    if (c15929j5 != null && (data4 = c15929j5.getData()) != null) {
                        data4.remove(postSubjectItem);
                    }
                    C15929j c15929j6 = this.mAdapter;
                    if (c15929j6 != null) {
                        c15929j6.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                i11 = i12;
            }
        }
    }

    private final void updateLikeStatus(LikeBean likeBean) {
        List<Object> data;
        C15929j c15929j = this.mAdapter;
        if (c15929j == null || (data = c15929j.getData()) == null) {
            return;
        }
        int i11 = 0;
        for (Object obj : data) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            PostSubjectItem postSubjectItem = (PostSubjectItem) obj;
            if (Intrinsics.m97797c(likeBean.isAffected(), Boolean.TRUE) && Intrinsics.m97797c(postSubjectItem.getPostId(), likeBean.getPostId())) {
                Boolean hasLike = postSubjectItem.getHasLike();
                postSubjectItem.setHasLike(hasLike != null ? Boolean.valueOf(!hasLike.booleanValue()) : null);
                Stat stat = postSubjectItem.getStat();
                if (stat != null) {
                    Integer likes = likeBean.getLikes();
                    stat.setLikeCount(likes != null ? Long.valueOf(likes.intValue()) : null);
                }
                C15929j c15929j2 = this.mAdapter;
                if (c15929j2 != null) {
                    c15929j2.notifyItemChanged(i11);
                    return;
                }
                return;
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSubjectList(PostSubjectBean postSubjectBean) {
        List<Object> arrayList;
        PostSubjectItem recommendRoomsBean;
        C27941f c27941fM36186h0;
        Object objM112707constructorimpl;
        C27941f c27941fM36186h1;
        Pager pager;
        C27941f c27941fM36186h2;
        C15929j c15929j;
        C27941f c27941fM36186h3;
        C27941f c27941fM36186h4;
        C15929j c15929j2;
        C27941f c27941fM36186h5;
        if (postSubjectBean == null) {
            C15929j c15929j3 = this.mAdapter;
            if (c15929j3 != null && (c27941fM36186h4 = c15929j3.m36186h0()) != null && c27941fM36186h4.m108666r() && (c15929j2 = this.mAdapter) != null && (c27941fM36186h5 = c15929j2.m36186h0()) != null) {
                c27941fM36186h5.m108669v();
            }
        } else {
            if (postSubjectBean.getSubject() != null) {
                this.mSubject = postSubjectBean.getSubject();
            }
            List<PostSubjectItem> items = postSubjectBean.getItems();
            if (items != null) {
                C15929j c15929j4 = this.mAdapter;
                if (c15929j4 == null || (arrayList = c15929j4.getData()) == null) {
                    arrayList = new ArrayList<>();
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    for (PostSubjectItem postSubjectItem : items) {
                        Subject subject = this.mSubject;
                        if (subject != null) {
                            postSubjectItem.setSubject(subject);
                        }
                    }
                    arrayList2.addAll(items);
                } else {
                    for (PostSubjectItem postSubjectItem2 : items) {
                        if (!arrayList.contains(postSubjectItem2)) {
                            Subject subject2 = this.mSubject;
                            if (subject2 != null) {
                                postSubjectItem2.setSubject(subject2);
                            }
                            arrayList2.add(postSubjectItem2);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    C15929j c15929j5 = this.mAdapter;
                    if (c15929j5 != null && (c27941fM36186h0 = c15929j5.m36186h0()) != null) {
                        C27941f.m108652u(c27941fM36186h0, false, 1, null);
                    }
                    checkToShowEmptyView();
                    return;
                }
                if (this.mHotViewModel instanceof HotViewModel) {
                    C15929j c15929j6 = this.mAdapter;
                    List<Object> data = c15929j6 != null ? c15929j6.getData() : null;
                    if (data == null || data.isEmpty()) {
                        AbsSubjectListViewModel absSubjectListViewModel = this.mHotViewModel;
                        Intrinsics.m97800f(absSubjectListViewModel, "null cannot be cast to non-null type com.transsion.moviedetail.viewmodel.HotViewModel");
                        RoomBean roomBean = (RoomBean) ((HotViewModel) absSubjectListViewModel).m70868d0().m14847f();
                        if (roomBean != null && (recommendRoomsBean = getRecommendRoomsBean(roomBean)) != null) {
                            arrayList2.add(0, recommendRoomsBean);
                        }
                    }
                }
                C15929j c15929j7 = this.mAdapter;
                if (c15929j7 != null) {
                    c15929j7.mo36208q(arrayList2);
                }
            }
        }
        C15929j c15929j8 = this.mAdapter;
        if (c15929j8 != null && (c27941fM36186h2 = c15929j8.m36186h0()) != null && c27941fM36186h2.m108666r() && (c15929j = this.mAdapter) != null && (c27941fM36186h3 = c15929j.m36186h0()) != null) {
            c27941fM36186h3.m108667s();
        }
        if ((postSubjectBean == null || (pager = postSubjectBean.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.FALSE)) {
            C15929j c15929j9 = this.mAdapter;
            if (c15929j9 != null && (c27941fM36186h1 = c15929j9.m36186h0()) != null) {
                c27941fM36186h1.m108668t(false);
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                insertLast();
                objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        }
        checkToShowEmptyView();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getEmptyView(boolean isShowTitleLayout) {
        if (this.mEmptyLayout == null) {
            InterfaceC23414e interfaceC23414eMo92965c = null;
            View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.layout_hot_empty_view, (ViewGroup) null);
            C23616x c23616xM93437a = C23616x.m93437a(viewInflate);
            Intrinsics.m97801g(c23616xM93437a, "bind(...)");
            if (this.mHotViewModel instanceof HotViewModel) {
                if (this.mRoomView == null) {
                    InterfaceC23415f mRoomApi = getMRoomApi();
                    if (mRoomApi != null) {
                        Context context = viewInflate.getContext();
                        Intrinsics.m97801g(context, "getContext(...)");
                        interfaceC23414eMo92965c = mRoomApi.mo92965c(context, RoomsViewType.TYPE_SUBJECT_DETAIL);
                    }
                    this.mRoomView = interfaceC23414eMo92965c;
                }
                FrameLayout frameLayout = c23616xM93437a.f72116c;
                InterfaceC23414e interfaceC23414e = this.mRoomView;
                Intrinsics.m97799e(interfaceC23414e);
                frameLayout.addView(interfaceC23414e.getView());
            }
            FrameLayout frameLayout2 = c23616xM93437a.f72115b;
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            StateView stateView = new StateView(contextRequireContext);
            stateView.showData(2, 2, isShowTitleLayout, getPageStateLayoutTitle(), getEmptyDescText());
            frameLayout2.addView(stateView);
            this.mEmptyLayout = viewInflate;
        }
        View view = this.mEmptyLayout;
        Intrinsics.m97799e(view);
        return view;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        return LayoutInflater.from(requireContext()).inflate(R$layout.layout_commnets_loading_view, (ViewGroup) getFlStateView(), false);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLocalNoNetworkView(boolean isShowTitleLayout) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.layout_state_view, (ViewGroup) null);
        C23617y c23617yM93439a = C23617y.m93439a(viewInflate);
        Intrinsics.m97801g(c23617yM93439a, "bind(...)");
        c23617yM93439a.f72120d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f54790a.retryLoadData();
            }
        });
        Intrinsics.m97801g(viewInflate, "apply(...)");
        return viewInflate;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C23599g getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23599g c23599gM93370c = C23599g.m93370c(inflater);
        Intrinsics.m97801g(c23599gM93370c, "inflate(...)");
        return c23599gM93370c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        initExposureHelper();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        initAd();
        C23599g mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView2 = mViewBinding.f71940b) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        }
        C15929j c15929j = new C15929j(new ArrayList(), this.mHotViewModel, pageName(), C24662i.f75350a.m96877i());
        C27941f c27941fM36186h0 = c15929j.m36186h0();
        c27941fM36186h0.m108655C(new SubjectCommentsLoadMoreView());
        c27941fM36186h0.m108673z(true);
        c27941fM36186h0.m108656D(new InterfaceC27568f() { // from class: com.transsion.moviedetail.fragment.i2
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                this.f54717a.loadMore();
            }
        });
        c15929j.m36158R0(new C15981d());
        c15929j.m36227w1(new InterfaceC27566d() { // from class: com.transsion.moviedetail.fragment.j2
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SubjectListFragment.initViewData$lambda$11$lambda$8(this.f54721a, baseQuickAdapter, view, i11);
            }
        });
        initScrollListener();
        c15929j.m36193l(R$id.fl_cover, R$id.tv_room_name, R$id.tv_post_date, R$id.v_post_like, R$id.v_post_download, R$id.v_post_comment, R$id.v_post_share, R$id.cl_subject_content, R$id.tv_room_tag);
        c15929j.m36216s1(new InterfaceC27564b() { // from class: com.transsion.moviedetail.fragment.p1
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SubjectListFragment.initViewData$lambda$11$lambda$10(this.f54747a, baseQuickAdapter, view, i11);
            }
        });
        this.mAdapter = c15929j;
        C23599g mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (recyclerView = mViewBinding2.f71940b) != null) {
            recyclerView.setAdapter(this.mAdapter);
        }
        initLiveData();
        initClickListener();
        observeDelete();
        observeLike();
        observeComment();
        initLaunch();
        initPlayer();
        initListVideoPreload();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(pageName(), false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        List<Object> data;
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        super.onConnected(network, networkCapabilities);
        C15929j c15929j = this.mAdapter;
        if (c15929j == null || (data = c15929j.getData()) == null || !data.isEmpty()) {
            loadMore();
        } else {
            lazyLoadData();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        String strM70866Z;
        HashMap mapM96844g3;
        String strM70869f0;
        super.onCreate(savedInstanceState);
        try {
            Bundle arguments = getArguments();
            Serializable serializable = arguments != null ? arguments.getSerializable("view_model_type") : null;
            Intrinsics.m97800f(serializable, "null cannot be cast to non-null type java.lang.Class<com.transsion.moviedetailapi.AbsSubjectListViewModel>");
            AbsSubjectListViewModel absSubjectListViewModel = (AbsSubjectListViewModel) new C3227v0(this).m14969a((Class) serializable);
            this.mHotViewModel = absSubjectListViewModel;
            if (absSubjectListViewModel != null) {
                absSubjectListViewModel.mo69058F(getArguments());
            }
            Bundle arguments2 = getArguments();
            this.curPageName = arguments2 != null ? arguments2.getString("page_name") : null;
            AbsSubjectListViewModel absSubjectListViewModel2 = this.mHotViewModel;
            if (absSubjectListViewModel2 != null) {
                absSubjectListViewModel2.m70952N(C24662i.f75350a.m96877i());
            }
            if (this.mHotViewModel instanceof HotViewModel) {
                C24655b logViewConfig = getLogViewConfig();
                String str = "";
                if (logViewConfig != null && (mapM96844g3 = logViewConfig.m96844g()) != null) {
                    AbsSubjectListViewModel absSubjectListViewModel3 = this.mHotViewModel;
                    HotViewModel hotViewModel = absSubjectListViewModel3 instanceof HotViewModel ? (HotViewModel) absSubjectListViewModel3 : null;
                    if (hotViewModel == null || (strM70869f0 = hotViewModel.m70869f0()) == null) {
                        strM70869f0 = "";
                    }
                }
                C24655b logViewConfig2 = getLogViewConfig();
                if (logViewConfig2 != null && (mapM96844g2 = logViewConfig2.m96844g()) != null) {
                    AbsSubjectListViewModel absSubjectListViewModel4 = this.mHotViewModel;
                    HotViewModel hotViewModel2 = absSubjectListViewModel4 instanceof HotViewModel ? (HotViewModel) absSubjectListViewModel4 : null;
                    if (hotViewModel2 != null && (strM70866Z = hotViewModel2.m70866Z()) != null) {
                        str = strM70866Z;
                    }
                }
            }
        } catch (Exception unused) {
        }
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 == null || (mapM96844g = logViewConfig3.m96844g()) == null) {
            return;
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        C16316a c16316a = this.mGifPlayerManager;
        if (c16316a != null) {
            c16316a.m71338f();
        }
        super.onDestroy();
        AbstractC0249b abstractC0249b = this.postDetailLauncher;
        if (abstractC0249b != null) {
            abstractC0249b.mo992c();
        }
        BiddingListManager biddingListManager = this.middleListManager;
        if (biddingListManager != null) {
            biddingListManager.m63187o();
        }
        BiddingNativeManager biddingNativeManager = this.nativeManager;
        if (biddingNativeManager != null) {
            biddingNativeManager.mo62775U();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
                localLogPause();
            } else {
                logResume();
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onLeftButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        localLogPause();
        C16316a c16316a = this.mGifPlayerManager;
        if (c16316a != null) {
            c16316a.m71343k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.m97802h(permissions, "permissions");
        Intrinsics.m97802h(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == FileHelper.f55226a.m71367l()) {
            if (grantResults.length > 1 && grantResults[0] == 0 && grantResults[1] == 0) {
                PostSaveHelper.f57808a.m74907e(this.mPostSubjectItem);
                return;
            }
            FragmentActivity activity = getActivity();
            Intrinsics.m97800f(activity, "null cannot be cast to non-null type android.app.Activity");
            if (ActivityCompat.m11450j(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                return;
            }
            showSettingDialog();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C16316a c16316a = this.mGifPlayerManager;
        if (c16316a != null) {
            c16316a.m71344l();
        }
        if (this.isFirst) {
            this.isFirst = false;
            lazyLoadData();
        }
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onRightButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
        C16323b c16323b = C16323b.f55235a;
        FragmentActivity activity = getActivity();
        Intrinsics.m97800f(activity, "null cannot be cast to non-null type android.app.Activity");
        c16323b.m71374a(activity, 101);
    }

    @Override // p561kx.InterfaceC25451b
    public void onScreenChange(boolean fullscreen) {
        if (isAdded() && !isHidden() && isResumed()) {
            if (!fullscreen) {
                logResume();
            } else {
                logPause();
                localLogPause();
            }
        }
    }

    public final void refresh() {
        AbsSubjectListViewModel absSubjectListViewModel = this.mHotViewModel;
        if (absSubjectListViewModel != null) {
            absSubjectListViewModel.mo69058F(getArguments());
        }
        C15929j c15929j = this.mAdapter;
        if (c15929j != null) {
            c15929j.m70197Q1();
        }
        C16316a c16316a = this.mGifPlayerManager;
        if (c16316a != null) {
            c16316a.m71345m();
        }
        lazyLoadData();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        lazyLoadData();
    }
}
