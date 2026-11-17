package com.transsion.audio.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsion.audio.R$drawable;
import com.transsion.audio.R$id;
import com.transsion.audio.R$layout;
import com.transsion.audio.R$string;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import sh.AbstractC27615b;

/* JADX INFO: renamed from: com.transsion.audio.adapter.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001fB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\rJ-\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0014\u0010\rJ\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0018¨\u0006 "}, m97100d2 = {"Lcom/transsion/audio/adapter/c;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/baselib/db/audio/AudioBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "dataList", "<init>", "(Ljava/util/List;)V", "holder", WebConstants.FIELD_ITEM, "", "K1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/baselib/db/audio/AudioBean;)V", "G1", "", "", "payloads", "E1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/baselib/db/audio/AudioBean;Ljava/util/List;)V", "D1", "Lcom/transsion/audio/adapter/c$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "I1", "(Lcom/transsion/audio/adapter/c$a;)V", "F", "Lcom/transsion/audio/adapter/c$a;", "F1", "()Lcom/transsion/audio/adapter/c$a;", "J1", "optionClickListener", "a", "Audio_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C14210c extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private a optionClickListener;

    /* JADX INFO: renamed from: com.transsion.audio.adapter.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo64457a(AudioBean audioBean);

        /* JADX INFO: renamed from: b */
        void mo64458b(AudioBean audioBean);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14210c(List<AudioBean> dataList) {
        super(R$layout.adapter_item_bottom_dialog, dataList);
        Intrinsics.m97802h(dataList, "dataList");
    }

    /* JADX INFO: renamed from: G1 */
    private final void m64448G1(BaseViewHolder holder, final AudioBean item) {
        TextView textView = (TextView) holder.getView(R$id.tv_process);
        Long readProcess = item.getReadProcess();
        long jLongValue = readProcess != null ? readProcess.longValue() : 0L;
        Long duration = item.getDuration();
        long jLongValue2 = duration != null ? duration.longValue() : 1L;
        int i11 = (int) (((jLongValue * 1.0f) / (jLongValue2 > 0 ? jLongValue2 : 1L)) * 100);
        if (i11 >= 0 && i11 < 101) {
            textView.setText(i11 + getContext().getString(R$string.listened));
        }
        ProgressBar progressBar = (ProgressBar) holder.getView(R$id.pb_subject);
        final ImageView imageView = (ImageView) holder.getView(R$id.iv_subject);
        imageView.setVisibility(0);
        progressBar.setVisibility(8);
        imageView.setImageResource(R$drawable.play_progress_bg);
        int status = item.getStatus();
        if (status == 1) {
            String string = getContext().getString(R$string.not_open);
            Intrinsics.m97801g(string, "getString(...)");
            textView.setText(string);
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
        } else if (status == 6) {
            String string2 = getContext().getString(R$string.finished);
            Intrinsics.m97801g(string2, "getString(...)");
            textView.setText(string2);
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
        } else if (status != 7) {
            progressBar.setVisibility(0);
            if (item.getStatus() == 3) {
                imageView.setImageResource(R$drawable.playing_progress_bg);
            } else {
                imageView.setImageResource(R$drawable.play_progress_bg);
            }
            progressBar.setProgress(i11);
        } else {
            String string3 = getContext().getString(R$string.error);
            Intrinsics.m97801g(string3, "getString(...)");
            textView.setText(string3);
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.audio.adapter.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14210c.m64449H1(item, imageView, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public static final void m64449H1(AudioBean audioBean, ImageView imageView, C14210c c14210c, View view) {
        if (audioBean.getStatus() == 3) {
            imageView.setImageResource(R$drawable.play_progress_bg);
        } else {
            imageView.setImageResource(R$drawable.playing_progress_bg);
        }
        a aVar = c14210c.optionClickListener;
        if (aVar != null) {
            aVar.mo64458b(audioBean);
        }
    }

    /* JADX INFO: renamed from: K1 */
    private final void m64450K1(BaseViewHolder holder, final AudioBean item) {
        String title = item.getTitle();
        if (TextUtils.isEmpty(title)) {
            title = item.getDesc();
        }
        holder.setText(R$id.tv_name, title);
        int i11 = R$id.tv_size;
        Long size = item.getSize();
        holder.setText(i11, size != null ? AbstractC27615b.m107445a(size.longValue(), 1) : null);
        holder.getView(R$id.iv_del).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.audio.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14210c.m64451L1(this.f50389a, item, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final void m64451L1(C14210c c14210c, AudioBean audioBean, View view) {
        a aVar = c14210c.optionClickListener;
        if (aVar != null) {
            aVar.mo64457a(audioBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, AudioBean item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        m64450K1(holder, item);
        m64448G1(holder, item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public void mo36108G(BaseViewHolder holder, AudioBean item, List<? extends Object> payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36108G(holder, item, payloads);
        m64448G1(holder, item);
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final a getOptionClickListener() {
        return this.optionClickListener;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m64455I1(a listener) {
        Intrinsics.m97802h(listener, "listener");
        this.optionClickListener = listener;
    }

    /* JADX INFO: renamed from: J1 */
    public final void m64456J1(a aVar) {
        this.optionClickListener = aVar;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
