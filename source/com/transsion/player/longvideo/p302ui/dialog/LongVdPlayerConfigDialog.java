package com.transsion.player.longvideo.p302ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5790i;
import com.cloud.config.utils.XLogUtil;
import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.player.longvideo.R$id;
import com.transsion.player.longvideo.R$layout;
import com.transsion.player.longvideo.constants.LongVodPlayerConfigType;
import com.transsion.player.longvideo.helper.C16472v;
import com.transsion.player.longvideo.member.C16496k;
import com.transsion.player.longvideo.member.LongVodResolutionMemberView;
import com.transsion.player.longvideo.member.ResolutionMemberManager;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import com.transsnet.downloader.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import ng.AbstractC26006c;
import p550kj.C24662i;
import p553ko.C24715a;
import p553ko.C24716b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0019\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010,R0\u0010?\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020;0:j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020;`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, m97100d2 = {"Lcom/transsion/player/longvideo/ui/dialog/LongVdPlayerConfigDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Lko/b;", XLogUtil.TAG, "", "w0", "(Lko/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "A0", "(Lko/b;)V", "", "dialogName", "u0", "(Ljava/lang/String;)V", "pageName", "Lcom/transsion/player/longvideo/constants/LongVodPlayerConfigType;", "configType", "", "dataList", "Lko/a;", "longVdPlayerBean", "Lcom/transsion/player/longvideo/ui/LongVodPlayerView;", "longVodPlayerView", "B0", "(Ljava/lang/String;Lcom/transsion/player/longvideo/constants/LongVodPlayerConfigType;Ljava/util/List;Lko/a;Lcom/transsion/player/longvideo/ui/LongVodPlayerView;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "c", "Lcom/transsion/player/longvideo/ui/LongVodPlayerView;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lko/a;", "e", "Ljava/lang/String;", "f", "Lcom/transsion/player/longvideo/constants/LongVodPlayerConfigType;", "g", "Ljava/util/List;", "Lcom/transsion/player/longvideo/ui/dialog/a;", "h", "Lkotlin/Lazy;", "v0", "()Lcom/transsion/player/longvideo/ui/dialog/a;", "configViewModel", "", "", "i", "[Ljava/lang/Float;", "speedConfigs", "j", "configs", "Ljava/util/HashMap;", "Lcom/transsion/player/longvideo/member/LongVodResolutionMemberView;", "Lkotlin/collections/HashMap;", CampaignEx.JSON_KEY_AD_K, "Ljava/util/HashMap;", "itemViewMap", "l", "Lko/b;", "curConfig", "LongVideo_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class LongVdPlayerConfigDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private LongVodPlayerView longVodPlayerView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C24715a longVdPlayerBean;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private LongVodPlayerConfigType configType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List dataList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy configViewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Float[] speedConfigs;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private List configs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final HashMap itemViewMap;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private C24716b curConfig;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.dialog.LongVdPlayerConfigDialog$a */
    public /* synthetic */ class C16538a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55781a;

        static {
            int[] iArr = new int[LongVodPlayerConfigType.values().length];
            try {
                iArr[LongVodPlayerConfigType.SPEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongVodPlayerConfigType.BITRATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55781a = iArr;
        }
    }

    public LongVdPlayerConfigDialog() {
        super(R$layout.long_vod_dialog_player_config);
        this.configType = LongVodPlayerConfigType.BITRATE;
        this.configViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C16543a.class), new Function0<C3231x0>() { // from class: com.transsion.player.longvideo.ui.dialog.LongVdPlayerConfigDialog$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.player.longvideo.ui.dialog.LongVdPlayerConfigDialog$special$$inlined$activityViewModels$default$2
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
        this.speedConfigs = new Float[]{Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f), Float.valueOf(1.25f), Float.valueOf(1.5f), Float.valueOf(1.75f), Float.valueOf(2.0f)};
        this.configs = new ArrayList();
        this.itemViewMap = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public final void m72153A0(C24716b config) {
        if (config.m97075e()) {
            return;
        }
        LongVodResolutionMemberView longVodResolutionMemberView = (LongVodResolutionMemberView) this.itemViewMap.get(this.curConfig);
        if (longVodResolutionMemberView != null) {
            longVodResolutionMemberView.setTextColor(-1);
        }
        LongVodResolutionMemberView longVodResolutionMemberView2 = (LongVodResolutionMemberView) this.itemViewMap.get(config);
        if (longVodResolutionMemberView2 != null) {
            longVodResolutionMemberView2.setGradientColorsV2(config);
        }
        this.curConfig = config;
        m72162v0().m72330c(config);
        dismiss();
    }

    /* JADX INFO: renamed from: u0 */
    private final void m72161u0(String dialogName) {
        HashMap map = new HashMap();
        map.put("dialog_name", dialogName);
        String str = this.pageName;
        if (str != null) {
            C24662i.f75350a.m96883r(str, map);
        }
    }

    /* JADX INFO: renamed from: v0 */
    private final C16543a m72162v0() {
        return (C16543a) this.configViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w0 */
    public final Object m72163w0(C24716b c24716b, Continuation continuation) throws Throwable {
        LongVdPlayerConfigDialog$isIntercept$1 longVdPlayerConfigDialog$isIntercept$1;
        if (continuation instanceof LongVdPlayerConfigDialog$isIntercept$1) {
            longVdPlayerConfigDialog$isIntercept$1 = (LongVdPlayerConfigDialog$isIntercept$1) continuation;
            int i11 = longVdPlayerConfigDialog$isIntercept$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                longVdPlayerConfigDialog$isIntercept$1.label = i11 - Integer.MIN_VALUE;
            } else {
                longVdPlayerConfigDialog$isIntercept$1 = new LongVdPlayerConfigDialog$isIntercept$1(this, continuation);
            }
        } else {
            longVdPlayerConfigDialog$isIntercept$1 = new LongVdPlayerConfigDialog$isIntercept$1(this, continuation);
        }
        Object objM71893f = longVdPlayerConfigDialog$isIntercept$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = longVdPlayerConfigDialog$isIntercept$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(objM71893f);
            if (this.configType != LongVodPlayerConfigType.BITRATE) {
                return Boxing.m97631a(false);
            }
            ResolutionMemberManager resolutionMemberManager = ResolutionMemberManager.f55604a;
            C24715a c24715a = this.longVdPlayerBean;
            longVdPlayerConfigDialog$isIntercept$1.L$0 = c24716b;
            longVdPlayerConfigDialog$isIntercept$1.label = 1;
            objM71893f = resolutionMemberManager.m71893f(c24715a, longVdPlayerConfigDialog$isIntercept$1);
            if (objM71893f == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24716b = (C24716b) longVdPlayerConfigDialog$isIntercept$1.L$0;
            ResultKt.m97107b(objM71893f);
        }
        boolean zBooleanValue = ((Boolean) objM71893f).booleanValue();
        C16496k.f55626a.m71921a("LongVdPlayerConfigDialog --> 分辨率面板点击 --> isIntercept() --> isUnlock = " + zBooleanValue);
        if (zBooleanValue) {
            return Boxing.m97631a(false);
        }
        LongVodPlayerView longVodPlayerView = this.longVodPlayerView;
        if (longVodPlayerView != null) {
            longVodPlayerView.showResolutionIntercept(c24716b);
        }
        return Boxing.m97631a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final Comparable m72164x0(C24716b it) {
        Intrinsics.m97802h(it, "it");
        return Integer.valueOf(it.m97074d().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Comparable m72165y0(C24716b it) {
        Intrinsics.m97802h(it, "it");
        return it.m97074d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m72166z0(LongVdPlayerConfigDialog longVdPlayerConfigDialog, C24716b c24716b, View view) {
        LifecycleCoroutineScope lifecycleCoroutineScopeM14968a;
        FragmentActivity activity = longVdPlayerConfigDialog.getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity == null || (lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(appCompatActivity)) == null) {
            return;
        }
        AbstractC25136k.m99058d(lifecycleCoroutineScopeM14968a, null, null, new LongVdPlayerConfigDialog$onViewCreated$1$1$1(c24716b, longVdPlayerConfigDialog, null), 3, null);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m72167B0(String pageName, LongVodPlayerConfigType configType, List dataList, C24715a longVdPlayerBean, LongVodPlayerView longVodPlayerView) {
        Intrinsics.m97802h(configType, "configType");
        Intrinsics.m97802h(longVodPlayerView, "longVodPlayerView");
        this.pageName = pageName;
        this.configType = configType;
        this.dataList = dataList;
        this.longVdPlayerBean = longVdPlayerBean;
        this.longVodPlayerView = longVodPlayerView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.DownloadBottomDialogTheme);
        int i11 = C16538a.f55781a[this.configType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m72161u0("dialog_stream_resolution");
            List<C24716b> list = this.dataList;
            if (list != null) {
                for (C24716b c24716b : list) {
                    this.configs.add(c24716b);
                    if (c24716b.m97075e()) {
                        this.curConfig = c24716b;
                    }
                }
                CollectionsKt.m97519A(this.configs, ComparisonsKt.m97601b(new Function1() { // from class: com.transsion.player.longvideo.ui.dialog.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LongVdPlayerConfigDialog.m72164x0((C24716b) obj);
                    }
                }, new Function1() { // from class: com.transsion.player.longvideo.ui.dialog.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LongVdPlayerConfigDialog.m72165y0((C24716b) obj);
                    }
                }));
                return;
            }
            return;
        }
        m72161u0("dialog_stream_speed");
        float fM71856a = C16472v.f55571a.m71856a();
        this.configs.clear();
        for (Float f11 : this.speedConfigs) {
            float fFloatValue = f11.floatValue();
            C24716b c24716b2 = new C24716b(fM71856a == fFloatValue, String.valueOf(fFloatValue), LongVodPlayerConfigType.SPEED);
            this.configs.add(c24716b2);
            if (c24716b2.m97075e()) {
                this.curConfig = c24716b2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Window window;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R$id.ll_root);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC5790i.m27411e(48.0f));
        Iterator it = this.configs.iterator();
        while (true) {
            AttributeSet attributeSet = null;
            Object[] objArr = 0;
            if (!it.hasNext()) {
                break;
            }
            final C24716b c24716b = (C24716b) it.next();
            Context context = view.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            LongVodResolutionMemberView longVodResolutionMemberView = new LongVodResolutionMemberView(context, attributeSet, 2, objArr == true ? 1 : 0);
            longVodResolutionMemberView.setConfig(c24716b, this.longVdPlayerBean);
            longVodResolutionMemberView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.ui.dialog.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LongVdPlayerConfigDialog.m72166z0(this.f55818a, c24716b, view2);
                }
            });
            linearLayout.addView(longVodResolutionMemberView, layoutParams);
            this.itemViewMap.put(c24716b, longVodResolutionMemberView);
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(AbstractC26006c.m102053f() ? com.p282tn.lib.widget.R$style.ActionSheetDialogLeft : com.p282tn.lib.widget.R$style.ActionSheetDialogRight);
        window.setGravity(AbstractC26006c.m102053f() ? GravityCompat.START : GravityCompat.END);
        window.setDimAmount(0.0f);
        window.setBackgroundDrawable(null);
        window.setLayout(AbstractC5776a0.m27313a(140.0f), -1);
        ImmersionBar immersionBarWith = ImmersionBar.with((DialogFragment) this);
        immersionBarWith.hideBar(BarHide.FLAG_HIDE_BAR);
        immersionBarWith.init();
    }
}
