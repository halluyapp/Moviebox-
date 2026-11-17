package com.transsion.member;

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
    private static final SparseIntArray f54126a = new SparseIntArray(0);

    /* JADX INFO: renamed from: com.transsion.member.DataBinderMapperImpl$a */
    private static class C15748a {

        /* JADX INFO: renamed from: a */
        static final HashMap f54127a = new HashMap(0);
    }

    @Override // androidx.databinding.AbstractC2812e
    /* JADX INFO: renamed from: a */
    public List mo12931a() {
        ArrayList arrayList = new ArrayList(21);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.p282tn.lib.net.DataBinderMapperImpl());
        arrayList.add(new com.p282tn.lib.thread.DataBinderMapperImpl());
        arrayList.add(new com.p282tn.lib.widget.DataBinderMapperImpl());
        arrayList.add(new com.transsion.p285ad.DataBinderMapperImpl());
        arrayList.add(new com.transsion.base.dialog.DataBinderMapperImpl());
        arrayList.add(new com.transsion.base.image.DataBinderMapperImpl());
        arrayList.add(new com.transsion.base.report.DataBinderMapperImpl());
        arrayList.add(new com.transsion.baselib.DataBinderMapperImpl());
        arrayList.add(new com.transsion.baseui.DataBinderMapperImpl());
        arrayList.add(new com.transsion.baseui.utils.DataBinderMapperImpl());
        arrayList.add(new com.transsion.commercialization.DataBinderMapperImpl());
        arrayList.add(new com.transsion.commercializationapi.DataBinderMapperImpl());
        arrayList.add(new com.transsion.downloadapi.DataBinderMapperImpl());
        arrayList.add(new com.transsion.fissionapi.DataBinderMapperImpl());
        arrayList.add(new com.transsion.lib_web.DataBinderMapperImpl());
        arrayList.add(new com.transsion.memberapi.DataBinderMapperImpl());
        arrayList.add(new com.transsion.payment.lib.DataBinderMapperImpl());
        arrayList.add(new com.transsion.rewardscenterapi.DataBinderMapperImpl());
        arrayList.add(new com.transsion.web.DataBinderMapperImpl());
        arrayList.add(new com.transsnet.downloader.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.AbstractC2812e
    /* JADX INFO: renamed from: b */
    public ViewDataBinding mo12888b(InterfaceC2813f interfaceC2813f, View view, int i11) {
        if (f54126a.get(i11) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.AbstractC2812e
    /* JADX INFO: renamed from: c */
    public int mo12889c(String str) {
        Integer num;
        if (str == null || (num = (Integer) C15748a.f54127a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
