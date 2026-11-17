package com.transsion.home.adapter.hashtag;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.home.hashtag.model.HashTagItem;
import com.transsion.home.hashtag.model.HashTagItemType;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p463hl.C23864b;
import p463hl.C23866d;
import p579ll.C25646b;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.home.adapter.hashtag.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m97100d2 = {"Lcom/transsion/home/adapter/hashtag/a;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/home/hashtag/model/HashTagItem;", "Lu6/i;", "Lcom/transsion/home/adapter/hashtag/a$a;", "callbacks", "Lll/b;", "listExposureHelper", "<init>", "(Lcom/transsion/home/adapter/hashtag/a$a;Lll/b;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "G", "Lcom/transsion/home/adapter/hashtag/a$a;", "H", "Lll/b;", "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C14842a extends BaseProviderMultiAdapter<HashTagItem> implements InterfaceC27944i {

    /* JADX INFO: renamed from: I */
    public static final int f51921I = 8;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final a callbacks;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C25646b listExposureHelper;

    /* JADX INFO: renamed from: com.transsion.home.adapter.hashtag.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo66734a(UGCVideo uGCVideo, int i11);

        /* JADX INFO: renamed from: b */
        void mo66735b(UGCVideoHashTag uGCVideoHashTag);
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.hashtag.a$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51924a;

        static {
            int[] iArr = new int[HashTagItemType.values().length];
            try {
                iArr[HashTagItemType.TAGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HashTagItemType.HASHTAG_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51924a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14842a(a callbacks, C25646b c25646b) {
        super(null, 1, null);
        Intrinsics.m97802h(callbacks, "callbacks");
        this.callbacks = callbacks;
        this.listExposureHelper = c25646b;
        mo36107F1(new C23866d(callbacks));
        mo36107F1(new C23864b(callbacks));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        C25646b c25646b;
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager) || (c25646b = this.listExposureHelper) == null) {
            return;
        }
        c25646b.m100944h((LinearLayoutManager) layoutManager, bindingAdapterPosition, true);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends HashTagItem> data, int position) {
        Intrinsics.m97802h(data, "data");
        int i11 = b.f51924a[data.get(position).getType().ordinal()];
        if (i11 == 1) {
            return HashTagItemType.TAGS.ordinal();
        }
        if (i11 == 2) {
            return HashTagItemType.HASHTAG_CARD.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
