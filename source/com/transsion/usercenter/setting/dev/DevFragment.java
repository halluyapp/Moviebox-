package com.transsion.usercenter.setting.dev;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.fragment.BaseListFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dk.C22989b;
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
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m97100d2 = {"Lcom/transsion/usercenter/setting/dev/DevFragment;", "Lcom/transsion/baseui/fragment/BaseListFragment;", "", "<init>", "()V", "s0", "()Ljava/lang/String;", "getPageStateLayoutTitle", "", "isShowPageStateLayoutTitle", "()Z", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "m0", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "G0", "loadMore", "initViewModel", "lazyLoadData", "retryLoadData", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "page", "c", "pageSize", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "id", "e", "Z", "isSetRvEmptyLayout", "Lcom/transsion/usercenter/setting/dev/f;", "f", "Lkotlin/Lazy;", "R0", "()Lcom/transsion/usercenter/setting/dev/f;", "mViewModel", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class DevFragment extends BaseListFragment<String> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int page;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isSetRvEmptyLayout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int pageSize = 10;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String id = "ID:001";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy mViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.dev.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DevFragment.m85697U0();
        }
    });

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.dev.DevFragment$a */
    static final class C20802a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65462a;

        C20802a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65462a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65462a;
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
            this.f65462a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private final C20808f m85694R0() {
        return (C20808f) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final Unit m85695S0(DevFragment devFragment, List list) {
        List<Object> data;
        List<Object> data2;
        devFragment.changeLoadingState(false);
        if (devFragment.isSetRvEmptyLayout) {
            BaseListFragment.m65523K0(devFragment, null, 1, null);
            devFragment.m65536I0(false);
            return Unit.f75682a;
        }
        devFragment.page++;
        if (devFragment.m65529A0()) {
            if (list == null) {
                BaseListFragment.m65523K0(devFragment, null, 1, null);
            } else {
                BaseQuickAdapter mBaseAdapter = devFragment.getMBaseAdapter();
                if (mBaseAdapter != null) {
                    mBaseAdapter.mo36201n1(list);
                }
            }
            devFragment.m65536I0(false);
            return Unit.f75682a;
        }
        if (list == null) {
            devFragment.m65532E0();
        } else {
            BaseQuickAdapter mBaseAdapter2 = devFragment.getMBaseAdapter();
            if (((mBaseAdapter2 == null || (data2 = mBaseAdapter2.getData()) == null) ? 0 : data2.size()) > 20) {
                devFragment.m65532E0();
                return Unit.f75682a;
            }
            BaseQuickAdapter mBaseAdapter3 = devFragment.getMBaseAdapter();
            if (((mBaseAdapter3 == null || (data = mBaseAdapter3.getData()) == null) ? 0 : data.size()) > 30) {
                BaseListFragment.m65522D0(devFragment, false, 1, null);
            } else {
                BaseQuickAdapter mBaseAdapter4 = devFragment.getMBaseAdapter();
                if (mBaseAdapter4 != null) {
                    mBaseAdapter4.mo36208q(list);
                }
                devFragment.m65530B0();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final void m85696T0(DevFragment devFragment) {
        devFragment.m85694R0().m85702e(devFragment.page, devFragment.pageSize, devFragment.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C20808f m85697U0() {
        return new C20808f();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: G0 */
    public void mo65534G0() {
        this.page = 0;
        lazyLoadData();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "无网络、无数据的时候展示的标题";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m85694R0().m85701d().m14851j(this, new C20802a(new Function1() { // from class: com.transsion.usercenter.setting.dev.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DevFragment.m85695S0(this.f65464a, (List) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        ConstraintLayout root;
        BaseListFragment.m65524M0(this, null, 1, null);
        C22989b c22989b = (C22989b) getMViewBinding();
        if (c22989b == null || (root = c22989b.getRoot()) == null) {
            return;
        }
        root.postDelayed(new Runnable() { // from class: com.transsion.usercenter.setting.dev.b
            @Override // java.lang.Runnable
            public final void run() {
                DevFragment.m85696T0(this.f65463a);
            }
        }, 3000L);
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    public void loadMore() {
        lazyLoadData();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: m0 */
    public BaseQuickAdapter mo65540m0() {
        return new C20806d();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        C28951b.f88586a.m111455e("联网重试");
        lazyLoadData();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: s0 */
    public String mo65546s0() {
        return "我是标题";
    }
}
