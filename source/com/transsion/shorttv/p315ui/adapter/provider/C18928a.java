package com.transsion.shorttv.p315ui.adapter.provider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.bean.OperateItem;
import com.transsion.shorttv.bean.ShortTvItemType;
import com.transsion.shorttv.p315ui.widget.ShortTVDiscoverHeaderView;
import com.transsion.shorttv.p315ui.widget.ShortTvCategoryView;
import com.transsion.shorttv.p315ui.widget.ShortTvOpAppointmentView;
import com.transsion.shorttv.p315ui.widget.ShortTvOpCustomView;
import com.transsion.shorttv.p315ui.widget.ShortTvOpRankingView;
import kotlin.jvm.internal.Intrinsics;
import p331ct.C22777a;

/* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.provider.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C18928a extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final String f61030e;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.provider.a$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f61031a;

        static {
            int[] iArr = new int[ShortTvItemType.values().length];
            try {
                iArr[ShortTvItemType.APPOINTMENT_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortTvItemType.CUSTOM_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShortTvItemType.OP_SUBJECTS_MOVIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShortTvItemType.PLAY_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShortTvItemType.FILTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f61031a = iArr;
        }
    }

    public C18928a(String pageName) {
        Intrinsics.m97802h(pageName, "pageName");
        this.f61030e = pageName;
    }

    /* JADX INFO: renamed from: z */
    private final boolean m79596z(View view, ShortTvItemType shortTvItemType) {
        int i11 = shortTvItemType == null ? -1 : a.f61031a[shortTvItemType.ordinal()];
        if (i11 == 1) {
            return view instanceof ShortTvOpAppointmentView;
        }
        if (i11 == 2) {
            return view instanceof ShortTvOpCustomView;
        }
        if (i11 == 3) {
            return view instanceof ShortTvOpRankingView;
        }
        if (i11 == 4) {
            return view instanceof ShortTVDiscoverHeaderView;
        }
        if (i11 != 5) {
            return false;
        }
        return view instanceof ShortTvCategoryView;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 0;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.layout_view_container;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x013a  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, C22777a item) {
        int i11;
        View shortTvOpAppointmentView;
        View shortTvOpAppointmentView2;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        FrameLayout frameLayout = (FrameLayout) helper.getView(R$id.root);
        if (item.m90710e() != null) {
            ViewParent parent = item.m90710e().getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(item.m90710e());
            }
            frameLayout.removeAllViews();
            frameLayout.addView(item.m90710e());
            return;
        }
        OperateItem operateItemM90706a = item.m90706a();
        if (operateItemM90706a == null) {
            return;
        }
        Context contextM36338k = m36338k();
        ShortTvItemType.Companion companion = ShortTvItemType.INSTANCE;
        String type = operateItemM90706a.getType();
        if (type == null) {
            type = "";
        }
        ShortTvItemType shortTvItemTypeM79329a = companion.m79329a(type);
        View childAt = frameLayout.getChildAt(0);
        View shortTvCategoryView = null;
        if (childAt == null || !m79596z(childAt, shortTvItemTypeM79329a)) {
            frameLayout.removeAllViews();
            i11 = shortTvItemTypeM79329a != null ? a.f61031a[shortTvItemTypeM79329a.ordinal()] : -1;
            if (i11 == 1) {
                shortTvOpAppointmentView = new ShortTvOpAppointmentView(this.f61030e, operateItemM90706a, item.m90708c(), item.m90711f(), contextM36338k);
            } else if (i11 == 2) {
                shortTvOpAppointmentView = new ShortTvOpCustomView(this.f61030e, operateItemM90706a, item.m90708c(), item.m90711f(), contextM36338k);
            } else {
                if (i11 != 3) {
                    if (i11 == 4) {
                        shortTvOpAppointmentView = new ShortTVDiscoverHeaderView(this.f61030e, operateItemM90706a, item.m90708c(), item.m90711f(), contextM36338k);
                    } else if (i11 == 5) {
                        shortTvCategoryView = new ShortTvCategoryView(contextM36338k);
                    }
                    if (shortTvCategoryView != null) {
                        frameLayout.addView(shortTvCategoryView);
                        return;
                    }
                    return;
                }
                shortTvOpAppointmentView = new ShortTvOpRankingView(this.f61030e, operateItemM90706a, item.m90708c(), item.m90711f(), contextM36338k);
            }
            shortTvCategoryView = shortTvOpAppointmentView;
            if (shortTvCategoryView != null) {
                frameLayout.addView(shortTvCategoryView);
                return;
            }
            return;
        }
        frameLayout.removeAllViews();
        i11 = shortTvItemTypeM79329a != null ? a.f61031a[shortTvItemTypeM79329a.ordinal()] : -1;
        if (i11 == 1) {
            shortTvOpAppointmentView2 = new ShortTvOpAppointmentView(this.f61030e, operateItemM90706a, item.m90708c(), item.m90711f(), contextM36338k);
        } else if (i11 == 2) {
            shortTvOpAppointmentView2 = new ShortTvOpCustomView(this.f61030e, operateItemM90706a, item.m90708c(), item.m90711f(), contextM36338k);
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    shortTvOpAppointmentView2 = new ShortTVDiscoverHeaderView(this.f61030e, operateItemM90706a, item.m90708c(), item.m90711f(), contextM36338k);
                } else if (i11 == 5) {
                    shortTvCategoryView = new ShortTvCategoryView(contextM36338k);
                }
                if (shortTvCategoryView != null) {
                    frameLayout.addView(shortTvCategoryView);
                }
            }
            shortTvOpAppointmentView2 = new ShortTvOpRankingView(this.f61030e, operateItemM90706a, item.m90708c(), item.m90711f(), contextM36338k);
        }
        shortTvCategoryView = shortTvOpAppointmentView2;
        if (shortTvCategoryView != null) {
            frameLayout.addView(shortTvCategoryView);
        }
    }
}
