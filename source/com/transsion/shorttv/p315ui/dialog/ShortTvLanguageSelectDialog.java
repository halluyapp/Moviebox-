package com.transsion.shorttv.p315ui.dialog;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.recyclerview.widget.RecyclerView;
import bt.C4880a;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.R$style;
import com.transsion.shorttv.base.dialog.BaseViewBindingDialog;
import com.transsion.shorttv.base.widget.NpaLinearLayoutManager;
import com.transsion.shorttv.bean.DubsInfo;
import com.transsion.shorttv.bean.DubsInfoData;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p315ui.adapter.C18912k;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import is.C24223d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p765s6.InterfaceC27566d;
import p955ys.C29007b;
import pg.C26866a;
import rs.C27366t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0004J!\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R.\u0010E\u001a\u001c\u0012\u0004\u0012\u00020@\u0012\u0006\u0012\u0004\u0018\u00010A\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006H"}, m97100d2 = {"Lcom/transsion/shorttv/ui/dialog/ShortTvLanguageSelectDialog;", "Lcom/transsion/shorttv/base/dialog/BaseViewBindingDialog;", "Lrs/t;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "A0", "(Landroid/view/View;)V", "r0", "initView", "v0", "Lcom/transsion/shorttv/bean/DubsInfoData;", "dubsInfo", "", "currentSubjectId", "w0", "(Lcom/transsion/shorttv/bean/DubsInfoData;Ljava/lang/String;)V", "Lcom/transsion/shorttv/bean/Subject;", "subject", "x0", "(Lcom/transsion/shorttv/bean/Subject;)V", "", NativeComponentConstants.KEY_COMPONENT_TYPE, "D0", "(I)V", "Lkotlin/Function1;", "Lcom/transsion/shorttv/bean/DubsInfo;", "callback", "C0", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "c", "Ljava/lang/String;", "TAG", "Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/Lazy;", "u0", "()Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "shortTvViewModel", "Lbt/a;", "e", "t0", "()Lbt/a;", "shortTvSubViewModel", "Lcom/transsion/shorttv/ui/adapter/k;", "f", "Lcom/transsion/shorttv/ui/adapter/k;", "selectAdapter", "g", "Lkotlin/jvm/functions/Function1;", "h", "I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "l0", "()Lkotlin/jvm/functions/Function3;", "bindingInflater", "i", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvLanguageSelectDialog extends BaseViewBindingDialog<C27366t> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String TAG = "ShortTvLanguageSelectDialog";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy shortTvViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(ShortTvViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv.ui.dialog.ShortTvLanguageSelectDialog$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv.ui.dialog.ShortTvLanguageSelectDialog$special$$inlined$activityViewModels$default$2
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
    private final Lazy shortTvSubViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C4880a.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv.ui.dialog.ShortTvLanguageSelectDialog$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv.ui.dialog.ShortTvLanguageSelectDialog$special$$inlined$activityViewModels$default$4
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
    private C18912k selectAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Function1 callback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int type;

    /* JADX INFO: renamed from: A0 */
    private final void m79714A0(final View view) {
        view.post(new Runnable() { // from class: com.transsion.shorttv.ui.dialog.o
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvLanguageSelectDialog.m79715B0(this.f61118a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m79715B0(ShortTvLanguageSelectDialog shortTvLanguageSelectDialog, View view) {
        int i11 = (int) (shortTvLanguageSelectDialog.getResources().getDisplayMetrics().heightPixels * 0.7f);
        if (view.getMeasuredHeight() > i11) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i11;
            } else {
                layoutParams = null;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    private final void initView() {
        C27366t c27366t;
        AppCompatTextView appCompatTextView;
        RecyclerView recyclerView;
        AppCompatTextView appCompatTextView2;
        AppCompatImageView appCompatImageView;
        C27366t c27366t2 = (C27366t) getViewBinding();
        if (c27366t2 != null && (appCompatImageView = c27366t2.f83329b) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.dialog.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTvLanguageSelectDialog.m79727y0(this.f61116a, view);
                }
            });
        }
        int i11 = this.type;
        if (i11 == 1) {
            C27366t c27366t3 = (C27366t) getViewBinding();
            if (c27366t3 != null && (appCompatTextView2 = c27366t3.f83332e) != null) {
                appCompatTextView2.setText(getString(R$string.short_tv_audio));
            }
        } else if (i11 == 2 && (c27366t = (C27366t) getViewBinding()) != null && (appCompatTextView = c27366t.f83332e) != null) {
            appCompatTextView.setText(getString(R$string.short_tv_subtitles));
        }
        C18912k c18912k = new C18912k();
        c18912k.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv.ui.dialog.m
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                ShortTvLanguageSelectDialog.m79728z0(this.f61117a, baseQuickAdapter, view, i12);
            }
        });
        this.selectAdapter = c18912k;
        C27366t c27366t4 = (C27366t) getViewBinding();
        if (c27366t4 == null || (recyclerView = c27366t4.f83331d) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.selectAdapter);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m79720r0(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: com.transsion.shorttv.ui.dialog.n
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                    return ShortTvLanguageSelectDialog.m79721s0(view2, windowInsetsCompat);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final WindowInsetsCompat m79721s0(View v11, WindowInsetsCompat insets) {
        Intrinsics.m97802h(v11, "v");
        Intrinsics.m97802h(insets, "insets");
        int i11 = insets.getInsets(WindowInsetsCompat.Type.navigationBars()).f88818d;
        if (i11 > 0) {
            v11.setPadding(v11.getPaddingLeft(), v11.getPaddingTop(), v11.getPaddingRight(), i11);
        }
        return insets;
    }

    /* JADX INFO: renamed from: t0 */
    private final C4880a m79722t0() {
        return (C4880a) this.shortTvSubViewModel.getValue();
    }

    /* JADX INFO: renamed from: u0 */
    private final ShortTvViewModel m79723u0() {
        return (ShortTvViewModel) this.shortTvViewModel.getValue();
    }

    /* JADX INFO: renamed from: v0 */
    private final void m79724v0() {
        List<DubsInfo> dubs;
        List<DubsInfo> dubs2;
        DubsInfoData dubsInfoData = (DubsInfoData) m79723u0().m80368Z().m14847f();
        Subject subject = (Subject) m79723u0().m80343H0().m14847f();
        String strM80366Y = m79723u0().m80366Y();
        if (strM80366Y == null) {
            strM80366Y = subject != null ? subject.getSubjectId() : null;
        }
        int i11 = this.type;
        if (i11 == 1) {
            if (dubsInfoData == null || (dubs2 = dubsInfoData.getDubs()) == null || dubs2.isEmpty()) {
                dismissAllowingStateLoss();
                return;
            } else {
                m79725w0(dubsInfoData, strM80366Y);
                return;
            }
        }
        if (i11 == 2) {
            m79726x0(subject);
        } else if (dubsInfoData == null || (dubs = dubsInfoData.getDubs()) == null || dubs.isEmpty()) {
            m79726x0(subject);
        } else {
            m79725w0(dubsInfoData, strM80366Y);
        }
    }

    /* JADX INFO: renamed from: w0 */
    private final void m79725w0(DubsInfoData dubsInfo, String currentSubjectId) {
        ArrayList arrayList;
        List<DubsInfo> dubs = dubsInfo.getDubs();
        if (dubs != null) {
            List<DubsInfo> list = dubs;
            arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                DubsInfo dubsInfoCopy$default = DubsInfo.copy$default((DubsInfo) it.next(), null, null, null, false, 15, null);
                dubsInfoCopy$default.setSelected(Intrinsics.m97797c(dubsInfoCopy$default.getSubjectId(), currentSubjectId));
                arrayList.add(dubsInfoCopy$default);
            }
        } else {
            arrayList = null;
        }
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "initDubsData, size:" + (arrayList != null ? Integer.valueOf(arrayList.size()) : null), false, 4, null);
        C18912k c18912k = this.selectAdapter;
        if (c18912k != null) {
            c18912k.mo36201n1(arrayList);
        }
    }

    /* JADX INFO: renamed from: x0 */
    private final void m79726x0(Subject subject) {
        DubsInfo dubsInfo;
        Object next;
        C29007b subInfo;
        SubtitleDownloadTable subtitleDownloadTableM111561a;
        List<C29007b> list = (List) m79722t0().m23390d().m14847f();
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        if (this.type == 2) {
            boolean z11 = false;
            if (list != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((C29007b) it.next()).m111564d()) {
                            z11 = true;
                            break;
                        }
                    }
                }
            }
            DubsInfo dubsInfo2 = new DubsInfo(subject != null ? subject.getSubjectId() : null, getString(R$string.short_tv_subtitles_off), "off", false, 8, null);
            dubsInfo2.setSubtitle(true);
            dubsInfo2.setSelected(!z11);
            dubsInfo2.setSubInfo(null);
            arrayList.add(dubsInfo2);
        }
        if (list != null) {
            for (C29007b c29007b : list) {
                DubsInfo dubsInfo3 = new DubsInfo(subject != null ? subject.getSubjectId() : null, c29007b.m111561a().getLanName(), c29007b.m111561a().getLan(), false, 8, null);
                dubsInfo3.setSubtitle(true);
                dubsInfo3.setSelected(c29007b.m111564d());
                dubsInfo3.setSubInfo(c29007b);
                arrayList.add(dubsInfo3);
            }
        }
        if (this.type != 2) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "initSubtitleData, size:" + arrayList.size(), false, 4, null);
            C18912k c18912k = this.selectAdapter;
            if (c18912k != null) {
                c18912k.mo36201n1(arrayList);
                return;
            }
            return;
        }
        String strM23389c = m79722t0().m23389c();
        if (strM23389c == null || Intrinsics.m97797c(strM23389c, "OFF")) {
            dubsInfo = null;
        } else {
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    subInfo = ((DubsInfo) next).getSubInfo();
                }
            } while (!Intrinsics.m97797c((subInfo == null || (subtitleDownloadTableM111561a = subInfo.m111561a()) == null) ? null : subtitleDownloadTableM111561a.getId(), strM23389c));
            dubsInfo = (DubsInfo) next;
        }
        for (Object obj2 : arrayList) {
            if (Intrinsics.m97797c(((DubsInfo) obj2).getLanCode(), "off")) {
                obj = obj2;
                break;
            }
        }
        DubsInfo dubsInfo4 = (DubsInfo) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            DubsInfo dubsInfo5 = (DubsInfo) obj3;
            if (!Intrinsics.m97797c(dubsInfo5, dubsInfo) && !Intrinsics.m97797c(dubsInfo5, dubsInfo4)) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (dubsInfo != null) {
            arrayList3.add(dubsInfo);
        }
        if (dubsInfo4 != null) {
            arrayList3.add(dubsInfo4);
        }
        arrayList3.addAll(arrayList2);
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "initSubtitleData, sorted size:" + arrayList3.size() + ", initialId:" + strM23389c, false, 4, null);
        C18912k c18912k2 = this.selectAdapter;
        if (c18912k2 != null) {
            c18912k2.mo36201n1(arrayList3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m79727y0(ShortTvLanguageSelectDialog shortTvLanguageSelectDialog, View view) {
        shortTvLanguageSelectDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m79728z0(ShortTvLanguageSelectDialog shortTvLanguageSelectDialog, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C24223d.f73737a.m95247a(view.getId(), 1000L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        DubsInfo dubsInfo = item instanceof DubsInfo ? (DubsInfo) item : null;
        if (dubsInfo == null) {
            C26866a.a.m104898f(C26866a.f81698a, "ShortTvLan", "item为空？", false, 4, null);
            shortTvLanguageSelectDialog.dismissAllowingStateLoss();
            return;
        }
        if (dubsInfo.getIsSelected()) {
            C26866a.a.m104898f(C26866a.f81698a, "ShortTvLan", "已选中 直接关闭弹窗", false, 4, null);
            shortTvLanguageSelectDialog.dismissAllowingStateLoss();
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvLan", "选中 :" + dubsInfo.getLanName(), false, 4, null);
        Function1 function1 = shortTvLanguageSelectDialog.callback;
        if (function1 != null) {
            function1.invoke(dubsInfo);
        }
        shortTvLanguageSelectDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m79729C0(Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.callback = callback;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m79730D0(int type) {
        this.type = type;
    }

    @Override // com.transsion.shorttv.base.dialog.BaseViewBindingDialog
    /* JADX INFO: renamed from: l0 */
    public Function3 mo79036l0() {
        return ShortTvLanguageSelectDialog$bindingInflater$1.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.ShortTvBottomDialogTheme);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.m97801g(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(R$style.ShortTvBottomDialogAnimation);
            window.setGravity(80);
            window.setDimAmount(0.0f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes == null) {
                attributes = new WindowManager.LayoutParams();
            }
            attributes.width = -1;
            window.setBackgroundDrawable(null);
            window.setAttributes(attributes);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m79724v0();
        m79714A0(view);
        m79720r0(view);
    }
}
