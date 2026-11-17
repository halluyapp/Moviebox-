package com.transsion.publish.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.bumptech.glide.Glide;
import com.transsion.publish.C17602n;
import com.transsion.publish.R$drawable;
import com.transsion.publish.R$layout;
import com.transsion.publish.api.PhotoEntity;
import com.transsion.publish.p307ui.GalleryActivity;
import com.transsion.publish.p307ui.SelectImageActivity;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p465hp.C23889b;

/* JADX INFO: renamed from: com.transsion.publish.adapter.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C17558g extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: e */
    public static final a f58027e = new a(null);

    /* JADX INFO: renamed from: b */
    private FrameLayout.LayoutParams f58029b;

    /* JADX INFO: renamed from: d */
    private boolean f58031d;

    /* JADX INFO: renamed from: a */
    private List f58028a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private int f58030c = (AbstractC5806y.m27486b() - (AbstractC5776a0.m27313a(3.0f) * 5)) / 4;

    /* JADX INFO: renamed from: com.transsion.publish.adapter.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C17558g() {
        int i11 = this.f58030c;
        this.f58029b = new FrameLayout.LayoutParams(i11, i11);
    }

    /* JADX INFO: renamed from: j */
    private final void m75242j(final C17550c c17550c, PhotoEntity photoEntity) {
        if (getItemCount() == 0) {
            TextView textViewM75208i = c17550c.m75208i();
            if (textViewM75208i != null) {
                textViewM75208i.setText("0/9");
            }
        } else {
            List list = this.f58028a;
            boolean z11 = false;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((PhotoEntity) it.next()).getIsAdd()) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                TextView textViewM75208i2 = c17550c.m75208i();
                if (textViewM75208i2 != null) {
                    textViewM75208i2.setText((getItemCount() - 1) + "/9");
                }
            } else {
                TextView textViewM75208i3 = c17550c.m75208i();
                if (textViewM75208i3 != null) {
                    textViewM75208i3.setText(getItemCount() + "/9");
                }
            }
        }
        View viewM75205f = c17550c.m75205f();
        if (viewM75205f != null) {
            viewM75205f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C17558g.m75243k(c17550c, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m75243k(C17550c c17550c, C17558g c17558g, View view) {
        Context context;
        View viewM75205f = c17550c.m75205f();
        if (viewM75205f == null || (context = viewM75205f.getContext()) == null) {
            return;
        }
        SelectImageActivity.INSTANCE.m75501a(context, 0, 9 - c17558g.m75248l().size(), new ArrayList());
    }

    /* JADX INFO: renamed from: o */
    private final void m75244o(final C17550c c17550c, final PhotoEntity photoEntity, final int i11) {
        ImageView imageViewM75207h = c17550c.m75207h();
        if (imageViewM75207h != null) {
            Glide.with(c17550c.itemView.getContext()).load2(photoEntity.getLocalPath()).placeholder(R$drawable.upload_error_cover).into(imageViewM75207h);
        }
        c17550c.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17558g.m75245p(this.f58000a, c17550c, i11, view);
            }
        });
        View viewM75206g = c17550c.m75206g();
        if (viewM75206g != null) {
            viewM75206g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C17558g.m75246q(this.f58007a, photoEntity, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m75245p(C17558g c17558g, C17550c c17550c, int i11, View view) {
        List listM75248l = c17558g.m75248l();
        C17602n.f58119b.m75374a().m75373f(listM75248l);
        GalleryActivity.Companion companion = GalleryActivity.INSTANCE;
        Context context = c17550c.itemView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        companion.m75456a(context, listM75248l, i11, 2, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m75246q(C17558g c17558g, PhotoEntity photoEntity, View view) {
        if (c17558g.f58031d) {
            return;
        }
        c17558g.f58031d = false;
        c17558g.m75247t(photoEntity);
        c17558g.f58031d = false;
    }

    /* JADX INFO: renamed from: t */
    private final void m75247t(PhotoEntity photoEntity) {
        this.f58028a.remove(photoEntity);
        C23889b c23889b = new C23889b();
        boolean z11 = false;
        c23889b.m94631o(0);
        c23889b.m94630n(2);
        if (this.f58028a.size() == 0 || (this.f58028a.size() == 1 && ((PhotoEntity) this.f58028a.get(0)).getIsAdd())) {
            List list = this.f58028a;
            if (list != null) {
                list.clear();
            }
            notifyDataSetChanged();
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C23889b.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c23889b, 0L);
            return;
        }
        if (this.f58028a.size() == 8) {
            Iterator it = this.f58028a.iterator();
            while (it.hasNext()) {
                if (((PhotoEntity) it.next()).getIsAdd()) {
                    z11 = true;
                }
            }
            if (!z11) {
                PhotoEntity photoEntity2 = new PhotoEntity();
                photoEntity2.setAdd(true);
                this.f58028a.add(photoEntity2);
            }
        }
        FlowEventBus flowEventBus2 = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name2 = C23889b.class.getName();
        Intrinsics.m97801g(name2, "getName(...)");
        flowEventBus2.postEvent(name2, c23889b, 0L);
        notifyDataSetChanged();
    }

    public final void addData(List data) {
        Intrinsics.m97802h(data, "data");
        int size = this.f58028a.size();
        this.f58028a.addAll(data);
        notifyItemRangeInserted(size, data.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f58028a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        return ((PhotoEntity) this.f58028a.get(i11)).getIsAdd() ? 2 : 1;
    }

    /* JADX INFO: renamed from: l */
    public final List m75248l() {
        ArrayList arrayList = new ArrayList();
        for (PhotoEntity photoEntity : this.f58028a) {
            if (!photoEntity.getIsAdd()) {
                arrayList.add(photoEntity);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final List m75249m() {
        return this.f58028a;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m75250n() {
        List list = this.f58028a;
        return list != null && list.isEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C17550c holder, int i11) {
        Intrinsics.m97802h(holder, "holder");
        PhotoEntity photoEntity = (PhotoEntity) this.f58028a.get(i11);
        if (photoEntity.getIsAdd()) {
            m75242j(holder, photoEntity);
        } else {
            m75244o(holder, photoEntity, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C17550c onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        if (i11 != 1) {
            return i11 != 2 ? new C17550c(null) : new C17550c(LayoutInflater.from(parent.getContext()).inflate(R$layout.item_publish_add_image, (ViewGroup) null));
        }
        return new C17550c(LayoutInflater.from(parent.getContext()).inflate(R$layout.item_publish_image, (ViewGroup) null));
    }

    public final void setData(List data) {
        Intrinsics.m97802h(data, "data");
        this.f58028a.clear();
        this.f58028a.addAll(data);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: u */
    public final void m75253u() {
        List list = this.f58028a;
        if (list != null) {
            list.clear();
        }
        notifyDataSetChanged();
    }
}
