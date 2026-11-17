package com.transsion.room.adapter;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.therouter.TheRouter;
import com.transsion.baseui.fragment.EmptyFragment;
import com.transsion.moviedetailapi.InterfaceC16246g;
import com.transsion.moviedetailapi.PostRankType;
import com.transsion.room.viewmodel.RoomHotViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.room.adapter.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C18038c extends FragmentStateAdapter {

    /* JADX INFO: renamed from: a */
    private final String f59082a;

    /* JADX INFO: renamed from: b */
    private final Lazy f59083b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18038c(String str, Fragment fragment) {
        super(fragment);
        Intrinsics.m97802h(fragment, "fragment");
        this.f59082a = str;
        this.f59083b = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.adapter.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C18038c.m76743i();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC16246g m76742h() {
        return (InterfaceC16246g) this.f59083b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC16246g m76743i() {
        return (InterfaceC16246g) TheRouter.m61774d(InterfaceC16246g.class, new Object[0]);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i11) {
        Bundle bundle = new Bundle();
        PostRankType postRankType = i11 == 0 ? PostRankType.POST_RANK_TYPE_HOT : PostRankType.POST_RANK_TYPE_NEW;
        bundle.putString("subject_id", this.f59082a);
        bundle.putSerializable("rank_type", postRankType);
        InterfaceC16246g interfaceC16246gM76742h = m76742h();
        Fragment fragmentMo71008e = interfaceC16246gM76742h != null ? interfaceC16246gM76742h.mo71008e(bundle, RoomHotViewModel.class) : null;
        return fragmentMo71008e == null ? new EmptyFragment() : fragmentMo71008e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 2;
    }
}
