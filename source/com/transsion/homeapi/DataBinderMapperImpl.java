package com.transsion.homeapi;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC2812e;
import androidx.databinding.InterfaceC2813f;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class DataBinderMapperImpl extends AbstractC2812e {

    /* JADX INFO: renamed from: a */
    private static final SparseIntArray f53736a = new SparseIntArray(0);

    /* JADX INFO: renamed from: com.transsion.homeapi.DataBinderMapperImpl$a */
    private static class C15586a {

        /* JADX INFO: renamed from: a */
        static final HashMap f53737a = new HashMap(0);
    }

    @Override // androidx.databinding.AbstractC2812e
    /* JADX INFO: renamed from: a */
    public List mo12931a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.AbstractC2812e
    /* JADX INFO: renamed from: b */
    public ViewDataBinding mo12888b(InterfaceC2813f interfaceC2813f, View view, int i11) {
        if (f53736a.get(i11) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.AbstractC2812e
    /* JADX INFO: renamed from: c */
    public int mo12889c(String str) {
        Integer num;
        if (str == null || (num = (Integer) C15586a.f53737a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
