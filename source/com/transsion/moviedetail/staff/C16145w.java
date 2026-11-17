package com.transsion.moviedetail.staff;

import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.util.AbstractC2480k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.transsion.baselib.helper.C14450a;
import com.transsion.moviedetailapi.bean.Staff;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.moviedetail.staff.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C16145w {

    /* JADX INFO: renamed from: c */
    private List f54888c;

    /* JADX INFO: renamed from: a */
    private int f54886a = -1;

    /* JADX INFO: renamed from: b */
    private int f54887b = -1;

    /* JADX INFO: renamed from: d */
    private SparseArray f54889d = new SparseArray();

    /* JADX INFO: renamed from: e */
    private HashSet f54890e = new HashSet();

    /* JADX INFO: renamed from: a */
    public final int m70742a() {
        return this.f54886a;
    }

    /* JADX INFO: renamed from: b */
    public final int m70743b() {
        return this.f54887b;
    }

    /* JADX INFO: renamed from: c */
    public final void m70744c(int i11, long j11) {
        String staffId;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("reportBrowseEvent  staff----  position:");
            sb2.append(i11);
            sb2.append("  duration:");
            sb2.append(j11);
            List list = this.f54888c;
            Staff staff = list != null ? (Staff) list.get(i11) : null;
            if (this.f54890e.add(staff != null ? staff.getStaffId() : null)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("item_type", "staff");
                if (staff == null || (staffId = staff.getStaffId()) == null) {
                    staffId = "";
                }
                linkedHashMap.put("staff_id", staffId);
                linkedHashMap.put(RequestParameters.POSITION, String.valueOf(i11));
                linkedHashMap.put("browse_duration", String.valueOf(j11));
                C14450a.f50860a.m65142e("staff_info", linkedHashMap);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m70745d(int i11, int i12) {
        int i13 = this.f54886a;
        if (i13 == i11 && this.f54887b == i12) {
            return;
        }
        if (i13 >= 0 && this.f54887b >= 0) {
            ArrayList arrayList = new ArrayList();
            IntIterator intIteratorM12070a = AbstractC2480k.m12070a(this.f54889d);
            while (intIteratorM12070a.hasNext()) {
                int iIntValue = intIteratorM12070a.next().intValue();
                if (i11 > iIntValue || iIntValue > i12) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Object obj = this.f54889d.get(iIntValue);
                    Intrinsics.m97801g(obj, "get(...)");
                    m70744c(iIntValue, jElapsedRealtime - ((Number) obj).longValue());
                    arrayList.add(Integer.valueOf(iIntValue));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f54889d.remove(((Number) it.next()).intValue());
            }
            if (i11 <= i12) {
                int i14 = i11;
                while (true) {
                    if (this.f54889d.get(i14) == null) {
                        this.f54889d.put(i14, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                    if (i14 == i12) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        } else if (i11 <= i12) {
            int i15 = i11;
            while (true) {
                this.f54889d.put(i15, Long.valueOf(SystemClock.elapsedRealtime()));
                if (i15 == i12) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f54886a = i11;
        this.f54887b = i12;
    }

    /* JADX INFO: renamed from: e */
    public final void m70746e(List list) {
        this.f54888c = list;
    }
}
