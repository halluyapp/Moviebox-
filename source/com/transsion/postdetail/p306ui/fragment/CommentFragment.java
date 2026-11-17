package com.transsion.postdetail.p306ui.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5786f0;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.p282tn.lib.net.bean.BaseDto;
import com.p282tn.lib.view.DefaultView;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.moviedetailapi.bean.CommentBean;
import com.transsion.ninegridview.preview.GifImagePreviewActivity;
import com.transsion.postdetail.R$drawable;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.bean.CommentBody;
import com.transsion.postdetail.bean.CommentLikeBean;
import com.transsion.postdetail.bean.CommentLikeBody;
import com.transsion.postdetail.bean.CommentListBean;
import com.transsion.postdetail.bean.Pager;
import com.transsion.postdetail.comment.C16740m;
import com.transsion.postdetail.comment.C16741n;
import com.transsion.postdetail.comment.C16748u;
import com.transsion.postdetail.comment.CommentDeleteDialogFragment;
import com.transsion.postdetail.comment.DialogC16731g;
import com.transsion.postdetail.comment.InterfaceC16732g0;
import com.transsion.postdetail.comment.InterfaceC16736i0;
import com.transsion.postdetail.comment.SocialStatus;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.postdetail.util.C17442l;
import com.transsion.postdetail.viewmodel.CommentViewModel;
import com.transsion.postdetailapi.CommentTopicType;
import com.transsion.publish.api.PhotoEntity;
import com.transsion.publish.p307ui.SelectImageActivity;
import com.transsion.upload.bean.UploadFileType;
import com.transsion.upload.bean.UploadTstTokenStorageType;
import com.transsion.web.api.WebConstants;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gp.InterfaceC23623a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p393f.C23284j;
import p441gz.InterfaceC23704a;
import p465hp.C23889b;
import p497iw.C24233c;
import p497iw.InterfaceC24231a;
import p697q6.InterfaceC27022a;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p816uo.C28029a;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p844vo.C28154i;
import p888wy.C28465b;
import p944yh.C28951b;
import pg.C26866a;
import to.C27837a;
import to.C27838b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ë\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002y|B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0007J\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0007J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0007J#\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u0019J\u000f\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\u0007J\u0019\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b!\u0010\u0013J'\u0010&\u001a\u00020\b2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010\u0007J#\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102JO\u00109\u001a\u00020\b2\u0006\u00103\u001a\u00020\u001026\u00108\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\b04H\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010=\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ!\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020C2\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020\b2\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020(H\u0016¢\u0006\u0004\bI\u0010*J\u0017\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ%\u0010O\u001a\u00020\b2\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b\u0018\u00010NH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\bH\u0016¢\u0006\u0004\bQ\u0010\u0007J\u0017\u0010S\u001a\u00020(2\b\u0010R\u001a\u0004\u0018\u00010#¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\bH\u0016¢\u0006\u0004\bU\u0010\u0007J\u000f\u0010V\u001a\u00020\bH\u0016¢\u0006\u0004\bV\u0010\u0007J\u0017\u0010W\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bW\u0010\u0013J#\u0010[\u001a\u00020\b2\b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010Z\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\bH\u0016¢\u0006\u0004\b]\u0010\u0007J1\u0010d\u001a\u00020\b2\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`2\u0006\u0010c\u001a\u00020`H\u0016¢\u0006\u0004\bd\u0010eJ\u0019\u0010f\u001a\u00020\b2\b\u0010R\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\bf\u0010gJ\u0019\u0010h\u001a\u00020\b2\b\u0010R\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\bh\u0010gJI\u0010j\u001a\u00020\b2:\u00108\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b( \u0012\u0015\u0012\u0013\u0018\u00010(¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(i\u0012\u0004\u0012\u00020\b04¢\u0006\u0004\bj\u0010kJ\u0019\u0010l\u001a\u00020\b2\b\u0010R\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\bl\u0010gJ\u0019\u0010m\u001a\u00020\b2\b\u0010R\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\bm\u0010gJ\u001f\u0010p\u001a\u00020\b2\u0006\u0010o\u001a\u00020n2\u0006\u0010c\u001a\u00020`H\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\b2\b\u0010R\u001a\u0004\u0018\u00010#¢\u0006\u0004\br\u0010gJ\u000f\u0010s\u001a\u00020\bH\u0016¢\u0006\u0004\bs\u0010\u0007J\u0017\u0010u\u001a\u00020\b2\u0006\u0010t\u001a\u00020(H\u0016¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\bH\u0016¢\u0006\u0004\bw\u0010\u0007R\u0018\u0010{\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010~\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R,\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bO\u0010\u0090\u0001R\u001b\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001b\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010\u0096\u0001R'\u0010\u009a\u0001\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009c\u0001R\u0019\u0010¢\u0001\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0019\u0010¤\u0001\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¡\u0001R\u0019\u0010§\u0001\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010©\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010}R\u0018\u0010«\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010}R\u0018\u0010\u00ad\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010}R\u0019\u0010Z\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bI\u0010®\u0001R\u0017\u0010¯\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010}R\u0018\u0010°\u0001\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bG\u0010¡\u0001R\u0019\u0010²\u0001\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010¦\u0001R#\u0010¸\u0001\u001a\u0005\u0018\u00010³\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R*\u0010½\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¹\u0001\u0010\u009c\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0005\b¼\u0001\u0010\u0013R,\u0010Å\u0001\u001a\u0005\u0018\u00010¾\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R\u001c\u0010É\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001e\u0010Í\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010 \u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bh\u0010\u009c\u0001R\u001b\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010\u009c\u0001R\u001b\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010\u009c\u0001R\u001b\u0010Ó\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010\u009c\u0001R\u001b\u0010Õ\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010\u009c\u0001R\u001a\u0010Ö\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b]\u0010\u009c\u0001R\u001b\u0010Ø\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010\u009c\u0001R\u001a\u0010Ù\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bl\u0010\u009c\u0001R#\u0010Ý\u0001\u001a\f\u0012\u0005\u0012\u00030Û\u0001\u0018\u00010Ú\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010Ü\u0001R\u0018\u0010Þ\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010}R\u001b\u0010á\u0001\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u0019\u0010ã\u0001\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010¦\u0001R3\u0010æ\u0001\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u001c\u0010ê\u0001\u001a\u0005\u0018\u00010ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001¨\u0006ì\u0001"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/CommentFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lvo/i;", "Lcom/transsion/postdetail/comment/i0;", "Lcom/transsion/postdetail/comment/g0;", "Lgp/a;", "<init>", "()V", "", "initAdapter", "initExposureHelper", "I0", "initViewModel", "j1", "loadData", "W0", "", "txt", "S0", "(Ljava/lang/String;)V", "showEmpty", "f1", "Lcom/transsion/postdetail/bean/CommentListBean;", "data", "B0", "(Lcom/transsion/postdetail/bean/CommentListBean;)V", "F0", "postId", "a1", "(Ljava/lang/String;Lcom/transsion/postdetail/bean/CommentListBean;)V", "k1", "R0", "commentId", "i1", "Ljava/util/ArrayList;", "Lcom/transsion/moviedetailapi/bean/CommentBean;", "Lkotlin/collections/ArrayList;", "list", "D0", "(Ljava/util/ArrayList;)V", "", "checkLogin", "()Z", "h1", "moduleName", "X0", "(Ljava/lang/String;Ljava/lang/String;)V", "Lhp/b;", "operationMenu", "C0", "(Lhp/b;)V", "path", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "bucket", "callback", "l1", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "G0", "(Landroid/view/LayoutInflater;)Lvo/i;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "t", "(Landroid/view/View;)V", CampaignEx.JSON_KEY_AD_R, "", "commentCount", "updateCommentCount", "(J)V", "Lkotlin/Function1;", "f", "(Lkotlin/jvm/functions/Function1;)V", "lazyLoadData", WebConstants.FIELD_ITEM, "d1", "(Lcom/transsion/moviedetailapi/bean/CommentBean;)Z", "startLoading", "hideLoading", "E0", "Landroid/text/Editable;", MimeTypes.BASE_TYPE_TEXT, "replyItem", "T", "(Landroid/text/Editable;Lcom/transsion/moviedetailapi/bean/CommentBean;)V", "F", "", "s", "", "start", "before", "count", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "R", "(Lcom/transsion/moviedetailapi/bean/CommentBean;)V", "A", "likeStatu", "Z0", "(Lkotlin/jvm/functions/Function2;)V", "H", "Q", "Lto/a;", "info", "h", "(Lto/a;I)V", "c1", "onPause", "hidden", "onHiddenChanged", "(Z)V", "onDestroyView", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "mCommentList", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Z", "mNeedUpdate", "Lcom/transsion/postdetail/comment/n;", "c", "Lcom/transsion/postdetail/comment/n;", "mCommentExpandAdapter", "Lcom/transsion/postdetail/comment/m;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/postdetail/comment/m;", "getMCommentEditInputViewHelper", "()Lcom/transsion/postdetail/comment/m;", "setMCommentEditInputViewHelper", "(Lcom/transsion/postdetail/comment/m;)V", "mCommentEditInputViewHelper", "Lcom/transsion/postdetail/util/l;", "e", "Lcom/transsion/postdetail/util/l;", "mSoftKeyBoardListener", "Lcom/transsion/postdetail/comment/g;", "Lcom/transsion/postdetail/comment/g;", "mCommentEditInputDialog", "g", "Lcom/transsion/postdetail/bean/CommentListBean;", "mMsgData", "Lcom/transsion/postdetail/viewmodel/CommentViewModel;", "Lcom/transsion/postdetail/viewmodel/CommentViewModel;", "mCommentViewModel", "i", "Lkotlin/jvm/functions/Function1;", "loadResultCallback", "j", "Ljava/lang/String;", "topicId", CampaignEx.JSON_KEY_AD_K, "topicType", "l", "I", "page", "m", "mPerPage", "n", "J", "mCommentCount", "o", "mShowDownload", TtmlNode.TAG_P, "mFromDetail", CampaignEx.JSON_KEY_AD_Q, "isNeedCloseInput", "Lcom/transsion/moviedetailapi/bean/CommentBean;", "replyLoading", "showCommentCount", TmcStartParams.KEY_URL_SHORT, "lastCreatedTime", "Lgz/a;", "v", "Lkotlin/Lazy;", "getLoginApi", "()Lgz/a;", "loginApi", "w", "getImagePath", "()Ljava/lang/String;", "setImagePath", "imagePath", "Lcom/transsion/postdetail/ui/fragment/CommentFragment$b;", "x", "Lcom/transsion/postdetail/ui/fragment/CommentFragment$b;", "getOnCommentCountChangedListener", "()Lcom/transsion/postdetail/ui/fragment/CommentFragment$b;", "b1", "(Lcom/transsion/postdetail/ui/fragment/CommentFragment$b;)V", "onCommentCountChangedListener", "Lvj/b;", "y", "Lvj/b;", "exposureHelper", "", "z", "Ljava/util/Set;", "exposedCommentIds", "B", "pageFrom", "C", "trackId", "D", "previousTrackId", "E", "previousPageVideoId", "ugcVideoId", "G", "pageName", "collectionId", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "Landroidx/activity/result/b;", "loginLaunch", "isNeedShowLoginActivity", "K", "Landroid/text/Editable;", "mText", "L", "mPostClickTime", "M", "Lkotlin/jvm/functions/Function2;", "mCommentCallback", "Lcom/transsion/postdetail/comment/CommentDeleteDialogFragment;", "N", "Lcom/transsion/postdetail/comment/CommentDeleteDialogFragment;", "mCommentDeleteDialog", "O", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class CommentFragment extends BaseFragment<C28154i> implements InterfaceC16736i0, InterfaceC16732g0, InterfaceC23623a {

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private String commentId;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private String trackId;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private String previousTrackId;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private String previousPageVideoId;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private String ugcVideoId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private String collectionId;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private AbstractC0249b loginLaunch;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean isNeedShowLoginActivity;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private Editable mText;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private long mPostClickTime;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private Function2 mCommentCallback;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private CommentDeleteDialogFragment mCommentDeleteDialog;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private RecyclerView mCommentList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean mNeedUpdate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C16741n mCommentExpandAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C16740m mCommentEditInputViewHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C17442l mSoftKeyBoardListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private DialogC16731g mCommentEditInputDialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private CommentListBean mMsgData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private CommentViewModel mCommentViewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Function1 loadResultCallback;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String topicId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private long mCommentCount;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean mFromDetail;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean isNeedCloseInput;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private CommentBean replyItem;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean replyLoading;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int showCommentCount;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private long lastCreatedTime;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private String imagePath;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private InterfaceC17008b onCommentCountChangedListener;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private C28117b exposureHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String topicType = CommentTopicType.POST.getValue();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int page = 1;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int mPerPage = 10;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean mShowDownload = true;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final Lazy loginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CommentFragment.m73988T0();
        }
    });

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final Set exposedCommentIds = new LinkedHashSet();

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.CommentFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final CommentFragment m74039a(String str, String str2, long j11, boolean z11, boolean z12, String commentId, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            Intrinsics.m97802h(commentId, "commentId");
            CommentFragment commentFragment = new CommentFragment();
            Bundle bundle = new Bundle();
            bundle.putString(GifImagePreviewActivity.POST_ID, str);
            bundle.putString("TOPIC_TYPE", str2);
            bundle.putLong("comment_count", j11);
            bundle.putBoolean("show_download", z11);
            bundle.putBoolean("from_detail", z12);
            bundle.putString(WebConstants.PAGE_FROM, str3);
            if (commentId.length() > 0) {
                bundle.putString("comment_id", commentId);
            }
            bundle.putString("TRACK_ID", str4);
            bundle.putString("PREVIOUS_TRACK_ID", str5);
            bundle.putString("PREVIOUS_PAGE_VIDEO_ID", str6);
            bundle.putString("UGC_VIDEO_ID", str7);
            bundle.putString("PAGE_NAME", str8);
            bundle.putString("COLLECTION_ID", str9);
            commentFragment.setArguments(bundle);
            return commentFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.CommentFragment$b */
    public interface InterfaceC17008b {
        /* JADX INFO: renamed from: a */
        void mo74040a(long j11);
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.CommentFragment$c */
    public static final class C17009c implements InterfaceC28116a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f57100b;

        C17009c(String str) {
            this.f57100b = str;
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            String commentId;
            CommentFragment commentFragment = CommentFragment.this;
            String str = this.f57100b;
            try {
                Result.Companion companion = Result.INSTANCE;
                C16741n c16741n = commentFragment.mCommentExpandAdapter;
                if (c16741n != null && i11 >= 0 && i11 < c16741n.getItemCount()) {
                    Object objM36182f0 = c16741n.m36182f0(i11);
                    CommentBean commentBean = objM36182f0 instanceof CommentBean ? (CommentBean) objM36182f0 : null;
                    if (commentBean != null && (commentId = commentBean.getCommentId()) != null && !commentFragment.exposedCommentIds.contains(commentId)) {
                        commentFragment.exposedCommentIds.add(commentId);
                        C16768a.f56378a.m73072g(str, i11, j11, commentId, commentFragment.topicId, commentBean.isSubComment() ? "reply" : "main", commentFragment.pageFrom, commentFragment.trackId, commentFragment.previousTrackId, commentFragment.previousPageVideoId, commentFragment.ugcVideoId, commentFragment.collectionId);
                    }
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.CommentFragment$d */
    public static final class C17010d implements InterfaceC27288n {
        C17010d() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            C16741n c16741n = CommentFragment.this.mCommentExpandAdapter;
            if (c16741n == null || !c16741n.m36209q0()) {
                return;
            }
            CommentFragment.this.loadData();
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.CommentFragment$e */
    public static final class C17011e implements C17442l.a {
        C17011e() {
        }

        @Override // com.transsion.postdetail.util.C17442l.a
        /* JADX INFO: renamed from: a */
        public void mo74041a(int i11) {
            DialogC16731g dialogC16731g = CommentFragment.this.mCommentEditInputDialog;
            if (dialogC16731g != null) {
                CommentFragment commentFragment = CommentFragment.this;
                if (dialogC16731g.isShowing() && commentFragment.isNeedCloseInput) {
                    dialogC16731g.dismiss();
                }
            }
        }

        @Override // com.transsion.postdetail.util.C17442l.a
        /* JADX INFO: renamed from: b */
        public void mo74042b(int i11) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.CommentFragment$f */
    public static final class C17012f implements CommentDeleteDialogFragment.InterfaceC16716b {
        C17012f() {
        }

        @Override // com.transsion.postdetail.comment.CommentDeleteDialogFragment.InterfaceC16716b
        /* JADX INFO: renamed from: a */
        public void mo72828a(String str) {
            CommentFragment.this.m74029E0(str);
            CommentFragment.this.m73992X0("delete_comment", str);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.CommentFragment$g */
    public static final class C17013g implements InterfaceC24231a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function2 f57104a;

        C17013g(Function2 function2) {
            this.f57104a = function2;
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: a */
        public void mo73889a(String localFilePath, long j11, long j12) {
            Intrinsics.m97802h(localFilePath, "localFilePath");
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: b */
        public void mo73890b(String localFilePath, String url, String bucket) {
            Intrinsics.m97802h(localFilePath, "localFilePath");
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(bucket, "bucket");
            this.f57104a.invoke(url, bucket);
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: c */
        public void mo73891c(String str, String str2, String str3, UploadTstTokenStorageType uploadTstTokenStorageType) {
            C26866a.a.m104899g(C26866a.f81698a, "uploadKey: " + str + "; clientMessage:" + str2 + "; serviceMessage: " + str3, false, 2, null);
        }
    }

    /* JADX INFO: renamed from: B0 */
    private final void m73972B0(CommentListBean data) {
        List<CommentBean> commentList;
        Pager pager;
        Pager pager2;
        Integer perPage;
        m74012k1(this.mMsgData);
        this.mPerPage = (data == null || (pager2 = data.getPager()) == null || (perPage = pager2.getPerPage()) == null) ? 10 : perPage.intValue();
        C16741n c16741n = this.mCommentExpandAdapter;
        boolean z11 = false;
        if (c16741n != null) {
            if (c16741n.m36186h0().m108666r()) {
                c16741n.m36186h0().m108667s();
            }
            if ((data == null || (pager = data.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.FALSE)) {
                c16741n.m36186h0().m108668t(false);
            }
        }
        if (data != null && (commentList = data.getCommentList()) != null) {
            for (CommentBean commentBean : commentList) {
                this.showCommentCount += commentBean.getSubCommentCnt() + 1;
                Long createdAt = commentBean.getCreatedAt();
                this.lastCreatedTime = createdAt != null ? createdAt.longValue() : 0L;
            }
        }
        C16741n c16741n2 = this.mCommentExpandAdapter;
        if (c16741n2 != null && c16741n2.getItemCount() == 0) {
            z11 = true;
        }
        if (z11) {
            showEmpty();
        } else {
            m73975F0();
        }
    }

    /* JADX INFO: renamed from: C0 */
    private final void m73973C0(C23889b operationMenu) {
        C16740m c16740mM72873h;
        List listM94624h = operationMenu.m94624h();
        if (listM94624h == null || listM94624h.isEmpty()) {
            return;
        }
        this.imagePath = ((PhotoEntity) listM94624h.get(0)).getLocalPath();
        PhotoEntity photoEntity = (PhotoEntity) listM94624h.get(0);
        DialogC16731g dialogC16731g = this.mCommentEditInputDialog;
        if (dialogC16731g == null || (c16740mM72873h = dialogC16731g.m72873h()) == null) {
            return;
        }
        c16740mM72873h.m72918w(photoEntity);
    }

    /* JADX INFO: renamed from: D0 */
    private final void m73974D0(ArrayList list) {
        int i11;
        int i12;
        List<CommentBean> subComments;
        List<CommentBean> commentList;
        List<CommentBean> commentList2;
        List<CommentBean> commentList3;
        List<CommentBean> commentList4;
        List<CommentBean> commentList5;
        List<CommentBean> commentList6;
        CommentListBean commentListBean = this.mMsgData;
        if (commentListBean != null) {
            if ((commentListBean != null && (commentList6 = commentListBean.getCommentList()) != null && commentList6.isEmpty()) || list == null || list.isEmpty()) {
                return;
            }
            int i13 = 0;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.m97515u();
                }
                CommentBean commentBean = (CommentBean) obj;
                CommentListBean commentListBean2 = this.mMsgData;
                if (commentListBean2 == null || (commentList5 = commentListBean2.getCommentList()) == null) {
                    i11 = -1;
                    i12 = -1;
                } else {
                    int i15 = 0;
                    i11 = -1;
                    i12 = -1;
                    for (Object obj2 : commentList5) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            CollectionsKt.m97515u();
                        }
                        CommentBean commentBean2 = (CommentBean) obj2;
                        String commentId = commentBean.getCommentId();
                        if (TextUtils.equals(commentBean2.getCommentId(), commentId)) {
                            i11 = i15;
                        } else {
                            List<CommentBean> subComments2 = commentBean2.getSubComments();
                            if (subComments2 != null) {
                                int i17 = 0;
                                for (Object obj3 : subComments2) {
                                    int i18 = i17 + 1;
                                    if (i17 < 0) {
                                        CollectionsKt.m97515u();
                                    }
                                    CommentBean commentBean3 = (CommentBean) obj3;
                                    if (TextUtils.equals(commentId, commentBean3 != null ? commentBean3.getCommentId() : null)) {
                                        i11 = i15;
                                        i12 = i17;
                                    }
                                    i17 = i18;
                                }
                            }
                        }
                        i15 = i16;
                    }
                }
                if (i11 != -1 || i12 != -1) {
                    if (i11 == -1 || i12 != -1) {
                        CommentListBean commentListBean3 = this.mMsgData;
                        Integer numValueOf = (commentListBean3 == null || (commentList2 = commentListBean3.getCommentList()) == null) ? null : Integer.valueOf(commentList2.size());
                        Intrinsics.m97799e(numValueOf);
                        if (numValueOf.intValue() >= i11) {
                            CommentListBean commentListBean4 = this.mMsgData;
                            CommentBean commentBean4 = (commentListBean4 == null || (commentList = commentListBean4.getCommentList()) == null) ? null : commentList.get(i11);
                            CommentBean commentBeanRemove = (commentBean4 == null || (subComments = commentBean4.getSubComments()) == null) ? null : subComments.remove(i12);
                            C26866a.a.m104898f(C26866a.f81698a, "deleteComment list:", "remove childMsg:" + (commentBeanRemove != null ? commentBeanRemove.getContent() : null), false, 4, null);
                        } else {
                            C26866a.a.m104898f(C26866a.f81698a, "deleteComment list:", "remove childMsg: index ", false, 4, null);
                        }
                    } else {
                        CommentListBean commentListBean5 = this.mMsgData;
                        Integer numValueOf2 = (commentListBean5 == null || (commentList4 = commentListBean5.getCommentList()) == null) ? null : Integer.valueOf(commentList4.size());
                        Intrinsics.m97799e(numValueOf2);
                        if (numValueOf2.intValue() >= i11) {
                            CommentListBean commentListBean6 = this.mMsgData;
                            CommentBean commentBeanRemove2 = (commentListBean6 == null || (commentList3 = commentListBean6.getCommentList()) == null) ? null : commentList3.remove(i11);
                            C26866a.a.m104898f(C26866a.f81698a, "deleteComment list:", "remove parentsMsg:" + (commentBeanRemove2 != null ? commentBeanRemove2.getContent() : null), false, 4, null);
                        } else {
                            C26866a.a.m104898f(C26866a.f81698a, "deleteComment list:", "remove parentsMsg: index ", false, 4, null);
                        }
                    }
                }
                i13 = i14;
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    private final void m73975F0() {
        LinearLayout linearLayout;
        C28154i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (linearLayout = mViewBinding.f86455d) == null) {
            return;
        }
        AbstractC26006c.m102054g(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m73976H0(CommentFragment commentFragment) {
        commentFragment.m73986R0();
    }

    /* JADX INFO: renamed from: I0 */
    private final void m73977I0() {
        setNetListener(new C17010d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m73978J0(CommentFragment commentFragment, ActivityResult it) {
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() != -1) {
            C26866a.a.m104898f(C26866a.f81698a, "loginStatus", "登录失败或者取消", false, 4, null);
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "loginStatus", "登录成功", false, 4, null);
        C13806h c13806h = C13806h.f49015a;
        InterfaceC23704a loginApi = commentFragment.getLoginApi();
        c13806h.m62325l(loginApi != null ? loginApi.mo90380b() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final Unit m73979K0(CommentFragment commentFragment, C27838b c27838b) {
        List<CommentBean> commentList;
        List<CommentBean> commentList2;
        commentFragment.hideLoading();
        if (c27838b == null) {
            commentFragment.m74012k1(commentFragment.mMsgData);
            return Unit.f75682a;
        }
        CommentListBean commentListBean = commentFragment.mMsgData;
        if (commentListBean == null) {
            commentFragment.m74012k1(commentListBean);
            return Unit.f75682a;
        }
        if (commentListBean != null) {
            CommentListBean commentListBeanM108216b = c27838b.m108216b();
            commentListBean.setPager(commentListBeanM108216b != null ? commentListBeanM108216b.getPager() : null);
        }
        CommentListBean commentListBean2 = commentFragment.mMsgData;
        if (commentListBean2 != null && (commentList = commentListBean2.getCommentList()) != null) {
            for (CommentBean commentBean : commentList) {
                if (Intrinsics.m97797c(commentBean.getCommentId(), c27838b.m108215a().m108208a())) {
                    CommentListBean commentListBeanM108216b2 = c27838b.m108216b();
                    if (commentListBeanM108216b2 != null && (commentList2 = commentListBeanM108216b2.getCommentList()) != null) {
                        List<CommentBean> subComments = commentBean.getSubComments();
                        List<CommentBean> listU0 = subComments != null ? CollectionsKt.m97343U0(subComments) : null;
                        if (listU0 != null) {
                            listU0.addAll(commentList2);
                        }
                        commentBean.setSubComments(listU0);
                        break;
                    }
                    break;
                    break;
                }
            }
        }
        commentFragment.m74012k1(commentFragment.mMsgData);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final Unit m73980L0(final CommentFragment commentFragment, CommentBean commentBean) {
        List<CommentBean> commentList;
        List<Object> data;
        List<CommentBean> arrayList;
        C16740m c16740mM72873h;
        C16740m c16740mM72873h2;
        Editable editableM72911h;
        final int i11 = 0;
        commentFragment.replyLoading = false;
        DialogC16731g dialogC16731g = commentFragment.mCommentEditInputDialog;
        if (dialogC16731g != null) {
            dialogC16731g.m72871f();
        }
        if (commentBean == null) {
            C28951b.f88586a.m111454d(R$string.comment_failed);
            return Unit.f75682a;
        }
        C28951b.f88586a.m111454d(R$string.comment_success);
        DialogC16731g dialogC16731g2 = commentFragment.mCommentEditInputDialog;
        if (dialogC16731g2 != null && (c16740mM72873h2 = dialogC16731g2.m72873h()) != null && (editableM72911h = c16740mM72873h2.m72911h()) != null) {
            editableM72911h.clear();
        }
        DialogC16731g dialogC16731g3 = commentFragment.mCommentEditInputDialog;
        if (dialogC16731g3 != null && (c16740mM72873h = dialogC16731g3.m72873h()) != null) {
            c16740mM72873h.m72916u();
        }
        DialogC16731g dialogC16731g4 = commentFragment.mCommentEditInputDialog;
        if (dialogC16731g4 != null) {
            dialogC16731g4.dismiss();
        }
        if (commentFragment.replyItem != null) {
            commentFragment.mCommentCount++;
            CommentListBean commentListBean = commentFragment.mMsgData;
            if (commentListBean != null && (commentList = commentListBean.getCommentList()) != null) {
                for (CommentBean commentBean2 : commentList) {
                    if (Intrinsics.m97797c(commentBean2.getCommentId(), commentBean.getRootCommentId())) {
                        List<CommentBean> subComments = commentBean2.getSubComments();
                        if (subComments != null) {
                            subComments.add(commentBean);
                        }
                        commentBean2.setSubCommentCnt(commentBean2.getSubCommentCnt() + 1);
                        commentFragment.m74010j1();
                        commentFragment.m74012k1(commentFragment.mMsgData);
                        C16741n c16741n = commentFragment.mCommentExpandAdapter;
                        if (c16741n != null && (data = c16741n.getData()) != null) {
                            for (Object obj : data) {
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    CollectionsKt.m97515u();
                                }
                                if (Intrinsics.m97797c((InterfaceC27022a) obj, commentBean)) {
                                    RecyclerView recyclerView = commentFragment.mCommentList;
                                    if (recyclerView == null) {
                                        break;
                                    }
                                    recyclerView.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.d
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            CommentFragment.m73982N0(this.f57307a, i11);
                                        }
                                    });
                                    break;
                                }
                                i11 = i12;
                            }
                            break;
                        }
                        break;
                        break;
                    }
                }
            }
        } else {
            CommentListBean commentListBean2 = commentFragment.mMsgData;
            if (commentListBean2 == null) {
                commentFragment.mMsgData = new CommentListBean(CollectionsKt.m97502h(commentBean), new Pager(Boolean.FALSE, "2", "1", 10, 1));
            } else {
                if (commentListBean2 != null) {
                    if (commentListBean2 == null || (arrayList = commentListBean2.getCommentList()) == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(0, commentBean);
                    commentListBean2.setCommentList(arrayList);
                }
                commentFragment.mCommentCount++;
            }
            commentFragment.m74010j1();
            commentFragment.m74012k1(commentFragment.mMsgData);
            RecyclerView recyclerView2 = commentFragment.mCommentList;
            if (recyclerView2 != null) {
                recyclerView2.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        CommentFragment.m73981M0(this.f57298a);
                    }
                });
            }
        }
        C28465b c28465bM109954a = C28465b.f87467a.m109954a();
        String commentId = commentBean.getCommentId();
        if (commentId == null) {
            commentId = "";
        }
        c28465bM109954a.m109948d(1, commentId, String.valueOf(commentFragment.mCommentCount), commentFragment.topicId);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m73981M0(CommentFragment commentFragment) {
        RecyclerView.AbstractC4214m layoutManager;
        try {
            RecyclerView recyclerView = commentFragment.mCommentList;
            if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
                return;
            }
            layoutManager.scrollToPosition(0);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m73982N0(CommentFragment commentFragment, int i11) {
        RecyclerView.AbstractC4214m layoutManager;
        try {
            RecyclerView recyclerView = commentFragment.mCommentList;
            if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
                return;
            }
            layoutManager.scrollToPosition(i11);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final Unit m73983O0(CommentLikeBean commentLikeBean) {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final Unit m73984P0(CommentFragment commentFragment, BaseDto baseDto) {
        commentFragment.m74029E0(baseDto != null ? (String) baseDto.getData() : null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final Unit m73985Q0(CommentFragment commentFragment, CommentListBean commentListBean) {
        C16741n c16741n;
        C27941f c27941fM36186h0;
        commentFragment.hideLoading();
        if (commentListBean != null || (((c16741n = commentFragment.mCommentExpandAdapter) != null && (c16741n == null || c16741n.getItemCount() != 0)) || C27287m.f83003a.m106330e())) {
            commentFragment.m73995a1(commentFragment.topicId, commentListBean);
            commentFragment.m73972B0(commentListBean);
            Function1 function1 = commentFragment.loadResultCallback;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            return Unit.f75682a;
        }
        commentFragment.m74002f1();
        C16741n c16741n2 = commentFragment.mCommentExpandAdapter;
        if (c16741n2 != null && (c27941fM36186h0 = c16741n2.m36186h0()) != null) {
            c27941fM36186h0.m108667s();
        }
        Function1 function2 = commentFragment.loadResultCallback;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: R0 */
    private final void m73986R0() {
        CommentViewModel commentViewModel = this.mCommentViewModel;
        if (commentViewModel != null) {
            String str = this.topicId;
            if (str == null) {
                str = "";
            }
            String str2 = this.topicType;
            int i11 = this.page + 1;
            this.page = i11;
            commentViewModel.m74988h(str, str2, "0", String.valueOf(i11), this.mPerPage, "");
        }
    }

    /* JADX INFO: renamed from: S0 */
    private final void m73987S0(String txt) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final InterfaceC23704a m73988T0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final Unit m73989U0(CommentFragment commentFragment, C23889b it) {
        Intrinsics.m97802h(it, "it");
        Integer numM94621e = it.m94621e();
        if (numM94621e != null && numM94621e.intValue() == 0) {
            commentFragment.m73973C0(it);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final Unit m73990V0(CommentBody commentBody, CommentFragment commentFragment, String data, String bucket) {
        Intrinsics.m97802h(data, "data");
        Intrinsics.m97802h(bucket, "bucket");
        if (data.length() > 0) {
            List<String> imageList = commentBody.getImageList();
            if (imageList != null) {
                imageList.clear();
            }
            List<String> imageList2 = commentBody.getImageList();
            if (imageList2 != null) {
                imageList2.add(data);
            }
            commentBody.setBucket(bucket);
            CommentViewModel commentViewModel = commentFragment.mCommentViewModel;
            if (commentViewModel != null) {
                commentViewModel.m74997s(commentFragment.topicType, commentBody);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: W0 */
    private final void m73991W0() {
        if (this.mSoftKeyBoardListener == null) {
            this.mSoftKeyBoardListener = new C17442l();
        }
        C17442l c17442l = this.mSoftKeyBoardListener;
        if (c17442l != null) {
            c17442l.m74964d(getActivity(), new C17011e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public final void m73992X0(String moduleName, String commentId) {
        HashMap map = new HashMap();
        map.put("module_name", moduleName);
        String str = this.topicId;
        if (str == null) {
            str = "";
        }
        map.put("post_id", str);
        if (commentId == null) {
            commentId = "";
        }
        map.put("comment_id", commentId);
        String str2 = this.pageFrom;
        if (str2 != null && str2.length() != 0) {
            String str3 = this.pageFrom;
            Intrinsics.m97799e(str3);
            map.put(WebConstants.PAGE_FROM, str3);
        }
        String str4 = this.trackId;
        if (str4 != null) {
            map.put("track_id", str4);
        }
        String str5 = this.previousTrackId;
        if (str5 != null) {
            map.put("parent_track_id", str5);
        }
        String str6 = this.previousPageVideoId;
        if (str6 != null) {
            map.put("parent_content_id", str6);
        }
        String str7 = this.ugcVideoId;
        if (str7 != null) {
            map.put("content_id", str7);
        }
        String str8 = this.pageName;
        if (str8 == null) {
            str8 = this.mFromDetail ? PostDetailFragment.PAGE_NAME : VideoFragment.PAGE_NAME;
        }
        C14450a.f50860a.m65146i(str8, map);
    }

    /* JADX INFO: renamed from: Y0 */
    static /* synthetic */ void m73993Y0(CommentFragment commentFragment, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        commentFragment.m73992X0(str, str2);
    }

    /* JADX INFO: renamed from: a1 */
    private final void m73995a1(String postId, CommentListBean data) {
        List<CommentBean> commentList;
        List<CommentBean> commentList2;
        HashMap<String, CommentBean> mapM72926G1;
        if (this.mMsgData == null) {
            this.topicId = postId;
            this.mMsgData = data;
            return;
        }
        if (data == null || (commentList = data.getCommentList()) == null) {
            return;
        }
        for (CommentBean commentBean : commentList) {
            C16741n c16741n = this.mCommentExpandAdapter;
            if (c16741n != null && (mapM72926G1 = c16741n.m72926G1()) != null) {
                if (mapM72926G1.containsKey(commentBean != null ? commentBean.getCommentId() : null)) {
                }
            }
            CommentListBean commentListBean = this.mMsgData;
            if (commentListBean != null && (commentList2 = commentListBean.getCommentList()) != null) {
                commentList2.add(commentBean);
            }
        }
    }

    private final boolean checkLogin() {
        InterfaceC23704a loginApi = getLoginApi();
        if (loginApi != null && !loginApi.mo90379a()) {
            if (this.loginLaunch == null) {
                this.isNeedShowLoginActivity = true;
            }
            if (isAdded() && !isDetached() && !isRemoving()) {
                AbstractC0249b abstractC0249b = this.loginLaunch;
                if (abstractC0249b == null) {
                    return false;
                }
                Context contextRequireContext = requireContext();
                Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
                Intent intentMo90394p = loginApi.mo90394p(contextRequireContext);
                intentMo90394p.putExtra("title_name", getString(R$string.comment_login_title));
                abstractC0249b.m999a(intentMo90394p);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final void m74000e1(CommentFragment commentFragment, DialogInterface dialogInterface) {
        if (dialogInterface instanceof DialogC16731g) {
            C16740m c16740mM72873h = ((DialogC16731g) dialogInterface).m72873h();
            Editable editableM72911h = c16740mM72873h != null ? c16740mM72873h.m72911h() : null;
            commentFragment.mText = editableM72911h;
            C26866a.a.m104898f(C26866a.f81698a, "CommentFragment", "text=" + ((Object) editableM72911h), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: f1 */
    private final void m74002f1() {
        TextView textView;
        TextView textView2;
        if (!isAdded() || isDetached() || isRemoving()) {
            return;
        }
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.post_detail_no_comment, (ViewGroup) null);
        if (viewInflate != null && (textView2 = (TextView) viewInflate.findViewById(R$id.tv_status)) != null) {
            textView2.setText(R$string.base_net_err);
            textView2.setTextSize(12.0f);
            textView2.setVisibility(0);
        }
        if (viewInflate != null && (textView = (TextView) viewInflate.findViewById(R$id.tv_retry)) != null) {
            textView.setText(R$string.comment_retry);
            textView.setVisibility(0);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommentFragment.m74004g1(this.f57359a, view);
                }
            });
        }
        C16741n c16741n = this.mCommentExpandAdapter;
        if (c16741n != null) {
            Intrinsics.m97799e(viewInflate);
            c16741n.m36171Y0(viewInflate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final void m74004g1(CommentFragment commentFragment, View view) {
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.base_net_err);
        } else {
            commentFragment.loadData();
            m73993Y0(commentFragment, "retry", null, 2, null);
        }
    }

    private final InterfaceC23704a getLoginApi() {
        return (InterfaceC23704a) this.loginApi.getValue();
    }

    /* JADX INFO: renamed from: h1 */
    private final void m74006h1() {
        AbstractC5786f0.m27402b(300L);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ef  */
    /* JADX INFO: renamed from: i1 */
    private final void m74008i1(String commentId) {
        List<Object> data;
        List<Object> data2;
        List<Object> data3;
        String str = commentId;
        ArrayList<CommentBean> arrayList = new ArrayList();
        C16741n c16741n = this.mCommentExpandAdapter;
        if (c16741n != null && (data3 = c16741n.getData()) != null) {
            Iterator<T> it = data3.iterator();
            while (it.hasNext()) {
                InterfaceC27022a interfaceC27022a = (InterfaceC27022a) it.next();
                if (interfaceC27022a instanceof CommentBean) {
                    CommentBean commentBean = (CommentBean) interfaceC27022a;
                    if (TextUtils.equals(commentBean.getCommentId(), str)) {
                        arrayList.add(interfaceC27022a);
                    }
                    if (TextUtils.equals(commentBean.getRootCommentId(), str)) {
                        arrayList.add(interfaceC27022a);
                    }
                }
            }
        }
        C26866a.a aVar = C26866a.f81698a;
        String string = arrayList.toString();
        Intrinsics.m97801g(string, "toString(...)");
        C26866a.a.m104898f(aVar, "deleteComment list:", string, false, 4, null);
        if (!arrayList.isEmpty()) {
            this.mNeedUpdate = true;
            for (CommentBean commentBean2 : arrayList) {
                C16741n c16741n2 = this.mCommentExpandAdapter;
                if (c16741n2 != null && (data2 = c16741n2.getData()) != null) {
                    data2.remove(commentBean2);
                }
            }
            C16741n c16741n3 = this.mCommentExpandAdapter;
            if ((c16741n3 != null ? c16741n3.getData() : null) == null) {
                this.lastCreatedTime = 0L;
                C26866a.a.m104898f(C26866a.f81698a, "deleteComment list:", "mCommentExpandAdapter null", false, 4, null);
            } else {
                C16741n c16741n4 = this.mCommentExpandAdapter;
                List<Object> data4 = c16741n4 != null ? c16741n4.getData() : null;
                if (data4 == null || data4.isEmpty()) {
                    this.lastCreatedTime = 0L;
                    C26866a.a.m104898f(C26866a.f81698a, "deleteComment list:", "mCommentExpandAdapter null", false, 4, null);
                } else {
                    C16741n c16741n5 = this.mCommentExpandAdapter;
                    if (c16741n5 != null && (data = c16741n5.getData()) != null) {
                        Iterator<T> it2 = data.iterator();
                        while (it2.hasNext()) {
                            InterfaceC27022a interfaceC27022a2 = (InterfaceC27022a) it2.next();
                            if (interfaceC27022a2 instanceof CommentBean) {
                                Long createdAt = ((CommentBean) interfaceC27022a2).getCreatedAt();
                                long jLongValue = createdAt != null ? createdAt.longValue() : 0L;
                                this.lastCreatedTime = jLongValue;
                                C26866a.a.m104898f(C26866a.f81698a, "deleteComment list:", "mCommentExpandAdapter createdTime:" + jLongValue, false, 4, null);
                            }
                        }
                    }
                }
            }
            C16741n c16741n6 = this.mCommentExpandAdapter;
            if (c16741n6 != null) {
                c16741n6.notifyDataSetChanged();
            }
            this.mCommentCount -= (long) arrayList.size();
            m74010j1();
            m73974D0(arrayList);
        }
        C28465b c28465bM109954a = C28465b.f87467a.m109954a();
        if (str == null) {
            str = "";
        }
        c28465bM109954a.m109948d(2, str, String.valueOf(this.mCommentCount), this.topicId);
    }

    private final void initAdapter() {
        Context context;
        if (this.mCommentExpandAdapter != null || (context = getContext()) == null) {
            return;
        }
        C16741n c16741n = new C16741n(this);
        C27941f c27941fM36186h0 = c16741n.m36186h0();
        c27941fM36186h0.m108673z(true);
        c27941fM36186h0.m108672y(true);
        c27941fM36186h0.m108656D(new InterfaceC27568f() { // from class: com.transsion.postdetail.ui.fragment.i
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                CommentFragment.m73976H0(this.f57366a);
            }
        });
        this.mCommentExpandAdapter = c16741n;
        RecyclerView recyclerView = this.mCommentList;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
        }
        RecyclerView recyclerView2 = this.mCommentList;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.mCommentExpandAdapter);
        }
        RecyclerView recyclerView3 = this.mCommentList;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C16748u());
        }
    }

    private final void initExposureHelper() {
        if (this.exposureHelper != null) {
            return;
        }
        String str = this.pageName;
        if (str == null) {
            str = this.mFromDetail ? PostDetailFragment.PAGE_NAME : VideoFragment.PAGE_NAME;
        }
        C28117b c28117b = new C28117b(0.6f, new C17009c(str), false, 4, null);
        c28117b.m109199n(2);
        this.exposureHelper = c28117b;
        RecyclerView recyclerView = this.mCommentList;
        if (recyclerView != null) {
            Intrinsics.m97799e(c28117b);
            recyclerView.addOnScrollListener(c28117b);
        }
    }

    private final void initViewModel() {
        CommentViewModel commentViewModel = (CommentViewModel) new C3227v0(this).m14969a(CommentViewModel.class);
        commentViewModel.m74990k().m14851j(getViewLifecycleOwner(), new C17199o(new Function1() { // from class: com.transsion.postdetail.ui.fragment.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommentFragment.m73985Q0(this.f57380a, (CommentListBean) obj);
            }
        }));
        commentViewModel.m74991l().m14851j(getViewLifecycleOwner(), new C17199o(new Function1() { // from class: com.transsion.postdetail.ui.fragment.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommentFragment.m73979K0(this.f57387a, (C27838b) obj);
            }
        }));
        commentViewModel.m74993n().m14851j(getViewLifecycleOwner(), new C17199o(new Function1() { // from class: com.transsion.postdetail.ui.fragment.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommentFragment.m73980L0(this.f57393a, (CommentBean) obj);
            }
        }));
        commentViewModel.m74992m().m14851j(getViewLifecycleOwner(), new C17199o(new Function1() { // from class: com.transsion.postdetail.ui.fragment.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommentFragment.m73983O0((CommentLikeBean) obj);
            }
        }));
        commentViewModel.m74989j().m14851j(getViewLifecycleOwner(), new C17199o(new Function1() { // from class: com.transsion.postdetail.ui.fragment.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommentFragment.m73984P0(this.f57290a, (BaseDto) obj);
            }
        }));
        this.mCommentViewModel = commentViewModel;
    }

    /* JADX INFO: renamed from: j1 */
    private final void m74010j1() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        C28154i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatTextView2 = mViewBinding.f86456e) != null) {
            appCompatTextView2.setVisibility(this.mFromDetail ? 8 : 0);
        }
        C28154i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatTextView = mViewBinding2.f86456e) != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String string = getString(R$string.comments);
            Intrinsics.m97801g(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{AbstractC14564j.m65680a(this.mCommentCount)}, 1));
            Intrinsics.m97801g(str, "format(...)");
            appCompatTextView.setText(str);
        }
        InterfaceC17008b interfaceC17008b = this.onCommentCountChangedListener;
        if (interfaceC17008b != null) {
            interfaceC17008b.mo74040a(this.mCommentCount);
        }
    }

    /* JADX INFO: renamed from: k1 */
    private final void m74012k1(CommentListBean data) {
        initAdapter();
        C16741n c16741n = this.mCommentExpandAdapter;
        if (c16741n != null) {
            c16741n.m72929K1(data);
        }
    }

    /* JADX INFO: renamed from: l1 */
    private final void m74014l1(String path, Function2 callback) {
        C24233c.f73744a.m95262f(path, UploadFileType.OBJECT_NAME_IMAGE, true, new C17013g(callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        C16741n c16741n;
        if (this.mMsgData == null && (((c16741n = this.mCommentExpandAdapter) == null || (c16741n != null && c16741n.getItemCount() == 0)) && !C27287m.f83003a.m106330e())) {
            m74002f1();
            return;
        }
        startLoading();
        CommentViewModel commentViewModel = this.mCommentViewModel;
        if (commentViewModel != null) {
            String str = this.topicId;
            if (str == null) {
                str = "";
            }
            String str2 = this.topicType;
            String strValueOf = String.valueOf(this.page);
            int i11 = this.mPerPage;
            String str3 = this.commentId;
            commentViewModel.m74988h(str, str2, "0", strValueOf, i11, str3 == null ? "" : str3);
        }
    }

    private final void showEmpty() {
        if (!isAdded() || isDetached() || isRemoving()) {
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        DefaultView defaultView = new DefaultView(contextRequireContext);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_IMAGE_DES);
        String string = getString(R$string.comment_empty);
        Intrinsics.m97801g(string, "getString(...)");
        defaultView.setDescText(string);
        defaultView.setDefaultImage(R$drawable.icon_comment_empty);
        defaultView.setMinimumHeight(AbstractC5776a0.m27313a(250.0f));
        C16741n c16741n = this.mCommentExpandAdapter;
        if (c16741n != null) {
            c16741n.m36171Y0(defaultView);
        }
    }

    @Override // com.transsion.postdetail.comment.InterfaceC16732g0
    /* JADX INFO: renamed from: A */
    public void mo72882A(CommentBean item) {
        String str;
        m73987S0("点赞");
        if (item == null || item.getCommentId() == null) {
            return;
        }
        String commentId = item.getCommentId();
        Boolean likeStatu = item.getLikeStatu();
        Boolean bool = Boolean.TRUE;
        CommentLikeBody commentLikeBody = new CommentLikeBody(commentId, Integer.valueOf(!Intrinsics.m97797c(likeStatu, bool) ? 1 : 0));
        CommentViewModel commentViewModel = this.mCommentViewModel;
        if (commentViewModel != null) {
            commentViewModel.m74996q(commentLikeBody);
        }
        if (Intrinsics.m97797c(item.getIsHot(), bool)) {
            str = Intrinsics.m97797c(item.getLikeStatu(), bool) ? "like_hot_comment" : "dislike_hot_comment";
        } else {
            str = Intrinsics.m97797c(item.getLikeStatu(), bool) ? "like_comment" : "dislike_comment";
        }
        m73992X0(str, item.getCommentId());
        Function2 function2 = this.mCommentCallback;
        if (function2 != null) {
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m74029E0(String commentId) {
        try {
            m74008i1(commentId);
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                C26866a.a.m104898f(C26866a.f81698a, "deleteComment", message, false, 4, null);
            }
        }
    }

    @Override // com.transsion.postdetail.comment.InterfaceC16736i0
    /* JADX INFO: renamed from: F */
    public void mo72888F() {
        if (!isAdded() || isDetached() || isRemoving()) {
            return;
        }
        SelectImageActivity.Companion companion = SelectImageActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        companion.m75501a(contextRequireContext, 0, 1, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public C28154i getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28154i c28154iM109316c = C28154i.m109316c(inflater);
        Intrinsics.m97801g(c28154iM109316c, "inflate(...)");
        return c28154iM109316c;
    }

    @Override // com.transsion.postdetail.comment.InterfaceC16732g0
    /* JADX INFO: renamed from: H */
    public void mo72883H(CommentBean item) {
        C16740m c16740m = this.mCommentEditInputViewHelper;
        CommentBean commentBeanM72912i = c16740m != null ? c16740m.m72912i() : null;
        if (!Intrinsics.m97797c(commentBeanM72912i != null ? commentBeanM72912i.getCommentId() : null, item != null ? item.getCommentId() : null)) {
            C16740m c16740m2 = this.mCommentEditInputViewHelper;
            if (c16740m2 != null) {
                c16740m2.m72915t();
            }
            C16740m c16740m3 = this.mCommentEditInputViewHelper;
            if (c16740m3 != null) {
                c16740m3.m72917v(item);
            }
        }
        m74034d1(item);
        m73993Y0(this, "reply", null, 2, null);
    }

    @Override // com.transsion.postdetail.comment.InterfaceC16732g0
    /* JADX INFO: renamed from: Q */
    public void mo72884Q(CommentBean item) {
        m74033c1(item);
    }

    @Override // com.transsion.postdetail.comment.InterfaceC16732g0
    /* JADX INFO: renamed from: R */
    public void mo72885R(CommentBean item) {
        String uid;
        m73987S0("跳转个人页面");
        if (item != null && (uid = item.getUid()) != null) {
            Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", uid), requireContext(), null, 2, null);
        }
        m73993Y0(this, "avatar_comment", null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    @Override // com.transsion.postdetail.comment.InterfaceC16736i0
    /* JADX INFO: renamed from: T */
    public void mo72889T(Editable text, CommentBean replyItem) {
        String str;
        String rootCommentId;
        String str2;
        String commentId;
        String uid;
        C16740m c16740mM72873h;
        if (this.replyLoading) {
            C28951b.f88586a.m111454d(R$string.loding);
            return;
        }
        if (replyItem == null) {
            str = "main";
        } else {
            str = replyItem.isSubComment() ? "reply_reply" : "main_reply";
        }
        String str3 = str;
        C16768a c16768a = C16768a.f56378a;
        String str4 = this.topicId;
        String str5 = str4 == null ? "" : str4;
        String str6 = this.pageName;
        if (str6 == null) {
            str6 = this.mFromDetail ? PostDetailFragment.PAGE_NAME : VideoFragment.PAGE_NAME;
        }
        c16768a.m73073h(str5, "comment_post", str6, this.pageFrom, str3, this.trackId, this.previousTrackId, this.previousPageVideoId, this.ugcVideoId, this.collectionId);
        this.replyItem = replyItem;
        this.mPostClickTime = SystemClock.elapsedRealtime();
        m73987S0("发表评论");
        DialogC16731g dialogC16731g = this.mCommentEditInputDialog;
        List listM72913j = (dialogC16731g == null || (c16740mM72873h = dialogC16731g.m72873h()) == null) ? null : c16740mM72873h.m72913j();
        CharSequence charSequenceN1 = text != null ? StringsKt.m98155n1(text) : null;
        if ((charSequenceN1 == null || charSequenceN1.length() == 0) && listM72913j != null && listM72913j.isEmpty()) {
            C28951b.f88586a.m111454d(R$string.comment_empty_tips);
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.check_error);
            return;
        }
        if (checkLogin()) {
            if (replyItem != null) {
                if (Intrinsics.m97797c(replyItem.getRootCommentId(), "0")) {
                    rootCommentId = replyItem.getCommentId();
                    if (rootCommentId == null) {
                        str2 = "0";
                    }
                } else {
                    rootCommentId = replyItem.getRootCommentId();
                }
                str2 = rootCommentId;
            } else {
                str2 = "0";
            }
            final CommentBody commentBody = new CommentBody(String.valueOf(charSequenceN1), str2, (replyItem == null || Intrinsics.m97797c(replyItem.getRootCommentId(), "0") || (commentId = replyItem.getCommentId()) == null) ? "0" : commentId, (replyItem == null || (uid = replyItem.getUid()) == null) ? "0" : uid, this.topicId, new ArrayList(), "", "POST");
            this.replyLoading = true;
            DialogC16731g dialogC16731g2 = this.mCommentEditInputDialog;
            if (dialogC16731g2 != null) {
                dialogC16731g2.m72876l();
            }
            List list = listM72913j;
            if (list != null && !list.isEmpty()) {
                String localPath = ((PhotoEntity) listM72913j.get(0)).getLocalPath();
                m74014l1(localPath != null ? localPath : "", new Function2() { // from class: com.transsion.postdetail.ui.fragment.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CommentFragment.m73990V0(commentBody, this, (String) obj, (String) obj2);
                    }
                });
            } else {
                CommentViewModel commentViewModel = this.mCommentViewModel;
                if (commentViewModel != null) {
                    commentViewModel.m74997s(this.topicType, commentBody);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m74031Z0(Function2 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.mCommentCallback = callback;
    }

    @Override // com.transsion.postdetail.comment.InterfaceC16736i0, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        InterfaceC16736i0.a.m72890a(this, editable);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m74032b1(InterfaceC17008b interfaceC17008b) {
        this.onCommentCountChangedListener = interfaceC17008b;
    }

    @Override // com.transsion.postdetail.comment.InterfaceC16736i0, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        InterfaceC16736i0.a.m72891b(this, charSequence, i11, i12, i13);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m74033c1(CommentBean item) {
        FragmentManager childFragmentManager;
        UserInfo userInfoMo90386h;
        if (item == null) {
            return;
        }
        String content = item.getContent();
        String userId = null;
        this.mCommentDeleteDialog = content != null ? CommentDeleteDialogFragment.INSTANCE.m72827a(item.getCommentId(), this.topicType, content) : null;
        try {
            if (isAdded() && (childFragmentManager = getChildFragmentManager()) != null) {
                childFragmentManager.m14537g0();
                CommentDeleteDialogFragment commentDeleteDialogFragment = this.mCommentDeleteDialog;
                if ((commentDeleteDialogFragment != null && commentDeleteDialogFragment.isAdded()) || childFragmentManager.m14547k0("commentDelete") != null) {
                    return;
                }
                String uid = item.getUid();
                InterfaceC23704a loginApi = getLoginApi();
                if (loginApi != null && (userInfoMo90386h = loginApi.mo90386h()) != null) {
                    userId = userInfoMo90386h.getUserId();
                }
                boolean zEquals = TextUtils.equals(uid, userId);
                CommentDeleteDialogFragment commentDeleteDialogFragment2 = this.mCommentDeleteDialog;
                if (commentDeleteDialogFragment2 != null) {
                    commentDeleteDialogFragment2.m72825o0(new C17012f());
                }
                CommentDeleteDialogFragment commentDeleteDialogFragment3 = this.mCommentDeleteDialog;
                if (commentDeleteDialogFragment3 != null) {
                    commentDeleteDialogFragment3.m72826q0(childFragmentManager, "commentDelete", zEquals);
                }
            }
            m74006h1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m74034d1(CommentBean item) {
        C28029a c28029aM72872g;
        if (!isAdded() || isDetached() || isRemoving()) {
            return false;
        }
        if (this.mCommentEditInputDialog == null) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            DialogC16731g.a aVarM72879c = new DialogC16731g.a(contextRequireContext).m72880d(300).m72879c(this);
            C16740m c16740m = this.mCommentEditInputViewHelper;
            DialogC16731g dialogC16731gM72877a = aVarM72879c.m72878b(c16740m != null ? c16740m.m72911h() : null).m72881e(item).m72877a();
            this.mCommentEditInputDialog = dialogC16731gM72877a;
            if (dialogC16731gM72877a != null) {
                dialogC16731gM72877a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.transsion.postdetail.ui.fragment.j
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        CommentFragment.m74000e1(this.f57373a, dialogInterface);
                    }
                });
            }
        }
        DialogC16731g dialogC16731g = this.mCommentEditInputDialog;
        if (dialogC16731g == null || dialogC16731g.isShowing()) {
            return true;
        }
        DialogC16731g dialogC16731g2 = this.mCommentEditInputDialog;
        if (dialogC16731g2 != null) {
            dialogC16731g2.m72874j(this.mText);
        }
        DialogC16731g dialogC16731g3 = this.mCommentEditInputDialog;
        if (dialogC16731g3 != null && (c28029aM72872g = dialogC16731g3.m72872g()) != null) {
            c28029aM72872g.m108995i(item);
        }
        DialogC16731g dialogC16731g4 = this.mCommentEditInputDialog;
        if (dialogC16731g4 == null) {
            return true;
        }
        dialogC16731g4.show();
        return true;
    }

    @Override // gp.InterfaceC23623a
    /* JADX INFO: renamed from: f */
    public void mo74035f(Function1 callback) {
        this.loadResultCallback = callback;
    }

    @Override // com.transsion.postdetail.comment.InterfaceC16732g0
    /* JADX INFO: renamed from: h */
    public void mo72886h(C27837a info, int count) {
        Intrinsics.m97802h(info, "info");
        m73987S0("加载更多");
        CommentViewModel commentViewModel = this.mCommentViewModel;
        if (commentViewModel != null) {
            commentViewModel.m74995p(info, this.topicType, String.valueOf(info.m108210c()), this.mPerPage);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void hideLoading() {
        LinearLayout linearLayout;
        RecyclerView recyclerView;
        C28154i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f86454c) != null) {
            AbstractC26006c.m102058k(recyclerView);
        }
        C28154i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (linearLayout = mViewBinding2.f86455d) == null) {
            return;
        }
        AbstractC26006c.m102054g(linearLayout);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        this.mCommentList = (RecyclerView) view.findViewById(R$id.comment_list);
        initAdapter();
        m73991W0();
        initExposureHelper();
        m73987S0("onViewCreated");
        initViewModel();
        m74010j1();
        m73977I0();
        this.loginLaunch = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.postdetail.ui.fragment.g
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                CommentFragment.m73978J0(this.f57349a, (ActivityResult) obj);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        CommentListBean commentListBean = this.mMsgData;
        if (commentListBean == null) {
            loadData();
        } else {
            m73972B0(commentListBean);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.topicId = arguments.getString(GifImagePreviewActivity.POST_ID);
            String string = arguments.getString("TOPIC_TYPE");
            if (string == null) {
                string = CommentTopicType.POST.getValue();
            }
            this.topicType = string;
            this.mCommentCount = arguments.getLong("comment_count");
            this.mShowDownload = arguments.getBoolean("show_download", true);
            this.mFromDetail = arguments.getBoolean("from_detail", false);
            this.commentId = arguments.getString("comment_id", "");
            this.pageFrom = arguments.getString(WebConstants.PAGE_FROM);
            this.trackId = arguments.getString("TRACK_ID");
            this.previousTrackId = arguments.getString("PREVIOUS_TRACK_ID");
            this.previousPageVideoId = arguments.getString("PREVIOUS_PAGE_VIDEO_ID");
            this.ugcVideoId = arguments.getString("UGC_VIDEO_ID");
            this.pageName = arguments.getString("PAGE_NAME");
            this.collectionId = arguments.getString("COLLECTION_ID");
        }
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.fragment.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommentFragment.m73989U0(this.f57325a, (C23889b) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        super.onDestroyView();
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null && (recyclerView = this.mCommentList) != null) {
            recyclerView.removeOnScrollListener(c28117b);
        }
        this.exposureHelper = null;
        this.exposedCommentIds.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        C28117b c28117b;
        super.onHiddenChanged(hidden);
        if (!hidden || (c28117b = this.exposureHelper) == null) {
            return;
        }
        c28117b.m109195f();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s11, int start, int before, int count) {
        m73987S0("onTextChanged");
    }

    @Override // gp.InterfaceC23623a
    /* JADX INFO: renamed from: r */
    public boolean mo74036r() {
        return m74034d1(null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void startLoading() {
        LinearLayout linearLayout;
        RecyclerView recyclerView;
        C28154i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f86454c) != null) {
            AbstractC26006c.m102054g(recyclerView);
        }
        C28154i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (linearLayout = mViewBinding2.f86455d) == null) {
            return;
        }
        AbstractC26006c.m102058k(linearLayout);
    }

    @Override // gp.InterfaceC23623a
    /* JADX INFO: renamed from: t */
    public void mo74037t(View view) {
        if (view == null || this.mCommentEditInputViewHelper != null) {
            return;
        }
        this.mCommentEditInputViewHelper = new C16740m(view, null, new SocialStatus(false, false, false, this.mShowDownload, 7, null), false, 10, null);
        C28029a c28029a = new C28029a();
        c28029a.m108994h(300);
        c28029a.m108992f(this);
        c28029a.m108993g(null);
        C16740m c16740m = this.mCommentEditInputViewHelper;
        if (c16740m != null) {
            c16740m.m72914k(c28029a);
        }
    }

    @Override // gp.InterfaceC23623a
    public void updateCommentCount(long commentCount) {
        this.mCommentCount = commentCount;
        m74010j1();
    }
}
