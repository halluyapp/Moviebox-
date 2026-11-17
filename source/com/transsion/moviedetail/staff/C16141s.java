package com.transsion.moviedetail.staff;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.R$layout;
import com.transsion.moviedetail.R$mipmap;
import com.transsion.moviedetail.R$string;
import com.transsion.moviedetail.adapter.C15921b;
import com.transsion.moviedetail.staff.bean.MovieStaffList;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mg.C25829f;
import p462hj.C23860f;
import p581ln.C25651a;
import p765s6.InterfaceC27566d;

/* JADX INFO: renamed from: com.transsion.moviedetail.staff.s */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0018\u0019\u001a\u001bBS\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00126\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m97100d2 = {"Lcom/transsion/moviedetail/staff/s;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "", "", "staffId", "", "staffType", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "firstPosition", "lastPosition", "", "staffScrollCallback", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;)V", "", "data", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "G", "Ljava/lang/Integer;", "H", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C16141s extends BaseProviderMultiAdapter<Object> {

    /* JADX INFO: renamed from: I */
    public static final int f54862I = 1;

    /* JADX INFO: renamed from: J */
    public static final int f54863J = 2;

    /* JADX INFO: renamed from: K */
    public static final int f54864K = 3;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Integer staffType;

    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.s$b */
    private static final class b extends BaseItemProvider {
        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: b */
        public void mo22757b(BaseViewHolder helper, Object item) {
            Intrinsics.m97802h(helper, "helper");
            Intrinsics.m97802h(item, "item");
            if (item instanceof C25651a) {
                C25651a c25651a = (C25651a) item;
                if (c25651a.m100968a() >= c25651a.m100970c()) {
                    helper.setText(R$id.tv_load, R$string.movie_staff_show_less);
                    helper.setImageResource(R$id.iv_arrow, R$mipmap.movie_arrow_up);
                } else {
                    helper.setText(R$id.tv_load, R$string.movie_staff_show_more);
                    helper.setImageResource(R$id.iv_arrow, R$mipmap.movie_arrow_down);
                }
            }
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 2;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.movie_staff_item_more;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.s$c */
    static final class c extends BaseItemProvider {

        /* JADX INFO: renamed from: e */
        private final String f54866e;

        /* JADX INFO: renamed from: f */
        private final Function2 f54867f;

        /* JADX INFO: renamed from: com.transsion.moviedetail.staff.s$c$a */
        public static final class a extends RecyclerView.AbstractC4219r {
            a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
            public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
                Intrinsics.m97802h(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i11, i12);
                RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
                Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition != null) {
                    Rect rect = new Rect();
                    viewFindViewByPosition.getLocalVisibleRect(rect);
                    if ((rect.width() * 100) / viewFindViewByPosition.getWidth() < 70) {
                        iFindFirstVisibleItemPosition++;
                    }
                }
                View viewFindViewByPosition2 = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition);
                if (viewFindViewByPosition2 != null) {
                    Rect rect2 = new Rect();
                    viewFindViewByPosition2.getLocalVisibleRect(rect2);
                    if ((rect2.width() * 100) / viewFindViewByPosition2.getWidth() < 70) {
                        iFindLastVisibleItemPosition--;
                    }
                }
                c.this.m70736A().invoke(Integer.valueOf(iFindFirstVisibleItemPosition), Integer.valueOf(iFindLastVisibleItemPosition));
            }
        }

        public c(String str, Function2 callback) {
            Intrinsics.m97802h(callback, "callback");
            this.f54866e = str;
            this.f54867f = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public static final void m70735z(c cVar, BaseQuickAdapter adapter, View v11, int i11) {
            Intrinsics.m97802h(adapter, "adapter");
            Intrinsics.m97802h(v11, "v");
            Object item = adapter.getItem(i11);
            Intrinsics.m97800f(item, "null cannot be cast to non-null type com.transsion.moviedetailapi.bean.Staff");
            Staff staff = (Staff) item;
            Navigator.m61845x(TheRouter.m61773c("/movie/staff").m61856J("staff", staff), v11.getContext(), null, 2, null);
            HashMap map = new HashMap();
            map.put("module_name", "staff");
            String str = cVar.f54866e;
            if (str == null) {
                str = "";
            }
            map.put("staff_id", str);
            String staffId = staff.getStaffId();
            map.put("related_staff_id", staffId != null ? staffId : "");
            C14450a.f50860a.m65146i("staff_info", map);
        }

        /* JADX INFO: renamed from: A */
        public final Function2 m70736A() {
            return this.f54867f;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: b */
        public void mo22757b(BaseViewHolder helper, Object item) {
            Intrinsics.m97802h(helper, "helper");
            Intrinsics.m97802h(item, "item");
            RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.f54423rv);
            if (item instanceof MovieStaffList) {
                if (recyclerView.getLayoutManager() == null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(m36338k(), 0, false));
                }
                if (recyclerView.getItemDecorationCount() <= 0) {
                    recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
                }
                if (recyclerView.getAdapter() == null) {
                    List<Staff> items = ((MovieStaffList) item).getItems();
                    if (items == null) {
                        items = Collections.emptyList();
                        Intrinsics.m97801g(items, "emptyList(...)");
                    }
                    C15921b c15921b = new C15921b(items);
                    c15921b.m36227w1(new InterfaceC27566d() { // from class: com.transsion.moviedetail.staff.t
                        @Override // p765s6.InterfaceC27566d
                        /* JADX INFO: renamed from: a */
                        public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                            C16141s.c.m70735z(this.f54870a, baseQuickAdapter, view, i11);
                        }
                    });
                    recyclerView.setAdapter(c15921b);
                    recyclerView.addOnScrollListener(new a());
                }
            }
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 3;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.movie_staff_item_related;
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.s$d */
    private static final class d extends BaseItemProvider {

        /* JADX INFO: renamed from: e */
        private final Integer f54869e;

        public d(Integer num) {
            this.f54869e = num;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: b */
        public void mo22757b(BaseViewHolder helper, Object item) {
            String url;
            String thumbnail;
            Intrinsics.m97802h(helper, "helper");
            Intrinsics.m97802h(item, "item");
            if (item instanceof Subject) {
                ShapeableImageView shapeableImageView = (ShapeableImageView) helper.getViewOrNull(R$id.iv_cover);
                if (shapeableImageView != null) {
                    Integer num = this.f54869e;
                    if (num != null && num.intValue() == 6) {
                        ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
                        ConstraintLayout.C2308b c2308b = null;
                        ConstraintLayout.C2308b c2308b2 = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
                        if (c2308b2 != null) {
                            c2308b2.f7934I = "h,160:90";
                            c2308b = c2308b2;
                        }
                        shapeableImageView.setLayoutParams(c2308b);
                    }
                    C23860f.a aVar = C23860f.f72909a;
                    Context context = shapeableImageView.getContext();
                    Intrinsics.m97801g(context, "getContext(...)");
                    C23860f.b bVarM94457m = aVar.m94457m(context);
                    Subject subject = (Subject) item;
                    Cover cover = subject.getCover();
                    String str = "";
                    if (cover == null || (url = cover.getUrl()) == null) {
                        url = "";
                    }
                    C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
                    Cover cover2 = subject.getCover();
                    if (cover2 != null && (thumbnail = cover2.getThumbnail()) != null) {
                        str = thumbnail;
                    }
                    bVarM94468g.m94473l(str).m94465d(shapeableImageView);
                }
                AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getViewOrNull(R$id.tv_title);
                if (appCompatTextView != null) {
                    appCompatTextView.setText(((Subject) item).getTitle());
                }
            }
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 1;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.movie_staff_item_subject;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16141s(String str, Integer num, Function2<? super Integer, ? super Integer, Unit> staffScrollCallback) {
        super(null, 1, null);
        Intrinsics.m97802h(staffScrollCallback, "staffScrollCallback");
        this.staffType = num;
        mo36107F1(new b());
        mo36107F1(new c(str, staffScrollCallback));
        mo36107F1(new d(num));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends Object> data, int position) {
        Intrinsics.m97802h(data, "data");
        if (data.get(position) instanceof Subject) {
            return 1;
        }
        return data.get(position) instanceof C25651a ? 2 : 3;
    }
}
