package com.transsion.moviedetail.adapter;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.therouter.TheRouter;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetailapi.AbsSubjectListViewModel;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.p1002enum.PostListSource;
import com.transsion.moviedetailapi.p1002enum.ProfileSubSource;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gp.InterfaceC23624b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p413fn.C23396b;
import p413fn.C23398d;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.moviedetail.adapter.j */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B3\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m97100d2 = {"Lcom/transsion/moviedetail/adapter/j;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "Lu6/i;", "", "postSubjectList", "Lcom/transsion/moviedetailapi/AbsSubjectListViewModel;", "viewModel", "", "pageName", "pageFrom", "<init>", "(Ljava/util/List;Lcom/transsion/moviedetailapi/AbsSubjectListViewModel;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "", RequestParameters.POSITION, "", "w0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "data", "N1", "(Ljava/util/List;I)I", "Q1", "()V", "G", "Lcom/transsion/moviedetailapi/AbsSubjectListViewModel;", "S1", "()Lcom/transsion/moviedetailapi/AbsSubjectListViewModel;", "H", "Ljava/lang/String;", "R1", "()Ljava/lang/String;", "Landroidx/recyclerview/widget/RecyclerView$s;", "I", "Landroidx/recyclerview/widget/RecyclerView$s;", "imageRecycledViewPool", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C15929j extends BaseProviderMultiAdapter<PostSubjectItem> implements InterfaceC27944i {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final AbsSubjectListViewModel viewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String pageName;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final RecyclerView.C4220s imageRecycledViewPool;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    public C15929j(List<PostSubjectItem> postSubjectList, AbsSubjectListViewModel absSubjectListViewModel, String str, String str2) {
        BaseItemProvider baseItemProviderMo93475h;
        ProfileSubSource profileSubSourceMo70864B;
        super(CollectionsKt.m97343U0(postSubjectList));
        Intrinsics.m97802h(postSubjectList, "postSubjectList");
        this.viewModel = absSubjectListViewModel;
        this.pageName = str;
        RecyclerView.C4220s c4220s = new RecyclerView.C4220s();
        this.imageRecycledViewPool = c4220s;
        String value = null;
        if ((absSubjectListViewModel != null ? absSubjectListViewModel.mo69056A() : null) == PostListSource.PROFILE) {
            InterfaceC23624b interfaceC23624b = (InterfaceC23624b) TheRouter.m61774d(InterfaceC23624b.class, new Object[0]);
            if (interfaceC23624b != null) {
                baseItemProviderMo93475h = interfaceC23624b.mo93482o(str, str2, c4220s);
            } else {
                baseItemProviderMo93475h = null;
            }
        } else {
            InterfaceC23624b interfaceC23624b2 = (InterfaceC23624b) TheRouter.m61774d(InterfaceC23624b.class, new Object[0]);
            if (interfaceC23624b2 != null) {
                baseItemProviderMo93475h = interfaceC23624b2.mo93475h(str, str2, c4220s);
            } else {
                baseItemProviderMo93475h = null;
            }
        }
        if (baseItemProviderMo93475h != null) {
            mo36107F1(baseItemProviderMo93475h);
        }
        mo36107F1(new C23396b());
        if (absSubjectListViewModel != null && (profileSubSourceMo70864B = absSubjectListViewModel.mo70864B()) != null) {
            value = profileSubSourceMo70864B.getValue();
        }
        mo36107F1(new C23398d(str, value));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends PostSubjectItem> data, int position) {
        Intrinsics.m97802h(data, "data");
        if (data.get(position).isRoomList()) {
            return MediaType.ROOM_LIST.ordinal();
        }
        return data.get(position).getNonAdDelegate() != null ? MediaType.SUBJECT_DETAIL_NATIVE_AD.ordinal() : MediaType.CONTENT_ALL.ordinal();
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m70197Q1() {
        getData().clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final AbsSubjectListViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: w0 */
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        Intrinsics.m97802h(holder, "holder");
        super.onBindViewHolder(holder, position);
        if (((LinearLayoutCompat) holder.itemView.findViewById(R$id.root)) != null) {
            AbsSubjectListViewModel absSubjectListViewModel = this.viewModel;
            if (absSubjectListViewModel != null) {
                absSubjectListViewModel.m70947H((PostSubjectItem) getData().get(position), position);
            }
            if (position != 0) {
                getItemCount();
            }
        }
    }
}
