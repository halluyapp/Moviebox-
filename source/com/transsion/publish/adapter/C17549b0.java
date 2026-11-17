package com.transsion.publish.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.p285ad.p286db.pslink.AppInstalledBean;
import com.transsion.publish.R$drawable;
import com.transsion.publish.R$layout;
import com.transsion.publish.R$string;
import com.transsion.publish.api.AudioEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p944yh.C28951b;

/* JADX INFO: renamed from: com.transsion.publish.adapter.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17549b0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: b */
    private FrameLayout.LayoutParams f57986b;

    /* JADX INFO: renamed from: c */
    private InterfaceC17584x f57987c;

    /* JADX INFO: renamed from: e */
    private AudioEntity f57989e;

    /* JADX INFO: renamed from: a */
    private List f57985a = new ArrayList();

    /* JADX INFO: renamed from: d */
    private int f57988d = (AbstractC5806y.m27486b() - (AbstractC5776a0.m27313a(3.0f) * 5)) / 4;

    public C17549b0() {
        int i11 = this.f57988d;
        this.f57986b = new FrameLayout.LayoutParams(i11, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m75196m(C17549b0 c17549b0, AudioEntity audioEntity, View view) {
        if (c17549b0.m75200k(audioEntity.getSize())) {
            C28951b.f88586a.m111455e(Utils.m27275a().getResources().getString(R$string.add_media_max_size_tips, 50));
            return;
        }
        if (audioEntity.getEnableSelect()) {
            Iterator it = c17549b0.f57985a.iterator();
            while (it.hasNext()) {
                ((AudioEntity) it.next()).setEnableSelect(false);
            }
            audioEntity.setPlay(false);
            c17549b0.f57989e = null;
            c17549b0.notifyDataSetChanged();
            return;
        }
        Iterator it2 = c17549b0.f57985a.iterator();
        while (it2.hasNext()) {
            ((AudioEntity) it2.next()).setEnableSelect(false);
        }
        audioEntity.setPlay(true);
        audioEntity.setEnableSelect(true);
        c17549b0.f57989e = audioEntity;
        InterfaceC17584x interfaceC17584x = c17549b0.f57987c;
        if (interfaceC17584x != null) {
            interfaceC17584x.mo75342a(audioEntity);
        }
        c17549b0.notifyDataSetChanged();
    }

    public final void addData(List data) {
        Intrinsics.m97802h(data, "data");
        int size = this.f57985a.size();
        this.f57985a.addAll(data);
        notifyItemRangeInserted(size, data.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f57985a.size();
    }

    /* JADX INFO: renamed from: h */
    public final List m75197h() {
        return this.f57985a;
    }

    /* JADX INFO: renamed from: i */
    public final AudioEntity m75198i() {
        return this.f57989e;
    }

    /* JADX INFO: renamed from: j */
    public final String m75199j(long j11) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(j11));
        BigDecimal bigDecimal2 = new BigDecimal("1024");
        double dDoubleValue = bigDecimal.divide(bigDecimal2, 1, 1).doubleValue();
        if (dDoubleValue < 1024.0d) {
            return dDoubleValue + "KB";
        }
        String string = new BigDecimal(dDoubleValue).divide(bigDecimal2, 1, 1).toString();
        Intrinsics.m97801g(string, "toString(...)");
        return string + AppInstalledBean.APP_INSTALLED_BEAN_SOURCE_MB;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m75200k(long j11) {
        long j12 = 1024;
        long j13 = j11 / j12;
        return j13 >= 1024 && j13 / j12 >= 50;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C17551c0 holder, int i11) {
        Intrinsics.m97802h(holder, "holder");
        final AudioEntity audioEntity = (AudioEntity) this.f57985a.get(i11);
        holder.m75212i().setText(audioEntity.getImageTitle());
        TextView textViewM75210g = holder.m75210g();
        String strM75199j = m75199j(audioEntity.getSize());
        Long duration = audioEntity.getDuration();
        textViewM75210g.setText(strM75199j + " " + TimeUtilKt.m65664p((duration != null ? duration.longValue() : 0L) / ((long) 1000)));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.adapter.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17549b0.m75196m(this.f57979a, audioEntity, view);
            }
        });
        if (audioEntity.getEnableSelect()) {
            holder.m75211h().setVisibility(0);
        } else {
            holder.m75211h().setVisibility(8);
        }
        if (audioEntity.getPlay()) {
            holder.m75209f().setImageResource(R$drawable.ic_audio_pause);
        } else {
            holder.m75209f().setImageResource(R$drawable.ic_audio_play);
        }
        if (!m75200k(audioEntity.getSize())) {
            holder.m75213j().setVisibility(8);
        } else {
            holder.m75213j().getBackground().mutate().setAlpha(178);
            holder.m75213j().setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C17551c0 onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_select_music, parent, false);
        Intrinsics.m97799e(viewInflate);
        return new C17551c0(viewInflate);
    }

    /* JADX INFO: renamed from: o */
    public final void m75203o() {
        List<AudioEntity> list = this.f57985a;
        if (list != null) {
            for (AudioEntity audioEntity : list) {
                if (audioEntity.getPlay()) {
                    audioEntity.setPlay(false);
                }
            }
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: p */
    public final void m75204p(InterfaceC17584x selectItemClickListener) {
        Intrinsics.m97802h(selectItemClickListener, "selectItemClickListener");
        this.f57987c = selectItemClickListener;
    }
}
