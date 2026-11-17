package com.transsion.home.adapter.suboperate.provider;

import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.suboperate.adapter.C14929e;
import com.transsion.home.bean.AppointSubject;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mg.C25829f;

/* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C14959c extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final Function1 f52319e;

    /* JADX INFO: renamed from: f */
    private final int f52320f;

    /* JADX INFO: renamed from: g */
    private final SimpleDateFormat f52321g;

    public C14959c(Function1 onAppointmentCLick, int i11) {
        Intrinsics.m97802h(onAppointmentCLick, "onAppointmentCLick");
        this.f52319e = onAppointmentCLick;
        this.f52320f = i11;
        this.f52321g = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m67120A(C14959c c14959c, OperateItem operateItem) {
        List<Object> data;
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = c14959c.m36335g();
        if (baseProviderMultiAdapterM36335g != null && (data = baseProviderMultiAdapterM36335g.getData()) != null) {
            data.remove(operateItem);
        }
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g2 = c14959c.m36335g();
        if (baseProviderMultiAdapterM36335g2 != null) {
            baseProviderMultiAdapterM36335g2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: B */
    private final List m67121B(List list) {
        Date date = new Date();
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AppointSubject appointSubject = (AppointSubject) it.next();
                SimpleDateFormat simpleDateFormat = this.f52321g;
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
        return PostItemType.APPOINTMENT_LIST.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_sub_operation_appointment;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ((TextView) helper.getView(R$id.sub_operation_appointment_title)).setText(item.getTitle());
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.sub_operation_appointment_recycle);
        C14929e c14929e = new C14929e(0, this.f52319e, this.f52320f, item, 1, null);
        recyclerView.setAdapter(c14929e);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
        }
        List<AppointSubject> subjects = item.getSubjects();
        if (subjects == null) {
            subjects = new ArrayList<>();
        }
        List listM67121B = m67121B(subjects);
        c14929e.mo36201n1(listM67121B);
        if (listM67121B.isEmpty()) {
            helper.itemView.post(new Runnable() { // from class: com.transsion.home.adapter.suboperate.provider.b
                @Override // java.lang.Runnable
                public final void run() {
                    C14959c.m67120A(this.f52309a, item);
                }
            });
        }
    }
}
