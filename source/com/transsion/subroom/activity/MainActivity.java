package com.transsion.subroom.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.InterfaceC3189c0;
import ck.C5117n;
import com.cloud.tmc.integration.event.EventConstants;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.home.bean.AppTab;
import com.transsion.home.bean.BottomTabItem;
import com.transsion.home.fragment.home.HomeFragment;
import com.transsion.home.p1000enum.BottomTabType;
import com.transsion.home.preload.InterfaceC15427a;
import com.transsion.home.preload.InterfaceC15428b;
import com.transsion.p285ad.p287hi.InterfaceC14014a;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.usercenter.profile.C20664f;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25133j0;
import p390ex.C23241a;
import p390ex.C23242b;
import p415fq.C23418i;
import p418fu.C23431a;
import p429g4.InterfaceC23498a;
import p441gz.InterfaceC23704a;
import p495iu.C24228b;
import p983zl.C29191a;
import p983zl.InterfaceC29192b;
import pairipcore0.PairipLoader;
import pairipcore0.hidden.Hidden0;
import pg.C26866a;
import py.InterfaceC26962e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006*\u0002ÿ\u0001\u0018\u0000 \u0083\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002¦\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0014¢\u0006\u0004\b \u0010\u0006J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J)\u0010+\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b+\u0010,J/\u00102\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u00132\u000e\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020.0-2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\t2\u0006\u00104\u001a\u00020\u0007H\u0014¢\u0006\u0004\b5\u0010\u000bJ\u0019\u00108\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010\u0010J\r\u0010;\u001a\u00020\t¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010<\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010\u0006J\u000f\u0010=\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010\u0010J'\u0010B\u001a\u00020\t2\u0006\u0010>\u001a\u00020.2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?H\u0016¢\u0006\u0004\bB\u0010CJ4\u0010I\u001a\u00020\t2#\u0010H\u001a\u001f\u0012\u0013\u0012\u00110.¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\t\u0018\u00010DH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0013H\u0016¢\u0006\u0004\bK\u0010\u0015J\u000f\u0010L\u001a\u00020\tH\u0002¢\u0006\u0004\bL\u0010\u0006J\u000f\u0010M\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010\u0006J\u000f\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bN\u0010\u0006J\u000f\u0010O\u001a\u00020\tH\u0002¢\u0006\u0004\bO\u0010\u0006J\u000f\u0010P\u001a\u00020\tH\u0002¢\u0006\u0004\bP\u0010\u0006J\u0019\u0010S\u001a\u00020\t2\b\u0010R\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010X\u001a\u00020\t2\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010UH\u0002¢\u0006\u0004\bX\u0010YJ\u001f\u0010\\\u001a\u00020\t2\u000e\u0010[\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010ZH\u0002¢\u0006\u0004\b\\\u0010YJ\u001f\u0010]\u001a\u00020\u000e2\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010ZH\u0002¢\u0006\u0004\b]\u0010^J-\u0010e\u001a\u00020d2\u0006\u0010_\u001a\u00020V2\n\u0010b\u001a\u00060`R\u00020a2\b\u0010c\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\be\u0010fJ-\u0010i\u001a\u00020\t2\b\u0010g\u001a\u0004\u0018\u00010V2\b\u0010h\u001a\u0004\u0018\u00010d2\b\u0010c\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\bi\u0010jJ\u001f\u0010l\u001a\u00020\t2\u000e\u0010k\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010UH\u0002¢\u0006\u0004\bl\u0010YJ\u001b\u0010n\u001a\u0004\u0018\u00010m2\b\u0010g\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u0004\u0018\u00010m2\b\u0010g\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\bp\u0010oJ\u001f\u0010s\u001a\u00020\t2\u0006\u0010q\u001a\u00020m2\u0006\u0010r\u001a\u00020.H\u0002¢\u0006\u0004\bs\u0010tJ\u0019\u0010v\u001a\u00020\t2\b\u0010_\u001a\u0004\u0018\u00010uH\u0002¢\u0006\u0004\bv\u0010wJ\u0019\u0010x\u001a\u00020\t2\b\u0010c\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\u00132\u0006\u0010z\u001a\u00020.H\u0002¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u00132\u0006\u0010}\u001a\u00020.H\u0002¢\u0006\u0004\b~\u0010|J\u000f\u0010\u007f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u007f\u0010\u0006J\u0011\u0010\u0080\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u0006J$\u0010\u0083\u0001\u001a\u00020\t2\u0007\u0010\u0081\u0001\u001a\u00020\u00132\u0007\u0010\u0082\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0085\u0001\u0010\u0006J\u0011\u0010\u0086\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u0006J>\u0010\u008c\u0001\u001a\u00020\t2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010d2\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00012\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0011\u0010\u008e\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u008e\u0001\u0010\u0006J\u0011\u0010\u008f\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u0006J\u001b\u0010\u0091\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0093\u0001\u0010\u0006J%\u0010\u0095\u0001\u001a\u00020\u00132\b\u0010}\u001a\u0004\u0018\u00010.2\u0007\u0010\u0094\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0097\u0001\u0010\u0006J\u001d\u0010\u0099\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0098\u0001\u001a\u00020?H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J%\u0010\u009c\u0001\u001a\u00020\t2\b\u0010g\u001a\u0004\u0018\u00010V2\u0007\u0010\u009b\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0011\u0010\u009e\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u009e\u0001\u0010\u0006J\u0011\u0010\u009f\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u009f\u0001\u0010\u0006J\u0011\u0010 \u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b \u0001\u0010\u0006J\u0016\u0010¡\u0001\u001a\u00020\t*\u00020dH\u0002¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b£\u0001\u0010\u0006J\u0011\u0010¤\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b¤\u0001\u0010\u0006R\u001c\u0010¨\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R&\u0010°\u0001\u001a\u000f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020m0\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001a\u0010²\u0001\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010±\u0001R\u0019\u0010µ\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0019\u0010·\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010´\u0001R\u0018\u0010¹\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b:\u0010¸\u0001R\u0019\u0010»\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010¸\u0001R\u0019\u0010½\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010¸\u0001R#\u0010Ã\u0001\u001a\u0005\u0018\u00010¾\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0019\u0010Æ\u0001\u001a\u00020.8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0019\u0010È\u0001\u001a\u00020.8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010Å\u0001R\u0019\u0010Ê\u0001\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010´\u0001R\u0019\u0010Ì\u0001\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bË\u0001\u0010´\u0001R\u001a\u0010Ð\u0001\u001a\u00030Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u001b\u0010Ó\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u001b\u0010Ö\u0001\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0019\u0010Ø\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010¸\u0001R\u0019\u0010Ú\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010¸\u0001R\u001b\u0010Ü\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Å\u0001R!\u0010á\u0001\u001a\u00030Ý\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÞ\u0001\u0010À\u0001\u001a\u0006\bß\u0001\u0010à\u0001R\u0019\u0010ã\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010¸\u0001R\u0019\u0010å\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010¸\u0001R\u0019\u0010ç\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010¸\u0001R!\u0010ì\u0001\u001a\u00030è\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bé\u0001\u0010À\u0001\u001a\u0006\bê\u0001\u0010ë\u0001R\u001e\u0010ð\u0001\u001a\t\u0012\u0004\u0012\u00020\t0í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u001a\u0010ò\u0001\u001a\u00030Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010Ï\u0001R\u0019\u0010ô\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010¸\u0001R\u001a\u0010ø\u0001\u001a\u00030õ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u001c\u0010ü\u0001\u001a\u0005\u0018\u00010ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u0019\u0010þ\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010¸\u0001R\u0018\u0010\u0082\u0002\u001a\u00030ÿ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002¨\u0006\u0084\u0002"}, m97100d2 = {"Lcom/transsion/subroom/activity/MainActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lfu/a;", "Lcom/transsion/home/preload/a;", "Lzl/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "S0", "()Lfu/a;", "", "isTranslucent", "()Z", "isChangeStatusBar", "isStatusDark", "", "statusColor", "()I", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "onBackPressed", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onDestroy", "Lcom/transsion/home/preload/b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "()Lcom/transsion/home/preload/b;", "isWhiteFont", "isHomeFragment", "changeStatusFontColor", "(ZZ)V", "requestCode", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "outState", "onSaveInstanceState", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "g", "T0", "loadTwoLevelAd", "hasAd", EventConstants.KEY_ACTION, "", "distance", NotificationCompat.CATEGORY_PROGRESS, "onAction", "(Ljava/lang/String;FF)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "callback", "setStateCallback", "(Lkotlin/jvm/functions/Function1;)V", "getTipViewBottomMargin", "E0", "K0", "u1", "e1", "z1", "Lcom/transsion/home/bean/AppTab;", "homeTab", "F1", "(Lcom/transsion/home/bean/AppTab;)V", "", "Lcom/transsion/home/bean/BottomTabItem;", "bottomTabs", "D0", "(Ljava/util/List;)V", "", "notEmptyBottomTabs", "U0", "F0", "(Ljava/util/List;)Z", "tab", "Lcom/google/android/material/tabs/TabLayout$TabView;", "Lcom/google/android/material/tabs/TabLayout;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "selectedTabItem", "Landroid/view/View;", "P1", "(Lcom/transsion/home/bean/BottomTabItem;Lcom/google/android/material/tabs/TabLayout$TabView;Lcom/transsion/home/bean/BottomTabItem;)Landroid/view/View;", "tabItem", "tabView", "K1", "(Lcom/transsion/home/bean/BottomTabItem;Landroid/view/View;Lcom/transsion/home/bean/BottomTabItem;)V", "tabs", "b1", "Landroidx/fragment/app/Fragment;", "J0", "(Lcom/transsion/home/bean/BottomTabItem;)Landroidx/fragment/app/Fragment;", "O0", "fragment", "tag", "M1", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Lcom/google/android/material/tabs/TabLayout$Tab;", "w1", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "A1", "(Lcom/transsion/home/bean/BottomTabItem;)V", "tabType", "R0", "(Ljava/lang/String;)I", "tabCode", "Q0", "initPlayer", "V0", NotificationCompat.CATEGORY_STATUS, "size", "L1", "(II)V", "G1", "I1", "vTips", "Landroidx/appcompat/widget/AppCompatTextView;", "tvStatus", "Landroidx/appcompat/widget/AppCompatImageView;", "ivDownloadFail", "N1", "(Landroid/view/View;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatImageView;I)V", "I0", "O1", "routerPosition", "E1", "(I)V", "D1", "tabId", "P0", "(Ljava/lang/String;I)I", "h1", "bottomMargin", "G0", "(F)V", "isUserAction", "C1", "(Lcom/transsion/home/bean/BottomTabItem;Z)V", "B1", "W0", "c1", "C0", "(Landroid/view/View;)V", "y1", "x1", "Lpy/e;", "a", "Lpy/e;", "onDownloadIconStatusListener", "Lcom/transsion/home/fragment/home/HomeFragment;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/home/fragment/home/HomeFragment;", "homeFragment", "", "c", "Ljava/util/Map;", "mFragments", "Landroidx/fragment/app/Fragment;", "currentFragment", "e", "I", "defaultIndex", "f", "currentFragmentIndex", "Z", "mVideoTabIsWhite", "h", "kidsDialogShown", "i", "widgetDialogShowing", "Lgz/a;", "j", "Lkotlin/Lazy;", "L0", "()Lgz/a;", "mLoginApi", CampaignEx.JSON_KEY_AD_K, "Ljava/lang/String;", "mTopTabCode", "l", "mBottomTabCode", "m", "mInitTabId", "n", "mSecondTabIndex", "", "o", "J", "mBackTime", TtmlNode.TAG_P, "Lcom/transsion/home/preload/b;", "xmlPreload", CampaignEx.JSON_KEY_AD_Q, "Lcom/transsion/home/bean/AppTab;", "mCurrentHomeTab", CampaignEx.JSON_KEY_AD_R, "runOnce", "s", "isShowHotTips", "t", "showHotTabCode", "Liu/b;", TmcStartParams.KEY_URL_SHORT, "M0", "()Liu/b;", "mbUpdateManager", "v", "mHomeStatusWhite", "w", "isBottomTabLargeType", "x", "isUserBottomTabClickAction", "Lcom/transsion/usercenter/profile/f;", "y", "N0", "()Lcom/transsion/usercenter/profile/f;", "noticeViewModel", "Lkotlin/Function0;", "z", "Lkotlin/jvm/functions/Function0;", "onConfigLoadedCallback", "A", "lastClickTime", "B", "isColdStart", "Lcom/transsion/subroom/activity/MainDialogAdManager;", "C", "Lcom/transsion/subroom/activity/MainDialogAdManager;", "mainDialogAdManager", "Lcom/transsion/subroom/activity/SecondFloorHelper;", "D", "Lcom/transsion/subroom/activity/SecondFloorHelper;", "secondFloorHelper", "E", "shouldShowGuide", "com/transsion/subroom/activity/MainActivity$c", "F", "Lcom/transsion/subroom/activity/MainActivity$c;", "hiSdkInitListener", "G", "app_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class MainActivity extends BaseActivity<C23431a> implements InterfaceC15427a, InterfaceC29192b {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final Companion INSTANCE = null;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private long lastClickTime;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private SecondFloorHelper secondFloorHelper;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private InterfaceC26962e onDownloadIconStatusListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private HomeFragment homeFragment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Fragment currentFragment;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean mVideoTabIsWhite;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean kidsDialogShown;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean widgetDialogShowing;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private long mBackTime;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private InterfaceC15428b xmlPreload;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private AppTab mCurrentHomeTab;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean runOnce;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean isBottomTabLargeType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Map mFragments = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int defaultIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int currentFragmentIndex = this.defaultIndex;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Lazy mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.subroom.activity.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.m81643o0();
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public String mTopTabCode = "UgcTrending";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public String mBottomTabCode = BottomTabType.TAB_CODE_HOME;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int mInitTabId = -1;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int mSecondTabIndex = -1;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean isShowHotTips = true;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private String showHotTabCode = "";

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final Lazy mbUpdateManager = LazyKt.m97097b(new Function0() { // from class: com.transsion.subroom.activity.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.m81621d0();
        }
    });

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean mHomeStatusWhite = true;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean isUserBottomTabClickAction = true;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Lazy noticeViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.subroom.activity.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.m81629h0(this.f62693a);
        }
    });

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final Function0 onConfigLoadedCallback = new Function0() { // from class: com.transsion.subroom.activity.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.m81635k0(this.f62694a);
        }
    };

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean isColdStart = true;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private MainDialogAdManager mainDialogAdManager = new MainDialogAdManager();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean shouldShowGuide = true;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C19588c hiSdkInitListener = new C19588c();

    /* JADX INFO: renamed from: com.transsion.subroom.activity.MainActivity$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.subroom.activity.MainActivity$b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C19587b extends AbstractCoroutineContextElement implements InterfaceC25133j0 {
        public C19587b(InterfaceC25133j0.a aVar) {
            super(aVar);
        }

        @Override // kotlinx.coroutines.InterfaceC25133j0
        /* JADX INFO: renamed from: m */
        public void mo9519m(CoroutineContext coroutineContext, Throwable th2) {
            C26866a.f81698a.m104915i("MainActivity", "coroutineExceptionHandler " + th2.getMessage(), true);
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: com.transsion.subroom.activity.MainActivity$c */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C19588c implements InterfaceC14014a {
        C19588c() {
        }

        @Override // com.transsion.p285ad.p287hi.InterfaceC14014a
        public void onInitSuccess() {
            MainActivity.m81665z0(MainActivity.this);
        }
    }

    /* JADX INFO: renamed from: com.transsion.subroom.activity.MainActivity$d */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C19589d implements InterfaceC26962e {
        C19589d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // py.InterfaceC26962e
        /* JADX INFO: renamed from: a */
        public void mo81672a(int i11, int i12) {
            if (((C23431a) MainActivity.this.getMViewBinding()).f71458m.getTabCount() > 3) {
                MainActivity.m81578B0(MainActivity.this, i11, i12);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.subroom.activity.MainActivity$e */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C19590e implements TabLayout.OnTabSelectedListener {
        C19590e() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            C26866a.a.m104898f(C26866a.f81698a, "MainActivity", "onTabReselected", false, 4, null);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            C26866a.a.m104898f(C26866a.f81698a, "MainActivity", "onTabSelected --> tag = " + (tab != null ? tab.getTag() : null), false, 4, null);
            MainActivity.m81663y0(MainActivity.this, tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            C26866a.a.m104898f(C26866a.f81698a, "MainActivity", "onTabUnselected", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.subroom.activity.MainActivity$f */
    /* JADX INFO: loaded from: classes6.dex */
    static final class C19591f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f62617a;

        C19591f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f62617a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f62617a;
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
            this.f62617a.invoke(obj);
        }
    }

    static {
        PairipLoader.registerNativesForClass(46, MainActivity.class);
        Hidden0.special_clinit_46_00(MainActivity.class);
    }

    /* JADX INFO: renamed from: A0 */
    public static final native /* synthetic */ void m81576A0(MainActivity mainActivity, int i11);

    /* JADX INFO: renamed from: A1 */
    private final native void m81577A1(BottomTabItem selectedTabItem);

    /* JADX INFO: renamed from: B0 */
    public static final native /* synthetic */ void m81578B0(MainActivity mainActivity, int i11, int i12);

    /* JADX INFO: renamed from: B1 */
    private final native void m81579B1();

    /* JADX INFO: renamed from: C0 */
    private final native void m81580C0(View view);

    /* JADX INFO: renamed from: C1 */
    private final native void m81581C1(BottomTabItem tabItem, boolean isUserAction);

    /* JADX INFO: renamed from: D0 */
    private final native void m81582D0(List bottomTabs);

    /* JADX INFO: renamed from: D1 */
    private final native void m81583D1();

    /* JADX INFO: renamed from: E0 */
    private final native void m81584E0();

    /* JADX INFO: renamed from: E1 */
    private final native void m81585E1(int routerPosition);

    /* JADX INFO: renamed from: F0 */
    private final native boolean m81586F0(List bottomTabs);

    /* JADX INFO: renamed from: F1 */
    private final native void m81587F1(AppTab homeTab);

    /* JADX INFO: renamed from: G0 */
    private final native void m81588G0(float bottomMargin);

    /* JADX INFO: renamed from: G1 */
    private final native void m81589G1();

    /* JADX INFO: renamed from: H0 */
    static native /* synthetic */ void m81590H0(MainActivity mainActivity, float f11, int i11, Object obj);

    /* JADX INFO: renamed from: H1 */
    private static final native void m81591H1(MainActivity mainActivity, int i11, View view);

    /* JADX INFO: renamed from: I0 */
    private final native void m81592I0();

    /* JADX INFO: renamed from: I1 */
    private final native void m81593I1();

    /* JADX INFO: renamed from: J0 */
    private final native Fragment m81594J0(BottomTabItem tabItem);

    /* JADX INFO: renamed from: J1 */
    private static final native void m81595J1(MainActivity mainActivity, int i11, BottomTabItem bottomTabItem, View view);

    /* JADX INFO: renamed from: K0 */
    private final native void m81596K0();

    /* JADX INFO: renamed from: K1 */
    private final native void m81597K1(BottomTabItem tabItem, View tabView, BottomTabItem selectedTabItem);

    /* JADX INFO: renamed from: L0 */
    private final native InterfaceC23704a m81598L0();

    /* JADX INFO: renamed from: L1 */
    private final native void m81599L1(int status, int size);

    /* JADX INFO: renamed from: M0 */
    private final native C24228b m81600M0();

    /* JADX INFO: renamed from: M1 */
    private final native void m81601M1(Fragment fragment, String tag);

    /* JADX INFO: renamed from: N0 */
    private final native C20664f m81602N0();

    /* JADX INFO: renamed from: N1 */
    private final native void m81603N1(View vTips, AppCompatTextView tvStatus, AppCompatImageView ivDownloadFail, int size);

    /* JADX INFO: renamed from: O0 */
    private final native Fragment m81604O0(BottomTabItem tabItem);

    /* JADX INFO: renamed from: O1 */
    private final native void m81605O1();

    /* JADX INFO: renamed from: P0 */
    private final native int m81606P0(String tabCode, int tabId);

    /* JADX INFO: renamed from: P1 */
    private final native View m81607P1(BottomTabItem tab, TabLayout.TabView view, BottomTabItem selectedTabItem);

    /* JADX INFO: renamed from: Q0 */
    private final native int m81608Q0(String tabCode);

    /* JADX INFO: renamed from: R0 */
    private final native int m81609R0(String tabType);

    /* JADX INFO: renamed from: U0 */
    private final native void m81610U0(List notEmptyBottomTabs);

    /* JADX INFO: renamed from: V0 */
    private final native void m81611V0();

    /* JADX INFO: renamed from: W0 */
    private final native void m81612W0();

    /* JADX INFO: renamed from: X0 */
    private static final native Unit m81613X0(MainActivity mainActivity, C23418i c23418i);

    /* JADX INFO: renamed from: Y0 */
    private static final native Unit m81614Y0(MainActivity mainActivity, C23241a c23241a);

    /* JADX INFO: renamed from: Z0 */
    private static final native Unit m81615Z0(MainActivity mainActivity, C5117n c5117n);

    /* JADX INFO: renamed from: a1 */
    private static final native Unit m81616a1(MainActivity mainActivity, C29191a c29191a);

    /* JADX INFO: renamed from: b0 */
    public static native /* synthetic */ void m81617b0(MainActivity mainActivity);

    /* JADX INFO: renamed from: b1 */
    private final native void m81618b1(List tabs);

    /* JADX INFO: renamed from: c0 */
    public static native /* synthetic */ Unit m81619c0(MainActivity mainActivity, C23418i c23418i);

    /* JADX INFO: renamed from: c1 */
    private final native void m81620c1();

    /* JADX INFO: renamed from: d0 */
    public static native /* synthetic */ C24228b m81621d0();

    /* JADX INFO: renamed from: d1 */
    private static final native Unit m81622d1(MainActivity mainActivity, ImageView imageView, C23242b c23242b);

    /* JADX INFO: renamed from: e0 */
    public static native /* synthetic */ Unit m81623e0(MainActivity mainActivity, AppTab appTab);

    /* JADX INFO: renamed from: e1 */
    private final native void m81624e1();

    /* JADX INFO: renamed from: f0 */
    public static native /* synthetic */ Unit m81625f0(MainActivity mainActivity, C5117n c5117n);

    /* JADX INFO: renamed from: f1 */
    private static final native Unit m81626f1(MainActivity mainActivity, AppTab appTab);

    /* JADX INFO: renamed from: g0 */
    public static native /* synthetic */ void m81627g0(MainActivity mainActivity, int i11, BottomTabItem bottomTabItem, View view);

    /* JADX INFO: renamed from: g1 */
    private static final native Unit m81628g1(MainActivity mainActivity, AppTab appTab);

    /* JADX INFO: renamed from: h0 */
    public static native /* synthetic */ C20664f m81629h0(MainActivity mainActivity);

    /* JADX INFO: renamed from: h1 */
    private final native void m81630h1();

    /* JADX INFO: renamed from: i0 */
    public static native /* synthetic */ Unit m81631i0(MainActivity mainActivity, ImageView imageView, C23242b c23242b);

    /* JADX INFO: renamed from: i1 */
    private static final native void m81632i1(MainActivity mainActivity, TabLayout.TabView tabView);

    private final native void initPlayer();

    /* JADX INFO: renamed from: j0 */
    public static native /* synthetic */ Unit m81633j0(MainActivity mainActivity);

    /* JADX INFO: renamed from: j1 */
    private static final native Unit m81634j1(TabLayout.TabView tabView, MainActivity mainActivity, Integer num);

    /* JADX INFO: renamed from: k0 */
    public static native /* synthetic */ Unit m81635k0(MainActivity mainActivity);

    /* JADX INFO: renamed from: k1 */
    private static final native Unit m81636k1(MainActivity mainActivity);

    /* JADX INFO: renamed from: l0 */
    public static native /* synthetic */ void m81637l0(MainActivity mainActivity);

    /* JADX INFO: renamed from: l1 */
    private static final native InterfaceC23704a m81638l1();

    /* JADX INFO: renamed from: m0 */
    public static native /* synthetic */ Unit m81639m0(MainActivity mainActivity, AppTab appTab);

    /* JADX INFO: renamed from: m1 */
    private static final native C24228b m81640m1();

    /* JADX INFO: renamed from: n0 */
    public static native /* synthetic */ String m81641n0(InterfaceC23704a interfaceC23704a);

    /* JADX INFO: renamed from: n1 */
    private static final native C20664f m81642n1(MainActivity mainActivity);

    /* JADX INFO: renamed from: o0 */
    public static native /* synthetic */ InterfaceC23704a m81643o0();

    /* JADX INFO: renamed from: o1 */
    private static final native Unit m81644o1(MainActivity mainActivity);

    /* JADX INFO: renamed from: p0 */
    public static native /* synthetic */ Unit m81645p0(TabLayout.TabView tabView, MainActivity mainActivity, Integer num);

    /* JADX INFO: renamed from: p1 */
    private static final native void m81646p1(MainActivity mainActivity);

    /* JADX INFO: renamed from: q0 */
    public static native /* synthetic */ Unit m81647q0(MainActivity mainActivity, C29191a c29191a);

    /* JADX INFO: renamed from: q1 */
    private static final native void m81648q1(MainActivity mainActivity);

    /* JADX INFO: renamed from: r0 */
    public static native /* synthetic */ Unit m81649r0(MainActivity mainActivity);

    /* JADX INFO: renamed from: r1 */
    private static final native String m81650r1(InterfaceC23704a interfaceC23704a);

    /* JADX INFO: renamed from: s0 */
    public static native /* synthetic */ Unit m81651s0(MainActivity mainActivity, C23241a c23241a);

    /* JADX INFO: renamed from: s1 */
    private static final native Unit m81652s1(Context context, String str, String str2, InterfaceC18701a interfaceC18701a);

    /* JADX INFO: renamed from: t0 */
    public static native /* synthetic */ void m81653t0(MainActivity mainActivity, int i11, View view);

    /* JADX INFO: renamed from: t1 */
    private static final native Unit m81654t1(String str);

    /* JADX INFO: renamed from: u0 */
    public static native /* synthetic */ Unit m81655u0(String str);

    /* JADX INFO: renamed from: u1 */
    private final native void m81656u1();

    /* JADX INFO: renamed from: v0 */
    public static native /* synthetic */ void m81657v0(MainActivity mainActivity, TabLayout.TabView tabView);

    /* JADX INFO: renamed from: v1 */
    private static final native Unit m81658v1(MainActivity mainActivity);

    /* JADX INFO: renamed from: w0 */
    public static native /* synthetic */ Unit m81659w0(Context context, String str, String str2, InterfaceC18701a interfaceC18701a);

    /* JADX INFO: renamed from: w1 */
    private final native void m81660w1(TabLayout.Tab tab);

    /* JADX INFO: renamed from: x0 */
    public static final native /* synthetic */ int m81661x0(MainActivity mainActivity, String str, int i11);

    /* JADX INFO: renamed from: x1 */
    private final native void m81662x1();

    /* JADX INFO: renamed from: y0 */
    public static final native /* synthetic */ void m81663y0(MainActivity mainActivity, TabLayout.Tab tab);

    /* JADX INFO: renamed from: y1 */
    private final native void m81664y1();

    /* JADX INFO: renamed from: z0 */
    public static final native /* synthetic */ void m81665z0(MainActivity mainActivity);

    /* JADX INFO: renamed from: z1 */
    private final native void m81666z1();

    /* JADX INFO: renamed from: S0 */
    public native C23431a m81667S0();

    /* JADX INFO: renamed from: T0 */
    public final native void m81668T0();

    @Override // com.transsion.baseui.activity.BaseActivity
    public native void changeStatusFontColor(boolean isWhiteFont, boolean isHomeFragment);

    @Override // com.transsion.home.preload.InterfaceC15427a
    /* JADX INFO: renamed from: d */
    public native InterfaceC15428b mo66689d();

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseMusicFloatActivity, android.app.Activity, android.view.Window.Callback
    public native boolean dispatchTouchEvent(MotionEvent event);

    @Override // p983zl.InterfaceC29192b
    /* JADX INFO: renamed from: g */
    public native boolean mo81669g();

    @Override // com.transsion.baseui.activity.BaseMusicFloatActivity
    public native int getTipViewBottomMargin();

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public native /* bridge */ /* synthetic */ InterfaceC23498a getViewBinding();

    @Override // com.transsion.baseui.activity.BaseActivity
    public native boolean hasAd();

    @Override // com.transsion.baseui.activity.BaseActivity
    public native boolean isChangeStatusBar();

    @Override // com.transsion.baseui.activity.BaseActivity
    public native boolean isStatusDark();

    @Override // com.transsion.baseui.activity.BaseActivity
    public native boolean isTranslucent();

    @Override // com.transsion.baseui.activity.BaseActivity
    public native void loadTwoLevelAd();

    @Override // com.transsion.baseui.activity.BaseActivity
    public native void onAction(String action, float distance, float progress);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected native void onActivityResult(int requestCode, int resultCode, Intent data);

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public native void onBackPressed();

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public native void onConfigurationChanged(Configuration newConfig);

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected native void onCreate(Bundle savedInstanceState);

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected native void onDestroy();

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected native void onNewIntent(Intent intent);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public native void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults);

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseMusicFloatActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public native void onResume();

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected native void onSaveInstanceState(Bundle outState);

    @Override // com.transsion.baseui.activity.BaseActivity
    public native void setStateCallback(Function1 callback);

    @Override // com.transsion.baseui.activity.BaseActivity
    public native int statusColor();
}
