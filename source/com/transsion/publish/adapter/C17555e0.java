package com.transsion.publish.adapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.google.android.gms.gcm.Task;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baseui.R$mipmap;
import com.transsion.baseui.util.C14557c;
import com.transsion.publish.C17602n;
import com.transsion.publish.R$drawable;
import com.transsion.publish.R$layout;
import com.transsion.publish.R$string;
import com.transsion.publish.api.PhotoEntity;
import com.transsion.publish.p307ui.ClippingImageActivity;
import com.transsion.publish.p307ui.GalleryActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import p462hj.C23860f;
import p944yh.C28951b;

/* JADX INFO: renamed from: com.transsion.publish.adapter.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17555e0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private final Function1 f58009a;

    /* JADX INFO: renamed from: b */
    private List f58010b;

    /* JADX INFO: renamed from: c */
    private FrameLayout.LayoutParams f58011c;

    /* JADX INFO: renamed from: d */
    private int f58012d;

    /* JADX INFO: renamed from: e */
    private List f58013e;

    /* JADX INFO: renamed from: f */
    private int f58014f;

    /* JADX INFO: renamed from: g */
    private int f58015g;

    /* JADX INFO: renamed from: h */
    private Activity f58016h;

    /* JADX INFO: renamed from: i */
    private int f58017i;

    /* JADX INFO: renamed from: com.transsion.publish.adapter.e0$a */
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ PhotoEntity f58019b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C17557f0 f58020c;

        a(PhotoEntity photoEntity, C17557f0 c17557f0) {
            this.f58019b = photoEntity;
            this.f58020c = c17557f0;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C17555e0 c17555e0;
            Activity activity;
            if (C14557c.f51100a.m65671a(view != null ? view.getId() : 0, 500L)) {
                return;
            }
            if (C17555e0.this.f58015g == 5 || C17555e0.this.f58015g == 7) {
                String localPath = this.f58019b.getLocalPath();
                if (localPath == null || (activity = (c17555e0 = C17555e0.this).f58016h) == null) {
                    return;
                }
                ClippingImageActivity.Companion.m75398b(ClippingImageActivity.INSTANCE, activity, localPath, c17555e0.f58015g, null, 8, null);
                return;
            }
            if (C17555e0.this.m75224t()) {
                C17555e0.this.m75223s(this.f58019b, this.f58020c, true);
            } else if (this.f58019b.getEnableSelect()) {
                C17555e0.this.m75223s(this.f58019b, this.f58020c, true);
            } else {
                C17555e0.this.m75220m(this.f58019b, this.f58020c);
            }
        }
    }

    public C17555e0(Function1 selectItem) {
        Intrinsics.m97802h(selectItem, "selectItem");
        this.f58009a = selectItem;
        this.f58010b = new ArrayList();
        this.f58013e = new ArrayList();
        this.f58014f = 9;
        this.f58017i = Task.EXTRAS_LIMIT_BYTES;
        this.f58012d = (AbstractC5806y.m27486b() - (AbstractC5776a0.m27313a(3.0f) * 5)) / 4;
        int i11 = this.f58012d;
        this.f58011c = new FrameLayout.LayoutParams(i11, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m75220m(PhotoEntity photoEntity, C17557f0 c17557f0) {
        m75221o(photoEntity);
        this.f58013e.add(photoEntity);
        this.f58009a.invoke(Integer.valueOf(this.f58013e.size()));
        photoEntity.setEnableSelect(true);
        c17557f0.m75237h().setText(m75222p(photoEntity));
        c17557f0.m75237h().setBackgroundResource(R$drawable.bg_linear_r16);
        if (m75224t()) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m75221o(PhotoEntity photoEntity) {
        PhotoEntity photoEntity2 = null;
        for (PhotoEntity photoEntity3 : this.f58013e) {
            if (TextUtils.equals(photoEntity3.getLocalPath(), photoEntity.getLocalPath())) {
                photoEntity2 = photoEntity3;
            }
        }
        if (this.f58013e.contains(photoEntity)) {
            this.f58013e.remove(photoEntity);
        }
        if (photoEntity2 != null) {
            this.f58013e.remove(photoEntity2);
        }
    }

    /* JADX INFO: renamed from: p */
    private final String m75222p(PhotoEntity photoEntity) {
        int i11 = 0;
        for (Object obj : this.f58013e) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            if (Intrinsics.m97797c(photoEntity.getLocalPath(), ((PhotoEntity) obj).getLocalPath())) {
                return String.valueOf(i12);
            }
            i11 = i12;
        }
        return TmcConstants.COLD_OPEN_TYPE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m75223s(PhotoEntity photoEntity, C17557f0 c17557f0, boolean z11) {
        if (photoEntity.getEnableSelect()) {
            m75221o(photoEntity);
            this.f58009a.invoke(Integer.valueOf(this.f58013e.size()));
            photoEntity.setEnableSelect(false);
            c17557f0.m75237h().setText("");
            c17557f0.m75237h().setBackgroundResource(R$drawable.ic_select_number_bro);
            if (z11) {
                notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final boolean m75224t() {
        return this.f58013e.size() >= this.f58014f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m75225v(C17557f0 c17557f0, C17555e0 c17555e0, PhotoEntity photoEntity, int i11, View view) {
        Activity activity;
        String string;
        if (c17557f0.m75238i().getVisibility() == 0) {
            Activity activity2 = c17555e0.f58016h;
            if (activity2 == null || (string = activity2.getString(R$string.add_img_max_tips)) == null) {
                string = "";
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(c17555e0.f58014f)}, 1));
            Intrinsics.m97801g(str, "format(...)");
            C13806h.f49015a.m62325l(str);
            return;
        }
        int i12 = c17555e0.f58015g;
        if (i12 != 5 && i12 != 7) {
            C17602n.f58119b.m75374a().m75373f(c17555e0.f58010b);
            GalleryActivity.Companion companion = GalleryActivity.INSTANCE;
            Context context = c17557f0.itemView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            companion.m75456a(context, c17555e0.f58013e, i11, 1, c17555e0.f58014f);
            return;
        }
        if (photoEntity.getImageSize() > c17555e0.f58017i) {
            C28951b.f88586a.m111455e(Utils.m27275a().getResources().getString(R$string.add_media_max_size_tips, 10));
            return;
        }
        String localPath = photoEntity.getLocalPath();
        if (localPath == null || (activity = c17555e0.f58016h) == null) {
            return;
        }
        ClippingImageActivity.Companion.m75398b(ClippingImageActivity.INSTANCE, activity, localPath, c17555e0.f58015g, null, 8, null);
    }

    /* JADX INFO: renamed from: A */
    public final void m75226A(PhotoEntity photoEntity) {
        if (photoEntity == null || this.f58013e.contains(photoEntity)) {
            return;
        }
        this.f58013e.add(photoEntity);
    }

    public final void addData(List data) {
        Intrinsics.m97802h(data, "data");
        int size = this.f58010b.size();
        this.f58010b.addAll(data);
        notifyItemRangeInserted(size, data.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f58010b.size();
    }

    /* JADX INFO: renamed from: n */
    public final void m75227n() {
        List list = this.f58013e;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: q */
    public final List m75228q() {
        return this.f58010b;
    }

    /* JADX INFO: renamed from: r */
    public final List m75229r() {
        return this.f58013e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final C17557f0 holder, final int i11) {
        Intrinsics.m97802h(holder, "holder");
        final PhotoEntity photoEntity = (PhotoEntity) this.f58010b.get(i11);
        holder.itemView.setLayoutParams(this.f58011c);
        if (TextUtils.isEmpty(photoEntity.getThumbPath())) {
            String localPath = photoEntity.getLocalPath();
            if (localPath != null && localPath.length() > 0) {
                File file = new File(photoEntity.getLocalPath());
                C23860f.a aVar = C23860f.f72909a;
                Context context = holder.m75235f().getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                aVar.m94457m(context).m94468g(Uri.fromFile(file).toString()).m94470i(R$mipmap.home_ic_default_res).m94471j(0).m94474m(this.f58012d).m94464c(this.f58012d).m94465d(holder.m75235f());
            }
        } else {
            File file2 = new File(photoEntity.getThumbPath());
            C23860f.a aVar2 = C23860f.f72909a;
            Context context2 = holder.m75235f().getContext();
            Intrinsics.m97801g(context2, "getContext(...)");
            aVar2.m94457m(context2).m94468g(Uri.fromFile(file2).toString()).m94470i(R$mipmap.home_ic_default_res).m94471j(0).m94474m(this.f58012d).m94464c(this.f58012d).m94465d(holder.m75235f());
        }
        if (this.f58015g != 0) {
            holder.m75238i().setVisibility(8);
            holder.m75237h().setBackgroundResource(0);
        } else if (!m75224t()) {
            holder.m75238i().setVisibility(8);
            if (photoEntity.getEnableSelect()) {
                holder.m75237h().setText(m75222p(photoEntity));
                holder.m75237h().setBackgroundResource(R$drawable.bg_linear_r16);
            } else {
                holder.m75237h().setText("");
                holder.m75237h().setBackgroundResource(R$drawable.ic_select_number_bro);
            }
        } else if (photoEntity.getEnableSelect()) {
            holder.m75238i().setVisibility(8);
            holder.m75237h().setText(m75222p(photoEntity));
            holder.m75237h().setBackgroundResource(R$drawable.bg_linear_r16);
        } else {
            holder.m75238i().setVisibility(0);
            holder.m75237h().setText("");
            holder.m75237h().setBackgroundResource(R$drawable.ic_select_number_bro);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17555e0.m75225v(holder, this, photoEntity, i11, view);
            }
        });
        holder.m75236g().setOnClickListener(new a(photoEntity, holder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C17557f0 onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_select_image, (ViewGroup) null);
        Intrinsics.m97799e(viewInflate);
        return new C17557f0(viewInflate);
    }

    /* JADX INFO: renamed from: x */
    public final void m75232x() {
        List list = this.f58010b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((PhotoEntity) it.next()).setEnableSelect(false);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m75233y(int i11, Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        this.f58015g = i11;
        this.f58016h = activity;
    }

    /* JADX INFO: renamed from: z */
    public final void m75234z(int i11) {
        this.f58014f = i11;
    }
}
