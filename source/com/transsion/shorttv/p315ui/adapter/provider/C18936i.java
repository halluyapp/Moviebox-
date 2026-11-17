package com.transsion.shorttv.p315ui.adapter.provider;

import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.base.widget.C18799m;
import com.transsion.shorttv.bean.AppointSubject;
import com.transsion.shorttv.bean.OperateItem;
import com.transsion.shorttv.bean.ShortTvItemType;
import com.transsion.shorttv.p315ui.adapter.C18950q;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.provider.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C18936i extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final String f61038e;

    /* JADX INFO: renamed from: f */
    private final SimpleDateFormat f61039f;

    public C18936i(String pageName) {
        Intrinsics.m97802h(pageName, "pageName");
        this.f61038e = pageName;
        this.f61039f = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m79599A(C18936i c18936i, OperateItem operateItem) {
        List<Object> data;
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = c18936i.m36335g();
        if (baseProviderMultiAdapterM36335g != null && (data = baseProviderMultiAdapterM36335g.getData()) != null) {
            data.remove(operateItem);
        }
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g2 = c18936i.m36335g();
        if (baseProviderMultiAdapterM36335g2 != null) {
            baseProviderMultiAdapterM36335g2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: B */
    private final List m79600B(List list) {
        Date date = new Date();
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AppointSubject appointSubject = (AppointSubject) it.next();
                SimpleDateFormat simpleDateFormat = this.f61039f;
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

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return ShortTvItemType.APPOINTMENT_LIST.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.short_tv_op_appointment;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ((TextView) helper.getView(R$id.sub_operation_appointment_title)).setText(item.getTitle());
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.sub_operation_appointment_recycle);
        C18950q c18950q = new C18950q(0, this.f61038e, 1, null);
        recyclerView.setAdapter(c18950q);
        recyclerView.setLayoutManager(new LinearLayoutManager(m36338k(), 0, false));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C18799m(8.0f, 0.0f, 12.0f, 2, null));
        }
        List<AppointSubject> subjects = item.getSubjects();
        if (subjects == null) {
            subjects = new ArrayList<>();
        }
        List listM79600B = m79600B(subjects);
        c18950q.mo36201n1(listM79600B);
        if (listM79600B.isEmpty()) {
            helper.itemView.post(new Runnable() { // from class: com.transsion.shorttv.ui.adapter.provider.h
                @Override // java.lang.Runnable
                public final void run() {
                    C18936i.m79599A(this.f61036a, item);
                }
            });
        }
    }
}
