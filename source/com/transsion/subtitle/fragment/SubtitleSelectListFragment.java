package com.transsion.subtitle.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.AbstractC2397b;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3187b0;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.SwitchButton;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.subtitle.C19655a;
import com.transsion.subtitle.InterfaceC19714h;
import com.transsion.subtitle.R$drawable;
import com.transsion.subtitle.R$id;
import com.transsion.subtitle.R$layout;
import com.transsion.subtitle.R$string;
import com.transsion.subtitle.adapter.C19657b;
import com.transsion.subtitle.helper.SubtitleSearchHelper;
import com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel;
import com.transsion.subtitle_download.InterfaceC19743a;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;
import mu.InterfaceC25910b;
import mu.InterfaceC25911c;
import p003a1.AbstractC0008a;
import p528ju.C24469a;
import p559ku.C25437g;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 u2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001vB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010#J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010#J\u0019\u0010&\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b&\u0010\u0013J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010\u0006J#\u0010*\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\b2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\nH\u0003¢\u0006\u0004\b2\u0010\u0016J\u0017\u00103\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u00104J!\u00107\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b7\u00108J!\u0010;\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010\u0006J\u000f\u0010>\u001a\u00020\u000eH\u0016¢\u0006\u0004\b>\u0010\u0006J\u0017\u0010A\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ!\u0010G\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u000eH\u0016¢\u0006\u0004\bI\u0010\u0006J!\u0010J\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bJ\u0010HJ\u000f\u0010K\u001a\u00020\u000eH\u0016¢\u0006\u0004\bK\u0010\u0006J\u0017\u0010M\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bM\u0010\u0016J\u0017\u0010N\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\bN\u0010\u0013J\u001f\u0010R\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bT\u0010UJ#\u0010Z\u001a\u00020\u000e2\n\u0010X\u001a\u00060Vj\u0002`W2\u0006\u0010Y\u001a\u00020PH\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010^\u001a\u00020\u000e2\b\u0010]\u001a\u0004\u0018\u00010\\¢\u0006\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001c\u0010h\u001a\b\u0012\u0004\u0012\u00020\b0e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010q\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010pR\u0016\u0010t\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010p¨\u0006w"}, m97100d2 = {"Lcom/transsion/subtitle/fragment/SubtitleSelectListFragment;", "Lcom/transsion/subtitle/fragment/SubtitleBaseFragment;", "Lku/g;", "Lcom/transsion/subtitle_download/a;", "Lmu/c;", "<init>", "()V", "", "Lju/a;", "list", "", "isLand", "Lcom/transsion/baselib/db/download/DownloadBean;", "downloadBean", "", "K0", "(Ljava/util/List;ZLcom/transsion/baselib/db/download/DownloadBean;)V", "bean", "P0", "(Lju/a;)V", "isChecked", "A0", "(Z)V", "O0", "o0", "q0", "()Lju/a;", "have1StBean", "n0", "", RequestParameters.POSITION, "G0", "(I)V", "videoSubtitleBean", "M0", "(Lju/a;I)V", "F0", "C0", "E0", "B0", IntegrationConstants.TAB_BAR_POSITION_TOP, IntegrationConstants.TAB_BAR_POSITION_DEFAULT, "H0", "(Lju/a;Lju/a;)V", WebConstants.FIELD_ITEM, "p0", "(ILju/a;)V", "t0", "()Z", "isOpenSubtitle", "I0", "r0", "(Z)I", "Landroidx/appcompat/widget/AppCompatTextView;", "textView", "N0", "(ZLandroidx/appcompat/widget/AppCompatTextView;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "imageView", "L0", "(ZLandroidx/appcompat/widget/AppCompatImageView;)V", "onResume", "onPause", "Landroid/view/LayoutInflater;", "inflater", "s0", "(Landroid/view/LayoutInflater;)Lku/g;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "initView", "initListener", "hidden", "onHiddenChanged", "g", NotificationCompat.CATEGORY_PROGRESS, "Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;", "stDownloadTable", "onDownloading", "(ILcom/transsion/subtitle_download/db/SubtitleDownloadTable;)V", "onComplete", "(Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "dbBean", "onFail", "(Ljava/lang/Exception;Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;)V", "Lmu/b;", "callback", "J0", "(Lmu/b;)V", "Landroid/view/View;", "footerView", "h", "Lmu/b;", "mCallback", "", "i", "Ljava/util/List;", "dataList", "j", "Lcom/transsion/baselib/db/download/DownloadBean;", "Lcom/transsion/subtitle/adapter/b;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/subtitle/adapter/b;", "listAdapter", "l", "Z", "hasSubDownloading", "m", "n", "isOpenBilingual", "o", "a", "VideoSubtitle_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubtitleSelectListFragment extends SubtitleBaseFragment<C25437g> implements InterfaceC19743a, InterfaceC25911c {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private View footerView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private InterfaceC25910b mCallback;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private DownloadBean downloadBean;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private C19657b listAdapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean hasSubDownloading;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isOpenBilingual;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private List dataList = new ArrayList();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isOpenSubtitle = true;

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSelectListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SubtitleSelectListFragment m82130a(List subtitleList, boolean z11, DownloadBean downloadBean, String str) {
            Intrinsics.m97802h(subtitleList, "subtitleList");
            SubtitleSelectListFragment subtitleSelectListFragment = new SubtitleSelectListFragment();
            subtitleSelectListFragment.m82102K0(subtitleList, z11, downloadBean);
            subtitleSelectListFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("KEY_PAGE_NAME", str)));
            return subtitleSelectListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSelectListFragment$onComplete$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.subtitle.fragment.SubtitleSelectListFragment$onComplete$1", m97637f = "SubtitleSelectListFragment.kt", m97638l = {234}, m97639m = "invokeSuspend")
    static final class C196821 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C196821(Continuation<? super C196821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C196821 c196821 = SubtitleSelectListFragment.this.new C196821(continuation);
            c196821.L$0 = obj;
            return c196821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C196821) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25149n0 interfaceC25149n0;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC25149n0 interfaceC25149n1 = (InterfaceC25149n0) this.L$0;
                this.L$0 = interfaceC25149n1;
                this.label = 1;
                if (AbstractC25207u0.m99223a(500L, this) == objF) {
                    return objF;
                }
                interfaceC25149n0 = interfaceC25149n1;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
                ResultKt.m97107b(obj);
            }
            C19655a.f62783a.m81952a(interfaceC25149n0.getClass().getSimpleName() + " --> onComplete() --> 刷新列表 --> 刷新状态");
            SubtitleSelectListFragment.this.onHiddenChanged(false);
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: A0 */
    private final void m82093A0(boolean isChecked) {
        if (isChecked) {
            m82106O0();
        } else {
            m82117o0();
        }
    }

    /* JADX INFO: renamed from: B0 */
    private final void m82094B0() {
        C24469a c24469a;
        List<Object> data;
        C19657b c19657b = this.listAdapter;
        C24469a c24469a2 = null;
        if (c19657b == null || (data = c19657b.getData()) == null) {
            c24469a = null;
        } else {
            Iterator<T> it = data.iterator();
            c24469a = null;
            while (it.hasNext()) {
                C24469a c24469a3 = (C24469a) it.next();
                if (c24469a3.m96015f() && TextUtils.equals("1st", c24469a3.m96010a())) {
                    c24469a2 = c24469a3;
                } else if (c24469a3.m96015f() && TextUtils.equals("2nd", c24469a3.m96010a())) {
                    c24469a = c24469a3;
                }
            }
        }
        m82100H0(c24469a2, c24469a);
    }

    /* JADX INFO: renamed from: C0 */
    private final void m82095C0(C24469a videoSubtitleBean, int position) {
        int i11;
        List<Object> data;
        C19657b c19657b;
        List<Object> data2;
        List<Object> data3;
        List<Object> data4;
        int i12 = 0;
        if (videoSubtitleBean.m96015f()) {
            videoSubtitleBean.m96021l(false);
            videoSubtitleBean.m96016g("");
            C19657b c19657b2 = this.listAdapter;
            if (c19657b2 != null) {
                c19657b2.notifyItemChanged(position, videoSubtitleBean);
            }
            C19657b c19657b3 = this.listAdapter;
            if (c19657b3 != null && (data4 = c19657b3.getData()) != null) {
                for (Object obj : data4) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.m97515u();
                    }
                    C24469a c24469a = (C24469a) obj;
                    if (TextUtils.equals(c24469a.m96010a(), "2nd")) {
                        c24469a.m96016g("1st");
                        C19657b c19657b4 = this.listAdapter;
                        if (c19657b4 != null) {
                            c19657b4.notifyItemChanged(i12, c24469a);
                        }
                    }
                    i12 = i13;
                }
            }
            m82094B0();
            return;
        }
        C19657b c19657b5 = this.listAdapter;
        if (c19657b5 == null || (data3 = c19657b5.getData()) == null) {
            i11 = 0;
        } else {
            Iterator<T> it = data3.iterator();
            i11 = 0;
            while (it.hasNext()) {
                if (!TextUtils.isEmpty(((C24469a) it.next()).m96010a())) {
                    i11++;
                }
            }
        }
        if (i11 >= 2 && (c19657b = this.listAdapter) != null && (data2 = c19657b.getData()) != null) {
            int i14 = 0;
            for (Object obj2 : data2) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    CollectionsKt.m97515u();
                }
                C24469a c24469a2 = (C24469a) obj2;
                if (TextUtils.equals(c24469a2.m96010a(), "2nd")) {
                    c24469a2.m96021l(false);
                    c24469a2.m96016g("");
                    C19657b c19657b6 = this.listAdapter;
                    if (c19657b6 != null) {
                        c19657b6.notifyItemChanged(i14, c24469a2);
                    }
                }
                i14 = i15;
            }
        }
        videoSubtitleBean.m96021l(true);
        C19657b c19657b7 = this.listAdapter;
        if (c19657b7 != null && (data = c19657b7.getData()) != null) {
            Iterator<T> it2 = data.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(((C24469a) it2.next()).m96010a(), "1st")) {
                    i12 = 1;
                }
            }
        }
        if (i12 != 0) {
            videoSubtitleBean.m96016g("2nd");
        } else {
            videoSubtitleBean.m96016g("1st");
        }
        C19657b c19657b8 = this.listAdapter;
        if (c19657b8 != null) {
            c19657b8.notifyItemChanged(position, videoSubtitleBean);
        }
        m82094B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m82096D0(SubtitleSelectListFragment subtitleSelectListFragment, SubtitleDownloadTable subtitleDownloadTable) {
        List<Object> data;
        Object next;
        C19657b c19657b = subtitleSelectListFragment.listAdapter;
        if (c19657b == null || (data = c19657b.getData()) == null) {
            return;
        }
        Iterator<T> it = data.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m97797c(((C24469a) next).m96011b().getId(), subtitleDownloadTable.getId()));
        C24469a c24469a = (C24469a) next;
        if (c24469a != null) {
            c24469a.m96017h(subtitleDownloadTable);
            C19655a c19655a = C19655a.f62783a;
            String simpleName = SubtitleSelectListFragment.class.getSimpleName();
            DownloadBean downloadBean = subtitleSelectListFragment.downloadBean;
            String totalTitleName = downloadBean != null ? downloadBean.getTotalTitleName() : null;
            DownloadBean downloadBean2 = subtitleSelectListFragment.downloadBean;
            String resourceId = downloadBean2 != null ? downloadBean2.getResourceId() : null;
            c19655a.m81952a(simpleName + " --> onFail() --> 内置字幕点击下载失败TnT，name = " + totalTitleName + ", videoResourceId = " + resourceId + ",\" + \" download subtitleName = " + c24469a.m96011b().getName() + ", lan = " + c24469a.m96011b().getLan() + "， status:" + subtitleDownloadTable.getStatus() + "~");
            subtitleSelectListFragment.m82107P0(c24469a);
        }
    }

    /* JADX INFO: renamed from: E0 */
    private final void m82097E0(C24469a videoSubtitleBean) {
        List<Object> data;
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        C19657b c19657b = this.listAdapter;
        if (c19657b != null && (data = c19657b.getData()) != null) {
            int i11 = 0;
            for (Object obj : data) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                C24469a c24469a = (C24469a) obj;
                if (Intrinsics.m97797c(c24469a.m96011b().getId(), (videoSubtitleBean == null || (subtitleDownloadTableM96011b = videoSubtitleBean.m96011b()) == null) ? null : subtitleDownloadTableM96011b.getId())) {
                    c24469a.m96021l(true);
                    C19657b c19657b2 = this.listAdapter;
                    if (c19657b2 != null) {
                        c19657b2.notifyItemChanged(i11, c24469a);
                    }
                } else {
                    c24469a.m96021l(false);
                    C19657b c19657b3 = this.listAdapter;
                    if (c19657b3 != null) {
                        c19657b3.notifyItemChanged(i11, c24469a);
                    }
                }
                i11 = i12;
            }
        }
        m82100H0(videoSubtitleBean, null);
    }

    /* JADX INFO: renamed from: F0 */
    private final void m82098F0(C24469a videoSubtitleBean, int position) {
        if (!videoSubtitleBean.m96015f()) {
            m82097E0(videoSubtitleBean);
            return;
        }
        C19655a.f62783a.m81952a(SubtitleSelectListFragment.class.getSimpleName() + " --> setSubtitle() --> 单字幕 --> 已经选中的就不在重复设置了");
    }

    /* JADX INFO: renamed from: G0 */
    private final void m82099G0(int position) {
        if (this.isOpenSubtitle) {
            C24469a c24469a = (C24469a) this.dataList.get(position);
            if (c24469a.m96013d()) {
                m82104M0(c24469a, position);
            } else {
                m82118p0(position, c24469a);
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    private final void m82100H0(C24469a top, C24469a bottom) {
        InterfaceC25910b interfaceC25910b;
        String string;
        if ((top != null || bottom != null) && (interfaceC25910b = this.mCallback) != null) {
            Context context = getContext();
            if (context == null || (string = context.getString(R$string.subtitle_switch_toast)) == null) {
                string = "";
            }
            interfaceC25910b.mo81901c(string);
        }
        InterfaceC25910b interfaceC25910b2 = this.mCallback;
        if (interfaceC25910b2 != null) {
            interfaceC25910b2.mo81903e(top, bottom, this.isOpenBilingual);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    private final void m82101I0(boolean isOpenSubtitle) {
        ImageView imageView;
        TextView textView;
        ImageView imageView2;
        TextView textView2;
        SwitchButton switchButton;
        SwitchButton switchButton2;
        C25437g c25437g = (C25437g) getMViewBinding();
        m82105N0(isOpenSubtitle, c25437g != null ? c25437g.f77060k : null);
        C25437g c25437g2 = (C25437g) getMViewBinding();
        m82105N0(isOpenSubtitle, c25437g2 != null ? c25437g2.f77059j : null);
        C25437g c25437g3 = (C25437g) getMViewBinding();
        m82105N0(isOpenSubtitle, c25437g3 != null ? c25437g3.f77058i : null);
        C25437g c25437g4 = (C25437g) getMViewBinding();
        m82103L0(isOpenSubtitle, c25437g4 != null ? c25437g4.f77051b : null);
        C25437g c25437g5 = (C25437g) getMViewBinding();
        m82103L0(isOpenSubtitle, c25437g5 != null ? c25437g5.f77052c : null);
        int color = AbstractC2397b.getColor(Utils.m27275a(), R$color.brand_new_gradient_start);
        int color2 = AbstractC2397b.getColor(Utils.m27275a(), R$color.brand_new_gradient_end);
        int color3 = AbstractC2397b.getColor(Utils.m27275a(), R$color.common_white);
        if (!isOpenSubtitle) {
            C25437g c25437g6 = (C25437g) getMViewBinding();
            if (c25437g6 == null || (switchButton2 = c25437g6.f77056g) == null || !switchButton2.isChecked()) {
                color = AbstractC2397b.getColor(Utils.m27275a(), R$color.brand_new_gradient_start);
                color2 = AbstractC2397b.getColor(Utils.m27275a(), R$color.brand_new_gradient_end);
                color3 = AbstractC2397b.getColor(Utils.m27275a(), R$color.white_50);
            } else {
                color = AbstractC2397b.getColor(Utils.m27275a(), R$color.brand_new_gradient_start_50);
                color2 = AbstractC2397b.getColor(Utils.m27275a(), R$color.brand_new_gradient_end_50);
                color3 = AbstractC2397b.getColor(Utils.m27275a(), R$color.white_50);
            }
        }
        C25437g c25437g7 = (C25437g) getMViewBinding();
        if (c25437g7 != null && (switchButton = c25437g7.f77056g) != null) {
            switchButton.setGradientColors(color, color2, Integer.valueOf(color3));
            switchButton.setEnable(isOpenSubtitle);
        }
        C19657b c19657b = this.listAdapter;
        if (c19657b != null) {
            c19657b.m81967G1(isOpenSubtitle);
        }
        if (isOpenSubtitle) {
            View view = this.footerView;
            if (view != null && (textView2 = (TextView) view.findViewById(R$id.tvText)) != null) {
                textView2.setTextColor(AbstractC2397b.getColor(Utils.m27275a(), R$color.white));
            }
            View view2 = this.footerView;
            if (view2 == null || (imageView2 = (ImageView) view2.findViewById(R$id.ivImage)) == null) {
                return;
            }
            imageView2.setImageResource(R$drawable.subtitle_arrow_left_white);
            return;
        }
        View view3 = this.footerView;
        if (view3 != null && (textView = (TextView) view3.findViewById(R$id.tvText)) != null) {
            textView.setTextColor(AbstractC2397b.getColor(Utils.m27275a(), R$color.white_40));
        }
        View view4 = this.footerView;
        if (view4 == null || (imageView = (ImageView) view4.findViewById(R$id.ivImage)) == null) {
            return;
        }
        imageView.setImageResource(R$drawable.subtitle_arrow_left_white_2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public final void m82102K0(List list, boolean isLand, DownloadBean downloadBean) {
        this.downloadBean = downloadBean;
        this.dataList.clear();
        this.dataList.addAll(list);
        int size = this.dataList.size();
        String str = "";
        for (int i11 = 0; i11 < size; i11++) {
            C24469a c24469a = (C24469a) this.dataList.get(i11);
            if (c24469a.m96015f()) {
                str = "获取选中的那个 -- index = " + i11 + " -- name = " + c24469a.m96011b().getName();
            }
        }
        C19655a.f62783a.m81952a(SubtitleSelectListFragment.class.getSimpleName() + " --> setData() --> isLand = " + isLand + " --> list = " + list.size() + " --> tag = " + str);
    }

    /* JADX INFO: renamed from: L0 */
    private final void m82103L0(boolean isOpenSubtitle, AppCompatImageView imageView) {
        Drawable drawable;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        AbstractC0008a.m77n(drawable, m82120r0(isOpenSubtitle));
        imageView.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: M0 */
    private final void m82104M0(C24469a videoSubtitleBean, int position) {
        if (this.isOpenBilingual) {
            m82095C0(videoSubtitleBean, position);
        } else {
            m82098F0(videoSubtitleBean, position);
        }
    }

    /* JADX INFO: renamed from: N0 */
    private final void m82105N0(boolean isOpenSubtitle, AppCompatTextView textView) {
        if (textView != null) {
            textView.setTextColor(m82120r0(isOpenSubtitle));
        }
    }

    /* JADX INFO: renamed from: O0 */
    private final void m82106O0() {
        boolean z11;
        C19657b c19657b;
        List<Object> data;
        List<Object> data2;
        C19657b c19657b2 = this.listAdapter;
        int i11 = 0;
        C24469a c24469a = null;
        if (c19657b2 == null || (data2 = c19657b2.getData()) == null) {
            z11 = false;
        } else {
            z11 = false;
            int i12 = 0;
            for (Object obj : data2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.m97515u();
                }
                C24469a c24469a2 = (C24469a) obj;
                if (c24469a2.m96015f()) {
                    c24469a2.m96016g("1st");
                    z11 = true;
                    c24469a = c24469a2;
                }
                i12 = i13;
            }
        }
        if (!z11 && (c19657b = this.listAdapter) != null && (data = c19657b.getData()) != null) {
            for (Object obj2 : data) {
                int i14 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                C24469a c24469a3 = (C24469a) obj2;
                if (c24469a3.m96013d() && !z11) {
                    c24469a3.m96021l(true);
                    c24469a3.m96016g("1st");
                    z11 = true;
                    c24469a = c24469a3;
                }
                i11 = i14;
            }
        }
        m82116n0(c24469a);
        m82094B0();
    }

    /* JADX INFO: renamed from: P0 */
    private final void m82107P0(C24469a bean) {
        int iIndexOf;
        C19657b c19657b = this.listAdapter;
        if (c19657b == null || (iIndexOf = c19657b.getData().indexOf(bean)) < 0 || !isAdded()) {
            return;
        }
        C19655a.f62783a.m81952a(SubtitleSelectListFragment.class.getSimpleName() + " --> updateDownloadStatus() --> updateDownloadStatus index:" + iIndexOf + ", status:" + bean.m96011b().getStatus() + ",name:" + bean.m96011b().getName() + ",isSelect:" + bean.m96015f());
        C19657b c19657b2 = this.listAdapter;
        if (c19657b2 != null) {
            c19657b2.notifyItemChanged(iIndexOf, bean);
        }
    }

    /* JADX INFO: renamed from: n0 */
    private final void m82116n0(C24469a have1StBean) {
        List<Object> data;
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        List<Object> data2;
        SubtitleDownloadTable subtitleDownloadTableM96011b2;
        SubtitleDownloadTable subtitleDownloadTableM96011b3;
        C24469a c24469aM82119q0 = m82119q0();
        boolean zEquals = TextUtils.equals((have1StBean == null || (subtitleDownloadTableM96011b3 = have1StBean.m96011b()) == null) ? null : subtitleDownloadTableM96011b3.getId(), (c24469aM82119q0 == null || (subtitleDownloadTableM96011b2 = c24469aM82119q0.m96011b()) == null) ? null : subtitleDownloadTableM96011b2.getId());
        int i11 = 0;
        if (zEquals || c24469aM82119q0 == null) {
            C19657b c19657b = this.listAdapter;
            if (c19657b == null || (data = c19657b.getData()) == null) {
                return;
            }
            for (Object obj : data) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                C24469a c24469a = (C24469a) obj;
                if (!TextUtils.equals(c24469a.m96011b().getId(), (c24469aM82119q0 == null || (subtitleDownloadTableM96011b = c24469aM82119q0.m96011b()) == null) ? null : subtitleDownloadTableM96011b.getId()) && !c24469a.m96015f()) {
                    m82118p0(i11, c24469a);
                    C19655a.f62783a.m81952a(SubtitleSelectListFragment.class.getSimpleName() + " --> autoShowNdSubtitle() --> 如果按照规则获取到的2nd和1st是同一个，那就默认下载一个作为2nd");
                    return;
                }
                i11 = i12;
            }
            return;
        }
        if (c24469aM82119q0.m96013d()) {
            if (c24469aM82119q0.m96015f()) {
                return;
            }
            c24469aM82119q0.m96016g("2nd");
            c24469aM82119q0.m96021l(true);
            C19655a.f62783a.m81952a(SubtitleSelectListFragment.class.getSimpleName() + " --> autoShowNdSubtitle() --> 2nd 已下载，自动设置 --> name = " + c24469aM82119q0.m96011b().getName());
            return;
        }
        C19657b c19657b2 = this.listAdapter;
        if (c19657b2 == null || (data2 = c19657b2.getData()) == null) {
            return;
        }
        for (Object obj2 : data2) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            if (Intrinsics.m97797c(c24469aM82119q0, (C24469a) obj2)) {
                C19655a.f62783a.m81952a(SubtitleSelectListFragment.class.getSimpleName() + " --> autoShowNdSubtitle() --> 没有下载，自动下载 --> index = " + i11 + " --> name = " + c24469aM82119q0.m96011b().getName());
                m82118p0(i11, c24469aM82119q0);
                return;
            }
            i11 = i13;
        }
    }

    /* JADX INFO: renamed from: o0 */
    private final void m82117o0() {
        List<Object> data;
        C19657b c19657b = this.listAdapter;
        C24469a c24469a = null;
        if (c19657b != null && (data = c19657b.getData()) != null) {
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                C24469a c24469a2 = (C24469a) it.next();
                if (c24469a2.m96015f()) {
                    if (TextUtils.equals("2nd", c24469a2.m96010a())) {
                        c24469a2.m96021l(false);
                        c24469a2.m96016g("");
                        if (c24469a == null) {
                            c24469a = c24469a2;
                        }
                    } else if (TextUtils.equals("1st", c24469a2.m96010a())) {
                        c24469a2.m96021l(true);
                        c24469a2.m96016g("");
                        c24469a = c24469a2;
                    }
                }
            }
        }
        m82097E0(c24469a);
    }

    /* JADX INFO: renamed from: p0 */
    private final void m82118p0(int position, C24469a item) {
        if (this.hasSubDownloading) {
            C13806h.f49015a.m62324k(R$string.subtitle_is_downloading);
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C13806h.f49015a.m62324k(com.transsion.baseui.R$string.base_network_fail);
            return;
        }
        item.m96011b().setStatus(2);
        this.hasSubDownloading = true;
        C19657b c19657b = this.listAdapter;
        if (c19657b != null) {
            c19657b.notifyItemChanged(position, item);
        }
        C19655a c19655a = C19655a.f62783a;
        String simpleName = SubtitleSelectListFragment.class.getSimpleName();
        DownloadBean downloadBean = this.downloadBean;
        String totalTitleName = downloadBean != null ? downloadBean.getTotalTitleName() : null;
        c19655a.m81952a(simpleName + " --> downloadSubtitle() --> 内置字幕列表，下载字幕，name = " + totalTitleName + ", subtype = " + item.m96011b().getType() + ",\" + \" download subtitleName = " + item.m96011b().getSubtitleName() + ", subResourceId = " + item.m96011b().getResourceId() + "~");
        InterfaceC19714h.f62935a.m82148b().mo81946h(item);
    }

    /* JADX INFO: renamed from: q0 */
    private final C24469a m82119q0() {
        C24469a c24469a;
        C24469a c24469a2;
        C24469a c24469a3;
        C24469a c24469a4;
        List<Object> data;
        C19657b c19657b = this.listAdapter;
        if (c19657b == null || (data = c19657b.getData()) == null) {
            c24469a = null;
            c24469a2 = null;
            c24469a3 = null;
            c24469a4 = null;
        } else {
            c24469a = null;
            c24469a2 = null;
            c24469a3 = null;
            c24469a4 = null;
            int i11 = 0;
            for (Object obj : data) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                C24469a c24469a5 = (C24469a) obj;
                if (!c24469a5.m96015f()) {
                    if (TextUtils.equals(c24469a5.m96011b().getLan(), "en")) {
                        c24469a = c24469a5;
                    }
                    if (TextUtils.equals(C14496b.f50966a.m65344b().getString("k_language_short_name", null), c24469a5.m96011b().getLan())) {
                        c24469a2 = c24469a5;
                    }
                    if (TextUtils.equals((Build.VERSION.SDK_INT >= 24 ? Utils.m27275a().getResources().getConfiguration().getLocales().get(0) : Utils.m27275a().getResources().getConfiguration().locale).getLanguage(), c24469a5.m96011b().getLan())) {
                        c24469a3 = c24469a5;
                    }
                    if (i11 == 0) {
                        c24469a4 = c24469a5;
                    }
                }
                i11 = i12;
            }
        }
        if (c24469a != null) {
            return c24469a;
        }
        if (c24469a2 != null) {
            return c24469a2;
        }
        if (c24469a3 != null) {
            return c24469a3;
        }
        if (c24469a4 != null) {
            return c24469a4;
        }
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    private final int m82120r0(boolean isOpenSubtitle) {
        return isOpenSubtitle ? AbstractC2397b.getColor(Utils.m27275a(), R$color.white) : AbstractC2397b.getColor(Utils.m27275a(), R$color.white_40);
    }

    /* JADX INFO: renamed from: t0 */
    private final boolean m82121t0() {
        InterfaceC25910b interfaceC25910b;
        String string;
        List<Object> data;
        C19657b c19657b = this.listAdapter;
        boolean z11 = false;
        if (c19657b != null && (data = c19657b.getData()) != null) {
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                if (((C24469a) it.next()).m96015f()) {
                    z11 = true;
                }
            }
        }
        if (!z11 && (interfaceC25910b = this.mCallback) != null) {
            Context context = getContext();
            if (context == null || (string = context.getString(R$string.subtitle_please_select_subtitles)) == null) {
                string = "";
            }
            interfaceC25910b.mo81901c(string);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m82122u0(SubtitleSelectListFragment subtitleSelectListFragment, SwitchButton switchButton, boolean z11) {
        subtitleSelectListFragment.isOpenBilingual = z11;
        InterfaceC25910b interfaceC25910b = subtitleSelectListFragment.mCallback;
        if (interfaceC25910b != null) {
            interfaceC25910b.mo81904f(z11);
        }
        subtitleSelectListFragment.m82093A0(z11);
        C19657b c19657b = subtitleSelectListFragment.listAdapter;
        if (c19657b != null) {
            c19657b.m81966F1(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m82123v0(SubtitleSelectListFragment subtitleSelectListFragment, View view) {
        SubtitleDownloadViewModel viewModel;
        C3187b0 c3187b0M82249h;
        if (subtitleSelectListFragment.isOpenSubtitle && subtitleSelectListFragment.m82121t0() && (viewModel = subtitleSelectListFragment.getViewModel()) != null && (c3187b0M82249h = viewModel.m82249h()) != null) {
            c3187b0M82249h.mo14858q("SUBTITLE_OPTIONS");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m82124w0(SubtitleSelectListFragment subtitleSelectListFragment, View view) {
        SubtitleDownloadViewModel viewModel;
        C3187b0 c3187b0M82249h;
        if (subtitleSelectListFragment.isOpenSubtitle && subtitleSelectListFragment.m82121t0() && (viewModel = subtitleSelectListFragment.getViewModel()) != null && (c3187b0M82249h = viewModel.m82249h()) != null) {
            c3187b0M82249h.mo14858q("SUBTITLE_SYNC_ADJUST");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m82125x0(SubtitleSelectListFragment subtitleSelectListFragment, SwitchButton switchButton, boolean z11) {
        subtitleSelectListFragment.isOpenSubtitle = z11;
        InterfaceC25910b interfaceC25910b = subtitleSelectListFragment.mCallback;
        if (interfaceC25910b != null) {
            interfaceC25910b.mo81900b(z11);
        }
        subtitleSelectListFragment.m82101I0(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m82126y0(SubtitleSelectListFragment subtitleSelectListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        subtitleSelectListFragment.m82099G0(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m82127z0(SubtitleSelectListFragment subtitleSelectListFragment, View view) {
        C3187b0 c3187b0M82249h;
        C3187b0 c3187b0M82255n;
        if (subtitleSelectListFragment.isOpenSubtitle) {
            SubtitleDownloadViewModel viewModel = subtitleSelectListFragment.getViewModel();
            if (viewModel != null && (c3187b0M82255n = viewModel.m82255n()) != null) {
                c3187b0M82255n.mo14858q(SubtitleSearchHelper.f62938c.m82160a().m82158e(subtitleSelectListFragment.downloadBean));
            }
            SubtitleDownloadViewModel viewModel2 = subtitleSelectListFragment.getViewModel();
            if (viewModel2 == null || (c3187b0M82249h = viewModel2.m82249h()) == null) {
                return;
            }
            c3187b0M82249h.mo14858q("DOWNLOAD_SUBTITLE");
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m82128J0(InterfaceC25910b callback) {
        this.mCallback = callback;
        this.isOpenSubtitle = callback != null ? callback.mo81909k() : true;
        this.isOpenBilingual = callback != null ? callback.mo81905g() : false;
    }

    @Override // mu.InterfaceC25911c
    /* JADX INFO: renamed from: K */
    public void mo81897K(boolean z11, DownloadBean downloadBean) {
        InterfaceC25911c.a.m101719a(this, z11, downloadBean);
    }

    @Override // mu.InterfaceC25911c
    /* JADX INFO: renamed from: g */
    public void mo81898g(C24469a bean) {
        Intrinsics.m97802h(bean, "bean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initListener() {
        SwitchButton switchButton;
        SwitchButton switchButton2;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        super.initListener();
        C25437g c25437g = (C25437g) getMViewBinding();
        if (c25437g != null && (linearLayoutCompat2 = c25437g.f77053d) != null) {
            linearLayoutCompat2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.fragment.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubtitleSelectListFragment.m82123v0(this.f62927a, view);
                }
            });
        }
        C25437g c25437g2 = (C25437g) getMViewBinding();
        if (c25437g2 != null && (linearLayoutCompat = c25437g2.f77054e) != null) {
            linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.fragment.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubtitleSelectListFragment.m82124w0(this.f62928a, view);
                }
            });
        }
        C25437g c25437g3 = (C25437g) getMViewBinding();
        if (c25437g3 != null && (switchButton2 = c25437g3.f77057h) != null) {
            switchButton2.setChecked(this.isOpenSubtitle);
            m82101I0(this.isOpenSubtitle);
            switchButton2.setOnCheckedChangeListener(new SwitchButton.InterfaceC13732d() { // from class: com.transsion.subtitle.fragment.v
                @Override // com.p282tn.lib.view.SwitchButton.InterfaceC13732d
                /* JADX INFO: renamed from: a */
                public final void mo62077a(SwitchButton switchButton3, boolean z11) {
                    SubtitleSelectListFragment.m82125x0(this.f62929a, switchButton3, z11);
                }
            });
        }
        C25437g c25437g4 = (C25437g) getMViewBinding();
        if (c25437g4 == null || (switchButton = c25437g4.f77056g) == null) {
            return;
        }
        switchButton.setChecked(this.isOpenBilingual);
        switchButton.setOnCheckedChangeListener(new SwitchButton.InterfaceC13732d() { // from class: com.transsion.subtitle.fragment.w
            @Override // com.p282tn.lib.view.SwitchButton.InterfaceC13732d
            /* JADX INFO: renamed from: a */
            public final void mo62077a(SwitchButton switchButton3, boolean z11) {
                SubtitleSelectListFragment.m82122u0(this.f62930a, switchButton3, z11);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        C19657b c19657b;
        Intrinsics.m97802h(view, "view");
        C19657b c19657b2 = new C19657b(this.dataList);
        c19657b2.m36227w1(new InterfaceC27566d() { // from class: com.transsion.subtitle.fragment.x
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                SubtitleSelectListFragment.m82126y0(this.f62931a, baseQuickAdapter, view2, i11);
            }
        });
        c19657b2.m81967G1(this.isOpenSubtitle);
        c19657b2.m81966F1(this.isOpenBilingual);
        this.listAdapter = c19657b2;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.footer_download_other_subtitle_layout, (ViewGroup) null);
        this.footerView = viewInflate;
        if (viewInflate != null) {
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.fragment.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubtitleSelectListFragment.m82127z0(this.f62932a, view2);
                }
            });
        }
        View view2 = this.footerView;
        if (view2 != null && (c19657b = this.listAdapter) != null) {
            BaseQuickAdapter.m36129u(c19657b, view2, 0, 0, 6, null);
        }
        C25437g c25437g = (C25437g) getMViewBinding();
        if (c25437g == null || (recyclerView = c25437g.f77055f) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.listAdapter);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onComplete(SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
        this.hasSubDownloading = false;
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new C196821(null), 3, null);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onDownloading(int progress, SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onFail(Exception e11, final SubtitleDownloadTable dbBean) {
        Intrinsics.m97802h(e11, "e");
        Intrinsics.m97802h(dbBean, "dbBean");
        this.hasSubDownloading = false;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.transsion.subtitle.fragment.z
                @Override // java.lang.Runnable
                public final void run() {
                    SubtitleSelectListFragment.m82096D0(this.f62933a, dbBean);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        InterfaceC25910b interfaceC25910b;
        List listMo81908j;
        List<Object> data;
        super.onHiddenChanged(hidden);
        if (hidden || (interfaceC25910b = this.mCallback) == null || (listMo81908j = interfaceC25910b.mo81908j()) == null) {
            return;
        }
        C19655a c19655a = C19655a.f62783a;
        String simpleName = SubtitleSelectListFragment.class.getSimpleName();
        int size = listMo81908j.size();
        C19657b c19657b = this.listAdapter;
        c19655a.m81952a(simpleName + " --> onHiddenChanged(hidden = false) --> 刷新界面 --> newSize = " + size + " --> oldSize = " + ((c19657b == null || (data = c19657b.getData()) == null) ? null : Integer.valueOf(data.size())));
        this.dataList.clear();
        this.dataList.addAll(listMo81908j);
        C19657b c19657b2 = this.listAdapter;
        if (c19657b2 != null) {
            c19657b2.mo36201n1(this.dataList);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        InterfaceC19714h.a aVar = InterfaceC19714h.f62935a;
        aVar.m82148b().mo81941c(this);
        aVar.m82148b().mo81943e(this);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        InterfaceC19714h.a aVar = InterfaceC19714h.f62935a;
        aVar.m82148b().mo81940b(this);
        aVar.m82148b().mo81944f(this);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onSaveDownload(SubtitleDownloadTable subtitleDownloadTable) {
        InterfaceC19743a.a.m82279a(this, subtitleDownloadTable);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onUnGzZip(SubtitleDownloadTable subtitleDownloadTable) {
        InterfaceC19743a.a.m82280b(this, subtitleDownloadTable);
    }

    @Override // com.transsion.subtitle.fragment.SubtitleBaseFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m82017e0("dialog_subtitle_select");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C25437g getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25437g c25437gM100015c = C25437g.m100015c(inflater);
        Intrinsics.m97801g(c25437gM100015c, "inflate(...)");
        return c25437gM100015c;
    }
}
