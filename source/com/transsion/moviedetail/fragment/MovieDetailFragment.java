package com.transsion.moviedetail.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.AbstractC0256u;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.Lifecycle;
import co.InterfaceC5146a;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.bubbleview.BubbleTextView;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.baseui.widget.GradientTextView;
import com.transsion.bean.GameInfoType;
import com.transsion.core.utils.C14752e;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.R$layout;
import com.transsion.moviedetail.R$string;
import com.transsion.moviedetail.activity.MovieDetailActivity;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.DownloadItem;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.DubsInfo;
import com.transsion.moviedetailapi.bean.PreVideoAddress;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.SubjectGameInfo;
import com.transsion.moviedetailapi.bean.Trailer;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.player.longvideo.constants.LongVodPageType;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import com.transsion.player.longvideo.p302ui.LongVodUiType;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p1003enum.PlayMimeType;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.push.PushConstants;
import com.transsion.usercenter.setting.labelsfeedback.model.FbTvData;
import com.transsion.videofloat.bean.FloatActionType;
import com.transsion.videofloat.bean.FloatPlayType;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.downloader.bean.DownloadListBean;
import com.transsnet.downloader.viewmodel.C22169k0;
import com.transsnet.downloader.widget.DownloadView;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.AddToDownloadEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import gn.C23600h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import jo.InterfaceC24450a;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import net.lucode.hackware.magicindicator.MagicIndicator;
import ng.AbstractC26006c;
import org.mvel2.ast.ASTNode;
import p352dn.InterfaceC22998b;
import p382el.InterfaceC23181a;
import p465hp.InterfaceC23888a;
import p550kj.C24655b;
import p550kj.C24662i;
import p553ko.C24715a;
import p553ko.C24717c;
import p710qk.InterfaceC27083b;
import p710qk.InterfaceC27084c;
import p723qx.C27136c;
import p723qx.InterfaceC27135b;
import p723qx.InterfaceC27138e;
import p743rh.C27287m;
import p755rx.C27425a;
import p824ux.InterfaceC28047a;
import p913xm.C28615f;
import p914xn.C28623e;
import p914xn.C28625g;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u0088\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001jB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0005J\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u0005J\u0019\u0010'\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0019H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\u0005J\u0017\u00103\u001a\u00020\u00192\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0011\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u0010\u0005J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010\u0005J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b>\u0010\u000bJ\u0019\u0010A\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bA\u0010BJ\u0019\u0010E\u001a\u00020\u00062\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0006H\u0016¢\u0006\u0004\bG\u0010\u0005J\u0017\u0010J\u001a\u00020\u00022\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0019H\u0016¢\u0006\u0004\bO\u0010\u001bJ\u000f\u0010P\u001a\u00020\u0006H\u0016¢\u0006\u0004\bP\u0010\u0005J\u000f\u0010Q\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u0010\u0005J\u000f\u0010R\u001a\u00020\u0006H\u0016¢\u0006\u0004\bR\u0010\u0005J\u000f\u0010S\u001a\u00020\u0006H\u0016¢\u0006\u0004\bS\u0010\u0005J\u000f\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0006H\u0016¢\u0006\u0004\bW\u0010\u0005J\u0011\u0010Y\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0006H\u0016¢\u0006\u0004\b[\u0010\u0005J\u000f\u0010\\\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\\\u0010\u0005J\u000f\u0010]\u001a\u00020\u0006H\u0016¢\u0006\u0004\b]\u0010\u0005J\u000f\u0010^\u001a\u00020\u0006H\u0016¢\u0006\u0004\b^\u0010\u0005J\r\u0010_\u001a\u00020\u0006¢\u0006\u0004\b_\u0010\u0005J\u000f\u0010`\u001a\u00020\u0006H\u0016¢\u0006\u0004\b`\u0010\u0005J\u0017\u0010b\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0019H\u0016¢\u0006\u0004\bb\u0010/J\u000f\u0010c\u001a\u00020\u0006H\u0016¢\u0006\u0004\bc\u0010\u0005J\u000f\u0010d\u001a\u00020\u0006H\u0016¢\u0006\u0004\bd\u0010\u0005J\u001f\u0010g\u001a\u00020\u00062\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010eH\u0016¢\u0006\u0004\bg\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010s\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u001b\u0010y\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001b\u0010~\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010v\u001a\u0004\b|\u0010}R!\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010v\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0089\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0085\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0085\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008d\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008d\u0001R\u001b\u0010\u0096\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0085\u0001R(\u0010\u009b\u0001\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0097\u0001\u0010\u0088\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0005\b\u009a\u0001\u0010(R\u0019\u0010\u009d\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u008d\u0001R\u0019\u0010\u009f\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0088\u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0085\u0001R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010§\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u008d\u0001R\u001b\u0010ª\u0001\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010¬\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010\u008d\u0001R\u001c\u0010°\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\"\u0010µ\u0001\u001a\u0005\u0018\u00010±\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b²\u0001\u0010v\u001a\u0006\b³\u0001\u0010´\u0001R\u0019\u0010¸\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0019\u0010»\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R!\u0010¾\u0001\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010À\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010·\u0001R\u0019\u0010Â\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010·\u0001R\u0019\u0010Ä\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010·\u0001R\u0019\u0010Æ\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010·\u0001R\u0019\u0010È\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010·\u0001R\u0019\u0010Ê\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010·\u0001R\u001c\u0010Î\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001¨\u0006Ï\u0001"}, m97100d2 = {"Lcom/transsion/moviedetail/fragment/MovieDetailFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lgn/h;", "Lco/a;", "<init>", "()V", "", "J1", "Lcom/transsion/moviedetailapi/bean/Subject;", "movieDetailBean", "N1", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "A1", "subject", "D1", "Lcom/transsion/moviedetailapi/bean/Trailer;", "trailer", "w1", "(Lcom/transsion/moviedetailapi/bean/Trailer;)V", "", "Lko/c;", "Y0", "(Lcom/transsion/moviedetailapi/bean/Trailer;)Ljava/util/List;", "I1", "b1", "", "p1", "()Z", "g1", "N0", "Q0", "M0", "Z0", "P0", "K1", "R0", "r1", "", "visible", "L1", "(I)V", "", "tsLayoutDone", "z1", "(J)V", PushConstants.PUSH_SERVICE_TYPE_SHOW, "t1", "(Z)V", "j1", "Lcom/transsion/videofloat/bean/FloatActionType;", "actionType", "E1", "(Lcom/transsion/videofloat/bean/FloatActionType;)Z", "Lrx/a;", "S0", "()Lrx/a;", "d1", "Lcom/transsion/player/longvideo/ui/LongVodUiType;", "uiType", "u1", "(Lcom/transsion/player/longvideo/ui/LongVodUiType;)V", "H1", "h1", "Lko/a;", "bean", "v1", "(Lko/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "receiveArguments", "Landroid/view/LayoutInflater;", "inflater", "X0", "(Landroid/view/LayoutInflater;)Lgn/h;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isRegisteDeviceKeyMonitor", "initViewData", "initViewModel", "initListener", "retryLoadData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "loadDefaultData", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "onDestroyView", "onResume", "onPause", "onStop", "y1", "onDestroy", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "onHomeClick", "onRecentClick", "Lkotlin/Function0;", "callback", "S", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/transsnet/downloader/widget/DownloadView;", "a", "Lcom/transsnet/downloader/widget/DownloadView;", "downloadViewFloat", "Lxn/e;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lxn/e;", "bottomRecHelper", "c", "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/Lazy;", "V0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "Lcom/transsnet/downloader/viewmodel/k0;", "e", "getDownloadViewModel", "()Lcom/transsnet/downloader/viewmodel/k0;", "downloadViewModel", "Lhp/a;", "f", "W0", "()Lhp/a;", "publishedApi", "g", "Ljava/lang/String;", "mSubjectId", "h", "I", "mSubjectType", "i", "ops", "j", "Z", "netResultSuccess", CampaignEx.JSON_KEY_AD_K, "moduleName", "l", "autoDownload", "m", "autoPlay", "n", "autoPlayResourceId", "o", "getPreloadId", "()I", "setPreloadId", "preloadId", TtmlNode.TAG_P, "fetchDownloadFinish", CampaignEx.JSON_KEY_AD_Q, "curSeason", CampaignEx.JSON_KEY_AD_R, "lastPageFrom", "Ljo/a;", "s", "Ljo/a;", "playerControl", "t", "hasClickedActivityTip", TmcStartParams.KEY_URL_SHORT, "Landroid/view/View;", "gameResView", "v", "isGameResInit", "Lel/a;", "w", "Lel/a;", "palmPayApi", "Ldn/b;", "x", "U0", "()Ldn/b;", "memberProvider", "y", "J", "curAudioTrackPlayProgress", "z", "Lcom/transsion/player/longvideo/ui/LongVodUiType;", "curPlayerUiType", "A", "Lkotlin/jvm/functions/Function0;", "backPressedCallback", "B", "tsEnter", "C", "tsRequestStart", "D", "tsCallback", "E", "tsInitStart", "F", "tsInitDone", "G", "tsAddView", "Landroidx/fragment/app/Fragment;", "H", "Landroidx/fragment/app/Fragment;", "coverFragment", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MovieDetailFragment extends PageStatusFragment<C23600h> implements InterfaceC5146a {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Function0 backPressedCallback;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private long tsEnter;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private long tsRequestStart;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private long tsCallback;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private long tsInitStart;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private long tsInitDone;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private long tsAddView;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private Fragment coverFragment;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private DownloadView downloadViewFloat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C28623e bottomRecHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean netResultSuccess;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean autoDownload;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean autoPlay;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String autoPlayResourceId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int preloadId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean fetchDownloadFinish;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private String lastPageFrom;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private InterfaceC24450a playerControl;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean hasClickedActivityTip;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private View gameResView;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean isGameResInit;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private long curAudioTrackPlayProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.moviedetail.fragment.MovieDetailFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.moviedetail.fragment.MovieDetailFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3227v0.c invoke() {
            C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy downloadViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C22169k0.class), new Function0<C3231x0>() { // from class: com.transsion.moviedetail.fragment.MovieDetailFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.moviedetail.fragment.MovieDetailFragment$special$$inlined$activityViewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3227v0.c invoke() {
            C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy publishedApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.fragment.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MovieDetailFragment.m70361x1();
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mSubjectType = SubjectType.MOVIE.getValue();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int curSeason = 1;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private InterfaceC23181a palmPayApi = (InterfaceC23181a) TheRouter.m61774d(InterfaceC23181a.class, new Object[0]);

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Lazy memberProvider = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.fragment.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MovieDetailFragment.m70347q1();
        }
    });

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private LongVodUiType curPlayerUiType = LongVodUiType.MIDDLE;

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.MovieDetailFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final MovieDetailFragment m70367a() {
            return new MovieDetailFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.MovieDetailFragment$b */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC15947b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC15947b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BubbleTextView bubbleTextView;
            ViewTreeObserver viewTreeObserver;
            C23600h mViewBinding = MovieDetailFragment.this.getMViewBinding();
            if (mViewBinding != null && (bubbleTextView = mViewBinding.f71942b) != null && (viewTreeObserver = bubbleTextView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            C23600h mViewBinding2 = MovieDetailFragment.this.getMViewBinding();
            BubbleTextView bubbleTextView2 = mViewBinding2 != null ? mViewBinding2.f71942b : null;
            if (bubbleTextView2 == null || bubbleTextView2.getMeasuredWidth() == 0) {
                return;
            }
            float measuredWidth = (bubbleTextView2.getMeasuredWidth() / 2) - (AbstractC5776a0.m27313a(16.0f) / 2);
            bubbleTextView2.setArrowPosition(measuredWidth);
            C26866a.a.m104898f(C26866a.f81698a, "movie_detail", "activity tip width: " + bubbleTextView2.getMeasuredWidth() + ", arrowPosition: " + measuredWidth, false, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.MovieDetailFragment$c */
    public static final class C15948c extends AbstractC0256u {
        C15948c() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            Function0 function0 = MovieDetailFragment.this.backPressedCallback;
            if (function0 == null || !((Boolean) function0.invoke()).booleanValue()) {
                if (MovieDetailFragment.this.playerControl != null) {
                    InterfaceC24450a interfaceC24450a = MovieDetailFragment.this.playerControl;
                    if (interfaceC24450a != null) {
                        interfaceC24450a.onBackPressed();
                        return;
                    }
                    return;
                }
                FragmentActivity activity = MovieDetailFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.MovieDetailFragment$d */
    static final class C15949d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54568a;

        C15949d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54568a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54568a;
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
            this.f54568a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.MovieDetailFragment$e */
    public static final class C15950e implements InterfaceC28047a {
        C15950e() {
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: a */
        public boolean mo70368a(C27425a c27425a) {
            return false;
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: b */
        public void mo70369b(C27425a c27425a) {
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: c */
        public void mo70370c(C27425a c27425a) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("oneroom://com.community.oneroom?type=/movie/detail&id=" + (c27425a != null ? c27425a.m106634r() : null)));
            intent.setFlags(ASTNode.DEOP);
            Utils.m27275a().startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.MovieDetailFragment$f */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC15951f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ LongVodPlayerView f54569a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MovieDetailFragment f54570b;

        ViewTreeObserverOnGlobalLayoutListenerC15951f(LongVodPlayerView longVodPlayerView, MovieDetailFragment movieDetailFragment) {
            this.f54569a = longVodPlayerView;
            this.f54570b = movieDetailFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f54569a.getWidth() == 0 || this.f54569a.getHeight() == 0) {
                return;
            }
            this.f54569a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f54570b.m70364z1(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.MovieDetailFragment$g */
    public static final class C15952g implements InterfaceC24450a.b {
        C15952g() {
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: a */
        public void mo70371a() {
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: b */
        public boolean mo70372b() {
            return false;
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: c */
        public boolean mo70373c(FloatActionType actionType) {
            Intrinsics.m97802h(actionType, "actionType");
            return MovieDetailFragment.this.m70292E1(actionType);
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: d */
        public void mo70374d(LongVodUiType uiType) {
            Intrinsics.m97802h(uiType, "uiType");
            MovieDetailFragment.this.curPlayerUiType = uiType;
            MovieDetailFragment.this.m70355u1(uiType);
            C28623e c28623e = MovieDetailFragment.this.bottomRecHelper;
            if (c28623e != null) {
                c28623e.m110393x(uiType != LongVodUiType.MIDDLE);
            }
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: e */
        public View mo70375e() {
            return MovieDetailFragment.this.gameResView;
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: f */
        public void mo70376f(boolean z11) {
            AppCompatImageView appCompatImageView;
            C23600h mViewBinding = MovieDetailFragment.this.getMViewBinding();
            if (mViewBinding == null || (appCompatImageView = mViewBinding.f71950j) == null) {
                return;
            }
            appCompatImageView.setVisibility(z11 ? 0 : 8);
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: g */
        public void mo70377g(C24715a c24715a) {
            MovieDetailFragment.this.m70357v1(c24715a);
        }

        @Override // jo.InterfaceC24450a.b
        public void onCompletion() {
        }
    }

    /* JADX INFO: renamed from: A1 */
    private final void m70284A1() {
        GradientTextView gradientTextView;
        AppCompatImageView appCompatImageView;
        final Subject subject = this.mMovieDetailBean;
        if (subject != null) {
            C23600h mViewBinding = getMViewBinding();
            if (mViewBinding != null && (appCompatImageView = mViewBinding.f71951k) != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MovieDetailFragment.m70286B1(this.f54755a, subject, view);
                    }
                });
            }
            C23600h mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (gradientTextView = mViewBinding2.f71958r) == null) {
                return;
            }
            gradientTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MovieDetailFragment.m70288C1(this.f54760a, subject, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final void m70286B1(MovieDetailFragment movieDetailFragment, Subject subject, View view) {
        String url;
        InterfaceC23888a interfaceC23888aM70320W0 = movieDetailFragment.m70320W0();
        if (interfaceC23888aM70320W0 != null) {
            Context context = view.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            String str = movieDetailFragment.mSubjectId;
            if (str == null) {
                str = "";
            }
            Cover cover = subject.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            String title = subject.getTitle();
            if (title == null) {
                title = "";
            }
            String description = subject.getDescription();
            if (description == null) {
                description = "";
            }
            interfaceC23888aM70320W0.mo75361e(context, str, url, title, description, 3);
        }
        C14450a.f50860a.m65145h("subjectdetail", "post", (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final void m70288C1(MovieDetailFragment movieDetailFragment, Subject subject, View view) {
        String url;
        InterfaceC23888a interfaceC23888aM70320W0 = movieDetailFragment.m70320W0();
        if (interfaceC23888aM70320W0 != null) {
            Context context = view.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            String str = movieDetailFragment.mSubjectId;
            if (str == null) {
                str = "";
            }
            Cover cover = subject.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            String title = subject.getTitle();
            if (title == null) {
                title = "";
            }
            String description = subject.getDescription();
            if (description == null) {
                description = "";
            }
            interfaceC23888aM70320W0.mo75361e(context, str, url, title, description, 3);
        }
        C14450a.f50860a.m65145h("subjectdetail", "post", (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: D1 */
    private final void m70290D1(Subject subject) {
        StillsFragment stillsFragmentM70484a;
        List<DownloadItem> items;
        int iM66409f;
        C23600h mViewBinding;
        C23600h mViewBinding2;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        if (this.coverFragment != null || subject == null) {
            return;
        }
        ResourceDetectors resourceDetector = subject.getResourceDetector();
        c2308b = null;
        ViewGroup.LayoutParams c2308b = null;
        String downloadUrl = resourceDetector != null ? resourceDetector.getDownloadUrl() : null;
        Integer subjectType = subject.getSubjectType();
        SubjectType subjectType2 = SubjectType.MUSIC;
        int value = subjectType2.getValue();
        if (subjectType == null || subjectType.intValue() != value || downloadUrl == null || downloadUrl.length() == 0) {
            Integer subjectType3 = subject.getSubjectType();
            SubjectType subjectType4 = SubjectType.EDUCATION;
            int value2 = subjectType4.getValue();
            if (subjectType3 == null || subjectType3.intValue() != value2) {
                Trailer trailer = subject.getTrailer();
                if (trailer != null) {
                    m70359w1(trailer);
                    return;
                }
                Cover stills = subject.getStills();
                if (stills == null) {
                    stills = subject.getCover();
                }
                if (stills != null) {
                    stillsFragmentM70484a = StillsFragment.INSTANCE.m70484a(stills);
                }
            } else if (this.fetchDownloadFinish) {
                DownloadListBean downloadListBean = (DownloadListBean) m70319V0().m70926y().m14847f();
                DownloadItem downloadItem = (downloadListBean == null || (items = downloadListBean.getItems()) == null) ? null : (DownloadItem) CollectionsKt.m97361k0(items);
                if (downloadItem != null) {
                    Trailer trailer2 = new Trailer(0, null, null, null, null, 31, null);
                    Cover stills2 = subject.getStills();
                    if (stills2 == null) {
                        stills2 = subject.getCover();
                    }
                    trailer2.setCover(stills2);
                    trailer2.setSubjectType(subjectType4.getValue());
                    trailer2.setSubjectId(subject.getSubjectId());
                    Long duration = downloadItem.getDuration();
                    trailer2.setVideoAddress(new PreVideoAddress(0, null, duration != null ? Integer.valueOf((int) duration.longValue()) : null, 0, 0, downloadItem.getSize(), 0, downloadItem.getUrl(), null, 0));
                    m70359w1(trailer2);
                    return;
                }
                Trailer trailer3 = subject.getTrailer();
                if (trailer3 != null) {
                    m70359w1(trailer3);
                    return;
                }
                Cover stills3 = subject.getStills();
                if (stills3 == null) {
                    stills3 = subject.getCover();
                }
                if (stills3 != null) {
                    stillsFragmentM70484a = StillsFragment.INSTANCE.m70484a(stills3);
                }
            }
            if (stillsFragmentM70484a != null) {
                this.coverFragment = stillsFragmentM70484a;
                if (getMViewBinding() != null) {
                    iM66409f = C14752e.m66409f();
                    mViewBinding = getMViewBinding();
                    if (mViewBinding != null && (frameLayout2 = mViewBinding.f71948h) != null) {
                        c2308b = frameLayout2.getLayoutParams();
                    }
                    if (c2308b == null) {
                        c2308b = new ConstraintLayout.C2308b(iM66409f, (iM66409f * 9) / 16);
                    } else {
                        c2308b.height = (iM66409f * 9) / 16;
                    }
                    mViewBinding2 = getMViewBinding();
                    if (mViewBinding2 != null && (frameLayout = mViewBinding2.f71948h) != null) {
                        frameLayout.setLayoutParams(c2308b);
                    }
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
                    AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
                    Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
                    int i11 = R$id.fl_player;
                    Fragment fragment = this.coverFragment;
                    Intrinsics.m97799e(fragment);
                    abstractC3168wM14557p.m14813s(i11, fragment);
                    abstractC3168wM14557p.mo14671j();
                }
            }
        }
        Integer durationSeconds = subject.getDurationSeconds();
        PreVideoAddress preVideoAddress = new PreVideoAddress(0, null, Integer.valueOf(durationSeconds != null ? durationSeconds.intValue() : 0), 0, 0, 0L, 0, downloadUrl, "", 0);
        Cover stills4 = subject.getStills();
        if (stills4 == null) {
            stills4 = subject.getCover();
        }
        Trailer trailer4 = new Trailer(subjectType2.getValue(), preVideoAddress, stills4, null, null, 24, null);
        trailer4.setSubjectId(subject.getSubjectId());
        trailer4.setMusicName(subject.getTitle());
        m70359w1(trailer4);
        stillsFragmentM70484a = null;
        if (stillsFragmentM70484a != null) {
            this.coverFragment = stillsFragmentM70484a;
            if (getMViewBinding() != null) {
                iM66409f = C14752e.m66409f();
                mViewBinding = getMViewBinding();
                if (mViewBinding != null) {
                    c2308b = frameLayout2.getLayoutParams();
                }
                if (c2308b == null) {
                    c2308b = new ConstraintLayout.C2308b(iM66409f, (iM66409f * 9) / 16);
                } else {
                    c2308b.height = (iM66409f * 9) / 16;
                }
                mViewBinding2 = getMViewBinding();
                if (mViewBinding2 != null) {
                    frameLayout.setLayoutParams(c2308b);
                }
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.m97801g(childFragmentManager2, "getChildFragmentManager(...)");
                AbstractC3168w abstractC3168wM14557p2 = childFragmentManager2.m14557p();
                Intrinsics.m97801g(abstractC3168wM14557p2, "beginTransaction()");
                int i12 = R$id.fl_player;
                Fragment fragment2 = this.coverFragment;
                Intrinsics.m97799e(fragment2);
                abstractC3168wM14557p2.m14813s(i12, fragment2);
                abstractC3168wM14557p2.mo14671j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public final boolean m70292E1(final FloatActionType actionType) {
        final FragmentActivity activity;
        ConstraintLayout constraintLayoutM93376b;
        Integer subjectType;
        Subject subject = this.mMovieDetailBean;
        if (((subject == null || (subjectType = subject.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue()) != SubjectType.MUSIC.getValue() && (activity = getActivity()) != null && !activity.isDestroyed() && !activity.isFinishing()) {
            FloatActionType floatActionType = FloatActionType.ICON;
            if (actionType != floatActionType && !C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true)) {
                C26866a.f81698a.m104912c("VideoFloat", "设置页pip开关被关闭了", true);
                return false;
            }
            final C27425a c27425aM70316S0 = m70316S0();
            if (c27425aM70316S0 != null) {
                if (actionType != floatActionType && !c27425aM70316S0.m106622f().isPlaying()) {
                    C26866a.f81698a.m104912c("VideoFloat-pip", "movie 视频暂停，无需触发画中画", true);
                    return false;
                }
                InterfaceC27138e.a aVar = InterfaceC27138e.f82251a;
                if (aVar.m105606b().mo86568c()) {
                    C26866a.f81698a.m104912c("VideoFloat-pip", "movie 当前可用画中画，使用画中画播放", true);
                    if (Build.VERSION.SDK_INT < 31 || actionType != FloatActionType.HOME) {
                        aVar.m105606b().mo86574i(activity, c27425aM70316S0, actionType, this.curPlayerUiType == LongVodUiType.LAND);
                    } else {
                        C23600h mViewBinding = getMViewBinding();
                        if (mViewBinding != null && (constraintLayoutM93376b = mViewBinding.getRoot()) != null) {
                            constraintLayoutM93376b.postDelayed(new Runnable() { // from class: com.transsion.moviedetail.fragment.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MovieDetailFragment.m70294F1(activity, c27425aM70316S0, actionType, this);
                                }
                            }, 1000L);
                        }
                    }
                    return true;
                }
                InterfaceC27135b.f82245a.m105597c().mo86626g(activity, c27425aM70316S0, actionType == floatActionType, this.curPlayerUiType == LongVodUiType.LAND, new Function1() { // from class: com.transsion.moviedetail.fragment.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MovieDetailFragment.m70296G1(activity, ((Boolean) obj).booleanValue());
                    }
                }, new C15950e());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final void m70294F1(FragmentActivity fragmentActivity, C27425a c27425a, FloatActionType floatActionType, MovieDetailFragment movieDetailFragment) {
        InterfaceC27138e.f82251a.m105606b().mo86574i(fragmentActivity, c27425a, floatActionType, movieDetailFragment.curPlayerUiType == LongVodUiType.LAND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final Unit m70296G1(FragmentActivity fragmentActivity, boolean z11) {
        if (z11 && fragmentActivity != null) {
            fragmentActivity.finish();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: H1 */
    private final void m70298H1() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        View view = this.gameResView;
        ViewParent parent = view != null ? view.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.gameResView);
        }
        KeyEvent.Callback callback = this.gameResView;
        InterfaceC27084c interfaceC27084c = callback instanceof InterfaceC27084c ? (InterfaceC27084c) callback : null;
        if (interfaceC27084c != null) {
            interfaceC27084c.setPageStyle("detail");
        }
        C23600h mViewBinding = getMViewBinding();
        if (mViewBinding != null && (frameLayout3 = mViewBinding.f71949i) != null) {
            AbstractC26006c.m102058k(frameLayout3);
        }
        C23600h mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (frameLayout2 = mViewBinding2.f71949i) != null) {
            frameLayout2.removeAllViews();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C23600h mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (frameLayout = mViewBinding3.f71949i) == null) {
            return;
        }
        frameLayout.addView(this.gameResView, layoutParams);
    }

    /* JADX INFO: renamed from: I1 */
    private final void m70300I1() {
        Context context;
        Integer subjectType;
        if (this.playerControl == null && (context = getContext()) != null) {
            Subject subject = this.mMovieDetailBean;
            LongVodPageType longVodPageType = ((subject == null || (subjectType = subject.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue()) == SubjectType.MUSIC.getValue() ? LongVodPageType.MUSIC : LongVodPageType.TRAILER;
            C23600h mViewBinding = getMViewBinding();
            if (mViewBinding != null) {
                this.tsInitStart = SystemClock.elapsedRealtime();
                LongVodPlayerView longVodPlayerView = new LongVodPlayerView(context);
                String strName = longVodPageType.name();
                Subject subject2 = this.mMovieDetailBean;
                InterfaceC24450a.a.m95941a(longVodPlayerView, "subjectdetail", longVodPageType, strName + (subject2 != null ? subject2.getSubjectId() : null), mViewBinding.f71947g, mViewBinding.f71952l.f77877f, null, null, 96, null);
                Subject subject3 = this.mMovieDetailBean;
                longVodPlayerView.initAdHelper(subject3 != null ? subject3.getGenre() : null);
                longVodPlayerView.setFeedBackVisible(true);
                this.tsInitDone = SystemClock.elapsedRealtime();
                this.playerControl = longVodPlayerView;
                this.tsAddView = SystemClock.elapsedRealtime();
                mViewBinding.f71948h.addView(longVodPlayerView);
                longVodPlayerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC15951f(longVodPlayerView, this));
            }
            Subject subject4 = this.mMovieDetailBean;
            if (subject4 != null) {
                m70330h1(subject4);
            }
            InterfaceC24450a interfaceC24450a = this.playerControl;
            if (interfaceC24450a != null) {
                interfaceC24450a.setCallback(new C15952g());
            }
        }
    }

    /* JADX INFO: renamed from: J1 */
    private final void m70302J1() {
        new C28625g(this, R$id.subjectDetailLayout, this.mMovieDetailBean, "subjectdetail", this.moduleName, false, false, 96, null);
    }

    /* JADX INFO: renamed from: K1 */
    private final void m70304K1() {
        BubbleTextView bubbleTextView;
        DownloadView downloadView;
        DownloadView downloadView2;
        BubbleTextView bubbleTextView2;
        if (m70307M0() && (downloadView = this.downloadViewFloat) != null && downloadView.getVisibility() == 0 && (downloadView2 = this.downloadViewFloat) != null && downloadView2.getCom.cloud.tmc.kernel.minicover.NativeComponentConstants.KEY_COMPONENT_TYPE java.lang.String() == 0) {
            C23600h mViewBinding = getMViewBinding();
            if (mViewBinding != null && (bubbleTextView2 = mViewBinding.f71942b) != null) {
                AbstractC26006c.m102058k(bubbleTextView2);
            }
            m70313P0();
            return;
        }
        C23600h mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (bubbleTextView = mViewBinding2.f71942b) == null) {
            return;
        }
        AbstractC26006c.m102054g(bubbleTextView);
    }

    /* JADX INFO: renamed from: L1 */
    private final void m70306L1(int visible) {
        HashMap mapM96844g;
        ResourceDetectors resourceDetector;
        List<ResourceDetectors> resourceDetectors;
        DownloadView downloadView = this.downloadViewFloat;
        if (downloadView != null) {
            downloadView.setVisibility(visible);
        }
        Subject subject = this.mMovieDetailBean;
        if (subject != null && (resourceDetectors = subject.getResourceDetectors()) != null && !resourceDetectors.isEmpty()) {
            resourceDetectors.get(0).getResourceId();
            resourceDetectors.get(0).isMultiResolution();
        }
        Subject subject2 = this.mMovieDetailBean;
        if (subject2 != null && (resourceDetector = subject2.getResourceDetector()) != null) {
            resourceDetector.getResourceId();
            resourceDetector.isMultiResolution();
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
        }
        m70304K1();
    }

    /* JADX INFO: renamed from: M0 */
    private final boolean m70307M0() {
        InterfaceC23181a interfaceC23181a;
        if (this.hasClickedActivityTip || (interfaceC23181a = this.palmPayApi) == null) {
            return false;
        }
        return interfaceC23181a.mo66561g();
    }

    /* JADX INFO: renamed from: M1 */
    static /* synthetic */ void m70308M1(MovieDetailFragment movieDetailFragment, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        movieDetailFragment.m70306L1(i11);
    }

    /* JADX INFO: renamed from: N0 */
    private final void m70309N0() {
        if (m70345p1()) {
            Subject subject = this.mMovieDetailBean;
            if (subject == null || !subject.isFamilyModeIntercept()) {
                C23600h mViewBinding = getMViewBinding();
                DownloadView downloadView = mViewBinding != null ? mViewBinding.f71944d : null;
                this.downloadViewFloat = downloadView;
                if (downloadView != null) {
                    downloadView.setPageFrom("subjectdetail");
                }
                DownloadView downloadView2 = this.downloadViewFloat;
                if (downloadView2 != null) {
                    DownloadView.setAttrs$default(downloadView2, null, Float.valueOf(C14752e.m66410g(16.0f)), null, 5, null);
                }
                DownloadView downloadView3 = this.downloadViewFloat;
                if (downloadView3 != null) {
                    downloadView3.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.n
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MovieDetailFragment.m70311O0(this.f54734a, view);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: N1 */
    private final void m70310N1(Subject movieDetailBean) {
        Subject subject;
        View view;
        View view2;
        FrameLayout frameLayout;
        this.mMovieDetailBean = movieDetailBean;
        if (!this.isGameResInit) {
            m70326d1();
            m70353t1(true);
        }
        Subject subject2 = this.mMovieDetailBean;
        String ops = subject2 != null ? subject2.getOps() : null;
        if ((ops == null || ops.length() == 0) && (subject = this.mMovieDetailBean) != null) {
            subject.setOps(this.ops);
        }
        Subject subject3 = this.mMovieDetailBean;
        if (subject3 == null || !subject3.isFamilyModeIntercept()) {
            m70290D1(this.mMovieDetailBean);
        } else {
            C23600h mViewBinding = getMViewBinding();
            if (mViewBinding != null && (frameLayout = mViewBinding.f71948h) != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
                ((ViewGroup.MarginLayoutParams) c2308b).height = AbstractC23384a.m92908b(48);
                frameLayout.setLayoutParams(c2308b);
            }
            C23600h mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (view2 = mViewBinding2.f71959s) != null) {
                AbstractC26006c.m102054g(view2);
            }
            C23600h mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (view = mViewBinding3.f71960t) != null) {
                view.setBackgroundResource(R$color.bg_01);
            }
        }
        if (this.downloadViewFloat == null) {
            m70309N0();
            m70308M1(this, 0, 1, null);
        }
        m70324b1();
        m70329g1();
        if (this.autoDownload) {
            this.autoDownload = false;
            DownloadView downloadView = this.downloadViewFloat;
            if (downloadView != null) {
                downloadView.post(new Runnable() { // from class: com.transsion.moviedetail.fragment.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        MovieDetailFragment.m70312O1(this.f54731a);
                    }
                });
            }
        }
        m70284A1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m70311O0(MovieDetailFragment movieDetailFragment, View view) {
        ResourceDetectors resourceDetector;
        List<DownloadItem> resolutionList;
        Subject subject;
        ResourceDetectors resourceDetector2;
        ResourceDetectors resourceDetector3;
        List<DownloadItem> resolutionList2;
        Subject subject2 = movieDetailFragment.mMovieDetailBean;
        if (subject2 != null && (resourceDetector = subject2.getResourceDetector()) != null && (resolutionList = resourceDetector.getResolutionList()) != null && (!resolutionList.isEmpty())) {
            Subject subject3 = movieDetailFragment.mMovieDetailBean;
            Integer numValueOf = (subject3 == null || (resourceDetector3 = subject3.getResourceDetector()) == null || (resolutionList2 = resourceDetector3.getResolutionList()) == null) ? null : Integer.valueOf(resolutionList2.size());
            Intrinsics.m97799e(numValueOf);
            if (numValueOf.intValue() > 1 && (subject = movieDetailFragment.mMovieDetailBean) != null && (resourceDetector2 = subject.getResourceDetector()) != null) {
                resourceDetector2.setType(1);
            }
        }
        movieDetailFragment.m70314Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final void m70312O1(MovieDetailFragment movieDetailFragment) {
        movieDetailFragment.m70314Q0();
    }

    /* JADX INFO: renamed from: P0 */
    private final void m70313P0() {
        BubbleTextView bubbleTextView;
        ViewTreeObserver viewTreeObserver;
        C23600h mViewBinding = getMViewBinding();
        if (mViewBinding == null || (bubbleTextView = mViewBinding.f71942b) == null || (viewTreeObserver = bubbleTextView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC15947b());
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m70314Q0() {
        List<ResourceDetectors> resourceDetectors;
        if (getContext() == null) {
            return;
        }
        m70315R0();
        Subject subject = this.mMovieDetailBean;
        String str = "";
        if (subject != null && (resourceDetectors = subject.getResourceDetectors()) != null && !resourceDetectors.isEmpty()) {
            String resourceLink = resourceDetectors.get(0).getResourceLink();
            str = resourceLink != null ? resourceLink : "";
            resourceDetectors.get(0).getResourceId();
            resourceDetectors.get(0).isMultiResolution();
        }
        String str2 = str;
        Subject subject2 = this.mMovieDetailBean;
        String ops = null;
        if (subject2 != null) {
            Integer subjectType = subject2.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                Context context = getContext();
                Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                String str3 = this.ops;
                if (str3 == null || str3.length() == 0) {
                    Subject subject3 = this.mMovieDetailBean;
                    if (subject3 != null) {
                        ops = subject3.getOps();
                    }
                } else {
                    ops = this.ops;
                }
                downloadManagerApiM87093a.m87086d0(fragmentActivity, "subjectdetail", (384 & 4) != 0 ? "" : "", ops, (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : true, (384 & 64) != 0 ? null : this.mMovieDetailBean, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                return;
            }
        }
        DownloadManagerApi downloadManagerApiM87093a2 = DownloadManagerApi.f66480j.m87093a();
        Context context2 = getContext();
        Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity2 = (FragmentActivity) context2;
        Subject subject4 = this.mMovieDetailBean;
        String str4 = this.ops;
        if (str4 == null || str4.length() == 0) {
            Subject subject5 = this.mMovieDetailBean;
            if (subject5 != null) {
                ops = subject5.getOps();
            }
        } else {
            ops = this.ops;
        }
        DownloadManagerApi.m87025N(downloadManagerApiM87093a2, fragmentActivity2, subject4, "subjectdetail", "", ops, str2, null, this.moduleName, null, false, this.curSeason, false, 832, null);
    }

    /* JADX INFO: renamed from: R0 */
    private final void m70315R0() {
        BubbleTextView bubbleTextView;
        this.hasClickedActivityTip = true;
        C23600h mViewBinding = getMViewBinding();
        if (mViewBinding == null || (bubbleTextView = mViewBinding.f71942b) == null) {
            return;
        }
        AbstractC26006c.m102054g(bubbleTextView);
    }

    /* JADX INFO: renamed from: S0 */
    private final C27425a m70316S0() {
        String subjectId;
        InterfaceC24450a interfaceC24450a = this.playerControl;
        InterfaceC16634g player = interfaceC24450a != null ? interfaceC24450a.getPlayer() : null;
        InterfaceC24450a interfaceC24450a2 = this.playerControl;
        ORPlayerView playerView = interfaceC24450a2 != null ? interfaceC24450a2.getOrPlayerView() : null;
        if (playerView == null || player == null) {
            return null;
        }
        C26866a.a aVar = C26866a.f81698a;
        Subject subject = this.mMovieDetailBean;
        aVar.m104912c("VideoFloat", "trailer--showFloat, title:" + (subject != null ? subject.getTitle() : null), true);
        FloatPlayType floatPlayType = FloatPlayType.TRAILER;
        Subject subject2 = this.mMovieDetailBean;
        if (subject2 == null || (subjectId = subject2.getSubjectId()) == null) {
            subjectId = "";
        }
        return new C27425a(playerView, player, null, floatPlayType, subjectId, 0, 0, "", "subjectdetail");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final void m70317T0(MovieDetailFragment movieDetailFragment, View view) {
        movieDetailFragment.requireActivity().finish();
    }

    /* JADX INFO: renamed from: U0 */
    private final InterfaceC22998b m70318U0() {
        return (InterfaceC22998b) this.memberProvider.getValue();
    }

    /* JADX INFO: renamed from: V0 */
    private final MovieDetailViewModel m70319V0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: W0 */
    private final InterfaceC23888a m70320W0() {
        return (InterfaceC23888a) this.publishedApi.getValue();
    }

    /* JADX INFO: renamed from: Y0 */
    private final List m70321Y0(Trailer trailer) {
        Integer duration;
        String string;
        Long size;
        String string2;
        String url;
        String videoId;
        ArrayList arrayList = new ArrayList();
        PlayMimeType playMimeType = PlayMimeType.DEFAULT;
        PreVideoAddress videoAddress = trailer.getVideoAddress();
        String str = (videoAddress == null || (videoId = videoAddress.getVideoId()) == null) ? "" : videoId;
        PreVideoAddress videoAddress2 = trailer.getVideoAddress();
        String str2 = (videoAddress2 == null || (url = videoAddress2.getUrl()) == null) ? "" : url;
        PreVideoAddress videoAddress3 = trailer.getVideoAddress();
        String str3 = (videoAddress3 == null || (size = videoAddress3.getSize()) == null || (string2 = size.toString()) == null) ? "" : string2;
        PreVideoAddress videoAddress4 = trailer.getVideoAddress();
        arrayList.add(new C24717c(playMimeType, str, str2, "", str3, (videoAddress4 == null || (duration = videoAddress4.getDuration()) == null || (string = duration.toString()) == null) ? "" : string, "", null, 128, null));
        return arrayList;
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m70322Z0() {
        BubbleTextView bubbleTextView;
        C23600h mViewBinding = getMViewBinding();
        if (mViewBinding == null || (bubbleTextView = mViewBinding.f71942b) == null) {
            return;
        }
        bubbleTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MovieDetailFragment.m70323a1(this.f54780a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m70323a1(MovieDetailFragment movieDetailFragment, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "movie_detail", "Click activity tip", false, 4, null);
        movieDetailFragment.hasClickedActivityTip = true;
        Intrinsics.m97799e(view);
        AbstractC26006c.m102054g(view);
    }

    /* JADX INFO: renamed from: b1 */
    private final void m70324b1() {
        Subject subject = this.mMovieDetailBean;
        C23600h mViewBinding = getMViewBinding();
        MagicIndicator magicIndicator = mViewBinding != null ? mViewBinding.f71953m : null;
        C23600h mViewBinding2 = getMViewBinding();
        this.bottomRecHelper = new C28623e(this, subject, magicIndicator, mViewBinding2 != null ? mViewBinding2.f71954n : null, "subjectdetail", false, false, new Function1() { // from class: com.transsion.moviedetail.fragment.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MovieDetailFragment.m70325c1(this.f54745a, ((Integer) obj).intValue());
            }
        }, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m70325c1(MovieDetailFragment movieDetailFragment, int i11) {
        GradientTextView gradientTextView;
        DownloadView downloadView = movieDetailFragment.downloadViewFloat;
        if (downloadView != null && downloadView != null) {
            downloadView.setVisibility(i11 != 1 ? 0 : 8);
        }
        C23600h mViewBinding = movieDetailFragment.getMViewBinding();
        if (mViewBinding != null && (gradientTextView = mViewBinding.f71958r) != null) {
            gradientTextView.setVisibility(i11 == 1 ? 0 : 8);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: d1 */
    private final void m70326d1() {
        String genre;
        InterfaceC27083b interfaceC27083b;
        SubjectGameInfo gameInfo;
        SubjectGameInfo gameInfo2;
        SubjectGameInfo gameInfo3;
        SubjectGameInfo gameInfo4;
        this.isGameResInit = true;
        Subject subject = this.mMovieDetailBean;
        String itemId = null;
        String type = (subject == null || (gameInfo4 = subject.getGameInfo()) == null) ? null : gameInfo4.getType();
        if (type != null && type.length() != 0) {
            Subject subject2 = this.mMovieDetailBean;
            String itemId2 = (subject2 == null || (gameInfo3 = subject2.getGameInfo()) == null) ? null : gameInfo3.getItemId();
            if (itemId2 != null && itemId2.length() != 0) {
                C26866a.a.m104898f(C26866a.f81698a, "GameResLoader", "sub detail game initGameRes", false, 4, null);
                Context context = getContext();
                if (context == null || (interfaceC27083b = (InterfaceC27083b) TheRouter.m61774d(InterfaceC27083b.class, new Object[0])) == null) {
                    return;
                }
                Subject subject3 = this.mMovieDetailBean;
                GameInfoType gameInfoType = (subject3 == null || (gameInfo2 = subject3.getGameInfo()) == null) ? null : gameInfo2.getGameInfoType();
                Intrinsics.m97799e(gameInfoType);
                Subject subject4 = this.mMovieDetailBean;
                if (subject4 != null && (gameInfo = subject4.getGameInfo()) != null) {
                    itemId = gameInfo.getItemId();
                }
                String str = itemId;
                Intrinsics.m97799e(str);
                interfaceC27083b.mo65960a(context, "subjectdetail", gameInfoType, str, new Function1() { // from class: com.transsion.moviedetail.fragment.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MovieDetailFragment.m70327e1(this.f54749a, (View) obj);
                    }
                });
                return;
            }
        }
        Subject subject5 = this.mMovieDetailBean;
        if (subject5 == null || (genre = subject5.getGenre()) == null) {
            return;
        }
        String lowerCase = genre.toLowerCase(Locale.ROOT);
        Intrinsics.m97801g(lowerCase, "toLowerCase(...)");
        if (lowerCase == null || !StringsKt.m98132c0(lowerCase, "game", false, 2, null)) {
            return;
        }
        C26866a.a.m104901l(C26866a.f81698a, "GameResLoader", "sub detail,  game is null", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final Unit m70327e1(MovieDetailFragment movieDetailFragment, View view) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        movieDetailFragment.gameResView = view;
        if (view == null) {
            C23600h mViewBinding = movieDetailFragment.getMViewBinding();
            if (mViewBinding != null && (frameLayout2 = mViewBinding.f71949i) != null) {
                AbstractC26006c.m102054g(frameLayout2);
            }
            C23600h mViewBinding2 = movieDetailFragment.getMViewBinding();
            if (mViewBinding2 != null && (frameLayout = mViewBinding2.f71949i) != null) {
                frameLayout.removeAllViews();
            }
        } else {
            movieDetailFragment.m70298H1();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final void m70328f1(MovieDetailFragment movieDetailFragment, View view) {
        FragmentActivity activity;
        if (movieDetailFragment.playerControl != null) {
            if (movieDetailFragment.m70292E1(FloatActionType.BACK) || (activity = movieDetailFragment.getActivity()) == null) {
                return;
            }
            activity.finish();
            return;
        }
        FragmentActivity activity2 = movieDetailFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* JADX INFO: renamed from: g1 */
    private final void m70329g1() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        Subject subject = this.mMovieDetailBean;
        if (subject != null && subject.isFamilyModeIntercept()) {
            ResourceDetectorFamilyModeFragment resourceDetectorFamilyModeFragment = new ResourceDetectorFamilyModeFragment();
            resourceDetectorFamilyModeFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("data_key_resource_detectors", this.mMovieDetailBean)));
            abstractC3168wM14557p.m14813s(R$id.resourceDetectorGroup, resourceDetectorFamilyModeFragment);
        } else if (m70345p1()) {
            ResourceDetectorFragment resourceDetectorFragment = new ResourceDetectorFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("data_key_resource_detectors", this.mMovieDetailBean);
            bundle.putString("ops", this.ops);
            bundle.putBoolean("auto_play", this.autoPlay);
            bundle.putString("auto_play_resource_id", this.autoPlayResourceId);
            bundle.putString("module_name", this.moduleName);
            bundle.putInt("season", this.curSeason);
            resourceDetectorFragment.setArguments(bundle);
            abstractC3168wM14557p.m14813s(R$id.resourceDetectorGroup, resourceDetectorFragment);
        } else {
            ResourceDetectorEmptyFragment resourceDetectorEmptyFragment = new ResourceDetectorEmptyFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("data_key_resource_detectors", this.mMovieDetailBean);
            resourceDetectorEmptyFragment.setArguments(bundle2);
            abstractC3168wM14557p.m14813s(R$id.resourceDetectorGroup, resourceDetectorEmptyFragment);
        }
        abstractC3168wM14557p.mo14671j();
    }

    /* JADX INFO: renamed from: h1 */
    private final void m70330h1(Subject movieDetailBean) {
        String restrictLevel = movieDetailBean.getRestrictLevel();
        if (restrictLevel == null || restrictLevel.length() == 0 || !C14496b.f50966a.m65344b().getBoolean("restrict_tips_dialog_again", true)) {
            return;
        }
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.onHandlePause();
        }
        ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), "sa_restrict_tips", false, 2, null);
        String value = configBeanM110355d != null ? configBeanM110355d.getValue() : null;
        if (value == null || value.length() == 0) {
            value = Utils.m27275a().getString(R$string.movie_detail_restrict_tips);
        }
        final RestrictTipsDialog restrictTipsDialogM70471a = RestrictTipsDialog.INSTANCE.m70471a(value, "subjectdetail", movieDetailBean.getSubjectId());
        restrictTipsDialogM70471a.m65437l0(this, "RestrictTipsDialog");
        restrictTipsDialogM70471a.m70470y0(new Function1() { // from class: com.transsion.moviedetail.fragment.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MovieDetailFragment.m70331i1(restrictTipsDialogM70471a, this, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final Unit m70331i1(RestrictTipsDialog restrictTipsDialog, MovieDetailFragment movieDetailFragment, boolean z11) {
        if (z11) {
            InterfaceC24450a interfaceC24450a = movieDetailFragment.playerControl;
            if (interfaceC24450a != null) {
                interfaceC24450a.onHandlePlay();
            }
        } else {
            FragmentActivity activity = restrictTipsDialog.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: j1 */
    private final void m70333j1() {
        ConstraintLayout constraintLayoutM93376b;
        C23600h mViewBinding = getMViewBinding();
        if (mViewBinding == null || (constraintLayoutM93376b = mViewBinding.getRoot()) == null) {
            return;
        }
        constraintLayoutM93376b.post(new Runnable() { // from class: com.transsion.moviedetail.fragment.a0
            @Override // java.lang.Runnable
            public final void run() {
                MovieDetailFragment.m70335k1(this.f54683a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final void m70335k1(MovieDetailFragment movieDetailFragment) {
        Subject subject;
        String subjectId;
        String ops;
        FragmentActivity activity = movieDetailFragment.getActivity();
        if (activity == null || (subject = movieDetailFragment.mMovieDetailBean) == null || (subjectId = subject.getSubjectId()) == null) {
            return;
        }
        InterfaceC27135b interfaceC27135bM105597c = InterfaceC27135b.f82245a.m105597c();
        Subject subject2 = movieDetailFragment.mMovieDetailBean;
        interfaceC27135bM105597c.mo86624e(activity, subjectId, null, "subjectdetail", (subject2 == null || (ops = subject2.getOps()) == null) ? movieDetailFragment.ops : ops);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final Unit m70337l1(MovieDetailFragment movieDetailFragment, Pair pair) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        HashMap mapM96844g3;
        movieDetailFragment.tsCallback = SystemClock.elapsedRealtime();
        Subject subject = (Subject) pair.getSecond();
        MovieDetailActivity.INSTANCE.m70152a("movie_detail get movie detail data --> it = " + subject);
        if (subject == null) {
            if (Intrinsics.m97797c(pair.getFirst(), "404")) {
                C13806h.f49015a.m62324k(R$string.movie_lost_content);
                AbstractC25136k.m99058d(AbstractC3226v.m14968a(movieDetailFragment), null, null, new MovieDetailFragment$initViewModel$1$1$1(movieDetailFragment, null), 3, null);
            }
            if (C27287m.f83003a.m106330e()) {
                PageStatusFragment.showEmptyView$default(movieDetailFragment, false, 1, null);
            } else {
                PageStatusFragment.showNoNetworkView$default(movieDetailFragment, false, 1, null);
            }
        } else {
            if (subject.getIsRefreshViewOnly()) {
                movieDetailFragment.m70310N1(subject);
                return Unit.f75682a;
            }
            MovieDetailViewModel movieDetailViewModelM70319V0 = movieDetailFragment.m70319V0();
            String subjectId = subject.getSubjectId();
            Integer subjectType = subject.getSubjectType();
            Context context = movieDetailFragment.getContext();
            MovieDetailViewModel.m70906u(movieDetailViewModelM70319V0, subjectId, subjectType, 0, context != null && AbstractC14556b.m65670a(context), 4, null);
            Integer subjectType2 = subject.getSubjectType();
            movieDetailFragment.mSubjectType = subjectType2 != null ? subjectType2.intValue() : movieDetailFragment.mSubjectType;
            movieDetailFragment.showContentView();
            movieDetailFragment.netResultSuccess = true;
            movieDetailFragment.m70310N1(subject);
            movieDetailFragment.m70302J1();
            C24655b logViewConfig = movieDetailFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            C24655b logViewConfig2 = movieDetailFragment.getLogViewConfig();
            if (logViewConfig2 != null) {
                logViewConfig2.m96851n(movieDetailFragment.ops);
            }
            C24655b logViewConfig3 = movieDetailFragment.getLogViewConfig();
            if (logViewConfig3 != null && (mapM96844g3 = logViewConfig3.m96844g()) != null) {
                String subjectId2 = subject.getSubjectId();
                if (subjectId2 == null) {
                    subjectId2 = "";
                }
                mapM96844g3.put("subject_id", subjectId2);
            }
            C24655b logViewConfig4 = movieDetailFragment.getLogViewConfig();
            if (logViewConfig4 != null && (mapM96844g2 = logViewConfig4.m96844g()) != null) {
                mapM96844g2.put("has_resource", String.valueOf(subject.getHasResource()));
            }
            C24655b logViewConfig5 = movieDetailFragment.getLogViewConfig();
            if (logViewConfig5 != null && (mapM96844g = logViewConfig5.m96844g()) != null) {
                mapM96844g.put("module_name", movieDetailFragment.moduleName);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final Unit m70339m1(MovieDetailFragment movieDetailFragment, DownloadListBean downloadListBean) {
        movieDetailFragment.fetchDownloadFinish = true;
        Subject subject = movieDetailFragment.mMovieDetailBean;
        if (subject != null) {
            Integer subjectType = subject.getSubjectType();
            int value = SubjectType.EDUCATION.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                movieDetailFragment.m70290D1(movieDetailFragment.mMovieDetailBean);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final Unit m70341n1(MovieDetailFragment movieDetailFragment, Integer num) {
        int i11 = movieDetailFragment.curSeason;
        if (num != null && i11 == num.intValue()) {
            return Unit.f75682a;
        }
        Intrinsics.m97799e(num);
        movieDetailFragment.curSeason = num.intValue();
        String str = movieDetailFragment.mSubjectId;
        if (str != null) {
            movieDetailFragment.m70319V0().m70909D(str, Integer.valueOf(movieDetailFragment.curSeason), true);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final Unit m70343o1(MovieDetailFragment movieDetailFragment, DubsInfo dubsInfo) {
        InterfaceC24450a interfaceC24450a = movieDetailFragment.playerControl;
        movieDetailFragment.curAudioTrackPlayProgress = interfaceC24450a != null ? interfaceC24450a.currentPosition() : 0L;
        movieDetailFragment.mSubjectId = dubsInfo.getSubjectId();
        movieDetailFragment.mMovieDetailBean = null;
        MovieDetailViewModel movieDetailViewModelM70319V0 = movieDetailFragment.m70319V0();
        int i11 = movieDetailFragment.preloadId;
        String str = movieDetailFragment.mSubjectId;
        if (str == null) {
            str = "";
        }
        movieDetailViewModelM70319V0.m70918S(i11, str, Integer.valueOf(movieDetailFragment.curSeason));
        movieDetailFragment.loadDefaultData();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: p1 */
    private final boolean m70345p1() {
        Boolean hasResource;
        Subject subject = this.mMovieDetailBean;
        if (subject == null || (hasResource = subject.getHasResource()) == null) {
            return false;
        }
        return hasResource.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final InterfaceC22998b m70347q1() {
        return (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
    }

    /* JADX INFO: renamed from: r1 */
    private final void m70349r1() {
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Function1 function1 = new Function1() { // from class: com.transsion.moviedetail.fragment.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MovieDetailFragment.m70351s1(this.f54776a, (AddToDownloadEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = AddToDownloadEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent((AppCompatActivity) context, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final Unit m70351s1(MovieDetailFragment movieDetailFragment, AddToDownloadEvent value) {
        Intrinsics.m97802h(value, "value");
        try {
            if (!TextUtils.equals(value.getSubjectId(), movieDetailFragment.mSubjectId)) {
                return Unit.f75682a;
            }
            if (movieDetailFragment.downloadViewFloat != null) {
                m70308M1(movieDetailFragment, 0, 1, null);
            }
            return Unit.f75682a;
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
    }

    /* JADX INFO: renamed from: t1 */
    private final void m70353t1(boolean show) {
        String genre;
        Subject subject = this.mMovieDetailBean;
        if (subject == null || (genre = subject.getGenre()) == null) {
            return;
        }
        String lowerCase = genre.toLowerCase(Locale.ROOT);
        Intrinsics.m97801g(lowerCase, "toLowerCase(...)");
        if (lowerCase == null || !StringsKt.m98132c0(lowerCase, "game", false, 2, null)) {
            return;
        }
        if (show) {
            InterfaceC22998b interfaceC22998bM70318U0 = m70318U0();
            if (interfaceC22998bM70318U0 != null) {
                interfaceC22998bM70318U0.mo69854h();
                return;
            }
            return;
        }
        InterfaceC22998b interfaceC22998bM70318U1 = m70318U0();
        if (interfaceC22998bM70318U1 != null) {
            interfaceC22998bM70318U1.mo69866t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public final void m70355u1(LongVodUiType uiType) {
        if (this.gameResView == null || uiType != LongVodUiType.MIDDLE) {
            return;
        }
        m70298H1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public final void m70357v1(C24715a bean) {
        Navigator navigatorM61857K = TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SUBJECT_PLAY").m61857K("subject_id", this.mSubjectId);
        Subject subject = this.mMovieDetailBean;
        if (subject != null && subject.getType() == 3 && bean != null) {
            navigatorM61857K.m61855I("TV_DATA", new FbTvData(bean.m97059o(), bean.m97056l(), bean.m97049e()));
        }
        Navigator.m61845x(navigatorM61857K, requireContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: w1 */
    private final void m70359w1(Trailer trailer) {
        Subject subject;
        String averageHueLight;
        String thumbnail;
        String url;
        Subject subject2 = this.mMovieDetailBean;
        if (subject2 == null || !subject2.isFamilyModeIntercept()) {
            m70300I1();
            String str = this.mSubjectId;
            if (str == null || (subject = this.mMovieDetailBean) == null) {
                return;
            }
            PlayMimeType playMimeType = PlayMimeType.DEFAULT;
            long j11 = this.curAudioTrackPlayProgress;
            String title = subject.getTitle();
            String str2 = title == null ? "" : title;
            String str3 = this.lastPageFrom;
            String str4 = str3 == null ? "" : str3;
            List listM70321Y0 = m70321Y0(trailer);
            Cover cover = trailer.getCover();
            String str5 = (cover == null || (url = cover.getUrl()) == null) ? "" : url;
            Cover cover2 = trailer.getCover();
            String str6 = (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail;
            Cover cover3 = subject.getCover();
            String str7 = (cover3 == null || (averageHueLight = cover3.getAverageHueLight()) == null) ? "" : averageHueLight;
            Integer durationSeconds = subject.getDurationSeconds();
            int iIntValue = durationSeconds != null ? durationSeconds.intValue() : 0;
            Integer subjectType = subject.getSubjectType();
            C24715a c24715a = new C24715a(str, playMimeType, j11, 0, 0, str2, null, str4, "subjectdetail", listM70321Y0, str5, str6, str7, iIntValue, Integer.valueOf(subjectType != null ? subjectType.intValue() : 1), false, subject.getTitle(), subject.getOps(), 32832, null);
            c24715a.m97070z(this.mMovieDetailBean);
            C26866a.f81698a.m104912c("movie_detail", "playTrailer  addDataSource:" + c24715a + "  playerControl:" + this.playerControl, true);
            InterfaceC24450a interfaceC24450a = this.playerControl;
            if (interfaceC24450a != null) {
                interfaceC24450a.setDataSource(c24715a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final InterfaceC23888a m70361x1() {
        return (InterfaceC23888a) TheRouter.m61774d(InterfaceC23888a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public final void m70364z1(long tsLayoutDone) {
        if (this.tsEnter == 0) {
            return;
        }
        HashMap map = new HashMap();
        String str = this.mSubjectId;
        if (str == null) {
            str = "";
        }
        map.put("subject_id", str);
        map.put("t_request", String.valueOf(this.tsRequestStart - this.tsEnter));
        map.put("t_callback", String.valueOf(this.tsCallback - this.tsEnter));
        map.put("t_init_start", String.valueOf(this.tsInitStart - this.tsEnter));
        map.put("t_init_done", String.valueOf(this.tsInitDone - this.tsEnter));
        map.put("t_add_view", String.valueOf(this.tsAddView - this.tsEnter));
        map.put("t_layout_done", String.valueOf(tsLayoutDone - this.tsEnter));
        C24662i.f75350a.m96884s("subjectdetail", "app_perf", map);
    }

    @Override // co.InterfaceC5146a
    /* JADX INFO: renamed from: S */
    public void mo24053S(Function0 callback) {
        this.backPressedCallback = callback;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C23600h getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23600h c23600hM93374c = C23600h.m93374c(inflater);
        Intrinsics.m97801g(c23600hM93374c, "inflate(...)");
        return c23600hM93374c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.default_movie_detail_skeleton_drawing_layout_2, (ViewGroup) getFlStateView(), false);
        ((AppCompatImageView) viewInflate.findViewById(R$id.ivBack)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MovieDetailFragment.m70317T0(this.f54784a, view);
            }
        });
        return viewInflate;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        C23600h mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f71950j.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MovieDetailFragment.m70328f1(this.f54788a, view);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        View view;
        C23600h mViewBinding = getMViewBinding();
        if (mViewBinding != null && (view = mViewBinding.f71960t) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c2308b).height = AbstractC5781d.m27351c();
            view.setLayoutParams(c2308b);
        }
        requireActivity().getOnBackPressedDispatcher().m942i(this, new C15948c());
        m70349r1();
        m70322Z0();
        m70333j1();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        MovieDetailViewModel movieDetailViewModelM70319V0 = m70319V0();
        movieDetailViewModelM70319V0.m70910F().m14851j(this, new C15949d(new Function1() { // from class: com.transsion.moviedetail.fragment.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MovieDetailFragment.m70337l1(this.f54688a, (Pair) obj);
            }
        }));
        movieDetailViewModelM70319V0.m70926y().m14851j(this, new C15949d(new Function1() { // from class: com.transsion.moviedetail.fragment.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MovieDetailFragment.m70339m1(this.f54718a, (DownloadListBean) obj);
            }
        }));
        movieDetailViewModelM70319V0.m70914K().m14851j(this, new C15949d(new Function1() { // from class: com.transsion.moviedetail.fragment.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MovieDetailFragment.m70341n1(this.f54722a, (Integer) obj);
            }
        }));
        movieDetailViewModelM70319V0.m70916P().m14851j(this, new C15949d(new Function1() { // from class: com.transsion.moviedetail.fragment.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MovieDetailFragment.m70343o1(this.f54727a, (DubsInfo) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isRegisteDeviceKeyMonitor() {
        return true;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        HashMap mapM96844g;
        MovieDetailActivity.INSTANCE.m70152a("movie_detail start load data ....");
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            String str = this.mSubjectId;
            if (str == null) {
                str = "";
            }
            mapM96844g.put("subject_id", str);
        }
        Bundle arguments = getArguments();
        this.ops = arguments != null ? arguments.getString("ops") : null;
        if (C27287m.f83003a.m106330e()) {
            showLoadingView();
            String str2 = this.mSubjectId;
            if (str2 != null) {
                this.tsRequestStart = SystemClock.elapsedRealtime();
                MovieDetailViewModel.m70874E(m70319V0(), str2, Integer.valueOf(this.curSeason), false, 4, null);
            }
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("subjectdetail", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MovieDetailActivity.INSTANCE.m70152a("movie_detail------- onCreate ------");
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.onPageDestroy();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, com.transsion.baselib.utils.DeviceKeyMonitor.InterfaceC14502b
    public void onHomeClick() {
        super.onHomeClick();
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "MovieDetailFragment onHomeClick", false, 4, null);
        m70292E1(FloatActionType.HOME);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C27136c c27136c = C27136c.f82250a;
        InterfaceC24450a interfaceC24450a = this.playerControl;
        c27136c.m105602c(interfaceC24450a != null ? interfaceC24450a.getPlayer() : null);
        m70353t1(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        if (isInPictureInPictureMode) {
            FragmentActivity activity = getActivity();
            if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            C27425a c27425aM70316S0 = m70316S0();
            if (c27425aM70316S0 != null && Build.VERSION.SDK_INT >= 31) {
                InterfaceC27138e.f82251a.m105606b().mo86572g(activity, c27425aM70316S0);
            }
        }
        InterfaceC27138e.f82251a.m105606b().onPipModeChanged(isInPictureInPictureMode);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, com.transsion.baselib.utils.DeviceKeyMonitor.InterfaceC14502b
    public void onRecentClick() {
        super.onRecentClick();
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "MovieDetailFragment onRecentClick", false, 4, null);
        m70292E1(FloatActionType.HOME);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.onViewResume();
        }
        m70353t1(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        InterfaceC24450a interfaceC24450a;
        super.onStop();
        C27136c c27136c = C27136c.f82250a;
        InterfaceC24450a interfaceC24450a2 = this.playerControl;
        if (c27136c.m105602c(interfaceC24450a2 != null ? interfaceC24450a2.getPlayer() : null) || (interfaceC24450a = this.playerControl) == null) {
            return;
        }
        interfaceC24450a.onViewPause();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        Bundle arguments = getArguments();
        Long lValueOf = arguments != null ? Long.valueOf(arguments.getLong("ts_enter", 0L)) : null;
        if (lValueOf != null && lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        this.tsEnter = lValueOf != null ? lValueOf.longValue() : SystemClock.elapsedRealtime();
        this.lastPageFrom = C24662i.f75350a.m96877i();
        Bundle arguments2 = getArguments();
        this.ops = arguments2 != null ? arguments2.getString("ops") : null;
        Bundle arguments3 = getArguments();
        this.mSubjectId = arguments3 != null ? arguments3.getString("id") : null;
        Bundle arguments4 = getArguments();
        this.mSubjectType = arguments4 != null ? arguments4.getInt("subject_type", this.mSubjectType) : this.mSubjectType;
        Bundle arguments5 = getArguments();
        this.autoDownload = arguments5 != null ? arguments5.getBoolean("auto_download") : false;
        Bundle arguments6 = getArguments();
        this.autoPlay = arguments6 != null ? arguments6.getBoolean("auto_play") : false;
        Bundle arguments7 = getArguments();
        this.autoPlayResourceId = arguments7 != null ? arguments7.getString("auto_play_resource_id") : null;
        Bundle arguments8 = getArguments();
        this.preloadId = arguments8 != null ? arguments8.getInt("yy_preload_id") : 0;
        Bundle arguments9 = getArguments();
        this.moduleName = arguments9 != null ? arguments9.getString("module_name") : null;
        Bundle arguments10 = getArguments();
        this.curSeason = arguments10 != null ? arguments10.getInt("season") : 1;
        MovieDetailViewModel movieDetailViewModelM70319V0 = m70319V0();
        int i11 = this.preloadId;
        String str = this.mSubjectId;
        if (str == null) {
            str = "";
        }
        movieDetailViewModelM70319V0.m70918S(i11, str, Integer.valueOf(this.curSeason));
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96847j(this.lastPageFrom);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        if (this.mMovieDetailBean == null) {
            loadDefaultData();
        }
    }

    /* JADX INFO: renamed from: y1 */
    public final void m70366y1() {
        InterfaceC24450a interfaceC24450a;
        C27136c c27136c = C27136c.f82250a;
        InterfaceC24450a interfaceC24450a2 = this.playerControl;
        if (!c27136c.m105602c(interfaceC24450a2 != null ? interfaceC24450a2.getPlayer() : null) && (interfaceC24450a = this.playerControl) != null) {
            interfaceC24450a.release();
        }
        InterfaceC24450a interfaceC24450a3 = this.playerControl;
        if (interfaceC24450a3 != null) {
            interfaceC24450a3.onPageDestroy();
        }
    }
}
