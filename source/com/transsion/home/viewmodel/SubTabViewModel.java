package com.transsion.home.viewmodel;

import android.app.Application;
import android.net.Uri;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import ch.C5096b;
import ck.C5110g;
import ck.C5118o;
import com.blankj.utilcode.util.AbstractC5796o;
import com.google.gson.Gson;
import com.p282tn.lib.net.bean.BaseDto;
import com.tencent.mmkv.MMKV;
import com.transsion.baselib.report.C14489h;
import com.transsion.edcation.CourseManager;
import com.transsion.home.adapter.operateUGC.C14863b;
import com.transsion.home.bean.DisplayMeta;
import com.transsion.home.bean.FeedsLayoutType;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.SubOperateData;
import com.transsion.home.bean.TrendingRequestEntity;
import com.transsion.home.bean.TrendingRespItem;
import com.transsion.home.bean.TrendingRespItemType;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p842vl.C28123e;
import p946yj.C28958a;
import p946yj.C28959b;
import sl.InterfaceC27631e;

/* JADX INFO: loaded from: classes5.dex */
public final class SubTabViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: h */
    public static final C15540a f53664h = new C15540a(null);

    /* JADX INFO: renamed from: i */
    public static final int f53665i = 8;

    /* JADX INFO: renamed from: b */
    private final C3187b0 f53666b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f53667c;

    /* JADX INFO: renamed from: d */
    private final Lazy f53668d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC27631e f53669e;

    /* JADX INFO: renamed from: f */
    private int f53670f;

    /* JADX INFO: renamed from: g */
    private boolean f53671g;

    /* JADX INFO: renamed from: com.transsion.home.viewmodel.SubTabViewModel$a */
    public static final class C15540a {
        private C15540a() {
        }

        public /* synthetic */ C15540a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubTabViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f53666b = new C3187b0();
        this.f53667c = new C3187b0();
        this.f53668d = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubTabViewModel.m68999x();
            }
        });
        this.f53669e = (InterfaceC27631e) C22982c.f70163e.m91553a().m91552h(InterfaceC27631e.class);
        this.f53670f = 1;
        this.f53671g = C5110g.f17601a.m23911b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final List m68993l(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrendingRespItem trendingRespItem = (TrendingRespItem) it.next();
            Integer type = trendingRespItem.getType();
            int value = TrendingRespItemType.SUBJECT.getValue();
            if (type != null && type.intValue() == value && trendingRespItem.getSubject() != null) {
                OperateItem operateItem = new OperateItem(null, PostItemType.SUBJECT.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821, null);
                operateItem.setFeedsSubject(trendingRespItem.getSubject());
                arrayList.add(operateItem);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final List m68994m(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrendingRespItem trendingRespItem = (TrendingRespItem) it.next();
            UGCContent content = trendingRespItem.getContent();
            if ((content != null ? content.getVideo() : null) != null) {
                DisplayMeta displayMeta = trendingRespItem.getDisplayMeta();
                if (Intrinsics.m97797c(displayMeta != null ? displayMeta.getLayoutType() : null, FeedsLayoutType.FULL.getValue())) {
                    String value = PostItemType.TRENDING_FEES_BIG.getValue();
                    UGCContent content2 = trendingRespItem.getContent();
                    arrayList.add(new OperateItem(null, value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, content2 != null ? content2.getVideo() : null, null, null, null, null, null, null, null, null, null, 1072693245, null));
                } else {
                    String value2 = PostItemType.TRENDING_FEES_GRID.getValue();
                    UGCContent content3 = trendingRespItem.getContent();
                    arrayList.add(new OperateItem(null, value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, content3 != null ? content3.getVideo() : null, null, null, null, null, null, null, null, null, null, 1072693245, null));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private final String m68995o(String str, int i11) {
        return str + "_" + i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: r */
    public final Object m68996r(int i11, String str, Continuation continuation) throws Throwable {
        SubTabViewModel$getSubOperation$1 subTabViewModel$getSubOperation$1;
        int i12;
        String str2;
        BaseDto baseDto;
        List<OperateItem> items;
        SubOperateData subOperateData;
        List<OperateItem> items2;
        SubOperateData subOperateData2;
        String version;
        if (continuation instanceof SubTabViewModel$getSubOperation$1) {
            subTabViewModel$getSubOperation$1 = (SubTabViewModel$getSubOperation$1) continuation;
            int i13 = subTabViewModel$getSubOperation$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                subTabViewModel$getSubOperation$1.label = i13 - Integer.MIN_VALUE;
            } else {
                subTabViewModel$getSubOperation$1 = new SubTabViewModel$getSubOperation$1(this, continuation);
            }
        } else {
            subTabViewModel$getSubOperation$1 = new SubTabViewModel$getSubOperation$1(this, continuation);
        }
        SubTabViewModel$getSubOperation$1 subTabViewModel$getSubOperation$2 = subTabViewModel$getSubOperation$1;
        Object objM107497d = subTabViewModel$getSubOperation$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i14 = subTabViewModel$getSubOperation$2.label;
        if (i14 == 0) {
            ResultKt.m97107b(objM107497d);
            String string = C28123e.f86305a.m109233b().getString(m68995o("sub_operation_version_prefix", i11), "");
            if (this.f53671g) {
                InterfaceC27631e interfaceC27631e = this.f53669e;
                subTabViewModel$getSubOperation$2.L$0 = string;
                subTabViewModel$getSubOperation$2.I$0 = i11;
                subTabViewModel$getSubOperation$2.label = 1;
                objM107497d = InterfaceC27631e.a.m107499f(interfaceC27631e, null, i11, string, str, subTabViewModel$getSubOperation$2, 1, null);
                if (objM107497d == objF) {
                    return objF;
                }
                i12 = i11;
                str2 = string;
                baseDto = (BaseDto) objM107497d;
            } else {
                InterfaceC27631e interfaceC27631e2 = this.f53669e;
                subTabViewModel$getSubOperation$2.L$0 = string;
                subTabViewModel$getSubOperation$2.I$0 = i11;
                subTabViewModel$getSubOperation$2.label = 2;
                objM107497d = InterfaceC27631e.a.m107497d(interfaceC27631e2, null, i11, string, subTabViewModel$getSubOperation$2, 1, null);
                if (objM107497d == objF) {
                    return objF;
                }
                i12 = i11;
                str2 = string;
                baseDto = (BaseDto) objM107497d;
            }
        } else if (i14 == 1) {
            i12 = subTabViewModel$getSubOperation$2.I$0;
            str2 = (String) subTabViewModel$getSubOperation$2.L$0;
            ResultKt.m97107b(objM107497d);
            baseDto = (BaseDto) objM107497d;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = subTabViewModel$getSubOperation$2.I$0;
            str2 = (String) subTabViewModel$getSubOperation$2.L$0;
            ResultKt.m97107b(objM107497d);
            baseDto = (BaseDto) objM107497d;
        }
        if (str2 == null || str2.length() == 0 || (subOperateData = (SubOperateData) baseDto.getData()) == null || (items2 = subOperateData.getItems()) == null || !items2.isEmpty() || (subOperateData2 = (SubOperateData) baseDto.getData()) == null || (version = subOperateData2.getVersion()) == null || version.length() <= 0) {
            SubOperateData subOperateData3 = (SubOperateData) baseDto.getData();
            if (subOperateData3 != null && (items = subOperateData3.getItems()) != null && (!items.isEmpty())) {
                String json = new Gson().toJson(baseDto.getData());
                C28123e c28123e = C28123e.f86305a;
                c28123e.m109233b().putString(m68995o("sub_operation_prefix", i12), json);
                MMKV mmkvM109233b = c28123e.m109233b();
                String strM68995o = m68995o("sub_operation_version_prefix", i12);
                SubOperateData subOperateData4 = (SubOperateData) baseDto.getData();
                mmkvM109233b.putString(strM68995o, subOperateData4 != null ? subOperateData4.getVersion() : null);
            }
        } else {
            baseDto.setData(AbstractC5796o.m27441d(C28123e.f86305a.m109233b().getString(m68995o("sub_operation_prefix", i12), ""), SubOperateData.class));
        }
        return baseDto.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m68997u(SubOperateData subOperateData) {
        List<OperateItem> items;
        if (subOperateData == null || (items = subOperateData.getItems()) == null) {
            return;
        }
        for (OperateItem operateItem : items) {
            if (Intrinsics.m97797c(operateItem.getType(), PostItemType.UGC_SUBJECT_LIST.getValue()) && Intrinsics.m97797c(operateItem.getStyleTemplate(), C14863b.f51978O)) {
                operateItem.setType(PostItemType.UGC_VERTICAL_OPT_LIST.getValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final void m68998v(int i11, SubOperateData subOperateData) {
        List<OperateItem> items;
        List<OperateItem> items2;
        if (HomeTabId.INSTANCE.m67539h(Integer.valueOf(i11), true) && !C5118o.f17608a.m23948i()) {
            CourseManager.m66443r(CourseManager.f51684a, null, null, 3, null);
            if (subOperateData != null && (items2 = subOperateData.getItems()) != null) {
                items2.add(1, new OperateItem(null, PostItemType.MY_COURSE.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821, null));
            }
        }
        String trendingTitle = subOperateData != null ? subOperateData.getTrendingTitle() : null;
        if (trendingTitle == null || trendingTitle.length() == 0 || subOperateData == null || (items = subOperateData.getItems()) == null) {
            return;
        }
        items.add(new OperateItem(subOperateData.getTrendingTitle(), PostItemType.FEEDS_TITLE.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C3187b0 m68999x() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: n */
    public final void m69000n(int i11, boolean z11, String str) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new SubTabViewModel$fetchOperateData$1(z11, this, new Ref.ObjectRef(), i11, str, null), 2, null);
    }

    /* JADX INFO: renamed from: p */
    public final C3187b0 m69001p() {
        return this.f53666b;
    }

    /* JADX INFO: renamed from: q */
    public final C3187b0 m69002q() {
        return this.f53667c;
    }

    /* JADX INFO: renamed from: s */
    public final C3187b0 m69003s() {
        return (C3187b0) this.f53668d.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final void m69004t(int i11, String str, boolean z11) {
        String string;
        if (z11) {
            this.f53670f = 1;
        }
        TrendingRequestEntity trendingRequestEntity = new TrendingRequestEntity();
        int i12 = this.f53670f;
        this.f53670f = i12 + 1;
        trendingRequestEntity.setPage(String.valueOf(i12));
        trendingRequestEntity.setPerPage(this.f53671g ? 14 : 12);
        trendingRequestEntity.setSessionId(C5096b.f17579a.m23868h());
        Uri uriM65300c = C14489h.f50945a.m65300c();
        if (uriM65300c == null || (string = uriM65300c.toString()) == null) {
            string = "";
        }
        trendingRequestEntity.setDeepLink(string);
        trendingRequestEntity.setLatest_events(new C28958a(C28959b.f88597a.m111468e()));
        C5118o c5118o = C5118o.f17608a;
        if (c5118o.m23948i()) {
            trendingRequestEntity.setGrade(c5118o.m23945e());
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new SubTabViewModel$getTrendingList$1(trendingRequestEntity, this, str, i11, null), 2, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m69005w(boolean z11) {
        this.f53671g = z11;
    }
}
