package com.transsion.shorttv_pugc.p317ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.base.widget.C19263k;
import com.transsion.shorttv_pugc.bean.AppointSubject;
import com.transsion.shorttv_pugc.bean.OperateItem;
import com.transsion.shorttv_pugc.p317ui.adapter.C19331n;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rs.C27342h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0011B;\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0012J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/widget/ShortTvOpAppointmentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "pageName", "Lcom/transsion/shorttv_pugc/bean/OperateItem;", WebConstants.FIELD_ITEM, "", "tabId", "", "isTablet", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Ljava/lang/String;Lcom/transsion/shorttv_pugc/bean/OperateItem;IZLandroid/content/Context;Landroid/util/AttributeSet;I)V", "(Ljava/lang/String;Lcom/transsion/shorttv_pugc/bean/OperateItem;IZLandroid/content/Context;)V", "(Ljava/lang/String;Lcom/transsion/shorttv_pugc/bean/OperateItem;IZLandroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/transsion/shorttv_pugc/bean/AppointSubject;", "list", "h", "(Ljava/util/List;)Ljava/util/List;", "", "updateData", "(Lcom/transsion/shorttv_pugc/bean/OperateItem;)V", "a", "Ljava/lang/String;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/shorttv_pugc/bean/OperateItem;", "c", "I", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "Lrs/h;", "e", "Lrs/h;", "viewBinding", "Lcom/transsion/shorttv_pugc/ui/adapter/n;", "f", "Lcom/transsion/shorttv_pugc/ui/adapter/n;", "mAdapter", "Ljava/text/SimpleDateFormat;", "g", "Ljava/text/SimpleDateFormat;", "dateFormat", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ShortTvOpAppointmentView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String pageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final OperateItem item;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int tabId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isTablet;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27342h viewBinding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private C19331n mAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final SimpleDateFormat dateFormat;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvOpAppointmentView(String pageName, OperateItem item, int i11, boolean z11, Context context) {
        this(pageName, item, i11, z11, context, null);
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvOpAppointmentView(String pageName, OperateItem item, int i11, boolean z11, Context context, AttributeSet attributeSet) {
        this(pageName, item, i11, z11, context, attributeSet, 0);
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvOpAppointmentView(String pageName, OperateItem item, int i11, boolean z11, Context context, AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(context, "context");
        this.pageName = pageName;
        this.item = item;
        this.tabId = i11;
        this.isTablet = z11;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        View.inflate(context, R$layout.pugc_short_tv_op_appointment, this);
        C27342h c27342hM106453a = C27342h.m106453a(this);
        Intrinsics.m97801g(c27342hM106453a, "bind(...)");
        this.viewBinding = c27342hM106453a;
        c27342hM106453a.f83163c.setText(item.getTitle());
        C19331n c19331n = new C19331n(0, pageName, 1, null);
        this.mAdapter = c19331n;
        RecyclerView recyclerView = c27342hM106453a.f83162b;
        recyclerView.setAdapter(c19331n);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C19263k(8.0f, 0.0f, 12.0f, 2, null));
        }
        List<AppointSubject> subjects = item.getSubjects();
        c19331n.mo36201n1(m81208h(subjects == null ? new ArrayList<>() : subjects));
    }

    /* JADX INFO: renamed from: h */
    private final List m81208h(List list) {
        Date date = new Date();
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AppointSubject appointSubject = (AppointSubject) it.next();
                SimpleDateFormat simpleDateFormat = this.dateFormat;
                String appointmentDate = appointSubject.getAppointmentDate();
                if (appointmentDate == null) {
                    appointmentDate = "";
                }
                Date date2 = simpleDateFormat.parse(appointmentDate);
                if (date2 != null && date2.after(date)) {
                    arrayList.add(appointSubject);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    public final void updateData(OperateItem item) {
        Intrinsics.m97802h(item, "item");
        C19331n c19331n = this.mAdapter;
        if (c19331n != null) {
            c19331n.m80841Z1(item);
        }
        this.viewBinding.f83163c.setText(item.getTitle());
        List<AppointSubject> subjects = item.getSubjects();
        if (subjects == null) {
            subjects = new ArrayList<>();
        }
        List listM81208h = m81208h(subjects);
        C19331n c19331n2 = this.mAdapter;
        if (c19331n2 != null) {
            c19331n2.mo36201n1(listM81208h);
        }
    }
}
