package com.transsion.postdetailapi;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC2812e;
import androidx.databinding.InterfaceC2813f;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DataBinderMapperImpl extends AbstractC2812e {

    /* JADX INFO: renamed from: a */
    private static final SparseIntArray f57942a = new SparseIntArray(0);

    /* JADX INFO: renamed from: com.transsion.postdetailapi.DataBinderMapperImpl$a */
    private static class C17536a {

        /* JADX INFO: renamed from: a */
        static final HashMap f57943a = new HashMap(0);
    }

    @Override // androidx.databinding.AbstractC2812e
    /* JADX INFO: renamed from: a */
    public List mo12931a() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.transsion.p285ad.DataBinderMapperImpl());
        arrayList.add(new com.transsion.baselib.DataBinderMapperImpl());
        arrayList.add(new com.transsion.shorttv.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.AbstractC2812e
    /* JADX INFO: renamed from: b */
    public ViewDataBinding mo12888b(InterfaceC2813f interfaceC2813f, View view, int i11) {
        if (f57942a.get(i11) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.AbstractC2812e
    /* JADX INFO: renamed from: c */
    public int mo12889c(String str) {
        Integer num;
        if (str == null || (num = (Integer) C17536a.f57943a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
