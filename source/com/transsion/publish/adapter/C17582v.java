package com.transsion.publish.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.transsion.publish.R$drawable;
import com.transsion.publish.R$layout;
import com.transsion.publish.api.VsMediaInfo;
import com.transsion.publish.p307ui.SelectVideoActivity;
import com.transsion.publish.p307ui.VideoPreviewActivity;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.mvel2.ast.ASTNode;
import p462hj.C23860f;
import p465hp.C23889b;

/* JADX INFO: renamed from: com.transsion.publish.adapter.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C17582v extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: e */
    public static final a f58094e = new a(null);

    /* JADX INFO: renamed from: b */
    private FrameLayout.LayoutParams f58096b;

    /* JADX INFO: renamed from: d */
    private boolean f58098d;

    /* JADX INFO: renamed from: a */
    private List f58095a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private int f58097c = (AbstractC5806y.m27486b() - (AbstractC5776a0.m27313a(3.0f) * 5)) / 4;

    /* JADX INFO: renamed from: com.transsion.publish.adapter.v$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C17582v() {
        int i11 = this.f58097c;
        this.f58096b = new FrameLayout.LayoutParams(i11, i11);
    }

    /* JADX INFO: renamed from: j */
    private final void m75329j(final C17569l0 c17569l0, VsMediaInfo vsMediaInfo) {
        TextView textViewM75277i = c17569l0.m75277i();
        if (textViewM75277i != null) {
            textViewM75277i.setVisibility(4);
        }
        View viewM75274f = c17569l0.m75274f();
        if (viewM75274f != null) {
            viewM75274f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C17582v.m75330k(c17569l0, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m75330k(C17569l0 c17569l0, View view) {
        Intent intent = new Intent(c17569l0.itemView.getContext(), (Class<?>) SelectVideoActivity.class);
        intent.setFlags(ASTNode.DEOP);
        c17569l0.itemView.getContext().startActivity(intent);
    }

    /* JADX INFO: renamed from: o */
    private final void m75331o(final C17569l0 c17569l0, final VsMediaInfo vsMediaInfo, int i11) {
        c17569l0.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17582v.m75332p(c17569l0, vsMediaInfo, view);
            }
        });
        View viewM75275g = c17569l0.m75275g();
        if (viewM75275g != null) {
            viewM75275g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C17582v.m75333q(this.f58092a, view);
                }
            });
        }
        if (!TextUtils.isEmpty(vsMediaInfo.getImagePath())) {
            ImageView imageViewM75276h = c17569l0.m75276h();
            if (imageViewM75276h != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context context = c17569l0.itemView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                aVar.m94457m(context).m94468g(vsMediaInfo.getImagePath()).m94470i(R$drawable.upload_error_cover).m94471j(4).m94465d(imageViewM75276h);
                return;
            }
            return;
        }
        File file = new File(vsMediaInfo.getVideoPath());
        ImageView imageViewM75276h2 = c17569l0.m75276h();
        if (imageViewM75276h2 != null) {
            C23860f.a aVar2 = C23860f.f72909a;
            Context context2 = c17569l0.itemView.getContext();
            Intrinsics.m97801g(context2, "getContext(...)");
            aVar2.m94457m(context2).m94468g(Uri.fromFile(file).toString()).m94470i(R$drawable.upload_error_cover).m94471j(4).m94465d(imageViewM75276h2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m75332p(C17569l0 c17569l0, VsMediaInfo vsMediaInfo, View view) {
        VideoPreviewActivity.Companion companion = VideoPreviewActivity.INSTANCE;
        Context context = c17569l0.itemView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        companion.m75614a(context, vsMediaInfo, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m75333q(C17582v c17582v, View view) {
        if (c17582v.f58098d) {
            return;
        }
        c17582v.f58098d = false;
        C23889b c23889b = new C23889b();
        c23889b.m94631o(1);
        c23889b.m94630n(2);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
        c17582v.notifyDataSetChanged();
        c17582v.f58098d = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f58095a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        return ((VsMediaInfo) this.f58095a.get(i11)).getIsAdd() ? 2 : 1;
    }

    /* JADX INFO: renamed from: l */
    public final List m75334l() {
        ArrayList arrayList = new ArrayList();
        List<VsMediaInfo> list = this.f58095a;
        if (list != null) {
            for (VsMediaInfo vsMediaInfo : list) {
                if (!vsMediaInfo.getIsAdd()) {
                    arrayList.add(vsMediaInfo);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final List m75335m() {
        return this.f58095a;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m75336n() {
        List list = this.f58095a;
        return list != null && list.isEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C17569l0 holder, int i11) {
        Intrinsics.m97802h(holder, "holder");
        VsMediaInfo vsMediaInfo = (VsMediaInfo) this.f58095a.get(i11);
        if (vsMediaInfo.getIsAdd()) {
            m75329j(holder, vsMediaInfo);
        } else {
            m75331o(holder, vsMediaInfo, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C17569l0 onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        if (i11 != 1) {
            return i11 != 2 ? new C17569l0(null) : new C17569l0(LayoutInflater.from(parent.getContext()).inflate(R$layout.item_publish_add_video, (ViewGroup) null));
        }
        return new C17569l0(LayoutInflater.from(parent.getContext()).inflate(R$layout.item_publish_video, (ViewGroup) null));
    }

    public final void setData(List data) {
        Intrinsics.m97802h(data, "data");
        this.f58095a.clear();
        this.f58095a.addAll(data);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: t */
    public final void m75339t() {
        List list = this.f58095a;
        if (list != null) {
            list.clear();
        }
        notifyDataSetChanged();
    }
}
