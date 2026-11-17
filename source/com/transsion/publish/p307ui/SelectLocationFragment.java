package com.transsion.publish.p307ui;

import android.location.Address;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5122s;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.therouter.TheRouter;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.publish.R$layout;
import com.transsion.publish.R$string;
import com.transsion.publish.adapter.SelectLocationAdapter;
import com.transsion.publish.viewmodel.LocationPlaceViewModel;
import com.transsion.room.api.bean.LocationPlace;
import com.transsion.web.api.WebConstants;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.C24459i;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p415fq.InterfaceC23412c;
import p415fq.InterfaceC23415f;
import p465hp.C23889b;
import p765s6.InterfaceC27566d;
import p913xm.C28615f;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0004J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00109\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0018\u0010<\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001d\u0010O\u001a\u0004\u0018\u00010J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006Q"}, m97100d2 = {"Lcom/transsion/publish/ui/SelectLocationFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Ljp/i;", "<init>", "()V", "", "checkGPS", "t0", "requestCurrentLocation", "A0", "r0", "D0", "F0", "", NativeComponentConstants.KEY_COMPONENT_TYPE, "z0", "(I)V", "", "Lcom/transsion/room/api/bean/LocationPlace;", "list", "G0", "(Ljava/util/List;)V", WebConstants.FIELD_ITEM, "B0", "(Lcom/transsion/room/api/bean/LocationPlace;)V", "Landroid/view/LayoutInflater;", "inflater", "s0", "(Landroid/view/LayoutInflater;)Ljp/i;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "getEmptyDescText", "initViewData", "initViewModel", "initListener", "retryLoadData", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "Lcom/transsion/publish/adapter/SelectLocationAdapter;", "a", "Lcom/transsion/publish/adapter/SelectLocationAdapter;", "mAdapter", "Lcom/transsion/publish/viewmodel/LocationPlaceViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/publish/viewmodel/LocationPlaceViewModel;", "mViewModel", "", "c", "Ljava/lang/Double;", "lat", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "lon", "e", "Ljava/lang/String;", "countryCode", "f", "Lcom/transsion/room/api/bean/LocationPlace;", "curLocationPlace", "g", "Landroid/view/View;", "mLoadingView", "h", "I", "placeType", "Lfq/c;", "i", "Lfq/c;", "mGpsServiceHelper", "Lfq/f;", "j", "Lkotlin/Lazy;", "getMRoomApi", "()Lfq/f;", "mRoomApi", CampaignEx.JSON_KEY_AD_K, "Publish_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SelectLocationFragment extends PageStatusFragment<C24459i> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private SelectLocationAdapter mAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LocationPlaceViewModel mViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Double lat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Double lon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String countryCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private LocationPlace curLocationPlace;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private View mLoadingView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int placeType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private InterfaceC23412c mGpsServiceHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Lazy mRoomApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.publish.ui.r0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SelectLocationFragment.mRoomApi_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectLocationFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SelectLocationFragment m75528a(LocationPlace locationPlace) {
            SelectLocationFragment selectLocationFragment = new SelectLocationFragment();
            selectLocationFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("location_data", locationPlace)));
            return selectLocationFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectLocationFragment$b */
    static final class C17620b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f58188a;

        C17620b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f58188a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f58188a;
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
            this.f58188a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: A0 */
    private final void m75504A0() {
        SelectLocationAdapter selectLocationAdapter = this.mAdapter;
        if (selectLocationAdapter != null) {
            selectLocationAdapter.m75189D1(this.lat, this.lon);
        }
        C26866a.a.m104898f(C26866a.f81698a, "LocationS", "Select--- get location success, placeType:" + this.placeType + ", do next", false, 4, null);
        int i11 = this.placeType;
        if (i11 == 0) {
            m75519r0();
        } else if (i11 == 1) {
            m75509F0();
        } else if (i11 == 2) {
            m75526z0(2);
        }
        if (this.lat == null || this.lon == null) {
            return;
        }
        C14496b.f50966a.m65344b().putString("key_lo_last_lat_lon", this.lat + "," + this.lon);
    }

    /* JADX INFO: renamed from: B0 */
    private final void m75505B0(LocationPlace item) {
        C23889b c23889b = new C23889b();
        c23889b.m94631o(8);
        c23889b.m94630n(1);
        c23889b.m94633q(item);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final Unit m75506C0(SelectLocationFragment selectLocationFragment, LocationPlace locationPlace) {
        if (locationPlace == null) {
            C26866a.a.m104898f(C26866a.f81698a, "LocationS", "Select--- get location fail", false, 4, null);
            selectLocationFragment.showContentView();
            SelectLocationAdapter selectLocationAdapter = selectLocationFragment.mAdapter;
            if (selectLocationAdapter != null) {
                selectLocationAdapter.m36171Y0(selectLocationFragment.getErrorView(false));
            }
            return Unit.f75682a;
        }
        selectLocationFragment.lat = locationPlace.getLat();
        selectLocationFragment.lon = locationPlace.getLon();
        Address locationAddress = locationPlace.getLocationAddress();
        selectLocationFragment.countryCode = locationAddress != null ? locationAddress.getCountryCode() : null;
        selectLocationFragment.curLocationPlace = locationPlace;
        selectLocationFragment.m75504A0();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: D0 */
    private final void m75507D0() {
        Double d11 = this.lat;
        if (d11 != null) {
            double dDoubleValue = d11.doubleValue();
            Double d12 = this.lon;
            if (d12 != null) {
                double dDoubleValue2 = d12.doubleValue();
                InterfaceC23415f mRoomApi = getMRoomApi();
                if (mRoomApi != null) {
                    mRoomApi.mo92967e(dDoubleValue, dDoubleValue2, new Function1() { // from class: com.transsion.publish.ui.y0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SelectLocationFragment.m75508E0(this.f58284a, (List) obj);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final Unit m75508E0(SelectLocationFragment selectLocationFragment, List list) {
        String name;
        String distance;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            selectLocationFragment.m75526z0(0);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((LocationPlace) it.next()).setCountryCode(selectLocationFragment.countryCode);
            }
            LocationPlaceViewModel locationPlaceViewModel = selectLocationFragment.mViewModel;
            if (locationPlaceViewModel != null) {
                locationPlaceViewModel.m75707o(list);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list2);
            LocationPlace locationPlace = selectLocationFragment.curLocationPlace;
            if (locationPlace != null && (name = locationPlace.getName()) != null && name.length() != 0 && (distance = locationPlace.getDistance()) != null && distance.length() != 0) {
                arrayList.add(locationPlace);
            }
            selectLocationFragment.m75510G0(arrayList);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: F0 */
    private final void m75509F0() {
        LocationPlaceViewModel locationPlaceViewModel = this.mViewModel;
        if (locationPlaceViewModel != null) {
            Double d11 = this.lat;
            Double dValueOf = Double.valueOf(d11 != null ? d11.doubleValue() : 0.0d);
            Double d12 = this.lon;
            locationPlaceViewModel.m75705k(dValueOf, Double.valueOf(d12 != null ? d12.doubleValue() : 0.0d));
        }
    }

    /* JADX INFO: renamed from: G0 */
    private final void m75510G0(List list) {
        showContentView();
        if (list.isEmpty()) {
            showEmptyView(false);
            return;
        }
        SelectLocationAdapter selectLocationAdapter = this.mAdapter;
        if (selectLocationAdapter != null) {
            selectLocationAdapter.mo36201n1(CollectionsKt.m97343U0(list));
        }
    }

    private final void checkGPS() {
        LinearLayout linearLayout;
        InterfaceC23412c interfaceC23412c = this.mGpsServiceHelper;
        if (interfaceC23412c == null || !interfaceC23412c.mo77089b()) {
            C24459i mViewBinding = getMViewBinding();
            if (mViewBinding == null || (linearLayout = mViewBinding.f74593b) == null) {
                return;
            }
            AbstractC26006c.m102058k(linearLayout);
            return;
        }
        if (this.lon == null || this.lat == null) {
            C26866a.a.m104905r(C26866a.f81698a, "LocationS", new String[]{"Select---GPS is open, location null, get location----"}, false, 4, null);
            requestCurrentLocation();
        } else {
            C26866a.a.m104905r(C26866a.f81698a, "LocationS", new String[]{"Select---GPS is open, location not null"}, false, 4, null);
            m75504A0();
        }
    }

    private final InterfaceC23415f getMRoomApi() {
        return (InterfaceC23415f) this.mRoomApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23415f mRoomApi_delegate$lambda$0() {
        return (InterfaceC23415f) TheRouter.m61774d(InterfaceC23415f.class, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0032  */
    /* JADX INFO: renamed from: r0 */
    private final void m75519r0() {
        boolean z11;
        Object objM112707constructorimpl;
        C26866a.a.m104898f(C26866a.f81698a, "LocationS", "Select--- client, getCache", false, 4, null);
        String string = C14496b.f50966a.m65344b().getString("key_lo_last_lat_lon", null);
        if (string != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                List listS0 = StringsKt.m98117S0(string, new String[]{","}, false, 0, 6, null);
                if (!listS0.isEmpty()) {
                    Double dS = StringsKt.m98213s((String) listS0.get(0));
                    Double dS2 = StringsKt.m98213s((String) listS0.get(1));
                    Double d11 = this.lat;
                    if (d11 != null && this.lon != null && dS != null && dS2 != null) {
                        C5122s c5122s = C5122s.f17613a;
                        Intrinsics.m97799e(d11);
                        double dDoubleValue = d11.doubleValue();
                        Double d12 = this.lon;
                        Intrinsics.m97799e(d12);
                        z11 = c5122s.m23958b(dDoubleValue, d12.doubleValue(), dS.doubleValue(), dS2.doubleValue()) <= 30000.0f;
                    }
                }
                try {
                    objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th));
                }
            } catch (Throwable th3) {
                th = th3;
                z11 = true;
            }
            Result.m112706boximpl(objM112707constructorimpl);
        } else {
            z11 = true;
        }
        if (z11) {
            LocationPlaceViewModel locationPlaceViewModel = this.mViewModel;
            if (locationPlaceViewModel != null) {
                locationPlaceViewModel.m75703i();
                return;
            }
            return;
        }
        C26866a.f81698a.m104912c("LocationS", "Select--- client 已超距离，清除缓存，使用 getNearbyPlaces", true);
        LocationPlaceViewModel locationPlaceViewModel2 = this.mViewModel;
        if (locationPlaceViewModel2 != null) {
            locationPlaceViewModel2.m75702h();
        }
        m75507D0();
    }

    private final void requestCurrentLocation() {
        InterfaceC23415f mRoomApi;
        showLoadingView();
        FragmentActivity activity = getActivity();
        if (activity == null || (mRoomApi = getMRoomApi()) == null) {
            return;
        }
        mRoomApi.mo92964b(activity, new Function1() { // from class: com.transsion.publish.ui.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectLocationFragment.m75506C0(this.f58280a, (LocationPlace) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    private final void m75520t0() {
        Integer numV;
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sa_use_server_place", true);
        String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
        int iIntValue = 0;
        if (value != null && value.length() != 0 && (numV = StringsKt.m98216v(value)) != null) {
            iIntValue = numV.intValue();
        }
        this.placeType = iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m75521u0(final SelectLocationFragment selectLocationFragment, View view) {
        InterfaceC23412c interfaceC23412c;
        C26866a.a.m104898f(C26866a.f81698a, "LocationS", "Select--- openGPS click", false, 4, null);
        if (selectLocationFragment.getActivity() == null || (interfaceC23412c = selectLocationFragment.mGpsServiceHelper) == null) {
            return;
        }
        interfaceC23412c.mo77088a(new Function1() { // from class: com.transsion.publish.ui.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectLocationFragment.m75522v0(this.f58282a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m75522v0(SelectLocationFragment selectLocationFragment, boolean z11) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (z11) {
            C24459i mViewBinding = selectLocationFragment.getMViewBinding();
            if (mViewBinding != null && (linearLayout2 = mViewBinding.f74593b) != null) {
                AbstractC26006c.m102054g(linearLayout2);
            }
            selectLocationFragment.requestCurrentLocation();
        } else {
            C24459i mViewBinding2 = selectLocationFragment.getMViewBinding();
            if (mViewBinding2 != null && (linearLayout = mViewBinding2.f74593b) != null) {
                AbstractC26006c.m102058k(linearLayout);
            }
        }
        C26866a.a.m104898f(C26866a.f81698a, "LocationS", "Select--- openGPS result:" + z11, false, 4, null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m75523w0(SelectLocationFragment selectLocationFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        LocationPlace locationPlace = item instanceof LocationPlace ? (LocationPlace) item : null;
        if (locationPlace == null) {
            return;
        }
        selectLocationFragment.m75505B0(locationPlace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final Unit m75524x0(SelectLocationFragment selectLocationFragment, List list) {
        String name;
        String distance;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            C26866a.f81698a.m104912c("LocationS", "Select--- server, 无数据", true);
            selectLocationFragment.m75526z0(1);
        } else {
            List listU0 = CollectionsKt.m97343U0(list2);
            C26866a.f81698a.m104912c("LocationS", "Select--- server,有数据展示，count:" + list.size(), true);
            LocationPlace locationPlace = selectLocationFragment.curLocationPlace;
            if (locationPlace != null && (name = locationPlace.getName()) != null && name.length() != 0 && (distance = locationPlace.getDistance()) != null && distance.length() != 0) {
                listU0.add(0, locationPlace);
            }
            selectLocationFragment.m75510G0(listU0);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Unit m75525y0(SelectLocationFragment selectLocationFragment, List list) {
        String name;
        String distance;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            C26866a.f81698a.m104912c("LocationS", "Select--- client 无缓存 getNearbyPlaces", true);
            selectLocationFragment.m75507D0();
        } else {
            List listU0 = CollectionsKt.m97343U0(list2);
            C26866a.f81698a.m104912c("LocationS", "Select--- client, 有缓存，使用缓存数据，count:" + list.size(), true);
            LocationPlace locationPlace = selectLocationFragment.curLocationPlace;
            if (locationPlace != null && (name = locationPlace.getName()) != null && name.length() != 0 && (distance = locationPlace.getDistance()) != null && distance.length() != 0) {
                listU0.add(0, locationPlace);
            }
            selectLocationFragment.m75510G0(listU0);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: z0 */
    private final void m75526z0(int type) {
        String name;
        String distance;
        ArrayList arrayList = new ArrayList();
        LocationPlace locationPlace = this.curLocationPlace;
        if (locationPlace != null && (name = locationPlace.getName()) != null && name.length() != 0 && (distance = locationPlace.getDistance()) != null && distance.length() != 0) {
            arrayList.add(locationPlace);
        }
        m75510G0(arrayList);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getEmptyDescText() {
        String string = Utils.m27275a().getString(R$string.location_fail_tips);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        if (this.mLoadingView == null) {
            this.mLoadingView = LayoutInflater.from(requireContext()).inflate(R$layout.layout_select_location_loading, (ViewGroup) getFlStateView(), false);
        }
        return this.mLoadingView;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatTextView appCompatTextView;
        C24459i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (appCompatTextView = mViewBinding.f74595d) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectLocationFragment.m75521u0(this.f58275a, view);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        RecyclerView recyclerView;
        m75520t0();
        SelectLocationAdapter selectLocationAdapter = new SelectLocationAdapter();
        selectLocationAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.publish.ui.s0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SelectLocationFragment.m75523w0(this.f58272a, baseQuickAdapter, view, i11);
            }
        });
        this.mAdapter = selectLocationAdapter;
        C24459i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f74594c) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.mAdapter);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        LocationPlaceViewModel locationPlaceViewModel = (LocationPlaceViewModel) new C3227v0(this).m14969a(LocationPlaceViewModel.class);
        locationPlaceViewModel.m75706l().m14851j(this, new C17620b(new Function1() { // from class: com.transsion.publish.ui.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectLocationFragment.m75524x0(this.f58277a, (List) obj);
            }
        }));
        locationPlaceViewModel.m75704j().m14851j(this, new C17620b(new Function1() { // from class: com.transsion.publish.ui.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectLocationFragment.m75525y0(this.f58279a, (List) obj);
            }
        }));
        this.mViewModel = locationPlaceViewModel;
        checkGPS();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        LocationPlace locationPlace;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("location_data") : null;
        LocationPlace locationPlace2 = serializable instanceof LocationPlace ? (LocationPlace) serializable : null;
        this.curLocationPlace = locationPlace2;
        C26866a.a aVar = C26866a.f81698a;
        Double lat = locationPlace2 != null ? locationPlace2.getLat() : null;
        LocationPlace locationPlace3 = this.curLocationPlace;
        Double lon = locationPlace3 != null ? locationPlace3.getLon() : null;
        LocationPlace locationPlace4 = this.curLocationPlace;
        String name = locationPlace4 != null ? locationPlace4.getName() : null;
        LocationPlace locationPlace5 = this.curLocationPlace;
        C26866a.a.m104908v(aVar, "LocationS", "Select--- onCreate, lat:" + lat + ", lon：" + lon + " name:" + name + ",distance:" + (locationPlace5 != null ? locationPlace5.getDistance() : null), false, 4, null);
        LocationPlace locationPlace6 = this.curLocationPlace;
        if (locationPlace6 != null) {
            String distance = locationPlace6 != null ? locationPlace6.getDistance() : null;
            if ((distance == null || distance.length() == 0) && (locationPlace = this.curLocationPlace) != null) {
                locationPlace.setDistance("<1m");
            }
            LocationPlace locationPlace7 = this.curLocationPlace;
            this.lat = locationPlace7 != null ? locationPlace7.getLat() : null;
            LocationPlace locationPlace8 = this.curLocationPlace;
            this.lon = locationPlace8 != null ? locationPlace8.getLon() : null;
            LocationPlace locationPlace9 = this.curLocationPlace;
            this.countryCode = locationPlace9 != null ? locationPlace9.getCountryCode() : null;
        }
        InterfaceC23415f mRoomApi = getMRoomApi();
        this.mGpsServiceHelper = mRoomApi != null ? mRoomApi.mo92968f(this) : null;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        requestCurrentLocation();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C24459i getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24459i c24459iM95975c = C24459i.m95975c(inflater);
        Intrinsics.m97801g(c24459iM95975c, "inflate(...)");
        return c24459iM95975c;
    }
}
