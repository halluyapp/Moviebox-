package com.transsion.shorttv.p315ui.fragment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5796o;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p284to.aboomy.pager2banner.C13890b;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.base.fragment.PageStatusFragment;
import com.transsion.shorttv.base.widget.AbstractC18797k;
import com.transsion.shorttv.base.widget.NpaGridLayoutManager;
import com.transsion.shorttv.base.widget.SafeRecyclerView;
import com.transsion.shorttv.base.widget.StateView;
import com.transsion.shorttv.bean.BannerBean;
import com.transsion.shorttv.bean.BannerData;
import com.transsion.shorttv.bean.Image;
import com.transsion.shorttv.bean.OperateItem;
import com.transsion.shorttv.bean.OperatingResp;
import com.transsion.shorttv.bean.Pager;
import com.transsion.shorttv.bean.ShortTVRespData;
import com.transsion.shorttv.bean.ShortTvItemType;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p315ui.adapter.C18909h;
import com.transsion.shorttv.p315ui.adapter.ShortTVBannerAdapter;
import com.transsion.shorttv.p315ui.widget.ShortTVBannerView;
import com.transsion.shorttv.p315ui.widget.ShortTVDiscoverHeaderView;
import com.transsion.shorttv.p315ui.widget.ShortTVFavoriteView;
import com.transsion.shorttv.p315ui.widget.ShortTvCategoryView;
import com.transsion.shorttv.p315ui.widget.ShortTvLoadMoreView;
import com.transsion.shorttv.utils.C19158a;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import es.C23218a;
import is.AbstractC24220a;
import is.AbstractC24222c;
import is.C24226g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l00.C25472a;
import p330cs.C22776b;
import p330cs.InterfaceC22775a;
import p331ct.C22777a;
import p356ds.AbstractC23047a;
import p550kj.C24655b;
import p557ks.C25427b;
import p717qr.C27124c;
import p743rh.C27287m;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p848vs.InterfaceC28221l;
import p919xs.C28653a;
import pg.C26866a;
import ph.C26867a;
import rs.C27361q0;
import rs.C27370x;
import ss.C27644a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u0098\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Û\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u0019\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0019\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0004J\u001f\u0010$\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\u00052\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\"H\u0002¢\u0006\u0004\b(\u0010%J'\u0010.\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0005H\u0002¢\u0006\u0004\b0\u0010\u0004J\u0017\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020)H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020#H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0005H\u0002¢\u0006\u0004\b7\u0010\u0004J\u000f\u00108\u001a\u00020\u0005H\u0002¢\u0006\u0004\b8\u0010\u0004J\u001f\u0010<\u001a\u00020\u00052\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u0010H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0005H\u0002¢\u0006\u0004\b>\u0010\u0004J\u0017\u0010A\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0005H\u0016¢\u0006\u0004\bF\u0010\u0004J\u000f\u0010G\u001a\u00020\u0005H\u0016¢\u0006\u0004\bG\u0010\u0004J\r\u0010H\u001a\u00020\u0005¢\u0006\u0004\bH\u0010\u0004J\u000f\u0010I\u001a\u00020\u0005H\u0016¢\u0006\u0004\bI\u0010\u0004J\u000f\u0010J\u001a\u00020\u0005H\u0016¢\u0006\u0004\bJ\u0010\u0004J)\u0010O\u001a\u00020\u00052\u0006\u0010L\u001a\u00020K2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050M¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0005H\u0016¢\u0006\u0004\bQ\u0010\u0004J\u000f\u0010R\u001a\u00020\u0005H\u0016¢\u0006\u0004\bR\u0010\u0004J/\u0010U\u001a\u00020\u00052\u000e\u0010S\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\"2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010T\u001a\u00020\u0010H\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0005H\u0016¢\u0006\u0004\bW\u0010\u0004J\u0017\u0010Z\u001a\u00020Y2\u0006\u0010X\u001a\u00020\u0010H\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020)H\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020YH\u0016¢\u0006\u0004\b^\u0010_J\u0011\u0010`\u001a\u0004\u0018\u00010YH\u0016¢\u0006\u0004\b`\u0010_J\u000f\u0010a\u001a\u00020)H\u0016¢\u0006\u0004\ba\u0010]J\u0017\u0010c\u001a\u00020\u00052\u0006\u0010b\u001a\u00020\u0010H\u0016¢\u0006\u0004\bc\u0010\u0013J\u000f\u0010d\u001a\u00020\u0005H\u0016¢\u0006\u0004\bd\u0010\u0004J\u000f\u0010e\u001a\u00020\u0005H\u0016¢\u0006\u0004\be\u0010\u0004J\u000f\u0010f\u001a\u00020CH\u0016¢\u0006\u0004\bf\u0010EJ\u000f\u0010g\u001a\u00020CH\u0016¢\u0006\u0004\bg\u0010EJ\u000f\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0005H\u0016¢\u0006\u0004\bk\u0010\u0004R\"\u0010p\u001a\n l*\u0004\u0018\u00010C0C8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010ER$\u0010x\u001a\u0004\u0018\u00010q8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010}\u001a\u00020C8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\by\u0010n\u001a\u0004\bz\u0010E\"\u0004\b{\u0010|R*\u0010\u0085\u0001\u001a\u0004\u0018\u00010~8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R!\u0010\u008b\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R'\u0010\u0092\u0001\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010\u0015\"\u0005\b\u0093\u0001\u0010\u0013R'\u0010\u0095\u0001\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\b\u0094\u0001\u0010\u0091\u0001\u001a\u0005\b\u0095\u0001\u0010\u0015\"\u0005\b\u0096\u0001\u0010\u0013R\u0019\u0010\u0099\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R'\u0010\u009e\u0001\u001a\u0010\u0012\u0004\u0012\u00020C\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001c\u0010¦\u0001\u001a\u0005\u0018\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001b\u0010©\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010\u0088\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010°\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u0098\u0001R\u001a\u0010´\u0001\u001a\u00030±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0019\u0010¶\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u0091\u0001R\u0017\u0010¸\u0001\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010\u0098\u0001RH\u0010Á\u0001\u001a!\u0012\u0015\u0012\u00130\u0010¢\u0006\u000e\b¹\u0001\u0012\t\bº\u0001\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R\u001b\u0010Ä\u0001\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R'\u0010Æ\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010¼\u0001R\u0017\u0010È\u0001\u001a\u00020\u00108\u0002X\u0082D¢\u0006\b\n\u0006\bÇ\u0001\u0010\u0091\u0001R'\u0010Ì\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bÉ\u0001\u0010\u0091\u0001\u001a\u0005\bÊ\u0001\u0010\u0015\"\u0005\bË\u0001\u0010\u0013R\u0019\u0010Î\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010\u0098\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001c\u0010Ö\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0016\u0010Ø\u0001\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010\u0015R\u0016\u0010Ú\u0001\u001a\u00020)8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010]¨\u0006Ü\u0001"}, m97100d2 = {"Lcom/transsion/shorttv/ui/fragment/ShortTVDiscoverFragment;", "Lcom/transsion/shorttv/base/fragment/PageStatusFragment;", "Lrs/x;", "<init>", "()V", "", "Y0", "Lcom/transsion/shorttv/bean/OperatingResp;", "M0", "(Lcom/transsion/shorttv/bean/OperatingResp;)Lcom/transsion/shorttv/bean/OperatingResp;", "Lcom/transsion/shorttv/bean/ShortTVRespData;", "data", "C1", "(Lcom/transsion/shorttv/bean/ShortTVRespData;)V", "z1", "(Lcom/transsion/shorttv/bean/OperatingResp;)V", "", "isBanner", "L0", "(Z)V", "W0", "()Z", "s1", "I0", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "K0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "loadMore", "isRefresh", "k1", "j1", "H0", "t1", "", "Lcom/transsion/shorttv/bean/BannerData;", "v1", "(Ljava/util/List;)V", "Lcom/transsion/shorttv/bean/OperateItem;", "ops", "A1", "", "fromPosition", "toPosition", "", "positionOffset", "n1", "(IIF)V", "l1", "dy", "o1", "(I)V", RequestParameters.POSITION, "m1", "(ILcom/transsion/shorttv/bean/BannerData;)V", "showLoading", "hideLoading", "Lcom/transsion/shorttv/bean/Subject;", "subject", "isDownloadView", "p1", "(Lcom/transsion/shorttv/bean/Subject;Z)V", "initAd", "Landroid/view/LayoutInflater;", "inflater", "V0", "(Landroid/view/LayoutInflater;)Lrs/x;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "u1", TmcConstants.NAVIGATION_ON_START, "initListener", "Landroidx/recyclerview/widget/RecyclerView$r;", "pageScrollListener", "Lkotlin/Function1;", "onLoaderSuccess", "B1", "(Landroidx/recyclerview/widget/RecyclerView$r;Lkotlin/jvm/functions/Function1;)V", "retryLoadData", "r1", "list", "hasMore", "E1", "(Ljava/util/List;ZZ)V", "D1", "isShowTitleLayout", "Landroid/view/View;", "getEmptyView", "(Z)Landroid/view/View;", "getScreenType", "()I", "getNoNetworkView", "()Landroid/view/View;", "getLoadingView", "T0", "hidden", "onHiddenChanged", "onResume", "onPause", "getPageName", "R0", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDestroy", "kotlin.jvm.PlatformType", "i", "Ljava/lang/String;", "getTAG", "TAG", "Lcom/transsion/shorttv/ui/adapter/h;", "j", "Lcom/transsion/shorttv/ui/adapter/h;", "S0", "()Lcom/transsion/shorttv/ui/adapter/h;", "setListAdapter", "(Lcom/transsion/shorttv/ui/adapter/h;)V", "listAdapter", CampaignEx.JSON_KEY_AD_K, "getNextPage", "setNextPage", "(Ljava/lang/String;)V", "nextPage", "Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "l", "Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "getViewModel", "()Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "setViewModel", "(Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;)V", "viewModel", "Lxs/a;", "m", "Lkotlin/Lazy;", "U0", "()Lxs/a;", "recReport", "Lcom/transsion/shorttv/ui/widget/ShortTVFavoriteView;", "n", "Lcom/transsion/shorttv/ui/widget/ShortTVFavoriteView;", "favoriteHeaderView", "o", "Z", "isFirstStart", "setFirstStart", TtmlNode.TAG_P, "isFirstPageChange", "setFirstPageChange", CampaignEx.JSON_KEY_AD_Q, "I", "tabId", "", "Landroid/view/ViewGroup;", CampaignEx.JSON_KEY_AD_R, "Ljava/util/Map;", "headerViewList", "Lrs/q0;", "s", "Lrs/q0;", "bannerBinding", "Lcom/transsion/shorttv/ui/adapter/ShortTVBannerAdapter;", "t", "Lcom/transsion/shorttv/ui/adapter/ShortTVBannerAdapter;", "bannerAdapter", TmcStartParams.KEY_URL_SHORT, "Lcom/transsion/shorttv/bean/OperatingResp;", "curOperatingResp", "Lcom/transsion/shorttv/utils/a;", "v", "O0", "()Lcom/transsion/shorttv/utils/a;", "bannerDotHelper", "w", "bannerCurPosition", "", "x", "J", "bannerBrowseTime", "y", "hasAddedBanner", "z", "statusBarHeight", "Lkotlin/ParameterName;", "name", "A", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "B", "Landroidx/recyclerview/widget/RecyclerView$r;", "subTabScrollListener", "C", "subTabLoadSuccessListener", "D", "mockServerNoBanner", "E", "getHasSlideOutBanner", "y1", "hasSlideOutBanner", "F", "mDy", "Lcs/b;", "G", "Lcs/b;", "exposureHelper", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "H", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "v3ListManager", "Q0", "hasTopTabs", "N0", "adjustNoBannerTopMarginPx", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public class ShortTVDiscoverFragment extends PageStatusFragment<C27370x> {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Function1 listener;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private RecyclerView.AbstractC4219r subTabScrollListener;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private Function1 subTabLoadSuccessListener;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final boolean mockServerNoBanner;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean hasSlideOutBanner;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private int mDy;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private BiddingListManager v3ListManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private C18909h listAdapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private ShortTvViewModel viewModel;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private ShortTVFavoriteView favoriteHeaderView;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private C27361q0 bannerBinding;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private ShortTVBannerAdapter bannerAdapter;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private OperatingResp curOperatingResp;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private long bannerBrowseTime;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean hasAddedBanner;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String TAG = getClass().getSimpleName();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String nextPage = "1";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy recReport = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.ui.fragment.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTVDiscoverFragment.m79786q1();
        }
    });

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isFirstStart = true;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean isFirstPageChange = true;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int tabId = 13;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Map headerViewList = new LinkedHashMap();

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final Lazy bannerDotHelper = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.ui.fragment.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTVDiscoverFragment.m79745J0(this.f61311a);
        }
    });

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int bannerCurPosition = -1;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int statusBarHeight = AbstractC5781d.m27351c();

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C22776b exposureHelper = new C22776b(0.6f, new C18983d(), false, 4, null);

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVDiscoverFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ ShortTVDiscoverFragment m79812b(Companion companion, boolean z11, Bundle bundle, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bundle = null;
            }
            return companion.m79813a(z11, bundle);
        }

        /* JADX INFO: renamed from: a */
        public final ShortTVDiscoverFragment m79813a(boolean z11, Bundle bundle) {
            ShortTVDiscoverFragment shortTVDiscoverFragment = new ShortTVDiscoverFragment();
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("arg_has_top_tabs", z11);
            shortTVDiscoverFragment.setArguments(bundle2);
            return shortTVDiscoverFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVDiscoverFragment$b */
    public /* synthetic */ class C18981b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f61147a;

        static {
            int[] iArr = new int[ShortTvItemType.values().length];
            try {
                iArr[ShortTvItemType.FILTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortTvItemType.APPOINTMENT_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShortTvItemType.CUSTOM_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShortTvItemType.OP_SUBJECTS_MOVIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShortTvItemType.PLAY_LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f61147a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVDiscoverFragment$c */
    public static final class C18982c extends RecyclerView.AbstractC4219r {
        C18982c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (i12 > 0) {
                ShortTVDiscoverFragment.this.m79746K0(recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVDiscoverFragment$d */
    public static final class C18983d implements InterfaceC22775a {
        C18983d() {
        }

        @Override // p330cs.InterfaceC22775a
        /* JADX INFO: renamed from: a */
        public void mo78681a(int i11, long j11, View view) {
            Subject subjectM90707b;
            List<Object> data;
            List<Object> data2;
            C18909h listAdapter = ShortTVDiscoverFragment.this.getListAdapter();
            if (((listAdapter == null || (data2 = listAdapter.getData()) == null) ? 0 : data2.size()) <= i11) {
                return;
            }
            C18909h listAdapter2 = ShortTVDiscoverFragment.this.getListAdapter();
            C22777a c22777a = (listAdapter2 == null || (data = listAdapter2.getData()) == null) ? null : (C22777a) data.get(i11);
            if (c22777a == null || c22777a.m90709d() != 1 || (subjectM90707b = c22777a.m90707b()) == null) {
                return;
            }
            ShortTVDiscoverFragment shortTVDiscoverFragment = ShortTVDiscoverFragment.this;
            shortTVDiscoverFragment.m79753U0().m110418a(shortTVDiscoverFragment.getPageName(), subjectM90707b, i11, Long.valueOf(j11), shortTVDiscoverFragment.m79805R0());
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVDiscoverFragment$e */
    public static final class C18984e extends DiffUtil.AbstractC4174e {
        C18984e() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C22777a oldItem, C22777a newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            if (oldItem.m90709d() != 1 || newItem.m90709d() != 1) {
                return false;
            }
            Subject subjectM90707b = oldItem.m90707b();
            String subjectId = subjectM90707b != null ? subjectM90707b.getSubjectId() : null;
            Subject subjectM90707b2 = newItem.m90707b();
            return Intrinsics.m97797c(subjectId, subjectM90707b2 != null ? subjectM90707b2.getSubjectId() : null);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C22777a oldItem, C22777a newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            if (oldItem.m90709d() != newItem.m90709d()) {
                return false;
            }
            if (oldItem.m90709d() != 1) {
                return Intrinsics.m97797c(oldItem, newItem);
            }
            Subject subjectM90707b = oldItem.m90707b();
            String subjectId = subjectM90707b != null ? subjectM90707b.getSubjectId() : null;
            Subject subjectM90707b2 = newItem.m90707b();
            return Intrinsics.m97797c(subjectId, subjectM90707b2 != null ? subjectM90707b2.getSubjectId() : null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVDiscoverFragment$f */
    public static final class C18985f extends GridLayoutManager.AbstractC4187c {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ SafeRecyclerView f61151f;

        C18985f(SafeRecyclerView safeRecyclerView) {
            this.f61151f = safeRecyclerView;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC4187c
        /* JADX INFO: renamed from: f */
        public int mo20742f(int i11) {
            C22777a c22777a;
            Subject subjectM90707b;
            C18909h listAdapter = ShortTVDiscoverFragment.this.getListAdapter();
            boolean z11 = ((listAdapter == null || (c22777a = (C22777a) listAdapter.m36182f0(i11)) == null || (subjectM90707b = c22777a.m90707b()) == null) ? null : subjectM90707b.getNonAdDelegate()) != null;
            Context context = this.f61151f.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            return (!AbstractC24220a.m95235a(context) || z11) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVDiscoverFragment$g */
    public static final class C18986g extends RecyclerView.AbstractC4213l {
        C18986g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (parent.getAdapter() != null) {
                if (childAdapterPosition == 0) {
                    outRect.top = AbstractC5776a0.m27313a(0.0f);
                } else {
                    outRect.top = AbstractC5776a0.m27313a(16.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVDiscoverFragment$h */
    public static final class C18987h extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        private int f61152a;

        C18987h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            C27370x c27370x;
            SafeRecyclerView safeRecyclerView;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            if (i11 != 0 || (c27370x = (C27370x) ShortTVDiscoverFragment.this.getMViewBinding()) == null || (safeRecyclerView = c27370x.f83349b) == null || safeRecyclerView.canScrollVertically(-1)) {
                return;
            }
            ShortTVDiscoverFragment shortTVDiscoverFragment = ShortTVDiscoverFragment.this;
            shortTVDiscoverFragment.m79747L0(shortTVDiscoverFragment.m79754W0());
            ShortTVDiscoverFragment.this.m79811y1(false);
            this.f61152a = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            ShortTVDiscoverFragment.this.m79782o1(i12);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVDiscoverFragment$i */
    static final class C18988i implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f61154a;

        C18988i(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f61154a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f61154a;
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
            this.f61154a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVDiscoverFragment$j */
    public static final class C18989j extends ViewPager2.OnPageChangeCallback {
        C18989j() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            ShortTVDiscoverFragment shortTVDiscoverFragment = ShortTVDiscoverFragment.this;
            shortTVDiscoverFragment.m79780n1(i11, shortTVDiscoverFragment.bannerCurPosition, f11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            if (ShortTVDiscoverFragment.this.isResumed()) {
                ShortTVDiscoverFragment.this.m79776l1();
                ShortTVDiscoverFragment.this.bannerBrowseTime = System.currentTimeMillis();
            }
            ShortTVDiscoverFragment.this.bannerCurPosition = i11;
        }
    }

    /* JADX INFO: renamed from: A1 */
    private final void m79733A1(List ops) {
        Context context;
        int i11;
        boolean z11;
        OperateItem operateItem;
        boolean z12;
        List<OperateItem> listI0;
        C18909h c18909h;
        Object next;
        if (!isAdded() || isDetached() || isRemoving() || (context = getContext()) == null) {
            return;
        }
        boolean zM95235a = AbstractC24220a.m95235a(context);
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "setOtherOps ---", false, 4, null);
        String str = ShortTvItemType.FILTER.getValue() + "_";
        Iterator it = CollectionsKt.m97340R0(this.headerViewList.entrySet()).iterator();
        while (true) {
            i11 = 2;
            Unit unit = null;
            z11 = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            ViewGroup viewGroup = (ViewGroup) entry.getValue();
            if (!StringsKt.m98242W(str2, str, false, 2, null)) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    C18909h c18909h2 = this.listAdapter;
                    if (c18909h2 != null) {
                        c18909h2.m36143J0(viewGroup);
                        unit = Unit.f75682a;
                    }
                    Result.m112707constructorimpl(unit);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m112707constructorimpl(ResultKt.m97106a(th2));
                }
                this.headerViewList.remove(str2);
            }
        }
        if (ops != null) {
            Iterator it2 = ops.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.m97797c(((OperateItem) next).getType(), ShortTvItemType.FILTER.getValue()));
            operateItem = (OperateItem) next;
        } else {
            operateItem = null;
        }
        if (operateItem == null) {
            z12 = true;
        } else {
            if (ops != null) {
                List list = ops;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (Intrinsics.m97797c(((OperateItem) it3.next()).getType(), ShortTvItemType.FILTER.getValue())) {
                                z12 = true;
                            }
                        }
                    }
                }
            }
            z12 = false;
        }
        Set setKeySet = this.headerViewList.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator it4 = setKeySet.iterator();
            while (it4.hasNext()) {
                if (StringsKt.m98242W((String) it4.next(), str, false, 2, null)) {
                    z11 = true;
                    break;
                }
            }
        }
        if (z12 && !z11) {
            String str3 = ShortTvItemType.FILTER + "_1";
            int i12 = this.hasAddedBanner ? 2 : 1;
            C18909h c18909h3 = this.listAdapter;
            if (c18909h3 != null) {
                ShortTvCategoryView shortTvCategoryView = new ShortTvCategoryView(context);
                this.headerViewList.put(str3, shortTvCategoryView);
                BaseQuickAdapter.m36130y(c18909h3, shortTvCategoryView, i12, 0, 4, null);
            }
        }
        if (ops == null || (listI0 = CollectionsKt.m97331I0(ops, new Comparator() { // from class: com.transsion.shorttv.ui.fragment.ShortTVDiscoverFragment$setOtherOperation$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.m97603d(((OperateItem) t11).getPosition(), ((OperateItem) t12).getPosition());
            }
        })) == null) {
            return;
        }
        for (OperateItem operateItem2 : listI0) {
            ShortTvItemType.Companion companion3 = ShortTvItemType.INSTANCE;
            String type = operateItem2.getType();
            if (type == null) {
                type = "";
            }
            ShortTvItemType shortTvItemTypeM79329a = companion3.m79329a(type);
            C26866a.a aVar2 = C26866a.f81698a;
            String TAG2 = this.TAG;
            Intrinsics.m97801g(TAG2, "TAG");
            C26866a.a.m104898f(aVar2, TAG2, "setOtherOps --type:" + shortTvItemTypeM79329a + "_" + operateItem2.getPosition() + "， " + operateItem2.getTitle(), false, 4, null);
            int i13 = shortTvItemTypeM79329a == null ? -1 : C18981b.f61147a[shortTvItemTypeM79329a.ordinal()];
            if ((i13 == i11 || i13 == 3 || i13 == 4 || i13 == 5) && (c18909h = this.listAdapter) != null) {
                c18909h.mo36205p(new C22777a(0, null, null, operateItem2, this.tabId, zM95235a, 6, null));
            }
            i11 = 2;
        }
    }

    /* JADX INFO: renamed from: C1 */
    private final void m79736C1(ShortTVRespData data) {
        String nextPage;
        Boolean hasMore;
        C27941f c27941fM36186h0;
        C18909h c18909h;
        C27941f c27941fM36186h1;
        C18909h c18909h2;
        List<Object> data2;
        if (data == null) {
            if (this.bannerBinding == null && this.headerViewList.isEmpty() && (c18909h2 = this.listAdapter) != null && (data2 = c18909h2.getData()) != null && data2.isEmpty()) {
                m79803D1();
                return;
            }
            C18909h c18909h3 = this.listAdapter;
            if (c18909h3 == null || (c27941fM36186h0 = c18909h3.m36186h0()) == null || !c27941fM36186h0.m108666r() || (c18909h = this.listAdapter) == null || (c27941fM36186h1 = c18909h.m36186h0()) == null) {
                return;
            }
            c27941fM36186h1.m108669v();
            return;
        }
        Pager pager = data.getPager();
        if (pager == null || (nextPage = pager.getNextPage()) == null) {
            nextPage = "1";
        }
        this.nextPage = nextPage;
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        String str = this.nextPage;
        List<Subject> items = data.getItems();
        Integer numValueOf = items != null ? Integer.valueOf(items.size()) : null;
        Pager pager2 = data.getPager();
        C26866a.a.m104898f(aVar, TAG, "updateTreadingList,nextPage :" + str + ", size:" + numValueOf + ", hasMore:" + (pager2 != null ? pager2.getHasMore() : null), false, 4, null);
        List<Subject> items2 = data.getItems();
        boolean zIsRefresh = data.isRefresh();
        Pager pager3 = data.getPager();
        m79804E1(items2, zIsRefresh, (pager3 == null || (hasMore = pager3.getHasMore()) == null) ? false : hasMore.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final void m79740F1(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        C18909h c18909h = shortTVDiscoverFragment.listAdapter;
        if (c18909h != null) {
            c18909h.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final void m79742G1(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        C18909h c18909h = shortTVDiscoverFragment.listAdapter;
        if (c18909h != null) {
            c18909h.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: H0 */
    private final void m79743H0() {
        Context context;
        if (this.favoriteHeaderView == null && (context = getContext()) != null) {
            ShortTVFavoriteView shortTVFavoriteView = new ShortTVFavoriteView(this, "collection", m79753U0(), context);
            this.favoriteHeaderView = shortTVFavoriteView;
            if (this.hasAddedBanner) {
                C18909h c18909h = this.listAdapter;
                if (c18909h != null) {
                    Intrinsics.m97799e(shortTVFavoriteView);
                    BaseQuickAdapter.m36130y(c18909h, shortTVFavoriteView, 2, 0, 4, null);
                    return;
                }
                return;
            }
            C18909h c18909h2 = this.listAdapter;
            if (c18909h2 != null) {
                Intrinsics.m97799e(shortTVFavoriteView);
                BaseQuickAdapter.m36130y(c18909h2, shortTVFavoriteView, 1, 0, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    private final void m79744I0() {
        SafeRecyclerView safeRecyclerView;
        C27370x c27370x = (C27370x) getMViewBinding();
        if (c27370x == null || (safeRecyclerView = c27370x.f83349b) == null) {
            return;
        }
        safeRecyclerView.addOnScrollListener(new C18982c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C19158a m79745J0(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        return new C19158a(shortTVDiscoverFragment.getPageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public final void m79746K0(RecyclerView recyclerView) {
        C18909h c18909h;
        LinearLayout linearLayoutM36172Z;
        RecyclerView.AbstractC4214m layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() != 0 || (c18909h = this.listAdapter) == null || (linearLayoutM36172Z = c18909h.m36172Z()) == null) {
            return;
        }
        int childCount = linearLayoutM36172Z.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayoutM36172Z.getChildAt(i11);
            if ((childAt instanceof ShortTVDiscoverHeaderView) && childAt.getVisibility() == 0) {
                ((ShortTVDiscoverHeaderView) childAt).clearExposureCache();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public final void m79747L0(boolean isBanner) {
        int color;
        C27370x c27370x;
        View view;
        if (isBanner && m79754W0()) {
            ImmersionBar immersionBarWith = ImmersionBar.with(this);
            color = 0;
            immersionBarWith.statusBarDarkFont(false);
            immersionBarWith.init();
        } else {
            color = AbstractC2397b.getColor(requireContext(), R$color.short_tv_bg_02);
            ImmersionBar immersionBarWith2 = ImmersionBar.with(this);
            immersionBarWith2.statusBarDarkFont(!C24226g.f73740a.m95252a());
            immersionBarWith2.init();
        }
        if (C27124c.f82233a.m105540b().m105524d().mo105531a() || (c27370x = (C27370x) getMViewBinding()) == null || (view = c27370x.f83354g) == null) {
            return;
        }
        view.setBackgroundColor(color);
    }

    /* JADX INFO: renamed from: M0 */
    private final OperatingResp m79748M0(OperatingResp operatingResp) {
        OperateItem operateItem;
        BannerBean banner;
        List<BannerData> banners;
        List<OperateItem> items = operatingResp.getItems();
        if (items == null || (operateItem = (OperateItem) CollectionsKt.m97362l0(items, 0)) == null || (banner = operateItem.getBanner()) == null || (banners = banner.getBanners()) == null || banners.isEmpty()) {
            return operatingResp;
        }
        OperateItem operateItemCopy = operateItem.copy((2097135 & 1) != 0 ? operateItem.title : null, (2097135 & 2) != 0 ? operateItem.type : null, (2097135 & 4) != 0 ? operateItem.position : null, (2097135 & 8) != 0 ? operateItem.deepLink : null, (2097135 & 16) != 0 ? operateItem.banner : BannerBean.copy$default(banner, null, null, null, false, null, 29, null), (2097135 & 32) != 0 ? operateItem.filters : null, (2097135 & 64) != 0 ? operateItem.subjects : null, (2097135 & 128) != 0 ? operateItem.customData : null, (2097135 & 256) != 0 ? operateItem.playListData : null, (2097135 & 512) != 0 ? operateItem.feedsSubject : null, (2097135 & 1024) != 0 ? operateItem.opId : null, (2097135 & 2048) != 0 ? operateItem.page : null, (2097135 & 4096) != 0 ? operateItem.rankings : null, (2097135 & 8192) != 0 ? operateItem.rankingData : null, (2097135 & 16384) != 0 ? operateItem.rankingListData : null, (2097135 & 32768) != 0 ? operateItem.liveList : null, (2097135 & 65536) != 0 ? operateItem.groups : null, (2097135 & 131072) != 0 ? operateItem.nonAdDelegate : null, (2097135 & 262144) != 0 ? operateItem.pageName : null, (2097135 & 524288) != 0 ? operateItem.md5 : null, (2097135 & 1048576) != 0 ? operateItem.ops : null);
        List listU0 = CollectionsKt.m97343U0(items);
        listU0.set(0, operateItemCopy);
        OperatingResp operatingRespCopy$default = OperatingResp.copy$default(operatingResp, listU0, null, null, null, 14, null);
        operatingRespCopy$default.setCache(operatingResp.getIsCache());
        return operatingRespCopy$default;
    }

    /* JADX INFO: renamed from: N0 */
    private final int m79749N0() {
        return AbstractC23047a.m91689a(C27124c.f82233a.m105540b().m105524d().mo105534d());
    }

    /* JADX INFO: renamed from: O0 */
    private final C19158a m79750O0() {
        return (C19158a) this.bannerDotHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final Unit m79751P0(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        String strM96843f;
        shortTVDiscoverFragment.retryLoadData();
        C24655b logViewConfig = shortTVDiscoverFragment.getLogViewConfig();
        if (logViewConfig != null && (strM96843f = logViewConfig.m96843f()) != null) {
            AbstractC18797k.m79223b(strM96843f);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: Q0 */
    private final boolean m79752Q0() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean("arg_has_top_tabs", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public final C28653a m79753U0() {
        return (C28653a) this.recReport.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public final boolean m79754W0() {
        ShortTVBannerAdapter shortTVBannerAdapter = this.bannerAdapter;
        if (shortTVBannerAdapter == null) {
            return false;
        }
        Intrinsics.m97799e(shortTVBannerAdapter);
        return shortTVBannerAdapter.getData().size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m79755X0(ShortTVDiscoverFragment shortTVDiscoverFragment, int i11, BiddingNativeManager wrapperNativeManager) {
        List<Object> data;
        Intrinsics.m97802h(wrapperNativeManager, "wrapperNativeManager");
        if (wrapperNativeManager != null) {
            Subject subject = new Subject(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, false, null, null, 0, 0, null, 0, null, 0, null, -1, 1073741823, null);
            subject.setNonAdDelegate(wrapperNativeManager);
            C18909h c18909h = shortTVDiscoverFragment.listAdapter;
            int size = (c18909h == null || (data = c18909h.getData()) == null) ? 0 : data.size();
            Context context = shortTVDiscoverFragment.getContext();
            int i12 = (context == null || !AbstractC24220a.m95235a(context) || i11 % 2 == 0) ? i11 : i11 - 1;
            if (i12 <= size) {
                C18909h c18909h2 = shortTVDiscoverFragment.listAdapter;
                if (c18909h2 != null) {
                    c18909h2.mo36199n(i12, new C22777a(1, null, subject, null, 0, false, 58, null));
                }
            } else {
                C18909h c18909h3 = shortTVDiscoverFragment.listAdapter;
                if (c18909h3 != null) {
                    c18909h3.mo36199n(size, new C22777a(1, null, subject, null, 0, false, 58, null));
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m79756Y0() {
        final SwipeRefreshLayout swipeRefreshLayout;
        SafeRecyclerView safeRecyclerView;
        final boolean z11 = true;
        C18909h c18909h = new C18909h(getPageName(), true);
        c18909h.m36186h0().m108655C(new ShortTvLoadMoreView());
        c18909h.m36186h0().m108673z(true);
        c18909h.m36186h0().m108672y(true);
        c18909h.m36186h0().m108657E(3);
        c18909h.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.shorttv.ui.fragment.m
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                ShortTVDiscoverFragment.m79758a1(this.f61317a);
            }
        });
        c18909h.m36158R0(new C18984e());
        c18909h.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv.ui.fragment.n
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTVDiscoverFragment.m79759b1(this.f61319a, baseQuickAdapter, view, i11);
            }
        });
        c18909h.m36193l(R$id.btn_download);
        c18909h.m36216s1(new InterfaceC27564b() { // from class: com.transsion.shorttv.ui.fragment.o
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTVDiscoverFragment.m79760c1(this.f61321a, z11, baseQuickAdapter, view, i11);
            }
        });
        this.listAdapter = c18909h;
        C27370x c27370x = (C27370x) getMViewBinding();
        if (c27370x != null && (safeRecyclerView = c27370x.f83349b) != null) {
            NpaGridLayoutManager npaGridLayoutManager = new NpaGridLayoutManager(safeRecyclerView.getContext(), 2);
            npaGridLayoutManager.m20740d0(new C18985f(safeRecyclerView));
            safeRecyclerView.setLayoutManager(npaGridLayoutManager);
            safeRecyclerView.setAdapter(this.listAdapter);
            safeRecyclerView.setItemAnimator(null);
            safeRecyclerView.addOnScrollListener(this.exposureHelper);
            m79744I0();
            safeRecyclerView.addItemDecoration(new C18986g());
        }
        C27370x c27370x2 = (C27370x) getMViewBinding();
        if (c27370x2 == null || (swipeRefreshLayout = c27370x2.f83350c) == null) {
            return;
        }
        int iM27313a = AbstractC5776a0.m27313a(30.0f);
        int i11 = this.statusBarHeight + iM27313a;
        swipeRefreshLayout.setProgressViewOffset(false, i11, (iM27313a * 2) + i11);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.shorttv.ui.fragment.p
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
            /* JADX INFO: renamed from: a */
            public final void mo21823a() {
                ShortTVDiscoverFragment.m79757Z0(swipeRefreshLayout, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final void m79757Z0(SwipeRefreshLayout swipeRefreshLayout, ShortTVDiscoverFragment shortTVDiscoverFragment) {
        if (C27287m.f83003a.m106330e()) {
            shortTVDiscoverFragment.m79809r1();
        } else {
            C25427b.f76996a.m99960d(R$string.short_tv_no_network_toast);
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m79758a1(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        shortTVDiscoverFragment.loadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m79759b1(ShortTVDiscoverFragment shortTVDiscoverFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Subject subjectM90707b;
        List<Object> data;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        C18909h c18909h = shortTVDiscoverFragment.listAdapter;
        C22777a c22777a = (c18909h == null || (data = c18909h.getData()) == null) ? null : (C22777a) CollectionsKt.m97362l0(data, i11);
        if (c22777a == null || (subjectM90707b = c22777a.m90707b()) == null) {
            return;
        }
        shortTVDiscoverFragment.m79753U0().m110419c(shortTVDiscoverFragment.getPageName(), subjectM90707b, i11, shortTVDiscoverFragment.m79805R0());
        shortTVDiscoverFragment.m79784p1(subjectM90707b, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final void m79760c1(ShortTVDiscoverFragment shortTVDiscoverFragment, boolean z11, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Subject subjectM90707b;
        List<Object> data;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        C18909h c18909h = shortTVDiscoverFragment.listAdapter;
        C22777a c22777a = (c18909h == null || (data = c18909h.getData()) == null) ? null : (C22777a) CollectionsKt.m97362l0(data, i11);
        if (c22777a == null || (subjectM90707b = c22777a.m90707b()) == null) {
            return;
        }
        shortTVDiscoverFragment.m79753U0().m110419c(shortTVDiscoverFragment.getPageName(), subjectM90707b, i11, shortTVDiscoverFragment.m79805R0());
        shortTVDiscoverFragment.m79784p1(subjectM90707b, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final void m79761d1(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        SafeRecyclerView safeRecyclerView;
        if (shortTVDiscoverFragment.isAdded()) {
            C27370x c27370x = (C27370x) shortTVDiscoverFragment.getMViewBinding();
            int iComputeVerticalScrollOffset = (c27370x == null || (safeRecyclerView = c27370x.f83349b) == null) ? 0 : safeRecyclerView.computeVerticalScrollOffset();
            shortTVDiscoverFragment.mDy = 0;
            shortTVDiscoverFragment.m79782o1(iComputeVerticalScrollOffset);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final Unit m79762e1(ShortTVDiscoverFragment shortTVDiscoverFragment, OperatingResp operatingResp) {
        shortTVDiscoverFragment.hideLoading();
        if (shortTVDiscoverFragment.mockServerNoBanner) {
            operatingResp = operatingResp != null ? shortTVDiscoverFragment.m79748M0(operatingResp) : null;
        }
        shortTVDiscoverFragment.m79801z1(operatingResp);
        if (operatingResp == null || !operatingResp.getIsCache()) {
            shortTVDiscoverFragment.m79774k1(true);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final Unit m79764f1(ShortTVDiscoverFragment shortTVDiscoverFragment, ShortTVRespData shortTVRespData) {
        shortTVDiscoverFragment.hideLoading();
        shortTVDiscoverFragment.m79736C1(shortTVRespData);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX INFO: renamed from: g1 */
    public static final Unit m79766g1(ShortTVDiscoverFragment shortTVDiscoverFragment, ShortTVRespData shortTVRespData) {
        if ((shortTVRespData != null ? shortTVRespData.getItems() : null) != null) {
            List<Subject> items = shortTVRespData.getItems();
            Intrinsics.m97799e(items);
            if (items.isEmpty()) {
                C26866a.a aVar = C26866a.f81698a;
                String TAG = shortTVDiscoverFragment.TAG;
                Intrinsics.m97801g(TAG, "TAG");
                C26866a.a.m104910z(aVar, TAG, "addHeaderView, has no Favorite", false, 4, null);
                shortTVDiscoverFragment.m79791t1();
            } else {
                C26866a.a aVar2 = C26866a.f81698a;
                String TAG2 = shortTVDiscoverFragment.TAG;
                Intrinsics.m97801g(TAG2, "TAG");
                C26866a.a.m104898f(aVar2, TAG2, "addHeaderView, has Favorite", false, 4, null);
                shortTVDiscoverFragment.m79743H0();
            }
        } else {
            C26866a.a aVar3 = C26866a.f81698a;
            String TAG3 = shortTVDiscoverFragment.TAG;
            Intrinsics.m97801g(TAG3, "TAG");
            C26866a.a.m104910z(aVar3, TAG3, "addHeaderView, has no Favorite", false, 4, null);
            shortTVDiscoverFragment.m79791t1();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final void m79768h1(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        C27941f c27941fM36186h0;
        C18909h c18909h = shortTVDiscoverFragment.listAdapter;
        if (((c18909h == null || (c27941fM36186h0 = c18909h.m36186h0()) == null) ? null : c27941fM36186h0.m108661i()) == LoadMoreStatus.End) {
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        String TAG = shortTVDiscoverFragment.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "load more， loadData", false, 4, null);
        shortTVDiscoverFragment.m79774k1(false);
    }

    private final void hideLoading() {
        showContentView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final void m79770i1(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        C27941f c27941fM36186h0;
        C18909h c18909h = shortTVDiscoverFragment.listAdapter;
        if (c18909h == null || (c27941fM36186h0 = c18909h.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    private final void initAd() {
        BiddingListManager biddingListManager = new BiddingListManager();
        C27370x c27370x = (C27370x) getMViewBinding();
        biddingListManager.m63184F(c27370x != null ? c27370x.f83349b : null);
        biddingListManager.m63179A(AbstractC3226v.m14968a(this));
        biddingListManager.m63185G("ShortTvDiscoverMostTrendingScene");
        biddingListManager.m63192z(new Function2() { // from class: com.transsion.shorttv.ui.fragment.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ShortTVDiscoverFragment.m79755X0(this.f61315a, ((Integer) obj).intValue(), (BiddingNativeManager) obj2);
            }
        });
        this.v3ListManager = biddingListManager;
    }

    /* JADX INFO: renamed from: j1 */
    private final void m79772j1() {
        ShortTvViewModel shortTvViewModel = this.viewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m80382h0(this.tabId);
        }
    }

    /* JADX INFO: renamed from: k1 */
    private final void m79774k1(boolean isRefresh) {
        ShortTvViewModel shortTvViewModel = this.viewModel;
        if (shortTvViewModel != null) {
            shortTvViewModel.m80391r0(this.nextPage, 8, isRefresh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[PHI: r3
      0x006f: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v8 java.lang.String) binds: [B:23:0x0059, B:28:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: l1 */
    public final void m79776l1() {
        List data;
        BannerData bannerData;
        String value;
        List data2;
        int i11 = this.bannerCurPosition;
        if (i11 >= 0) {
            ShortTVBannerAdapter shortTVBannerAdapter = this.bannerAdapter;
            if (i11 >= ((shortTVBannerAdapter == null || (data2 = shortTVBannerAdapter.getData()) == null) ? 0 : data2.size())) {
                return;
            }
            long jCurrentTimeMillis = this.bannerBrowseTime > 0 ? System.currentTimeMillis() - this.bannerBrowseTime : 0L;
            ShortTVBannerAdapter shortTVBannerAdapter2 = this.bannerAdapter;
            if (shortTVBannerAdapter2 == null || (data = shortTVBannerAdapter2.getData()) == null || (bannerData = (BannerData) data.get(this.bannerCurPosition)) == null) {
                return;
            }
            C19158a c19158aM79750O0 = m79750O0();
            String pageName = getPageName();
            ShortTvItemType shortTvItemType = ShortTvItemType.BANNER;
            String value2 = shortTvItemType.getValue();
            String subjectId = bannerData.getSubjectId();
            String ops = bannerData.getOps();
            if (ops != null) {
                value = ops;
            } else {
                Subject subject = bannerData.getSubject();
                ops = subject != null ? subject.getOps() : null;
                if (ops == null) {
                    value = shortTvItemType.getValue();
                } else {
                    value = ops;
                }
            }
            Boolean hasResource = bannerData.getHasResource();
            String deepLink = bannerData.getDeepLink();
            Integer numValueOf = Integer.valueOf(this.bannerCurPosition);
            Image image = bannerData.getImage();
            c19158aM79750O0.m80221a((4112 & 1) != 0 ? null : pageName, (4112 & 2) != 0 ? null : "opt", (4112 & 4) != 0 ? null : value2, (4112 & 8) != 0 ? null : subjectId, (4112 & 16) != 0 ? null : null, (4112 & 32) != 0 ? null : value, (4112 & 64) != 0 ? null : hasResource, (4112 & 128) != 0 ? null : deepLink, (4112 & 256) != 0 ? null : numValueOf, (4112 & 512) != 0 ? null : image != null ? image.getUrl() : null, (4112 & 1024) != 0 ? 0L : jCurrentTimeMillis, (4112 & 2048) != 0 ? Boolean.FALSE : Boolean.valueOf(bannerData.getBuiltIn()), (4112 & 4096) == 0 ? null : null);
        }
    }

    private final void loadMore() {
        SafeRecyclerView safeRecyclerView;
        SafeRecyclerView safeRecyclerView2;
        C27941f c27941fM36186h0;
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "loadMore", false, 4, null);
        if (!C27287m.f83003a.m106330e()) {
            C25427b.f76996a.m99960d(R$string.short_tv_no_network_toast);
            C27370x c27370x = (C27370x) getMViewBinding();
            if (c27370x == null || (safeRecyclerView = c27370x.f83349b) == null) {
                return;
            }
            safeRecyclerView.postDelayed(new Runnable() { // from class: com.transsion.shorttv.ui.fragment.e
                @Override // java.lang.Runnable
                public final void run() {
                    ShortTVDiscoverFragment.m79770i1(this.f61299a);
                }
            }, 500L);
            return;
        }
        C18909h c18909h = this.listAdapter;
        if (c18909h != null && (c27941fM36186h0 = c18909h.m36186h0()) != null) {
            c27941fM36186h0.m108670w();
        }
        C27370x c27370x2 = (C27370x) getMViewBinding();
        if (c27370x2 == null || (safeRecyclerView2 = c27370x2.f83349b) == null) {
            return;
        }
        safeRecyclerView2.postDelayed(new Runnable() { // from class: com.transsion.shorttv.ui.fragment.d
            @Override // java.lang.Runnable
            public final void run() {
                ShortTVDiscoverFragment.m79768h1(this.f61210a);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: m1 */
    private final void m79778m1(int position, BannerData data) {
        String ops = data.getOps();
        if (ops == null) {
            Subject subject = data.getSubject();
            ops = subject != null ? subject.getOps() : null;
            if (ops == null) {
                ops = ShortTvItemType.BANNER.getValue();
            }
        }
        C19158a c19158aM79750O0 = m79750O0();
        String pageName = getPageName();
        String value = ShortTvItemType.BANNER.getValue();
        String subjectId = data.getSubjectId();
        Boolean hasResource = data.getHasResource();
        String deepLink = data.getDeepLink();
        Integer numValueOf = Integer.valueOf(position);
        Image image = data.getImage();
        c19158aM79750O0.m80222c(pageName, "opt", value, (4272 & 8) != 0 ? null : subjectId, (4272 & 16) != 0 ? null : null, (4272 & 32) != 0 ? null : ops, (4272 & 64) != 0 ? null : hasResource, (4272 & 128) != 0 ? null : null, (4272 & 256) != 0 ? null : deepLink, (4272 & 512) != 0 ? null : numValueOf, (4272 & 1024) != 0 ? null : image != null ? image.getUrl() : null, (4272 & 2048) != 0 ? Boolean.FALSE : Boolean.valueOf(data.getBuiltIn()), (4272 & 4096) != 0 ? null : null);
        String deepLink2 = data.getDeepLink();
        if (deepLink2 != null) {
            Uri uriM92277a = C23218a.f70760a.m92277a(Uri.parse(deepLink2 + "&ops=" + ops));
            if (uriM92277a != null) {
                AbstractC24222c.m95245j(uriM92277a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public final void m79780n1(int fromPosition, int toPosition, float positionOffset) {
        Image image;
        String averageHueDark;
        Image image2;
        String averageHueDark2;
        View view;
        View view2;
        SwipeRefreshLayout swipeRefreshLayout;
        View view3;
        View view4;
        View view5;
        List data;
        List data2;
        ShortTVBannerAdapter shortTVBannerAdapter = this.bannerAdapter;
        BannerData bannerData = null;
        BannerData bannerData2 = (shortTVBannerAdapter == null || (data2 = shortTVBannerAdapter.getData()) == null) ? null : (BannerData) data2.get(fromPosition);
        ShortTVBannerAdapter shortTVBannerAdapter2 = this.bannerAdapter;
        if (shortTVBannerAdapter2 != null && (data = shortTVBannerAdapter2.getData()) != null) {
            bannerData = (BannerData) data.get(toPosition);
        }
        if (bannerData2 == null || (image = bannerData2.getImage()) == null || (averageHueDark = image.getAverageHueDark()) == null || bannerData == null || (image2 = bannerData.getImage()) == null || (averageHueDark2 = image2.getAverageHueDark()) == null) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{fromPosition == toPosition ? Color.parseColor(averageHueDark) : C25472a.m100075a(positionOffset, Color.parseColor(averageHueDark), Color.parseColor(averageHueDark2)), 0});
        if (!C27124c.f82233a.m105540b().m105524d().mo105531a()) {
            C27361q0 c27361q0 = this.bannerBinding;
            if (c27361q0 == null || (view5 = c27361q0.f83302d) == null) {
                return;
            }
            view5.setBackground(gradientDrawable);
            return;
        }
        C27370x c27370x = (C27370x) getMViewBinding();
        if (c27370x != null && (view3 = c27370x.f83351d) != null) {
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            C27361q0 c27361q1 = this.bannerBinding;
            layoutParams.height = (c27361q1 == null || (view4 = c27361q1.f83302d) == null) ? 1 : view4.getHeight();
            view3.setLayoutParams(layoutParams);
            view3.setBackground(gradientDrawable);
        }
        C27370x c27370x2 = (C27370x) getMViewBinding();
        if (c27370x2 != null && (swipeRefreshLayout = c27370x2.f83350c) != null) {
            ViewGroup.LayoutParams layoutParams2 = swipeRefreshLayout.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams2;
            c2308b.setMargins(0, AbstractC23047a.m91689a(74), 0, 0);
            swipeRefreshLayout.setLayoutParams(c2308b);
        }
        C27361q0 c27361q2 = this.bannerBinding;
        if (c27361q2 != null && (view2 = c27361q2.f83304f) != null) {
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.height = 0;
            view2.setLayoutParams(layoutParams3);
        }
        C27361q0 c27361q3 = this.bannerBinding;
        if (c27361q3 == null || (view = c27361q3.f83303e) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams4.height = AbstractC23047a.m91689a(4);
        view.setLayoutParams(layoutParams4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public final void m79782o1(int dy2) {
        if (dy2 == 0) {
            this.mDy = 0;
        } else {
            this.mDy += dy2;
        }
        if (Math.abs(this.mDy) > ((AbstractC5806y.m27489e() * 9) / 16) / 2) {
            if (this.hasSlideOutBanner) {
                return;
            }
            m79747L0(false);
            this.hasSlideOutBanner = true;
            return;
        }
        if (this.hasSlideOutBanner) {
            m79747L0(true);
            this.hasSlideOutBanner = false;
        }
    }

    /* JADX INFO: renamed from: p1 */
    private final void m79784p1(Subject subject, boolean isDownloadView) {
        Context context = getContext();
        if (context != null) {
            C27644a.f84793a.m107539a((FragmentActivity) context, getPageName(), subject.getOps(), (64 & 8) != 0 ? null : "download_subject", (64 & 16) != 0 ? false : isDownloadView, (64 & 32) != 0 ? null : subject, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? Boolean.FALSE : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C28653a m79786q1() {
        return new C28653a();
    }

    /* JADX INFO: renamed from: s1 */
    private final void m79789s1(boolean isBanner) {
        Space space;
        View view;
        Space space2;
        View view2;
        Space space3;
        View view3;
        if (isBanner) {
            C27370x c27370x = (C27370x) getMViewBinding();
            if (c27370x != null && (view3 = c27370x.f83353f) != null) {
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
                ((ViewGroup.MarginLayoutParams) c2308b).height = this.subTabScrollListener != null ? 0 : this.statusBarHeight;
                view3.setLayoutParams(c2308b);
            }
            C27370x c27370x2 = (C27370x) getMViewBinding();
            if (c27370x2 == null || (space3 = c27370x2.f83352e) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = space3.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) c2308b2).height = this.subTabScrollListener != null ? AbstractC23047a.m91689a(90) : 0;
            space3.setLayoutParams(c2308b2);
            return;
        }
        if (m79752Q0() && C27124c.f82233a.m105540b().m105524d().mo105531a()) {
            C27370x c27370x3 = (C27370x) getMViewBinding();
            if (c27370x3 != null && (view2 = c27370x3.f83353f) != null) {
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.C2308b c2308b3 = (ConstraintLayout.C2308b) layoutParams3;
                ((ViewGroup.MarginLayoutParams) c2308b3).height = this.statusBarHeight + m79749N0();
                view2.setLayoutParams(c2308b3);
            }
            C27370x c27370x4 = (C27370x) getMViewBinding();
            if (c27370x4 == null || (space2 = c27370x4.f83352e) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams4 = space2.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b4 = (ConstraintLayout.C2308b) layoutParams4;
            ((ViewGroup.MarginLayoutParams) c2308b4).height = 0;
            space2.setLayoutParams(c2308b4);
            return;
        }
        int i11 = m79752Q0() ? 0 : this.statusBarHeight;
        C27370x c27370x5 = (C27370x) getMViewBinding();
        if (c27370x5 != null && (view = c27370x5.f83353f) != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b5 = (ConstraintLayout.C2308b) layoutParams5;
            ((ViewGroup.MarginLayoutParams) c2308b5).height = i11;
            view.setLayoutParams(c2308b5);
        }
        C27370x c27370x6 = (C27370x) getMViewBinding();
        if (c27370x6 == null || (space = c27370x6.f83352e) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams6 = space.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b6 = (ConstraintLayout.C2308b) layoutParams6;
        ((ViewGroup.MarginLayoutParams) c2308b6).height = 0;
        space.setLayoutParams(c2308b6);
    }

    private final void showLoading() {
        showLoadingView();
    }

    /* JADX INFO: renamed from: t1 */
    private final void m79791t1() {
        ShortTVFavoriteView shortTVFavoriteView = this.favoriteHeaderView;
        if (shortTVFavoriteView == null) {
            return;
        }
        C18909h c18909h = this.listAdapter;
        if (c18909h != null) {
            Intrinsics.m97799e(shortTVFavoriteView);
            c18909h.m36143J0(shortTVFavoriteView);
        }
        this.favoriteHeaderView = null;
    }

    /* JADX INFO: renamed from: v1 */
    private final void m79794v1(List data) {
        View view;
        View view2;
        if (this.bannerBinding != null) {
            C26866a.a aVar = C26866a.f81698a;
            String TAG = this.TAG;
            Intrinsics.m97801g(TAG, "TAG");
            C26866a.a.m104898f(aVar, TAG, "set banner data", false, 4, null);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(data);
            ShortTVBannerAdapter shortTVBannerAdapter = this.bannerAdapter;
            if (shortTVBannerAdapter != null) {
                shortTVBannerAdapter.setData(arrayList);
                return;
            }
            return;
        }
        C26866a.a aVar2 = C26866a.f81698a;
        String TAG2 = this.TAG;
        Intrinsics.m97801g(TAG2, "TAG");
        C26866a.a.m104898f(aVar2, TAG2, "add banner HeaderView", false, 4, null);
        if (getContext() != null) {
            C27361q0 c27361q0M106497c = C27361q0.m106497c(LayoutInflater.from(getContext()));
            this.bannerBinding = c27361q0M106497c;
            ViewGroup.LayoutParams layoutParams = (c27361q0M106497c == null || (view2 = c27361q0M106497c.f83303e) == null) ? null : view2.getLayoutParams();
            if (this.subTabScrollListener != null) {
                if (layoutParams != null) {
                    layoutParams.height = this.statusBarHeight + AbstractC5776a0.m27313a(50.0f);
                }
            } else if (layoutParams != null) {
                layoutParams.height = this.statusBarHeight + AbstractC5776a0.m27313a(10.0f);
            }
            C27361q0 c27361q0 = this.bannerBinding;
            if (c27361q0 != null && (view = c27361q0.f83303e) != null) {
                view.setLayoutParams(layoutParams);
            }
            C27361q0 c27361q1 = this.bannerBinding;
            Intrinsics.m97799e(c27361q1);
            ShortTVBannerView shortTVBannerView = c27361q1.f83300b;
            shortTVBannerView.getWindowVisibility();
            ShortTVBannerAdapter shortTVBannerAdapter2 = new ShortTVBannerAdapter();
            shortTVBannerAdapter2.m79522k(new Function3() { // from class: com.transsion.shorttv.ui.fragment.h
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ShortTVDiscoverFragment.m79796w1(this.f61307a, (View) obj, ((Integer) obj2).intValue(), (BannerData) obj3);
                }
            });
            this.bannerAdapter = shortTVBannerAdapter2;
            shortTVBannerView.setAutoTurningTime(4000L);
            shortTVBannerView.setPagerScrollDuration(1000L);
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            shortTVBannerView.setPageMargin(AbstractC5776a0.m27313a((AbstractC24220a.m95235a(contextRequireContext) ? 3 : 1) * 44.0f), AbstractC5776a0.m27313a(16.0f));
            shortTVBannerView.addPageTransformer(new C13890b());
            shortTVBannerView.setOuterPageChangeListener(new C18989j());
            shortTVBannerView.setAdapter(this.bannerAdapter);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(data);
            ShortTVBannerAdapter shortTVBannerAdapter3 = this.bannerAdapter;
            Intrinsics.m97799e(shortTVBannerAdapter3);
            shortTVBannerAdapter3.setData(arrayList2);
            shortTVBannerView.post(new Runnable() { // from class: com.transsion.shorttv.ui.fragment.i
                @Override // java.lang.Runnable
                public final void run() {
                    ShortTVDiscoverFragment.m79798x1(this.f61309a);
                }
            });
            C18909h c18909h = this.listAdapter;
            if (c18909h != null) {
                C27361q0 c27361q2 = this.bannerBinding;
                Intrinsics.m97799e(c27361q2);
                ConstraintLayout root = c27361q2.f83301c;
                Intrinsics.m97801g(root, "root");
                BaseQuickAdapter.m36130y(c18909h, root, 0, 0, 4, null);
            }
            this.hasAddedBanner = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public static final Unit m79796w1(ShortTVDiscoverFragment shortTVDiscoverFragment, View view, int i11, BannerData item) {
        Intrinsics.m97802h(view, "<unused var>");
        Intrinsics.m97802h(item, "item");
        shortTVDiscoverFragment.m79778m1(i11, item);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final void m79798x1(ShortTVDiscoverFragment shortTVDiscoverFragment) {
        shortTVDiscoverFragment.m79780n1(0, 0, 0.0f);
    }

    /* JADX INFO: renamed from: z1 */
    private final void m79801z1(OperatingResp data) {
        SwipeRefreshLayout swipeRefreshLayout;
        SwipeRefreshLayout swipeRefreshLayout2;
        SwipeRefreshLayout swipeRefreshLayout3;
        OperateItem operateItem;
        SwipeRefreshLayout swipeRefreshLayout4;
        SwipeRefreshLayout swipeRefreshLayout5;
        SwipeRefreshLayout swipeRefreshLayout6;
        List<OperateItem> items;
        OperateItem operateItem2;
        C18909h c18909h;
        List<Object> data2;
        if (!isAdded() || isDetached() || isRemoving()) {
            return;
        }
        if (data == null) {
            if (this.bannerBinding == null && this.headerViewList.isEmpty() && (c18909h = this.listAdapter) != null && (data2 = c18909h.getData()) != null && data2.isEmpty()) {
                m79803D1();
                return;
            }
            return;
        }
        OperatingResp operatingResp = this.curOperatingResp;
        if (Intrinsics.m97797c(operatingResp != null ? operatingResp.getVersion() : null, data.getVersion())) {
            C26866a.a aVar = C26866a.f81698a;
            String TAG = this.TAG;
            Intrinsics.m97801g(TAG, "TAG");
            C26866a.a.m104905r(aVar, TAG, new String[]{"setOperationListData, version same:" + data.getVersion()}, false, 4, null);
        } else {
            C26866a.a aVar2 = C26866a.f81698a;
            String TAG2 = this.TAG;
            Intrinsics.m97801g(TAG2, "TAG");
            OperatingResp operatingResp2 = this.curOperatingResp;
            String version = operatingResp2 != null ? operatingResp2.getVersion() : null;
            C26866a.a.m104905r(aVar2, TAG2, new String[]{"setOperationListData oldVs:" + version + ", newVs:" + data.getVersion()}, false, 4, null);
            List<OperateItem> items2 = data.getItems();
            if (items2 != null && (operateItem = (OperateItem) CollectionsKt.m97362l0(items2, 0)) != null) {
                OperatingResp operatingResp3 = this.curOperatingResp;
                String md5 = (operatingResp3 == null || (items = operatingResp3.getItems()) == null || (operateItem2 = (OperateItem) CollectionsKt.m97362l0(items, 0)) == null) ? null : operateItem2.getMd5();
                C26867a.a aVar3 = C26867a.f81701a;
                String strM27447j = AbstractC5796o.m27447j(operateItem);
                Intrinsics.m97801g(strM27447j, "toJson(...)");
                String strM104926d = aVar3.m104926d(strM27447j);
                operateItem.setMd5(strM104926d);
                String TAG3 = this.TAG;
                Intrinsics.m97801g(TAG3, "TAG");
                List<BannerData> banners = data.getBanners();
                C26866a.a.m104898f(aVar2, TAG3, "banner size: " + (banners != null ? Integer.valueOf(banners.size()) : null), false, 4, null);
                List<BannerData> banners2 = data.getBanners();
                if (banners2 == null || !(!banners2.isEmpty())) {
                    m79747L0(false);
                    Function1 function1 = this.listener;
                    if (function1 != null) {
                        function1.invoke(Boolean.FALSE);
                    }
                    m79789s1(false);
                    if (m79752Q0() && C27124c.f82233a.m105540b().m105524d().mo105531a()) {
                        int iM79749N0 = this.statusBarHeight + m79749N0();
                        C27370x c27370x = (C27370x) getMViewBinding();
                        if (c27370x != null && (swipeRefreshLayout5 = c27370x.f83350c) != null) {
                            ViewGroup.LayoutParams layoutParams = swipeRefreshLayout5.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
                            c2308b.setMargins(0, iM79749N0, 0, 0);
                            swipeRefreshLayout5.setLayoutParams(c2308b);
                        }
                    } else {
                        int i11 = m79752Q0() ? 0 : this.statusBarHeight;
                        C27370x c27370x2 = (C27370x) getMViewBinding();
                        if (c27370x2 != null && (swipeRefreshLayout4 = c27370x2.f83350c) != null) {
                            ViewGroup.LayoutParams layoutParams2 = swipeRefreshLayout4.getLayoutParams();
                            if (layoutParams2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                            ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
                            c2308b2.setMargins(0, i11, 0, 0);
                            swipeRefreshLayout4.setLayoutParams(c2308b2);
                        }
                    }
                } else if (!Intrinsics.m97797c(md5, strM104926d)) {
                    List<BannerData> banners3 = data.getBanners();
                    Intrinsics.m97799e(banners3);
                    m79794v1(banners3);
                    m79747L0(true);
                    m79789s1(true);
                    Function1 function2 = this.listener;
                    if (function2 != null) {
                        function2.invoke(Boolean.TRUE);
                    }
                    C27370x c27370x3 = (C27370x) getMViewBinding();
                    if (c27370x3 != null && (swipeRefreshLayout6 = c27370x3.f83350c) != null) {
                        ViewGroup.LayoutParams layoutParams3 = swipeRefreshLayout6.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                        ConstraintLayout.C2308b c2308b3 = (ConstraintLayout.C2308b) layoutParams3;
                        c2308b3.setMargins(0, AbstractC5776a0.m27313a(0.0f), 0, 0);
                        swipeRefreshLayout6.setLayoutParams(c2308b3);
                    }
                }
            }
            m79733A1(data.getItems());
            this.curOperatingResp = data;
        }
        C27370x c27370x4 = (C27370x) getMViewBinding();
        if (c27370x4 == null || (swipeRefreshLayout2 = c27370x4.f83350c) == null || !swipeRefreshLayout2.isRefreshing()) {
            Function1 function3 = this.subTabLoadSuccessListener;
            if (function3 != null) {
                function3.invoke(Boolean.valueOf(m79754W0()));
            }
        } else {
            C27370x c27370x5 = (C27370x) getMViewBinding();
            if (c27370x5 != null && (swipeRefreshLayout3 = c27370x5.f83350c) != null) {
                swipeRefreshLayout3.setRefreshing(false);
            }
        }
        ShortTVBannerAdapter shortTVBannerAdapter = this.bannerAdapter;
        List data3 = shortTVBannerAdapter != null ? shortTVBannerAdapter.getData() : null;
        if ((data3 == null || data3.isEmpty()) && m79752Q0() && C27124c.f82233a.m105540b().m105524d().mo105531a()) {
            int iM79749N1 = this.statusBarHeight + m79749N0();
            C27370x c27370x6 = (C27370x) getMViewBinding();
            if (c27370x6 == null || (swipeRefreshLayout = c27370x6.f83350c) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams4 = swipeRefreshLayout.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b4 = (ConstraintLayout.C2308b) layoutParams4;
            c2308b4.setMargins(0, iM79749N1, 0, 0);
            swipeRefreshLayout.setLayoutParams(c2308b4);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m79802B1(RecyclerView.AbstractC4219r pageScrollListener, Function1 onLoaderSuccess) {
        Intrinsics.m97802h(pageScrollListener, "pageScrollListener");
        Intrinsics.m97802h(onLoaderSuccess, "onLoaderSuccess");
        this.subTabScrollListener = pageScrollListener;
        this.subTabLoadSuccessListener = onLoaderSuccess;
    }

    /* JADX INFO: renamed from: D1 */
    public void m79803D1() {
        if (C27287m.f83003a.m106330e()) {
            PageStatusFragment.m79069c0(this, false, 1, null);
        } else {
            showNoNetworkView(false);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m79804E1(List list, boolean isRefresh, boolean hasMore) {
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C18909h c18909h;
        C27941f c27941fM36186h2;
        SwipeRefreshLayout swipeRefreshLayout;
        C27370x c27370x;
        SwipeRefreshLayout swipeRefreshLayout2;
        List<Object> data;
        SafeRecyclerView safeRecyclerView;
        List<Object> data2;
        List listL;
        List<Object> data3;
        List<Object> listL2;
        C27941f c27941fM36186h3;
        SwipeRefreshLayout swipeRefreshLayout3;
        C27941f c27941fM36186h4;
        C18909h c18909h2;
        C27941f c27941fM36186h5;
        SafeRecyclerView safeRecyclerView2;
        List<Object> data4;
        List listL3;
        List<Object> data5;
        SwipeRefreshLayout swipeRefreshLayout4;
        C27370x c27370x2;
        SwipeRefreshLayout swipeRefreshLayout5;
        List<Object> data6;
        Subject subject;
        SwipeRefreshLayout swipeRefreshLayout6;
        C27370x c27370x3 = (C27370x) getMViewBinding();
        if (c27370x3 != null && (swipeRefreshLayout6 = c27370x3.f83350c) != null) {
            swipeRefreshLayout6.setEnabled(true);
        }
        if (isRefresh) {
            BiddingListManager biddingListManager = this.v3ListManager;
            if (biddingListManager != null) {
                biddingListManager.m63191y();
            }
            if (list != null && (subject = (Subject) CollectionsKt.m97361k0(list)) != null) {
                subject.setShowTitle(true);
            }
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            if (isRefresh) {
                C24655b logViewConfig = getLogViewConfig();
                if (logViewConfig != null) {
                    logViewConfig.m96848k(true);
                }
                C18909h c18909h3 = this.listAdapter;
                Iterator<Object> it = (c18909h3 == null || (data3 = c18909h3.getData()) == null) ? null : data3.iterator();
                while (it != null && it.hasNext()) {
                    if (((C22777a) it.next()).m90709d() == 1) {
                        it.remove();
                    }
                }
                C18909h c18909h4 = this.listAdapter;
                if (c18909h4 != null && (data2 = c18909h4.getData()) != null) {
                    if (list != null) {
                        List list3 = list;
                        listL = new ArrayList<>(CollectionsKt.m97516v(list3, 10));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            listL.add(new C22777a(1, null, (Subject) it2.next(), null, 0, false, 58, null));
                        }
                    } else {
                        listL = CollectionsKt.m97506l();
                    }
                    data2.addAll(listL);
                }
                C27370x c27370x4 = (C27370x) getMViewBinding();
                if (c27370x4 != null && (safeRecyclerView = c27370x4.f83349b) != null) {
                    safeRecyclerView.post(new Runnable() { // from class: com.transsion.shorttv.ui.fragment.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShortTVDiscoverFragment.m79740F1(this.f61302a);
                        }
                    });
                }
            }
            C18909h c18909h5 = this.listAdapter;
            if (c18909h5 == null || (data = c18909h5.getData()) == null || !data.isEmpty()) {
                if (hasMore) {
                    C18909h c18909h6 = this.listAdapter;
                    if (c18909h6 != null && (c27941fM36186h1 = c18909h6.m36186h0()) != null && c27941fM36186h1.m108666r() && (c18909h = this.listAdapter) != null && (c27941fM36186h2 = c18909h.m36186h0()) != null) {
                        c27941fM36186h2.m108667s();
                    }
                } else {
                    C18909h c18909h7 = this.listAdapter;
                    if (c18909h7 != null && (c27941fM36186h0 = c18909h7.m36186h0()) != null) {
                        C27941f.m108652u(c27941fM36186h0, false, 1, null);
                    }
                }
            } else if (isRefresh) {
                Intrinsics.m97797c(getPageName(), "minitv_explore");
            }
            C27370x c27370x5 = (C27370x) getMViewBinding();
            if (c27370x5 == null || (swipeRefreshLayout = c27370x5.f83350c) == null || !swipeRefreshLayout.isRefreshing() || (c27370x = (C27370x) getMViewBinding()) == null || (swipeRefreshLayout2 = c27370x.f83350c) == null) {
                return;
            }
            swipeRefreshLayout2.setRefreshing(false);
            return;
        }
        C18909h c18909h8 = this.listAdapter;
        if ((c18909h8 == null || (data6 = c18909h8.getData()) == null || !data6.isEmpty()) && !isRefresh) {
            C18909h c18909h9 = this.listAdapter;
            if (c18909h9 == null || (listL2 = c18909h9.getData()) == null) {
                listL2 = CollectionsKt.m97506l();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Subject subject2 = (Subject) obj;
                List<Object> list4 = listL2;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator<T> it3 = list4.iterator();
                    do {
                        if (it3.hasNext()) {
                        }
                    } while (!Intrinsics.m97797c(((C22777a) it3.next()).m90707b(), subject2));
                }
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                C26866a.a aVar = C26866a.f81698a;
                String TAG = this.TAG;
                Intrinsics.m97801g(TAG, "TAG");
                C26866a.a.m104898f(aVar, TAG, "updateList 全部去重了", false, 4, null);
                return;
            }
            C18909h c18909h10 = this.listAdapter;
            if (c18909h10 != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.m97516v(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(new C22777a(1, null, (Subject) it4.next(), null, 0, false, 58, null));
                }
                c18909h10.mo36208q(arrayList2);
            }
        } else {
            C27370x c27370x6 = (C27370x) getMViewBinding();
            if (c27370x6 != null && (swipeRefreshLayout4 = c27370x6.f83350c) != null && swipeRefreshLayout4.isRefreshing() && (c27370x2 = (C27370x) getMViewBinding()) != null && (swipeRefreshLayout5 = c27370x2.f83350c) != null) {
                swipeRefreshLayout5.setRefreshing(false);
            }
            C24655b logViewConfig2 = getLogViewConfig();
            if (logViewConfig2 != null) {
                logViewConfig2.m96848k(true);
            }
            C18909h c18909h11 = this.listAdapter;
            Iterator<Object> it5 = (c18909h11 == null || (data5 = c18909h11.getData()) == null) ? null : data5.iterator();
            while (it5 != null && it5.hasNext()) {
                if (((C22777a) it5.next()).m90709d() == 1) {
                    it5.remove();
                }
            }
            C18909h c18909h12 = this.listAdapter;
            if (c18909h12 != null && (data4 = c18909h12.getData()) != null) {
                if (list != null) {
                    List list5 = list;
                    listL3 = new ArrayList<>(CollectionsKt.m97516v(list5, 10));
                    Iterator it6 = list5.iterator();
                    while (it6.hasNext()) {
                        listL3.add(new C22777a(1, null, (Subject) it6.next(), null, 0, false, 58, null));
                    }
                } else {
                    listL3 = CollectionsKt.m97506l();
                }
                data4.addAll(listL3);
            }
            C27370x c27370x7 = (C27370x) getMViewBinding();
            if (c27370x7 != null && (safeRecyclerView2 = c27370x7.f83349b) != null) {
                safeRecyclerView2.post(new Runnable() { // from class: com.transsion.shorttv.ui.fragment.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShortTVDiscoverFragment.m79742G1(this.f61305a);
                    }
                });
            }
        }
        if (hasMore) {
            C18909h c18909h13 = this.listAdapter;
            if (c18909h13 != null && (c27941fM36186h4 = c18909h13.m36186h0()) != null && c27941fM36186h4.m108666r() && (c18909h2 = this.listAdapter) != null && (c27941fM36186h5 = c18909h2.m36186h0()) != null) {
                c27941fM36186h5.m108667s();
            }
        } else {
            C18909h c18909h14 = this.listAdapter;
            if (c18909h14 != null && (c27941fM36186h3 = c18909h14.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h3, false, 1, null);
            }
        }
        if (m79754W0() || m79752Q0()) {
            return;
        }
        m79747L0(false);
        Function1 function1 = this.listener;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        m79789s1(false);
        C27370x c27370x8 = (C27370x) getMViewBinding();
        if (c27370x8 == null || (swipeRefreshLayout3 = c27370x8.f83350c) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = swipeRefreshLayout3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        c2308b.setMargins(0, this.statusBarHeight, 0, 0);
        swipeRefreshLayout3.setLayoutParams(c2308b);
    }

    /* JADX INFO: renamed from: R0 */
    public String m79805R0() {
        return "most_trending";
    }

    /* JADX INFO: renamed from: S0, reason: from getter */
    protected final C18909h getListAdapter() {
        return this.listAdapter;
    }

    /* JADX INFO: renamed from: T0 */
    public int m79807T0() {
        return R$layout.short_tv_layout_skeleton_drawing_discover;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C27370x getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C27370x c27370xM106522c = C27370x.m106522c(inflater);
        Intrinsics.m97801g(c27370xM106522c, "inflate(...)");
        return c27370xM106522c;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public View getEmptyView(boolean isShowTitleLayout) {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        StateView stateView = new StateView(contextRequireContext);
        stateView.retry(new Function0() { // from class: com.transsion.shorttv.ui.fragment.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTVDiscoverFragment.m79751P0(this.f61208a);
            }
        });
        stateView.showData(4, getScreenType(), false, getPageStateLayoutTitle(), getEmptyDescText());
        return stateView;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public View getLoadingView() {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(m79807T0(), (ViewGroup) getFlStateView(), false);
        View viewFindViewById = viewInflate.findViewById(R$id.v_bar_space);
        if (this.subTabScrollListener != null) {
            View viewFindViewById2 = viewInflate.findViewById(R$id.v_title);
            Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
            ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c2308b).topMargin = AbstractC5776a0.m27313a(10.0f);
            viewFindViewById2.setLayoutParams(c2308b);
            int iM27313a = this.statusBarHeight + AbstractC5776a0.m27313a(32.0f);
            Intrinsics.m97799e(viewFindViewById);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) c2308b2).height = iM27313a;
            viewFindViewById.setLayoutParams(c2308b2);
        } else {
            Intrinsics.m97799e(viewFindViewById);
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b3 = (ConstraintLayout.C2308b) layoutParams3;
            ((ViewGroup.MarginLayoutParams) c2308b3).height = this.statusBarHeight;
            viewFindViewById.setLayoutParams(c2308b3);
        }
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public View getNoNetworkView() {
        View noNetworkView;
        InterfaceC28221l interfaceC28221lM80340E0;
        ShortTvViewModel shortTvViewModel = this.viewModel;
        if (shortTvViewModel == null || (interfaceC28221lM80340E0 = shortTvViewModel.m80340E0()) == null) {
            noNetworkView = super.getNoNetworkView();
        } else {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            noNetworkView = interfaceC28221lM80340E0.mo73724a(contextRequireContext);
            if (noNetworkView == null) {
                noNetworkView = super.getNoNetworkView();
            }
        }
        noNetworkView.setPadding(noNetworkView.getPaddingStart(), noNetworkView.getPaddingTop() + this.statusBarHeight + AbstractC5776a0.m27313a(35.0f), noNetworkView.getPaddingEnd(), noNetworkView.getPaddingBottom());
        return noNetworkView;
    }

    public String getPageName() {
        return "minitv_explore";
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public int getScreenType() {
        return 4;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initListener() {
        SafeRecyclerView safeRecyclerView;
        SafeRecyclerView safeRecyclerView2;
        SafeRecyclerView safeRecyclerView3;
        if (this.subTabScrollListener != null) {
            C27370x c27370x = (C27370x) getMViewBinding();
            if (c27370x != null && (safeRecyclerView3 = c27370x.f83349b) != null) {
                RecyclerView.AbstractC4219r abstractC4219r = this.subTabScrollListener;
                Intrinsics.m97799e(abstractC4219r);
                safeRecyclerView3.addOnScrollListener(abstractC4219r);
            }
        } else {
            C27370x c27370x2 = (C27370x) getMViewBinding();
            if (c27370x2 != null && (safeRecyclerView = c27370x2.f83349b) != null) {
                safeRecyclerView.addOnScrollListener(new C18987h());
            }
        }
        C27370x c27370x3 = (C27370x) getMViewBinding();
        if (c27370x3 == null || (safeRecyclerView2 = c27370x3.f83349b) == null) {
            return;
        }
        safeRecyclerView2.post(new Runnable() { // from class: com.transsion.shorttv.ui.fragment.k
            @Override // java.lang.Runnable
            public final void run() {
                ShortTVDiscoverFragment.m79761d1(this.f61313a);
            }
        });
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewData() {
        Space space;
        View view;
        Bundle arguments = getArguments();
        this.tabId = arguments != null ? arguments.getInt("tab_id", this.tabId) : this.tabId;
        C27370x c27370x = (C27370x) getMViewBinding();
        if (c27370x != null && (view = c27370x.f83353f) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c2308b).height = this.statusBarHeight;
            view.setLayoutParams(c2308b);
        }
        C27370x c27370x2 = (C27370x) getMViewBinding();
        if (c27370x2 != null && (space = c27370x2.f83352e) != null) {
            ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) c2308b2).height = 0;
            space.setLayoutParams(c2308b2);
        }
        m79756Y0();
        initAd();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewModel() {
        ShortTvViewModel shortTvViewModel;
        ShortTvViewModel shortTvViewModel2;
        C3187b0 c3187b0M80373c0;
        C3187b0 c3187b0M80346K0;
        C3187b0 c3187b0M80383i0;
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "initViewModel " + this, false, 4, null);
        ShortTvViewModel shortTvViewModel3 = (ShortTvViewModel) new C3227v0(this).m14969a(ShortTvViewModel.class);
        this.viewModel = shortTvViewModel3;
        if (shortTvViewModel3 != null && (c3187b0M80383i0 = shortTvViewModel3.m80383i0()) != null) {
            c3187b0M80383i0.m14851j(this, new C18988i(new Function1() { // from class: com.transsion.shorttv.ui.fragment.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTVDiscoverFragment.m79762e1(this.f61326a, (OperatingResp) obj);
                }
            }));
        }
        ShortTvViewModel shortTvViewModel4 = this.viewModel;
        if (shortTvViewModel4 != null && (c3187b0M80346K0 = shortTvViewModel4.m80346K0()) != null) {
            c3187b0M80346K0.m14851j(this, new C18988i(new Function1() { // from class: com.transsion.shorttv.ui.fragment.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTVDiscoverFragment.m79764f1(this.f61327a, (ShortTVRespData) obj);
                }
            }));
        }
        if (C27124c.f82233a.m105540b().m105523c() && (shortTvViewModel2 = this.viewModel) != null && (c3187b0M80373c0 = shortTvViewModel2.m80373c0()) != null) {
            c3187b0M80373c0.m14851j(this, new C18988i(new Function1() { // from class: com.transsion.shorttv.ui.fragment.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTVDiscoverFragment.m79766g1(this.f61204a, (ShortTVRespData) obj);
                }
            }));
        }
        m79791t1();
        showLoading();
        Context context = getContext();
        if (context != null && (shortTvViewModel = this.viewModel) != null) {
            shortTvViewModel.m80354P0(context);
        }
        m79809r1();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BiddingListManager biddingListManager = this.v3ListManager;
        if (biddingListManager != null) {
            biddingListManager.m63187o();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed() && hidden) {
            this.exposureHelper.m90702e();
            C27370x c27370x = (C27370x) getMViewBinding();
            m79746K0(c27370x != null ? c27370x.f83349b : null);
        }
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                logResume();
            }
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        ShortTVBannerView shortTVBannerView;
        ShortTVBannerView shortTVBannerView2;
        super.onPause();
        m79776l1();
        this.exposureHelper.m90702e();
        C27370x c27370x = (C27370x) getMViewBinding();
        m79746K0(c27370x != null ? c27370x.f83349b : null);
        C27361q0 c27361q0 = this.bannerBinding;
        if (c27361q0 == null || (shortTVBannerView = c27361q0.f83300b) == null || !shortTVBannerView.isAttachedToWindow()) {
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "onPause banner stopTurning", false, 4, null);
        C27361q0 c27361q1 = this.bannerBinding;
        if (c27361q1 == null || (shortTVBannerView2 = c27361q1.f83300b) == null) {
            return;
        }
        shortTVBannerView2.stopTurning();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        ShortTVBannerView shortTVBannerView;
        ShortTVBannerView shortTVBannerView2;
        super.onResume();
        this.bannerBrowseTime = System.currentTimeMillis();
        C27361q0 c27361q0 = this.bannerBinding;
        if (c27361q0 == null || (shortTVBannerView = c27361q0.f83300b) == null || !shortTVBannerView.isAttachedToWindow()) {
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.TAG;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "onResume banner startTurning", false, 4, null);
        C27361q0 c27361q1 = this.bannerBinding;
        if (c27361q1 == null || (shortTVBannerView2 = c27361q1.f83300b) == null) {
            return;
        }
        shortTVBannerView2.startTurning();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        ShortTvViewModel shortTvViewModel;
        super.onStart();
        if (isVisible()) {
            if (this.isFirstStart) {
                this.isFirstStart = false;
            } else {
                if (!C27124c.f82233a.m105540b().m105523c() || (shortTvViewModel = this.viewModel) == null) {
                    return;
                }
                shortTvViewModel.m80388o0();
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m79809r1() {
        ShortTvViewModel shortTvViewModel;
        m79772j1();
        if (C27124c.f82233a.m105540b().m105523c() && (shortTvViewModel = this.viewModel) != null) {
            shortTvViewModel.m80388o0();
        }
        this.nextPage = "1";
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void retryLoadData() {
        List<Object> data;
        C18909h c18909h = this.listAdapter;
        if (c18909h != null && (data = c18909h.getData()) != null && data.size() == 0) {
            showLoading();
            m79809r1();
            return;
        }
        C18909h c18909h2 = this.listAdapter;
        if (c18909h2 == null || c18909h2.m36186h0().m108661i() != LoadMoreStatus.Fail) {
            return;
        }
        c18909h2.m36186h0().m108670w();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m79810u1() {
        SafeRecyclerView safeRecyclerView;
        C27370x c27370x = (C27370x) getMViewBinding();
        if (c27370x == null || (safeRecyclerView = c27370x.f83349b) == null) {
            return;
        }
        safeRecyclerView.smoothScrollToPosition(0);
    }

    /* JADX INFO: renamed from: y1 */
    public final void m79811y1(boolean z11) {
        this.hasSlideOutBanner = z11;
    }
}
