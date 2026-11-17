package com.transsion.postdetail.p306ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bo.AbstractC4864a;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.noober.background.view.BLLinearLayout;
import com.noober.background.view.BLTextView;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.scene.C14050d;
import com.transsion.p285ad.strategy.C14058c;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.p306ui.adapter.C16976c;
import com.transsion.postdetail.viewmodel.LocalVideoDetailViewModel;
import com.transsion.push.PushConstants;
import com.transsion.wrapperad.view.cardpage.NativeCardPageAdHelper;
import com.transsion.wrapperad.view.cardpage.NativeCardPageView;
import com.transsnet.downloader.DownloadManagerApi;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC23002f;
import p462hj.C23860f;
import p765s6.InterfaceC27566d;
import p844vo.C28139a0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u001f\u0010\u001a\u001a\u00020\u00112\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b%\u0010!J)\u0010*\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010\u00182\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\u00020\u00112\u0014\u0010-\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00110,¢\u0006\u0004\b.\u0010/J\u001b\u00101\u001a\u00020\u00112\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001100¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0004\u0018\u00010\u00182\u0006\u00103\u001a\u00020\r¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0011¢\u0006\u0004\b6\u0010\u0013J\u000f\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u0010\u0013J\r\u00108\u001a\u00020\u0011¢\u0006\u0004\b8\u0010\u0013R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR&\u0010L\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0011\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010>R\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010B\u001a\u0004\bW\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010a\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b^\u0010>\u001a\u0004\b_\u0010`R\u001a\u0010d\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bb\u0010>\u001a\u0004\bc\u0010`R\u001a\u0010g\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\be\u0010>\u001a\u0004\bf\u0010`¨\u0006h"}, m97100d2 = {"Lcom/transsion/postdetail/ui/view/LocalVideoMiddleHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ldn/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "kotlin.jvm.PlatformType", "getClassTag", "()Ljava/lang/String;", "", "z", "()V", CampaignEx.JSON_KEY_AD_R, "y", "w", "", "Lcom/transsion/baselib/db/download/DownloadBean;", "list", "H", "(Ljava/util/List;)V", "bean", RequestParameters.POSITION, "E", "(Lcom/transsion/baselib/db/download/DownloadBean;I)V", "F", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "G", "(I)V", "downloadBean", "updateDownloadBean", "Lcom/transsion/wrapperad/view/cardpage/NativeCardPageView;", "nativeSlideshowView", "Landroidx/lifecycle/LifecycleCoroutineScope;", "scope", "init", "(Lcom/transsion/baselib/db/download/DownloadBean;Lcom/transsion/wrapperad/view/cardpage/NativeCardPageView;Landroidx/lifecycle/LifecycleCoroutineScope;)V", "Lkotlin/Function1;", "callback", "setItemClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "setAllListClickCallback", "(Lkotlin/jvm/functions/Function0;)V", "resourceId", "getDownloadBean", "(Ljava/lang/String;)Lcom/transsion/baselib/db/download/DownloadBean;", PushConstants.PROVIDER_FIELD_DESTROY, "onMemberStateChange", "destroyAdHelper", "Lvo/a0;", "a", "Lvo/a0;", "viewBinding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "scrollOffset", "Lcom/transsion/postdetail/viewmodel/LocalVideoDetailViewModel;", "c", "Lkotlin/Lazy;", "getViewModel", "()Lcom/transsion/postdetail/viewmodel/LocalVideoDetailViewModel;", "viewModel", "Lcom/transsion/postdetail/ui/adapter/c;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/postdetail/ui/adapter/c;", "seriesAdapter", "e", "Lkotlin/jvm/functions/Function1;", "itemClickCallback", "f", "Lkotlin/jvm/functions/Function0;", "showAllCallback", "g", "Lcom/transsion/baselib/db/download/DownloadBean;", "mDownloadBean", "h", "refreshTime", "Landroid/os/Handler;", "i", "getMHandler", "()Landroid/os/Handler;", "mHandler", "Lcom/transsion/wrapperad/view/cardpage/NativeCardPageAdHelper;", "j", "Lcom/transsion/wrapperad/view/cardpage/NativeCardPageAdHelper;", "adHelper", CampaignEx.JSON_KEY_AD_K, "getMaxStep", "()I", "maxStep", "l", "getStep", "step", "m", "getDefault", "default", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class LocalVideoMiddleHeaderView extends ConstraintLayout implements InterfaceC23002f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28139a0 viewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int scrollOffset;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C16976c seriesAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function1 itemClickCallback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Function0 showAllCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private DownloadBean mDownloadBean;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int refreshTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy mHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private NativeCardPageAdHelper adHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int maxStep;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int step;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int default;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.LocalVideoMiddleHeaderView$a */
    public static final class C17327a extends DiffUtil.AbstractC4174e {
        C17327a() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(DownloadBean oldItem, DownloadBean newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getResourceId(), newItem.getResourceId()) && oldItem.getStatus() == newItem.getStatus() && oldItem.getProgress() == newItem.getProgress() && Intrinsics.m97797c(oldItem.getUpdateTimeStamp(), newItem.getUpdateTimeStamp());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(DownloadBean oldItem, DownloadBean newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getResourceId(), newItem.getResourceId());
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.LocalVideoMiddleHeaderView$b */
    public static final class C17328b extends RecyclerView.AbstractC4213l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f57605a;

        C17328b(int i11) {
            this.f57605a = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter != null) {
                if (childAdapterPosition == 0) {
                    if (AbstractC26006c.m102053f()) {
                        outRect.right = 0;
                        outRect.left = this.f57605a;
                        return;
                    } else {
                        outRect.left = 0;
                        outRect.right = this.f57605a;
                        return;
                    }
                }
                if (childAdapterPosition != adapter.getItemCount() - 1) {
                    int i11 = this.f57605a;
                    outRect.right = i11;
                    outRect.left = i11;
                } else if (AbstractC26006c.m102053f()) {
                    int i12 = this.f57605a;
                    outRect.right = i12;
                    outRect.left = i12 * 3;
                } else {
                    int i13 = this.f57605a;
                    outRect.left = i13;
                    outRect.right = i13 * 3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.LocalVideoMiddleHeaderView$c */
    static final class C17329c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57606a;

        C17329c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57606a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57606a;
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
            this.f57606a.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalVideoMiddleHeaderView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalVideoMiddleHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalVideoMiddleHeaderView(Context context, AttributeSet attributeSet, int i11) {
        JsonElement jsonElement;
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.scrollOffset = (AbstractC5806y.m27489e() / 2) - AbstractC5776a0.m27313a(80.0f);
        this.viewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.view.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoMiddleHeaderView.m74686I(this.f57782a);
            }
        });
        int asInt = 15;
        this.refreshTime = 15;
        this.mHandler = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.view.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoMiddleHeaderView.m74681D();
            }
        });
        View.inflate(getContext(), R$layout.layout_local_video_middle_header, this);
        C28139a0 c28139a0M109283a = C28139a0.m109283a(this);
        Intrinsics.m97801g(c28139a0M109283a, "bind(...)");
        this.viewBinding = c28139a0M109283a;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b("MediaPlayerMidDescScene");
        if (jsonObjectM63626b != null && (jsonElement = jsonObjectM63626b.get("refreshTime")) != null) {
            asInt = jsonElement.getAsInt();
        }
        this.refreshTime = asInt;
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69862p(this);
        }
        this.maxStep = 128;
        this.step = 2;
        this.default = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Unit m74678A(LocalVideoMiddleHeaderView localVideoMiddleHeaderView, List list) {
        localVideoMiddleHeaderView.m74685H(list);
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            AppCompatTextView tvEpTitle = localVideoMiddleHeaderView.viewBinding.f86348i;
            Intrinsics.m97801g(tvEpTitle, "tvEpTitle");
            AbstractC26006c.m102054g(tvEpTitle);
            RecyclerView recyclerViewEp = localVideoMiddleHeaderView.viewBinding.f86347h;
            Intrinsics.m97801g(recyclerViewEp, "recyclerViewEp");
            AbstractC26006c.m102054g(recyclerViewEp);
            AppCompatTextView innerTvName = localVideoMiddleHeaderView.viewBinding.f86343d;
            Intrinsics.m97801g(innerTvName, "innerTvName");
            AbstractC26006c.m102054g(innerTvName);
            AppCompatTextView innerTvInfo = localVideoMiddleHeaderView.viewBinding.f86342c;
            Intrinsics.m97801g(innerTvInfo, "innerTvInfo");
            AbstractC26006c.m102054g(innerTvInfo);
            AppCompatImageView innerIcon = localVideoMiddleHeaderView.viewBinding.f86341b;
            Intrinsics.m97801g(innerIcon, "innerIcon");
            AbstractC26006c.m102054g(innerIcon);
            return Unit.f75682a;
        }
        DownloadBean downloadBean = localVideoMiddleHeaderView.mDownloadBean;
        String uploadBy = downloadBean != null ? downloadBean.getUploadBy() : null;
        if (uploadBy == null || uploadBy.length() == 0) {
            AppCompatTextView innerTvName2 = localVideoMiddleHeaderView.viewBinding.f86343d;
            Intrinsics.m97801g(innerTvName2, "innerTvName");
            AbstractC26006c.m102054g(innerTvName2);
            AppCompatTextView innerTvInfo2 = localVideoMiddleHeaderView.viewBinding.f86342c;
            Intrinsics.m97801g(innerTvInfo2, "innerTvInfo");
            AbstractC26006c.m102054g(innerTvInfo2);
        } else {
            AppCompatTextView innerTvName3 = localVideoMiddleHeaderView.viewBinding.f86343d;
            Intrinsics.m97801g(innerTvName3, "innerTvName");
            AbstractC26006c.m102058k(innerTvName3);
            AppCompatTextView innerTvInfo3 = localVideoMiddleHeaderView.viewBinding.f86342c;
            Intrinsics.m97801g(innerTvInfo3, "innerTvInfo");
            AbstractC26006c.m102058k(innerTvInfo3);
            AppCompatTextView appCompatTextView = localVideoMiddleHeaderView.viewBinding.f86343d;
            DownloadBean downloadBean2 = localVideoMiddleHeaderView.mDownloadBean;
            appCompatTextView.setText(downloadBean2 != null ? downloadBean2.getUploadBy() : null);
        }
        AppCompatImageView innerIcon2 = localVideoMiddleHeaderView.viewBinding.f86341b;
        Intrinsics.m97801g(innerIcon2, "innerIcon");
        AbstractC26006c.m102058k(innerIcon2);
        AppCompatTextView tvEpTitle2 = localVideoMiddleHeaderView.viewBinding.f86348i;
        Intrinsics.m97801g(tvEpTitle2, "tvEpTitle");
        AbstractC26006c.m102058k(tvEpTitle2);
        RecyclerView recyclerViewEp2 = localVideoMiddleHeaderView.viewBinding.f86347h;
        Intrinsics.m97801g(recyclerViewEp2, "recyclerViewEp");
        AbstractC26006c.m102058k(recyclerViewEp2);
        if (list.size() > 3) {
            BLTextView tvMore = localVideoMiddleHeaderView.viewBinding.f86349j;
            Intrinsics.m97801g(tvMore, "tvMore");
            AbstractC26006c.m102058k(tvMore);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Unit m74679B(LocalVideoMiddleHeaderView localVideoMiddleHeaderView, DownloadBean downloadBean) {
        C16976c c16976c;
        List<Object> data;
        List<Object> data2;
        int size = 0;
        if (downloadBean != null) {
            downloadBean.setPlaying(false);
        }
        C16976c c16976c2 = localVideoMiddleHeaderView.seriesAdapter;
        int i11 = -1;
        if (c16976c2 != null && (data2 = c16976c2.getData()) != null) {
            Iterator<Object> it = data2.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (Intrinsics.m97797c(((DownloadBean) it.next()).getResourceId(), downloadBean != null ? downloadBean.getResourceId() : null)) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 >= 0) {
            C16976c c16976c3 = localVideoMiddleHeaderView.seriesAdapter;
            if (c16976c3 != null && (data = c16976c3.getData()) != null) {
                size = data.size();
            }
            if (i11 < size && (c16976c = localVideoMiddleHeaderView.seriesAdapter) != null) {
                c16976c.notifyItemChanged(i11, Boolean.FALSE);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Unit m74680C(LocalVideoMiddleHeaderView localVideoMiddleHeaderView, DownloadBean downloadBean) {
        C16976c c16976c;
        List<Object> data;
        List<Object> data2;
        if (downloadBean != null) {
            downloadBean.setPlaying(true);
        }
        C16976c c16976c2 = localVideoMiddleHeaderView.seriesAdapter;
        int i11 = -1;
        int size = 0;
        if (c16976c2 != null && (data2 = c16976c2.getData()) != null) {
            Iterator<Object> it = data2.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (Intrinsics.m97797c(((DownloadBean) it.next()).getResourceId(), downloadBean != null ? downloadBean.getResourceId() : null)) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 >= 0) {
            C16976c c16976c3 = localVideoMiddleHeaderView.seriesAdapter;
            if (c16976c3 != null && (data = c16976c3.getData()) != null) {
                size = data.size();
            }
            if (i11 < size && (c16976c = localVideoMiddleHeaderView.seriesAdapter) != null) {
                c16976c.notifyItemChanged(i11, Boolean.TRUE);
            }
        }
        Intrinsics.m97799e(downloadBean);
        localVideoMiddleHeaderView.m74683F(downloadBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Handler m74681D() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: E */
    private final void m74682E(DownloadBean bean, int position) {
        Function1 function1 = this.itemClickCallback;
        if (function1 != null) {
            function1.invoke(bean);
        }
    }

    /* JADX INFO: renamed from: F */
    private final void m74683F(DownloadBean bean) {
        List<Object> data;
        List<Object> data2;
        C16976c c16976c = this.seriesAdapter;
        int i11 = -1;
        int size = 0;
        if (c16976c != null && (data2 = c16976c.getData()) != null) {
            Iterator<Object> it = data2.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (Intrinsics.m97797c(((DownloadBean) it.next()).getResourceId(), bean.getResourceId())) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 > 0) {
            C16976c c16976c2 = this.seriesAdapter;
            if (c16976c2 != null && (data = c16976c2.getData()) != null) {
                size = data.size();
            }
            if (i11 < size) {
                m74684G(i11);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m74684G(int position) {
        if (position < 0) {
            return;
        }
        try {
            this.viewBinding.f86347h.scrollToPosition(position);
            RecyclerView.AbstractC4214m layoutManager = this.viewBinding.f86347h.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int i11 = this.scrollOffset;
                if (i11 <= 0) {
                    i11 = 0;
                }
                linearLayoutManager.scrollToPositionWithOffset(position, i11);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: H */
    private final void m74685H(List list) {
        C16976c c16976c = this.seriesAdapter;
        if (c16976c != null) {
            c16976c.mo36201n1(list);
        }
        DownloadBean downloadBean = this.mDownloadBean;
        if (downloadBean != null) {
            m74683F(downloadBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final LocalVideoDetailViewModel m74686I(LocalVideoMiddleHeaderView localVideoMiddleHeaderView) {
        Context context = localVideoMiddleHeaderView.getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (LocalVideoDetailViewModel) new C3227v0((FragmentActivity) context, new C3227v0.d()).m14969a(LocalVideoDetailViewModel.class);
    }

    private final String getClassTag() {
        return LocalVideoMiddleHeaderView.class.getSimpleName();
    }

    private final Handler getMHandler() {
        return (Handler) this.mHandler.getValue();
    }

    private final LocalVideoDetailViewModel getViewModel() {
        return (LocalVideoDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: r */
    private final void m74697r() {
        this.viewBinding.f86349j.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalVideoMiddleHeaderView.m74701v(this.f57800a, view);
            }
        });
        this.viewBinding.f86345f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalVideoMiddleHeaderView.m74698s(this.f57724a, view);
            }
        });
        this.viewBinding.f86346g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalVideoMiddleHeaderView.m74699t(this.f57727a, view);
            }
        });
        this.viewBinding.f86341b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalVideoMiddleHeaderView.m74700u(this.f57729a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m74698s(LocalVideoMiddleHeaderView localVideoMiddleHeaderView, View view) {
        Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
        DownloadBean downloadBean = localVideoMiddleHeaderView.mDownloadBean;
        Navigator navigatorM61852F = navigatorM61773c.m61852F("subject_type", downloadBean != null ? downloadBean.getSubjectType() : SubjectType.MOVIE.getValue());
        DownloadBean downloadBean2 = localVideoMiddleHeaderView.mDownloadBean;
        Navigator.m61845x(navigatorM61852F.m61857K("id", downloadBean2 != null ? downloadBean2.getSubjectId() : null).m61872z("autoPlay", true), localVideoMiddleHeaderView.getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m74699t(LocalVideoMiddleHeaderView localVideoMiddleHeaderView, View view) {
        String sourceUrl;
        DownloadBean downloadBean = localVideoMiddleHeaderView.mDownloadBean;
        if (downloadBean != null) {
            DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
            Context context = localVideoMiddleHeaderView.getContext();
            Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            Subject subject = (Subject) localVideoMiddleHeaderView.getViewModel().m75011g().m14847f();
            Subject subjectM23379a = subject == null ? AbstractC4864a.m23379a(downloadBean) : subject;
            DownloadBean downloadBean2 = localVideoMiddleHeaderView.mDownloadBean;
            String ops = downloadBean2 != null ? downloadBean2.getOps() : null;
            DownloadBean downloadBean3 = localVideoMiddleHeaderView.mDownloadBean;
            if (downloadBean3 == null || (sourceUrl = downloadBean3.getSourceUrl()) == null) {
                sourceUrl = "";
            }
            String str = sourceUrl;
            DownloadBean downloadBean4 = (DownloadBean) localVideoMiddleHeaderView.getViewModel().m75009e().m14847f();
            DownloadManagerApi.m87025N(downloadManagerApiM87093a, fragmentActivity, subjectM23379a, "local_video_detail_middle", null, ops, str, null, null, null, false, downloadBean4 != null ? downloadBean4.getSe() : 0, false, 968, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m74700u(LocalVideoMiddleHeaderView localVideoMiddleHeaderView, View view) {
        Navigator navigatorM61857K = TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SUBJECT_PLAY");
        DownloadBean downloadBean = localVideoMiddleHeaderView.mDownloadBean;
        Navigator.m61845x(navigatorM61857K.m61857K("subject_id", downloadBean != null ? downloadBean.getSubjectId() : null), localVideoMiddleHeaderView.getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m74701v(LocalVideoMiddleHeaderView localVideoMiddleHeaderView, View view) {
        Function0 function0 = localVideoMiddleHeaderView.showAllCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: w */
    private final void m74702w() {
        C16976c c16976c = new C16976c(new ArrayList(), false, 2, null);
        c16976c.m36227w1(new InterfaceC27566d() { // from class: com.transsion.postdetail.ui.view.d0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                LocalVideoMiddleHeaderView.m74703x(this.f57733a, baseQuickAdapter, view, i11);
            }
        });
        c16976c.m36158R0(new C17327a());
        this.seriesAdapter = c16976c;
        RecyclerView recyclerView = this.viewBinding.f86347h;
        int iM92908b = AbstractC23384a.m92908b(4);
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.seriesAdapter);
        recyclerView.addItemDecoration(new C17328b(iM92908b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m74703x(LocalVideoMiddleHeaderView localVideoMiddleHeaderView, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L) || adapter.getData().isEmpty()) {
            return;
        }
        Object obj = adapter.getData().get(i11);
        Intrinsics.m97800f(obj, "null cannot be cast to non-null type com.transsion.baselib.db.download.DownloadBean");
        localVideoMiddleHeaderView.m74682E((DownloadBean) obj, i11);
    }

    /* JADX INFO: renamed from: y */
    private final void m74704y() {
        String cover;
        String thumbnail;
        setPadding(0, 0, 0, AbstractC23384a.m92908b(16));
        DownloadBean downloadBean = this.mDownloadBean;
        if (downloadBean == null || !downloadBean.isInnerSubjectRes()) {
            BLLinearLayout llDetail = this.viewBinding.f86345f;
            Intrinsics.m97801g(llDetail, "llDetail");
            AbstractC26006c.m102054g(llDetail);
            BLLinearLayout llDownload = this.viewBinding.f86346g;
            Intrinsics.m97801g(llDownload, "llDownload");
            AbstractC26006c.m102054g(llDownload);
        } else {
            DownloadBean downloadBean2 = this.mDownloadBean;
            if (downloadBean2 != null && (cover = downloadBean2.getCover()) != null && !Intrinsics.m97797c(this.viewBinding.f86344e.getTag(), cover)) {
                this.viewBinding.f86344e.setTag(cover);
                C23860f.a aVar = C23860f.f72909a;
                Context context = getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94468g = aVar.m94457m(context).m94468g(cover);
                DownloadBean downloadBean3 = this.mDownloadBean;
                if (downloadBean3 == null || (thumbnail = downloadBean3.getThumbnail()) == null) {
                    thumbnail = "";
                }
                C23860f.b bVarM94473l = bVarM94468g.m94473l(thumbnail);
                ShapeableImageView ivCover = this.viewBinding.f86344e;
                Intrinsics.m97801g(ivCover, "ivCover");
                bVarM94473l.m94465d(ivCover);
            }
        }
        DownloadBean downloadBean4 = this.mDownloadBean;
        if (downloadBean4 == null || !downloadBean4.isSeries()) {
            AppCompatTextView tvEpTitle = this.viewBinding.f86348i;
            Intrinsics.m97801g(tvEpTitle, "tvEpTitle");
            AbstractC26006c.m102054g(tvEpTitle);
            RecyclerView recyclerViewEp = this.viewBinding.f86347h;
            Intrinsics.m97801g(recyclerViewEp, "recyclerViewEp");
            AbstractC26006c.m102054g(recyclerViewEp);
            AppCompatTextView innerTvName = this.viewBinding.f86343d;
            Intrinsics.m97801g(innerTvName, "innerTvName");
            AbstractC26006c.m102054g(innerTvName);
            AppCompatTextView innerTvInfo = this.viewBinding.f86342c;
            Intrinsics.m97801g(innerTvInfo, "innerTvInfo");
            AbstractC26006c.m102054g(innerTvInfo);
            AppCompatImageView innerIcon = this.viewBinding.f86341b;
            Intrinsics.m97801g(innerIcon, "innerIcon");
            AbstractC26006c.m102054g(innerIcon);
        }
        m74702w();
    }

    /* JADX INFO: renamed from: z */
    private final void m74705z() {
        C3187b0 c3187b0M75013i = getViewModel().m75013i();
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        c3187b0M75013i.m14851j((FragmentActivity) context, new C17329c(new Function1() { // from class: com.transsion.postdetail.ui.view.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoMiddleHeaderView.m74678A(this.f57787a, (List) obj);
            }
        }));
        C3187b0 c3187b0M75010f = getViewModel().m75010f();
        Context context2 = getContext();
        Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        c3187b0M75010f.m14851j((FragmentActivity) context2, new C17329c(new Function1() { // from class: com.transsion.postdetail.ui.view.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoMiddleHeaderView.m74679B(this.f57790a, (DownloadBean) obj);
            }
        }));
        C3187b0 c3187b0M75009e = getViewModel().m75009e();
        Context context3 = getContext();
        Intrinsics.m97800f(context3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        c3187b0M75009e.m14851j((FragmentActivity) context3, new C17329c(new Function1() { // from class: com.transsion.postdetail.ui.view.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoMiddleHeaderView.m74680C(this.f57795a, (DownloadBean) obj);
            }
        }));
    }

    public final void destroy() {
        getMHandler().removeCallbacksAndMessages(null);
        destroyAdHelper();
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69849c(this);
        }
    }

    public final void destroyAdHelper() {
        NativeCardPageAdHelper nativeCardPageAdHelper = this.adHelper;
        if (nativeCardPageAdHelper != null) {
            nativeCardPageAdHelper.m86956x();
        }
        this.adHelper = null;
    }

    public final int getDefault() {
        return this.default;
    }

    public final DownloadBean getDownloadBean(String resourceId) {
        List<Object> data;
        Intrinsics.m97802h(resourceId, "resourceId");
        C16976c c16976c = this.seriesAdapter;
        Object obj = null;
        if (c16976c == null || (data = c16976c.getData()) == null) {
            return null;
        }
        for (Object obj2 : data) {
            if (Intrinsics.m97797c(((DownloadBean) obj2).getResourceId(), resourceId)) {
                obj = obj2;
                break;
            }
        }
        return (DownloadBean) obj;
    }

    public final int getMaxStep() {
        return this.maxStep;
    }

    public final int getStep() {
        return this.step;
    }

    public final void init(DownloadBean downloadBean, NativeCardPageView nativeSlideshowView, LifecycleCoroutineScope scope) {
        NativeCardPageAdHelper nativeCardPageAdHelperM86951G;
        Intrinsics.m97802h(scope, "scope");
        this.mDownloadBean = downloadBean;
        NativeCardPageAdHelper nativeCardPageAdHelper = new NativeCardPageAdHelper(scope);
        this.adHelper = nativeCardPageAdHelper;
        if (nativeSlideshowView != null && (nativeCardPageAdHelperM86951G = nativeCardPageAdHelper.m86951G("MediaPlayerMidDescScene")) != null) {
            C14058c c14058c = C14058c.f49742a;
            DownloadBean downloadBean2 = this.mDownloadBean;
            NativeCardPageAdHelper nativeCardPageAdHelperM86950F = nativeCardPageAdHelperM86951G.m86950F(c14058c.m63681a(downloadBean2 != null ? downloadBean2.getGenre() : null));
            if (nativeCardPageAdHelperM86950F != null) {
                nativeCardPageAdHelperM86950F.m86953u(nativeSlideshowView);
            }
        }
        m74704y();
        m74705z();
        m74697r();
    }

    @Override // p352dn.InterfaceC23002f
    public void onMemberStateChange() {
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b == null || !interfaceC22998b.mo69851e()) {
            return;
        }
        destroyAdHelper();
    }

    public final void setAllListClickCallback(Function0<Unit> callback) {
        Intrinsics.m97802h(callback, "callback");
        this.showAllCallback = callback;
    }

    public final void setItemClickCallback(Function1<? super DownloadBean, Unit> callback) {
        Intrinsics.m97802h(callback, "callback");
        this.itemClickCallback = callback;
    }

    public final void updateDownloadBean(DownloadBean downloadBean) {
        this.mDownloadBean = downloadBean;
    }
}
