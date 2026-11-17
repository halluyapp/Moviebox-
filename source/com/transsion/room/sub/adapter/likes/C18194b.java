package com.transsion.room.sub.adapter.likes;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.cloud.tmc.integration.event.EventConstants;
import com.transsion.moviedetail.fragment.SubjectListFragment;
import com.transsion.room.R$string;
import com.transsion.room.sub.fragment.likes.UgcLikesFragment;
import com.transsion.usercenter.profile.ProfileSubjectListViewModel;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.room.sub.adapter.likes.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C18194b extends FragmentStateAdapter {

    /* JADX INFO: renamed from: a */
    private final List f59340a;

    /* JADX INFO: renamed from: com.transsion.room.sub.adapter.likes.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final String f59341a;

        /* JADX INFO: renamed from: b */
        private final Fragment f59342b;

        public a(String title, Fragment fragment) {
            Intrinsics.m97802h(title, "title");
            Intrinsics.m97802h(fragment, "fragment");
            this.f59341a = title;
            this.f59342b = fragment;
        }

        /* JADX INFO: renamed from: a */
        public final Fragment m77119a() {
            return this.f59342b;
        }

        /* JADX INFO: renamed from: b */
        public final String m77120b() {
            return this.f59341a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.m97797c(this.f59341a, aVar.f59341a) && Intrinsics.m97797c(this.f59342b, aVar.f59342b);
        }

        public int hashCode() {
            return (this.f59341a.hashCode() * 31) + this.f59342b.hashCode();
        }

        public String toString() {
            return "TabInfo(title=" + this.f59341a + ", fragment=" + this.f59342b + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18194b(FragmentActivity activity) {
        super(activity);
        Intrinsics.m97802h(activity, "activity");
        String string = activity.getString(R$string.play_hub);
        Intrinsics.m97801g(string, "getString(...)");
        a aVar = new a(string, new UgcLikesFragment());
        String string2 = activity.getString(R$string.buzz_box);
        Intrinsics.m97801g(string2, "getString(...)");
        this.f59340a = CollectionsKt.m97509o(aVar, new a(string2, SubjectListFragment.INSTANCE.m70517a(m77117g(), ProfileSubjectListViewModel.class)));
    }

    /* JADX INFO: renamed from: g */
    private final Bundle m77117g() {
        Bundle bundle = new Bundle();
        bundle.putInt(EventConstants.KEY_SOURCE, 1);
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i11) {
        return ((a) this.f59340a.get(i11)).m77119a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f59340a.size();
    }

    /* JADX INFO: renamed from: h */
    public final String m77118h(int i11) {
        return ((a) this.f59340a.get(i11)).m77120b();
    }
}
