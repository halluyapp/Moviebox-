package com.transsion.postdetail.p306ui.fragment;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import androidx.p1004lifecycle.LiveData;
import androidx.p1005savedstate.InterfaceC4393e;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ck.InterfaceC5120q;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p282tn.lib.net.bean.BaseDto;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$string;
import com.p282tn.lib.widget.dialog.TRDialog;
import com.p282tn.lib.widget.dialog.TRDialogListener;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.fragment.LazyFragment;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetail.fragment.SubjectListFragment;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.RoomTabItem;
import com.transsion.moviedetailapi.bean.Stat;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.ninegridview.helper.C16323b;
import com.transsion.ninegridview.helper.FileHelper;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.postdetail.helper.NegativeFeedbackHelper;
import com.transsion.postdetail.p306ui.adapter.C16985i;
import com.transsion.postdetail.p306ui.adapter.PostAdapterFrom;
import com.transsion.postdetail.p306ui.view.PostListLoadMoreView;
import com.transsion.postdetail.util.AbstractC17450t;
import com.transsion.postdetail.util.C17437g;
import com.transsion.postdetail.util.PostSaveHelper;
import com.transsion.postdetail.viewmodel.PostDetailViewModel;
import com.transsion.postdetail.viewmodel.RoomPostViewModel;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.user.action.sync.event.CommentEvent;
import com.transsion.usercenterapi.ReportType;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.downloader.manager.DownloadEsHelper;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.LikeEvent;
import com.transsnet.flow.event.sync.event.PublishEvent;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gp.InterfaceC23624b;
import gp.InterfaceC23625c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import mg.C25830g;
import okhttp3.internal.http2.Settings;
import p414fp.InterfaceC23404a;
import p415fq.C23418i;
import p415fq.InterfaceC23416g;
import p441gz.InterfaceC23704a;
import p550kj.C24655b;
import p550kj.C24662i;
import p743rh.C27287m;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p844vo.C28170q;
import p913xm.C28615f;
import p925xy.C28672b;
import p944yh.C28951b;
import p983zl.InterfaceC29192b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u001f\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J#\u0010\u001c\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0002¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010\u0006J\u0017\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u0010\u0006J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001aH\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u001aH\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u00106J\u0015\u0010=\u001a\u00020\u00072\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0007H\u0016¢\u0006\u0004\b?\u0010\u0006J\u000f\u0010@\u001a\u00020\u0007H\u0016¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010A\u001a\u00020\u0007H\u0016¢\u0006\u0004\bA\u0010\u0006J\u001f\u0010D\u001a\u00020\u00072\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010BH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00072\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00072\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bJ\u0010IJ1\u0010Q\u001a\u00020\u00072\u0006\u0010L\u001a\u00020K2\u0010\u0010N\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0M2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0011\u0010T\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0007H\u0016¢\u0006\u0004\bV\u0010\u0006J\u000f\u0010W\u001a\u00020\u0007H\u0016¢\u0006\u0004\bW\u0010\u0006J\u0017\u0010Y\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u001aH\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0007H\u0016¢\u0006\u0004\b[\u0010\u0006J\u000f\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b]\u0010^J\u0019\u0010a\u001a\u00020\u00072\b\u0010`\u001a\u0004\u0018\u00010_H\u0016¢\u0006\u0004\ba\u0010bJ!\u0010d\u001a\u00020\u00072\u0006\u0010c\u001a\u00020K2\b\u0010`\u001a\u0004\u0018\u00010_H\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\u0007H\u0016¢\u0006\u0004\bf\u0010\u0006J\u0019\u0010h\u001a\u00020\u00072\b\u0010g\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\bh\u0010\u0015J\u0019\u0010i\u001a\u00020\u00072\b\u0010g\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\bi\u0010\u0015J\u0019\u0010j\u001a\u00020\u00072\b\u0010g\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\bj\u0010\u0015J\u000f\u0010l\u001a\u00020kH&¢\u0006\u0004\bl\u0010mJ\u0019\u0010n\u001a\u00020\u00072\b\u0010g\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\bn\u0010\u0015J\u000f\u0010o\u001a\u00020\u000eH&¢\u0006\u0004\bo\u00106J#\u0010r\u001a\u00020\u00072\b\b\u0002\u0010p\u001a\u00020\u001a2\b\b\u0002\u0010q\u001a\u00020\u001aH&¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020\u000eH&¢\u0006\u0004\bt\u00106J\u000f\u0010u\u001a\u00020\u000eH&¢\u0006\u0004\bu\u00106J\u000f\u0010v\u001a\u00020\u001aH&¢\u0006\u0004\bv\u00108J\u000f\u0010w\u001a\u00020\u001aH&¢\u0006\u0004\bw\u00108J\u000f\u0010x\u001a\u00020KH&¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020\u001aH&¢\u0006\u0004\bz\u00108R\u0014\u0010{\u001a\u00020\u000e8\u0002X\u0083D¢\u0006\u0006\n\u0004\b{\u0010|R\u001a\u0010}\u001a\u00020\u000e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b}\u0010|\u001a\u0004\b~\u00106R+\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R,\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R,\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R,\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R(\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u009b\u0001\u0010|\u001a\u0005\b\u009c\u0001\u00106\"\u0005\b\u009d\u0001\u0010%R\u001e\u0010\u009e\u0001\u001a\u00020K8\u0004X\u0084D¢\u0006\u000f\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010yR(\u0010¡\u0001\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010|\u001a\u0005\b¢\u0001\u00106\"\u0005\b£\u0001\u0010%R(\u0010¤\u0001\u001a\u00020K8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b¤\u0001\u0010\u009f\u0001\u001a\u0005\b¥\u0001\u0010y\"\u0006\b¦\u0001\u0010§\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010«\u0001R\u001c\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R(\u0010¯\u0001\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b¯\u0001\u0010|\u001a\u0005\b°\u0001\u00106\"\u0005\b±\u0001\u0010%R(\u0010²\u0001\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b²\u0001\u0010|\u001a\u0005\b³\u0001\u00106\"\u0005\b´\u0001\u0010%R!\u0010µ\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R,\u0010¸\u0001\u001a\u0005\u0018\u00010·\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R\u001c\u0010¿\u0001\u001a\u0005\u0018\u00010¾\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u001b\u0010Á\u0001\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R!\u0010È\u0001\u001a\u00030Ã\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R#\u0010Í\u0001\u001a\u0005\u0018\u00010É\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0001\u0010Å\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R2\u0010Ó\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u000e0Î\u0001j\t\u0012\u0004\u0012\u00020\u000e`Ï\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÐ\u0001\u0010Å\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0019\u0010Ô\u0001\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010\u009f\u0001R\u0019\u0010Õ\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001¨\u0006×\u0001"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/RoomPostBaseFragment;", "Lcom/transsion/baseui/fragment/LazyFragment;", "Lvo/q;", "Lgp/c;", "Lcom/tn/lib/widget/dialog/TRDialogListener;", "<init>", "()V", "", "observePublish", "initExposureHelper", "observeComment", "observeDelete", "observeLike", "Lcom/tn/lib/net/bean/BaseDto;", "", "data", "updateDeletePost", "(Lcom/tn/lib/net/bean/BaseDto;)V", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "postItem", "onLikeClick", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "onCommentClick", "onDownloadClick", "requestPermission", "showSettingDialog", "", "navigateToComment", "openPostDetail", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;Z)V", "onShareClick", "Lcom/transsion/baselib/db/download/DownloadBean;", "download", "saveBuiltInVideo", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "id", "removePost", "(Ljava/lang/String;)V", "localLogPause", "", "getPostExposurePercent", "()F", "initFeedVideo", "checkShowRefreshPopGuide", "Landroid/view/LayoutInflater;", "inflater", "getViewBinding", "(Landroid/view/LayoutInflater;)Lvo/q;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "lazyLoadData", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isShowPageStateLayoutTitle", "()Z", "isAudioShowNoNetworkLayout", "getEmptyDescText", "Lck/q;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnNumNotExposureListener", "(Lck/q;)V", "initViewData", "initListener", "retryLoadData", "Lkotlin/Function0;", "resultCallback", "doRefresh", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/tn/lib/widget/dialog/TRDialog;", "dialog", "onLeftButtonClick", "(Lcom/tn/lib/widget/dialog/TRDialog;)V", "onRightButtonClick", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "onResume", "onPause", "hidden", "onHiddenChanged", "(Z)V", "onDestroy", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "bean", "updateData", "(Lcom/transsion/moviedetailapi/bean/PostSubjectBean;)V", RequestParameters.POSITION, "updateRoomCacheData", "(ILcom/transsion/moviedetailapi/bean/PostSubjectBean;)V", "checkToShowEmptyView", WebConstants.FIELD_ITEM, "openSubjectDetail", "openRoomDetail", "openUserCenter", "Lcom/transsion/postdetail/ui/adapter/PostAdapterFrom;", "postAdapterFrom", "()Lcom/transsion/postdetail/ui/adapter/PostAdapterFrom;", "onItemHeaderClick", "onItemHeaderModuleName", "isFirstLoad", "isRefresh", "loadData", "(ZZ)V", "pageName", "subpageName", "isSwipeRefreshEnable", "isNeedInsertPublishPost", "tabIndex", "()I", "isStaggeredPost", "KEY_POST_EXPOSURE_PERCENT", "Ljava/lang/String;", "TAG", "getTAG", "Lcom/transsion/postdetail/ui/adapter/i;", "mAdapter", "Lcom/transsion/postdetail/ui/adapter/i;", "getMAdapter", "()Lcom/transsion/postdetail/ui/adapter/i;", "setMAdapter", "(Lcom/transsion/postdetail/ui/adapter/i;)V", "Lvj/b;", "mExposureHelper", "Lvj/b;", "getMExposureHelper", "()Lvj/b;", "setMExposureHelper", "(Lvj/b;)V", "Lcom/transsion/postdetail/viewmodel/RoomPostViewModel;", "mViewModel", "Lcom/transsion/postdetail/viewmodel/RoomPostViewModel;", "getMViewModel", "()Lcom/transsion/postdetail/viewmodel/RoomPostViewModel;", "setMViewModel", "(Lcom/transsion/postdetail/viewmodel/RoomPostViewModel;)V", "Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "mDetailViewModel", "Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "getMDetailViewModel", "()Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "setMDetailViewModel", "(Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;)V", "mPageFrom", "getMPageFrom", "setMPageFrom", "preLoadNum", "I", "getPreLoadNum", "mPage", "getMPage", "setMPage", "mPerPage", "getMPerPage", "setMPerPage", "(I)V", "Lcom/transsion/moviedetailapi/bean/Subject;", "mSubject", "Lcom/transsion/moviedetailapi/bean/Subject;", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "Lcom/transsion/moviedetailapi/bean/Group;", "mGroup", "Lcom/transsion/moviedetailapi/bean/Group;", "mGroupId", "getMGroupId", "setMGroupId", "mParentTypeName", "getMParentTypeName", "setMParentTypeName", "mRefreshResultCallback", "Lkotlin/jvm/functions/Function0;", "Lcom/transsion/moviedetailapi/bean/RoomTabItem;", "mTopTab", "Lcom/transsion/moviedetailapi/bean/RoomTabItem;", "getMTopTab", "()Lcom/transsion/moviedetailapi/bean/RoomTabItem;", "setMTopTab", "(Lcom/transsion/moviedetailapi/bean/RoomTabItem;)V", "Lfp/a;", "mFeedVideoManager", "Lfp/a;", "mLoadingView", "Landroid/view/View;", "Landroid/os/Handler;", "mHandler$delegate", "Lkotlin/Lazy;", "getMHandler", "()Landroid/os/Handler;", "mHandler", "Lgz/a;", "mLoginApi$delegate", "getMLoginApi", "()Lgz/a;", "mLoginApi", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "mExposureList$delegate", "getMExposureList", "()Ljava/util/HashSet;", "mExposureList", "mExposureCount", "mRefreshShown", "Z", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class RoomPostBaseFragment extends LazyFragment<C28170q> implements InterfaceC23625c, TRDialogListener {
    private C16985i mAdapter;
    private PostDetailViewModel mDetailViewModel;
    private int mExposureCount;
    private C28117b mExposureHelper;
    private InterfaceC23404a mFeedVideoManager;
    private Group mGroup;
    private String mGroupId;
    private View mLoadingView;
    private String mPage;
    private String mPageFrom;
    private String mParentTypeName;
    private Function0<Unit> mRefreshResultCallback;
    private boolean mRefreshShown;
    private Subject mSubject;
    private RoomTabItem mTopTab;
    private RoomPostViewModel mViewModel;
    private PostSubjectItem postItem;
    private final String KEY_POST_EXPOSURE_PERCENT = SubjectListFragment.KEY_POST_EXPOSURE_PERCENT;
    private final String TAG = "Post_" + getClass().getSimpleName();
    private final int preLoadNum = 2;
    private int mPerPage = 8;

    /* JADX INFO: renamed from: mHandler$delegate, reason: from kotlin metadata */
    private final Lazy mHandler = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.x3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomPostBaseFragment.mHandler_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mLoginApi$delegate, reason: from kotlin metadata */
    private final Lazy mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.y3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomPostBaseFragment.mLoginApi_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: mExposureList$delegate, reason: from kotlin metadata */
    private final Lazy mExposureList = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.z3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomPostBaseFragment.mExposureList_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostBaseFragment$a */
    public static final class C17048a implements InterfaceC28116a {
        C17048a() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            PostSubjectItem postSubjectItem;
            RoomPostBaseFragment roomPostBaseFragment = RoomPostBaseFragment.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                C16985i mAdapter = roomPostBaseFragment.getMAdapter();
                if (mAdapter != null && (postSubjectItem = (PostSubjectItem) mAdapter.m36182f0(i11)) != null) {
                    roomPostBaseFragment.checkShowRefreshPopGuide();
                    if (!CollectionsKt.m97352b0(roomPostBaseFragment.getMExposureList(), postSubjectItem.getPostId())) {
                        String postId = postSubjectItem.getPostId();
                        if (postId != null) {
                            roomPostBaseFragment.getMExposureList().add(postId);
                        }
                        C16768a.f56378a.m73082w(roomPostBaseFragment.getMPageFrom(), roomPostBaseFragment.pageName(), roomPostBaseFragment.subpageName(), i11, j11, postSubjectItem, roomPostBaseFragment.getMGroupId());
                    }
                    if (roomPostBaseFragment instanceof RoomPostExploreFragment) {
                        ((RoomPostExploreFragment) roomPostBaseFragment).deleteCacheRoom(postSubjectItem);
                    }
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostBaseFragment$b */
    public static final class C17049b extends DiffUtil.AbstractC4174e {
        C17049b() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(PostSubjectItem oldItem, PostSubjectItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getPostId(), newItem.getPostId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(PostSubjectItem oldItem, PostSubjectItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getPostId(), newItem.getPostId());
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostBaseFragment$c */
    public static final class C17050c implements InterfaceC18701a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ShareDialogFragment f57240a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ PostSubjectItem f57241b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ RoomPostBaseFragment f57242c;

        C17050c(ShareDialogFragment shareDialogFragment, PostSubjectItem postSubjectItem, RoomPostBaseFragment roomPostBaseFragment) {
            this.f57240a = shareDialogFragment;
            this.f57241b = postSubjectItem;
            this.f57242c = roomPostBaseFragment;
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: a */
        public void mo70521a(String id2, PostType postType) {
            Intrinsics.m97802h(id2, "id");
            RoomPostViewModel mViewModel = this.f57242c.getMViewModel();
            if (mViewModel != null) {
                mViewModel.m75133z(id2);
            }
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: b */
        public void mo70522b(String str) {
            C26866a.a.m104898f(C26866a.f81698a, this.f57242c.getTAG(), "id" + str, false, 4, null);
            this.f57242c.removePost(str);
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: c */
        public void mo70523c(String url, String fileName, String fileSize, String fileImage) {
            Subject subject;
            ResourceDetectors resourceDetector;
            String resourceLink;
            Media media;
            Cover cover;
            Integer size;
            Media media2;
            Cover cover2;
            String url2;
            String url3;
            String url4;
            Media media3;
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(fileName, "fileName");
            Intrinsics.m97802h(fileSize, "fileSize");
            Intrinsics.m97802h(fileImage, "fileImage");
            if (C14557c.f51100a.m65671a(this.f57240a.getId(), 500L)) {
                return;
            }
            PostSubjectItem postSubjectItem = this.f57241b;
            Video videoM74975a = AbstractC17450t.m74975a((postSubjectItem == null || (media3 = postSubjectItem.getMedia()) == null) ? null : media3.getVideo());
            PostSubjectItem postSubjectItem2 = this.f57241b;
            String title = postSubjectItem2 != null ? postSubjectItem2.getTitle() : null;
            if (TextUtils.isEmpty(title)) {
                PostSubjectItem postSubjectItem3 = this.f57241b;
                title = postSubjectItem3 != null ? postSubjectItem3.getContent() : null;
            }
            String str = title;
            String str2 = (videoM74975a == null || (url4 = videoM74975a.getUrl()) == null) ? "" : url4;
            String str3 = (videoM74975a == null || (url3 = videoM74975a.getUrl()) == null) ? "" : url3;
            PostSubjectItem postSubjectItem4 = this.f57241b;
            String str4 = (postSubjectItem4 == null || (media2 = postSubjectItem4.getMedia()) == null || (cover2 = media2.getCover()) == null || (url2 = cover2.getUrl()) == null) ? "" : url2;
            Long lValueOf = (videoM74975a == null || (size = videoM74975a.getSize()) == null) ? null : Long.valueOf(size.intValue());
            PostSubjectItem postSubjectItem5 = this.f57241b;
            String postId = postSubjectItem5 != null ? postSubjectItem5.getPostId() : null;
            PostSubjectItem postSubjectItem6 = this.f57241b;
            DownloadBean downloadBean = new DownloadBean(str2, str3, str, str4, lValueOf, postSubjectItem6 != null ? postSubjectItem6.getPostId() : null, null, null, null, null, 0L, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, postId, null, null, null, 0L, 0, 0, null, null, 0L, null, null, 0L, 0, 0L, null, 0, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -134217792, -1, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
            PostSubjectItem postSubjectItem7 = this.f57241b;
            downloadBean.setThumbnail((postSubjectItem7 == null || (media = postSubjectItem7.getMedia()) == null || (cover = media.getCover()) == null) ? null : cover.getThumbnail());
            PostSubjectItem postSubjectItem8 = this.f57241b;
            if (postSubjectItem8 == null || !postSubjectItem8.getBuiltIn()) {
                DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                Context context = this.f57240a.getContext();
                Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                PostSubjectItem postSubjectItem9 = this.f57241b;
                String ops = postSubjectItem9 != null ? postSubjectItem9.getOps() : null;
                PostSubjectItem postSubjectItem10 = this.f57241b;
                downloadManagerApiM87093a.m87082O(fragmentActivity, downloadBean, VideoFragment.PAGE_NAME, ops, (postSubjectItem10 == null || (subject = postSubjectItem10.getSubject()) == null || (resourceDetector = subject.getResourceDetector()) == null || (resourceLink = resourceDetector.getResourceLink()) == null) ? "" : resourceLink, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : null);
            } else {
                this.f57242c.saveBuiltInVideo(downloadBean);
            }
            C16768a.m73059j(C16768a.f56378a, this.f57241b, this.f57242c.subpageName(), null, 4, null);
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

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostBaseFragment$d */
    static final class C17051d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57243a;

        C17051d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57243a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57243a;
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
            this.f57243a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostBaseFragment$saveBuiltInVideo$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.RoomPostBaseFragment$saveBuiltInVideo$1", m97637f = "RoomPostBaseFragment.kt", m97638l = {710, 711}, m97639m = "invokeSuspend")
    static final class C170521 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ DownloadBean $download;
        int label;

        /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostBaseFragment$saveBuiltInVideo$1$1, reason: invalid class name */
        @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
        @DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.RoomPostBaseFragment$saveBuiltInVideo$1$1", m97637f = "RoomPostBaseFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.m97630f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
                C28951b.f88586a.m111455e("download success~");
                return Unit.f75682a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C170521(DownloadBean downloadBean, Continuation<? super C170521> continuation) {
            super(2, continuation);
            this.$download = downloadBean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C170521(this.$download, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C170521) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.m97107b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            DownloadBean downloadBean = this.$download;
            downloadBean.setPath(downloadBean.getUrl());
            this.$download.setStatus(5);
            DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
            DownloadBean downloadBean2 = this.$download;
            this.label = 1;
            if (downloadEsHelperM88598a.m88569T(downloadBean2, this) == objF) {
                return objF;
            }
            AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 2;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, anonymousClass1, this) == objF) {
                return objF;
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkShowRefreshPopGuide() {
        if (Intrinsics.m97797c(this.mParentTypeName, "BOTTOM_TAB") && !this.mRefreshShown) {
            int i11 = this.mExposureCount + 1;
            this.mExposureCount = i11;
            if (i11 < 9) {
                return;
            }
            C14496b c14496b = C14496b.f50966a;
            boolean z11 = c14496b.m65344b().getBoolean("ROOM_POST_REFRESH_GUIDE", false);
            this.mRefreshShown = true;
            if (z11) {
                return;
            }
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "--ShowRefreshPopGuide", false, 4, null);
            c14496b.m65344b().putBoolean("ROOM_POST_REFRESH_GUIDE", true);
            C23418i c23418i = new C23418i();
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C23418i.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c23418i, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HashSet<String> getMExposureList() {
        return (HashSet) this.mExposureList.getValue();
    }

    private final Handler getMHandler() {
        return (Handler) this.mHandler.getValue();
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    private final float getPostExposurePercent() {
        Float fT;
        ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), this.KEY_POST_EXPOSURE_PERCENT, false, 2, null);
        String value = configBeanM110355d != null ? configBeanM110355d.getValue() : null;
        if (value == null || value.length() == 0 || (fT = StringsKt.m98214t(value)) == null) {
            return 0.6f;
        }
        return fT.floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initExposureHelper() {
        RecyclerView recyclerView;
        float postExposurePercent = getPostExposurePercent();
        C26866a.a.m104898f(C26866a.f81698a, "PostList", "initExposureHelper, postExposurePercent:" + postExposurePercent, false, 4, null);
        C28117b c28117b = new C28117b(postExposurePercent, new C17048a(), false, 4, null);
        c28117b.m109199n(2);
        C28170q c28170q = (C28170q) getMViewBinding();
        if (c28170q != null && (recyclerView = c28170q.f86594b) != null) {
            recyclerView.addOnScrollListener(c28117b);
        }
        this.mExposureHelper = c28117b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initFeedVideo() {
        InterfaceC23404a.a aVar = InterfaceC23404a.f71384h1;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        C28170q c28170q = (C28170q) getMViewBinding();
        this.mFeedVideoManager = aVar.m92948a(contextRequireContext, this, c28170q != null ? c28170q.f86594b : null, this.mAdapter, pageName(), subpageName(), getActivity() instanceof InterfaceC29192b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewData$lambda$12$lambda$11(RoomPostBaseFragment roomPostBaseFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        String strOnItemHeaderModuleName = null;
        PostSubjectItem postSubjectItem = item instanceof PostSubjectItem ? (PostSubjectItem) item : null;
        int id2 = view.getId();
        if (id2 == R$id.fl_cover || id2 == R$id.tv_room_name || id2 == R$id.iv_user_avatar || id2 == R$id.tv_user_name || id2 == R$id.tv_post_date) {
            roomPostBaseFragment.onItemHeaderClick(postSubjectItem);
            strOnItemHeaderModuleName = roomPostBaseFragment.onItemHeaderModuleName();
        } else {
            if (id2 == R$id.v_post_like) {
                strOnItemHeaderModuleName = postSubjectItem != null ? Intrinsics.m97797c(postSubjectItem.getHasLike(), Boolean.TRUE) : false ? "dislike" : "like";
                roomPostBaseFragment.onLikeClick(postSubjectItem);
            } else if (id2 == R$id.tv_staggered_post_like) {
                strOnItemHeaderModuleName = postSubjectItem != null ? Intrinsics.m97797c(postSubjectItem.getHasLike(), Boolean.TRUE) : false ? "dislike" : "like";
                roomPostBaseFragment.onLikeClick(postSubjectItem);
            } else if (id2 == R$id.v_post_comment) {
                roomPostBaseFragment.onCommentClick(postSubjectItem);
                strOnItemHeaderModuleName = "comment";
            } else if (id2 == R$id.clHotComment) {
                roomPostBaseFragment.onCommentClick(postSubjectItem);
                strOnItemHeaderModuleName = "hot_comment";
            } else if (id2 == R$id.v_post_share) {
                roomPostBaseFragment.onShareClick(postSubjectItem);
                strOnItemHeaderModuleName = "share";
            } else if (id2 == R$id.v_post_download) {
                roomPostBaseFragment.onDownloadClick(postSubjectItem);
                strOnItemHeaderModuleName = "download";
            } else if (id2 == R$id.cl_subject_content) {
                roomPostBaseFragment.openSubjectDetail(postSubjectItem);
                strOnItemHeaderModuleName = "subject";
            } else if (id2 == R$id.tv_room_tag) {
                roomPostBaseFragment.openRoomDetail(postSubjectItem);
                strOnItemHeaderModuleName = "group";
            } else if (id2 == R$id.refresh_more) {
                InterfaceC4393e parentFragment = roomPostBaseFragment.getParentFragment();
                if (parentFragment instanceof InterfaceC23416g) {
                    ((InterfaceC23416g) parentFragment).mo76975u();
                }
            }
        }
        if (postSubjectItem != null) {
            C16768a.f56378a.m73083y(roomPostBaseFragment.mPageFrom, roomPostBaseFragment.pageName(), roomPostBaseFragment.subpageName(), i11, strOnItemHeaderModuleName == null ? "" : strOnItemHeaderModuleName, postSubjectItem, roomPostBaseFragment.mGroupId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViewData$lambda$12$lambda$6$lambda$5(RoomPostBaseFragment roomPostBaseFragment) {
        SwipeRefreshLayout swipeRefreshLayout;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_toast);
            return Unit.f75682a;
        }
        if (roomPostBaseFragment.isSwipeRefreshEnable()) {
            C28170q c28170q = (C28170q) roomPostBaseFragment.getMViewBinding();
            if (c28170q != null && (swipeRefreshLayout = c28170q.f86595c) != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            InterfaceC23625c.a.m93483a(roomPostBaseFragment, null, 1, null);
        } else {
            InterfaceC4393e parentFragment = roomPostBaseFragment.getParentFragment();
            if (parentFragment instanceof InterfaceC23416g) {
                ((InterfaceC23416g) parentFragment).mo76973e(false);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initViewData$lambda$12$lambda$8(final RoomPostBaseFragment roomPostBaseFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            loadData$default(roomPostBaseFragment, false, false, 1, null);
            return;
        }
        C28170q c28170q = (C28170q) roomPostBaseFragment.getMViewBinding();
        if (c28170q == null || (recyclerView = c28170q.f86594b) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.s3
            @Override // java.lang.Runnable
            public final void run() {
                RoomPostBaseFragment.initViewData$lambda$12$lambda$8$lambda$7(this.f57454a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewData$lambda$12$lambda$8$lambda$7(RoomPostBaseFragment roomPostBaseFragment) {
        C27941f c27941fM36186h0;
        C16985i c16985i = roomPostBaseFragment.mAdapter;
        if (c16985i == null || (c27941fM36186h0 = c16985i.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewData$lambda$12$lambda$9(RoomPostBaseFragment roomPostBaseFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        PostSubjectItem postSubjectItem = item instanceof PostSubjectItem ? (PostSubjectItem) item : null;
        if (postSubjectItem == null || postSubjectItem.isRoomCacheListStart() || postSubjectItem.isRoomCacheListEnd()) {
            return;
        }
        C16768a.f56378a.m73083y(roomPostBaseFragment.mPageFrom, roomPostBaseFragment.pageName(), roomPostBaseFragment.subpageName(), i11, WebConstants.FIELD_ITEM, postSubjectItem, roomPostBaseFragment.mGroupId);
        openPostDetail$default(roomPostBaseFragment, postSubjectItem, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewData$lambda$15(RoomPostBaseFragment roomPostBaseFragment, BaseDto baseDto) {
        roomPostBaseFragment.updateDeletePost(baseDto);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewData$lambda$17(final RoomPostBaseFragment roomPostBaseFragment, PostSubjectItem postSubjectItem) {
        C26866a.a.m104898f(C26866a.f81698a, roomPostBaseFragment.TAG, roomPostBaseFragment.getClass().getSimpleName() + "--Publish get detail result,  id:" + (postSubjectItem != null ? postSubjectItem.getPostId() : null), false, 4, null);
        if (postSubjectItem == null) {
            return Unit.f75682a;
        }
        postSubjectItem.setDistanceStr("<1m");
        C16985i c16985i = roomPostBaseFragment.mAdapter;
        if (c16985i != null) {
            c16985i.mo36199n(0, postSubjectItem);
        }
        roomPostBaseFragment.getMHandler().post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.c4
            @Override // java.lang.Runnable
            public final void run() {
                RoomPostBaseFragment.initViewData$lambda$17$lambda$16(this.f57304a);
            }
        });
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initViewData$lambda$17$lambda$16(RoomPostBaseFragment roomPostBaseFragment) {
        RecyclerView recyclerView;
        C28170q c28170q = (C28170q) roomPostBaseFragment.getMViewBinding();
        if (c28170q == null || (recyclerView = c28170q.f86594b) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    public static /* synthetic */ void loadData$default(RoomPostBaseFragment roomPostBaseFragment, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadData");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        roomPostBaseFragment.loadData(z11, z12);
    }

    private final void localLogPause() {
        C28117b c28117b = this.mExposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashSet mExposureList_delegate$lambda$2() {
        return new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mHandler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a mLoginApi_delegate$lambda$1() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    private final void observeComment() {
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.fragment.v3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomPostBaseFragment.observeComment$lambda$23(this.f57476a, (CommentEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = CommentEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0 A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #1 {Exception -> 0x0036, blocks: (B:3:0x0007, B:5:0x000c, B:7:0x0012, B:8:0x0017, B:10:0x001d, B:13:0x0033, B:17:0x003b, B:19:0x003f, B:21:0x0045, B:24:0x004f, B:43:0x0099, B:42:0x008f, B:44:0x009c, B:46:0x00a0, B:26:0x0055, B:28:0x005f, B:30:0x0065, B:34:0x006e, B:40:0x0085, B:35:0x0074, B:37:0x007a, B:39:0x0080), top: B:53:0x0007, inners: #0 }] */
    public static final Unit observeComment$lambda$23(RoomPostBaseFragment roomPostBaseFragment, CommentEvent value) {
        C16985i c16985i;
        Stat stat;
        Object objM112707constructorimpl;
        Long lValueOf;
        List<Object> data;
        List<Object> data2;
        Intrinsics.m97802h(value, "value");
        try {
            C16985i c16985i2 = roomPostBaseFragment.mAdapter;
            int i11 = -1;
            if (c16985i2 != null && (data2 = c16985i2.getData()) != null) {
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
                C16985i c16985i3 = roomPostBaseFragment.mAdapter;
                PostSubjectItem postSubjectItem = (c16985i3 == null || (data = c16985i3.getData()) == null) ? null : (PostSubjectItem) data.get(i11);
                if (postSubjectItem == null || (stat = postSubjectItem.getStat()) == null) {
                    c16985i = roomPostBaseFragment.mAdapter;
                    if (c16985i != null) {
                        c16985i.notifyItemChanged(i11);
                    }
                } else {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        if (value.getStatus()) {
                            Long commentCount = stat.getCommentCount();
                            lValueOf = Long.valueOf((commentCount != null ? commentCount.longValue() : 0L) + 1);
                        } else {
                            Long commentCount2 = stat.getCommentCount();
                            lValueOf = Long.valueOf((commentCount2 != null ? commentCount2.longValue() : 1L) - 1);
                        }
                        stat.setCommentCount(lValueOf);
                        objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
                    }
                    Result.m112706boximpl(objM112707constructorimpl);
                    c16985i = roomPostBaseFragment.mAdapter;
                    if (c16985i != null) {
                        c16985i.notifyItemChanged(i11);
                    }
                }
            }
        } catch (Exception e11) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail " + e11.getMessage(), false, 2, null);
        }
        return Unit.f75682a;
    }

    private final void observeDelete() {
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.fragment.e4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomPostBaseFragment.observeDelete$lambda$25(this.f57322a, (C28672b) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C28672b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeDelete$lambda$25(RoomPostBaseFragment roomPostBaseFragment, C28672b value) {
        C16985i c16985i;
        List<Object> data;
        Intrinsics.m97802h(value, "value");
        try {
            C16985i c16985i2 = roomPostBaseFragment.mAdapter;
            int i11 = -1;
            if (c16985i2 != null && (data = c16985i2.getData()) != null) {
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
            if (i11 >= 0 && (c16985i = roomPostBaseFragment.mAdapter) != null) {
                c16985i.mo36138G0(i11);
            }
            roomPostBaseFragment.checkToShowEmptyView();
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    private final void observeLike() {
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.fragment.w3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomPostBaseFragment.observeLike$lambda$29(this.f57483a, (LikeEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = LikeEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x0099 A[Catch: Exception -> 0x00a5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0008, B:5:0x000d, B:7:0x0013, B:8:0x0018, B:10:0x001e, B:16:0x0038, B:18:0x003c, B:20:0x0042, B:23:0x004c, B:25:0x0059, B:40:0x0092, B:39:0x0088, B:41:0x0095, B:43:0x0099, B:13:0x0033, B:27:0x005f, B:29:0x0067, B:33:0x0070, B:37:0x0078), top: B:48:0x0008, inners: #1 }] */
    public static final Unit observeLike$lambda$29(RoomPostBaseFragment roomPostBaseFragment, LikeEvent value) {
        int i11;
        C16985i c16985i;
        Stat stat;
        Object objM112707constructorimpl;
        List<Object> data;
        List<Object> data2;
        int i12 = 1;
        Intrinsics.m97802h(value, "value");
        try {
            C16985i c16985i2 = roomPostBaseFragment.mAdapter;
            if (c16985i2 != null && (data2 = c16985i2.getData()) != null) {
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
                C16985i c16985i3 = roomPostBaseFragment.mAdapter;
                PostSubjectItem postSubjectItem = (c16985i3 == null || (data = c16985i3.getData()) == null) ? null : (PostSubjectItem) data.get(i11);
                if (postSubjectItem != null) {
                    postSubjectItem.setHasLike(Boolean.valueOf(value.getLike()));
                }
                if (postSubjectItem == null || (stat = postSubjectItem.getStat()) == null) {
                    c16985i = roomPostBaseFragment.mAdapter;
                    if (c16985i != null) {
                        c16985i.notifyItemChanged(i11, Boolean.valueOf(value.getLike()));
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
                    c16985i = roomPostBaseFragment.mAdapter;
                    if (c16985i != null) {
                        c16985i.notifyItemChanged(i11, Boolean.valueOf(value.getLike()));
                    }
                }
            }
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    private final void observePublish() {
        if (isNeedInsertPublishPost()) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, getClass().getSimpleName() + "--observePublish", false, 4, null);
            Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.fragment.b4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomPostBaseFragment.observePublish$lambda$18(this.f57294a, (PublishEvent) obj);
                }
            };
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = PublishEvent.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observePublish$lambda$18(RoomPostBaseFragment roomPostBaseFragment, PublishEvent value) {
        PostDetailViewModel postDetailViewModel;
        Intrinsics.m97802h(value, "value");
        InterfaceC4393e parentFragment = roomPostBaseFragment.getParentFragment();
        if (!(parentFragment instanceof InterfaceC23416g)) {
            return Unit.f75682a;
        }
        int iMo76969B = ((InterfaceC23416g) parentFragment).mo76969B();
        C26866a.a.m104898f(C26866a.f81698a, roomPostBaseFragment.TAG, roomPostBaseFragment.getClass().getSimpleName() + "--publishevent curTab:" + iMo76969B + ", fTab:" + roomPostBaseFragment.tabIndex(), false, 4, null);
        if (roomPostBaseFragment.tabIndex() == iMo76969B && (postDetailViewModel = roomPostBaseFragment.mDetailViewModel) != null) {
            postDetailViewModel.m75057x(value.getPostId());
        }
        return Unit.f75682a;
    }

    private final void onCommentClick(PostSubjectItem postItem) {
        openPostDetail(postItem, true);
    }

    private final void onDownloadClick(PostSubjectItem postItem) {
        this.postItem = postItem;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.transsion.postdetail.viewmodel.RoomPostViewModel] */
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
    private final void onLikeClick(PostSubjectItem postItem) {
        ?? M97797c = postItem != null ? Intrinsics.m97797c(postItem.getHasLike(), Boolean.TRUE) : 0;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_tips);
            return;
        }
        ?? r11 = this.mViewModel;
        if (r11 != 0) {
            r11.m75126Z(postItem != null ? postItem.getPostId() : null, M97797c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private final void onShareClick(PostSubjectItem postItem) {
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
        boolean z12 = z11;
        ShareDialogFragment.Companion companion = ShareDialogFragment.INSTANCE;
        PostType postType = PostType.POST_TYPE;
        String postId = postItem != null ? postItem.getPostId() : null;
        String userId = (postItem == null || (user = postItem.getUser()) == null) ? null : user.getUserId();
        String value = ReportType.POST.getValue();
        String title = postItem != null ? postItem.getTitle() : null;
        Context context = getContext();
        ShareDialogFragment shareDialogFragmentM78645a = companion.m78645a(postType, postId, userId, value, (3328 & 16) != 0 ? "" : title, (3328 & 32) != 0 ? "" : "", (3328 & 64) != 0 ? false : false, (3328 & 128) != 0 ? false : z12, (3328 & 256) != 0 ? false : false, "postdetail", (3328 & 1024) != 0 ? "" : null, (3328 & 2048) != 0 ? "" : context != null ? context.getString(com.transsion.postdetail.R$string.save_video) : null);
        shareDialogFragmentM78645a.m78642G0(new C17050c(shareDialogFragmentM78645a, postItem, this));
        shareDialogFragmentM78645a.show(getChildFragmentManager(), "share");
    }

    private final void openPostDetail(PostSubjectItem postItem, boolean navigateToComment) {
        if (postItem != null) {
            InterfaceC23624b interfaceC23624b = (InterfaceC23624b) TheRouter.m61774d(InterfaceC23624b.class, new Object[0]);
            if (interfaceC23624b != null) {
                interfaceC23624b.mo93476i(postItem);
            }
            Media media = postItem.getMedia();
            Navigator navigatorM61857K = TheRouter.m61773c(Intrinsics.m97797c(media != null ? media.getMediaType() : null, MediaType.VIDEO.getValue()) ? "/post/detailVideo" : "/post/detail").m61857K(WebConstants.PAGE_FROM, pageName()).m61872z("from_comment", navigateToComment).m61856J("item_object", postItem).m61857K("id", postItem.getPostId()).m61857K("rec_ops", postItem.getOps()).m61857K("item_type", postItem.getItemType());
            Media media2 = postItem.getMedia();
            Navigator.m61845x(navigatorM61857K.m61857K("media_type", media2 != null ? media2.getMediaType() : null).m61872z("is_build_in", postItem.getBuiltIn()), requireContext(), null, 2, null);
        }
    }

    static /* synthetic */ void openPostDetail$default(RoomPostBaseFragment roomPostBaseFragment, PostSubjectItem postSubjectItem, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPostDetail");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        roomPostBaseFragment.openPostDetail(postSubjectItem, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePost(String id2) {
        List<Object> data;
        C16985i c16985i;
        C16985i c16985i2 = this.mAdapter;
        if (c16985i2 == null || (data = c16985i2.getData()) == null) {
            return;
        }
        Iterator<Object> it = data.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.m97797c(((PostSubjectItem) it.next()).getPostId(), id2)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0 && (c16985i = this.mAdapter) != null) {
            c16985i.mo36138G0(i11);
        }
    }

    private final void requestPermission() {
        requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, FileHelper.f55226a.m71367l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveBuiltInVideo(DownloadBean download) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new C170521(download, null), 3, null);
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
    public static final void updateData$lambda$39(RoomPostBaseFragment roomPostBaseFragment) {
        InterfaceC23404a interfaceC23404a = roomPostBaseFragment.mFeedVideoManager;
        if (interfaceC23404a != null) {
            interfaceC23404a.mo92945a();
        }
    }

    private final void updateDeletePost(BaseDto<String> data) {
        Object objM112707constructorimpl;
        List<Object> data2;
        C16985i c16985i;
        Unit unit = null;
        if (!Intrinsics.m97797c(data != null ? data.getCode() : null, "0")) {
            C28951b.f88586a.m111455e(getString(com.transsion.postdetail.R$string.delete_post_failed));
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C16985i c16985i2 = this.mAdapter;
            if (c16985i2 != null && (data2 = c16985i2.getData()) != null) {
                Iterator<Object> it = data2.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    } else if (Intrinsics.m97797c(((PostSubjectItem) it.next()).getPostId(), data.getData())) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0 && (c16985i = this.mAdapter) != null) {
                    c16985i.mo36138G0(i11);
                }
                unit = Unit.f75682a;
            }
            objM112707constructorimpl = Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Result.m112706boximpl(objM112707constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRoomCacheData$lambda$47(RoomPostBaseFragment roomPostBaseFragment) {
        InterfaceC23404a interfaceC23404a = roomPostBaseFragment.mFeedVideoManager;
        if (interfaceC23404a != null) {
            interfaceC23404a.mo92945a();
        }
    }

    public void checkToShowEmptyView() {
        if (getContext() == null) {
            return;
        }
        if (C27287m.f83003a.m106330e()) {
            C16985i c16985i = this.mAdapter;
            if (c16985i != null) {
                c16985i.m36171Y0(getEmptyView(false));
                return;
            }
            return;
        }
        C16985i c16985i2 = this.mAdapter;
        if (c16985i2 != null) {
            c16985i2.m36171Y0(getLocalNoNetworkView(false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gp.InterfaceC23625c
    public void doRefresh(Function0<Unit> resultCallback) {
        C28170q c28170q;
        RecyclerView recyclerView;
        SwipeRefreshLayout swipeRefreshLayout;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_toast);
            C28170q c28170q2 = (C28170q) getMViewBinding();
            if (c28170q2 != null && (swipeRefreshLayout = c28170q2.f86595c) != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            if (resultCallback != null) {
                resultCallback.invoke();
                return;
            }
            return;
        }
        this.mRefreshResultCallback = resultCallback;
        this.mPage = null;
        C16985i c16985i = this.mAdapter;
        List<Object> data = c16985i != null ? c16985i.getData() : null;
        if (data != null && !data.isEmpty() && (c28170q = (C28170q) getMViewBinding()) != null && (recyclerView = c28170q.f86594b) != null) {
            recyclerView.scrollToPosition(0);
        }
        loadData$default(this, false, false, 3, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getEmptyDescText() {
        String string = getString(com.transsion.usercenter.R$string.profile_not_content);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return new View(Utils.m27275a());
        }
        if (this.mLoadingView == null) {
            this.mLoadingView = LayoutInflater.from(activity).inflate(R$layout.layout_room_post_loading, (ViewGroup) getFlStateView(), false);
        }
        return this.mLoadingView;
    }

    protected final C16985i getMAdapter() {
        return this.mAdapter;
    }

    protected final PostDetailViewModel getMDetailViewModel() {
        return this.mDetailViewModel;
    }

    protected final C28117b getMExposureHelper() {
        return this.mExposureHelper;
    }

    protected final String getMGroupId() {
        return this.mGroupId;
    }

    protected final String getMPage() {
        return this.mPage;
    }

    protected final String getMPageFrom() {
        return this.mPageFrom;
    }

    protected final String getMParentTypeName() {
        return this.mParentTypeName;
    }

    protected final int getMPerPage() {
        return this.mPerPage;
    }

    protected final RoomTabItem getMTopTab() {
        return this.mTopTab;
    }

    protected final RoomPostViewModel getMViewModel() {
        return this.mViewModel;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    protected final int getPreLoadNum() {
        return this.preLoadNum;
    }

    protected final String getTAG() {
        return this.TAG;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C28170q getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28170q c28170qM109362c = C28170q.m109362c(inflater);
        Intrinsics.m97801g(c28170qM109362c, "inflate(...)");
        return c28170qM109362c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        observeComment();
        observeDelete();
        observeLike();
        observePublish();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        SwipeRefreshLayout swipeRefreshLayout;
        C16985i c16985i;
        LiveData liveDataM75048A;
        C3187b0 c3187b0M75107C;
        RecyclerView recyclerView;
        RecyclerView.AbstractC4214m npaLinearLayoutManager;
        C28170q c28170q;
        RecyclerView recyclerView2;
        C28170q c28170q2;
        RecyclerView recyclerView3;
        SwipeRefreshLayout swipeRefreshLayout2;
        initExposureHelper();
        if (isSwipeRefreshEnable()) {
            C28170q c28170q3 = (C28170q) getMViewBinding();
            if (c28170q3 != null && (swipeRefreshLayout2 = c28170q3.f86595c) != null) {
                swipeRefreshLayout2.setProgressBackgroundColorSchemeColor(AbstractC2397b.getColor(swipeRefreshLayout2.getContext(), R$color.bg_01));
                swipeRefreshLayout2.setColorSchemeColors(AbstractC2397b.getColor(swipeRefreshLayout2.getContext(), R$color.main_gradient_center), AbstractC2397b.getColor(swipeRefreshLayout2.getContext(), R$color.main_gradient_start));
                swipeRefreshLayout2.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.postdetail.ui.fragment.f4
                    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                    /* JADX INFO: renamed from: a */
                    public final void mo21823a() {
                        InterfaceC23625c.a.m93483a(this.f57329a, null, 1, null);
                    }
                });
            }
        } else {
            C28170q c28170q4 = (C28170q) getMViewBinding();
            if (c28170q4 != null && (swipeRefreshLayout = c28170q4.f86595c) != null) {
                swipeRefreshLayout.setEnabled(false);
            }
        }
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        PostAdapterFrom postAdapterFrom = postAdapterFrom();
        C28117b c28117b = this.mExposureHelper;
        String strPageName = pageName();
        String str = this.mPageFrom;
        InterfaceC3224u viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.m97801g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16985i c16985i2 = new C16985i(contextRequireContext, postAdapterFrom, c28117b, strPageName, str, AbstractC3226v.m14968a(viewLifecycleOwner));
        c16985i2.m36186h0().m108673z(true);
        c16985i2.m36186h0().m108672y(true);
        c16985i2.m36186h0().m108657E(this.preLoadNum);
        C27941f c27941fM36186h0 = c16985i2.m36186h0();
        PostListLoadMoreView postListLoadMoreView = new PostListLoadMoreView();
        postListLoadMoreView.setOnFailClickCallback(new Function0() { // from class: com.transsion.postdetail.ui.fragment.g4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomPostBaseFragment.initViewData$lambda$12$lambda$6$lambda$5(this.f57355a);
            }
        });
        c27941fM36186h0.m108655C(postListLoadMoreView);
        c16985i2.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.postdetail.ui.fragment.h4
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                RoomPostBaseFragment.initViewData$lambda$12$lambda$8(this.f57363a);
            }
        });
        c16985i2.m36158R0(new C17049b());
        c16985i2.m36227w1(new InterfaceC27566d() { // from class: com.transsion.postdetail.ui.fragment.i4
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                RoomPostBaseFragment.initViewData$lambda$12$lambda$9(this.f57370a, baseQuickAdapter, view, i11);
            }
        });
        c16985i2.m36193l(R$id.fl_cover, R$id.tv_room_name, R$id.tv_post_date, R$id.v_post_like, R$id.v_post_comment, R$id.v_post_share, R$id.v_post_download, R$id.cl_subject_content, R$id.tv_room_tag, R$id.clHotComment, R$id.tv_staggered_post_like, R$id.iv_user_avatar, R$id.tv_user_name, R$id.refresh_more, R$id.ivNegativeFeedback);
        c16985i2.m36216s1(new InterfaceC27564b() { // from class: com.transsion.postdetail.ui.fragment.j4
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                RoomPostBaseFragment.initViewData$lambda$12$lambda$11(this.f57377a, baseQuickAdapter, view, i11);
            }
        });
        this.mAdapter = c16985i2;
        C28170q c28170q5 = (C28170q) getMViewBinding();
        if (c28170q5 != null && (recyclerView = c28170q5.f86594b) != null) {
            if (isStaggeredPost()) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
                staggeredGridLayoutManager.m20982f0(2);
                npaLinearLayoutManager = staggeredGridLayoutManager;
            } else {
                npaLinearLayoutManager = new NpaLinearLayoutManager(recyclerView.getContext());
            }
            recyclerView.setLayoutManager(npaLinearLayoutManager);
            if (isStaggeredPost() && (c28170q = (C28170q) getMViewBinding()) != null && (recyclerView2 = c28170q.f86594b) != null && recyclerView2.getItemDecorationCount() == 0 && (c28170q2 = (C28170q) getMViewBinding()) != null && (recyclerView3 = c28170q2.f86594b) != null) {
                recyclerView3.addItemDecoration(new C25830g(AbstractC5776a0.m27313a(6.0f), true));
            }
            recyclerView.setAdapter(this.mAdapter);
        }
        RoomPostViewModel roomPostViewModel = this.mViewModel;
        if (roomPostViewModel != null && (c3187b0M75107C = roomPostViewModel.m75107C()) != null) {
            c3187b0M75107C.m14851j(this, new C17051d(new Function1() { // from class: com.transsion.postdetail.ui.fragment.t3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomPostBaseFragment.initViewData$lambda$15(this.f57462a, (BaseDto) obj);
                }
            }));
        }
        PostDetailViewModel postDetailViewModel = this.mDetailViewModel;
        if (postDetailViewModel != null && (liveDataM75048A = postDetailViewModel.m75048A()) != null) {
            liveDataM75048A.m14851j(this, new C17051d(new Function1() { // from class: com.transsion.postdetail.ui.fragment.u3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomPostBaseFragment.initViewData$lambda$17(this.f57468a, (PostSubjectItem) obj);
                }
            }));
        }
        if (C27287m.f83003a.m106330e() || (c16985i = this.mAdapter) == null) {
            return;
        }
        c16985i.m36171Y0(getLocalNoNetworkView(false));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    public abstract boolean isNeedInsertPublishPost();

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    public abstract boolean isStaggeredPost();

    public abstract boolean isSwipeRefreshEnable();

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        if (!isAdded() || isDetached() || isRemoving()) {
            return;
        }
        showLoadingView();
        loadData$default(this, true, false, 2, null);
        C17437g.f57828a.m74960d(true);
        initFeedVideo();
    }

    public abstract void loadData(boolean isFirstLoad, boolean isRefresh);

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(pageName(), false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        HashMap mapM96844g;
        super.onCreate(savedInstanceState);
        this.mViewModel = (RoomPostViewModel) new C3227v0(this).m14969a(RoomPostViewModel.class);
        this.mDetailViewModel = (PostDetailViewModel) new C3227v0(this).m14969a(PostDetailViewModel.class);
        this.mPageFrom = C24662i.f75350a.m96877i();
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getMHandler().removeCallbacksAndMessages(null);
        InterfaceC23404a interfaceC23404a = this.mFeedVideoManager;
        if (interfaceC23404a != null) {
            interfaceC23404a.onPageDestroy();
        }
    }

    @Override // com.transsion.baseui.fragment.LazyFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
                localLogPause();
                InterfaceC23404a interfaceC23404a = this.mFeedVideoManager;
                if (interfaceC23404a != null) {
                    interfaceC23404a.mo92946b();
                }
            } else {
                logResume();
                InterfaceC23404a interfaceC23404a2 = this.mFeedVideoManager;
                if (interfaceC23404a2 != null) {
                    interfaceC23404a2.mo92947c();
                }
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    public abstract void onItemHeaderClick(PostSubjectItem item);

    public abstract String onItemHeaderModuleName();

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onLeftButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        localLogPause();
        InterfaceC23404a interfaceC23404a = this.mFeedVideoManager;
        if (interfaceC23404a != null) {
            interfaceC23404a.mo92946b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.m97802h(permissions, "permissions");
        Intrinsics.m97802h(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == FileHelper.f55226a.m71367l()) {
            if (grantResults.length > 1 && grantResults[0] == 0 && grantResults[1] == 0) {
                PostSaveHelper.f57808a.m74907e(this.postItem);
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

    @Override // com.transsion.baseui.fragment.LazyFragment, com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        InterfaceC23404a interfaceC23404a;
        super.onResume();
        if (isVisible() && (interfaceC23404a = this.mFeedVideoManager) != null) {
            interfaceC23404a.mo92947c();
        }
        String strM73018e = NegativeFeedbackHelper.f56361a.m73018e();
        if (strM73018e != null) {
            removePost(strM73018e);
            checkToShowEmptyView();
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

    public void openRoomDetail(PostSubjectItem item) {
        Group group;
        String groupId;
        if (item == null || (group = item.getGroup()) == null || (groupId = group.getGroupId()) == null) {
            return;
        }
        Navigator.m61845x(TheRouter.m61773c("/room/detail").m61857K("id", groupId), requireContext(), null, 2, null);
    }

    public void openSubjectDetail(PostSubjectItem item) {
        Subject subject;
        if (item == null || (subject = item.getSubject()) == null) {
            return;
        }
        Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
        Integer subjectType = subject.getSubjectType();
        Navigator.m61845x(navigatorM61773c.m61852F("subject_type", subjectType != null ? subjectType.intValue() : SubjectType.MOVIE.getValue()).m61857K("id", subject.getSubjectId()).m61857K("ops", subject.getOps()), requireContext(), null, 2, null);
    }

    public void openUserCenter(PostSubjectItem item) {
        User user;
        if (item == null || (user = item.getUser()) == null) {
            return;
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(user.getUserId());
        userInfo.setAvatar(user.getAvatar());
        userInfo.setUsername(user.getUsername());
        userInfo.setNickname(user.getNickname());
        Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", userInfo.getUserId()), requireContext(), null, 2, null);
    }

    public abstract String pageName();

    public abstract PostAdapterFrom postAdapterFrom();

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        C16985i c16985i = this.mAdapter;
        List<Object> data = c16985i != null ? c16985i.getData() : null;
        boolean z11 = data == null || data.isEmpty();
        if (z11) {
            showLoadingView();
        }
        loadData$default(this, false, z11, 1, null);
    }

    protected final void setMAdapter(C16985i c16985i) {
        this.mAdapter = c16985i;
    }

    protected final void setMDetailViewModel(PostDetailViewModel postDetailViewModel) {
        this.mDetailViewModel = postDetailViewModel;
    }

    protected final void setMExposureHelper(C28117b c28117b) {
        this.mExposureHelper = c28117b;
    }

    protected final void setMGroupId(String str) {
        this.mGroupId = str;
    }

    protected final void setMPage(String str) {
        this.mPage = str;
    }

    protected final void setMPageFrom(String str) {
        this.mPageFrom = str;
    }

    protected final void setMParentTypeName(String str) {
        this.mParentTypeName = str;
    }

    protected final void setMPerPage(int i11) {
        this.mPerPage = i11;
    }

    protected final void setMTopTab(RoomTabItem roomTabItem) {
        this.mTopTab = roomTabItem;
    }

    protected final void setMViewModel(RoomPostViewModel roomPostViewModel) {
        this.mViewModel = roomPostViewModel;
    }

    public final void setOnNumNotExposureListener(InterfaceC5120q listener) {
        Intrinsics.m97802h(listener, "listener");
        C28117b c28117b = this.mExposureHelper;
        if (c28117b != null) {
            c28117b.m109201p(listener);
        }
    }

    public abstract String subpageName();

    public abstract int tabIndex();

    /* JADX WARN: Multi-variable type inference failed */
    public void updateData(PostSubjectBean bean) {
        List<PostSubjectItem> items;
        PostSubjectItem postSubjectItem;
        String ops;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        List<Object> arrayList;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        C27941f c27941fM36186h3;
        List<PostSubjectItem> items2;
        C27941f c27941fM36186h4;
        C16985i c16985i;
        C27941f c27941fM36186h5;
        C27941f c27941fM36186h6;
        C16985i c16985i2;
        C27941f c27941fM36186h7;
        FrameLayout root;
        SwipeRefreshLayout swipeRefreshLayout;
        C28170q c28170q;
        SwipeRefreshLayout swipeRefreshLayout2;
        HashMap mapM96844g3;
        C24655b logViewConfig = getLogViewConfig();
        if ((logViewConfig == null || (mapM96844g3 = logViewConfig.m96844g()) == null || !mapM96844g3.containsKey("ops")) && bean != null && (items = bean.getItems()) != null && (postSubjectItem = (PostSubjectItem) CollectionsKt.m97361k0(items)) != null && (ops = postSubjectItem.getOps()) != null) {
            C24655b logViewConfig2 = getLogViewConfig();
            if (logViewConfig2 != null && (mapM96844g2 = logViewConfig2.m96844g()) != null) {
            }
            if (getParentFragment() instanceof PageStatusFragment) {
                Fragment parentFragment = getParentFragment();
                Intrinsics.m97800f(parentFragment, "null cannot be cast to non-null type com.transsion.baseui.fragment.PageStatusFragment<*>");
                C24655b logViewConfig3 = ((PageStatusFragment) parentFragment).getLogViewConfig();
                if (logViewConfig3 != null && (mapM96844g = logViewConfig3.m96844g()) != null) {
                }
            }
        }
        Function0<Unit> function0 = this.mRefreshResultCallback;
        if (function0 != null) {
            function0.invoke();
        }
        showContentView();
        C28170q c28170q2 = (C28170q) getMViewBinding();
        if (c28170q2 != null && (swipeRefreshLayout = c28170q2.f86595c) != null && swipeRefreshLayout.isRefreshing() && (c28170q = (C28170q) getMViewBinding()) != null && (swipeRefreshLayout2 = c28170q.f86595c) != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        C16985i c16985i3 = this.mAdapter;
        if (c16985i3 == null || (arrayList = c16985i3.getData()) == null) {
            arrayList = new ArrayList<>();
        }
        if (bean == null || (items2 = bean.getItems()) == null || items2.isEmpty()) {
            if (arrayList.isEmpty()) {
                checkToShowEmptyView();
                return;
            }
            C16985i c16985i4 = this.mAdapter;
            if ((c16985i4 == null || (c27941fM36186h3 = c16985i4.m36186h0()) == null || !c27941fM36186h3.m108666r()) ? false : true) {
                PostSubjectItem postSubjectItem2 = (PostSubjectItem) CollectionsKt.m97372v0(arrayList);
                if (postSubjectItem2 != null && postSubjectItem2.isRoomCache()) {
                    C16985i c16985i5 = this.mAdapter;
                    if (c16985i5 == null || (c27941fM36186h2 = c16985i5.m36186h0()) == null) {
                        return;
                    }
                    c27941fM36186h2.m108667s();
                    return;
                }
                if ((bean != null ? bean.getPager() : null) != null) {
                    Pager pager = bean.getPager();
                    if (!(pager != null ? Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE) : false)) {
                        C16985i c16985i6 = this.mAdapter;
                        if (c16985i6 == null || (c27941fM36186h1 = c16985i6.m36186h0()) == null) {
                            return;
                        }
                        C27941f.m108652u(c27941fM36186h1, false, 1, null);
                        return;
                    }
                }
                C16985i c16985i7 = this.mAdapter;
                if (c16985i7 == null || (c27941fM36186h0 = c16985i7.m36186h0()) == null) {
                    return;
                }
                c27941fM36186h0.m108669v();
                return;
            }
            return;
        }
        InterfaceC4393e parentFragment2 = getParentFragment();
        if (parentFragment2 instanceof InterfaceC23416g) {
            ((InterfaceC23416g) parentFragment2).mo76971P();
        }
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null) {
            logViewConfig4.m96848k(true);
        }
        Pager pager2 = bean.getPager();
        this.mPage = pager2 != null ? pager2.getNextPage() : null;
        if (bean.getSubject() != null) {
            this.mSubject = bean.getSubject();
        }
        if (bean.getGroup() != null) {
            this.mGroup = bean.getGroup();
        }
        if (bean.getIsRefresh()) {
            C16985i c16985i8 = this.mAdapter;
            if (c16985i8 != null) {
                c16985i8.mo36201n1(bean.getItems());
            }
            C28170q c28170q3 = (C28170q) getMViewBinding();
            if (c28170q3 != null && (root = c28170q3.getRoot()) != null) {
                root.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.a4
                    @Override // java.lang.Runnable
                    public final void run() {
                        RoomPostBaseFragment.updateData$lambda$39(this.f57287a);
                    }
                });
            }
        } else {
            List<PostSubjectItem> items3 = bean.getItems();
            if (items3 != null) {
                if (this instanceof RoomPostExploreFragment) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : items3) {
                        PostSubjectItem postSubjectItem3 = (PostSubjectItem) obj;
                        if (postSubjectItem3.getGroup() != null || postSubjectItem3.isRoomCacheListStart() || postSubjectItem3.isRoomCacheListEnd()) {
                            arrayList2.add(obj);
                        }
                    }
                    items3 = arrayList2;
                }
                ArrayList arrayList3 = new ArrayList();
                if (arrayList.isEmpty()) {
                    for (PostSubjectItem postSubjectItem4 : items3) {
                        Subject subject = this.mSubject;
                        if (subject != null) {
                            postSubjectItem4.setSubject(subject);
                        }
                        Group group = this.mGroup;
                        if (group != null) {
                            postSubjectItem4.setGroup(group);
                        }
                    }
                    arrayList3.addAll(items3);
                } else {
                    for (PostSubjectItem postSubjectItem5 : items3) {
                        if (!arrayList.contains(postSubjectItem5)) {
                            Subject subject2 = this.mSubject;
                            if (subject2 != null) {
                                postSubjectItem5.setSubject(subject2);
                            }
                            Group group2 = this.mGroup;
                            if (group2 != null) {
                                postSubjectItem5.setGroup(group2);
                            }
                            arrayList3.add(postSubjectItem5);
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    C16985i c16985i9 = this.mAdapter;
                    if (c16985i9 != null && (c27941fM36186h4 = c16985i9.m36186h0()) != null) {
                        C27941f.m108652u(c27941fM36186h4, false, 1, null);
                    }
                    if (arrayList.isEmpty()) {
                        checkToShowEmptyView();
                    }
                } else {
                    C16985i c16985i10 = this.mAdapter;
                    if (c16985i10 != null) {
                        c16985i10.mo36208q(arrayList3);
                    }
                }
            }
        }
        C16985i c16985i11 = this.mAdapter;
        if (c16985i11 != null && (c27941fM36186h6 = c16985i11.m36186h0()) != null && c27941fM36186h6.m108666r() && (c16985i2 = this.mAdapter) != null && (c27941fM36186h7 = c16985i2.m36186h0()) != null) {
            c27941fM36186h7.m108667s();
        }
        if (bean.getPager() != null) {
            Pager pager3 = bean.getPager();
            if ((pager3 != null ? Intrinsics.m97797c(pager3.getHasMore(), Boolean.TRUE) : false) || (c16985i = this.mAdapter) == null || (c27941fM36186h5 = c16985i.m36186h0()) == null) {
                return;
            }
            C27941f.m108652u(c27941fM36186h5, false, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateRoomCacheData(int position, PostSubjectBean bean) {
        List<Object> arrayList;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        Pager pager;
        C27941f c27941fM36186h2;
        List<PostSubjectItem> items;
        C27941f c27941fM36186h3;
        C16985i c16985i;
        C27941f c27941fM36186h4;
        C27941f c27941fM36186h5;
        C16985i c16985i2;
        C27941f c27941fM36186h6;
        FrameLayout root;
        SwipeRefreshLayout swipeRefreshLayout;
        C28170q c28170q;
        SwipeRefreshLayout swipeRefreshLayout2;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        Function0<Unit> function0 = this.mRefreshResultCallback;
        if (function0 != null) {
            function0.invoke();
        }
        showContentView();
        C28170q c28170q2 = (C28170q) getMViewBinding();
        if (c28170q2 != null && (swipeRefreshLayout = c28170q2.f86595c) != null && swipeRefreshLayout.isRefreshing() && (c28170q = (C28170q) getMViewBinding()) != null && (swipeRefreshLayout2 = c28170q.f86595c) != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        C16985i c16985i3 = this.mAdapter;
        if (c16985i3 == null || (arrayList = c16985i3.getData()) == null) {
            arrayList = new ArrayList<>();
        }
        if (bean == null || (items = bean.getItems()) == null || items.isEmpty()) {
            if (arrayList.isEmpty()) {
                checkToShowEmptyView();
                return;
            }
            C16985i c16985i4 = this.mAdapter;
            if ((c16985i4 == null || (c27941fM36186h2 = c16985i4.m36186h0()) == null || !c27941fM36186h2.m108666r()) ? false : true) {
                if ((bean == null || (pager = bean.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE)) {
                    C16985i c16985i5 = this.mAdapter;
                    if (c16985i5 == null || (c27941fM36186h0 = c16985i5.m36186h0()) == null) {
                        return;
                    }
                    c27941fM36186h0.m108669v();
                    return;
                }
                C16985i c16985i6 = this.mAdapter;
                if (c16985i6 == null || (c27941fM36186h1 = c16985i6.m36186h0()) == null) {
                    return;
                }
                C27941f.m108652u(c27941fM36186h1, false, 1, null);
                return;
            }
            return;
        }
        Pager pager2 = bean.getPager();
        this.mPage = pager2 != null ? pager2.getNextPage() : null;
        if (bean.getSubject() != null) {
            this.mSubject = bean.getSubject();
        }
        if (bean.getGroup() != null) {
            this.mGroup = bean.getGroup();
        }
        if (bean.getIsRefresh()) {
            C16985i c16985i7 = this.mAdapter;
            if (c16985i7 != null) {
                c16985i7.mo36201n1(bean.getItems());
            }
            C28170q c28170q3 = (C28170q) getMViewBinding();
            if (c28170q3 != null && (root = c28170q3.getRoot()) != null) {
                root.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.d4
                    @Override // java.lang.Runnable
                    public final void run() {
                        RoomPostBaseFragment.updateRoomCacheData$lambda$47(this.f57314a);
                    }
                });
            }
        } else {
            List<PostSubjectItem> items2 = bean.getItems();
            if (items2 != null) {
                if (this instanceof RoomPostExploreFragment) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : items2) {
                        PostSubjectItem postSubjectItem = (PostSubjectItem) obj;
                        if (postSubjectItem.getGroup() != null || postSubjectItem.isRoomCacheListStart() || postSubjectItem.isRoomCacheListEnd()) {
                            arrayList2.add(obj);
                        }
                    }
                    items2 = arrayList2;
                }
                if (items2.isEmpty()) {
                    C16985i c16985i8 = this.mAdapter;
                    if (c16985i8 != null && (c27941fM36186h3 = c16985i8.m36186h0()) != null) {
                        C27941f.m108652u(c27941fM36186h3, false, 1, null);
                    }
                    if (arrayList.isEmpty()) {
                        checkToShowEmptyView();
                    }
                } else {
                    int i11 = position + 1;
                    C16985i c16985i9 = this.mAdapter;
                    if (i11 < (c16985i9 != null ? c16985i9.getItemCount() : 0)) {
                        C16985i c16985i10 = this.mAdapter;
                        if (c16985i10 != null) {
                            c16985i10.mo36202o(i11, items2);
                        }
                    } else {
                        C16985i c16985i11 = this.mAdapter;
                        if (c16985i11 != null) {
                            if (position < 0) {
                                position = 0;
                            }
                            c16985i11.mo36202o(position, items2);
                        }
                    }
                }
            }
        }
        C16985i c16985i12 = this.mAdapter;
        if (c16985i12 != null && (c27941fM36186h5 = c16985i12.m36186h0()) != null && c27941fM36186h5.m108666r() && (c16985i2 = this.mAdapter) != null && (c27941fM36186h6 = c16985i2.m36186h0()) != null) {
            c27941fM36186h6.m108667s();
        }
        Pager pager3 = bean.getPager();
        if ((pager3 != null ? Intrinsics.m97797c(pager3.getHasMore(), Boolean.TRUE) : false) || (c16985i = this.mAdapter) == null || (c27941fM36186h4 = c16985i.m36186h0()) == null) {
            return;
        }
        C27941f.m108652u(c27941fM36186h4, false, 1, null);
    }
}
