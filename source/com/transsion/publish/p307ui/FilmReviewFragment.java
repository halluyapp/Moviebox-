package com.transsion.publish.p307ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.AbstractC0253f;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cf.C5088c;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5789h;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.cloud.tmc.integration.MiniAppConfigHelper;
import com.cloud.tmc.integration.event.EventConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.p282tn.lib.view.bubbleview.BubbleTextView;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.dialog.TRDialog;
import com.p282tn.lib.widget.dialog.TRDialogListener;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.tencent.mmkv.MMKV;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.publish.PublishManager;
import com.transsion.publish.PublishService;
import com.transsion.publish.R$drawable;
import com.transsion.publish.R$id;
import com.transsion.publish.R$string;
import com.transsion.publish.adapter.C17558g;
import com.transsion.publish.adapter.C17578r;
import com.transsion.publish.adapter.C17582v;
import com.transsion.publish.adapter.InterfaceC17546a;
import com.transsion.publish.api.AudioEntity;
import com.transsion.publish.api.GroupBean;
import com.transsion.publish.api.LinkEntity;
import com.transsion.publish.api.PhotoEntity;
import com.transsion.publish.api.VsMediaInfo;
import com.transsion.publish.api.bean.MediaAudioEntity;
import com.transsion.publish.api.bean.MediaCoverEntity;
import com.transsion.publish.api.bean.MediaImageEntity;
import com.transsion.publish.api.bean.MediaLinkEntity;
import com.transsion.publish.api.bean.MediaVideoEntity;
import com.transsion.publish.api.bean.RequestPostEntity;
import com.transsion.publish.api.bean.RequestPostMediaEntity;
import com.transsion.publish.bean.BigImageBean;
import com.transsion.publish.bean.CoverEntity;
import com.transsion.publish.view.ObservableScrollView;
import com.transsion.publish.view.operation.OperationBarView;
import com.transsion.publish.view.operation.OperationVerticalBarView;
import com.transsion.publish.viewmodel.C17722d;
import com.transsion.room.api.bean.LocationPlace;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jp.C24458h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C25220y0;
import kp.DialogC25420b;
import mg.C25825b;
import mn.C25890a;
import mp.C25896b;
import ng.AbstractC26006c;
import org.mvel2.ast.ASTNode;
import p016ak.C0117a;
import p016ak.InterfaceC0118b;
import p393f.C23281g;
import p393f.C23284j;
import p415fq.InterfaceC23415f;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p465hp.C23889b;
import p493ip.C24200a;
import p550kj.C24655b;
import p550kj.C24662i;
import p655op.C26380g;
import p715qp.C27115f;
import p743rh.C27287m;
import p888wy.C28465b;
import pg.C26866a;
import sh.C27621h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 Ð\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Ñ\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH\u0003¢\u0006\u0004\b)\u0010\u0007J\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\u0007J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b0\u0010.J\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\u0007J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0007J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020#03H\u0002¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\b\u0012\u0004\u0012\u00020603H\u0002¢\u0006\u0004\b7\u00105J\u001f\u00109\u001a\u00020\b2\u000e\u00108\u001a\n\u0012\u0004\u0012\u000206\u0018\u000103H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b;\u0010.J\u0017\u0010<\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b<\u0010.J\u0017\u0010=\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b=\u0010.J\u0017\u0010>\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b>\u0010.J\u0017\u0010?\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b?\u0010.J\u0017\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u0019\u0010J\u001a\u00020\b2\b\u0010I\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\bL\u0010.J\u000f\u0010M\u001a\u00020\bH\u0002¢\u0006\u0004\bM\u0010\u0007J\u0017\u0010O\u001a\u00020\b2\u0006\u0010N\u001a\u00020\u0017H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\bH\u0002¢\u0006\u0004\bQ\u0010\u0007J\u000f\u0010R\u001a\u00020\bH\u0002¢\u0006\u0004\bR\u0010\u0007J\u000f\u0010S\u001a\u00020\bH\u0002¢\u0006\u0004\bS\u0010\u0007J\u000f\u0010T\u001a\u00020\bH\u0002¢\u0006\u0004\bT\u0010\u0007J\u000f\u0010U\u001a\u00020\bH\u0002¢\u0006\u0004\bU\u0010\u0007J\u0017\u0010X\u001a\u00020\b2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\bH\u0002¢\u0006\u0004\bZ\u0010\u0007J\u0017\u0010]\u001a\u00020\b2\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\bH\u0002¢\u0006\u0004\b_\u0010\u0007J\u000f\u0010`\u001a\u00020\bH\u0002¢\u0006\u0004\b`\u0010\u0007J\u000f\u0010a\u001a\u00020[H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\bH\u0002¢\u0006\u0004\bc\u0010\u0007J\u000f\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010i\u001a\u00020\u00022\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jJ!\u0010o\u001a\u00020\b2\u0006\u0010l\u001a\u00020k2\b\u0010n\u001a\u0004\u0018\u00010mH\u0016¢\u0006\u0004\bo\u0010pJ!\u0010q\u001a\u00020\b2\u0006\u0010l\u001a\u00020k2\b\u0010n\u001a\u0004\u0018\u00010mH\u0016¢\u0006\u0004\bq\u0010pJ\r\u0010r\u001a\u00020\b¢\u0006\u0004\br\u0010\u0007J\r\u0010s\u001a\u00020\b¢\u0006\u0004\bs\u0010\u0007J\u000f\u0010t\u001a\u00020\bH\u0016¢\u0006\u0004\bt\u0010\u0007J\u000f\u0010u\u001a\u00020\bH\u0016¢\u0006\u0004\bu\u0010\u0007J\u0017\u0010x\u001a\u00020\b2\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020\b2\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bz\u0010yJ\u0017\u0010{\u001a\u00020\b2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\b{\u0010YJ\u0017\u0010|\u001a\u00020\b2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\b|\u0010YJ\u0017\u0010}\u001a\u00020\b2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\b}\u0010YJ\u0017\u0010~\u001a\u00020\b2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\b~\u0010YJ\u0017\u0010\u007f\u001a\u00020\b2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\b\u007f\u0010YJ\u0019\u0010\u0080\u0001\u001a\u00020\b2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0005\b\u0080\u0001\u0010YJ\u0019\u0010\u0081\u0001\u001a\u00020\b2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0005\b\u0081\u0001\u0010YJ\u0019\u0010\u0082\u0001\u001a\u00020\b2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0005\b\u0082\u0001\u0010YJ\u0011\u0010\u0083\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\b\u0083\u0001\u0010\u0007J\u0011\u0010\u0084\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\b\u0084\u0001\u0010\u0007J\u0011\u0010\u0085\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\b\u0085\u0001\u0010\u0007J\u0011\u0010\u0086\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\b\u0086\u0001\u0010\u0007J\u000f\u0010\u0087\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0087\u0001\u0010(R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001b\u0010\u0091\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0019\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bE\u0010\u0099\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001b\u0010\u009c\u0001\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001b\u0010\u009e\u0001\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009d\u0001R\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0019\u0010¢\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0019\u0010¤\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010£\u0001R\u0019\u0010¥\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010£\u0001R\u0017\u0010¦\u0001\u001a\u00020\u00178\u0002X\u0082D¢\u0006\b\n\u0006\b¦\u0001\u0010£\u0001R\u0017\u0010§\u0001\u001a\u00020\u00178\u0002X\u0082D¢\u0006\b\n\u0006\b§\u0001\u0010£\u0001R\u0019\u0010¨\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010ª\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010£\u0001R\u0019\u0010«\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010©\u0001R\u0019\u0010¬\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010®\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010©\u0001R\u0019\u0010¯\u0001\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R#\u0010¶\u0001\u001a\u0005\u0018\u00010±\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R#\u0010»\u0001\u001a\u0005\u0018\u00010·\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0001\u0010³\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R!\u0010À\u0001\u001a\u00030¼\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b½\u0001\u0010³\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R#\u0010Ã\u0001\u001a\f\u0012\u0005\u0012\u00030Â\u0001\u0018\u00010Á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0019\u0010Å\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010©\u0001R\u001c\u0010Ç\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001c\u0010É\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010È\u0001R\u0019\u0010Ê\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010©\u0001R#\u0010Ì\u0001\u001a\f\u0012\u0005\u0012\u00030Ë\u0001\u0018\u00010Á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Ä\u0001R\u0018\u0010Î\u0001\u001a\u00030Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001¨\u0006Ò\u0001"}, m97100d2 = {"Lcom/transsion/publish/ui/FilmReviewFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Ljp/h;", "Lcom/tn/lib/widget/dialog/TRDialogListener;", "Lcom/transsion/publish/adapter/a;", "Lkp/b$b;", "<init>", "()V", "", "getVideoIconView", "getImageIconView", "showActivityTips", "", "timestamp1", "timestamp2", "", "isMoreThanADay", "(JJ)Z", "requestCurrentLocation", "userPost", "userGrade", "Lcom/transsion/publish/api/bean/RequestPostEntity;", "request", "", EventConstants.KEY_SOURCE, "postService", "(Lcom/transsion/publish/api/bean/RequestPostEntity;I)V", "buildRequest", "()Lcom/transsion/publish/api/bean/RequestPostEntity;", "detectionSelect", "(Lcom/transsion/publish/api/bean/RequestPostEntity;)V", "Lcom/transsion/publish/api/bean/RequestPostMediaEntity;", "mediaTypes", "checkCover", "(Lcom/transsion/publish/api/bean/RequestPostMediaEntity;)V", "Lcom/transsion/publish/api/VsMediaInfo;", "vsMediaInfo", "checkVideoCover", "(Lcom/transsion/publish/api/bean/RequestPostMediaEntity;Lcom/transsion/publish/api/VsMediaInfo;)V", "checkLogin", "()Z", "initViewModel", "observe", "Lhp/b;", "it", "disposeOperate", "(Lhp/b;)V", "refreshLocation", "refreshImage", "initImageAdapter", "initVideoAdapter", "", "getAddVideoEntity", "()Ljava/util/List;", "Lcom/transsion/publish/api/PhotoEntity;", "getAddImageEntity", "photoEntity", "selectPhotosDispose", "(Ljava/util/List;)V", "refreshAudio", "refreshVideo", "refreshCover", "refreshLink", "refreshWork", "Lcom/transsion/moviedetailapi/bean/Subject;", "subject", "setSubject", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "Lcom/transsion/publish/api/GroupBean;", "groupBean", "setGroup", "(Lcom/transsion/publish/api/GroupBean;)V", "Lcom/transsion/room/api/bean/LocationPlace;", RequestParameters.SUBRESOURCE_LOCATION, "setLocation", "(Lcom/transsion/room/api/bean/LocationPlace;)V", "refreshGroup", "initManagerAdapter", MimeTypes.BASE_TYPE_TEXT, "setStarTips", "(I)V", "deleteAudio", "deleteLocation", "coverClearDialog", "backSaveDialog", "initRegisterMediaSelector", "Landroid/content/Context;", "context", "showLinkEditInputDialog", "(Landroid/content/Context;)V", "checkBottomMargin", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "clickTrace", "(Ljava/lang/String;)V", "clickPostTrace", "openRoomList", "getPageName", "()Ljava/lang/String;", "hideOpertaionDialog", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Landroid/view/LayoutInflater;", "inflater", "getViewBinding", "(Landroid/view/LayoutInflater;)Ljp/h;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initView", "closeAffirm", "checkPost", "lazyLoadData", "onDestroy", "Lcom/tn/lib/widget/dialog/TRDialog;", "dialog", "onLeftButtonClick", "(Lcom/tn/lib/widget/dialog/TRDialog;)V", "onRightButtonClick", "startPhoto", "startVideo", "startAudio", "startWork", "startLink", "startLocation", "startGroup", "put", "onPause", "completeLoad", "onStop", "onResume", "isPostEnable", "Lcom/transsion/publish/adapter/g;", "imageAdapter", "Lcom/transsion/publish/adapter/g;", "Lcom/transsion/publish/adapter/r;", "managerAdapter", "Lcom/transsion/publish/adapter/r;", "Lcom/transsion/publish/adapter/v;", "videoAdapter", "Lcom/transsion/publish/adapter/v;", "operationMenu", "Lhp/b;", "Lcom/transsion/publish/viewmodel/d;", "postViewModel", "Lcom/transsion/publish/viewmodel/d;", "Lcom/transsion/publish/bean/CoverEntity;", "coverPath", "Lcom/transsion/publish/bean/CoverEntity;", "Lcom/transsion/publish/api/GroupBean;", "mSubject", "Lcom/transsion/moviedetailapi/bean/Subject;", "locationBean", "Lcom/transsion/room/api/bean/LocationPlace;", "curLocationBean", "Lcom/transsion/publish/api/bean/MediaLinkEntity;", "linkEntity", "Lcom/transsion/publish/api/bean/MediaLinkEntity;", "publishType", "I", "sourceType", "sourceMode", "TITLE_MAX", "DESC_MAX", "requestGroup", "Z", "postStar", "isBold", "showTime", "J", "hasFocus", "TAG", "Ljava/lang/String;", "Lfq/f;", "mRoomApi$delegate", "Lkotlin/Lazy;", "getMRoomApi", "()Lfq/f;", "mRoomApi", "Lgz/a;", "loginApi$delegate", "getLoginApi", "()Lgz/a;", "loginApi", "Lmp/b;", "publishModel$delegate", "getPublishModel", "()Lmp/b;", "publishModel", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "loginLaunch", "Landroidx/activity/result/b;", "isNeedShowLoginActivity", "Landroid/widget/ImageView;", "videoIcon", "Landroid/widget/ImageView;", "imageIcon", "underOS33", "Landroidx/activity/result/e;", "videoSelectLauncher", "Ljava/lang/Runnable;", "mRunnable", "Ljava/lang/Runnable;", "Companion", "a", "Publish_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class FilmReviewFragment extends BaseFragment<C24458h> implements TRDialogListener, InterfaceC17546a, DialogC25420b.b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String PAGE_NAME = "publish_post";
    private CoverEntity coverPath;
    private LocationPlace curLocationBean;
    private GroupBean groupBean;
    private boolean hasFocus;
    private C17558g imageAdapter;
    private ImageView imageIcon;
    private boolean isBold;
    private boolean isNeedShowLoginActivity;
    private MediaLinkEntity linkEntity;
    private LocationPlace locationBean;
    private AbstractC0249b loginLaunch;
    private final Runnable mRunnable;
    private Subject mSubject;
    private C17578r managerAdapter;
    private C23889b operationMenu;
    private int postStar;
    private C17722d postViewModel;
    private int publishType;
    private boolean requestGroup;
    private long showTime;
    private int sourceMode;
    private int sourceType;
    private boolean underOS33;
    private C17582v videoAdapter;
    private ImageView videoIcon;
    private AbstractC0249b videoSelectLauncher;
    private final int TITLE_MAX = 100;
    private final int DESC_MAX = 1000;
    private String TAG = PublishManager.TAG;

    /* JADX INFO: renamed from: mRoomApi$delegate, reason: from kotlin metadata */
    private final Lazy mRoomApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.publish.ui.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FilmReviewFragment.mRoomApi_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: loginApi$delegate, reason: from kotlin metadata */
    private final Lazy loginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.publish.ui.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FilmReviewFragment.loginApi_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: publishModel$delegate, reason: from kotlin metadata */
    private final Lazy publishModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.publish.ui.w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FilmReviewFragment.publishModel_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: com.transsion.publish.ui.FilmReviewFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final FilmReviewFragment m75433a(int i11, Subject subject, int i12, GroupBean groupBean) {
            FilmReviewFragment filmReviewFragment = new FilmReviewFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("sourceType", i11);
            bundle.putInt("sourceMode", i12);
            if (subject != null) {
                bundle.putSerializable("subject", subject);
            }
            if (groupBean != null) {
                bundle.putSerializable("group", groupBean);
            }
            filmReviewFragment.setArguments(bundle);
            return filmReviewFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.FilmReviewFragment$b */
    public static final class C17608b implements TextWatcher {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Ref.ObjectRef f58140b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Ref.ObjectRef f58141c;

        C17608b(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            this.f58140b = objectRef;
            this.f58141c = objectRef2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EditText editText;
            EditText editText2;
            TextView textView;
            EditText editText3;
            EditText editText4;
            TextView textView2;
            TextView textView3;
            EditText editText5;
            EditText editText6;
            int length = editable != null ? editable.length() : 0;
            if (length <= 0) {
                FilmReviewFragment.this.isBold = false;
                C24458h mViewBinding = FilmReviewFragment.this.getMViewBinding();
                if (mViewBinding != null && (editText2 = mViewBinding.f74571d) != null) {
                    editText2.setTypeface((Typeface) this.f58141c.element, 0);
                }
                C24458h mViewBinding2 = FilmReviewFragment.this.getMViewBinding();
                if (mViewBinding2 != null && (editText = mViewBinding2.f74571d) != null) {
                    editText.invalidate();
                }
            } else if (!FilmReviewFragment.this.isBold) {
                C24458h mViewBinding3 = FilmReviewFragment.this.getMViewBinding();
                if (mViewBinding3 != null && (editText6 = mViewBinding3.f74571d) != null) {
                    editText6.setTypeface((Typeface) this.f58140b.element, 1);
                }
                C24458h mViewBinding4 = FilmReviewFragment.this.getMViewBinding();
                if (mViewBinding4 != null && (editText5 = mViewBinding4.f74571d) != null) {
                    editText5.invalidate();
                }
                FilmReviewFragment.this.isBold = true;
            }
            if (length < FilmReviewFragment.this.TITLE_MAX - 20 || length > FilmReviewFragment.this.TITLE_MAX) {
                C24458h mViewBinding5 = FilmReviewFragment.this.getMViewBinding();
                if (mViewBinding5 != null && (textView = mViewBinding5.f74590w) != null) {
                    textView.setVisibility(8);
                }
            } else {
                C24458h mViewBinding6 = FilmReviewFragment.this.getMViewBinding();
                if (mViewBinding6 != null && (textView3 = mViewBinding6.f74590w) != null) {
                    textView3.setVisibility(0);
                }
                C24458h mViewBinding7 = FilmReviewFragment.this.getMViewBinding();
                if (mViewBinding7 != null && (textView2 = mViewBinding7.f74590w) != null) {
                    textView2.setText(String.valueOf(FilmReviewFragment.this.TITLE_MAX - length));
                }
            }
            if (length > FilmReviewFragment.this.TITLE_MAX) {
                C13806h.f49015a.m62324k(R$string.post_title_length_max);
                if (TextUtils.isEmpty(editable)) {
                    return;
                }
                Integer numValueOf = editable != null ? Integer.valueOf(editable.length()) : null;
                Intrinsics.m97799e(numValueOf);
                if (numValueOf.intValue() > FilmReviewFragment.this.TITLE_MAX) {
                    String string = editable.subSequence(0, FilmReviewFragment.this.TITLE_MAX).toString();
                    C24458h mViewBinding8 = FilmReviewFragment.this.getMViewBinding();
                    if (mViewBinding8 != null && (editText4 = mViewBinding8.f74571d) != null) {
                        editText4.setText(string);
                    }
                    C24458h mViewBinding9 = FilmReviewFragment.this.getMViewBinding();
                    if (mViewBinding9 == null || (editText3 = mViewBinding9.f74571d) == null) {
                        return;
                    }
                    editText3.setSelection(string.length());
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.FilmReviewFragment$c */
    public static final class C17609c implements TextWatcher {
        C17609c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            OperationBarView operationBarView;
            OperationBarView operationBarView2;
            OperationBarView operationBarView3;
            C24458h mViewBinding;
            EditText editText;
            EditText editText2;
            OperationBarView operationBarView4;
            EditText editText3;
            Integer numValueOf = editable != null ? Integer.valueOf(editable.length()) : null;
            C24458h mViewBinding2 = FilmReviewFragment.this.getMViewBinding();
            if (mViewBinding2 != null && (editText3 = mViewBinding2.f74570c) != null) {
                Linkify.addLinks(editText3, 1);
            }
            if (numValueOf != null) {
                FragmentActivity activity = FilmReviewFragment.this.getActivity();
                Intrinsics.m97800f(activity, "null cannot be cast to non-null type com.transsion.publish.ui.FilmReviewActivity");
                ((FilmReviewActivity) activity).m75409j0(FilmReviewFragment.this.isPostEnable());
                if (numValueOf.intValue() >= 995) {
                    C24458h mViewBinding3 = FilmReviewFragment.this.getMViewBinding();
                    if (mViewBinding3 != null && (operationBarView4 = mViewBinding3.f74580m) != null) {
                        operationBarView4.setInputLimitColor(R$color.error_50);
                    }
                } else {
                    C24458h mViewBinding4 = FilmReviewFragment.this.getMViewBinding();
                    if (mViewBinding4 != null && (operationBarView2 = mViewBinding4.f74580m) != null) {
                        operationBarView2.setInputLimitColor(R$color.white_80);
                    }
                }
                if (numValueOf.intValue() >= FilmReviewFragment.this.DESC_MAX) {
                    if (TextUtils.isEmpty(editable)) {
                        return;
                    }
                    Integer numValueOf2 = editable != null ? Integer.valueOf(editable.length()) : null;
                    Intrinsics.m97799e(numValueOf2);
                    if (numValueOf2.intValue() > FilmReviewFragment.this.DESC_MAX) {
                        String string = editable != null ? editable.subSequence(0, FilmReviewFragment.this.DESC_MAX).toString() : null;
                        C24458h mViewBinding5 = FilmReviewFragment.this.getMViewBinding();
                        if (mViewBinding5 != null && (editText2 = mViewBinding5.f74570c) != null) {
                            editText2.setText(string);
                        }
                        if (string != null && (mViewBinding = FilmReviewFragment.this.getMViewBinding()) != null && (editText = mViewBinding.f74570c) != null) {
                            editText.setSelection(string.length());
                        }
                        C24458h mViewBinding6 = FilmReviewFragment.this.getMViewBinding();
                        if (mViewBinding6 == null || (operationBarView3 = mViewBinding6.f74580m) == null) {
                            return;
                        }
                        operationBarView3.updateInputNum(string != null ? string.length() : 0);
                        return;
                    }
                    return;
                }
            }
            C24458h mViewBinding7 = FilmReviewFragment.this.getMViewBinding();
            if (mViewBinding7 == null || (operationBarView = mViewBinding7.f74580m) == null) {
                return;
            }
            operationBarView.updateInputNum(numValueOf != null ? numValueOf.intValue() : 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.FilmReviewFragment$d */
    public static final class CountDownTimerC17610d extends CountDownTimer {
        CountDownTimerC17610d() {
            super(5000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            BubbleTextView bubbleTextView;
            C24458h mViewBinding = FilmReviewFragment.this.getMViewBinding();
            if (mViewBinding == null || (bubbleTextView = mViewBinding.f74569b) == null) {
                return;
            }
            bubbleTextView.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
        }
    }

    public FilmReviewFragment() {
        this.underOS33 = Build.VERSION.SDK_INT < 33;
        this.mRunnable = new Runnable() { // from class: com.transsion.publish.ui.x
            @Override // java.lang.Runnable
            public final void run() {
                FilmReviewFragment.mRunnable$lambda$36(this.f58281a);
            }
        };
    }

    private final void backSaveDialog() {
        try {
            TRDialog.C13786a c13786a = new TRDialog.C13786a();
            String string = getString(R$string.cover_save_des);
            Intrinsics.m97801g(string, "getString(...)");
            TRDialog.C13786a c13786aM62288g = c13786a.m62288g(string);
            String string2 = getString(R$string.cover_save_right);
            Intrinsics.m97801g(string2, "getString(...)");
            TRDialog.C13786a c13786aM62286e = c13786aM62288g.m62286e(string2);
            String string3 = getString(R$string.cover_save_left);
            Intrinsics.m97801g(string3, "getString(...)");
            c13786aM62286e.m62291j(string3).m62289h(R$drawable.btn_bg_dialog_edit_selector).m62284c(R$drawable.btn_bg_dialog_edit_selector).m62290i(AbstractC5789h.m27406a(R$color.error_50)).m62287f(this).m62282a().m62248d0(this, "back_save");
            HashMap map = new HashMap();
            map.put("module_name", "back_save_dialog");
            C24662i.f75350a.m96872D(getPageName(), map);
        } catch (Exception unused) {
        }
    }

    private final RequestPostEntity buildRequest() {
        String groupId;
        String name;
        Double lat;
        Double lon;
        EditText editText;
        String subjectId;
        EditText editText2;
        C24458h mViewBinding = getMViewBinding();
        Editable text = null;
        String strQ = StringsKt.m98236Q(StringsKt.m98236Q(String.valueOf((mViewBinding == null || (editText2 = mViewBinding.f74570c) == null) ? null : editText2.getText()), "\\n", "", false, 4, null), "\\t", "", false, 4, null);
        RequestPostEntity requestPostEntity = new RequestPostEntity();
        GroupBean groupBean = this.groupBean;
        String str = "0";
        if (groupBean == null || (groupId = groupBean.getGroupId()) == null) {
            groupId = "0";
        }
        requestPostEntity.setGroupId(groupId);
        requestPostEntity.setScore(String.valueOf(this.postStar));
        requestPostEntity.setLink(this.linkEntity);
        Subject subject = this.mSubject;
        if (subject != null && (subjectId = subject.getSubjectId()) != null) {
            str = subjectId;
        }
        requestPostEntity.setSubjectId(str);
        C24458h mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (editText = mViewBinding2.f74571d) != null) {
            text = editText.getText();
        }
        requestPostEntity.setTitle(String.valueOf(text));
        requestPostEntity.setContent(strQ);
        requestPostEntity.setPublishType(this.sourceType);
        LocationPlace locationPlace = this.locationBean;
        double dDoubleValue = 0.0d;
        requestPostEntity.setLon((locationPlace == null || (lon = locationPlace.getLon()) == null) ? 0.0d : lon.doubleValue());
        LocationPlace locationPlace2 = this.locationBean;
        if (locationPlace2 != null && (lat = locationPlace2.getLat()) != null) {
            dDoubleValue = lat.doubleValue();
        }
        requestPostEntity.setLat(dDoubleValue);
        LocationPlace locationPlace3 = this.locationBean;
        if (locationPlace3 == null || (name = locationPlace3.getName()) == null) {
            name = "";
        }
        requestPostEntity.setPoiName(name);
        detectionSelect(requestPostEntity);
        return requestPostEntity;
    }

    private final void checkBottomMargin() {
    }

    private final void checkCover(RequestPostMediaEntity mediaTypes) {
        Integer height;
        Integer width;
        Long size;
        if (this.coverPath != null) {
            MediaCoverEntity mediaCoverEntity = new MediaCoverEntity();
            CoverEntity coverEntity = this.coverPath;
            mediaCoverEntity.setUrl(coverEntity != null ? coverEntity.getUrl() : null);
            CoverEntity coverEntity2 = this.coverPath;
            mediaCoverEntity.setSize((coverEntity2 == null || (size = coverEntity2.getSize()) == null) ? 0L : size.longValue());
            CoverEntity coverEntity3 = this.coverPath;
            int iIntValue = 0;
            mediaCoverEntity.setWidth((coverEntity3 == null || (width = coverEntity3.getWidth()) == null) ? 0 : width.intValue());
            CoverEntity coverEntity4 = this.coverPath;
            if (coverEntity4 != null && (height = coverEntity4.getHeight()) != null) {
                iIntValue = height.intValue();
            }
            mediaCoverEntity.setHeight(iIntValue);
            mediaTypes.setCover(mediaCoverEntity);
        }
    }

    private final boolean checkLogin() {
        InterfaceC23704a loginApi = getLoginApi();
        if (loginApi == null || loginApi.mo90379a()) {
            return true;
        }
        AbstractC0249b abstractC0249b = this.loginLaunch;
        if (abstractC0249b == null) {
            this.isNeedShowLoginActivity = true;
        }
        if (abstractC0249b == null) {
            return false;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        Intent intentMo90394p = loginApi.mo90394p(contextRequireContext);
        intentMo90394p.putExtra("title_name", getString(R$string.post_login_title));
        abstractC0249b.m999a(intentMo90394p);
        return false;
    }

    private final void checkVideoCover(RequestPostMediaEntity mediaTypes, VsMediaInfo vsMediaInfo) {
        if (TextUtils.isEmpty(vsMediaInfo.getImagePath())) {
            return;
        }
        int[] iArrM27122d = ImageUtils.m27122d(vsMediaInfo.getImagePath());
        MediaCoverEntity mediaCoverEntity = new MediaCoverEntity();
        mediaCoverEntity.setUrl(vsMediaInfo.getImagePath());
        mediaCoverEntity.setSize(iArrM27122d[0] * iArrM27122d[1]);
        mediaCoverEntity.setWidth(iArrM27122d[0]);
        mediaCoverEntity.setHeight(iArrM27122d[1]);
        mediaTypes.setCover(mediaCoverEntity);
    }

    private final void clickPostTrace() {
        HashMap map = new HashMap();
        map.put("module_name", "post");
        C24662i.f75350a.m96881p(getPageName(), map);
    }

    private final void clickTrace(String value) {
        HashMap map = new HashMap();
        map.put("click", value);
        C24662i.f75350a.m96881p(getPageName(), map);
    }

    private final void coverClearDialog() {
        try {
            TRDialog.C13786a c13786a = new TRDialog.C13786a();
            String string = getString(R$string.cover_clear_des);
            Intrinsics.m97801g(string, "getString(...)");
            TRDialog.C13786a c13786aM62288g = c13786a.m62288g(string);
            String string2 = getString(R$string.cover_clear_left);
            Intrinsics.m97801g(string2, "getString(...)");
            TRDialog.C13786a c13786aM62286e = c13786aM62288g.m62286e(string2);
            String string3 = getString(R$string.cover_clear_right);
            Intrinsics.m97801g(string3, "getString(...)");
            c13786aM62286e.m62291j(string3).m62289h(R$drawable.btn_bg_dialog_edit_selector).m62284c(R$drawable.btn_bg_dialog_edit_selector).m62290i(AbstractC5789h.m27406a(com.transsion.baseui.R$color.base_color_black)).m62287f(this).m62282a().m62248d0(this, "clear_cover");
        } catch (Exception unused) {
        }
    }

    private final void deleteAudio() {
        OperationBarView operationBarView;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        LinearLayout linearLayout;
        ImageView imageView;
        ImageView imageView2;
        RelativeLayout relativeLayout3;
        RelativeLayout relativeLayout4;
        this.coverPath = null;
        C24458h mViewBinding = getMViewBinding();
        if (mViewBinding != null && (relativeLayout = mViewBinding.f74582o) != null && relativeLayout.getVisibility() == 0) {
            C24458h mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (relativeLayout4 = mViewBinding2.f74582o) != null) {
                relativeLayout4.setVisibility(8);
            }
            if (this.sourceType == 1) {
                C24458h mViewBinding3 = getMViewBinding();
                if (mViewBinding3 != null && (relativeLayout3 = mViewBinding3.f74584q) != null) {
                    relativeLayout3.setVisibility(0);
                }
            } else {
                C24458h mViewBinding4 = getMViewBinding();
                if (mViewBinding4 != null && (relativeLayout2 = mViewBinding4.f74584q) != null) {
                    relativeLayout2.setVisibility(8);
                }
            }
            C24458h mViewBinding5 = getMViewBinding();
            if (mViewBinding5 != null && (imageView2 = mViewBinding5.f74574g) != null) {
                imageView2.setImageResource(0);
            }
            C24458h mViewBinding6 = getMViewBinding();
            if (mViewBinding6 != null && (imageView = mViewBinding6.f74574g) != null) {
                imageView.setBackgroundResource(0);
            }
            C24458h mViewBinding7 = getMViewBinding();
            if (mViewBinding7 != null && (linearLayout = mViewBinding7.f74577j) != null) {
                linearLayout.requestLayout();
            }
        }
        C24458h mViewBinding8 = getMViewBinding();
        if (mViewBinding8 != null && (operationBarView = mViewBinding8.f74580m) != null) {
            operationBarView.resetItem();
        }
        C23889b c23889b = this.operationMenu;
        if (c23889b != null) {
            if ((c23889b != null ? c23889b.m94617a() : null) != null) {
                C17578r c17578r = this.managerAdapter;
                if (c17578r != null) {
                    C23889b c23889b2 = this.operationMenu;
                    AudioEntity audioEntityM94617a = c23889b2 != null ? c23889b2.m94617a() : null;
                    Intrinsics.m97799e(audioEntityM94617a);
                    c17578r.m75321I(audioEntityM94617a);
                }
                this.operationMenu = null;
            }
        }
        C17578r c17578r2 = this.managerAdapter;
        if (c17578r2 != null) {
            c17578r2.m75323u();
        }
    }

    private final void deleteLocation() {
        C23889b c23889b = this.operationMenu;
        if (c23889b != null) {
            if ((c23889b != null ? c23889b.m94623g() : null) != null) {
                C17578r c17578r = this.managerAdapter;
                if (c17578r != null) {
                    C23889b c23889b2 = this.operationMenu;
                    LocationPlace locationPlaceM94623g = c23889b2 != null ? c23889b2.m94623g() : null;
                    Intrinsics.m97799e(locationPlaceM94623g);
                    c17578r.m75321I(locationPlaceM94623g);
                }
                this.locationBean = null;
                this.operationMenu = null;
            }
        }
    }

    private final void detectionSelect(RequestPostEntity request) {
        List<C25890a> listM75324v;
        List<VsMediaInfo> listM75335m;
        List<PhotoEntity> listM75249m;
        OperationBarView operationBarView;
        C24458h mViewBinding = getMViewBinding();
        List<Integer> selectItem = (mViewBinding == null || (operationBarView = mViewBinding.f74580m) == null) ? null : operationBarView.getSelectItem();
        RequestPostMediaEntity requestPostMediaEntity = new RequestPostMediaEntity();
        request.setMedia(requestPostMediaEntity);
        if (selectItem != null) {
            Iterator<T> it = selectItem.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (iIntValue == 0) {
                    requestPostMediaEntity.setMediaType(1);
                    ArrayList arrayList = new ArrayList();
                    C17558g c17558g = this.imageAdapter;
                    if (c17558g != null && (listM75249m = c17558g.m75249m()) != null) {
                        for (PhotoEntity photoEntity : listM75249m) {
                            if (!photoEntity.getIsAdd()) {
                                MediaImageEntity mediaImageEntity = new MediaImageEntity();
                                mediaImageEntity.setUrl(String.valueOf(photoEntity.getLocalPath()));
                                if (photoEntity.getWidth() > 0) {
                                    mediaImageEntity.setWidth(Integer.valueOf(photoEntity.getWidth()));
                                }
                                if (photoEntity.getHeight() > 0) {
                                    mediaImageEntity.setHeight(Integer.valueOf(photoEntity.getHeight()));
                                }
                                if (photoEntity.getImageSize() > 0) {
                                    mediaImageEntity.setSize(Long.valueOf(photoEntity.getImageSize()));
                                }
                                arrayList.add(mediaImageEntity);
                            }
                        }
                    }
                    requestPostMediaEntity.setImage(arrayList);
                } else if (iIntValue == 1) {
                    requestPostMediaEntity.setMediaType(4);
                    requestPostMediaEntity.setVideo(new ArrayList());
                    C17582v c17582v = this.videoAdapter;
                    if (c17582v != null && (listM75335m = c17582v.m75335m()) != null) {
                        for (VsMediaInfo vsMediaInfo : listM75335m) {
                            if (!vsMediaInfo.getIsAdd()) {
                                MediaVideoEntity mediaVideoEntity = new MediaVideoEntity();
                                mediaVideoEntity.setUrl(String.valueOf(vsMediaInfo.getVideoPath()));
                                mediaVideoEntity.setImagePath(vsMediaInfo.getImagePath());
                                if (vsMediaInfo.getWidth() > 0) {
                                    mediaVideoEntity.setWidth(vsMediaInfo.getWidth());
                                }
                                if (vsMediaInfo.getHeight() > 0) {
                                    mediaVideoEntity.setHeight(vsMediaInfo.getHeight());
                                }
                                if (vsMediaInfo.getVideoDuration() > 0) {
                                    mediaVideoEntity.setDuration(vsMediaInfo.getVideoDuration() / ((long) 1000));
                                }
                                mediaVideoEntity.setSize(vsMediaInfo.getVideoSize());
                                mediaVideoEntity.setFps(0);
                                mediaVideoEntity.setBitrate(0);
                                mediaVideoEntity.setDefinition(0);
                                List<MediaVideoEntity> video = requestPostMediaEntity.getVideo();
                                if (video != null) {
                                    video.add(mediaVideoEntity);
                                }
                                checkVideoCover(requestPostMediaEntity, vsMediaInfo);
                            }
                        }
                    }
                } else if (iIntValue == 2) {
                    requestPostMediaEntity.setMediaType(2);
                    requestPostMediaEntity.setAudio(new ArrayList());
                    C17578r c17578r = this.managerAdapter;
                    if (c17578r != null && (listM75324v = c17578r.m75324v()) != null) {
                        for (C25890a c25890a : listM75324v) {
                            if (c25890a instanceof AudioEntity) {
                                MediaAudioEntity mediaAudioEntity = new MediaAudioEntity();
                                AudioEntity audioEntity = (AudioEntity) c25890a;
                                mediaAudioEntity.setUrl(String.valueOf(audioEntity.getLocalPath()));
                                mediaAudioEntity.setSize(audioEntity.getSize());
                                Long duration = audioEntity.getDuration();
                                if ((duration != null ? duration.longValue() : 0L) > 0) {
                                    Long duration2 = audioEntity.getDuration();
                                    mediaAudioEntity.setDuration(duration2 != null ? duration2.longValue() / ((long) 1000) : 0L);
                                }
                                mediaAudioEntity.setBitrate(0L);
                                List<MediaAudioEntity> audio = requestPostMediaEntity.getAudio();
                                if (audio != null) {
                                    audio.add(mediaAudioEntity);
                                }
                            }
                        }
                    }
                    checkCover(requestPostMediaEntity);
                }
            }
        }
    }

    private final void disposeOperate(C23889b it) {
        Integer numM94621e;
        this.operationMenu = it;
        hideOpertaionDialog();
        Integer numM94621e2 = it.m94621e();
        if (numM94621e2 != null && numM94621e2.intValue() == 0) {
            refreshImage(it);
        } else if (numM94621e2 != null && numM94621e2.intValue() == 1) {
            refreshVideo(it);
        } else if (numM94621e2 != null && numM94621e2.intValue() == 2) {
            refreshAudio(it);
        } else if (numM94621e2 != null && numM94621e2.intValue() == 5) {
            refreshCover(it);
        } else if (numM94621e2 != null && numM94621e2.intValue() == 3) {
            refreshWork(it);
        } else if (numM94621e2 != null && numM94621e2.intValue() == 6) {
            refreshGroup(it);
        } else if (numM94621e2 != null && numM94621e2.intValue() == 4) {
            refreshLink(it);
        } else if (numM94621e2 != null && numM94621e2.intValue() == 8) {
            refreshLocation(it);
        }
        Integer numM94621e3 = it.m94621e();
        if (numM94621e3 != null && numM94621e3.intValue() == 5 && (numM94621e = it.m94621e()) != null && numM94621e.intValue() == 6) {
            return;
        }
        checkBottomMargin();
    }

    private final List<PhotoEntity> getAddImageEntity() {
        ArrayList arrayList = new ArrayList();
        PhotoEntity photoEntity = new PhotoEntity();
        photoEntity.setAdd(true);
        arrayList.add(photoEntity);
        return arrayList;
    }

    private final List<VsMediaInfo> getAddVideoEntity() {
        ArrayList arrayList = new ArrayList();
        VsMediaInfo vsMediaInfo = new VsMediaInfo();
        vsMediaInfo.setAdd(true);
        arrayList.add(vsMediaInfo);
        return arrayList;
    }

    private final void getImageIconView() {
        OperationBarView operationBarView;
        RecyclerView recyclerView;
        C24458h mViewBinding = getMViewBinding();
        if (mViewBinding == null || (operationBarView = mViewBinding.f74580m) == null || (recyclerView = operationBarView.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_REWARD_TEMPLATE java.lang.String()) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: com.transsion.publish.ui.l
            @Override // java.lang.Runnable
            public final void run() {
                FilmReviewFragment.getImageIconView$lambda$11(this.f58249a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getImageIconView$lambda$11(FilmReviewFragment filmReviewFragment) {
        OperationBarView operationBarView;
        RecyclerView recyclerView;
        C24458h mViewBinding = filmReviewFragment.getMViewBinding();
        RecyclerView.AbstractC4203b0 abstractC4203b0FindViewHolderForAdapterPosition = (mViewBinding == null || (operationBarView = mViewBinding.f74580m) == null || (recyclerView = operationBarView.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_REWARD_TEMPLATE java.lang.String()) == null) ? null : recyclerView.findViewHolderForAdapterPosition(0);
        if (abstractC4203b0FindViewHolderForAdapterPosition instanceof C27115f) {
            filmReviewFragment.imageIcon = (ImageView) ((C27115f) abstractC4203b0FindViewHolderForAdapterPosition).itemView.findViewById(R$id.image);
        }
    }

    private final InterfaceC23704a getLoginApi() {
        return (InterfaceC23704a) this.loginApi.getValue();
    }

    private final InterfaceC23415f getMRoomApi() {
        return (InterfaceC23415f) this.mRoomApi.getValue();
    }

    private final String getPageName() {
        return PAGE_NAME;
    }

    private final C25896b getPublishModel() {
        return (C25896b) this.publishModel.getValue();
    }

    private final void getVideoIconView() {
        OperationBarView operationBarView;
        RecyclerView recyclerView;
        C24458h mViewBinding = getMViewBinding();
        if (mViewBinding == null || (operationBarView = mViewBinding.f74580m) == null || (recyclerView = operationBarView.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_REWARD_TEMPLATE java.lang.String()) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: com.transsion.publish.ui.k
            @Override // java.lang.Runnable
            public final void run() {
                FilmReviewFragment.getVideoIconView$lambda$10(this.f58247a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getVideoIconView$lambda$10(FilmReviewFragment filmReviewFragment) {
        OperationBarView operationBarView;
        RecyclerView recyclerView;
        C24458h mViewBinding = filmReviewFragment.getMViewBinding();
        RecyclerView.AbstractC4203b0 abstractC4203b0FindViewHolderForAdapterPosition = (mViewBinding == null || (operationBarView = mViewBinding.f74580m) == null || (recyclerView = operationBarView.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_REWARD_TEMPLATE java.lang.String()) == null) ? null : recyclerView.findViewHolderForAdapterPosition(1);
        if (abstractC4203b0FindViewHolderForAdapterPosition instanceof C27115f) {
            filmReviewFragment.videoIcon = (ImageView) ((C27115f) abstractC4203b0FindViewHolderForAdapterPosition).itemView.findViewById(R$id.image);
        }
    }

    private final void hideOpertaionDialog() {
    }

    private final void initImageAdapter() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        if (this.imageAdapter == null) {
            this.imageAdapter = new C17558g();
            C24458h mViewBinding = getMViewBinding();
            if (mViewBinding != null && (recyclerView3 = mViewBinding.f74586s) != null) {
                recyclerView3.setLayoutManager(new NpaGridLayoutManager(getContext(), 3));
            }
            C24458h mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (recyclerView2 = mViewBinding2.f74586s) != null) {
                recyclerView2.addItemDecoration(new C25825b(AbstractC5776a0.m27313a(2.0f), AbstractC5776a0.m27313a(2.0f), 0, AbstractC5776a0.m27313a(8.0f)));
            }
        }
        C24458h mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (recyclerView = mViewBinding3.f74586s) == null) {
            return;
        }
        recyclerView.setAdapter(this.imageAdapter);
    }

    private final void initManagerAdapter() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (this.managerAdapter == null) {
            this.managerAdapter = new C17578r();
            C24458h mViewBinding = getMViewBinding();
            if (mViewBinding != null && (recyclerView2 = mViewBinding.f74585r) != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
            }
            C24458h mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (recyclerView = mViewBinding2.f74585r) == null) {
                return;
            }
            recyclerView.setAdapter(this.managerAdapter);
        }
    }

    private final void initRegisterMediaSelector() {
        if (this.underOS33) {
            return;
        }
        this.videoSelectLauncher = requireActivity().registerForActivityResult(new C23281g(), new InterfaceC0248a() { // from class: com.transsion.publish.ui.t
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                FilmReviewFragment.initRegisterMediaSelector$lambda$31(this.f58274a, (Uri) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRegisterMediaSelector$lambda$31(FilmReviewFragment filmReviewFragment, Uri uri) {
        if (uri != null) {
            C23889b c23889b = new C23889b();
            c23889b.m94631o(1);
            c23889b.m94630n(1);
            VsMediaInfo vsMediaInfo = new VsMediaInfo();
            C26380g c26380g = C26380g.f80125a;
            Context contextRequireContext = filmReviewFragment.requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            C24200a c24200aM102989b = c26380g.m102989b(contextRequireContext, uri);
            if (c24200aM102989b != null) {
                vsMediaInfo.setVideoPath(c24200aM102989b.m95224c());
                vsMediaInfo.setVideoTitle(c24200aM102989b.m95226e());
                vsMediaInfo.setVideoDuration(c24200aM102989b.m95222a());
                vsMediaInfo.setWidth(c24200aM102989b.m95227f());
                vsMediaInfo.setHeight(c24200aM102989b.m95223b());
                vsMediaInfo.setVideoSize(c24200aM102989b.m95225d());
            }
            c23889b.m94637u(vsMediaInfo);
            filmReviewFragment.refreshVideo(c23889b);
            filmReviewFragment.requireActivity().getContentResolver().takePersistableUriPermission(uri, 1);
        }
    }

    private final void initVideoAdapter() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        if (this.videoAdapter == null) {
            this.videoAdapter = new C17582v();
            C24458h mViewBinding = getMViewBinding();
            if (mViewBinding != null && (recyclerView3 = mViewBinding.f74586s) != null) {
                recyclerView3.setLayoutManager(new NpaGridLayoutManager(getContext(), 3));
            }
            C24458h mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (recyclerView2 = mViewBinding2.f74586s) != null) {
                recyclerView2.addItemDecoration(new C25825b(AbstractC5776a0.m27313a(2.0f), AbstractC5776a0.m27313a(2.0f), 0, AbstractC5776a0.m27313a(8.0f)));
            }
        }
        C24458h mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (recyclerView = mViewBinding3.f74586s) == null) {
            return;
        }
        recyclerView.setAdapter(this.videoAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(FilmReviewFragment filmReviewFragment, RatingBar ratingBar, float f11, boolean z11) {
        filmReviewFragment.postStar = (int) f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(FilmReviewFragment filmReviewFragment, View view) {
        SelectImageActivity.Companion companion = SelectImageActivity.INSTANCE;
        Context contextRequireContext = filmReviewFragment.requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        C17558g c17558g = filmReviewFragment.imageAdapter;
        companion.m75501a(contextRequireContext, 5, 1, c17558g != null ? c17558g.m75249m() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(FilmReviewFragment filmReviewFragment, ActivityResult it) {
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() != -1) {
            C26866a.a.m104898f(C26866a.f81698a, "loginStatus", "登录失败或者取消", false, 4, null);
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "loginStatus", "登录成功", false, 4, null);
        C13806h c13806h = C13806h.f49015a;
        InterfaceC23704a loginApi = filmReviewFragment.getLoginApi();
        c13806h.m62325l(loginApi != null ? loginApi.mo90380b() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$6(FilmReviewFragment filmReviewFragment, View view, boolean z11) {
        view.dispatchWindowFocusChanged(z11);
        filmReviewFragment.hasFocus = z11;
        if (z11) {
            filmReviewFragment.hideOpertaionDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$8(final FilmReviewFragment filmReviewFragment, View view, boolean z11) {
        C24458h mViewBinding;
        EditText editText;
        EditText editText2;
        view.dispatchWindowFocusChanged(z11);
        if (z11) {
            filmReviewFragment.hideOpertaionDialog();
            C24458h mViewBinding2 = filmReviewFragment.getMViewBinding();
            if (!TextUtils.isEmpty((mViewBinding2 == null || (editText2 = mViewBinding2.f74570c) == null) ? null : editText2.getText()) || (mViewBinding = filmReviewFragment.getMViewBinding()) == null || (editText = mViewBinding.f74570c) == null) {
                return;
            }
            editText.post(new Runnable() { // from class: com.transsion.publish.ui.v
                @Override // java.lang.Runnable
                public final void run() {
                    FilmReviewFragment.initView$lambda$8$lambda$7(this.f58278a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$8$lambda$7(FilmReviewFragment filmReviewFragment) {
        EditText editText;
        EditText editText2;
        EditText editText3;
        C24458h mViewBinding = filmReviewFragment.getMViewBinding();
        if (mViewBinding != null && (editText3 = mViewBinding.f74570c) != null) {
            editText3.setText("");
        }
        C24458h mViewBinding2 = filmReviewFragment.getMViewBinding();
        if (mViewBinding2 != null && (editText2 = mViewBinding2.f74570c) != null) {
            editText2.setSelection(0);
        }
        C24458h mViewBinding3 = filmReviewFragment.getMViewBinding();
        if (mViewBinding3 == null || (editText = mViewBinding3.f74570c) == null) {
            return;
        }
        editText.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$9(int i11) {
    }

    @SuppressLint({"InflateParams"})
    private final void initViewModel() {
        observe();
    }

    private final boolean isMoreThanADay(long timestamp1, long timestamp2) {
        return timestamp1 - timestamp2 > ((long) MiniAppConfigHelper.DEFAULT_MINI_SCOPE_REQUEST_DIFF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a loginApi_delegate$lambda$1() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23415f mRoomApi_delegate$lambda$0() {
        return (InterfaceC23415f) TheRouter.m61774d(InterfaceC23415f.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mRunnable$lambda$36(FilmReviewFragment filmReviewFragment) {
        EditText editText;
        C24458h mViewBinding = filmReviewFragment.getMViewBinding();
        if (mViewBinding == null || (editText = mViewBinding.f74570c) == null) {
            return;
        }
        editText.clearFocus();
        editText.requestFocus();
        KeyboardUtils.m27135i(editText);
    }

    private final void observe() {
        Function1 function1 = new Function1() { // from class: com.transsion.publish.ui.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FilmReviewFragment.observe$lambda$23(this.f58256a, (C23889b) obj);
            }
        };
        AppScopeVMlProvider appScopeVMlProvider = AppScopeVMlProvider.INSTANCE;
        FlowEventBus flowEventBus = (FlowEventBus) appScopeVMlProvider.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        Lifecycle.State state = Lifecycle.State.CREATED;
        flowEventBus.observeEvent(this, name, state, C25220y0.m99269c().mo98454r(), false, function1);
        Function1 function2 = new Function1() { // from class: com.transsion.publish.ui.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FilmReviewFragment.observe$lambda$24(this.f58259a, (BigImageBean) obj);
            }
        };
        FlowEventBus flowEventBus2 = (FlowEventBus) appScopeVMlProvider.getApplicationScopeViewModel(FlowEventBus.class);
        String name2 = BigImageBean.class.getName();
        Intrinsics.m97801g(name2, "getName(...)");
        flowEventBus2.observeEvent(this, name2, state, C25220y0.m99269c().mo98454r(), false, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observe$lambda$23(FilmReviewFragment filmReviewFragment, C23889b it) {
        Intrinsics.m97802h(it, "it");
        filmReviewFragment.disposeOperate(it);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observe$lambda$24(FilmReviewFragment filmReviewFragment, BigImageBean it) {
        Intrinsics.m97802h(it, "it");
        Integer from = it.getFrom();
        if (from == null || from.intValue() != 2) {
            return Unit.f75682a;
        }
        Integer operator = it.getOperator();
        if (operator != null && operator.intValue() == 1) {
            filmReviewFragment.selectPhotosDispose(it.getSelect());
        }
        return Unit.f75682a;
    }

    private final void openRoomList() {
        Navigator.m61845x(TheRouter.m61773c("/room/list").m61872z("is_select_room", true).m61852F("index", 1), requireContext(), null, 2, null);
    }

    private final void postService(RequestPostEntity request, int source) {
        PublishService.Companion companion = PublishService.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        companion.m75186a(contextRequireContext, request, this.sourceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C25896b publishModel_delegate$lambda$2() {
        return new C25896b();
    }

    private final void refreshAudio(C23889b it) {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        OperationBarView operationBarView;
        Integer numM94620d = it.m94620d();
        if (numM94620d == null || numM94620d.intValue() != 1) {
            if (numM94620d != null && numM94620d.intValue() == 2) {
                if (this.coverPath != null) {
                    coverClearDialog();
                    return;
                } else {
                    deleteAudio();
                    return;
                }
            }
            return;
        }
        if (it.m94617a() == null) {
            return;
        }
        C24458h mViewBinding = getMViewBinding();
        if (mViewBinding != null && (operationBarView = mViewBinding.f74580m) != null) {
            operationBarView.selectItem(2);
        }
        initManagerAdapter();
        AudioEntity audioEntityM94617a = it.m94617a();
        if (audioEntityM94617a != null) {
            audioEntityM94617a.setType(2);
        }
        C17578r c17578r = this.managerAdapter;
        if (c17578r != null) {
            c17578r.m75322J(it.m94617a());
        }
        C24458h mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (relativeLayout3 = mViewBinding2.f74582o) == null || relativeLayout3.getVisibility() != 0) {
            C24458h mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (relativeLayout2 = mViewBinding3.f74582o) != null) {
                relativeLayout2.setVisibility(0);
            }
            C24458h mViewBinding4 = getMViewBinding();
            if (mViewBinding4 == null || (relativeLayout = mViewBinding4.f74584q) == null) {
                return;
            }
            relativeLayout.setVisibility(8);
        }
    }

    private final void refreshCover(C23889b it) {
        ImageView imageView;
        if (it.m94618b() == null) {
            return;
        }
        if (this.coverPath == null) {
            this.coverPath = new CoverEntity();
        }
        CoverEntity coverEntity = this.coverPath;
        if (coverEntity != null) {
            PhotoEntity photoEntityM94618b = it.m94618b();
            coverEntity.setUrl(photoEntityM94618b != null ? photoEntityM94618b.getLocalPath() : null);
        }
        CoverEntity coverEntity2 = this.coverPath;
        if (coverEntity2 != null) {
            PhotoEntity photoEntityM94618b2 = it.m94618b();
            coverEntity2.setSize(photoEntityM94618b2 != null ? Long.valueOf(photoEntityM94618b2.getImageSize()) : null);
        }
        CoverEntity coverEntity3 = this.coverPath;
        if (coverEntity3 != null) {
            PhotoEntity photoEntityM94618b3 = it.m94618b();
            coverEntity3.setWidth(photoEntityM94618b3 != null ? Integer.valueOf(photoEntityM94618b3.getWidth()) : null);
        }
        CoverEntity coverEntity4 = this.coverPath;
        if (coverEntity4 != null) {
            PhotoEntity photoEntityM94618b4 = it.m94618b();
            coverEntity4.setHeight(photoEntityM94618b4 != null ? Integer.valueOf(photoEntityM94618b4.getHeight()) : null);
        }
        C24458h mViewBinding = getMViewBinding();
        if (mViewBinding != null && (imageView = mViewBinding.f74574g) != null) {
            imageView.setVisibility(0);
        }
        C23860f.a aVar = C23860f.f72909a;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        C23860f.b bVarM94457m = aVar.m94457m(contextRequireContext);
        PhotoEntity photoEntityM94618b5 = it.m94618b();
        C23860f.b bVarM94470i = bVarM94457m.m94468g(photoEntityM94618b5 != null ? photoEntityM94618b5.getLocalPath() : null).m94470i(com.transsion.publish.R$color.color_ff999999);
        C24458h mViewBinding2 = getMViewBinding();
        ImageView imageView2 = mViewBinding2 != null ? mViewBinding2.f74574g : null;
        Intrinsics.m97799e(imageView2);
        bVarM94470i.m94465d(imageView2);
    }

    private final void refreshGroup(C23889b it) {
        this.groupBean = it.m94619c();
        Integer numM94620d = it.m94620d();
        if (numM94620d != null && numM94620d.intValue() == 1) {
            GroupBean groupBeanM94619c = it.m94619c();
            if (groupBeanM94619c != null) {
                setGroup(groupBeanM94619c);
            }
        } else if (numM94620d != null && numM94620d.intValue() == 2) {
            C23889b c23889b = this.operationMenu;
            if (c23889b != null) {
                if ((c23889b != null ? c23889b.m94619c() : null) != null) {
                    C17578r c17578r = this.managerAdapter;
                    if (c17578r != null) {
                        C23889b c23889b2 = this.operationMenu;
                        GroupBean groupBeanM94619c2 = c23889b2 != null ? c23889b2.m94619c() : null;
                        Intrinsics.m97799e(groupBeanM94619c2);
                        c17578r.m75321I(groupBeanM94619c2);
                    }
                    this.operationMenu = null;
                }
            }
            this.groupBean = null;
        }
        HashMap map = new HashMap();
        GroupBean groupBean = this.groupBean;
        map.put("group_id", String.valueOf(groupBean != null ? groupBean.getGroupId() : null));
        C24662i.f75350a.m96881p(getPageName(), map);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    private final void refreshImage(C23889b it) {
        C24458h mViewBinding;
        OperationBarView operationBarView;
        C24458h mViewBinding2;
        OperationBarView operationBarView2;
        List listM75248l;
        List listM75248l2;
        PhotoEntity photoEntity;
        List listM75248l3;
        List listM75248l4;
        List listM75248l5;
        Integer numM94620d = it.m94620d();
        int size = 0;
        if (numM94620d != null && numM94620d.intValue() == 1) {
            C17558g c17558g = this.imageAdapter;
            if (c17558g != null && (listM75248l5 = c17558g.m75248l()) != null) {
                size = listM75248l5.size();
            }
            if (size < 9) {
                C17558g c17558g2 = this.imageAdapter;
                if (c17558g2 != null) {
                    List listM94624h = it.m94624h();
                    if (listM94624h == null) {
                        listM94624h = new ArrayList();
                    }
                    listM94624h.addAll(c17558g2.m75248l());
                    it.m94634r(listM94624h);
                }
                selectPhotosDispose(it.m94624h());
            }
        } else {
            Integer numM94620d2 = it.m94620d();
            if (numM94620d2 != null && numM94620d2.intValue() == 2) {
                C17558g c17558g3 = this.imageAdapter;
                if ((c17558g3 == null || (listM75248l4 = c17558g3.m75248l()) == null || listM75248l4.size() != 0) ? false : true) {
                    mViewBinding = getMViewBinding();
                    if (mViewBinding != null && (operationBarView = mViewBinding.f74580m) != null) {
                        operationBarView.resetItem();
                    }
                } else {
                    C17558g c17558g4 = this.imageAdapter;
                    if ((c17558g4 == null || (listM75248l3 = c17558g4.m75248l()) == null || listM75248l3.size() != 1) ? false : true) {
                        C17558g c17558g5 = this.imageAdapter;
                        if ((c17558g5 == null || (listM75248l2 = c17558g5.m75248l()) == null || (photoEntity = (PhotoEntity) listM75248l2.get(0)) == null || !photoEntity.getIsAdd()) ? false : true) {
                            mViewBinding = getMViewBinding();
                            if (mViewBinding != null) {
                                operationBarView.resetItem();
                            }
                        }
                    }
                    C17558g c17558g6 = this.imageAdapter;
                    if (((c17558g6 == null || (listM75248l = c17558g6.m75248l()) == null) ? 0 : listM75248l.size()) < 9 && (mViewBinding2 = getMViewBinding()) != null && (operationBarView2 = mViewBinding2.f74580m) != null) {
                        operationBarView2.selectItem(0);
                    }
                }
            }
        }
        FragmentActivity activity = getActivity();
        Intrinsics.m97800f(activity, "null cannot be cast to non-null type com.transsion.publish.ui.FilmReviewActivity");
        ((FilmReviewActivity) activity).m75409j0(isPostEnable());
    }

    private final void refreshLink(C23889b it) {
        C24458h mViewBinding;
        OperationBarView operationBarView;
        OperationBarView operationBarView2;
        Integer numM94620d = it.m94620d();
        if (numM94620d == null || numM94620d.intValue() != 1) {
            if (numM94620d == null || numM94620d.intValue() != 2 || (mViewBinding = getMViewBinding()) == null || (operationBarView = mViewBinding.f74580m) == null) {
                return;
            }
            operationBarView.resetItem(true);
            return;
        }
        if (it.m94622f() == null) {
            return;
        }
        C24458h mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (operationBarView2 = mViewBinding2.f74580m) != null) {
            operationBarView2.selectItem(4);
        }
        initManagerAdapter();
        C17578r c17578r = this.managerAdapter;
        if (c17578r != null) {
            c17578r.m75322J(it.m94622f());
        }
        LinkEntity linkEntityM94622f = it.m94622f();
        this.linkEntity = new MediaLinkEntity(linkEntityM94622f != null ? linkEntityM94622f.getUrl() : null, linkEntityM94622f != null ? linkEntityM94622f.getTitle() : null, linkEntityM94622f != null ? linkEntityM94622f.getCover() : null);
        LinkEntity linkEntityM94622f2 = it.m94622f();
        if (linkEntityM94622f2 == null || !linkEntityM94622f2.getLoading()) {
            return;
        }
        C13806h.f49015a.m62324k(R$string.postint_state_added);
    }

    private final void refreshLocation(C23889b it) {
        OperationBarView operationBarView;
        this.locationBean = it.m94623g();
        Integer numM94620d = it.m94620d();
        if (numM94620d == null || numM94620d.intValue() != 1) {
            if (numM94620d != null && numM94620d.intValue() == 2) {
                deleteLocation();
                return;
            }
            return;
        }
        if (it.m94623g() == null) {
            return;
        }
        C24458h mViewBinding = getMViewBinding();
        if (mViewBinding != null && (operationBarView = mViewBinding.f74580m) != null) {
            operationBarView.selectItem(8);
        }
        initManagerAdapter();
        LocationPlace locationPlaceM94623g = it.m94623g();
        if (locationPlaceM94623g != null) {
            locationPlaceM94623g.setType(8);
        }
        C17578r c17578r = this.managerAdapter;
        if (c17578r != null) {
            c17578r.m75322J(it.m94623g());
        }
    }

    private final void refreshVideo(C23889b it) {
        OperationBarView operationBarView;
        ImageView imageView;
        List listM75334l;
        OperationBarView operationBarView2;
        Integer numM94620d = it.m94620d();
        if (numM94620d != null && numM94620d.intValue() == 1) {
            if (it.m94626j() == null) {
                return;
            }
            VsMediaInfo vsMediaInfoM94626j = it.m94626j();
            if ((vsMediaInfoM94626j != null ? vsMediaInfoM94626j.getVideoDuration() : 0L) > 600000) {
                C13806h.f49015a.m62325l(getString(R$string.publish_video_limit));
                return;
            }
            initVideoAdapter();
            ArrayList arrayList = new ArrayList();
            VsMediaInfo vsMediaInfoM94626j2 = it.m94626j();
            Intrinsics.m97799e(vsMediaInfoM94626j2);
            arrayList.add(vsMediaInfoM94626j2);
            C17582v c17582v = this.videoAdapter;
            if (c17582v != null) {
                c17582v.setData(arrayList);
            }
            C24458h mViewBinding = getMViewBinding();
            if (mViewBinding != null && (operationBarView2 = mViewBinding.f74580m) != null) {
                operationBarView2.selectItem(1);
            }
            C17582v c17582v2 = this.videoAdapter;
            if (((c17582v2 == null || (listM75334l = c17582v2.m75334l()) == null) ? 0 : listM75334l.size()) >= 1 && (imageView = this.videoIcon) != null) {
                imageView.postDelayed(new Runnable() { // from class: com.transsion.publish.ui.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        FilmReviewFragment.refreshVideo$lambda$27(this.f58263a);
                    }
                }, 200L);
            }
        } else if (numM94620d != null && numM94620d.intValue() == 2) {
            this.coverPath = null;
            C17582v c17582v3 = this.videoAdapter;
            if (c17582v3 != null) {
                c17582v3.m75339t();
            }
            C24458h mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (operationBarView = mViewBinding2.f74580m) != null) {
                operationBarView.resetItem();
            }
        }
        FragmentActivity activity = getActivity();
        Intrinsics.m97800f(activity, "null cannot be cast to non-null type com.transsion.publish.ui.FilmReviewActivity");
        ((FilmReviewActivity) activity).m75409j0(isPostEnable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshVideo$lambda$27(FilmReviewFragment filmReviewFragment) {
        ImageView imageView = filmReviewFragment.videoIcon;
        if (imageView != null) {
            imageView.setImageResource(R$drawable.icon_post_video_unable);
        }
    }

    private final void refreshWork(C23889b it) {
        C17558g c17558g;
        C17582v c17582v;
        C24458h mViewBinding;
        OperationBarView operationBarView;
        String subjectId;
        this.mSubject = it.m94625i();
        Integer numM94620d = it.m94620d();
        if (numM94620d != null && numM94620d.intValue() == 1) {
            Subject subjectM94625i = it.m94625i();
            if (subjectM94625i != null) {
                setSubject(subjectM94625i);
            }
            HashMap map = new HashMap();
            Subject subjectM94625i2 = it.m94625i();
            if (subjectM94625i2 == null || (subjectId = subjectM94625i2.getSubjectId()) == null) {
                subjectId = "";
            }
            map.put("subject_id", subjectId);
            C24662i.f75350a.m96881p(getPageName(), map);
            return;
        }
        if (numM94620d == null || numM94620d.intValue() != 2 || (c17558g = this.imageAdapter) == null || !c17558g.m75250n() || (c17582v = this.videoAdapter) == null || !c17582v.m75336n() || (mViewBinding = getMViewBinding()) == null || (operationBarView = mViewBinding.f74580m) == null) {
            return;
        }
        operationBarView.resetItem();
    }

    private final void requestCurrentLocation() {
        InterfaceC23415f mRoomApi;
        FragmentActivity activity = getActivity();
        if (activity == null || !C5088c.f17563a.m23821f(activity, "android.permission.ACCESS_FINE_LOCATION") || (mRoomApi = getMRoomApi()) == null) {
            return;
        }
        mRoomApi.mo92964b(activity, new Function1() { // from class: com.transsion.publish.ui.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FilmReviewFragment.requestCurrentLocation$lambda$15(this.f58285a, (LocationPlace) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCurrentLocation$lambda$15(FilmReviewFragment filmReviewFragment, LocationPlace locationPlace) {
        String name = locationPlace != null ? locationPlace.getName() : null;
        if (name == null || name.length() == 0) {
            return Unit.f75682a;
        }
        filmReviewFragment.setLocation(locationPlace);
        return Unit.f75682a;
    }

    private final void selectPhotosDispose(List<PhotoEntity> photoEntity) {
        OperationBarView operationBarView;
        ImageView imageView;
        List listM75248l;
        OperationBarView operationBarView2;
        C17558g c17558g;
        List<PhotoEntity> list = photoEntity;
        if (list == null || list.isEmpty()) {
            C17558g c17558g2 = this.imageAdapter;
            if (c17558g2 == null) {
                initImageAdapter();
                return;
            }
            if (c17558g2 != null) {
                c17558g2.m75253u();
            }
            C24458h mViewBinding = getMViewBinding();
            if (mViewBinding == null || (operationBarView = mViewBinding.f74580m) == null) {
                return;
            }
            operationBarView.resetItem();
            return;
        }
        initImageAdapter();
        C17558g c17558g3 = this.imageAdapter;
        if (c17558g3 != null) {
            if (photoEntity == null) {
                photoEntity = new ArrayList<>();
            }
            c17558g3.setData(photoEntity);
        }
        C17558g c17558g4 = this.imageAdapter;
        if ((c17558g4 != null ? c17558g4.getItemCount() : 0) < 9 && (c17558g = this.imageAdapter) != null) {
            c17558g.addData(getAddImageEntity());
        }
        C24458h mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (operationBarView2 = mViewBinding2.f74580m) != null) {
            operationBarView2.selectItem(0);
        }
        C17558g c17558g5 = this.imageAdapter;
        Integer numValueOf = (c17558g5 == null || (listM75248l = c17558g5.m75248l()) == null) ? null : Integer.valueOf(listM75248l.size());
        Intrinsics.m97799e(numValueOf);
        if (numValueOf.intValue() < 9 || (imageView = this.imageIcon) == null) {
            return;
        }
        imageView.postDelayed(new Runnable() { // from class: com.transsion.publish.ui.u
            @Override // java.lang.Runnable
            public final void run() {
                FilmReviewFragment.selectPhotosDispose$lambda$26(this.f58276a);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selectPhotosDispose$lambda$26(FilmReviewFragment filmReviewFragment) {
        ImageView imageView = filmReviewFragment.imageIcon;
        if (imageView != null) {
            imageView.setImageResource(R$drawable.icon_post_select_image_unable);
        }
    }

    private final void setGroup(GroupBean groupBean) {
        if (groupBean == null) {
            return;
        }
        initManagerAdapter();
        groupBean.setType(6);
        C17578r c17578r = this.managerAdapter;
        if (c17578r != null) {
            c17578r.m75322J(groupBean);
        }
    }

    private final void setLocation(LocationPlace location) {
        this.locationBean = location;
        this.curLocationBean = location;
        initManagerAdapter();
        if (location != null) {
            location.setType(8);
        }
        C17578r c17578r = this.managerAdapter;
        if (c17578r != null) {
            c17578r.m75322J(location);
        }
    }

    private final void setStarTips(int text) {
        TextView textView;
        C24458h mViewBinding = getMViewBinding();
        if (mViewBinding == null || (textView = mViewBinding.f74589v) == null) {
            return;
        }
        textView.setText(text);
    }

    private final void setSubject(Subject subject) {
        if (subject == null) {
            return;
        }
        initManagerAdapter();
        subject.setType(3);
        if (this.sourceType == 1) {
            subject.setCorrelation(true);
        }
        C17578r c17578r = this.managerAdapter;
        if (c17578r != null) {
            c17578r.m75322J(subject);
        }
    }

    private final void showActivityTips() {
        BubbleTextView bubbleTextView;
        C24458h mViewBinding = getMViewBinding();
        if (mViewBinding == null || (bubbleTextView = mViewBinding.f74569b) == null) {
            return;
        }
        bubbleTextView.postDelayed(new Runnable() { // from class: com.transsion.publish.ui.r
            @Override // java.lang.Runnable
            public final void run() {
                FilmReviewFragment.showActivityTips$lambda$14(this.f58270a);
            }
        }, 800L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showActivityTips$lambda$14(final FilmReviewFragment filmReviewFragment) {
        OperationBarView operationBarView;
        RecyclerView recyclerView;
        if (filmReviewFragment.isMoreThanADay(System.currentTimeMillis(), C14496b.f50966a.m65344b().getLong("publish_show_guide_time", 0L))) {
            if (filmReviewFragment.groupBean == null && filmReviewFragment.mSubject == null && filmReviewFragment.locationBean != null) {
                return;
            }
            if (filmReviewFragment.mSubject != null || filmReviewFragment.locationBean == null) {
                final CountDownTimerC17610d countDownTimerC17610d = filmReviewFragment.new CountDownTimerC17610d();
                C24458h mViewBinding = filmReviewFragment.getMViewBinding();
                if (mViewBinding == null || (operationBarView = mViewBinding.f74580m) == null || (recyclerView = operationBarView.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_REWARD_TEMPLATE java.lang.String()) == null) {
                    return;
                }
                recyclerView.post(new Runnable() { // from class: com.transsion.publish.ui.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        FilmReviewFragment.showActivityTips$lambda$14$lambda$13(this.f58252a, countDownTimerC17610d);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showActivityTips$lambda$14$lambda$13(FilmReviewFragment filmReviewFragment, CountDownTimerC17610d countDownTimerC17610d) {
        float f11;
        BubbleTextView bubbleTextView;
        OperationBarView operationBarView;
        RecyclerView recyclerView;
        if (!filmReviewFragment.isAdded() || filmReviewFragment.isDetached() || filmReviewFragment.isRemoving()) {
            return;
        }
        String string = filmReviewFragment.getString(R$string.publish_tip_text);
        Intrinsics.m97801g(string, "getString(...)");
        GroupBean groupBean = filmReviewFragment.groupBean;
        int i11 = 3;
        if (groupBean == null && filmReviewFragment.mSubject == null) {
            string = filmReviewFragment.getString(R$string.publish_tip_text);
            Intrinsics.m97801g(string, "getString(...)");
            f11 = 30.0f;
        } else {
            if (filmReviewFragment.mSubject == null) {
                string = filmReviewFragment.getString(R$string.publish_tip_text_no_subject);
                Intrinsics.m97801g(string, "getString(...)");
            } else if (groupBean == null) {
                string = filmReviewFragment.getString(R$string.publish_tip_text_no_group);
                Intrinsics.m97801g(string, "getString(...)");
                i11 = 2;
            } else {
                f11 = 0.0f;
                i11 = 0;
            }
            f11 = 6.0f;
        }
        C24458h mViewBinding = filmReviewFragment.getMViewBinding();
        View childAt = (mViewBinding == null || (operationBarView = mViewBinding.f74580m) == null || (recyclerView = operationBarView.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_REWARD_TEMPLATE java.lang.String()) == null) ? null : recyclerView.getChildAt(i11);
        int[] iArr = new int[2];
        if (childAt != null) {
            childAt.getLocationOnScreen(iArr);
        }
        C24458h mViewBinding2 = filmReviewFragment.getMViewBinding();
        if (mViewBinding2 == null || (bubbleTextView = mViewBinding2.f74569b) == null) {
            return;
        }
        countDownTimerC17610d.start();
        bubbleTextView.setVisibility(0);
        C14496b.f50966a.m65344b().putLong("publish_show_guide_time", System.currentTimeMillis());
        bubbleTextView.setText(string);
        int i12 = iArr[0];
        C27621h c27621h = C27621h.f84745a;
        Context context = bubbleTextView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        bubbleTextView.setArrowPosition(i12 + c27621h.m107451a(context, f11));
    }

    private final void showLinkEditInputDialog(Context context) {
        clickTrace("url");
        DialogC25420b.a aVar = new DialogC25420b.a(context);
        C24458h mViewBinding = getMViewBinding();
        DialogC25420b dialogC25420bM99938a = aVar.m99938a(this, mViewBinding != null ? mViewBinding.f74583p : null);
        dialogC25420bM99938a.show();
        dialogC25420bM99938a.setCancelable(true);
        dialogC25420bM99938a.setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startLocation$lambda$33(Context context, FilmReviewFragment filmReviewFragment, boolean z11) {
        if (z11) {
            Intent intent = new Intent(context, (Class<?>) SelectLocationActivity.class);
            LocationPlace locationPlace = filmReviewFragment.curLocationBean;
            if (locationPlace != null) {
                intent.putExtra("location_data", locationPlace);
            }
            intent.setFlags(ASTNode.DEOP);
            context.startActivity(intent);
        }
        return Unit.f75682a;
    }

    private final void userGrade() {
        C17578r c17578r;
        C17558g c17558g;
        C17582v c17582v;
        RatingBar ratingBar;
        EditText editText;
        Editable text;
        this.publishType = 2;
        C24458h mViewBinding = getMViewBinding();
        Float fValueOf = null;
        if (TextUtils.isEmpty((mViewBinding == null || (editText = mViewBinding.f74570c) == null || (text = editText.getText()) == null) ? null : StringsKt.m98155n1(text)) && (c17578r = this.managerAdapter) != null && c17578r.m75319B() && (((c17558g = this.imageAdapter) == null || (c17558g != null && c17558g.m75250n())) && ((c17582v = this.videoAdapter) == null || (c17582v != null && c17582v.m75336n())))) {
            C24458h mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (ratingBar = mViewBinding2.f74581n) != null) {
                fValueOf = Float.valueOf(ratingBar.getRating());
            }
            Intrinsics.m97799e(fValueOf);
            if (fValueOf.floatValue() > 0.0f && this.coverPath == null) {
                postService(buildRequest(), 2);
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
        }
        if (checkLogin()) {
            postService(buildRequest(), 2);
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    private final void userPost() {
        this.publishType = 1;
        if (checkLogin()) {
            postService(buildRequest(), 1);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public final void checkPost() {
        String strM75325w;
        if (!C27287m.f83003a.m106330e()) {
            C13806h.f49015a.m62324k(com.transsion.baseui.R$string.base_network_fail);
            return;
        }
        clickPostTrace();
        KeyboardUtils.m27130d(requireActivity());
        C17578r c17578r = this.managerAdapter;
        if (c17578r != null && (strM75325w = c17578r.m75325w()) != null) {
            C28465b.f87467a.m109954a().m109953i(1, strM75325w);
        }
        int i11 = this.sourceType;
        if (i11 == 1) {
            userGrade();
        } else {
            if (i11 != 2) {
                return;
            }
            userPost();
        }
    }

    public final void closeAffirm() {
        EditText editText;
        Editable text;
        C24458h mViewBinding = getMViewBinding();
        boolean zIsEmpty = TextUtils.isEmpty((mViewBinding == null || (editText = mViewBinding.f74570c) == null || (text = editText.getText()) == null) ? null : StringsKt.m98155n1(text));
        C17578r c17578r = this.managerAdapter;
        boolean z11 = (c17578r == null || c17578r.m75318A()) ? false : true;
        C17558g c17558g = this.imageAdapter;
        boolean z12 = (c17558g == null || c17558g.m75250n()) ? false : true;
        C17582v c17582v = this.videoAdapter;
        boolean z13 = (c17582v == null || c17582v.m75336n()) ? false : true;
        if (!zIsEmpty || z11 || z12 || z13) {
            backSaveDialog();
            return;
        }
        KeyboardUtils.m27130d(requireActivity());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // kp.DialogC25420b.b
    public void completeLoad() {
        C24458h mViewBinding;
        OperationBarView operationBarView;
        OperationBarView operationBarView2;
        C24458h mViewBinding2 = getMViewBinding();
        if ((mViewBinding2 != null && (operationBarView2 = mViewBinding2.f74580m) != null && operationBarView2.getVisibility() == 0) || (mViewBinding = getMViewBinding()) == null || (operationBarView = mViewBinding.f74580m) == null) {
            return;
        }
        AbstractC26006c.m102058k(operationBarView);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24458h getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24458h c24458hM95971c = C24458h.m95971c(inflater);
        Intrinsics.m97801g(c24458hM95971c, "inflate(...)");
        return c24458hM95971c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, android.graphics.Typeface] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, android.graphics.Typeface] */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        RelativeLayout relativeLayout;
        RatingBar ratingBar;
        TextView textView;
        RatingBar ratingBar2;
        ObservableScrollView observableScrollView;
        EditText editText;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        EditText editText5;
        EditText editText6;
        EditText editText7;
        OperationBarView operationBarView;
        OperationBarView operationBarView2;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        RatingBar ratingBar3;
        TextView textView2;
        Intrinsics.m97802h(view, "view");
        int i11 = this.sourceType;
        if (i11 == 1) {
            C24458h mViewBinding = getMViewBinding();
            if (mViewBinding != null && (ratingBar2 = mViewBinding.f74581n) != null) {
                ratingBar2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: com.transsion.publish.ui.a0
                    @Override // android.widget.RatingBar.OnRatingBarChangeListener
                    public final void onRatingChanged(RatingBar ratingBar4, float f11, boolean z11) {
                        FilmReviewFragment.initView$lambda$3(this.f58222a, ratingBar4, f11, z11);
                    }
                });
            }
            C24458h mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (textView = mViewBinding2.f74588u) != null) {
                textView.setVisibility(0);
            }
            C24458h mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (ratingBar = mViewBinding3.f74581n) != null) {
                ratingBar.setVisibility(0);
            }
            C24458h mViewBinding4 = getMViewBinding();
            if (mViewBinding4 != null && (relativeLayout = mViewBinding4.f74584q) != null) {
                relativeLayout.setVisibility(0);
            }
        } else if (i11 == 2) {
            C24458h mViewBinding5 = getMViewBinding();
            if (mViewBinding5 != null && (textView2 = mViewBinding5.f74588u) != null) {
                textView2.setVisibility(8);
            }
            C24458h mViewBinding6 = getMViewBinding();
            if (mViewBinding6 != null && (ratingBar3 = mViewBinding6.f74581n) != null) {
                ratingBar3.setVisibility(8);
            }
            C24458h mViewBinding7 = getMViewBinding();
            if (mViewBinding7 != null && (relativeLayout3 = mViewBinding7.f74584q) != null) {
                relativeLayout3.setVisibility(8);
            }
            C24458h mViewBinding8 = getMViewBinding();
            if (mViewBinding8 != null && (relativeLayout2 = mViewBinding8.f74582o) != null) {
                relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        FilmReviewFragment.initView$lambda$4(this.f58225a, view2);
                    }
                });
            }
        }
        C24458h mViewBinding9 = getMViewBinding();
        if (mViewBinding9 != null && (operationBarView2 = mViewBinding9.f74580m) != null) {
            operationBarView2.setClickListener(this);
        }
        C24458h mViewBinding10 = getMViewBinding();
        if (mViewBinding10 != null && (operationBarView = mViewBinding10.f74580m) != null) {
            operationBarView.init(this.sourceType, this.groupBean, this.mSubject);
        }
        this.loginLaunch = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.publish.ui.c0
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                FilmReviewFragment.initView$lambda$5(this.f58228a, (ActivityResult) obj);
            }
        });
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C24458h mViewBinding11 = getMViewBinding();
        Typeface typeface = null;
        objectRef.element = Typeface.create((mViewBinding11 == null || (editText7 = mViewBinding11.f74571d) == null) ? null : editText7.getTypeface(), 1);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        C24458h mViewBinding12 = getMViewBinding();
        if (mViewBinding12 != null && (editText6 = mViewBinding12.f74571d) != null) {
            typeface = editText6.getTypeface();
        }
        objectRef2.element = Typeface.create(typeface, 0);
        C24458h mViewBinding13 = getMViewBinding();
        if (mViewBinding13 != null && (editText5 = mViewBinding13.f74571d) != null) {
            editText5.addTextChangedListener(new C17608b(objectRef, objectRef2));
        }
        C24458h mViewBinding14 = getMViewBinding();
        if (mViewBinding14 != null && (editText4 = mViewBinding14.f74571d) != null) {
            editText4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.transsion.publish.ui.d0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z11) {
                    FilmReviewFragment.initView$lambda$6(this.f58230a, view2, z11);
                }
            });
        }
        C24458h mViewBinding15 = getMViewBinding();
        if (mViewBinding15 != null && (editText3 = mViewBinding15.f74570c) != null) {
            editText3.addTextChangedListener(new C17609c());
        }
        C24458h mViewBinding16 = getMViewBinding();
        if (mViewBinding16 != null && (editText2 = mViewBinding16.f74570c) != null) {
            editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.transsion.publish.ui.i
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z11) {
                    FilmReviewFragment.initView$lambda$8(this.f58243a, view2, z11);
                }
            });
        }
        C24458h mViewBinding17 = getMViewBinding();
        if (mViewBinding17 != null && (editText = mViewBinding17.f74570c) != null) {
            editText.postDelayed(this.mRunnable, 500L);
        }
        C24458h mViewBinding18 = getMViewBinding();
        if (mViewBinding18 != null && (observableScrollView = mViewBinding18.f74587t) != null) {
            observableScrollView.setScrollListener(new ObservableScrollView.InterfaceC17702a() { // from class: com.transsion.publish.ui.j
                @Override // com.transsion.publish.view.ObservableScrollView.InterfaceC17702a
                /* JADX INFO: renamed from: a */
                public final void mo75616a(int i12) {
                    FilmReviewFragment.initView$lambda$9(i12);
                }
            });
        }
        requestCurrentLocation();
        showActivityTips();
        getVideoIconView();
        getImageIconView();
    }

    public final boolean isPostEnable() {
        C17582v c17582v;
        C24458h mViewBinding;
        EditText editText;
        Editable text;
        C17558g c17558g = this.imageAdapter;
        return ((c17558g == null || c17558g.m75250n()) && ((c17582v = this.videoAdapter) == null || c17582v.m75336n()) && ((mViewBinding = getMViewBinding()) == null || (editText = mViewBinding.f74570c) == null || (text = editText.getText()) == null || text.length() == 0)) ? false : true;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b(PAGE_NAME, false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C17578r c17578r = this.managerAdapter;
        if (c17578r != null) {
            c17578r.m75323u();
        }
        MMKV mmkvM61551I = MMKV.m61551I("kv_link_record");
        Intrinsics.m97801g(mmkvM61551I, "mmkvWithID(...)");
        mmkvM61551I.putString("link", "");
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "FilmReviewFragment onDestroy", false, 4, null);
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onLeftButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        System.currentTimeMillis();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onRightButtonClick(TRDialog dialog) {
        FragmentActivity activity;
        Intrinsics.m97802h(dialog, "dialog");
        String tag = dialog.getTag();
        if (tag != null) {
            int iHashCode = tag.hashCode();
            if (iHashCode == -1257717947) {
                if (tag.equals("clear_cover")) {
                    deleteAudio();
                }
            } else if (iHashCode == 1335127509 && tag.equals("back_save") && (activity = getActivity()) != null) {
                activity.finish();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C17578r c17578r = this.managerAdapter;
        if (c17578r != null) {
            c17578r.m75320H();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("sourceType", 2)) : null;
        Intrinsics.m97799e(numValueOf);
        this.sourceType = numValueOf.intValue();
        Bundle arguments2 = getArguments();
        Integer numValueOf2 = arguments2 != null ? Integer.valueOf(arguments2.getInt("sourceMode", 0)) : null;
        Intrinsics.m97799e(numValueOf2);
        this.sourceMode = numValueOf2.intValue();
        Bundle arguments3 = getArguments();
        if (arguments3 != null && arguments3.containsKey("subject")) {
            Bundle arguments4 = getArguments();
            Serializable serializable = arguments4 != null ? arguments4.getSerializable("subject") : null;
            if (serializable != null && (serializable instanceof Subject)) {
                this.mSubject = (Subject) serializable;
            }
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null && arguments5.containsKey("group")) {
            Bundle arguments6 = getArguments();
            Serializable serializable2 = arguments6 != null ? arguments6.getSerializable("group") : null;
            if (serializable2 != null && (serializable2 instanceof GroupBean)) {
                this.groupBean = (GroupBean) serializable2;
            }
        }
        super.onViewCreated(view, savedInstanceState);
        initViewModel();
        initRegisterMediaSelector();
        this.showTime = System.currentTimeMillis();
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "FilmReviewFragment onViewCreated", false, 4, null);
    }

    @Override // com.transsion.publish.adapter.InterfaceC17546a
    public void put(Context context) {
        EditText editText;
        Intrinsics.m97802h(context, "context");
        C24458h mViewBinding = getMViewBinding();
        if (mViewBinding == null || (editText = mViewBinding.f74570c) == null) {
            return;
        }
        KeyboardUtils.m27131e(editText);
    }

    @Override // com.transsion.publish.adapter.InterfaceC17546a
    public void startAudio(Context context) {
        Intrinsics.m97802h(context, "context");
        clickTrace(MimeTypes.BASE_TYPE_AUDIO);
        SelectMusicActivity.INSTANCE.m75554a(context);
    }

    @Override // com.transsion.publish.adapter.InterfaceC17546a
    public void startGroup(Context context) {
        Intrinsics.m97802h(context, "context");
        openRoomList();
    }

    @Override // com.transsion.publish.adapter.InterfaceC17546a
    public void startLink(Context context) {
        OperationVerticalBarView operationVerticalBarView;
        EditText editText;
        OperationBarView operationBarView;
        Intrinsics.m97802h(context, "context");
        C24458h mViewBinding = getMViewBinding();
        if (mViewBinding == null || (operationVerticalBarView = mViewBinding.f74579l) == null || operationVerticalBarView.getVisibility() != 0) {
            showLinkEditInputDialog(context);
            return;
        }
        C24458h mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (operationBarView = mViewBinding2.f74580m) != null) {
            AbstractC26006c.m102054g(operationBarView);
        }
        hideOpertaionDialog();
        showLinkEditInputDialog(context);
        C24458h mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (editText = mViewBinding3.f74570c) == null) {
            return;
        }
        editText.postDelayed(new Runnable() { // from class: com.transsion.publish.ui.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f58283a.completeLoad();
            }
        }, 2000L);
    }

    @Override // com.transsion.publish.adapter.InterfaceC17546a
    public void startLocation(final Context context) {
        Intrinsics.m97802h(context, "context");
        FragmentActivity activity = getActivity();
        if (activity == null || !isAdded() || isDetached() || isRemoving()) {
            return;
        }
        if (!C5088c.f17563a.m23821f(activity, "android.permission.ACCESS_FINE_LOCATION")) {
            InterfaceC23415f mRoomApi = getMRoomApi();
            if (mRoomApi != null) {
                mRoomApi.mo92963a(activity, true, new Function1() { // from class: com.transsion.publish.ui.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FilmReviewFragment.startLocation$lambda$33(context, this, ((Boolean) obj).booleanValue());
                    }
                });
                return;
            }
            return;
        }
        Intent intent = new Intent(context, (Class<?>) SelectLocationActivity.class);
        LocationPlace locationPlace = this.curLocationBean;
        if (locationPlace != null) {
            intent.putExtra("location_data", locationPlace);
        }
        intent.setFlags(ASTNode.DEOP);
        context.startActivity(intent);
    }

    @Override // com.transsion.publish.adapter.InterfaceC17546a
    public void startPhoto(Context context) {
        List listM75248l;
        String string;
        List listM75248l2;
        Intrinsics.m97802h(context, "context");
        C17558g c17558g = this.imageAdapter;
        if (((c17558g == null || (listM75248l2 = c17558g.m75248l()) == null) ? 0 : listM75248l2.size()) < 9) {
            clickTrace("image");
            SelectImageActivity.Companion companion = SelectImageActivity.INSTANCE;
            C17558g c17558g2 = this.imageAdapter;
            companion.m75501a(context, 0, 9 - ((c17558g2 == null || (listM75248l = c17558g2.m75248l()) == null) ? 0 : listM75248l.size()), new ArrayList());
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || (string = activity.getString(R$string.add_img_max_tips)) == null) {
            string = "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
        String str = String.format(string, Arrays.copyOf(new Object[]{9}, 1));
        Intrinsics.m97801g(str, "format(...)");
        C13806h.f49015a.m62325l(str);
    }

    @Override // com.transsion.publish.adapter.InterfaceC17546a
    public void startVideo(Context context) {
        String string;
        List listM75334l;
        Intrinsics.m97802h(context, "context");
        C17582v c17582v = this.videoAdapter;
        if (((c17582v == null || (listM75334l = c17582v.m75334l()) == null) ? 0 : listM75334l.size()) >= 1) {
            FragmentActivity activity = getActivity();
            if (activity == null || (string = activity.getString(R$string.add_video_max_tips)) == null) {
                string = "";
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str = String.format(string, Arrays.copyOf(new Object[]{1}, 1));
            Intrinsics.m97801g(str, "format(...)");
            C13806h.f49015a.m62325l(str);
            return;
        }
        clickTrace("vidio");
        if (this.underOS33) {
            Intent intent = new Intent(context, (Class<?>) SelectVideoActivity.class);
            intent.setFlags(ASTNode.DEOP);
            startActivity(intent);
        } else {
            AbstractC0249b abstractC0249b = this.videoSelectLauncher;
            if (abstractC0249b != null) {
                abstractC0249b.m999a(AbstractC0253f.m1018b(C23281g.e.f70833a, 0, false, null, 14, null));
            }
        }
    }

    @Override // com.transsion.publish.adapter.InterfaceC17546a
    public void startWork(Context context) {
        Intrinsics.m97802h(context, "context");
        clickTrace("choose a subject");
        InterfaceC0118b interfaceC0118b = (InterfaceC0118b) C0117a.f402a.m550a(InterfaceC0118b.class);
        if (interfaceC0118b != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            interfaceC0118b.mo555e(contextRequireContext);
        }
    }
}
