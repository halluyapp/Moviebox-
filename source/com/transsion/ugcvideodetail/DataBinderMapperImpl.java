package com.transsion.ugcvideodetail;

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
    private static final SparseIntArray f64001a = new SparseIntArray(0);

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.DataBinderMapperImpl$a */
    private static class C20141a {

        /* JADX INFO: renamed from: a */
        static final HashMap f64002a = new HashMap(0);
    }

    @Override // androidx.databinding.AbstractC2812e
    /* JADX INFO: renamed from: a */
    public List mo12931a() {
        ArrayList arrayList = new ArrayList(38);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.avery.subtitle.DataBinderMapperImpl());
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
        arrayList.add(new com.transsion.commercializationapi.DataBinderMapperImpl());
        arrayList.add(new com.transsion.downloadapi.DataBinderMapperImpl());
        arrayList.add(new com.transsion.edcation.DataBinderMapperImpl());
        arrayList.add(new com.transsion.fissionapi.DataBinderMapperImpl());
        arrayList.add(new com.transsion.homeapi.DataBinderMapperImpl());
        arrayList.add(new com.transsion.lib_web.DataBinderMapperImpl());
        arrayList.add(new com.transsion.libpreloader.DataBinderMapperImpl());
        arrayList.add(new com.transsion.p299mb.config.DataBinderMapperImpl());
        arrayList.add(new com.transsion.memberapi.DataBinderMapperImpl());
        arrayList.add(new com.transsion.moviedetail.DataBinderMapperImpl());
        arrayList.add(new com.transsion.mpush.DataBinderMapperImpl());
        arrayList.add(new com.transsion.ninegridview.DataBinderMapperImpl());
        arrayList.add(new com.transsion.play.detail.DataBinderMapperImpl());
        arrayList.add(new com.transsion.player.DataBinderMapperImpl());
        arrayList.add(new com.transsion.player.longvideo.DataBinderMapperImpl());
        arrayList.add(new com.transsion.postdetailapi.DataBinderMapperImpl());
        arrayList.add(new com.transsion.publish.DataBinderMapperImpl());
        arrayList.add(new com.transsion.share.DataBinderMapperImpl());
        arrayList.add(new com.transsion.shorttv.DataBinderMapperImpl());
        arrayList.add(new com.transsion.subtitle.DataBinderMapperImpl());
        arrayList.add(new com.transsion.subtitle_download.DataBinderMapperImpl());
        arrayList.add(new com.transsion.usercenter.DataBinderMapperImpl());
        arrayList.add(new com.transsion.videofloat.DataBinderMapperImpl());
        arrayList.add(new com.transsion.web.DataBinderMapperImpl());
        arrayList.add(new com.transsnet.downloader.DataBinderMapperImpl());
        arrayList.add(new com.transsnet.flow.event.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.AbstractC2812e
    /* JADX INFO: renamed from: b */
    public ViewDataBinding mo12888b(InterfaceC2813f interfaceC2813f, View view, int i11) {
        if (f64001a.get(i11) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.AbstractC2812e
    /* JADX INFO: renamed from: c */
    public int mo12889c(String str) {
        Integer num;
        if (str == null || (num = (Integer) C20141a.f64002a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
