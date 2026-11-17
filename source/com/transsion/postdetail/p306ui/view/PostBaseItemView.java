package com.transsion.postdetail.p306ui.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5110g;
import com.blankj.utilcode.util.AbstractC5780c0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.noober.background.view.BLConstraintLayout;
import com.noober.background.view.BLLinearLayout;
import com.noober.background.view.BLTextView;
import com.p282tn.lib.view.NoScrollRecyclerView2;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.p282tn.lib.widget.R$drawable;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14566l;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.bean.CommentBean;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.FirstFrame;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Stat;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.bean.CommentLikeBody;
import com.transsion.postdetail.helper.NegativeFeedbackHelper;
import com.transsion.postdetail.p306ui.adapter.RoomPostContentImageAdapter;
import com.transsion.postdetail.util.AbstractC17443m;
import com.transsion.postdetail.video.PostFeedVideoView;
import com.transsion.postdetail.viewmodel.CommentViewModel;
import com.transsion.web.api.WebConstants;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import mg.C25824a;
import mn.C25891b;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p550kj.C24662i;
import p743rh.C27287m;
import p844vo.C28176u;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b$\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010\u0013J\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\u0013J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010\u0013J+\u0010&\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0#H\u0002¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\u00020\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0#2\b\u0010)\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020\f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0#2\b\u0010)\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b-\u0010+J'\u0010/\u001a\u00020\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0#2\b\u0010)\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b/\u0010+J'\u00101\u001a\u00020\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0#2\b\u0010)\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b1\u0010+J\u001d\u00103\u001a\u00020\f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\f0#H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\fH\u0014¢\u0006\u0004\b5\u0010\u000eJ\u0011\u00107\u001a\u0004\u0018\u000106H\u0004¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\f2\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J!\u0010?\u001a\u00020\f2\b\u0010=\u001a\u0004\u0018\u00010\u001c2\b\u0010>\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bA\u0010\u0013J\u0015\u0010D\u001a\u00020\f2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ!\u0010H\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\u00020\f2\u0006\u0010J\u001a\u00020F2\u0006\u0010K\u001a\u00020FH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bN\u0010\u0013J\u0015\u0010Q\u001a\u00020\f2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\u0097\u0001\u0010T\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0#2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\f0#2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\f0#2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0#2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0#2\u000e\b\u0002\u0010S\u001a\b\u0012\u0004\u0012\u00020\f0#2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0#2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0#¢\u0006\u0004\bT\u0010UJ'\u0010V\u001a\u00020\f2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\f0#2\b\u0010)\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\bV\u0010+J\r\u0010W\u001a\u00020\f¢\u0006\u0004\bW\u0010\u000eJ\u0015\u0010Y\u001a\u00020\f2\u0006\u0010X\u001a\u00020F¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b[\u0010\u0013J\u001d\u0010]\u001a\u00020\f2\u0006\u0010\\\u001a\u00020F2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b_\u0010\u0013J\u0017\u0010`\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b`\u0010\u0013R\u001a\u0010d\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\ba\u0010\u001e\u001a\u0004\bb\u0010cR\u001a\u0010g\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\be\u0010\u001e\u001a\u0004\bf\u0010cR\u001a\u0010j\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bh\u0010\u001e\u001a\u0004\bi\u0010cR\u0014\u0010l\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010\u001eR\u0014\u0010n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010\u001eR\u0014\u0010p\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010\u001eR\u001a\u0010v\u001a\u00020q8\u0004X\u0084\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010{\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010X\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R(\u0010=\u001a\u0004\u0018\u00010\u001c8\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R)\u0010>\u001a\u0004\u0018\u00010\u001c8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\b\u0084\u0001\u0010\u007f\u001a\u0006\b\u0085\u0001\u0010\u0081\u0001\"\u0006\b\u0086\u0001\u0010\u0083\u0001R\u001a\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u007fR\u001a\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u007fR0\u0010\u0090\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0005\b\u008f\u0001\u00104R0\u0010\u0094\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u008c\u0001\u001a\u0006\b\u0092\u0001\u0010\u008e\u0001\"\u0005\b\u0093\u0001\u00104¨\u0006\u0095\u0001"}, m97100d2 = {"Lcom/transsion/postdetail/ui/view/PostBaseItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "res", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "G", "()V", "V", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", WebConstants.FIELD_ITEM, "setBottomDownLoadStatus", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "setPostContent", "setPostContentDes", "setHotComment", "Lcom/transsion/moviedetailapi/bean/CommentBean;", "hotComment", "F", "(Lcom/transsion/moviedetailapi/bean/CommentBean;Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "H", "", "moduleName", "I", "(Ljava/lang/String;Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "setBottomBarContent", "setPostImage", "setPostVideo", "Lkotlin/Function0;", "onCLickHeader", "onClickNegativeFeedback", "c0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onCLickGroup", "postSubjectItem", "i0", "(Lkotlin/jvm/functions/Function0;Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "onCLickSubject", "m0", "onCLickLike", "g0", "onCLickComment", "Y", "onCLickShare", "k0", "(Lkotlin/jvm/functions/Function0;)V", "onAttachedToWindow", "Landroidx/fragment/app/FragmentActivity;", "E", "()Landroidx/fragment/app/FragmentActivity;", "Lcom/transsion/postdetail/viewmodel/CommentViewModel;", "viewModel", "setCommentViewModel", "(Lcom/transsion/postdetail/viewmodel/CommentViewModel;)V", "pageName", "pageFrom", "setPage", "(Ljava/lang/String;Ljava/lang/String;)V", "setData", "Landroidx/recyclerview/widget/RecyclerView$s;", "rvPool", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$s;)V", "", "showDistance", "setHeaderPostData", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;Z)V", "isShowSubject", "isShowRoom", "setBottomSubjectAndRoomVisibility", "(ZZ)V", "setBottomSubjectModuleData", "", "count", "setCommentCount", "(J)V", "onClickDownload", "setBottomBarClick", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "a0", "setContentMaxLine", "isDetail", "setIsDetail", "(Z)V", "setBottomRoomModuleData", "like", "refreshLike", "(ZLcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "setHeaderData", "setSubjectAndRoomContent", "a", "getDp36", "()I", "dp36", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "getDp16", "dp16", "c", "getDp32", "dp32", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "rootWidth", "e", "dp78", "f", "dp280", "Lvo/u;", "g", "Lvo/u;", "getViewBinding", "()Lvo/u;", "viewBinding", "h", "Landroidx/recyclerview/widget/RecyclerView$s;", "i", "Lcom/transsion/postdetail/viewmodel/CommentViewModel;", "mCommentViewModel", "j", "Z", CampaignEx.JSON_KEY_AD_K, "Ljava/lang/String;", "getPageName", "()Ljava/lang/String;", "setPageName", "(Ljava/lang/String;)V", "l", "getPageFrom", "setPageFrom", "m", "mPostId", "n", "mAuthorId", "o", "Lkotlin/jvm/functions/Function0;", "getOnNegativeFeedbackSuccess", "()Lkotlin/jvm/functions/Function0;", "setOnNegativeFeedbackSuccess", "onNegativeFeedbackSuccess", TtmlNode.TAG_P, "getOnNegativeFeedbackClick", "setOnNegativeFeedbackClick", "onNegativeFeedbackClick", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class PostBaseItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int dp36;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int dp16;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int dp32;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int rootWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int dp78;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int dp280;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C28176u viewBinding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private RecyclerView.C4220s rvPool;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private CommentViewModel mCommentViewModel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isDetail;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String mPostId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String mAuthorId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private Function0 onNegativeFeedbackSuccess;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function0 onNegativeFeedbackClick;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.PostBaseItemView$a */
    public static final class C17330a extends DiffUtil.AbstractC4174e {
        C17330a() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(Image oldItem, Image newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getUrl(), newItem.getUrl());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(Image oldItem, Image newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getUrl(), newItem.getUrl());
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.PostBaseItemView$setBottomRoomModuleData$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.view.PostBaseItemView$setBottomRoomModuleData$1", m97637f = "PostBaseItemView.kt", m97638l = {793}, m97639m = "invokeSuspend")
    static final class C173311 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ PostSubjectItem $item;
        int label;
        final /* synthetic */ PostBaseItemView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173311(PostSubjectItem postSubjectItem, PostBaseItemView postBaseItemView, Continuation<? super C173311> continuation) {
            super(2, continuation);
            this.$item = postSubjectItem;
            this.this$0 = postBaseItemView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C173311(this.$item, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C173311) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Group group;
            Cover cover;
            String url;
            AssetManager assets;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                Group group2 = this.$item.getGroup();
                if ((group2 == null || group2.getAvatar() == null) && (group = this.$item.getGroup()) != null && (cover = group.getCover()) != null && (url = cover.getUrl()) != null) {
                    PostBaseItemView postBaseItemView = this.this$0;
                    Context context = postBaseItemView.getContext();
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream((context == null || (assets = context.getAssets()) == null) ? null : assets.open(url));
                    AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
                    PostBaseItemView$setBottomRoomModuleData$1$1$1 postBaseItemView$setBottomRoomModuleData$1$1$1 = new PostBaseItemView$setBottomRoomModuleData$1$1$1(postBaseItemView, bitmapDecodeStream, null);
                    this.label = 1;
                    if (AbstractC25088i.m98910g(abstractC24917a2M99269c, postBaseItemView$setBottomRoomModuleData$1$1$1, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            Unit unit = Unit.f75682a;
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.PostBaseItemView$setBottomSubjectModuleData$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.view.PostBaseItemView$setBottomSubjectModuleData$1", m97637f = "PostBaseItemView.kt", m97638l = {649}, m97639m = "invokeSuspend")
    static final class C173321 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ PostSubjectItem $item;
        int label;
        final /* synthetic */ PostBaseItemView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173321(PostSubjectItem postSubjectItem, PostBaseItemView postBaseItemView, Continuation<? super C173321> continuation) {
            super(2, continuation);
            this.$item = postSubjectItem;
            this.this$0 = postBaseItemView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C173321(this.$item, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C173321) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Cover cover;
            String url;
            AssetManager assets;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                Subject subject = this.$item.getSubject();
                if (subject != null && (cover = subject.getCover()) != null && (url = cover.getUrl()) != null) {
                    PostBaseItemView postBaseItemView = this.this$0;
                    Context context = postBaseItemView.getContext();
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream((context == null || (assets = context.getAssets()) == null) ? null : assets.open(url));
                    AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
                    PostBaseItemView$setBottomSubjectModuleData$1$1$1 postBaseItemView$setBottomSubjectModuleData$1$1$1 = new PostBaseItemView$setBottomSubjectModuleData$1$1$1(postBaseItemView, bitmapDecodeStream, null);
                    this.label = 1;
                    if (AbstractC25088i.m98910g(abstractC24917a2M99269c, postBaseItemView$setBottomSubjectModuleData$1$1$1, this) == objF) {
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

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.PostBaseItemView$setHeaderPostData$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.view.PostBaseItemView$setHeaderPostData$1", m97637f = "PostBaseItemView.kt", m97638l = {571}, m97639m = "invokeSuspend")
    static final class C173331 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ PostSubjectItem $item;
        int label;
        final /* synthetic */ PostBaseItemView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173331(PostSubjectItem postSubjectItem, PostBaseItemView postBaseItemView, Continuation<? super C173331> continuation) {
            super(2, continuation);
            this.$item = postSubjectItem;
            this.this$0 = postBaseItemView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C173331(this.$item, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C173331) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String avatar;
            AssetManager assets;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                User user = this.$item.getUser();
                if (user != null && (avatar = user.getAvatar()) != null) {
                    PostBaseItemView postBaseItemView = this.this$0;
                    Context context = postBaseItemView.getContext();
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream((context == null || (assets = context.getAssets()) == null) ? null : assets.open(avatar));
                    AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
                    PostBaseItemView$setHeaderPostData$1$1$1 postBaseItemView$setHeaderPostData$1$1$1 = new PostBaseItemView$setHeaderPostData$1$1$1(postBaseItemView, bitmapDecodeStream, null);
                    this.label = 1;
                    if (AbstractC25088i.m98910g(abstractC24917a2M99269c, postBaseItemView$setHeaderPostData$1$1$1, this) == objF) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostBaseItemView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostBaseItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostBaseItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.dp36 = AbstractC23384a.m92908b(36);
        this.dp16 = AbstractC23384a.m92908b(16);
        this.dp32 = AbstractC23384a.m92908b(32);
        Context context2 = getContext();
        Intrinsics.m97801g(context2, "getContext(...)");
        this.rootWidth = AbstractC14556b.m65670a(context2) ? AbstractC23384a.m92908b(300) : AbstractC5806y.m27489e() - AbstractC23384a.m92908b(72);
        this.dp78 = AbstractC23384a.m92908b(78);
        this.dp280 = AbstractC23384a.m92908b(280);
        View.inflate(getContext(), R$layout.item_provider_room_post_base_layout, this);
        setPadding(0, 0, 0, AbstractC23384a.m92908b(4));
        C28176u c28176uM109381a = C28176u.m109381a(this);
        Intrinsics.m97801g(c28176uM109381a, "bind(...)");
        this.viewBinding = c28176uM109381a;
    }

    /* JADX INFO: renamed from: F */
    private final void m74712F(CommentBean hotComment, PostSubjectItem item) {
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.base_net_err);
            return;
        }
        Boolean likeStatu = hotComment.getLikeStatu();
        Boolean bool = Boolean.TRUE;
        boolean zM97797c = Intrinsics.m97797c(likeStatu, bool);
        AppCompatImageView appCompatImageView = this.viewBinding.f86640h;
        if (appCompatImageView != null) {
            if (appCompatImageView.isEnabled()) {
                appCompatImageView.setEnabled(false);
                hotComment.setLikeStatu(Boolean.FALSE);
                if (hotComment.getLikeCnt() > 0) {
                    hotComment.setLikeCnt(hotComment.getLikeCnt() - 1);
                }
            } else {
                appCompatImageView.setEnabled(true);
                hotComment.setLikeStatu(bool);
                hotComment.setLikeCnt(hotComment.getLikeCnt() + 1);
            }
        }
        AppCompatTextView appCompatTextView = this.viewBinding.f86652t;
        if (appCompatTextView != null) {
            appCompatTextView.setText(hotComment.getLikeCnt() == 0 ? "" : AbstractC14564j.m65680a(hotComment.getLikeCnt()));
        }
        String commentId = hotComment.getCommentId();
        if (commentId != null) {
            if (this.mCommentViewModel == null) {
                m74713G();
            }
            CommentLikeBody commentLikeBody = new CommentLikeBody(commentId, Integer.valueOf(zM97797c ? 1 : 0));
            m74715I(zM97797c ? "dislike_hot_comment" : "like_hot_comment", item);
            C25891b c25891b = new C25891b(!zM97797c, commentId, hotComment.getLikeCnt());
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C25891b.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c25891b, 0L);
            CommentViewModel commentViewModel = this.mCommentViewModel;
            if (commentViewModel != null) {
                commentViewModel.m74996q(commentLikeBody);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c A[PHI: r0
      0x001c: PHI (r0v4 androidx.lifecycle.y0) = (r0v3 androidx.lifecycle.y0), (r0v8 androidx.lifecycle.y0) binds: [B:9:0x0012, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: G */
    private final void m74713G() {
        InterfaceC3233y0 interfaceC3233y0;
        if (this.mCommentViewModel != null) {
            return;
        }
        Object context = getContext();
        InterfaceC3233y0 interfaceC3233y0M74765E = context instanceof InterfaceC3233y0 ? (InterfaceC3233y0) context : null;
        if (interfaceC3233y0M74765E == null) {
            interfaceC3233y0M74765E = m74765E();
            interfaceC3233y0 = interfaceC3233y0M74765E instanceof InterfaceC3233y0 ? interfaceC3233y0M74765E : null;
        }
        if (interfaceC3233y0 != null) {
            this.mCommentViewModel = (CommentViewModel) new C3227v0(interfaceC3233y0).m14969a(CommentViewModel.class);
        }
    }

    /* JADX INFO: renamed from: H */
    private final void m74714H(PostSubjectItem item) {
        String userId;
        String groupId;
        String subjectId;
        String string;
        String value;
        Integer subjectType;
        String postId = item.getPostId();
        if (postId == null) {
            postId = "";
        }
        Pair pairM97108a = TuplesKt.m97108a("post_id", postId);
        Pair pairM97108a2 = TuplesKt.m97108a(WebConstants.PAGE_FROM, this.pageFrom);
        Pair pairM97108a3 = TuplesKt.m97108a("module_name", "hot_comment");
        Pair pairM97108a4 = TuplesKt.m97108a("is_cache_post", String.valueOf(item.isRoomCache()));
        User user = item.getUser();
        if (user == null || (userId = user.getUserId()) == null) {
            userId = "";
        }
        Pair pairM97108a5 = TuplesKt.m97108a("user_id", userId);
        Group group = item.getGroup();
        if (group == null || (groupId = group.getGroupId()) == null) {
            groupId = "";
        }
        Pair pairM97108a6 = TuplesKt.m97108a("group_id", groupId);
        Subject subject = item.getSubject();
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            subjectId = "";
        }
        Pair pairM97108a7 = TuplesKt.m97108a("subject_id", subjectId);
        Subject subject2 = item.getSubject();
        if (subject2 == null || (subjectType = subject2.getSubjectType()) == null || (string = subjectType.toString()) == null) {
            string = "";
        }
        Pair pairM97108a8 = TuplesKt.m97108a("subject_type", string);
        Pair pairM97108a9 = TuplesKt.m97108a("builtin", item.getBuiltIn() ? "1" : "0");
        Media media = item.getMedia();
        if (media == null || (value = media.getMediaType()) == null) {
            value = MediaType.TEXT.getValue();
        }
        Pair pairM97108a10 = TuplesKt.m97108a("post_media_type", value);
        String ops = item.getOps();
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, pairM97108a8, pairM97108a9, pairM97108a10, TuplesKt.m97108a("ops", ops != null ? ops : ""));
        String str = this.pageName;
        if (str != null) {
            C24662i.f75350a.m96872D(str, mapM);
        }
    }

    /* JADX INFO: renamed from: I */
    private final void m74715I(String moduleName, PostSubjectItem item) {
        String commentId;
        String value;
        String groupId;
        HashMap map = new HashMap();
        map.put("module_name", moduleName);
        CommentBean hotComment = item.getHotComment();
        String str = "";
        if (hotComment == null || (commentId = hotComment.getCommentId()) == null) {
            commentId = "";
        }
        map.put("comment_id", commentId);
        String postId = item.getPostId();
        if (postId == null) {
            postId = "";
        }
        map.put("post_id", postId);
        String ops = item.getOps();
        if (ops == null) {
            ops = "";
        }
        map.put("ops", ops);
        Group group = item.getGroup();
        if (group != null && (groupId = group.getGroupId()) != null) {
            str = groupId;
        }
        map.put("group_id", str);
        Media media = item.getMedia();
        if (media == null || (value = media.getMediaType()) == null) {
            value = MediaType.TEXT.getValue();
        }
        map.put("post_media_type", value);
        String str2 = this.pageFrom;
        if (str2 != null && str2.length() != 0) {
            String str3 = this.pageFrom;
            Intrinsics.m97799e(str3);
            map.put(WebConstants.PAGE_FROM, str3);
        }
        String str4 = this.pageName;
        if (str4 != null) {
            C14450a.f50860a.m65146i(str4, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final Unit m74716J() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final Unit m74717K() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final Unit m74718L() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final Unit m74719M() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final Unit m74720N() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final Unit m74721O() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final Unit m74722P() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final Unit m74723Q() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m74724R(PostBaseItemView postBaseItemView, CommentBean commentBean, PostSubjectItem postSubjectItem, View view) {
        postBaseItemView.m74712F(commentBean, postSubjectItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final Unit m74725S(CommentBean commentBean, PostBaseItemView postBaseItemView, C25891b value) {
        Intrinsics.m97802h(value, "value");
        if (Intrinsics.m97797c(value.m101689a(), commentBean.getCommentId())) {
            C26866a.a.m104905r(C26866a.f81698a, "hotCommentLikeEvent", new String[]{"commentId=" + value.m101689a()}, false, 4, null);
            commentBean.setLikeStatu(Boolean.valueOf(value.m101691c()));
            commentBean.setLikeCnt(value.m101690b());
            AppCompatTextView appCompatTextView = postBaseItemView.viewBinding.f86652t;
            if (appCompatTextView != null) {
                appCompatTextView.setText(value.m101690b() == 0 ? "" : AbstractC14564j.m65680a(value.m101690b()));
            }
            AppCompatImageView appCompatImageView = postBaseItemView.viewBinding.f86640h;
            if (appCompatImageView != null) {
                appCompatImageView.setEnabled(value.m101691c());
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final void m74726T(PostBaseItemView postBaseItemView, String str) {
        AppCompatTextView appCompatTextView = postBaseItemView.viewBinding.f86654v;
        Intrinsics.m97799e(appCompatTextView);
        AbstractC14566l.m65693h(appCompatTextView, str, 3, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final void m74727U(PostSubjectItem postSubjectItem, PostBaseItemView postBaseItemView, boolean z11) {
        FirstFrame firstFrame;
        String url;
        String thumbnail;
        Cover cover;
        Media media = postSubjectItem.getMedia();
        if (media == null || (firstFrame = media.getFirstFrame()) == null || (url = firstFrame.getUrl()) == null) {
            return;
        }
        if (postSubjectItem.getBuiltIn()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new PostBaseItemView$setPostVideo$2$1$1(postBaseItemView, url, null), 3, null);
            return;
        }
        C23860f.a aVar = C23860f.f72909a;
        Context context = postBaseItemView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        C23860f.b bVarM94474m = aVar.m94457m(context).m94468g(url).m94464c(z11 ? AbstractC23384a.m92908b(280) : AbstractC23384a.m92908b(162)).m94474m(z11 ? AbstractC23384a.m92908b(Sdk$SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE) : AbstractC23384a.m92908b(280));
        Media media2 = postSubjectItem.getMedia();
        if (media2 == null || (cover = media2.getCover()) == null || (thumbnail = cover.getThumbnail()) == null) {
            thumbnail = "";
        }
        C23860f.b bVarM94473l = bVarM94474m.m94473l(thumbnail);
        ShapeableImageView ivCover = postBaseItemView.viewBinding.f86648p.f86419d;
        Intrinsics.m97801g(ivCover, "ivCover");
        bVarM94473l.m94465d(ivCover);
    }

    /* JADX INFO: renamed from: V */
    private final void m74728V() {
        AppCompatImageView appCompatImageView = this.viewBinding.f86642j;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.w0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PostBaseItemView.m74729W(this.f57788a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final void m74729W(final PostBaseItemView postBaseItemView, View view) {
        FragmentActivity fragmentActivityM74765E;
        String str;
        if (C14557c.f51100a.m65671a(view.getId(), 500L) || (fragmentActivityM74765E = postBaseItemView.m74765E()) == null || (str = postBaseItemView.mPostId) == null) {
            return;
        }
        String str2 = postBaseItemView.mAuthorId;
        String str3 = str2 == null ? "" : str2;
        Function0 function0 = postBaseItemView.onNegativeFeedbackClick;
        if (function0 != null) {
            function0.invoke();
        }
        NegativeFeedbackHelper negativeFeedbackHelper = NegativeFeedbackHelper.f56361a;
        LifecycleCoroutineScope lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(fragmentActivityM74765E);
        String str4 = postBaseItemView.pageName;
        if (str4 == null) {
            str4 = "";
        }
        negativeFeedbackHelper.m73022k(str, str3, fragmentActivityM74765E, lifecycleCoroutineScopeM14968a, str4, new Function0() { // from class: com.transsion.postdetail.ui.view.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostBaseItemView.m74730X(this.f57777a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final Unit m74730X(PostBaseItemView postBaseItemView) {
        Function0 function0 = postBaseItemView.onNegativeFeedbackSuccess;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: Y */
    private final void m74731Y(final Function0 onCLickComment, PostSubjectItem postSubjectItem) {
        this.viewBinding.f86627E.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostBaseItemView.m74732Z(onCLickComment, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m74732Z(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final void m74733b0(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: c0 */
    private final void m74734c0(final Function0 onCLickHeader, Function0 onClickNegativeFeedback) {
        this.viewBinding.f86658z.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostBaseItemView.m74735d0(onCLickHeader, view);
            }
        });
        this.viewBinding.f86637e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostBaseItemView.m74736e0(onCLickHeader, view);
            }
        });
        this.viewBinding.f86655w.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostBaseItemView.m74737f0(onCLickHeader, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final void m74735d0(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m74736e0(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m74737f0(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: g0 */
    private final void m74738g0(final Function0 onCLickLike, PostSubjectItem postSubjectItem) {
        this.viewBinding.f86629G.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostBaseItemView.m74740h0(onCLickLike, view);
            }
        });
        if (postSubjectItem != null) {
            setBottomBarContent(postSubjectItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m74740h0(Function0 function0, View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: renamed from: i0 */
    private final void m74742i0(final Function0 onCLickGroup, PostSubjectItem postSubjectItem) {
        this.viewBinding.f86647o.f86391f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostBaseItemView.m74744j0(onCLickGroup, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m74744j0(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: k0 */
    private final void m74746k0(final Function0 onCLickShare) {
        View view;
        C28176u c28176u = this.viewBinding;
        if (c28176u == null || (view = c28176u.f86630H) == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PostBaseItemView.m74748l0(onCLickShare, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m74748l0(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: m0 */
    private final void m74750m0(final Function0 onCLickSubject, PostSubjectItem postSubjectItem) {
        this.viewBinding.f86647o.f86387b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostBaseItemView.m74752n0(onCLickSubject, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m74752n0(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setBottomBarClick$default(PostBaseItemView postBaseItemView, PostSubjectItem postSubjectItem, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, Function0 function6, Function0 function7, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBottomBarClick");
        }
        postBaseItemView.setBottomBarClick(postSubjectItem, (i11 & 2) != 0 ? new Function0() { // from class: com.transsion.postdetail.ui.view.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostBaseItemView.m74716J();
            }
        } : function0, (i11 & 4) != 0 ? new Function0() { // from class: com.transsion.postdetail.ui.view.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostBaseItemView.m74717K();
            }
        } : function1, (i11 & 8) != 0 ? new Function0() { // from class: com.transsion.postdetail.ui.view.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostBaseItemView.m74718L();
            }
        } : function2, (i11 & 16) != 0 ? new Function0() { // from class: com.transsion.postdetail.ui.view.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostBaseItemView.m74719M();
            }
        } : function3, (i11 & 32) != 0 ? new Function0() { // from class: com.transsion.postdetail.ui.view.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostBaseItemView.m74720N();
            }
        } : function4, (i11 & 64) != 0 ? new Function0() { // from class: com.transsion.postdetail.ui.view.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostBaseItemView.m74721O();
            }
        } : function5, (i11 & 128) != 0 ? new Function0() { // from class: com.transsion.postdetail.ui.view.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostBaseItemView.m74722P();
            }
        } : function6, (i11 & 256) != 0 ? new Function0() { // from class: com.transsion.postdetail.ui.view.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostBaseItemView.m74723Q();
            }
        } : function7);
    }

    private final void setBottomBarContent(PostSubjectItem item) {
        AppCompatTextView appCompatTextView = this.viewBinding.f86656x;
        Stat stat = item.getStat();
        Long likeCount = stat != null ? stat.getLikeCount() : null;
        String strM65680a = "";
        appCompatTextView.setText((likeCount == null || likeCount.longValue() == 0) ? "" : AbstractC14564j.m65680a(likeCount.longValue()));
        if (Intrinsics.m97797c(item.getHasLike(), Boolean.TRUE)) {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(R$drawable.ic_post_like_select, 0, 0, 0);
        } else {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(R$drawable.ic_post_like, 0, 0, 0);
        }
        Stat stat2 = item.getStat();
        Long commentCount = stat2 != null ? stat2.getCommentCount() : null;
        this.viewBinding.f86653u.setText((commentCount == null || commentCount.longValue() == 0) ? "" : AbstractC14564j.m65680a(commentCount.longValue()));
        Stat stat3 = item.getStat();
        Long shareCount = stat3 != null ? stat3.getShareCount() : null;
        AppCompatTextView appCompatTextView2 = this.viewBinding.f86657y;
        if (appCompatTextView2 != null) {
            if (shareCount != null && shareCount.longValue() != 0) {
                strM65680a = AbstractC14564j.m65680a(shareCount.longValue());
            }
            appCompatTextView2.setText(strM65680a);
        }
    }

    private final void setBottomDownLoadStatus(PostSubjectItem item) {
        Media media = item.getMedia();
        if (!Intrinsics.m97797c(media != null ? media.getMediaType() : null, MediaType.VIDEO.getValue())) {
            Media media2 = item.getMedia();
            if (!Intrinsics.m97797c(media2 != null ? media2.getMediaType() : null, MediaType.IMAGE.getValue())) {
                Media media3 = item.getMedia();
                if (!Intrinsics.m97797c(media3 != null ? media3.getMediaType() : null, MediaType.IMAGE_SINGLE.getValue())) {
                    View view = this.viewBinding.f86628F;
                    if (view != null) {
                        AbstractC26006c.m102054g(view);
                    }
                    AppCompatImageView appCompatImageView = this.viewBinding.f86643k;
                    if (appCompatImageView != null) {
                        AbstractC26006c.m102054g(appCompatImageView);
                        return;
                    }
                    return;
                }
            }
        }
        View view2 = this.viewBinding.f86628F;
        if (view2 != null) {
            AbstractC26006c.m102058k(view2);
        }
        AppCompatImageView appCompatImageView2 = this.viewBinding.f86643k;
        if (appCompatImageView2 != null) {
            AbstractC26006c.m102058k(appCompatImageView2);
        }
    }

    public static /* synthetic */ void setHeaderPostData$default(PostBaseItemView postBaseItemView, PostSubjectItem postSubjectItem, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeaderPostData");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        postBaseItemView.setHeaderPostData(postSubjectItem, z11);
    }

    private final void setHotComment(final PostSubjectItem item) {
        String url;
        ShapeableImageView shapeableImageView;
        final CommentBean hotComment = item.getHotComment();
        String content = hotComment != null ? hotComment.getContent() : null;
        if (content == null || content.length() == 0 || (this instanceof PostDetailItemView)) {
            BLConstraintLayout bLConstraintLayout = this.viewBinding.f86634b;
            if (bLConstraintLayout != null) {
                AbstractC26006c.m102054g(bLConstraintLayout);
                return;
            }
            return;
        }
        m74714H(item);
        BLConstraintLayout bLConstraintLayout2 = this.viewBinding.f86634b;
        if (bLConstraintLayout2 != null) {
            AbstractC26006c.m102058k(bLConstraintLayout2);
        }
        AppCompatTextView appCompatTextView = this.viewBinding.f86650r;
        if (appCompatTextView != null) {
            appCompatTextView.setText(content);
        }
        String avatarUrl = hotComment.getAvatarUrl();
        if (avatarUrl == null) {
            avatarUrl = "";
        }
        if (avatarUrl.length() > 0 && (shapeableImageView = this.viewBinding.f86638f) != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            aVar.m94457m(context).m94468g(avatarUrl).m94474m(AbstractC23384a.m92908b(20)).m94464c(AbstractC23384a.m92908b(20)).m94465d(shapeableImageView);
        }
        List<Cover> imageList = hotComment.getImageList();
        if (imageList == null || imageList.isEmpty()) {
            ShapeableImageView shapeableImageView2 = this.viewBinding.f86635c;
            if (shapeableImageView2 != null) {
                AbstractC26006c.m102054g(shapeableImageView2);
            }
        } else {
            ShapeableImageView shapeableImageView3 = this.viewBinding.f86635c;
            if (shapeableImageView3 != null) {
                shapeableImageView3.setVisibility(0);
                C23860f.a aVar2 = C23860f.f72909a;
                Context context2 = shapeableImageView3.getContext();
                Intrinsics.m97801g(context2, "getContext(...)");
                C23860f.b bVarM94457m = aVar2.m94457m(context2);
                List<Cover> imageList2 = hotComment.getImageList();
                Intrinsics.m97799e(imageList2);
                Cover cover = imageList2.get(0);
                if (cover == null || (url = cover.getUrl()) == null) {
                    url = "";
                }
                bVarM94457m.m94468g(url).m94474m(AbstractC23384a.m92908b(20)).m94464c(AbstractC23384a.m92908b(20)).m94465d(shapeableImageView3);
            }
        }
        AppCompatTextView appCompatTextView2 = this.viewBinding.f86652t;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(hotComment.getLikeCnt() != 0 ? AbstractC14564j.m65680a(hotComment.getLikeCnt()) : "");
        }
        AppCompatImageView appCompatImageView = this.viewBinding.f86640h;
        if (appCompatImageView != null) {
            appCompatImageView.setEnabled(Intrinsics.m97797c(hotComment.getLikeStatu(), Boolean.TRUE));
        }
        View view = this.viewBinding.f86625C;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.x0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PostBaseItemView.m74724R(this.f57791a, hotComment, item, view2);
                }
            });
        }
        Context context3 = getContext();
        Intrinsics.m97800f(context3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.view.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostBaseItemView.m74725S(hotComment, this, (C25891b) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C25891b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent((AppCompatActivity) context3, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    private final void setPostContent(PostSubjectItem item) {
        List<Image> image;
        setPostContentDes(item);
        Media media = item.getMedia();
        String mediaType = media != null ? media.getMediaType() : null;
        if (Intrinsics.m97797c(mediaType, MediaType.TEXT.getValue())) {
            FrameLayout flContent = this.viewBinding.f86636d;
            Intrinsics.m97801g(flContent, "flContent");
            AbstractC26006c.m102054g(flContent);
        } else if (Intrinsics.m97797c(mediaType, MediaType.IMAGE.getValue())) {
            FrameLayout flContent2 = this.viewBinding.f86636d;
            Intrinsics.m97801g(flContent2, "flContent");
            Media media2 = item.getMedia();
            flContent2.setVisibility(((media2 == null || (image = media2.getImage()) == null) ? 0 : image.size()) > 0 ? 0 : 8);
            setPostImage(item);
        } else if (Intrinsics.m97797c(mediaType, MediaType.AUDIO.getValue())) {
            FrameLayout flContent3 = this.viewBinding.f86636d;
            Intrinsics.m97801g(flContent3, "flContent");
            AbstractC26006c.m102054g(flContent3);
        } else if (Intrinsics.m97797c(mediaType, MediaType.VIDEO.getValue())) {
            FrameLayout flContent4 = this.viewBinding.f86636d;
            Intrinsics.m97801g(flContent4, "flContent");
            AbstractC26006c.m102058k(flContent4);
            setPostVideo(item);
        } else {
            FrameLayout flContent5 = this.viewBinding.f86636d;
            Intrinsics.m97801g(flContent5, "flContent");
            AbstractC26006c.m102054g(flContent5);
        }
        setHotComment(item);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[PHI: r4
      0x0018: PHI (r4v11 java.lang.String) = (r4v3 java.lang.String), (r4v12 java.lang.String) binds: [B:17:0x002b, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    private final void setPostContentDes(PostSubjectItem item) {
        String title;
        String content = item.getContent();
        final String str = "";
        if (content == null || content.length() == 0) {
            String title2 = item.getTitle();
            if (title2 == null || title2.length() == 0) {
                AppCompatTextView tvPostContent = this.viewBinding.f86654v;
                Intrinsics.m97801g(tvPostContent, "tvPostContent");
                AbstractC26006c.m102054g(tvPostContent);
                return;
            } else {
                title = item.getTitle();
                if (title != null) {
                    str = title;
                }
            }
        } else {
            title = item.getContent();
            if (title != null) {
                str = title;
            }
        }
        AppCompatTextView tvPostContent2 = this.viewBinding.f86654v;
        Intrinsics.m97801g(tvPostContent2, "tvPostContent");
        AbstractC26006c.m102058k(tvPostContent2);
        if (!this.isDetail) {
            this.viewBinding.f86654v.post(new Runnable() { // from class: com.transsion.postdetail.ui.view.r0
                @Override // java.lang.Runnable
                public final void run() {
                    PostBaseItemView.m74726T(this.f57772a, str);
                }
            });
            return;
        }
        AppCompatTextView appCompatTextView = this.viewBinding.f86654v;
        Intrinsics.m97799e(appCompatTextView);
        AbstractC14566l.m65690e(appCompatTextView, str, null);
    }

    private final void setPostImage(PostSubjectItem item) {
        List<Image> image;
        List<Image> image2;
        Media media = item.getMedia();
        int size = (media == null || (image2 = media.getImage()) == null) ? 0 : image2.size();
        CardView flVideo = this.viewBinding.f86648p.f86418c;
        Intrinsics.m97801g(flVideo, "flVideo");
        AbstractC26006c.m102054g(flVideo);
        if (size == 0) {
            NoScrollRecyclerView2 recyclerViewPost = this.viewBinding.f86649q;
            Intrinsics.m97801g(recyclerViewPost, "recyclerViewPost");
            AbstractC26006c.m102054g(recyclerViewPost);
            return;
        }
        NoScrollRecyclerView2 recyclerViewPost2 = this.viewBinding.f86649q;
        Intrinsics.m97801g(recyclerViewPost2, "recyclerViewPost");
        AbstractC26006c.m102058k(recyclerViewPost2);
        int i11 = 1;
        if (size != 1) {
            i11 = 2;
            if (size != 2 && size != 4) {
                i11 = 3;
            }
        }
        Media media2 = item.getMedia();
        if (media2 == null || (image = media2.getImage()) == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        RoomPostContentImageAdapter roomPostContentImageAdapter = new RoomPostContentImageAdapter(i11, AbstractC14556b.m65670a(context), this.pageName, this.pageFrom, item);
        roomPostContentImageAdapter.m36158R0(new C17330a());
        NoScrollRecyclerView2 noScrollRecyclerView2 = this.viewBinding.f86649q;
        RecyclerView.C4220s c4220s = this.rvPool;
        if (c4220s != null) {
            noScrollRecyclerView2.setRecycledViewPool(c4220s);
        }
        noScrollRecyclerView2.setLayoutManager(new NpaGridLayoutManager(noScrollRecyclerView2.getContext(), i11));
        if (noScrollRecyclerView2.getItemDecorationCount() == 0) {
            noScrollRecyclerView2.addItemDecoration(new C25824a(AbstractC23384a.m92908b(3), AbstractC23384a.m92908b(3), 0, 0));
        }
        noScrollRecyclerView2.setAdapter(roomPostContentImageAdapter);
        roomPostContentImageAdapter.mo36201n1(image);
    }

    private final void setPostVideo(final PostSubjectItem item) {
        int i11;
        Video video;
        Integer duration;
        List<Video> video2;
        Video video3;
        Integer height;
        FirstFrame firstFrame;
        Integer height2;
        Cover cover;
        Integer height3;
        List<Video> video4;
        Video video5;
        Integer width;
        FirstFrame firstFrame2;
        Integer width2;
        Cover cover2;
        Integer width3;
        NoScrollRecyclerView2 recyclerViewPost = this.viewBinding.f86649q;
        Intrinsics.m97801g(recyclerViewPost, "recyclerViewPost");
        AbstractC26006c.m102054g(recyclerViewPost);
        CardView flVideo = this.viewBinding.f86648p.f86418c;
        Intrinsics.m97801g(flVideo, "flVideo");
        AbstractC26006c.m102058k(flVideo);
        ShapeableImageView ivCover = this.viewBinding.f86648p.f86419d;
        Intrinsics.m97801g(ivCover, "ivCover");
        AbstractC26006c.m102058k(ivCover);
        BLTextView tvVideoDuration = this.viewBinding.f86648p.f86421f;
        Intrinsics.m97801g(tvVideoDuration, "tvVideoDuration");
        AbstractC26006c.m102058k(tvVideoDuration);
        AppCompatImageView ivVideoPlay = this.viewBinding.f86648p.f86420e;
        Intrinsics.m97801g(ivVideoPlay, "ivVideoPlay");
        AbstractC26006c.m102058k(ivVideoPlay);
        FrameLayout flPlayer = this.viewBinding.f86648p.f86417b;
        Intrinsics.m97801g(flPlayer, "flPlayer");
        int iIntValue = 0;
        if (flPlayer.getChildCount() != 0) {
            View childAt = this.viewBinding.f86648p.f86417b.getChildAt(0);
            PostFeedVideoView postFeedVideoView = childAt instanceof PostFeedVideoView ? (PostFeedVideoView) childAt : null;
            if (postFeedVideoView != null) {
                postFeedVideoView.removePlayer();
            }
        }
        Media media = item.getMedia();
        int iIntValue2 = (media == null || (cover2 = media.getCover()) == null || (width3 = cover2.getWidth()) == null) ? 0 : width3.intValue();
        Media media2 = item.getMedia();
        int iIntValue3 = (media2 == null || (firstFrame2 = media2.getFirstFrame()) == null || (width2 = firstFrame2.getWidth()) == null) ? 0 : width2.intValue();
        Media media3 = item.getMedia();
        int iIntValue4 = (media3 == null || (video4 = media3.getVideo()) == null || (video5 = (Video) CollectionsKt.m97361k0(video4)) == null || (width = video5.getWidth()) == null) ? 0 : width.intValue();
        if (iIntValue2 > 0) {
            i11 = iIntValue2;
        } else if (iIntValue3 > 0) {
            i11 = iIntValue3;
        } else {
            i11 = iIntValue4 > 0 ? iIntValue4 : 0;
        }
        Media media4 = item.getMedia();
        int iIntValue5 = (media4 == null || (cover = media4.getCover()) == null || (height3 = cover.getHeight()) == null) ? 0 : height3.intValue();
        Media media5 = item.getMedia();
        int iIntValue6 = (media5 == null || (firstFrame = media5.getFirstFrame()) == null || (height2 = firstFrame.getHeight()) == null) ? 0 : height2.intValue();
        Media media6 = item.getMedia();
        int iIntValue7 = (media6 == null || (video2 = media6.getVideo()) == null || (video3 = (Video) CollectionsKt.m97361k0(video2)) == null || (height = video3.getHeight()) == null) ? 0 : height.intValue();
        if (iIntValue2 <= 0) {
            if (iIntValue3 > 0) {
                iIntValue5 = iIntValue6;
            } else {
                iIntValue5 = iIntValue4 > 0 ? iIntValue7 : 0;
            }
        }
        final boolean z11 = iIntValue5 > i11;
        ViewGroup.LayoutParams layoutParams = this.viewBinding.f86648p.f86418c.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int iM92908b = i11 / iIntValue5 < 1 ? this.rootWidth - AbstractC23384a.m92908b(38) : this.rootWidth;
        marginLayoutParams.width = iM92908b;
        int i12 = (iIntValue5 * iM92908b) / i11;
        if (i12 > (iM92908b * 36) / 26) {
            i12 = (iM92908b * 36) / 26;
        }
        marginLayoutParams.height = i12;
        this.viewBinding.f86648p.f86418c.setLayoutParams(marginLayoutParams);
        this.viewBinding.f86648p.f86418c.post(new Runnable() { // from class: com.transsion.postdetail.ui.view.m0
            @Override // java.lang.Runnable
            public final void run() {
                PostBaseItemView.m74727U(item, this, z11);
            }
        });
        BLTextView bLTextView = this.viewBinding.f86648p.f86421f;
        Media media7 = item.getMedia();
        List<Video> video6 = media7 != null ? media7.getVideo() : null;
        if ((video6 != null ? video6.size() : 0) <= 0) {
            Intrinsics.m97799e(bLTextView);
            AbstractC26006c.m102054g(bLTextView);
            return;
        }
        if (video6 != null && (video = video6.get(0)) != null && (duration = video.getDuration()) != null) {
            iIntValue = duration.intValue();
        }
        if (iIntValue <= 0) {
            Intrinsics.m97799e(bLTextView);
            AbstractC26006c.m102054g(bLTextView);
        } else {
            bLTextView.setText(TimeUtilKt.m65664p(iIntValue));
            Intrinsics.m97799e(bLTextView);
            AbstractC26006c.m102058k(bLTextView);
        }
    }

    /* JADX INFO: renamed from: E */
    protected final FragmentActivity m74765E() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof FragmentActivity) {
                return (FragmentActivity) context;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    protected void m74766a0(final Function0 onClickDownload, PostSubjectItem postSubjectItem) {
        Intrinsics.m97802h(onClickDownload, "onClickDownload");
        View view = this.viewBinding.f86628F;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PostBaseItemView.m74733b0(onClickDownload, view2);
                }
            });
        }
    }

    protected final int getDp16() {
        return this.dp16;
    }

    protected final int getDp32() {
        return this.dp32;
    }

    protected final int getDp36() {
        return this.dp36;
    }

    public final Function0<Unit> getOnNegativeFeedbackClick() {
        return this.onNegativeFeedbackClick;
    }

    public final Function0<Unit> getOnNegativeFeedbackSuccess() {
        return this.onNegativeFeedbackSuccess;
    }

    protected final String getPageFrom() {
        return this.pageFrom;
    }

    protected final String getPageName() {
        return this.pageName;
    }

    protected final C28176u getViewBinding() {
        return this.viewBinding;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m74713G();
    }

    public final void refreshLike(boolean like, PostSubjectItem item) {
        Intrinsics.m97802h(item, "item");
        AppCompatTextView appCompatTextView = this.viewBinding.f86656x;
        Stat stat = item.getStat();
        Long likeCount = stat != null ? stat.getLikeCount() : null;
        appCompatTextView.setText((likeCount == null || likeCount.longValue() == 0) ? "" : AbstractC14564j.m65680a(likeCount.longValue()));
        if (like) {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(R$drawable.ic_post_like_select, 0, 0, 0);
        } else {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(R$drawable.ic_post_like, 0, 0, 0);
        }
    }

    public final void setBottomBarClick(PostSubjectItem postSubjectItem, Function0<Unit> onCLickLike, Function0<Unit> onCLickComment, Function0<Unit> onCLickShare, Function0<Unit> onCLickSubject, Function0<Unit> onCLickGroup, Function0<Unit> onClickDownload, Function0<Unit> onCLickHeader, Function0<Unit> onClickNegativeFeedback) {
        Intrinsics.m97802h(onCLickLike, "onCLickLike");
        Intrinsics.m97802h(onCLickComment, "onCLickComment");
        Intrinsics.m97802h(onCLickShare, "onCLickShare");
        Intrinsics.m97802h(onCLickSubject, "onCLickSubject");
        Intrinsics.m97802h(onCLickGroup, "onCLickGroup");
        Intrinsics.m97802h(onClickDownload, "onClickDownload");
        Intrinsics.m97802h(onCLickHeader, "onCLickHeader");
        Intrinsics.m97802h(onClickNegativeFeedback, "onClickNegativeFeedback");
        m74738g0(onCLickLike, postSubjectItem);
        m74731Y(onCLickComment, postSubjectItem);
        m74746k0(onCLickShare);
        m74766a0(onClickDownload, postSubjectItem);
        m74750m0(onCLickSubject, postSubjectItem);
        m74742i0(onCLickGroup, postSubjectItem);
        m74734c0(onCLickHeader, onClickNegativeFeedback);
    }

    public void setBottomRoomModuleData(PostSubjectItem item) {
        String avatar;
        Cover cover;
        Intrinsics.m97802h(item, "item");
        AppCompatTextView appCompatTextView = this.viewBinding.f86647o.f86392g;
        Group group = item.getGroup();
        String url = null;
        appCompatTextView.setText(group != null ? group.getName() : null);
        if (item.getBuiltIn()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new C173311(item, this, null), 3, null);
            return;
        }
        C23860f.a aVar = C23860f.f72909a;
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        C23860f.b bVarM94457m = aVar.m94457m(context);
        Group group2 = item.getGroup();
        if (group2 == null || (avatar = group2.getAvatar()) == null) {
            Group group3 = item.getGroup();
            if (group3 != null && (cover = group3.getCover()) != null) {
                url = cover.getUrl();
            }
            avatar = url == null ? "" : url;
        }
        C23860f.b bVarM94464c = bVarM94457m.m94468g(avatar).m94474m(this.dp32).m94464c(this.dp32);
        ShapeableImageView ivRoomCover = this.viewBinding.f86647o.f86388c;
        Intrinsics.m97801g(ivRoomCover, "ivRoomCover");
        bVarM94464c.m94465d(ivRoomCover);
    }

    public void setBottomSubjectAndRoomVisibility(boolean isShowSubject, boolean isShowRoom) {
        if (C5110g.f17601a.m23911b()) {
            BLLinearLayout bLLinearLayoutM109295b = this.viewBinding.f86647o.getRoot();
            Intrinsics.m97801g(bLLinearLayoutM109295b, "getRoot(...)");
            bLLinearLayoutM109295b.setVisibility(isShowRoom ? 0 : 8);
            ConstraintLayout clSubjectContent = this.viewBinding.f86647o.f86387b;
            Intrinsics.m97801g(clSubjectContent, "clSubjectContent");
            AbstractC26006c.m102054g(clSubjectContent);
            View vSubjectRoomLine = this.viewBinding.f86647o.f86398m;
            Intrinsics.m97801g(vSubjectRoomLine, "vSubjectRoomLine");
            AbstractC26006c.m102054g(vSubjectRoomLine);
            LinearLayout llRoomTag = this.viewBinding.f86647o.f86391f;
            Intrinsics.m97801g(llRoomTag, "llRoomTag");
            llRoomTag.setVisibility(isShowRoom ? 0 : 8);
            return;
        }
        if (isShowSubject) {
            BLLinearLayout bLLinearLayoutM109295b2 = this.viewBinding.f86647o.getRoot();
            Intrinsics.m97801g(bLLinearLayoutM109295b2, "getRoot(...)");
            AbstractC26006c.m102058k(bLLinearLayoutM109295b2);
            ConstraintLayout clSubjectContent2 = this.viewBinding.f86647o.f86387b;
            Intrinsics.m97801g(clSubjectContent2, "clSubjectContent");
            AbstractC26006c.m102058k(clSubjectContent2);
            View vSubjectRoomLine2 = this.viewBinding.f86647o.f86398m;
            Intrinsics.m97801g(vSubjectRoomLine2, "vSubjectRoomLine");
            vSubjectRoomLine2.setVisibility(isShowRoom ? 0 : 8);
            LinearLayout llRoomTag2 = this.viewBinding.f86647o.f86391f;
            Intrinsics.m97801g(llRoomTag2, "llRoomTag");
            llRoomTag2.setVisibility(isShowRoom ? 0 : 8);
            return;
        }
        BLLinearLayout bLLinearLayoutM109295b3 = this.viewBinding.f86647o.getRoot();
        Intrinsics.m97801g(bLLinearLayoutM109295b3, "getRoot(...)");
        bLLinearLayoutM109295b3.setVisibility(isShowRoom ? 0 : 8);
        ConstraintLayout clSubjectContent3 = this.viewBinding.f86647o.f86387b;
        Intrinsics.m97801g(clSubjectContent3, "clSubjectContent");
        AbstractC26006c.m102054g(clSubjectContent3);
        View vSubjectRoomLine3 = this.viewBinding.f86647o.f86398m;
        Intrinsics.m97801g(vSubjectRoomLine3, "vSubjectRoomLine");
        AbstractC26006c.m102054g(vSubjectRoomLine3);
        LinearLayout llRoomTag3 = this.viewBinding.f86647o.f86391f;
        Intrinsics.m97801g(llRoomTag3, "llRoomTag");
        llRoomTag3.setVisibility(isShowRoom ? 0 : 8);
    }

    public void setBottomSubjectModuleData(PostSubjectItem item) {
        String url;
        String thumbnail;
        Cover cover;
        Cover cover2;
        String title;
        Subject subject;
        String genre;
        List listS0;
        String str;
        Intrinsics.m97802h(item, "item");
        String str2 = "";
        if (item.getBuiltIn()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new C173321(item, this, null), 3, null);
        } else {
            C23860f.a aVar = C23860f.f72909a;
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            Subject subject2 = item.getSubject();
            if (subject2 == null || (cover2 = subject2.getCover()) == null || (url = cover2.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94464c = bVarM94457m.m94468g(url).m94474m(this.dp32).m94464c(this.dp32);
            Subject subject3 = item.getSubject();
            if (subject3 == null || (cover = subject3.getCover()) == null || (thumbnail = cover.getThumbnail()) == null) {
                thumbnail = "";
            }
            C23860f.b bVarM94473l = bVarM94464c.m94473l(thumbnail);
            ShapeableImageView ivSubjectCover = this.viewBinding.f86647o.f86389d;
            Intrinsics.m97801g(ivSubjectCover, "ivSubjectCover");
            bVarM94473l.m94465d(ivSubjectCover);
        }
        AppCompatTextView appCompatTextView = this.viewBinding.f86647o.f86395j;
        Subject subject4 = item.getSubject();
        if (subject4 == null || (title = subject4.getTitle()) == null) {
            title = "";
        }
        appCompatTextView.setText(title);
        Subject subject5 = item.getSubject();
        this.viewBinding.f86647o.f86390e.setImageResource(AbstractC16247h.m71009a(subject5 != null ? subject5.getSubjectType() : null));
        Subject subject6 = item.getSubject();
        Date dateM27346l = AbstractC5780c0.m27346l(subject6 != null ? subject6.getReleaseDate() : null, "yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateM27346l);
        this.viewBinding.f86647o.f86393h.setText(String.valueOf(calendar.get(1)));
        Subject subject7 = item.getSubject();
        String genre2 = subject7 != null ? subject7.getGenre() : null;
        if (genre2 != null && genre2.length() != 0 && (subject = item.getSubject()) != null && (genre = subject.getGenre()) != null && (listS0 = StringsKt.m98117S0(genre, new String[]{", "}, false, 0, 6, null)) != null && (str = (String) CollectionsKt.m97361k0(listS0)) != null) {
            str2 = str;
        }
        AppCompatTextView tvSubjectGenre = this.viewBinding.f86647o.f86394i;
        Intrinsics.m97801g(tvSubjectGenre, "tvSubjectGenre");
        tvSubjectGenre.setVisibility(str2.length() > 0 ? 0 : 8);
        AppCompatTextView tvSubjectGenre2 = this.viewBinding.f86647o.f86394i;
        Intrinsics.m97801g(tvSubjectGenre2, "tvSubjectGenre");
        tvSubjectGenre2.setVisibility(str2.length() > 0 ? 0 : 8);
        this.viewBinding.f86647o.f86394i.setText(str2);
    }

    public final void setCommentCount(long count) {
        AppCompatTextView appCompatTextView;
        C28176u c28176u = this.viewBinding;
        if (c28176u == null || (appCompatTextView = c28176u.f86653u) == null) {
            return;
        }
        appCompatTextView.setText(count == 0 ? "" : AbstractC14564j.m65680a(count));
    }

    public final void setCommentViewModel(CommentViewModel viewModel) {
        this.mCommentViewModel = viewModel;
    }

    public final void setContentMaxLine() {
        this.viewBinding.f86654v.setMaxLines(Integer.MAX_VALUE);
    }

    public final void setData(PostSubjectItem item) {
        Intrinsics.m97802h(item, "item");
        this.mPostId = item.getPostId();
        User user = item.getUser();
        this.mAuthorId = user != null ? user.getUserId() : null;
        setBottomDownLoadStatus(item);
        setHeaderData(item);
        setPostContent(item);
        setSubjectAndRoomContent(item);
        setBottomBarContent(item);
        m74728V();
    }

    public abstract void setHeaderData(PostSubjectItem item);

    public void setHeaderPostData(PostSubjectItem item, boolean showDistance) {
        String avatar;
        String poiName;
        Long lX;
        String nickname;
        Intrinsics.m97802h(item, "item");
        String str = "";
        if (item.getBuiltIn()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new C173331(item, this, null), 3, null);
        } else {
            C23860f.a aVar = C23860f.f72909a;
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            User user = item.getUser();
            if (user == null || (avatar = user.getAvatar()) == null) {
                avatar = "";
            }
            C23860f.b bVarM94464c = bVarM94457m.m94468g(avatar).m94474m(this.dp16).m94464c(this.dp16);
            ShapeableImageView ivUserAvatar2 = this.viewBinding.f86646n;
            Intrinsics.m97801g(ivUserAvatar2, "ivUserAvatar2");
            bVarM94464c.m94465d(ivUserAvatar2);
        }
        AppCompatTextView appCompatTextView = this.viewBinding.f86658z;
        User user2 = item.getUser();
        if (user2 != null && (nickname = user2.getNickname()) != null) {
            str = nickname;
        }
        appCompatTextView.setText(str);
        AppCompatTextView appCompatTextView2 = this.viewBinding.f86655w;
        String createdAt = item.getCreatedAt();
        appCompatTextView2.setText(AbstractC17443m.m74967b((createdAt == null || (lX = StringsKt.m98218x(createdAt)) == null) ? 0L : lX.longValue()));
        if (this.isDetail) {
            AppCompatImageView appCompatImageView = this.viewBinding.f86642j;
            if (appCompatImageView != null) {
                AbstractC26006c.m102054g(appCompatImageView);
            }
        } else {
            AppCompatImageView appCompatImageView2 = this.viewBinding.f86642j;
            if (appCompatImageView2 != null) {
                AbstractC26006c.m102058k(appCompatImageView2);
            }
        }
        View vLocationLine = this.viewBinding.f86626D;
        Intrinsics.m97801g(vLocationLine, "vLocationLine");
        AbstractC26006c.m102054g(vLocationLine);
        String poiName2 = item.getPoiName();
        if (poiName2 == null || poiName2.length() == 0) {
            AppCompatImageView ivLocationIcon = this.viewBinding.f86641i;
            Intrinsics.m97801g(ivLocationIcon, "ivLocationIcon");
            AbstractC26006c.m102054g(ivLocationIcon);
            AppCompatTextView tvUserNameOrLocation = this.viewBinding.f86623A;
            Intrinsics.m97801g(tvUserNameOrLocation, "tvUserNameOrLocation");
            AbstractC26006c.m102054g(tvUserNameOrLocation);
            return;
        }
        AppCompatTextView tvUserNameOrLocation2 = this.viewBinding.f86623A;
        Intrinsics.m97801g(tvUserNameOrLocation2, "tvUserNameOrLocation");
        AbstractC26006c.m102058k(tvUserNameOrLocation2);
        AppCompatImageView ivLocationIcon2 = this.viewBinding.f86641i;
        Intrinsics.m97801g(ivLocationIcon2, "ivLocationIcon");
        AbstractC26006c.m102058k(ivLocationIcon2);
        String distanceStr = item.getDistanceStr();
        if (distanceStr == null || distanceStr.length() == 0 || !showDistance) {
            poiName = item.getPoiName();
        } else {
            poiName = item.getPoiName() + " " + item.getDistanceStr();
        }
        this.viewBinding.f86623A.setText(poiName);
    }

    public final void setIsDetail(boolean isDetail) {
        this.isDetail = isDetail;
    }

    public final void setOnNegativeFeedbackClick(Function0<Unit> function0) {
        this.onNegativeFeedbackClick = function0;
    }

    public final void setOnNegativeFeedbackSuccess(Function0<Unit> function0) {
        this.onNegativeFeedbackSuccess = function0;
    }

    public final void setPage(String pageName, String pageFrom) {
        this.pageName = pageName;
        this.pageFrom = pageFrom;
    }

    protected final void setPageFrom(String str) {
        this.pageFrom = str;
    }

    protected final void setPageName(String str) {
        this.pageName = str;
    }

    public final void setRecycledViewPool(RecyclerView.C4220s rvPool) {
        Intrinsics.m97802h(rvPool, "rvPool");
        this.rvPool = rvPool;
    }

    public abstract void setSubjectAndRoomContent(PostSubjectItem item);
}
