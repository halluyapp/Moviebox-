package com.transsion.moviedetail.staff;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import androidx.core.util.AbstractC2480k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5806y;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.moviedetail.staff.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C16144v extends RecyclerView.AbstractC4219r {

    /* JADX INFO: renamed from: a */
    private final C16141s f54876a;

    /* JADX INFO: renamed from: b */
    private final Function2 f54877b;

    /* JADX INFO: renamed from: c */
    private RecyclerView f54878c;

    /* JADX INFO: renamed from: d */
    private final String f54879d;

    /* JADX INFO: renamed from: e */
    private int f54880e;

    /* JADX INFO: renamed from: f */
    private int f54881f;

    /* JADX INFO: renamed from: g */
    private int f54882g;

    /* JADX INFO: renamed from: h */
    private int f54883h;

    /* JADX INFO: renamed from: i */
    private int f54884i;

    /* JADX INFO: renamed from: j */
    private SparseArray f54885j;

    public C16144v(C16141s adapter, Function2 callback) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(callback, "callback");
        this.f54876a = adapter;
        this.f54877b = callback;
        this.f54879d = "MovieStaffScroll";
        this.f54882g = -1;
        this.f54883h = -1;
        this.f54884i = -1;
        this.f54885j = new SparseArray();
    }

    /* JADX INFO: renamed from: h */
    private final void m70737h(int i11, int i12) {
        if (i11 > i12) {
            return;
        }
        try {
            int itemCount = this.f54876a.getItemCount();
            if (this.f54882g == i11 && i12 == this.f54883h && this.f54884i == itemCount) {
                return;
            }
            this.f54884i = itemCount;
            C26866a.a.m104898f(C26866a.f81698a, this.f54879d, "showChange firstPosition:" + i11 + "  lastPosition:" + i12, false, 4, null);
            if (this.f54882g >= 0 && this.f54883h >= 0) {
                ArrayList arrayList = new ArrayList();
                IntIterator intIteratorM12070a = AbstractC2480k.m12070a(this.f54885j);
                while (intIteratorM12070a.hasNext()) {
                    int iIntValue = intIteratorM12070a.next().intValue();
                    if (i11 > iIntValue || iIntValue > i12) {
                        Function2 function2 = this.f54877b;
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        Object obj = this.f54885j.get(iIntValue);
                        Intrinsics.m97801g(obj, "get(...)");
                        function2.invoke(numValueOf, obj);
                        arrayList.add(Integer.valueOf(iIntValue));
                    } else if (iIntValue >= 0 && iIntValue < this.f54876a.getItemCount() && !Intrinsics.m97797c(((Pair) this.f54885j.get(iIntValue)).getFirst(), this.f54876a.getItem(iIntValue))) {
                        Function2 function3 = this.f54877b;
                        Integer numValueOf2 = Integer.valueOf(iIntValue);
                        Object obj2 = this.f54885j.get(iIntValue);
                        Intrinsics.m97801g(obj2, "get(...)");
                        function3.invoke(numValueOf2, obj2);
                        this.f54885j.put(iIntValue, new Pair(this.f54876a.getItem(iIntValue), Long.valueOf(SystemClock.elapsedRealtime())));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f54885j.remove(((Number) it.next()).intValue());
                }
                if (i11 <= i12) {
                    int i13 = i11;
                    while (true) {
                        Object item = this.f54876a.getItem(i13);
                        if (this.f54885j.get(i13) == null) {
                            this.f54885j.put(i13, new Pair(item, Long.valueOf(SystemClock.elapsedRealtime())));
                        }
                        if (i13 == i12) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            } else if (i11 <= i12) {
                int i14 = i11;
                while (true) {
                    this.f54885j.put(i14, new Pair(this.f54876a.getItem(i14), Long.valueOf(SystemClock.elapsedRealtime())));
                    if (i14 == i12) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f54882g = i11;
            this.f54883h = i12;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m70738d(AppBarLayout appBarLayout, int i11) {
        Intrinsics.m97802h(appBarLayout, "appBarLayout");
        C26866a.a.m104898f(C26866a.f81698a, this.f54879d, "appbarScroll  moveY:" + i11, false, 4, null);
        try {
            this.f54881f = i11;
            int iM27487c = AbstractC5806y.m27487c();
            int iM27349a = AbstractC5781d.m27349a();
            RecyclerView recyclerView = this.f54878c;
            int iE = 0;
            int top = (iM27487c - iM27349a) - (recyclerView != null ? recyclerView.getTop() : 0);
            RecyclerView recyclerView2 = this.f54878c;
            GridLayoutManager gridLayoutManager = (GridLayoutManager) (recyclerView2 != null ? recyclerView2.getLayoutManager() : null);
            if (gridLayoutManager == null) {
                return;
            }
            int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
            int i12 = -1;
            if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                int i13 = 0;
                int i14 = -1;
                while (true) {
                    View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (viewFindViewByPosition != null) {
                        C26866a.a aVar = C26866a.f81698a;
                        C26866a.a.m104898f(aVar, this.f54879d, "appbarScroll  *****  index:" + iFindFirstVisibleItemPosition + "  totalY:" + this.f54880e + "    top:" + viewFindViewByPosition.getTop(), false, 4, null);
                        if (viewFindViewByPosition.getTop() >= 0) {
                            if (viewFindViewByPosition.getBottom() >= viewFindViewByPosition.getHeight() * 0.7f) {
                                if (gridLayoutManager.m20738Y().mo20741e(iFindFirstVisibleItemPosition, gridLayoutManager.m20737U()) == 0) {
                                    if (i14 == -1) {
                                        i14 = iFindFirstVisibleItemPosition;
                                    }
                                    int height = viewFindViewByPosition.getHeight();
                                    int i15 = i13 + height;
                                    if (i15 >= top) {
                                        if (((top - i13) * 100) / height < 70) {
                                            iE = RangesKt.m97935e(iFindFirstVisibleItemPosition - 1, 0);
                                            break;
                                        }
                                        int i16 = iFindFirstVisibleItemPosition + 1;
                                        if (i16 <= iFindLastVisibleItemPosition) {
                                            while (true) {
                                                int i17 = iFindFirstVisibleItemPosition;
                                                iFindFirstVisibleItemPosition = i16;
                                                if (gridLayoutManager.m20738Y().mo20741e(iFindFirstVisibleItemPosition, gridLayoutManager.m20737U()) != 0) {
                                                    if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                                                        break;
                                                    } else {
                                                        i16 = iFindFirstVisibleItemPosition + 1;
                                                    }
                                                } else {
                                                    iFindFirstVisibleItemPosition = i17;
                                                    break;
                                                }
                                            }
                                        }
                                        iE = iFindFirstVisibleItemPosition;
                                        break;
                                    }
                                    i13 = i15;
                                }
                            } else {
                                C26866a.a.m104898f(aVar, this.f54879d, "index:" + iFindFirstVisibleItemPosition + "  标题栏档住了，不计入", false, 4, null);
                            }
                        } else {
                            return;
                        }
                    }
                    if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                        break;
                    } else {
                        iFindFirstVisibleItemPosition++;
                    }
                }
                i12 = i14;
            }
            C26866a.a.m104898f(C26866a.f81698a, this.f54879d, "firstVisiblePosition:" + i12 + "   realLastVisiblePosition:" + iE, false, 4, null);
            m70737h(i12, iE);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m70739e(int i11, int i12) {
        while (i11 < i12) {
            try {
                Pair pair = (Pair) this.f54885j.get(i11);
                if (pair != null) {
                    this.f54877b.invoke(Integer.valueOf(i11), pair);
                    this.f54885j.remove(i11);
                }
                i11++;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m70740f() {
        try {
            IntIterator intIteratorM12070a = AbstractC2480k.m12070a(this.f54885j);
            while (intIteratorM12070a.hasNext()) {
                int iIntValue = intIteratorM12070a.next().intValue();
                Function2 function2 = this.f54877b;
                Integer numValueOf = Integer.valueOf(iIntValue);
                Object obj = this.f54885j.get(iIntValue);
                Intrinsics.m97801g(obj, "get(...)");
                function2.invoke(numValueOf, obj);
            }
            this.f54885j.clear();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m70741g() {
        try {
            int i11 = this.f54882g;
            if (i11 >= 0) {
                int i12 = this.f54883h;
                this.f54882g = -1;
                this.f54883h = -1;
                m70737h(i11, i12);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
    public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
        Intrinsics.m97802h(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i11, i12);
        this.f54880e += i12;
        this.f54878c = recyclerView;
        if (this.f54881f >= 0) {
            return;
        }
        RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
        Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
        for (int i13 = iFindFirstVisibleItemPosition; i13 < iFindLastVisibleItemPosition; i13++) {
            View viewFindViewByPosition = gridLayoutManager.findViewByPosition(i13);
            if (viewFindViewByPosition != null) {
                Rect rect = new Rect();
                viewFindViewByPosition.getLocalVisibleRect(rect);
                C26866a.a aVar = C26866a.f81698a;
                C26866a.a.m104898f(aVar, this.f54879d, "index:" + i13 + "  totalY:" + this.f54880e + "    dy:" + i12 + " top:" + recyclerView.getTop(), false, 4, null);
                C26866a.a.m104898f(aVar, this.f54879d, "index:" + i13 + "  firstView top:" + viewFindViewByPosition.getTop() + "    bottom:" + viewFindViewByPosition.getBottom(), false, 4, null);
                if (viewFindViewByPosition.getBottom() >= viewFindViewByPosition.getHeight() * 0.7f) {
                    if ((rect.height() * 100) / viewFindViewByPosition.getHeight() >= 70) {
                        iFindFirstVisibleItemPosition = i13;
                        break;
                    }
                } else {
                    C26866a.a.m104898f(aVar, this.f54879d, "index:" + i13 + "  标题栏档住了，不计入", false, 4, null);
                }
            }
        }
        if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
            int i14 = iFindLastVisibleItemPosition;
            while (true) {
                View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(i14);
                if (viewFindViewByPosition2 != null) {
                    Rect rect2 = new Rect();
                    viewFindViewByPosition2.getLocalVisibleRect(rect2);
                    if ((rect2.height() * 100) / viewFindViewByPosition2.getHeight() >= 70) {
                        iFindLastVisibleItemPosition = i14;
                        break;
                    }
                }
                if (i14 == iFindFirstVisibleItemPosition) {
                    break;
                } else {
                    i14--;
                }
            }
        }
        C26866a.a.m104898f(C26866a.f81698a, this.f54879d, "firstVisiblePosition:" + iFindFirstVisibleItemPosition + "   lastVisiblePosition:" + iFindLastVisibleItemPosition, false, 4, null);
        m70737h(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
    }
}
