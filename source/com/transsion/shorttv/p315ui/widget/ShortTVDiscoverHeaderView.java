package com.transsion.shorttv.p315ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.base.widget.NpaLinearLayoutManager;
import com.transsion.shorttv.bean.AppointSubject;
import com.transsion.shorttv.bean.OperateItem;
import com.transsion.shorttv.bean.PlayListItem;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p315ui.activity.ShortTvListActivity;
import com.transsion.shorttv.p315ui.adapter.ShortTVHeaderViewAdapter;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import is.AbstractC24222c;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p330cs.C22776b;
import p330cs.InterfaceC22775a;
import p356ds.AbstractC23048b;
import p765s6.InterfaceC27566d;
import p919xs.C28653a;
import pg.C26866a;
import rs.C27343h0;
import ss.C27644a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0011B;\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0015J\u000f\u0010 \u001a\u00020\u0013H\u0014¢\u0006\u0004\b \u0010\u0015J\u000f\u0010!\u001a\u00020\u0013H\u0014¢\u0006\u0004\b!\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, m97100d2 = {"Lcom/transsion/shorttv/ui/widget/ShortTVDiscoverHeaderView;", "Landroid/widget/LinearLayout;", "", "pageName", "Lcom/transsion/shorttv/bean/OperateItem;", WebConstants.FIELD_ITEM, "", "tabId", "", "isTablet", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Ljava/lang/String;Lcom/transsion/shorttv/bean/OperateItem;IZLandroid/content/Context;Landroid/util/AttributeSet;I)V", "(Ljava/lang/String;Lcom/transsion/shorttv/bean/OperateItem;IZLandroid/content/Context;)V", "(Ljava/lang/String;Lcom/transsion/shorttv/bean/OperateItem;IZLandroid/content/Context;Landroid/util/AttributeSet;)V", "", "c", "()V", "f", "Lcom/transsion/shorttv/bean/Subject;", "subject", "g", "(Lcom/transsion/shorttv/bean/Subject;)V", "getItemOptType", "()Ljava/lang/String;", "updateData", "(Lcom/transsion/shorttv/bean/OperateItem;)V", "clearExposureCache", "onDetachedFromWindow", "onAttachedToWindow", "a", "Ljava/lang/String;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/shorttv/bean/OperateItem;", "I", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "e", "isRTL", "dp8", "Lrs/h0;", "Lrs/h0;", "viewBinding", "Lcom/transsion/shorttv/ui/adapter/ShortTVHeaderViewAdapter;", "h", "Lcom/transsion/shorttv/ui/adapter/ShortTVHeaderViewAdapter;", "headerAdapter", "Lcs/b;", "i", "Lcs/b;", "exposureHelper", "Lxs/a;", "j", "Lxs/a;", "recReport", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ShortTVDiscoverHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String pageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final OperateItem item;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int tabId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isTablet;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isRTL;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int dp8;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C27343h0 viewBinding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ShortTVHeaderViewAdapter headerAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C22776b exposureHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C28653a recReport;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTVDiscoverHeaderView$a */
    public static final class C19085a implements InterfaceC22775a {
        C19085a() {
        }

        @Override // p330cs.InterfaceC22775a
        /* JADX INFO: renamed from: a */
        public void mo78681a(int i11, long j11, View view) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTVDiscoverHeaderView$b */
    public static final class C19086b extends RecyclerView.AbstractC4213l {
        C19086b() {
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
                    if (ShortTVDiscoverHeaderView.this.isRTL) {
                        outRect.right = ShortTVDiscoverHeaderView.this.dp8 * 2;
                        return;
                    } else {
                        outRect.left = ShortTVDiscoverHeaderView.this.dp8 * 2;
                        return;
                    }
                }
                if (childAdapterPosition == adapter.getItemCount() - 1) {
                    outRect.right = ShortTVDiscoverHeaderView.this.dp8;
                    outRect.left = ShortTVDiscoverHeaderView.this.dp8;
                } else if (ShortTVDiscoverHeaderView.this.isRTL) {
                    outRect.right = ShortTVDiscoverHeaderView.this.dp8;
                } else {
                    outRect.left = ShortTVDiscoverHeaderView.this.dp8;
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTVDiscoverHeaderView(String pageName, OperateItem item, int i11, boolean z11, Context context) {
        this(pageName, item, i11, z11, context, null);
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTVDiscoverHeaderView(String pageName, OperateItem item, int i11, boolean z11, Context context, AttributeSet attributeSet) {
        this(pageName, item, i11, z11, context, attributeSet, 0);
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTVDiscoverHeaderView(String pageName, OperateItem item, int i11, boolean z11, Context context, AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(context, "context");
        this.pageName = pageName;
        this.item = item;
        this.tabId = i11;
        this.isTablet = z11;
        this.isRTL = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.dp8 = AbstractC5776a0.m27313a(8.0f);
        this.recReport = new C28653a();
        View.inflate(context, R$layout.short_tv_layout_discover_header, this);
        C27343h0 c27343h0M106455a = C27343h0.m106455a(this);
        Intrinsics.m97801g(c27343h0M106455a, "bind(...)");
        this.viewBinding = c27343h0M106455a;
        setOrientation(1);
        m80019c();
        m80022f();
    }

    /* JADX INFO: renamed from: c */
    private final void m80019c() {
        this.exposureHelper = new C22776b(0.6f, new C19085a(), false, 4, null);
        this.viewBinding.f83167d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.widget.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVDiscoverHeaderView.m80020d(this.f61493a, view);
            }
        });
        ShortTVHeaderViewAdapter shortTVHeaderViewAdapter = new ShortTVHeaderViewAdapter(this.exposureHelper);
        shortTVHeaderViewAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv.ui.widget.f
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTVDiscoverHeaderView.m80021e(this.f61497a, baseQuickAdapter, view, i11);
            }
        });
        this.headerAdapter = shortTVHeaderViewAdapter;
        RecyclerView recyclerView = this.viewBinding.f83165b;
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new C19086b());
        recyclerView.setAdapter(this.headerAdapter);
        C22776b c22776b = this.exposureHelper;
        Intrinsics.m97799e(c22776b);
        recyclerView.addOnScrollListener(c22776b);
        AppCompatTextView tvViewAll = this.viewBinding.f83167d;
        Intrinsics.m97801g(tvViewAll, "tvViewAll");
        AbstractC23048b.m91692c(tvViewAll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m80020d(ShortTVDiscoverHeaderView shortTVDiscoverHeaderView, View view) {
        C26866a.a.m104899g(C26866a.f81698a, "Click view all", false, 2, null);
        String deepLink = shortTVDiscoverHeaderView.item.getDeepLink();
        if (deepLink == null) {
            PlayListItem playListData = shortTVDiscoverHeaderView.item.getPlayListData();
            deepLink = playListData != null ? playListData.getDeepLink() : null;
        }
        if (deepLink != null) {
            AbstractC24222c.m95241f(deepLink, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m80021e(ShortTVDiscoverHeaderView shortTVDiscoverHeaderView, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            shortTVDiscoverHeaderView.recReport.m110419c("minitv_explore", subject, i11, shortTVDiscoverHeaderView.getItemOptType());
            shortTVDiscoverHeaderView.m80023g(subject);
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m80022f() {
        this.viewBinding.f83166c.setText(this.item.getTitle());
        updateData(this.item);
    }

    /* JADX INFO: renamed from: g */
    private final void m80023g(Subject subject) {
        Context context = getContext();
        if (context != null) {
            String itemOptType = getItemOptType();
            if (Intrinsics.m97797c(itemOptType, "new_release") || Intrinsics.m97797c(itemOptType, "playlist")) {
                C27644a.f84793a.m107539a((FragmentActivity) context, "minitv_explore", subject.getOps(), (64 & 8) != 0 ? null : "download_subject", (64 & 16) != 0 ? false : false, (64 & 32) != 0 ? null : subject, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? Boolean.FALSE : null);
                return;
            }
            String subjectId = subject.getSubjectId();
            if (subjectId != null) {
                ShortTvListActivity.INSTANCE.m79517a(context, subjectId, (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? 0L : 0L, (28 & 16) != 0 ? false : false, (28 & 32) != 0 ? null : subject.getOps());
            }
        }
    }

    private final String getItemOptType() {
        return "playlist";
    }

    public final void clearExposureCache() {
        C22776b c22776b = this.exposureHelper;
        if (c22776b != null) {
            c22776b.m90702e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String title = this.item.getTitle();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("2---onAttachedToWindow title:");
        sb2.append(title);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C22776b c22776b = this.exposureHelper;
        if (c22776b != null) {
            c22776b.m90702e();
        }
        String title = this.item.getTitle();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDetachedFromWindow title:");
        sb2.append(title);
    }

    public final void updateData(OperateItem item) {
        ShortTVHeaderViewAdapter shortTVHeaderViewAdapter;
        Intrinsics.m97802h(item, "item");
        List<AppointSubject> subjects = item.getSubjects();
        if (subjects != null && (shortTVHeaderViewAdapter = this.headerAdapter) != null) {
            shortTVHeaderViewAdapter.mo36201n1(subjects);
        }
        this.viewBinding.f83166c.setText(item.getTitle());
    }
}
