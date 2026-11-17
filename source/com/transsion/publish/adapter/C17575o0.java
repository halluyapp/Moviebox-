package com.transsion.publish.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.PagerAdapter;
import com.bumptech.glide.Glide;
import com.transsion.publish.R$id;
import com.transsion.publish.R$layout;
import com.transsion.publish.api.PhotoEntity;
import com.transsion.publish.view.ZoomImageView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.publish.adapter.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17575o0 extends PagerAdapter {

    /* JADX INFO: renamed from: a */
    private List f58084a;

    /* JADX INFO: renamed from: b */
    private int f58085b;

    public C17575o0(List list) {
        this.f58084a = list != null ? CollectionsKt.m97343U0(list) : null;
    }

    /* JADX INFO: renamed from: a */
    private final View m75287a(Context context, int i11) {
        return LayoutInflater.from(context).inflate(i11, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: b */
    private final void m75288b(ZoomImageView zoomImageView, String str) {
        Glide.with(zoomImageView).load2(str).into(zoomImageView);
    }

    /* JADX INFO: renamed from: c */
    public final void m75289c(List list) {
        this.f58084a = list;
        this.f58085b = getCount();
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup container, int i11, Object object) {
        Intrinsics.m97802h(container, "container");
        Intrinsics.m97802h(object, "object");
        container.removeView((View) object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List list = this.f58084a;
        Intrinsics.m97799e(list);
        return list.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object object) {
        Intrinsics.m97802h(object, "object");
        int i11 = this.f58085b;
        if (i11 <= 0) {
            return super.getItemPosition(object);
        }
        this.f58085b = i11 - 1;
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup container, int i11) {
        ViewParent parent;
        Intrinsics.m97802h(container, "container");
        Context context = container.getContext();
        View viewM75287a = context != null ? m75287a(context, R$layout.item_travelga_image) : null;
        List list = this.f58084a;
        Intrinsics.m97799e(list);
        String localPath = ((PhotoEntity) list.get(i11)).getLocalPath();
        View viewFindViewById = viewM75287a != null ? viewM75287a.findViewById(R$id.src_pic) : null;
        Intrinsics.m97800f(viewFindViewById, "null cannot be cast to non-null type com.transsion.publish.view.ZoomImageView");
        ZoomImageView zoomImageView = (ZoomImageView) viewFindViewById;
        if (localPath != null) {
            m75288b(zoomImageView, localPath);
        }
        if (viewM75287a != null) {
            try {
                parent = viewM75287a.getParent();
            } catch (Exception unused) {
            }
        } else {
            parent = null;
        }
        if (parent != null) {
            if ((viewM75287a != null ? viewM75287a.getParent() : null) instanceof ViewGroup) {
                ViewParent parent2 = viewM75287a != null ? viewM75287a.getParent() : null;
                Intrinsics.m97800f(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent2).removeView(viewM75287a);
            }
        }
        container.addView(viewM75287a);
        return viewM75287a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object object) {
        Intrinsics.m97802h(view, "view");
        Intrinsics.m97802h(object, "object");
        return view == object;
    }
}
