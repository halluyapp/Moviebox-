package com.transsion.postdetail.p306ui.adapter;

import android.content.Context;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.therouter.TheRouter;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.room.api.RoomsViewType;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p353dp.C23027r;
import p353dp.C23028s;
import p353dp.C23029t;
import p353dp.C23030u;
import p353dp.C23031v;
import p353dp.C23032w;
import p353dp.C23035z;
import p415fq.InterfaceC23414e;
import p415fq.InterfaceC23415f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import p840vj.C28117b;

/* JADX INFO: renamed from: com.transsion.postdetail.ui.adapter.i */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m97100d2 = {"Lcom/transsion/postdetail/ui/adapter/i;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "Lu6/i;", "Landroid/content/Context;", "context", "Lcom/transsion/postdetail/ui/adapter/PostAdapterFrom;", "adapterFrom", "Lvj/b;", "exposureHelper", "", "pageName", "pageFrom", "Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycleScope", "<init>", "(Landroid/content/Context;Lcom/transsion/postdetail/ui/adapter/PostAdapterFrom;Lvj/b;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/LifecycleCoroutineScope;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "G", "Lvj/b;", "Landroidx/recyclerview/widget/RecyclerView$s;", "H", "Landroidx/recyclerview/widget/RecyclerView$s;", "imageRecycledViewPool", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C16985i extends BaseProviderMultiAdapter<PostSubjectItem> implements InterfaceC27944i {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C28117b exposureHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final RecyclerView.C4220s imageRecycledViewPool;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.adapter.i$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f57000a;

        static {
            int[] iArr = new int[PostAdapterFrom.values().length];
            try {
                iArr[PostAdapterFrom.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostAdapterFrom.NEARBY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostAdapterFrom.DETAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostAdapterFrom.STAGGERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f57000a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16985i(Context context, PostAdapterFrom adapterFrom, C28117b c28117b, String str, String str2, LifecycleCoroutineScope lifecycleCoroutineScope) {
        super(null, 1, null);
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(adapterFrom, "adapterFrom");
        this.exposureHelper = c28117b;
        RecyclerView.C4220s c4220s = new RecyclerView.C4220s();
        this.imageRecycledViewPool = c4220s;
        int i11 = a.f57000a[adapterFrom.ordinal()];
        if (i11 == 1) {
            mo36107F1(new C23030u(str, str2, c4220s));
        } else if (i11 == 2) {
            mo36107F1(new C23031v(str, str2, c4220s));
        } else if (i11 == 3) {
            mo36107F1(new C23029t(str, str2, c4220s));
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            mo36107F1(new C23035z(str, str2, c4220s, context, lifecycleCoroutineScope));
        }
        if (adapterFrom == PostAdapterFrom.NEARBY) {
            InterfaceC23415f interfaceC23415f = (InterfaceC23415f) TheRouter.m61774d(InterfaceC23415f.class, new Object[0]);
            InterfaceC23414e interfaceC23414eMo92965c = interfaceC23415f != null ? interfaceC23415f.mo92965c(context, RoomsViewType.TYPE_ROOM_HOME) : null;
            if (interfaceC23414eMo92965c != null) {
                mo36107F1(new C23032w(interfaceC23414eMo92965c));
            }
        }
        if (adapterFrom == PostAdapterFrom.DEFAULT) {
            mo36107F1(new C23028s());
            mo36107F1(new C23027r());
        }
    }

    public /* synthetic */ C16985i(Context context, PostAdapterFrom postAdapterFrom, C28117b c28117b, String str, String str2, LifecycleCoroutineScope lifecycleCoroutineScope, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, postAdapterFrom, c28117b, str, str2, (i11 & 32) != 0 ? null : lifecycleCoroutineScope);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int adapterPosition = holder.getAdapterPosition();
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null) {
            RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutManager");
            C28117b.m109192j(c28117b, layoutManager, adapterPosition, true, false, 8, null);
        }
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends PostSubjectItem> data, int position) {
        Intrinsics.m97802h(data, "data");
        PostSubjectItem postSubjectItem = data.get(position);
        if (postSubjectItem.getNonAdDelegate() != null) {
            return MediaType.POST_DETAIL_FOR_YOU_NATIVE_AD.ordinal();
        }
        if (postSubjectItem.isRoomList()) {
            return MediaType.ROOM_LIST.ordinal();
        }
        if (postSubjectItem.isRoomCacheListStart()) {
            return MediaType.ROOM_CACHE_LIST_START.ordinal();
        }
        return postSubjectItem.isRoomCacheListEnd() ? MediaType.ROOM_CACHE_LIST_END.ordinal() : MediaType.CONTENT_ALL.ordinal();
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
