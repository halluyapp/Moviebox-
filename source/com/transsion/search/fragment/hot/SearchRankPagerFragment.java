package com.transsion.search.fragment.hot;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5111h;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.search.AbstractC18381f;
import com.transsion.search.R$drawable;
import com.transsion.search.bean.GroupInfo;
import com.transsion.search.bean.HotRankItem;
import com.transsion.search.bean.HotSubject;
import com.transsion.search.fragment.hot.adapter.C18450c;
import com.transsion.search.fragment.hot.adapter.C18455h;
import com.transsion.search.viewmodel.SearchViewModel;
import com.transsion.search.widget.C18541d;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.C25829f;
import p881wq.C28421f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m97100d2 = {"Lcom/transsion/search/fragment/hot/SearchRankPagerFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lwq/f;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "a0", "(Landroid/view/LayoutInflater;)Lwq/f;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "b0", "lazyLoadData", "", "a", "Z", "hasReported", "Lcom/transsion/search/viewmodel/SearchViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/search/viewmodel/SearchViewModel;", "searchViewModel", "c", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SearchRankPagerFragment extends BaseFragment<C28421f> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean hasReported;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private SearchViewModel searchViewModel;

    /* JADX INFO: renamed from: com.transsion.search.fragment.hot.SearchRankPagerFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchRankPagerFragment m77807a(HotRankItem hotRankItem) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("hotRankItem", hotRankItem);
            SearchRankPagerFragment searchRankPagerFragment = new SearchRankPagerFragment();
            searchRankPagerFragment.setArguments(bundle);
            return searchRankPagerFragment;
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public C28421f getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28421f c28421fM109816c = C28421f.m109816c(inflater);
        Intrinsics.m97801g(c28421fM109816c, "inflate(...)");
        return c28421fM109816c;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m77806b0() {
        String strM78084s;
        List<GroupInfo> groups;
        List<HotSubject> items;
        if (this.hasReported) {
            return;
        }
        boolean zM23913a = C5111h.f17603a.m23913a();
        Bundle arguments = getArguments();
        HotRankItem hotRankItem = arguments != null ? (HotRankItem) arguments.getParcelable("hotRankItem") : null;
        HotRankItem hotRankItem2 = hotRankItem instanceof HotRankItem ? hotRankItem : null;
        SearchViewModel searchViewModel = this.searchViewModel;
        if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
            strM78084s = "mb_sug";
        }
        String str = strM78084s;
        int i11 = 0;
        if (hotRankItem2 != null && (items = hotRankItem2.getItems()) != null) {
            int i12 = 0;
            for (Object obj : items) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.m97515u();
                }
                C18541d.f60046a.m78134n((HotSubject) obj, i12, hotRankItem2.getCategory(), hotRankItem2.getIndex(), zM23913a, str);
                i12 = i13;
            }
        }
        if (hotRankItem2 != null && (groups = hotRankItem2.getGroups()) != null) {
            Iterator<T> it = groups.iterator();
            while (true) {
                int i14 = i11;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                i11 = i14 + 1;
                if (i14 < 0) {
                    CollectionsKt.m97515u();
                }
                C18541d.f60046a.m78132l((GroupInfo) next, i14, hotRankItem2.getCategory(), hotRankItem2.getIndex(), zM23913a, str);
            }
        }
        this.hasReported = true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        BaseQuickAdapter c18455h;
        String strM78084s;
        String strM78084s2;
        ImageView imageView;
        int i11;
        List<GroupInfo> groups;
        List<HotSubject> items;
        Intrinsics.m97802h(view, "view");
        Bundle arguments = getArguments();
        HotRankItem hotRankItem = arguments != null ? (HotRankItem) arguments.getParcelable("hotRankItem") : null;
        HotRankItem hotRankItem2 = hotRankItem instanceof HotRankItem ? hotRankItem : null;
        if (hotRankItem2 == null) {
            return;
        }
        boolean zM97797c = Intrinsics.m97797c(hotRankItem2.getCategory(), HotRankItem.CATE_GROUP);
        if (zM97797c || !((items = hotRankItem2.getItems()) == null || items.isEmpty())) {
            if (zM97797c && ((groups = hotRankItem2.getGroups()) == null || groups.isEmpty())) {
                return;
            }
            C28421f mViewBinding = getMViewBinding();
            if (mViewBinding != null && (imageView = mViewBinding.f87181c) != null) {
                String category = hotRankItem2.getCategory();
                int iHashCode = category.hashCode();
                if (iHashCode != 2690) {
                    if (iHashCode != 74534672) {
                        if (iHashCode == 74710533 && category.equals(HotRankItem.CATE_MUSIC)) {
                            i11 = R$drawable.rank_type_music;
                        } else {
                            i11 = R$drawable.rank_type_community;
                        }
                    } else if (category.equals(HotRankItem.CATE_MOVIE)) {
                        i11 = R$drawable.rank_type_movie;
                    } else {
                        i11 = R$drawable.rank_type_community;
                    }
                } else if (category.equals(HotRankItem.CATE_TV)) {
                    i11 = R$drawable.rank_type_tv;
                } else {
                    i11 = R$drawable.rank_type_community;
                }
                imageView.setImageResource(i11);
            }
            C28421f mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (recyclerView = mViewBinding2.f87180b) == null) {
                return;
            }
            Resources resources = recyclerView.getResources();
            Intrinsics.m97801g(resources, "getResources(...)");
            boolean zM77676e = AbstractC18381f.m77676e(resources);
            recyclerView.setLayoutManager(zM77676e ? new NpaGridLayoutManager(recyclerView.getContext(), 2) : new LinearLayoutManager(recyclerView.getContext()));
            if (!Intrinsics.m97797c(hotRankItem2.getCategory(), HotRankItem.CATE_TV) && !Intrinsics.m97797c(hotRankItem2.getCategory(), HotRankItem.CATE_MOVIE) && recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(new C25829f(0.0f, 8.0f, 0.0f, 5, null));
            }
            String str = "mb_sug";
            if (zM97797c) {
                String category2 = hotRankItem2.getCategory();
                int index = hotRankItem2.getIndex();
                SearchViewModel searchViewModel = this.searchViewModel;
                if (searchViewModel != null && (strM78084s2 = searchViewModel.m78084s()) != null) {
                    str = strM78084s2;
                }
                c18455h = new C18450c(category2, index, str);
                c18455h.mo36201n1(hotRankItem2.getGroups());
            } else {
                String category3 = hotRankItem2.getCategory();
                int index2 = hotRankItem2.getIndex();
                SearchViewModel searchViewModel2 = this.searchViewModel;
                if (searchViewModel2 != null && (strM78084s = searchViewModel2.m78084s()) != null) {
                    str = strM78084s;
                }
                c18455h = new C18455h(category3, index2, zM77676e, str);
                c18455h.mo36201n1(hotRankItem2.getItems());
            }
            recyclerView.setAdapter(c18455h);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Object objM112707constructorimpl;
        super.onCreate(savedInstanceState);
        try {
            Result.Companion companion = Result.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
            objM112707constructorimpl = Result.m112707constructorimpl((SearchViewModel) new C3227v0(fragmentActivityRequireActivity).m14969a(SearchViewModel.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112713isFailureimpl(objM112707constructorimpl)) {
            objM112707constructorimpl = null;
        }
        this.searchViewModel = (SearchViewModel) objM112707constructorimpl;
    }
}
