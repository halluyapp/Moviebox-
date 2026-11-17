package com.transsion.shorttv.p315ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.miniapp.utils.toast.ToastStrategy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.player.config.RenderType;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.shorttv.R$mipmap;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.base.fragment.PageStatusFragment;
import com.transsion.shorttv.base.pager.PagerLayoutManager;
import com.transsion.shorttv.base.util.DeviceKeyMonitor;
import com.transsion.shorttv.base.widget.AbstractC18797k;
import com.transsion.shorttv.base.widget.DefaultView;
import com.transsion.shorttv.base.widget.NoNetworkBigView;
import com.transsion.shorttv.base.widget.toast.core.C18812h;
import com.transsion.shorttv.bean.DubsInfo;
import com.transsion.shorttv.bean.DubsInfoData;
import com.transsion.shorttv.bean.Media;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.bean.ShortTvInfoEpisodeList;
import com.transsion.shorttv.bean.ShortTvInnerPlayBean;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p315ui.activity.ShortTvListActivity;
import com.transsion.shorttv.p315ui.adapter.C18908g;
import com.transsion.shorttv.p315ui.dialog.ShortTvEpisodeListDialog;
import com.transsion.shorttv.p315ui.widget.InterfaceC19112d;
import com.transsion.shorttv.p315ui.widget.ShortTvLoadMoreView;
import com.transsion.shorttv.p315ui.widget.ShortTvPagerChangeControl;
import com.transsion.shorttv.p315ui.widget.ShortTvVideoItemView;
import com.transsion.shorttv.utils.C19162e;
import com.transsion.shorttv.utils.C19165h;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import es.C23219b;
import fo.C23403e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25136k;
import p356ds.AbstractC23048b;
import p393f.C23284j;
import p550kj.C24655b;
import p550kj.C24662i;
import p557ks.C25427b;
import p654oo.C26372e;
import p654oo.InterfaceC26373f;
import p659os.AbstractC26725k;
import p659os.AbstractC26726l;
import p659os.C26717c;
import p659os.C26719e;
import p659os.C26724j;
import p683po.C26906c;
import p683po.C26907d;
import p717qr.C27124c;
import p743rh.C27287m;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p848vs.InterfaceC28213d;
import p848vs.InterfaceC28215f;
import p848vs.InterfaceC28216g;
import p848vs.InterfaceC28218i;
import p848vs.InterfaceC28222m;
import p919xs.C28654b;
import pg.C26866a;
import rs.C27333c0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002Ì\u0001\u0018\u0000 Þ\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002ß\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0005J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u0005J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0005J\u0017\u0010)\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0017H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0017H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0017H\u0002¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010\u0005J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0017H\u0002¢\u0006\u0004\b0\u0010%J\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u0010\u0005J\u000f\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u0010\u0005J\u0011\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u0010\u0005J#\u0010;\u001a\u00020\u00062\u0006\u00108\u001a\u0002072\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000609¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0006¢\u0006\u0004\b=\u0010\u0005J\r\u0010>\u001a\u00020\u0006¢\u0006\u0004\b>\u0010\u0005J\u0017\u0010A\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\bH\u0016¢\u0006\u0004\bF\u0010\nJ\u0019\u0010I\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0006H\u0016¢\u0006\u0004\bN\u0010\u0005J\u001f\u0010S\u001a\u00020\u00062\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0006H\u0016¢\u0006\u0004\bU\u0010\u0005J\u000f\u0010V\u001a\u00020\u0006H\u0016¢\u0006\u0004\bV\u0010\u0005J\u000f\u0010W\u001a\u00020\u0006H\u0016¢\u0006\u0004\bW\u0010\u0005J\u0015\u0010X\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0017¢\u0006\u0004\bX\u0010%J\r\u0010Y\u001a\u00020\u0006¢\u0006\u0004\bY\u0010\u0005J\r\u0010Z\u001a\u00020\u0006¢\u0006\u0004\bZ\u0010\u0005J\u000f\u0010[\u001a\u00020\u0006H\u0016¢\u0006\u0004\b[\u0010\u0005J\r\u0010\\\u001a\u00020\u0006¢\u0006\u0004\b\\\u0010\u0005J\r\u0010]\u001a\u00020\u0006¢\u0006\u0004\b]\u0010\u0005J\u000f\u0010^\u001a\u00020\u0006H\u0016¢\u0006\u0004\b^\u0010\u0005J\u0017\u0010`\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\bH\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u0006H\u0016¢\u0006\u0004\bb\u0010\u0005J\u000f\u0010c\u001a\u00020\u0006H\u0016¢\u0006\u0004\bc\u0010\u0005J\r\u0010d\u001a\u00020\u0006¢\u0006\u0004\bd\u0010\u0005J\u0019\u0010g\u001a\u00020\u00062\b\u0010f\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\bg\u0010hJ\u0019\u0010j\u001a\u00020\u00062\b\u0010i\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bj\u0010kJ!\u0010n\u001a\u00020\u00062\u0006\u0010m\u001a\u00020l2\b\u0010f\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\bn\u0010oJ\u0019\u0010p\u001a\u00020\u00062\b\u0010f\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\bp\u0010hJ\u000f\u0010q\u001a\u00020\u0006H\u0016¢\u0006\u0004\bq\u0010\u0005J\u000f\u0010r\u001a\u00020\u0006H\u0016¢\u0006\u0004\br\u0010\u0005J\r\u0010s\u001a\u00020C¢\u0006\u0004\bs\u0010EJ\u0019\u0010t\u001a\u00020\u00062\b\u0010f\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\bt\u0010hJ\u0019\u0010u\u001a\u00020\u00062\b\u0010f\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\bu\u0010hJ\u0017\u0010w\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\bH\u0016¢\u0006\u0004\bw\u0010aJ\u000f\u0010x\u001a\u00020\u0006H\u0016¢\u0006\u0004\bx\u0010\u0005J\u0017\u0010z\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\bH\u0016¢\u0006\u0004\bz\u0010aR\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u0010\u0081\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R!\u0010\u0084\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R)\u0010\u008a\u0001\u001a\u0014\u0012\u000f\u0012\r \u0087\u0001*\u0005\u0018\u00010\u0086\u00010\u0086\u00010\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u0091\u0001\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001b\u0010\u0093\u0001\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0090\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0019\u0010\u0099\u0001\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0090\u0001R\u0019\u0010\u009b\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0080\u0001R!\u0010¡\u0001\u001a\u00030\u009c\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001c\u0010\u00ad\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001c\u0010±\u0001\u001a\u0005\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001c\u0010µ\u0001\u001a\u0005\u0018\u00010²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0018\u0010(\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001a\u0010¹\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u008d\u0001R\u0019\u0010»\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010\u0080\u0001R\u0019\u0010½\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010\u0080\u0001R\u0017\u0010¿\u0001\u001a\u00020C8\u0002X\u0082D¢\u0006\b\n\u0006\b¾\u0001\u0010\u0090\u0001R\u0019\u0010Á\u0001\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010\u0090\u0001R\u0019\u0010Ã\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010\u0080\u0001R'\u0010Ç\u0001\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bÄ\u0001\u0010\u0080\u0001\u001a\u0005\bÅ\u0001\u0010\n\"\u0005\bÆ\u0001\u0010aR\u001c\u0010Ë\u0001\u001a\u0005\u0018\u00010È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R*\u0010Ô\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010\u008d\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R\u001a\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010Õ\u0001R\u0018\u0010Ù\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R\u001c\u0010Ý\u0001\u001a\u0005\u0018\u00010Ú\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001¨\u0006à\u0001"}, m97100d2 = {"Lcom/transsion/shorttv/ui/fragment/ShortTvDetailListFragment;", "Lcom/transsion/shorttv/base/fragment/PageStatusFragment;", "Lrs/c0;", "Lcom/transsion/player/orplayer/f;", "<init>", "()V", "", "initView", "", "D0", "()Z", "U0", "initAdapter", "Lcom/transsion/shorttv/bean/ShortTvInfoEpisodeList;", "subjectBean", "s1", "(Lcom/transsion/shorttv/bean/ShortTvInfoEpisodeList;)V", "", "Los/k;", "shortTVItems", "q1", "(Ljava/util/List;)V", "C0", "", "G0", "(Ljava/util/List;)I", "showNotNetError", "showEmpty", "Landroid/content/Context;", "context", "Landroid/view/View;", "getEmptyView", "(Landroid/content/Context;)Landroid/view/View;", "getNotNetErrorView", "loadData", "selectEp", "F0", "(I)V", "j1", "B0", "ep", "N0", "(I)I", "O0", "()I", "H0", "E0", "toPosition", "scrollToPosition", "S0", "o1", "Los/j;", "J0", "()Los/j;", "initAd", "Lvs/i;", "loginProvider", "Lkotlin/Function0;", "onSuccess", "e1", "(Lvs/i;Lkotlin/jvm/functions/Function0;)V", "n1", "p1", "Landroid/view/LayoutInflater;", "inflater", "P0", "(Landroid/view/LayoutInflater;)Lrs/c0;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isAudioShowNoNetworkLayout", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "initViewData", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "initViewModel", "initListener", "retryLoadData", "k1", "hideLoading", "startLoading", "onResume", "g1", "h1", "onPause", "hidden", "onHiddenChanged", "(Z)V", "logPause", "logResume", "i1", "Lfo/e;", "mediaSource", "onCompletion", "(Lfo/e;)V", "uuid", "onMediaItemTransition", "(Ljava/lang/String;)V", "Lcom/transsion/player/orplayer/PlayError;", "errorInfo", "onPlayError", "(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V", "onPrepare", "onDestroyView", "onDestroy", "getPageName", "onVideoPause", "onVideoStart", "videoPlaying", "r1", "onStop", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Lcom/transsion/shorttv/ui/dialog/ShortTvEpisodeListDialog;", "i", "Lcom/transsion/shorttv/ui/dialog/ShortTvEpisodeListDialog;", "shortListDialog", "j", "Z", "isNewPlayer", CampaignEx.JSON_KEY_AD_K, "Lkotlin/jvm/functions/Function0;", "loginSuccessCallback", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "l", "Landroidx/activity/result/b;", "loginLauncher", "", "m", "J", "lastShowNetWorkErrToastTime", "n", "Ljava/lang/String;", "mSubjectId", "o", "mOps", "Lcom/transsion/shorttv/bean/Subject;", TtmlNode.TAG_P, "Lcom/transsion/shorttv/bean/Subject;", "mSubject", CampaignEx.JSON_KEY_AD_Q, "mItemType", CampaignEx.JSON_KEY_AD_R, "fromTrending", "Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "s", "Lkotlin/Lazy;", "K0", "()Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "mShortTvViewModel", "Lcom/transsion/shorttv/base/pager/PagerLayoutManager;", "t", "Lcom/transsion/shorttv/base/pager/PagerLayoutManager;", "mPagerLayoutManager", "Lcom/transsion/shorttv/ui/widget/ShortTvPagerChangeControl;", TmcStartParams.KEY_URL_SHORT, "Lcom/transsion/shorttv/ui/widget/ShortTvPagerChangeControl;", "mPagerChangeControl", "Lcom/transsion/shorttv/ui/adapter/g;", "v", "Lcom/transsion/shorttv/ui/adapter/g;", "mAdapter", "Loo/f;", "w", "Loo/f;", "mOrPlayer", "Lcom/transsion/player/ui/ORPlayerView;", "x", "Lcom/transsion/player/ui/ORPlayerView;", "mOrPlayerView", "y", "I", "z", "ms", "A", "openDownload", "B", "hasTrailer", "C", "loggerTag", "D", "lastPageFrom", "E", "isHistoryFirst", "F", "isClickPause$shortTvLib_release", "m1", "isClickPause", "Lcom/transsion/shorttv/base/util/DeviceKeyMonitor;", "G", "Lcom/transsion/shorttv/base/util/DeviceKeyMonitor;", "deviceKeyMonitor", "com/transsion/shorttv/ui/fragment/ShortTvDetailListFragment$b", "H", "Lcom/transsion/shorttv/ui/fragment/ShortTvDetailListFragment$b;", "loadingHandler", "getResumeTimeStamp", "()J", "setResumeTimeStamp", "(J)V", "resumeTimeStamp", "Lcom/transsion/player/orplayer/PlayError;", "Lvs/m;", "K", "Lvs/m;", "downloadListener", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "L", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "middleListManager", "M", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvDetailListFragment extends PageStatusFragment<C27333c0> implements InterfaceC16633f {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean openDownload;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean hasTrailer;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final String loggerTag;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private String lastPageFrom;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean isHistoryFirst;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean isClickPause;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private DeviceKeyMonitor deviceKeyMonitor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final HandlerC18999b loadingHandler;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private long resumeTimeStamp;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private PlayError errorInfo;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC28222m downloadListener;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private BiddingListManager middleListManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ShortTvEpisodeListDialog shortListDialog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isNewPlayer = true;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Function0 loginSuccessCallback;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final AbstractC0249b loginLauncher;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private long lastShowNetWorkErrToastTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String mOps;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Subject mSubject;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private String mItemType;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean fromTrending;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Lazy mShortTvViewModel;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private PagerLayoutManager mPagerLayoutManager;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private ShortTvPagerChangeControl mPagerChangeControl;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private C18908g mAdapter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private InterfaceC26373f mOrPlayer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ORPlayerView mOrPlayerView;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int ep;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private long ms;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTvDetailListFragment$b */
    public static final class HandlerC18999b extends Handler {

        /* JADX INFO: renamed from: a */
        private final int f61197a;

        /* JADX INFO: renamed from: b */
        private final long f61198b;

        HandlerC18999b(Looper looper) {
            super(looper);
            this.f61197a = 1;
            this.f61198b = 300L;
        }

        /* JADX INFO: renamed from: a */
        public final long m79907a() {
            return this.f61198b;
        }

        /* JADX INFO: renamed from: b */
        public final int m79908b() {
            return this.f61197a;
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            C27333c0 c27333c0;
            ProgressBar progressBar;
            Intrinsics.m97802h(msg, "msg");
            super.handleMessage(msg);
            if (msg.what != this.f61197a || (c27333c0 = (C27333c0) ShortTvDetailListFragment.this.getMViewBinding()) == null || (progressBar = c27333c0.f83096b) == null) {
                return;
            }
            AbstractC23048b.m91694e(progressBar);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTvDetailListFragment$c */
    public static final class C19000c implements DeviceKeyMonitor.InterfaceC18779b {
        C19000c() {
        }

        @Override // com.transsion.shorttv.base.util.DeviceKeyMonitor.InterfaceC18779b
        public void onHomeClick() {
            ShortTvDetailListFragment.this.m79883o1();
        }

        @Override // com.transsion.shorttv.base.util.DeviceKeyMonitor.InterfaceC18779b
        public void onRecentClick() {
            ShortTvDetailListFragment.this.m79883o1();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTvDetailListFragment$d */
    static final class C19001d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f61201a;

        C19001d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f61201a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f61201a;
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
            this.f61201a.invoke(obj);
        }
    }

    public ShortTvDetailListFragment() {
        AbstractC0249b abstractC0249bRegisterForActivityResult = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.shorttv.ui.fragment.g0
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                ShortTvDetailListFragment.m79871f1(this.f61306a, (ActivityResult) obj);
            }
        });
        Intrinsics.m97801g(abstractC0249bRegisterForActivityResult, "registerForActivityResult(...)");
        this.loginLauncher = abstractC0249bRegisterForActivityResult;
        this.mSubjectId = "";
        this.mItemType = "";
        this.mShortTvViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(ShortTvViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv.ui.fragment.ShortTvDetailListFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv.ui.fragment.ShortTvDetailListFragment$special$$inlined$activityViewModels$default$2
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
        this.ep = -1;
        this.loggerTag = "ShortTvListFragment";
        this.lastPageFrom = "";
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.m97799e(looperMyLooper);
        this.loadingHandler = new HandlerC18999b(looperMyLooper);
        this.downloadListener = new InterfaceC28222m() { // from class: com.transsion.shorttv.ui.fragment.ShortTvDetailListFragment$downloadListener$1
            @Override // p848vs.InterfaceC28222m
            /* JADX INFO: renamed from: a */
            public void mo79909a(String str, int i11) {
                AbstractC26725k abstractC26725k;
                List<Object> data;
                Object next;
                if (Intrinsics.m97797c(str, this.f61202a.mSubjectId)) {
                    InterfaceC28213d interfaceC28213dM80392s0 = this.f61202a.m79851K0().m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        interfaceC28213dM80392s0.mo73645k(this.f61202a.getActivity(), str, i11);
                    }
                    C18908g c18908g = this.f61202a.mAdapter;
                    if (c18908g == null || (data = c18908g.getData()) == null) {
                        abstractC26725k = null;
                    } else {
                        Iterator<T> it = data.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            AbstractC26725k abstractC26725k2 = (AbstractC26725k) next;
                            if ((abstractC26725k2 instanceof C26719e) && ((C26719e) abstractC26725k2).m104511c() == i11) {
                                break;
                            }
                        }
                        abstractC26725k = (AbstractC26725k) next;
                    }
                    C26719e c26719e = (C26719e) abstractC26725k;
                    if (c26719e != null) {
                        ShortTvDetailListFragment shortTvDetailListFragment = this.f61202a;
                        if (AbstractC26726l.m104526a(c26719e)) {
                            Integer num = (Integer) shortTvDetailListFragment.m79851K0().m80384j0().m14847f();
                            int iM104511c = c26719e.m104511c();
                            if (num != null && num.intValue() == iM104511c) {
                                return;
                            }
                            AbstractC25136k.m99058d(AbstractC3226v.m14968a(shortTvDetailListFragment), null, null, new C19002xd05232c3(c26719e, shortTvDetailListFragment, null), 3, null);
                        }
                    }
                }
            }
        };
    }

    /* JADX INFO: renamed from: B0 */
    private final void m79842B0() {
        List<Object> data;
        C18908g c18908g = this.mAdapter;
        if (c18908g == null || (data = c18908g.getData()) == null) {
            return;
        }
        Integer num = (Integer) m79851K0().m80384j0().m14847f();
        if (num != null) {
            int iIntValue = num.intValue();
            int i11 = iIntValue + 1;
            C18908g c18908g2 = this.mAdapter;
            if ((c18908g2 != null ? c18908g2.m79556Q1(i11, this.hasTrailer) : null) != null) {
                m79851K0().m80375d1(i11);
                C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "autoPlayNext  currentEp:" + iIntValue + "  nextEp:" + i11, false, 4, null);
                return;
            }
        }
        ShortTvPagerChangeControl shortTvPagerChangeControl = this.mPagerChangeControl;
        int iM80082k = shortTvPagerChangeControl != null ? shortTvPagerChangeControl.m80082k() : 0;
        int size = data.size();
        for (int i12 = iM80082k + 1; i12 < size; i12++) {
            AbstractC26725k abstractC26725k = (AbstractC26725k) CollectionsKt.m97362l0(data, i12);
            if (abstractC26725k instanceof C26719e) {
                int iM104511c = ((C26719e) abstractC26725k).m104511c();
                m79851K0().m80375d1(iM104511c);
                C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "autoPlayNext  currentPosition:" + iM80082k + "  nextEp:" + iM104511c, false, 4, null);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    private final void m79843C0() {
        if (this.openDownload) {
            this.openDownload = false;
        }
    }

    /* JADX INFO: renamed from: D0 */
    private final boolean m79844D0() {
        Integer num = (Integer) m79851K0().m80384j0().m14847f();
        if (num == null) {
            return false;
        }
        int iIntValue = num.intValue();
        C18908g c18908g = this.mAdapter;
        C26719e c26719eM79556Q1 = c18908g != null ? c18908g.m79556Q1(iIntValue, this.hasTrailer) : null;
        if (!AbstractC26726l.m104527b(c26719eM79556Q1)) {
            return true;
        }
        if (!C23219b.f70761a.m92280c((Subject) m79851K0().m80343H0().m14847f(), c26719eM79556Q1 != null ? c26719eM79556Q1.m104512d() : null)) {
            startLoading();
        }
        m79846F0(iIntValue);
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    private final void m79845E0() {
        if (isAdded()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            String[] strArr = {"ShortTvLanguageSelectDialog", "ShortTvLanguageSelectDialog_Audio", "ShortTvLanguageSelectDialog_Subtitle"};
            for (int i11 = 0; i11 < 3; i11++) {
                Fragment fragmentM14547k0 = childFragmentManager.m14547k0(strArr[i11]);
                DialogFragment dialogFragment = fragmentM14547k0 instanceof DialogFragment ? (DialogFragment) fragmentM14547k0 : null;
                if (dialogFragment != null) {
                    dialogFragment.dismissAllowingStateLoss();
                }
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    private final void m79846F0(int selectEp) {
        if (m79851K0().m80341F0().m14847f() != null) {
            m79851K0().m80397w0(this.mSubjectId, selectEp);
        }
    }

    /* JADX INFO: renamed from: G0 */
    private final int m79847G0(List shortTVItems) {
        int ep2;
        ShortTvInnerPlayBean shortTvInnerPlayBean = (ShortTvInnerPlayBean) m79851K0().m80378f0().m14847f();
        Integer num = (Integer) m79851K0().m80384j0().m14847f();
        int iIntValue = num != null ? num.intValue() : -1;
        boolean zM105522b = C27124c.f82233a.m105540b().m105522b();
        C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "lastEp: " + iIntValue + ", historyItem: " + shortTvInnerPlayBean + ", size: " + shortTVItems.size(), false, 4, null);
        if (iIntValue >= 0 && iIntValue < shortTVItems.size()) {
            if (iIntValue != 0 || zM105522b) {
                return iIntValue;
            }
            return 1;
        }
        Object obj = null;
        Integer numValueOf = (shortTvInnerPlayBean == null || ((ep2 = shortTvInnerPlayBean.getEp()) == 0 && !zM105522b)) ? null : Integer.valueOf(ep2);
        int iIntValue2 = numValueOf != null ? numValueOf.intValue() : m79848H0();
        int i11 = this.ep;
        if (i11 <= 0 || !(!this.isHistoryFirst || numValueOf == null || numValueOf.intValue() == i11)) {
            return iIntValue2;
        }
        int i12 = this.ep;
        for (Object obj2 : shortTVItems) {
            AbstractC26725k abstractC26725k = (AbstractC26725k) obj2;
            if ((abstractC26725k instanceof C26719e) && ((C26719e) abstractC26725k).m104511c() == this.ep) {
                obj = obj2;
                break;
            }
        }
        C26719e c26719e = (C26719e) obj;
        Subject subject = this.mSubject;
        if (c26719e == null || subject == null) {
            m79851K0().m80351O();
        } else {
            m79851K0().m80393s1(subject, c26719e, this.ms);
        }
        return i12;
    }

    /* JADX INFO: renamed from: H0 */
    private final int m79848H0() {
        return (this.hasTrailer && C27124c.f82233a.m105540b().m105522b()) ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m79849I0(ShortTvDetailListFragment shortTvDetailListFragment, DefaultView defaultView, View view) {
        shortTvDetailListFragment.loadData();
        defaultView.setVisibility(8);
    }

    /* JADX INFO: renamed from: J0 */
    private final C26724j m79850J0() {
        String strM104513e;
        ShortTVItem shortTVItemM104512d;
        Integer num = (Integer) m79851K0().m80384j0().m14847f();
        if (num != null) {
            int iIntValue = num.intValue();
            List<AbstractC26725k> list = (List) m79851K0().m80341F0().m14847f();
            if (list != null && this.mOrPlayer != null && this.mOrPlayerView != null) {
                ArrayList arrayList = new ArrayList();
                AbstractC26725k abstractC26725k = null;
                for (AbstractC26725k abstractC26725k2 : list) {
                    if ((abstractC26725k2 instanceof C26719e) && ((C26719e) abstractC26725k2).m104511c() == iIntValue) {
                        abstractC26725k = abstractC26725k2;
                    }
                    arrayList.add(abstractC26725k2);
                }
                ORPlayerView oRPlayerView = this.mOrPlayerView;
                Intrinsics.m97799e(oRPlayerView);
                InterfaceC26373f interfaceC26373f = this.mOrPlayer;
                Intrinsics.m97799e(interfaceC26373f);
                C26719e c26719e = (C26719e) abstractC26725k;
                if (c26719e == null || (strM104513e = c26719e.m104513e()) == null) {
                    strM104513e = "";
                }
                String str = strM104513e;
                int se2 = (c26719e == null || (shortTVItemM104512d = c26719e.m104512d()) == null) ? 0 : shortTVItemM104512d.getSe();
                int iM104511c = c26719e != null ? c26719e.m104511c() : 1;
                String pageName = getPageName();
                Subject subject = this.mSubject;
                return new C26724j(oRPlayerView, interfaceC26373f, str, se2, iM104511c, pageName, subject != null ? subject.getOps() : null, this.lastPageFrom, arrayList);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public final ShortTvViewModel m79851K0() {
        return (ShortTvViewModel) this.mShortTvViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final Unit m79852L0(Context context, NoNetworkBigView noNetworkBigView, ShortTvDetailListFragment shortTvDetailListFragment) {
        if (C27287m.f83003a.m106334j(context)) {
            AbstractC23048b.m91691b(noNetworkBigView);
            shortTvDetailListFragment.hideLoading();
            shortTvDetailListFragment.loadData();
        } else {
            C25427b.f76996a.m99960d(R$string.short_tv_no_network_toast);
        }
        AbstractC18797k.m79223b(shortTvDetailListFragment.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final Unit m79853M0(ShortTvDetailListFragment shortTvDetailListFragment) {
        AbstractC18797k.m79224c(shortTvDetailListFragment.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: N0 */
    private final int m79854N0(int ep2) {
        return (this.hasTrailer || ep2 == 0) ? ep2 : ep2 - 1;
    }

    /* JADX INFO: renamed from: O0 */
    private final int m79855O0() {
        if (this.hasTrailer) {
            Subject subject = this.mSubject;
            return (subject != null ? subject.getTotalEpisode() : 0) + 1;
        }
        Subject subject2 = this.mSubject;
        if (subject2 != null) {
            return subject2.getTotalEpisode();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final Unit m79856Q0(ShortTvDetailListFragment shortTvDetailListFragment, int i11, BiddingNativeManager current) {
        List<Object> data;
        Intrinsics.m97802h(current, "current");
        if (current != null) {
            C26717c c26717c = new C26717c(current);
            C18908g c18908g = shortTvDetailListFragment.mAdapter;
            if (i11 <= ((c18908g == null || (data = c18908g.getData()) == null) ? 0 : data.size())) {
                C18908g c18908g2 = shortTvDetailListFragment.mAdapter;
                if (c18908g2 != null) {
                    c18908g2.mo36199n(i11, c26717c);
                }
            } else {
                C18908g c18908g3 = shortTvDetailListFragment.mAdapter;
                if (c18908g3 != null) {
                    c18908g3.mo36205p(c26717c);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final void m79857R0(ShortTvDetailListFragment shortTvDetailListFragment) {
        shortTvDetailListFragment.loadData();
    }

    /* JADX INFO: renamed from: S0 */
    private final void m79858S0() {
        FrameLayout root;
        C27333c0 c27333c0 = (C27333c0) getMViewBinding();
        if (c27333c0 == null || (root = c27333c0.getRoot()) == null) {
            return;
        }
        root.post(new Runnable() { // from class: com.transsion.shorttv.ui.fragment.h0
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvDetailListFragment.m79859T0(this.f61308a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final void m79859T0(ShortTvDetailListFragment shortTvDetailListFragment) {
        InterfaceC28216g interfaceC28216gM80400z0;
        String ops;
        FragmentActivity activity = shortTvDetailListFragment.getActivity();
        if (activity == null || (interfaceC28216gM80400z0 = shortTvDetailListFragment.m79851K0().m80400z0()) == null) {
            return;
        }
        String str = shortTvDetailListFragment.mSubjectId;
        String pageName = shortTvDetailListFragment.getPageName();
        Subject subject = shortTvDetailListFragment.mSubject;
        if (subject == null || (ops = subject.getOps()) == null) {
            ops = shortTvDetailListFragment.mOps;
        }
        interfaceC28216gM80400z0.mo73679b(activity, str, pageName, ops);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    private final void m79860U0() {
        InterfaceC16634g interfaceC16634gMo73681d;
        String subjectId;
        C26372e c26372e;
        ShortTVItem shortTVFirstEp;
        C23403e mediaSource;
        String subjectId2;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        this.mOrPlayerView = new ORPlayerView(fragmentActivityRequireActivity, RenderType.SURFACE_VIEW);
        InterfaceC28216g interfaceC28216gM80400z0 = m79851K0().m80400z0();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (interfaceC28216gM80400z0 != null) {
            Subject subject = this.mSubject;
            if (subject == null || (subjectId2 = subject.getSubjectId()) == null) {
                subjectId2 = this.mSubjectId;
            }
            interfaceC16634gMo73681d = interfaceC28216gM80400z0.mo73681d(subjectId2);
        } else {
            interfaceC16634gMo73681d = null;
        }
        int i11 = 1;
        boolean z11 = interfaceC16634gMo73681d == null;
        this.isNewPlayer = z11;
        C26866a.a aVar = C26866a.f81698a;
        String str = this.loggerTag;
        Subject subject2 = this.mSubject;
        if (subject2 == null || (subjectId = subject2.getSubjectId()) == null) {
            subjectId = this.mSubjectId;
        }
        C26866a.a.m104898f(aVar, str, "initOrPlayer isNewPlayer:" + z11 + ", mSubjectId:" + subjectId, false, 4, null);
        if (interfaceC16634gMo73681d != null) {
            c26372e = interfaceC16634gMo73681d instanceof C26372e ? (C26372e) interfaceC16634gMo73681d : null;
            if (c26372e != null) {
                ORPlayerView oRPlayerView = this.mOrPlayerView;
                c26372e.setSurfaceView(oRPlayerView != null ? oRPlayerView.getSurface() : null);
            } else {
                c26372e = null;
            }
        } else {
            c26372e = new C26372e(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
            ORPlayerView oRPlayerView2 = this.mOrPlayerView;
            c26372e.setSurfaceView(oRPlayerView2 != null ? oRPlayerView2.getSurface() : null);
        }
        this.mOrPlayer = c26372e;
        InterfaceC28216g interfaceC28216gM80400z1 = m79851K0().m80400z0();
        if (interfaceC28216gM80400z1 != null) {
            interfaceC28216gM80400z1.mo73680c();
        }
        InterfaceC26373f interfaceC26373f = this.mOrPlayer;
        if (interfaceC26373f != null) {
            interfaceC26373f.addPlayerListener(this);
        }
        Subject subject3 = this.mSubject;
        if (subject3 == null || (shortTVFirstEp = subject3.getShortTVFirstEp()) == null || (mediaSource = shortTVFirstEp.toMediaSource()) == null || !this.isNewPlayer) {
            return;
        }
        InterfaceC26373f interfaceC26373f2 = this.mOrPlayer;
        if (interfaceC26373f2 != null) {
            interfaceC26373f2.addDataSource(mediaSource);
        }
        InterfaceC26373f interfaceC26373f3 = this.mOrPlayer;
        if (interfaceC26373f3 != null) {
            interfaceC26373f3.prepare();
        }
        FragmentActivity activity = getActivity();
        ShortTvListActivity shortTvListActivity = activity instanceof ShortTvListActivity ? (ShortTvListActivity) activity : null;
        if (shortTvListActivity == null || !shortTvListActivity.getIsActivityPaused()) {
            return;
        }
        C26866a.a.m104898f(aVar, this.loggerTag, "initOrPlayer prepare, but isActivityPaused is true, pause", false, 4, null);
        InterfaceC26373f interfaceC26373f4 = this.mOrPlayer;
        if (interfaceC26373f4 != null) {
            interfaceC26373f4.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final Unit m79861V0(ShortTvDetailListFragment shortTvDetailListFragment, List list) {
        C27941f c27941fM36186h0;
        C18908g c18908g;
        C27941f c27941fM36186h1;
        List<Object> data;
        Object next;
        List list2;
        C18908g c18908g2;
        List<Object> data2;
        if (shortTvDetailListFragment.m79851K0().m80352O0() && (((list2 = list) == null || list2.isEmpty()) && ((c18908g2 = shortTvDetailListFragment.mAdapter) == null || (data2 = c18908g2.getData()) == null || data2.isEmpty()))) {
            return Unit.f75682a;
        }
        List list3 = list;
        if (list3 == null || list3.isEmpty()) {
            shortTvDetailListFragment.hideLoading();
            C18908g c18908g3 = shortTvDetailListFragment.mAdapter;
            if (c18908g3 == null || (data = c18908g3.getData()) == null || data.size() != 0) {
                C18908g c18908g4 = shortTvDetailListFragment.mAdapter;
                if (c18908g4 != null && (c27941fM36186h0 = c18908g4.m36186h0()) != null && c27941fM36186h0.m108666r() && (c18908g = shortTvDetailListFragment.mAdapter) != null && (c27941fM36186h1 = c18908g.m36186h0()) != null) {
                    c27941fM36186h1.m108669v();
                }
            } else if (C27287m.f83003a.m106330e()) {
                shortTvDetailListFragment.showEmpty();
            } else {
                shortTvDetailListFragment.showNotNetError();
            }
        } else {
            if (!C27287m.f83003a.m106330e()) {
                shortTvDetailListFragment.m79905p1();
            }
            ShortTvInfoEpisodeList shortTvInfoEpisodeList = (ShortTvInfoEpisodeList) shortTvDetailListFragment.m79851K0().m80394t0().m14847f();
            List<ShortTVItem> items = shortTvInfoEpisodeList != null ? shortTvInfoEpisodeList.getItems() : null;
            List<ShortTVItem> list4 = items;
            if (list4 != null && !list4.isEmpty() && items != null) {
                for (ShortTVItem shortTVItem : items) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        AbstractC26725k abstractC26725k = (AbstractC26725k) next;
                        if ((abstractC26725k instanceof C26719e) && ((C26719e) abstractC26725k).m104511c() == shortTVItem.getEp()) {
                            break;
                        }
                    }
                    C26719e c26719e = (C26719e) next;
                    if (c26719e != null) {
                        c26719e.m104516h(shortTVItem);
                    }
                }
            }
            shortTvDetailListFragment.m79886q1(list);
            shortTvDetailListFragment.m79844D0();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final Unit m79862W0(ShortTvDetailListFragment shortTvDetailListFragment, ShortTvInfoEpisodeList shortTvInfoEpisodeList) {
        shortTvDetailListFragment.hideLoading();
        shortTvDetailListFragment.m79889s1(shortTvInfoEpisodeList);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m79863X0(ShortTvDetailListFragment shortTvDetailListFragment, Subject subject) {
        BiddingListManager biddingListManager;
        Subject subject2;
        String subjectId;
        shortTvDetailListFragment.hideLoading();
        if (shortTvDetailListFragment.mSubject == null && subject == null && !C27287m.f83003a.m106330e()) {
            C26866a.a.m104898f(C26866a.f81698a, com.transsion.baseui.fragment.PageStatusFragment.TAG, "无subject，显示无网页面----", false, 4, null);
            shortTvDetailListFragment.showNotNetError();
        } else {
            shortTvDetailListFragment.mSubject = subject;
            if (subject != null && (subjectId = subject.getSubjectId()) != null) {
                shortTvDetailListFragment.mSubjectId = subjectId;
            }
            String str = shortTvDetailListFragment.mOps;
            if (str != null && str.length() != 0 && (subject2 = shortTvDetailListFragment.mSubject) != null) {
                subject2.setOps(shortTvDetailListFragment.mOps);
            }
            if (subject != null && subject.getNeedPaid() == 0 && (biddingListManager = shortTvDetailListFragment.middleListManager) != null) {
                biddingListManager.m63181C(true);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m79864Y0(ShortTvDetailListFragment shortTvDetailListFragment, Integer num) {
        Intrinsics.m97799e(num);
        shortTvDetailListFragment.m79902k1(num.intValue());
        C18908g c18908g = shortTvDetailListFragment.mAdapter;
        C26719e c26719eM79556Q1 = c18908g != null ? c18908g.m79556Q1(num.intValue(), shortTvDetailListFragment.hasTrailer) : null;
        boolean zM106330e = C27287m.f83003a.m106330e();
        if (!AbstractC26726l.m104527b(c26719eM79556Q1)) {
            int iM79854N0 = shortTvDetailListFragment.m79854N0(num.intValue());
            C18908g c18908g2 = shortTvDetailListFragment.mAdapter;
            AbstractC26725k abstractC26725k = c18908g2 != null ? (AbstractC26725k) c18908g2.m36182f0(iM79854N0 + 5) : null;
            if (abstractC26725k instanceof C26719e) {
                C26719e c26719e = (C26719e) abstractC26725k;
                if (AbstractC26726l.m104527b(c26719e)) {
                    shortTvDetailListFragment.m79846F0(c26719e.m104511c());
                }
            }
        } else if (zM106330e) {
            shortTvDetailListFragment.m79844D0();
        } else {
            shortTvDetailListFragment.hideLoading();
            shortTvDetailListFragment.m79905p1();
        }
        Integer num2 = (Integer) shortTvDetailListFragment.m79851K0().m80380g0().m14847f();
        if (num2 != null) {
            int iIntValue = num2.intValue();
            C18908g c18908g3 = shortTvDetailListFragment.mAdapter;
            C26719e c26719eM79556Q2 = c18908g3 != null ? c18908g3.m79556Q1(iIntValue, shortTvDetailListFragment.hasTrailer) : null;
            if (c26719eM79556Q2 != null) {
                if (zM106330e) {
                    if (!C23219b.f70761a.m92280c((Subject) shortTvDetailListFragment.m79851K0().m80343H0().m14847f(), c26719eM79556Q1 != null ? c26719eM79556Q1.m104512d() : null) && c26719eM79556Q2.m104510b() != 0 && c26719eM79556Q1 != null && c26719eM79556Q1.m104510b() == 0) {
                        C18812h.f60816a.m79292h(R$string.short_tv_watching_online);
                    }
                }
                return Unit.f75682a;
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final Unit m79865Z0(ShortTvDetailListFragment shortTvDetailListFragment, Boolean bool) {
        Intrinsics.m97799e(bool);
        shortTvDetailListFragment.hasTrailer = bool.booleanValue();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final Unit m79866a1(final ShortTvDetailListFragment shortTvDetailListFragment, ShortTVItem shortTVItem) {
        Map mapMo102959a;
        shortTvDetailListFragment.m79851K0().m80377e1(true);
        ShortTvPagerChangeControl shortTvPagerChangeControl = shortTvDetailListFragment.mPagerChangeControl;
        if (shortTvPagerChangeControl != null) {
            shortTvPagerChangeControl.m80084m();
        }
        C23403e mediaSource = shortTVItem.toMediaSource();
        if (mediaSource != null) {
            InterfaceC26373f interfaceC26373f = shortTvDetailListFragment.mOrPlayer;
            boolean zContainsKey = (interfaceC26373f == null || (mapMo102959a = interfaceC26373f.mo102959a()) == null) ? false : mapMo102959a.containsKey(mediaSource.m92929e());
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104905r(aVar, shortTvDetailListFragment.loggerTag, new String[]{"----------addDataSource----updateShortTvInfoList  ep:" + shortTVItem.getEp() + ",inPlayerList:" + zContainsKey}, false, 4, null);
            InterfaceC26373f interfaceC26373f2 = shortTvDetailListFragment.mOrPlayer;
            long currentPosition = interfaceC26373f2 != null ? interfaceC26373f2.getCurrentPosition() : 0L;
            if (!zContainsKey) {
                C26866a.a.m104905r(aVar, shortTvDetailListFragment.loggerTag, new String[]{"-------AudioTrack change----play  ep:" + shortTVItem.getEp()}, false, 4, null);
                InterfaceC26373f interfaceC26373f3 = shortTvDetailListFragment.mOrPlayer;
                if (interfaceC26373f3 != null) {
                    interfaceC26373f3.addDataSource(mediaSource);
                }
                InterfaceC26373f interfaceC26373f4 = shortTvDetailListFragment.mOrPlayer;
                if (interfaceC26373f4 != null) {
                    interfaceC26373f4.prepare();
                }
            }
            InterfaceC26373f interfaceC26373f5 = shortTvDetailListFragment.mOrPlayer;
            if (interfaceC26373f5 != null) {
                String strM92929e = mediaSource.m92929e();
                Intrinsics.m97799e(strM92929e);
                interfaceC26373f5.seekTo(strM92929e, currentPosition);
            }
        }
        View view = shortTvDetailListFragment.getView();
        if (view != null) {
            view.post(new Runnable() { // from class: com.transsion.shorttv.ui.fragment.d0
                @Override // java.lang.Runnable
                public final void run() {
                    ShortTvDetailListFragment.m79867b1(this.f61211a);
                }
            });
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m79867b1(ShortTvDetailListFragment shortTvDetailListFragment) {
        shortTvDetailListFragment.m79851K0().m80377e1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m79868c1(ShortTvDetailListFragment shortTvDetailListFragment, DubsInfoData dubsInfoData) {
        List<DubsInfo> dubs;
        DubsInfo dubsInfo;
        Object next;
        ShortTvPagerChangeControl shortTvPagerChangeControl = shortTvDetailListFragment.mPagerChangeControl;
        if (shortTvPagerChangeControl != null) {
            shortTvPagerChangeControl.m80085n();
        }
        if (dubsInfoData != null && (dubs = dubsInfoData.getDubs()) != null && !dubs.isEmpty() && shortTvDetailListFragment.m79851K0().m80366Y() == null) {
            String string = C19165h.f61575a.m80241d().getString("k_audio_subject_" + shortTvDetailListFragment.mSubjectId, null);
            if (string != null && !Intrinsics.m97797c(string, shortTvDetailListFragment.mSubjectId)) {
                List<DubsInfo> dubs2 = dubsInfoData.getDubs();
                if (dubs2 != null) {
                    Iterator<T> it = dubs2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.m97797c(((DubsInfo) next).getSubjectId(), string));
                    dubsInfo = (DubsInfo) next;
                } else {
                    dubsInfo = null;
                }
                if (dubsInfo != null) {
                    C26866a.a.m104898f(C26866a.f81698a, shortTvDetailListFragment.loggerTag, "restoring saved audio: " + dubsInfo.getLanName() + ", subjectId=" + string, false, 4, null);
                    shortTvDetailListFragment.m79851K0().m80379f1(string);
                    shortTvDetailListFragment.m79851K0().m80365X().mo14858q(Boolean.TRUE);
                    ShortTvViewModel shortTvViewModelM79851K0 = shortTvDetailListFragment.m79851K0();
                    Integer num = (Integer) shortTvDetailListFragment.m79851K0().m80384j0().m14847f();
                    shortTvViewModelM79851K0.m80396v0(string, null, num != null ? num.intValue() : 1, false);
                    ShortTvViewModel shortTvViewModelM79851K1 = shortTvDetailListFragment.m79851K0();
                    Integer num2 = (Integer) shortTvDetailListFragment.m79851K0().m80384j0().m14847f();
                    shortTvViewModelM79851K1.m80397w0(string, num2 != null ? num2.intValue() : 1);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final Unit m79869d1(ShortTvDetailListFragment shortTvDetailListFragment, Unit unit) {
        View viewM80081j;
        ShortTvPagerChangeControl shortTvPagerChangeControl = shortTvDetailListFragment.mPagerChangeControl;
        if (shortTvPagerChangeControl == null || (viewM80081j = shortTvPagerChangeControl.m80081j()) == null) {
            return Unit.f75682a;
        }
        if (viewM80081j instanceof ShortTvVideoItemView) {
            ShortTvPagerChangeControl shortTvPagerChangeControl2 = shortTvDetailListFragment.mPagerChangeControl;
            if (shortTvPagerChangeControl2 == null) {
                return Unit.f75682a;
            }
            int iM80082k = shortTvPagerChangeControl2.m80082k();
            C18908g c18908g = shortTvDetailListFragment.mAdapter;
            AbstractC26725k abstractC26725k = c18908g != null ? (AbstractC26725k) c18908g.m36182f0(iM80082k) : null;
            C26719e c26719e = abstractC26725k instanceof C26719e ? (C26719e) abstractC26725k : null;
            if (c26719e == null) {
                return Unit.f75682a;
            }
            ShortTvPagerChangeControl shortTvPagerChangeControl3 = shortTvDetailListFragment.mPagerChangeControl;
            if (shortTvPagerChangeControl3 != null) {
                shortTvPagerChangeControl3.m80090t((ShortTvVideoItemView) viewM80081j, iM80082k, c26719e);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final void m79871f1(ShortTvDetailListFragment shortTvDetailListFragment, ActivityResult activityResult) {
        Function0 function0;
        if (activityResult.getResultCode() == -1 && (function0 = shortTvDetailListFragment.loginSuccessCallback) != null) {
            function0.invoke();
        }
        shortTvDetailListFragment.loginSuccessCallback = null;
    }

    private final View getEmptyView(Context context) {
        final DefaultView defaultView = new DefaultView(context, DefaultView.ModelStyle.MODEL_STYLE_NIGHT);
        defaultView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        defaultView.setGravity(17);
        defaultView.setDefaultImageViewVisibility(0);
        defaultView.setDefaultImage(R$mipmap.short_tv_ic_no_content);
        String string = context.getString(R$string.short_tv_no_content);
        Intrinsics.m97801g(string, "getString(...)");
        defaultView.setDescText(string);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_IMAGE_DESC_BTN);
        defaultView.setBtnVisibility(0);
        String string2 = context.getString(R$string.short_tv_Retry);
        Intrinsics.m97801g(string2, "getString(...)");
        defaultView.setBtnText(string2);
        defaultView.setBtnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.fragment.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvDetailListFragment.m79849I0(this.f61300a, defaultView, view);
            }
        });
        defaultView.setVisibility(0);
        return defaultView;
    }

    private final View getNotNetErrorView(final Context context) {
        String title;
        final NoNetworkBigView noNetworkBigView = new NoNetworkBigView(context, true);
        AbstractC23048b.m91690a(noNetworkBigView);
        Subject subject = (Subject) m79851K0().m80343H0().m14847f();
        if (subject == null || (title = subject.getTitle()) == null) {
            title = "";
        }
        noNetworkBigView.showTitle(true, title);
        noNetworkBigView.retry(new Function0() { // from class: com.transsion.shorttv.ui.fragment.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvDetailListFragment.m79852L0(context, noNetworkBigView, this);
            }
        });
        noNetworkBigView.goToSetting(new Function0() { // from class: com.transsion.shorttv.ui.fragment.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvDetailListFragment.m79853M0(this.f61209a);
            }
        });
        AbstractC18797k.m79222a(getPageName());
        return noNetworkBigView;
    }

    private final void initAd() {
        BiddingListManager biddingListManager = new BiddingListManager();
        C27333c0 c27333c0 = (C27333c0) getMViewBinding();
        biddingListManager.m63184F(c27333c0 != null ? c27333c0.f83097c : null);
        biddingListManager.m63179A(AbstractC3226v.m14968a(this));
        biddingListManager.m63185G("ShortTvListScene");
        biddingListManager.m63181C(false);
        biddingListManager.m63192z(new Function2() { // from class: com.transsion.shorttv.ui.fragment.i0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ShortTvDetailListFragment.m79856Q0(this.f61310a, ((Integer) obj).intValue(), (BiddingNativeManager) obj2);
            }
        });
        this.middleListManager = biddingListManager;
    }

    private final void initAdapter() {
        C18908g c18908g = new C18908g(new ArrayList(), this, false, this.mSubjectId, this.mItemType, this.fromTrending);
        c18908g.m36186h0().m108655C(new ShortTvLoadMoreView());
        c18908g.m36186h0().m108673z(false);
        c18908g.m36186h0().m108672y(false);
        c18908g.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.shorttv.ui.fragment.y
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                ShortTvDetailListFragment.m79857R0(this.f61333a);
            }
        });
        this.mAdapter = c18908g;
    }

    private final void initView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        initAdapter();
        m79860U0();
        m79858S0();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        this.mPagerLayoutManager = new PagerLayoutManager(fragmentActivityRequireActivity);
        ShortTvPagerChangeControl shortTvPagerChangeControl = new ShortTvPagerChangeControl(this, this.mAdapter, this.mOrPlayer, this.mOrPlayerView, this.mPagerLayoutManager);
        this.mPagerChangeControl = shortTvPagerChangeControl;
        PagerLayoutManager pagerLayoutManager = this.mPagerLayoutManager;
        if (pagerLayoutManager != null) {
            pagerLayoutManager.m79147X(shortTvPagerChangeControl);
        }
        C27333c0 c27333c0 = (C27333c0) getMViewBinding();
        if (c27333c0 != null && (recyclerView2 = c27333c0.f83097c) != null) {
            recyclerView2.setLayoutManager(this.mPagerLayoutManager);
        }
        C27333c0 c27333c1 = (C27333c0) getMViewBinding();
        if (c27333c1 != null && (recyclerView = c27333c1.f83097c) != null) {
            recyclerView.setAdapter(this.mAdapter);
        }
        C19162e c19162eM80235a = C19162e.f61571c.m80235a();
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity2, "requireActivity(...)");
        c19162eM80235a.m80234e(fragmentActivityRequireActivity2);
    }

    /* JADX INFO: renamed from: j1 */
    private final void m79876j1() {
        C26719e c26719eM79556Q1;
        Integer num = (Integer) m79851K0().m80384j0().m14847f();
        if (num != null) {
            int iIntValue = num.intValue();
            ShortTvPagerChangeControl shortTvPagerChangeControl = this.mPagerChangeControl;
            long jM80083l = shortTvPagerChangeControl != null ? shortTvPagerChangeControl.m80083l() : 0L;
            C18908g c18908g = this.mAdapter;
            if (c18908g == null || (c26719eM79556Q1 = c18908g.m79556Q1(iIntValue, this.hasTrailer)) == null) {
                return;
            }
            m79851K0().m80372b1((Subject) m79851K0().m80343H0().m14847f(), c26719eM79556Q1.m104512d(), jM80083l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final void m79879l1(ShortTvDetailListFragment shortTvDetailListFragment, int i11) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        PagerLayoutManager pagerLayoutManager = shortTvDetailListFragment.mPagerLayoutManager;
        if (pagerLayoutManager != null) {
            View viewM79145T = pagerLayoutManager.m79145T();
            Log.e(shortTvDetailListFragment.loggerTag, "post   itemView:" + viewM79145T);
            if (viewM79145T != null) {
                Log.e(shortTvDetailListFragment.loggerTag, "post   itemView: 22222");
                ShortTvPagerChangeControl shortTvPagerChangeControl = shortTvDetailListFragment.mPagerChangeControl;
                if (shortTvPagerChangeControl != null) {
                    shortTvPagerChangeControl.mo72960f(i11, true, viewM79145T);
                }
                C27333c0 c27333c0 = (C27333c0) shortTvDetailListFragment.getMViewBinding();
                if (c27333c0 == null || (recyclerView = c27333c0.f83097c) == null) {
                    return;
                }
                recyclerView.requestLayout();
                return;
            }
            int childCount = pagerLayoutManager.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = pagerLayoutManager.getChildAt(i12);
                if (childAt != null && pagerLayoutManager.getPosition(childAt) == i11) {
                    ShortTvPagerChangeControl shortTvPagerChangeControl2 = shortTvDetailListFragment.mPagerChangeControl;
                    if (shortTvPagerChangeControl2 != null) {
                        shortTvPagerChangeControl2.mo72960f(i11, true, childAt);
                    }
                    C27333c0 c27333c1 = (C27333c0) shortTvDetailListFragment.getMViewBinding();
                    if (c27333c1 != null && (recyclerView2 = c27333c1.f83097c) != null) {
                        recyclerView2.requestLayout();
                    }
                    Log.e(shortTvDetailListFragment.loggerTag, "post   itemView: 11111");
                    return;
                }
            }
        }
    }

    private final void loadData() {
        m79851K0().m80396v0(this.mSubjectId, this.mSubject, this.ep, this.isHistoryFirst);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public final void m79883o1() {
        C26724j c26724jM79850J0;
        InterfaceC28216g interfaceC28216gM80400z0;
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        if (this.isClickPause) {
            C26866a.f81698a.m104912c("video_float", "shottv 视频暂停，无需触发画中画", true);
        } else {
            if (this.mOrPlayer == null || this.mOrPlayerView == null || (c26724jM79850J0 = m79850J0()) == null || (interfaceC28216gM80400z0 = m79851K0().m80400z0()) == null) {
                return;
            }
            interfaceC28216gM80400z0.mo73685h(activity, c26724jM79850J0);
        }
    }

    /* JADX INFO: renamed from: q1 */
    private final void m79886q1(List shortTVItems) {
        int i11;
        RecyclerView recyclerView;
        C27941f c27941fM36186h0;
        C18908g c18908g;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        C27941f c27941fM36186h3;
        C27941f c27941fM36186h4;
        C27941f c27941fM36186h5;
        ShortTVItem shortTVItemM104512d;
        C23403e mediaSource;
        InterfaceC26373f interfaceC26373f;
        Map mapMo102959a;
        C18908g c18908g2 = this.mAdapter;
        if (c18908g2 == null) {
            return;
        }
        List<Object> data = c18908g2.getData();
        ArrayList<AbstractC26725k> arrayList = new ArrayList();
        Subject subject = (Subject) m79851K0().m80343H0().m14847f();
        AbstractC26725k abstractC26725k = (AbstractC26725k) CollectionsKt.m97372v0(data);
        if (abstractC26725k != null && (abstractC26725k instanceof C26719e) && C23219b.f70761a.m92280c(subject, ((C26719e) abstractC26725k).m104512d())) {
            return;
        }
        Iterator it = shortTVItems.iterator();
        while (it.hasNext()) {
            AbstractC26725k abstractC26725k2 = (AbstractC26725k) it.next();
            arrayList.add(abstractC26725k2);
            if ((abstractC26725k2 instanceof C26719e) && C23219b.f70761a.m92280c(subject, ((C26719e) abstractC26725k2).m104512d())) {
                break;
            }
        }
        if (c18908g2.getData().isEmpty()) {
            c18908g2.mo36210q1(arrayList);
            int iM79847G0 = m79847G0(arrayList);
            ShortTvPagerChangeControl shortTvPagerChangeControl = this.mPagerChangeControl;
            Integer numValueOf = shortTvPagerChangeControl != null ? Integer.valueOf(shortTvPagerChangeControl.m80082k()) : null;
            Integer num = (Integer) m79851K0().m80384j0().m14847f();
            if (num == null || iM79847G0 != num.intValue()) {
                m79851K0().m80375d1(iM79847G0);
            } else if (iM79847G0 >= 0) {
                int iM79557S1 = c18908g2.m79557S1(iM79847G0, this.hasTrailer);
                if (numValueOf == null || numValueOf.intValue() != iM79557S1) {
                    Integer num2 = (Integer) m79851K0().m80384j0().m14847f();
                    m79902k1(num2 != null ? num2.intValue() : m79848H0());
                }
            }
            m79843C0();
        } else {
            Integer num3 = (Integer) m79851K0().m80384j0().m14847f();
            int iIntValue = num3 != null ? num3.intValue() : m79848H0();
            ShortTvPagerChangeControl shortTvPagerChangeControl2 = this.mPagerChangeControl;
            int iM80082k = shortTvPagerChangeControl2 != null ? shortTvPagerChangeControl2.m80082k() : 0;
            Iterator<Object> it2 = arrayList.iterator();
            int i12 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i12 = -1;
                    break;
                }
                AbstractC26725k abstractC26725k3 = (AbstractC26725k) it2.next();
                if ((abstractC26725k3 instanceof C26719e) && ((C26719e) abstractC26725k3).m104511c() == iIntValue) {
                    break;
                } else {
                    i12++;
                }
            }
            C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "currentPositionInAddList: " + i12 + ", currentPosition: " + iM80082k + ", currentEpisode: " + iIntValue, false, 4, null);
            if (iM80082k >= 0 && i12 >= 0) {
                data.set(iM80082k, arrayList.get(i12));
            }
            if (iM80082k < data.size() - 1) {
                int i13 = iM80082k + 1;
                List<Object> listSubList = data.subList(i13, data.size());
                int size = listSubList.size();
                data.removeAll(listSubList);
                c18908g2.notifyItemRangeRemoved(i13, size);
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (i12 >= 0 && i12 < arrayList.size() - 1) {
                List<Object> listSubList2 = arrayList.subList(i12 + 1, arrayList.size());
                int size2 = listSubList2.size();
                int i14 = iM80082k + 1;
                data.addAll(RangesKt.m97938h(data.size(), i14), listSubList2);
                c18908g2.notifyItemRangeInserted(i14, size2);
                i11++;
            }
            if (iM80082k > 0) {
                data.removeAll(data.subList(0, iM80082k));
                c18908g2.notifyItemRangeRemoved(0, iM80082k);
                i11++;
            }
            if (i12 > 0) {
                List<Object> listSubList3 = arrayList.subList(0, i12);
                if (listSubList3.size() > 0) {
                    data.addAll(0, listSubList3);
                    c18908g2.notifyItemRangeInserted(0, listSubList3.size());
                    i11++;
                }
            }
            if (i11 > 0) {
                ShortTvPagerChangeControl shortTvPagerChangeControl3 = this.mPagerChangeControl;
                if (shortTvPagerChangeControl3 != null) {
                    shortTvPagerChangeControl3.m80089s(i12);
                }
                C27333c0 c27333c0 = (C27333c0) getMViewBinding();
                if (c27333c0 != null && (recyclerView = c27333c0.f83097c) != null) {
                    recyclerView.requestLayout();
                }
            }
        }
        ShortTvPagerChangeControl shortTvPagerChangeControl4 = this.mPagerChangeControl;
        if (shortTvPagerChangeControl4 != null) {
            shortTvPagerChangeControl4.m80086o();
        }
        boolean z11 = false;
        for (AbstractC26725k abstractC26725k4 : arrayList) {
            if ((abstractC26725k4 instanceof C26719e) && (shortTVItemM104512d = ((C26719e) abstractC26725k4).m104512d()) != null && (mediaSource = shortTVItemM104512d.toMediaSource()) != null) {
                InterfaceC26373f interfaceC26373f2 = this.mOrPlayer;
                boolean zContainsKey = (interfaceC26373f2 == null || (mapMo102959a = interfaceC26373f2.mo102959a()) == null) ? false : mapMo102959a.containsKey(mediaSource.m92929e());
                C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "addDataSource----updateData  ep:" + shortTVItemM104512d.getEp() + ",inPlayerList:" + zContainsKey, false, 4, null);
                if (((this.isNewPlayer || !zContainsKey) && (interfaceC26373f = this.mOrPlayer) != null) ? interfaceC26373f.addDataSource(mediaSource) : false) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            InterfaceC26373f interfaceC26373f3 = this.mOrPlayer;
            if (interfaceC26373f3 != null) {
                interfaceC26373f3.prepare();
            }
            FragmentActivity activity = getActivity();
            ShortTvListActivity shortTvListActivity = activity instanceof ShortTvListActivity ? (ShortTvListActivity) activity : null;
            if (shortTvListActivity != null && shortTvListActivity.getIsActivityPaused()) {
                C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "updateData prepare, but isActivityPaused is true, pause", false, 4, null);
                InterfaceC26373f interfaceC26373f4 = this.mOrPlayer;
                if (interfaceC26373f4 != null) {
                    interfaceC26373f4.pause();
                }
            }
        }
        if (shortTVItems.size() < m79855O0()) {
            C18908g c18908g3 = this.mAdapter;
            if (c18908g3 != null && (c27941fM36186h5 = c18908g3.m36186h0()) != null) {
                c27941fM36186h5.m108669v();
            }
            C18908g c18908g4 = this.mAdapter;
            if (c18908g4 == null || (c27941fM36186h4 = c18908g4.m36186h0()) == null) {
                return;
            }
            c27941fM36186h4.m108673z(true);
            return;
        }
        C18908g c18908g5 = this.mAdapter;
        if (c18908g5 != null && (c27941fM36186h3 = c18908g5.m36186h0()) != null) {
            c27941fM36186h3.m108673z(false);
        }
        C18908g c18908g6 = this.mAdapter;
        if (((c18908g6 == null || (c27941fM36186h2 = c18908g6.m36186h0()) == null || !c27941fM36186h2.m108666r()) ? false : true) && (c18908g = this.mAdapter) != null && (c27941fM36186h1 = c18908g.m36186h0()) != null) {
            c27941fM36186h1.m108667s();
        }
        C18908g c18908g7 = this.mAdapter;
        if (c18908g7 == null || (c27941fM36186h0 = c18908g7.m36186h0()) == null) {
            return;
        }
        C27941f.m108652u(c27941fM36186h0, false, 1, null);
    }

    /* JADX INFO: renamed from: s1 */
    private final void m79889s1(ShortTvInfoEpisodeList subjectBean) {
        C18908g c18908g;
        C26719e c26719eM79556Q1;
        View viewM80081j;
        ShortTvPagerChangeControl shortTvPagerChangeControl;
        Object next;
        Map mapMo102959a;
        C18908g c18908g2;
        List<Object> data;
        List<Object> data2;
        Media video;
        List<ShortTVItem> items = subjectBean != null ? subjectBean.getItems() : null;
        List<ShortTVItem> list = items;
        if (list == null || list.isEmpty()) {
            return;
        }
        Integer num = (Integer) m79851K0().m80384j0().m14847f();
        int iIntValue = num != null ? num.intValue() : 0;
        List listL = (List) m79851K0().m80341F0().m14847f();
        if (listL == null) {
            listL = CollectionsKt.m97506l();
        }
        boolean z11 = false;
        for (ShortTVItem shortTVItem : items) {
            int iM79854N0 = m79854N0(shortTVItem.getEp());
            AbstractC26725k abstractC26725k = (AbstractC26725k) CollectionsKt.m97362l0(listL, iM79854N0);
            if (!(abstractC26725k instanceof C26719e) || ((C26719e) abstractC26725k).m104511c() != shortTVItem.getEp()) {
                Iterator it = listL.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    AbstractC26725k abstractC26725k2 = (AbstractC26725k) next;
                    if ((abstractC26725k2 instanceof C26719e) && ((C26719e) abstractC26725k2).m104511c() == shortTVItem.getEp()) {
                        break;
                    }
                }
                abstractC26725k = (AbstractC26725k) next;
            }
            if (abstractC26725k != null && (abstractC26725k instanceof C26719e)) {
                C26719e c26719e = (C26719e) abstractC26725k;
                boolean z12 = c26719e.m104512d() == null;
                if (c26719e.m104511c() == iIntValue) {
                    ShortTVItem shortTVItemM104512d = c26719e.m104512d();
                    if (((shortTVItemM104512d == null || (video = shortTVItemM104512d.getVideo()) == null) ? null : video.getVideoAddress()) == null) {
                        Media video2 = shortTVItem.getVideo();
                        if ((video2 != null ? video2.getVideoAddress() : null) != null) {
                            z11 = true;
                        }
                    }
                }
                ShortTVItem shortTVItemM104512d2 = c26719e.m104512d();
                String id2 = shortTVItemM104512d2 != null ? shortTVItemM104512d2.getId() : null;
                if (id2 != null && id2.length() != 0) {
                    shortTVItem.setId(id2);
                }
                c26719e.m104516h(shortTVItem);
                C18908g c18908g3 = this.mAdapter;
                if (iM79854N0 < (c18908g3 != null ? c18908g3.getItemCount() : 0)) {
                    C18908g c18908g4 = this.mAdapter;
                    if (iM79854N0 < ((c18908g4 == null || (data2 = c18908g4.getData()) == null) ? 0 : data2.size())) {
                        C18908g c18908g5 = this.mAdapter;
                        if (c18908g5 != null && (data = c18908g5.getData()) != null) {
                        }
                        if (z12 && (c18908g2 = this.mAdapter) != null) {
                            c18908g2.notifyItemChanged(iM79854N0, Integer.valueOf(shortTVItem.getEp()));
                        }
                    }
                }
            }
            C23403e mediaSource = shortTVItem.toMediaSource();
            if (mediaSource != null) {
                InterfaceC26373f interfaceC26373f = this.mOrPlayer;
                boolean zContainsKey = (interfaceC26373f == null || (mapMo102959a = interfaceC26373f.mo102959a()) == null) ? false : mapMo102959a.containsKey(mediaSource.m92929e());
                C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "addDataSource----updateShortTvInfoList  ep:" + shortTVItem.getEp() + ",inPlayerList:" + zContainsKey, false, 4, null);
                if (this.isNewPlayer || !zContainsKey) {
                    InterfaceC26373f interfaceC26373f2 = this.mOrPlayer;
                    if (interfaceC26373f2 != null) {
                        interfaceC26373f2.addDataSource(mediaSource);
                    }
                }
            }
        }
        InterfaceC26373f interfaceC26373f3 = this.mOrPlayer;
        if (interfaceC26373f3 != null) {
            interfaceC26373f3.prepare();
        }
        FragmentActivity activity = getActivity();
        ShortTvListActivity shortTvListActivity = activity instanceof ShortTvListActivity ? (ShortTvListActivity) activity : null;
        if (shortTvListActivity != null && shortTvListActivity.getIsActivityPaused()) {
            C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "updateShortTvInfoList prepare, but isActivityPaused is true, pause", false, 4, null);
            InterfaceC26373f interfaceC26373f4 = this.mOrPlayer;
            if (interfaceC26373f4 != null) {
                interfaceC26373f4.pause();
            }
        }
        if (!z11 || (c18908g = this.mAdapter) == null || (c26719eM79556Q1 = c18908g.m79556Q1(iIntValue, this.hasTrailer)) == null) {
            return;
        }
        if (AbstractC26726l.m104527b(c26719eM79556Q1)) {
            m79844D0();
            return;
        }
        ShortTvPagerChangeControl shortTvPagerChangeControl2 = this.mPagerChangeControl;
        if (shortTvPagerChangeControl2 == null || (viewM80081j = shortTvPagerChangeControl2.m80081j()) == null || !(viewM80081j instanceof ShortTvVideoItemView) || (shortTvPagerChangeControl = this.mPagerChangeControl) == null) {
            return;
        }
        shortTvPagerChangeControl.m80090t((ShortTvVideoItemView) viewM80081j, m79854N0(iIntValue), c26719eM79556Q1);
    }

    private final void scrollToPosition(final int toPosition) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        this.isNewPlayer = true;
        C27333c0 c27333c0 = (C27333c0) getMViewBinding();
        if (c27333c0 != null && (recyclerView2 = c27333c0.f83097c) != null) {
            recyclerView2.scrollToPosition(toPosition);
        }
        C27333c0 c27333c1 = (C27333c0) getMViewBinding();
        if (c27333c1 == null || (recyclerView = c27333c1.f83097c) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: com.transsion.shorttv.ui.fragment.f0
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvDetailListFragment.m79879l1(this.f61303a, toPosition);
            }
        });
    }

    private final void showEmpty() {
        C18908g c18908g;
        List<Object> data;
        hideLoading();
        C18908g c18908g2 = this.mAdapter;
        if (c18908g2 == null || (data = c18908g2.getData()) == null || !(!data.isEmpty())) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            View emptyView = getEmptyView(contextRequireContext);
            if (emptyView == null || (c18908g = this.mAdapter) == null) {
                return;
            }
            c18908g.m36171Y0(emptyView);
        }
    }

    private final void showNotNetError() {
        C18908g c18908g;
        List<Object> data;
        hideLoading();
        C18908g c18908g2 = this.mAdapter;
        if (c18908g2 == null || (data = c18908g2.getData()) == null || !(!data.isEmpty())) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            View notNetErrorView = getNotNetErrorView(contextRequireContext);
            if (notNetErrorView == null || (c18908g = this.mAdapter) == null) {
                return;
            }
            c18908g.m36171Y0(notNetErrorView);
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public C27333c0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C27333c0 c27333c0M106432c = C27333c0.m106432c(inflater);
        Intrinsics.m97801g(c27333c0M106432c, "inflate(...)");
        return c27333c0M106432c;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m79898e1(InterfaceC28218i loginProvider, Function0 onSuccess) {
        Intrinsics.m97802h(loginProvider, "loginProvider");
        Intrinsics.m97802h(onSuccess, "onSuccess");
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        Intent intentMo73688b = loginProvider.mo73688b(contextRequireContext);
        if (intentMo73688b == null) {
            return;
        }
        this.loginSuccessCallback = onSuccess;
        this.loginLauncher.m999a(intentMo73688b);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m79899g1() {
        InterfaceC26373f interfaceC26373f = this.mOrPlayer;
        if (interfaceC26373f != null) {
            interfaceC26373f.pause();
        }
    }

    public final String getPageName() {
        return "minitv_play";
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX INFO: renamed from: h1 */
    public final void m79900h1() {
        InterfaceC26373f interfaceC26373f;
        if (this.isClickPause || isHidden() || (interfaceC26373f = this.mOrPlayer) == null) {
            return;
        }
        interfaceC26373f.play();
    }

    public final void hideLoading() {
        ProgressBar progressBar;
        C27333c0 c27333c0 = (C27333c0) getMViewBinding();
        if (c27333c0 != null && (progressBar = c27333c0.f83096b) != null) {
            AbstractC23048b.m91691b(progressBar);
        }
        HandlerC18999b handlerC18999b = this.loadingHandler;
        handlerC18999b.removeMessages(handlerC18999b.m79908b());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX INFO: renamed from: i1 */
    public final void m79901i1() {
        InterfaceC26373f interfaceC26373f;
        InterfaceC26373f interfaceC26373f2;
        InterfaceC28216g interfaceC28216gM80400z0 = m79851K0().m80400z0();
        if (interfaceC28216gM80400z0 != null ? interfaceC28216gM80400z0.mo73683f(this.mOrPlayer) : false) {
            InterfaceC28216g interfaceC28216gM80400z1 = m79851K0().m80400z0();
            if (interfaceC28216gM80400z1 != null ? interfaceC28216gM80400z1.mo73682e(this.mOrPlayer) : false) {
                C26866a.f81698a.m104912c(this.loggerTag, " 播放器在缓存中，这里不能release", true);
            } else {
                interfaceC26373f = this.mOrPlayer;
                if (interfaceC26373f != null) {
                    interfaceC26373f.stop();
                }
                interfaceC26373f2 = this.mOrPlayer;
                if (interfaceC26373f2 != null) {
                    interfaceC26373f2.release();
                }
            }
        } else {
            interfaceC26373f = this.mOrPlayer;
            if (interfaceC26373f != null) {
                interfaceC26373f.stop();
            }
            interfaceC26373f2 = this.mOrPlayer;
            if (interfaceC26373f2 != null) {
                interfaceC26373f2.release();
            }
        }
        C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "onDestroy  removePlayerListener", false, 4, null);
        InterfaceC26373f interfaceC26373f3 = this.mOrPlayer;
        if (interfaceC26373f3 != null) {
            interfaceC26373f3.removePlayerListener(this);
        }
        InterfaceC28213d interfaceC28213dM80392s0 = m79851K0().m80392s0();
        if (interfaceC28213dM80392s0 != null) {
            interfaceC28213dM80392s0.mo73637c();
        }
        DeviceKeyMonitor deviceKeyMonitor = this.deviceKeyMonitor;
        if (deviceKeyMonitor != null) {
            deviceKeyMonitor.m79149b();
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewData() {
        initView();
        startLoading();
        loadData();
        initAd();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewModel() {
        m79851K0().m80341F0().m14851j(this, new C19001d(new Function1() { // from class: com.transsion.shorttv.ui.fragment.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvDetailListFragment.m79861V0(this.f61312a, (List) obj);
            }
        }));
        m79851K0().m80394t0().m14851j(this, new C19001d(new Function1() { // from class: com.transsion.shorttv.ui.fragment.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvDetailListFragment.m79862W0(this.f61314a, (ShortTvInfoEpisodeList) obj);
            }
        }));
        m79851K0().m80343H0().m14851j(this, new C19001d(new Function1() { // from class: com.transsion.shorttv.ui.fragment.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvDetailListFragment.m79863X0(this.f61316a, (Subject) obj);
            }
        }));
        m79851K0().m80384j0().m14851j(this, new C19001d(new Function1() { // from class: com.transsion.shorttv.ui.fragment.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvDetailListFragment.m79864Y0(this.f61318a, (Integer) obj);
            }
        }));
        m79851K0().m80344J0().m14851j(this, new C19001d(new Function1() { // from class: com.transsion.shorttv.ui.fragment.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvDetailListFragment.m79865Z0(this.f61320a, (Boolean) obj);
            }
        }));
        m79851K0().m80362V().m14851j(this, new C19001d(new Function1() { // from class: com.transsion.shorttv.ui.fragment.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvDetailListFragment.m79866a1(this.f61323a, (ShortTVItem) obj);
            }
        }));
        m79851K0().m80368Z().m14851j(this, new C19001d(new Function1() { // from class: com.transsion.shorttv.ui.fragment.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvDetailListFragment.m79868c1(this.f61334a, (DubsInfoData) obj);
            }
        }));
        m79851K0().m80386m0().m14851j(this, new C19001d(new Function1() { // from class: com.transsion.shorttv.ui.fragment.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvDetailListFragment.m79869d1(this.f61203a, (Unit) obj);
            }
        }));
        m79851K0().m80387n0(this.mSubjectId);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m79902k1(int ep2) {
        List<Object> data;
        List<Object> data2;
        int i11 = ep2 < 0 ? 1 : ep2;
        ShortTvPagerChangeControl shortTvPagerChangeControl = this.mPagerChangeControl;
        if (shortTvPagerChangeControl != null) {
            int iM80082k = shortTvPagerChangeControl.m80082k();
            C18908g c18908g = this.mAdapter;
            if (c18908g == null || (data = c18908g.getData()) == null || iM80082k >= data.size()) {
                return;
            }
            AbstractC26725k abstractC26725k = (AbstractC26725k) data.get(iM80082k);
            if ((abstractC26725k instanceof C26719e) && ((C26719e) abstractC26725k).m104511c() == i11) {
                C26866a.a aVar = C26866a.f81698a;
                String str = this.loggerTag;
                ShortTvPagerChangeControl shortTvPagerChangeControl2 = this.mPagerChangeControl;
                C26866a.a.m104898f(aVar, str, "scrollToEpisode current:" + (shortTvPagerChangeControl2 != null ? Integer.valueOf(shortTvPagerChangeControl2.m80082k()) : null) + " == " + i11, false, 4, null);
                return;
            }
            C18908g c18908g2 = this.mAdapter;
            int i12 = -1;
            if (c18908g2 != null && (data2 = c18908g2.getData()) != null) {
                Iterator<Object> it = data2.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    AbstractC26725k abstractC26725k2 = (AbstractC26725k) it.next();
                    if ((abstractC26725k2 instanceof C26719e) && ((C26719e) abstractC26725k2).m104511c() == ep2) {
                        i12 = i13;
                        break;
                    }
                    i13++;
                }
            }
            if (i12 >= 0) {
                if (i12 == iM80082k) {
                    return;
                }
                ShortTvPagerChangeControl shortTvPagerChangeControl3 = this.mPagerChangeControl;
                if (shortTvPagerChangeControl3 != null) {
                    shortTvPagerChangeControl3.m80088r(true);
                }
                scrollToPosition(i12);
                return;
            }
            C26866a.a aVar2 = C26866a.f81698a;
            String str2 = this.loggerTag;
            ShortTvPagerChangeControl shortTvPagerChangeControl4 = this.mPagerChangeControl;
            C26866a.a.m104898f(aVar2, str2, "scrollToEpisode current:" + (shortTvPagerChangeControl4 != null ? Integer.valueOf(shortTvPagerChangeControl4.m80082k()) : null) + " == " + i11 + " indexOfEp:" + i12 + " return", false, 4, null);
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void logPause() {
        super.logPause();
        if (this.resumeTimeStamp != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.resumeTimeStamp;
            InterfaceC28215f interfaceC28215fM80399y0 = m79851K0().m80399y0();
            if (interfaceC28215fM80399y0 != null) {
                interfaceC28215fM80399y0.mo73673a(getPageName(), Long.valueOf(jElapsedRealtime), getContext());
            }
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void logResume() {
        super.logResume();
        this.resumeTimeStamp = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: m1 */
    public final void m79903m1(boolean z11) {
        this.isClickPause = z11;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m79904n1() {
        if (this.shortListDialog == null) {
            ShortTvEpisodeListDialog shortTvEpisodeListDialog = new ShortTvEpisodeListDialog();
            shortTvEpisodeListDialog.setArguments(AbstractC2411d.m11891b(new Pair("hasTrailer", Boolean.valueOf(this.hasTrailer))));
            this.shortListDialog = shortTvEpisodeListDialog;
        }
        ShortTvEpisodeListDialog shortTvEpisodeListDialog2 = this.shortListDialog;
        if (shortTvEpisodeListDialog2 != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            shortTvEpisodeListDialog2.show(childFragmentManager, "immComment");
        }
        C28654b c28654b = C28654b.f87887a;
        Subject subject = this.mSubject;
        C28654b.m110420b(c28654b, subject != null ? subject.getSubjectId() : null, this.mOps, "dialog_minitv_ep", null, 8, null);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
        InterfaceC16633f.a.m72425c(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72426d(this, j11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e mediaSource) {
        InterfaceC16633f.a.m72427e(this, mediaSource);
        Integer num = (Integer) m79851K0().m80384j0().m14847f();
        if (num != null) {
            m79851K0().m80369Z0(num.intValue());
        }
        m79842B0();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        InterfaceC26373f interfaceC26373f;
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        super.onConnected(network, networkCapabilities);
        Log.e(this.loggerTag, "onConnected");
        loadData();
        m79844D0();
        ShortTvPagerChangeControl shortTvPagerChangeControl = this.mPagerChangeControl;
        if (shortTvPagerChangeControl != null) {
            shortTvPagerChangeControl.m80087p();
        }
        if (this.errorInfo == null || (interfaceC26373f = this.mOrPlayer) == null) {
            return;
        }
        interfaceC26373f.prepare();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        C24655b logViewConfig;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        String subjectId;
        super.onCreate(savedInstanceState);
        C24662i c24662i = C24662i.f75350a;
        this.lastPageFrom = c24662i.m96877i();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("id")) == null) {
            string = "";
        }
        this.mSubjectId = string;
        Bundle arguments2 = getArguments();
        this.ep = arguments2 != null ? arguments2.getInt("ep", this.ep) : this.ep;
        Bundle arguments3 = getArguments();
        this.ms = arguments3 != null ? arguments3.getLong("ms", this.ms) : this.ms;
        Bundle arguments4 = getArguments();
        this.mOps = arguments4 != null ? arguments4.getString("ops") : null;
        Bundle arguments5 = getArguments();
        this.isHistoryFirst = arguments5 != null ? arguments5.getBoolean("historyFist", this.isHistoryFirst) : this.isHistoryFirst;
        Bundle arguments6 = getArguments();
        this.openDownload = arguments6 != null ? arguments6.getBoolean("download") : false;
        this.fromTrending = Intrinsics.m97797c(c24662i.m96877i(), "Trending");
        Bundle arguments7 = getArguments();
        this.mSubject = (Subject) (arguments7 != null ? arguments7.getSerializable("item_object") : null);
        if (this.mSubjectId.length() == 0) {
            Subject subject = this.mSubject;
            if (subject != null && (subjectId = subject.getSubjectId()) != null) {
                str = subjectId;
            }
            this.mSubjectId = str;
        }
        Subject subject2 = this.mSubject;
        if ((subject2 != null ? subject2.getTrailer() : null) == null || !C27124c.f82233a.m105540b().m105522b()) {
            C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "No trailer", false, 4, null);
            this.hasTrailer = false;
        } else {
            this.hasTrailer = true;
            C26866a.a aVar = C26866a.f81698a;
            String str2 = this.loggerTag;
            Subject subject3 = this.mSubject;
            C26866a.a.m104898f(aVar, str2, "Has trailer " + (subject3 != null ? subject3.getTrailer() : null), false, 4, null);
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null && (mapM96844g2 = logViewConfig2.m96844g()) != null) {
        }
        String str3 = this.mOps;
        if (str3 != null && str3.length() != 0 && (logViewConfig = getLogViewConfig()) != null && (mapM96844g = logViewConfig.m96844g()) != null) {
        }
        InterfaceC28213d interfaceC28213dM80392s0 = m79851K0().m80392s0();
        if (interfaceC28213dM80392s0 != null) {
            interfaceC28213dM80392s0.mo73646l(this.downloadListener);
        }
        Context context = getContext();
        if (context != null) {
            this.deviceKeyMonitor = new DeviceKeyMonitor(context, new C19000c());
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        DeviceKeyMonitor deviceKeyMonitor = this.deviceKeyMonitor;
        if (deviceKeyMonitor != null) {
            deviceKeyMonitor.m79149b();
        }
        super.onDestroy();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ORPlayerView oRPlayerView = this.mOrPlayerView;
        if (oRPlayerView != null) {
            oRPlayerView.removeAllViews();
        }
        this.mOrPlayerView = null;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onFocusChange(boolean z11) {
        InterfaceC16633f.a.m72429g(this, z11);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                InterfaceC26373f interfaceC26373f = this.mOrPlayer;
                if (interfaceC26373f != null) {
                    interfaceC26373f.pause();
                }
                logPause();
                return;
            }
            FragmentActivity activity = getActivity();
            ShortTvListActivity shortTvListActivity = activity instanceof ShortTvListActivity ? (ShortTvListActivity) activity : null;
            if (shortTvListActivity != null && shortTvListActivity.getIsActivityPaused()) {
                C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "onHiddenChanged play return, isActivityPaused is true", false, 4, null);
                return;
            }
            InterfaceC26373f interfaceC26373f2 = this.mOrPlayer;
            if (interfaceC26373f2 != null) {
                interfaceC26373f2.play();
            }
            logResume();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onIsPlayingChanged(boolean z11) {
        InterfaceC16633f.a.m72430h(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingBegin(C23403e c23403e) {
        InterfaceC16633f.a.m72431i(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e c23403e) {
        InterfaceC16633f.a.m72433k(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
        InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoopingStart() {
        InterfaceC16633f.a.m72437o(this);
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
    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onMediaItemTransition(String uuid) {
        AbstractC26725k abstractC26725k;
        List<Object> arrayList;
        View viewM80081j;
        String id2;
        List<Object> data;
        List<Object> data2;
        m79845E0();
        if (m79851K0().m80350N0()) {
            m79851K0().m80377e1(false);
            C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "onMediaItemTransition skipped: audio track switching", false, 4, null);
            return;
        }
        this.isNewPlayer = true;
        Integer num = (Integer) m79851K0().m80384j0().m14847f();
        if (num != null) {
            int iIntValue = num.intValue();
            m79851K0().m80369Z0(iIntValue);
            C18908g c18908g = this.mAdapter;
            if (c18908g != null) {
                int iM79557S1 = c18908g.m79557S1(iIntValue, this.hasTrailer);
                C18908g c18908g2 = this.mAdapter;
                if (c18908g2 == null || (abstractC26725k = (AbstractC26725k) c18908g2.m36182f0(iM79557S1)) == null || iM79557S1 == -1) {
                    return;
                }
                C18908g c18908g3 = this.mAdapter;
                if (c18908g3 == null || (arrayList = c18908g3.getData()) == null) {
                    arrayList = new ArrayList<>();
                }
                int i11 = iM79557S1 + 1;
                AbstractC26725k abstractC26725k2 = (AbstractC26725k) CollectionsKt.m97362l0(arrayList, i11);
                if (abstractC26725k2 == null) {
                    return;
                }
                if (abstractC26725k2 instanceof C26717c) {
                    InterfaceC26373f interfaceC26373f = this.mOrPlayer;
                    if (interfaceC26373f != null) {
                        interfaceC26373f.pause();
                    }
                    scrollToPosition(i11);
                    return;
                }
                if (abstractC26725k2 instanceof C26719e) {
                    C26866a.a aVar = C26866a.f81698a;
                    C26866a.a.m104898f(aVar, this.loggerTag, "onMediaItemTransition uuid:" + uuid + " nextItem:" + abstractC26725k2, false, 4, null);
                    C26719e c26719e = (C26719e) abstractC26725k2;
                    if (AbstractC26726l.m104527b(c26719e)) {
                        InterfaceC26373f interfaceC26373f2 = this.mOrPlayer;
                        if (interfaceC26373f2 != null) {
                            interfaceC26373f2.pause();
                        }
                        m79842B0();
                        return;
                    }
                    C18908g c18908g4 = this.mAdapter;
                    if (c18908g4 != null) {
                        c18908g4.mo36138G0(i11);
                    }
                    C18908g c18908g5 = this.mAdapter;
                    if (c18908g5 != null && (data2 = c18908g5.getData()) != null) {
                    }
                    C18908g c18908g6 = this.mAdapter;
                    if (c18908g6 != null && (data = c18908g6.getData()) != null) {
                        data.add(iM79557S1, abstractC26725k);
                    }
                    C18908g c18908g7 = this.mAdapter;
                    if (c18908g7 != null) {
                        c18908g7.notifyItemInserted(iM79557S1);
                    }
                    ShortTvPagerChangeControl shortTvPagerChangeControl = this.mPagerChangeControl;
                    if (shortTvPagerChangeControl == null || (viewM80081j = shortTvPagerChangeControl.m80081j()) == 0) {
                        return;
                    }
                    if (viewM80081j instanceof InterfaceC19112d) {
                        InterfaceC16633f interfaceC16633f = (InterfaceC16633f) viewM80081j;
                        ShortTVItem shortTVItemM104512d = c26719e.m104512d();
                        if (shortTVItemM104512d == null || (id2 = shortTVItemM104512d.getId()) == null) {
                            id2 = "";
                        }
                        interfaceC16633f.onMediaItemTransition(id2);
                        ((InterfaceC19112d) viewM80081j).setData(c26719e, this, Integer.valueOf(i11), false, null, null, false, this.fromTrending);
                        int iM104511c = c26719e.m104511c();
                        Integer num2 = (Integer) m79851K0().m80384j0().m14847f();
                        if (num2 == null || iM104511c != num2.intValue()) {
                            m79851K0().m80384j0().mo14858q(Integer.valueOf(c26719e.m104511c()));
                        }
                        ShortTvPagerChangeControl shortTvPagerChangeControl2 = this.mPagerChangeControl;
                        if (shortTvPagerChangeControl2 != null) {
                            shortTvPagerChangeControl2.mo72960f(i11, false, viewM80081j);
                        }
                        InterfaceC26373f interfaceC26373f3 = this.mOrPlayer;
                        boolean zIsPlaying = interfaceC26373f3 != null ? interfaceC26373f3.isPlaying() : false;
                        C26866a.a.m104898f(aVar, this.loggerTag, "onMediaItemTransition  isPlaying:" + zIsPlaying, false, 4, null);
                        if (zIsPlaying) {
                            interfaceC16633f.onRenderFirstFrame();
                        }
                    }
                    m79851K0().m80375d1(c26719e.m104511c());
                }
            }
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m79876j1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        InterfaceC28216g interfaceC28216gM80400z0;
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        C26724j c26724jM79850J0 = m79850J0();
        if (c26724jM79850J0 == null || (interfaceC28216gM80400z0 = m79851K0().m80400z0()) == null) {
            return;
        }
        interfaceC28216gM80400z0.mo73684g(isInPictureInPictureMode, getActivity(), c26724jM79850J0);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError errorInfo, C23403e mediaSource) {
        Intrinsics.m97802h(errorInfo, "errorInfo");
        InterfaceC16633f.a.m72439q(this, errorInfo, mediaSource);
        this.errorInfo = errorInfo;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerRelease(C23403e c23403e) {
        InterfaceC16633f.a.m72442t(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerReset() {
        InterfaceC16633f.a.m72444v(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPrepare(C23403e mediaSource) {
        InterfaceC16633f.a.m72445w(this, mediaSource);
        this.errorInfo = null;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72447y(this, j11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        InterfaceC16633f.a.m72412A(this);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        ShortTvListActivity shortTvListActivity = activity instanceof ShortTvListActivity ? (ShortTvListActivity) activity : null;
        if (shortTvListActivity == null || !shortTvListActivity.getIsActivityPaused()) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, this.loggerTag, "onResume isActivityPaused is true, pause player", false, 4, null);
        InterfaceC26373f interfaceC26373f = this.mOrPlayer;
        if (interfaceC26373f != null) {
            interfaceC26373f.pause();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
        InterfaceC16633f.a.m72413B(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksAudioBitrateChange(int i11) {
        InterfaceC16633f.a.m72414C(this, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksChange(C26906c c26906c) {
        InterfaceC16633f.a.m72415D(this, c26906c);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksVideoBitrateChange(int i11) {
        InterfaceC16633f.a.m72416E(this, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoPause(C23403e mediaSource) {
        InterfaceC16633f.a.m72417F(this, mediaSource);
        m79906r1(false);
        hideLoading();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        InterfaceC16633f.a.m72420I(this, mediaSource);
        m79906r1(true);
    }

    /* JADX INFO: renamed from: p1 */
    public final void m79905p1() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastShowNetWorkErrToastTime > ToastStrategy.LONG_DURATION_TIMEOUT) {
            this.lastShowNetWorkErrToastTime = jCurrentTimeMillis;
            C18812h.f60816a.m79292h(R$string.short_tv_no_network_toast);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m79906r1(boolean videoPlaying) {
        try {
            Result.Companion companion = Result.INSTANCE;
            FragmentActivity activity = getActivity();
            if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                InterfaceC28216g interfaceC28216gM80400z0 = m79851K0().m80400z0();
                Unit unit = null;
                if (interfaceC28216gM80400z0 != null) {
                    ORPlayerView oRPlayerView = this.mOrPlayerView;
                    ViewParent parent = oRPlayerView != null ? oRPlayerView.getParent() : null;
                    interfaceC28216gM80400z0.mo73678a(activity, true, videoPlaying, parent instanceof ViewGroup ? (ViewGroup) parent : null);
                    unit = Unit.f75682a;
                }
                Result.m112707constructorimpl(unit);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }

    public final void startLoading() {
        HandlerC18999b handlerC18999b = this.loadingHandler;
        if (handlerC18999b.hasMessages(handlerC18999b.m79908b())) {
            return;
        }
        HandlerC18999b handlerC18999b2 = this.loadingHandler;
        handlerC18999b2.sendEmptyMessageDelayed(handlerC18999b2.m79908b(), this.loadingHandler.m79907a());
    }
}
