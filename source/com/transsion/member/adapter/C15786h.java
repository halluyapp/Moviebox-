package com.transsion.member.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.transsion.member.MemberFragment;
import com.transsion.member.MemberViewModel;
import com.transsion.member.constants.TaskType;
import com.transsion.memberapi.MemberTaskItem;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;
import zm.C29195c;
import zm.C29204l;
import zm.C29206n;

/* JADX INFO: renamed from: com.transsion.member.adapter.h */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m97100d2 = {"Lcom/transsion/member/adapter/h;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/memberapi/MemberTaskItem;", "Landroidx/lifecycle/u;", "owner", "Lcom/transsion/member/MemberViewModel;", "viewModel", "Lcom/transsion/member/MemberFragment;", "fragment", "<init>", "(Landroidx/lifecycle/u;Lcom/transsion/member/MemberViewModel;Lcom/transsion/member/MemberFragment;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "provider", "", "F1", "(Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V", "", "list", "n1", "(Ljava/util/Collection;)V", "", "G", "Ljava/util/Set;", "supportTaskTypes", "a", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C15786h extends BaseProviderMultiAdapter<MemberTaskItem> {

    /* JADX INFO: renamed from: H */
    public static final int f54232H = 8;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Set<Integer> supportTaskTypes;

    /* JADX INFO: renamed from: com.transsion.member.adapter.h$a */
    public static final class a extends RecyclerView.AbstractC4213l {

        /* JADX INFO: renamed from: a */
        private final int f54234a = AbstractC5776a0.m27313a(24.0f);

        /* JADX INFO: renamed from: b */
        private final int f54235b = AbstractC5776a0.m27313a(8.0f);

        /* JADX INFO: renamed from: c */
        private final int f54236c = AbstractC5776a0.m27313a(12.0f);

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = parent.getAdapter();
            Intrinsics.m97800f(adapter, "null cannot be cast to non-null type com.transsion.member.adapter.TaskAdapter");
            Integer taskSubType = ((MemberTaskItem) ((C15786h) adapter).getItem(childAdapterPosition)).getTaskSubType();
            TaskType taskType = TaskType.TITLE;
            int value = taskType.getValue();
            if (taskSubType != null && taskSubType.intValue() == value) {
                outRect.top = this.f54234a;
            } else if (childAdapterPosition > 0) {
                RecyclerView.Adapter adapter2 = parent.getAdapter();
                Intrinsics.m97800f(adapter2, "null cannot be cast to non-null type com.transsion.member.adapter.TaskAdapter");
                Integer taskSubType2 = ((MemberTaskItem) ((C15786h) adapter2).getItem(childAdapterPosition - 1)).getTaskSubType();
                int value2 = taskType.getValue();
                if (taskSubType2 != null && taskSubType2.intValue() == value2) {
                    outRect.top = this.f54235b;
                } else {
                    outRect.top = this.f54236c;
                }
            }
            if (childAdapterPosition == state.m20926b() - 1) {
                outRect.bottom = AbstractC5776a0.m27313a(20.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15786h(InterfaceC3224u owner, MemberViewModel viewModel, MemberFragment fragment) {
        super(null, 1, null);
        Intrinsics.m97802h(owner, "owner");
        Intrinsics.m97802h(viewModel, "viewModel");
        Intrinsics.m97802h(fragment, "fragment");
        this.supportTaskTypes = new LinkedHashSet();
        mo36107F1(new C29206n());
        mo36107F1(new C29204l(fragment, viewModel));
        mo36107F1(new C29195c(owner, viewModel));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: F1 */
    public void mo36107F1(BaseItemProvider provider) {
        Intrinsics.m97802h(provider, "provider");
        this.supportTaskTypes.add(Integer.valueOf(provider.mo22758l()));
        super.mo36107F1(provider);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends MemberTaskItem> data, int position) {
        Intrinsics.m97802h(data, "data");
        Integer taskSubType = data.get(position).getTaskSubType();
        if (taskSubType != null) {
            return taskSubType.intValue();
        }
        return 0;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: n1 */
    public void mo36201n1(Collection<MemberTaskItem> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            list = new ArrayList<>();
        }
        for (MemberTaskItem memberTaskItem : list) {
            if (CollectionsKt.m97352b0(this.supportTaskTypes, memberTaskItem.getTaskSubType())) {
                arrayList.add(memberTaskItem);
            } else {
                C26866a.a.m104898f(C26866a.f81698a, "MemberTask", "task type " + memberTaskItem.getTaskSubType() + " not support", false, 4, null);
            }
        }
        super.mo36201n1(arrayList);
    }
}
