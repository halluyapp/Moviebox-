package com.transsion.search_pugc.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C4241h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public class CenterLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: com.transsion.search_pugc.adapter.CenterLayoutManager$a */
    private static class C18548a extends C4241h {
        public C18548a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C4241h
        /* JADX INFO: renamed from: s */
        public int mo21139s(int i11, int i12, int i13, int i14, int i15) {
            return (i13 + ((i14 - i13) / 2)) - (i11 + ((i12 - i11) / 2));
        }

        @Override // androidx.recyclerview.widget.C4241h
        /* JADX INFO: renamed from: v */
        protected float mo21142v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public CenterLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC4214m
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C4226y c4226y, int i11) {
        C18548a c18548a = new C18548a(recyclerView.getContext());
        c18548a.m20917p(i11);
        startSmoothScroll(c18548a);
    }
}
