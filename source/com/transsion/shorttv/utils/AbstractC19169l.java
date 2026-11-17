package com.transsion.shorttv.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.base.widget.NpaLinearLayoutManager;
import is.C24223d;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p356ds.AbstractC23047a;
import p765s6.InterfaceC27566d;
import rs.C27351l0;

/* JADX INFO: renamed from: com.transsion.shorttv.utils.l */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC19169l {

    /* JADX INFO: renamed from: a */
    private static final List f61584a = CollectionsKt.m97511q(new ShortTvVideoCtrBean(0.5f, "0.5x"), new ShortTvVideoCtrBean(0.75f, "0.75x"), new ShortTvVideoCtrBean(1.0f, "1x"), new ShortTvVideoCtrBean(1.25f, "1.25x"), new ShortTvVideoCtrBean(1.5f, "1.5x"), new ShortTvVideoCtrBean(1.75f, "1.75x"), new ShortTvVideoCtrBean(2.0f, "2x"));

    /* JADX INFO: renamed from: b */
    public static final List m80252b() {
        return f61584a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m80253c(View view, List dataList, final Function1 itemClickCallback) {
        Intrinsics.m97802h(view, "<this>");
        Intrinsics.m97802h(dataList, "dataList");
        Intrinsics.m97802h(itemClickCallback, "itemClickCallback");
        Context context = view.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.short_tv_layout_video_pop, (ViewGroup) null);
        final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
        C27351l0 c27351l0M106469a = C27351l0.m106469a(viewInflate);
        Intrinsics.m97801g(c27351l0M106469a, "bind(...)");
        c27351l0M106469a.f83266b.setLayoutManager(new NpaLinearLayoutManager(context, 1, false));
        RecyclerView recyclerView = c27351l0M106469a.f83266b;
        C19167j c19167j = new C19167j(dataList);
        c19167j.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv.utils.k
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                AbstractC19169l.m80254d(popupWindow, itemClickCallback, baseQuickAdapter, view2, i11);
            }
        });
        recyclerView.setAdapter(c19167j);
        popupWindow.setOutsideTouchable(true);
        int iM91689a = (AbstractC23047a.m91689a(38) * dataList.size()) + AbstractC23047a.m91689a(4);
        popupWindow.showAsDropDown(view, (view.getWidth() - AbstractC23047a.m91689a(80)) / 2, (-view.getHeight()) - iM91689a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m80254d(PopupWindow popupWindow, Function1 function1, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C24223d.f73737a.m95247a(view.getId(), 1000L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        ShortTvVideoCtrBean shortTvVideoCtrBean = item instanceof ShortTvVideoCtrBean ? (ShortTvVideoCtrBean) item : null;
        if (shortTvVideoCtrBean != null) {
            function1.invoke(shortTvVideoCtrBean);
        }
        popupWindow.dismiss();
    }
}
