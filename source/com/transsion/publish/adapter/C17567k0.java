package com.transsion.publish.adapter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baseui.R$mipmap;
import com.transsion.publish.R$drawable;
import com.transsion.publish.R$layout;
import com.transsion.publish.R$string;
import com.transsion.publish.api.VsMediaInfo;
import com.transsion.publish.p307ui.VideoPreviewActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p944yh.C28951b;

/* JADX INFO: renamed from: com.transsion.publish.adapter.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17567k0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private final Function1 f58056a;

    /* JADX INFO: renamed from: b */
    private List f58057b;

    /* JADX INFO: renamed from: c */
    private FrameLayout.LayoutParams f58058c;

    /* JADX INFO: renamed from: d */
    private List f58059d;

    /* JADX INFO: renamed from: e */
    private int f58060e;

    /* JADX INFO: renamed from: f */
    private int f58061f;

    /* JADX INFO: renamed from: g */
    private int f58062g;

    /* JADX INFO: renamed from: h */
    private int f58063h;

    public C17567k0(Function1 selectItem) {
        Intrinsics.m97802h(selectItem, "selectItem");
        this.f58056a = selectItem;
        this.f58057b = new ArrayList();
        this.f58059d = new ArrayList();
        this.f58060e = 1;
        this.f58061f = 52428800;
        this.f58062g = 1200000;
        this.f58063h = AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
        int iM27486b = (AbstractC5806y.m27486b() - (AbstractC5776a0.m27313a(3.0f) * 5)) / 4;
        this.f58058c = new FrameLayout.LayoutParams(iM27486b, iM27486b);
    }

    /* JADX INFO: renamed from: k */
    private final void m75258k(C17571m0 c17571m0, Function0 function0) {
        if (!m75260n() || c17571m0.m75279g().getVisibility() != 0) {
            function0.invoke();
            return;
        }
        String string = Utils.m27275a().getString(R$string.add_video_max_tips);
        Intrinsics.m97801g(string, "getString(...)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
        String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f58060e)}, 1));
        Intrinsics.m97801g(str, "format(...)");
        C13806h.f49015a.m62325l(str);
    }

    /* JADX INFO: renamed from: l */
    private final String m75259l(VsMediaInfo vsMediaInfo) {
        int i11 = 0;
        for (Object obj : this.f58059d) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            if (Intrinsics.m97797c(vsMediaInfo.getVideoPath(), ((VsMediaInfo) obj).getVideoPath())) {
                return String.valueOf(i12);
            }
            i11 = i12;
        }
        return TmcConstants.COLD_OPEN_TYPE;
    }

    /* JADX INFO: renamed from: n */
    private final boolean m75260n() {
        return this.f58059d.size() >= this.f58060e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Unit m75261q(boolean z11, boolean z12, boolean z13, C17567k0 c17567k0, final C17571m0 c17571m0, final VsMediaInfo vsMediaInfo, View it) {
        Intrinsics.m97802h(it, "it");
        if (z11) {
            C28951b.f88586a.m111455e("Exceeded video length, 20 mins Max");
            return Unit.f75682a;
        }
        if (z12) {
            C28951b.f88586a.m111455e(Utils.m27275a().getResources().getString(R$string.add_media_max_size_tips, 50));
            return Unit.f75682a;
        }
        if (z13) {
            C28951b.f88586a.m111455e("video requires at least 3s");
            return Unit.f75682a;
        }
        c17567k0.m75258k(c17571m0, new Function0() { // from class: com.transsion.publish.adapter.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C17567k0.m75262r(c17571m0, vsMediaInfo);
            }
        });
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Unit m75262r(C17571m0 c17571m0, VsMediaInfo vsMediaInfo) {
        VideoPreviewActivity.Companion companion = VideoPreviewActivity.INSTANCE;
        Context context = c17571m0.itemView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        companion.m75614a(context, vsMediaInfo, 2);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Unit m75263s(boolean z11, boolean z12, boolean z13, final C17567k0 c17567k0, C17571m0 c17571m0, final VsMediaInfo vsMediaInfo, View it) {
        Intrinsics.m97802h(it, "it");
        if (z11) {
            C28951b.f88586a.m111455e("Exceeded video length, 20 mins Max");
            return Unit.f75682a;
        }
        if (z12) {
            C28951b.f88586a.m111455e(Utils.m27275a().getResources().getString(R$string.add_media_max_size_tips, 50));
            return Unit.f75682a;
        }
        if (z13) {
            C28951b.f88586a.m111455e("video requires at least 3s");
            return Unit.f75682a;
        }
        c17567k0.m75258k(c17571m0, new Function0() { // from class: com.transsion.publish.adapter.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C17567k0.m75264t(vsMediaInfo, c17567k0);
            }
        });
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Unit m75264t(VsMediaInfo vsMediaInfo, C17567k0 c17567k0) {
        if (vsMediaInfo.getEnableSelect()) {
            c17567k0.m75268z(vsMediaInfo);
        } else {
            c17567k0.m75267y(vsMediaInfo);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: v */
    private final void m75265v(TextView textView, long j11) {
        if (j11 == 0) {
            return;
        }
        if (2001 <= j11 && j11 < 3000) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{0, 2}, 2));
            Intrinsics.m97801g(str, "format(...)");
            String str2 = String.format(str, Arrays.copyOf(new Object[0], 0));
            Intrinsics.m97801g(str2, "format(...)");
            textView.setText(str2);
            return;
        }
        if (4001 <= j11 && j11 < 5000) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.f75910a;
            String str3 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{0, 4}, 2));
            Intrinsics.m97801g(str3, "format(...)");
            String str4 = String.format(str3, Arrays.copyOf(new Object[0], 0));
            Intrinsics.m97801g(str4, "format(...)");
            textView.setText(str4);
            return;
        }
        int iD = MathKt.m97883d(j11 / 1000);
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.f75910a;
        String str5 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iD / 60), Integer.valueOf(iD % 60)}, 2));
        Intrinsics.m97801g(str5, "format(...)");
        String str6 = String.format(str5, Arrays.copyOf(new Object[0], 0));
        Intrinsics.m97801g(str6, "format(...)");
        textView.setText(str6);
    }

    /* JADX INFO: renamed from: w */
    private final void m75266w(VsMediaInfo vsMediaInfo) {
        VsMediaInfo vsMediaInfo2 = null;
        for (VsMediaInfo vsMediaInfo3 : this.f58059d) {
            if (TextUtils.equals(vsMediaInfo3.getVideoPath(), vsMediaInfo.getVideoPath())) {
                vsMediaInfo2 = vsMediaInfo3;
            }
        }
        if (this.f58059d.contains(vsMediaInfo)) {
            this.f58059d.remove(vsMediaInfo);
        }
        if (vsMediaInfo2 != null) {
            this.f58059d.remove(vsMediaInfo2);
        }
    }

    /* JADX INFO: renamed from: y */
    private final void m75267y(VsMediaInfo vsMediaInfo) {
        m75266w(vsMediaInfo);
        this.f58059d.add(vsMediaInfo);
        this.f58056a.invoke(Integer.valueOf(this.f58059d.size()));
        vsMediaInfo.setEnableSelect(true);
        int iIndexOf = this.f58057b.indexOf(vsMediaInfo);
        if (iIndexOf >= 0) {
            notifyItemChanged(iIndexOf, Boolean.TRUE);
        }
        if (m75260n()) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: z */
    private final void m75268z(VsMediaInfo vsMediaInfo) {
        boolean zM75260n = m75260n();
        m75266w(vsMediaInfo);
        this.f58056a.invoke(Integer.valueOf(this.f58059d.size()));
        vsMediaInfo.setEnableSelect(false);
        int iIndexOf = this.f58057b.indexOf(vsMediaInfo);
        if (iIndexOf >= 0) {
            notifyItemChanged(iIndexOf, Boolean.FALSE);
        }
        if (zM75260n) {
            notifyDataSetChanged();
        }
    }

    public final void addData(List data) {
        Intrinsics.m97802h(data, "data");
        int size = this.f58057b.size();
        this.f58057b.addAll(data);
        notifyItemRangeInserted(size, data.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f58057b.size();
    }

    /* JADX INFO: renamed from: m */
    public final List m75269m() {
        return this.f58059d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final C17571m0 holder, int i11) {
        Intrinsics.m97802h(holder, "holder");
        final VsMediaInfo vsMediaInfo = (VsMediaInfo) this.f58057b.get(i11);
        holder.itemView.setLayoutParams(this.f58058c);
        m75265v(holder.m75281i(), vsMediaInfo.getVideoDuration());
        if (TextUtils.isEmpty(vsMediaInfo.getImagePath())) {
            String videoPath = vsMediaInfo.getVideoPath();
            File file = videoPath != null ? new File(videoPath) : null;
            if (file != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context context = holder.m75278f().getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                aVar.m94457m(context).m94468g(Uri.fromFile(file).toString()).m94470i(R$mipmap.home_ic_default_res).m94465d(holder.m75278f());
            }
        } else {
            C23860f.a aVar2 = C23860f.f72909a;
            Context context2 = holder.m75278f().getContext();
            Intrinsics.m97801g(context2, "getContext(...)");
            aVar2.m94457m(context2).m94468g(vsMediaInfo.getImagePath()).m94470i(R$mipmap.home_ic_default_res).m94465d(holder.m75278f());
        }
        boolean z11 = vsMediaInfo.getVideoSize() >= ((long) this.f58061f);
        boolean z12 = vsMediaInfo.getVideoDuration() >= ((long) this.f58062g);
        boolean z13 = vsMediaInfo.getVideoDuration() < ((long) this.f58063h);
        if (!m75260n()) {
            holder.m75279g().setVisibility(8);
            if (vsMediaInfo.getEnableSelect()) {
                holder.m75282j().setText(m75259l(vsMediaInfo));
                holder.m75282j().setBackgroundResource(R$drawable.bg_linear_r16);
            } else {
                holder.m75282j().setText("");
                holder.m75282j().setBackgroundResource(R$drawable.ic_select_number_bro);
            }
        } else if (vsMediaInfo.getEnableSelect()) {
            holder.m75279g().setVisibility(8);
            holder.m75282j().setText(m75259l(vsMediaInfo));
            holder.m75282j().setBackgroundResource(R$drawable.bg_linear_r16);
        } else {
            holder.m75279g().setVisibility(0);
            holder.m75282j().setText("");
            holder.m75282j().setBackgroundResource(R$drawable.ic_select_number_bro);
        }
        if (z11 || z12 || z13) {
            holder.m75279g().setVisibility(0);
        }
        View itemView = holder.itemView;
        Intrinsics.m97801g(itemView, "itemView");
        final boolean z14 = z12;
        final boolean z15 = z11;
        final boolean z16 = z13;
        AbstractC26006c.m102050c(itemView, 0L, new Function1() { // from class: com.transsion.publish.adapter.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C17567k0.m75261q(z14, z15, z16, this, holder, vsMediaInfo, (View) obj);
            }
        }, 1, null);
        AbstractC26006c.m102050c(holder.m75280h(), 0L, new Function1() { // from class: com.transsion.publish.adapter.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C17567k0.m75263s(z14, z15, z16, this, holder, vsMediaInfo, (View) obj);
            }
        }, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C17571m0 holder, int i11, List payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(payloads, "payloads");
        if (!(CollectionsKt.m97361k0(payloads) instanceof Boolean)) {
            super.onBindViewHolder(holder, i11, payloads);
            return;
        }
        VsMediaInfo vsMediaInfo = (VsMediaInfo) this.f58057b.get(i11);
        if (vsMediaInfo.getEnableSelect()) {
            holder.m75282j().setText(m75259l(vsMediaInfo));
            holder.m75282j().setBackgroundResource(R$drawable.bg_linear_r16);
        } else {
            holder.m75282j().setText("");
            holder.m75282j().setBackgroundResource(R$drawable.ic_select_number_bro);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public C17571m0 onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.upload_select_video_item, (ViewGroup) null);
        Intrinsics.m97799e(viewInflate);
        return new C17571m0(viewInflate);
    }

    /* JADX INFO: renamed from: x */
    public final void m75273x(VsMediaInfo data) {
        Intrinsics.m97802h(data, "data");
        VsMediaInfo vsMediaInfo = data;
        for (VsMediaInfo vsMediaInfo2 : this.f58057b) {
            if (TextUtils.equals(vsMediaInfo2.getVideoPath(), data.getVideoPath())) {
                vsMediaInfo2.setEnableSelect(data.getEnableSelect());
                vsMediaInfo = vsMediaInfo2;
            }
        }
        if (data.getEnableSelect()) {
            m75267y(vsMediaInfo);
        } else {
            m75268z(vsMediaInfo);
        }
        notifyItemRangeChanged(0, this.f58057b.size(), Boolean.TRUE);
    }
}
