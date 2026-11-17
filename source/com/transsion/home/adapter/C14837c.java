package com.transsion.home.adapter;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.videodetail.music.p322ui.MusicTabLikedFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.home.adapter.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C14837c extends FragmentStateAdapter {

    /* JADX INFO: renamed from: a */
    private final ViewPager2 f51891a;

    /* JADX INFO: renamed from: b */
    private final int f51892b;

    /* JADX INFO: renamed from: c */
    private final String f51893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14837c(ViewPager2 viewPager2, int i11, String str, Fragment fragment) {
        super(fragment);
        Intrinsics.m97802h(fragment, "fragment");
        this.f51891a = viewPager2;
        this.f51892b = i11;
        this.f51893c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m66711h(C14837c c14837c) {
        ViewPager2 viewPager2 = c14837c.f51891a;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0);
        }
        return Unit.f75682a;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i11) {
        if (i11 == 0) {
            return SubTabFragment.INSTANCE.m68283b(this.f51892b, this.f51893c);
        }
        if (i11 != 1) {
            return new MusicTabLikedFragment();
        }
        MusicTabLikedFragment musicTabLikedFragment = new MusicTabLikedFragment();
        musicTabLikedFragment.m86436m1(new Function0() { // from class: com.transsion.home.adapter.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14837c.m66711h(this.f51890a);
            }
        });
        return musicTabLikedFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 2;
    }
}
