package com.transsion.usercenter.profile.adapter;

import android.os.Bundle;
import androidx.collection.C0548a;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.cloud.tmc.integration.event.EventConstants;
import com.therouter.TheRouter;
import com.transsion.baseui.fragment.EmptyFragment;
import com.transsion.moviedetailapi.InterfaceC16246g;
import com.transsion.usercenter.profile.ProfileSubjectListViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.usercenter.profile.adapter.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C20645b extends FragmentStateAdapter {

    /* JADX INFO: renamed from: a */
    private final String f65170a;

    /* JADX INFO: renamed from: b */
    private final C0548a f65171b;

    /* JADX INFO: renamed from: c */
    private final Lazy f65172c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20645b(String str, Fragment fragment) {
        super(fragment);
        Intrinsics.m97802h(fragment, "fragment");
        this.f65170a = str;
        this.f65171b = new C0548a();
        this.f65172c = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.adapter.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C20645b.m85276j();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC16246g m85275i() {
        return (InterfaceC16246g) this.f65172c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC16246g m85276j() {
        return (InterfaceC16246g) TheRouter.m61774d(InterfaceC16246g.class, new Object[0]);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt(EventConstants.KEY_SOURCE, i11);
        bundle.putString("userId", this.f65170a);
        InterfaceC16246g interfaceC16246gM85275i = m85275i();
        Fragment fragmentMo71008e = interfaceC16246gM85275i != null ? interfaceC16246gM85275i.mo71008e(bundle, ProfileSubjectListViewModel.class) : null;
        this.f65171b.put(Integer.valueOf(i11), fragmentMo71008e);
        return fragmentMo71008e == null ? new EmptyFragment() : fragmentMo71008e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 2;
    }

    /* JADX INFO: renamed from: h */
    public final void m85277h(int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt(EventConstants.KEY_SOURCE, i11);
        bundle.putString("userId", this.f65170a);
        Fragment fragment = (Fragment) this.f65171b.get(Integer.valueOf(i11));
        if (fragment == null || fragment.isStateSaved()) {
            return;
        }
        fragment.setArguments(bundle);
        InterfaceC16246g interfaceC16246gM85275i = m85275i();
        if (interfaceC16246gM85275i != null) {
            interfaceC16246gM85275i.mo71006c(fragment);
        }
    }
}
