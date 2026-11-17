package com.transsion.home.adapter.operateUGC.adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.p282tn.lib.widget.R$string;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.operateUGC.provider.C14876c;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.bean.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p462hj.C23860f;
import p579ll.C25648d;
import p743rh.C27287m;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes5.dex */
public final class BannerUGCAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private final List f51926a;

    /* JADX INFO: renamed from: b */
    private final int f51927b;

    /* JADX INFO: renamed from: c */
    private final C14876c f51928c;

    /* JADX INFO: renamed from: d */
    private final OperateItem f51929d;

    /* JADX INFO: renamed from: e */
    private final int f51930e;

    /* JADX INFO: renamed from: f */
    private final int f51931f;

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.adapter.BannerUGCAdapter$a */
    public static final class C14844a extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        private final ImageView f51932a;

        /* JADX INFO: renamed from: b */
        private final TextView f51933b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14844a(View itemView) {
            super(itemView);
            Intrinsics.m97802h(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.home_ugc_banner_item_image);
            Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
            this.f51932a = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.home_ugc_banner_title);
            Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
            this.f51933b = (TextView) viewFindViewById2;
        }

        /* JADX INFO: renamed from: f */
        public final TextView m66741f() {
            return this.f51933b;
        }

        public final ImageView getImageView() {
            return this.f51932a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.adapter.BannerUGCAdapter$onBindViewHolder$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.home.adapter.operateUGC.adapter.BannerUGCAdapter$onBindViewHolder$1", m97637f = "BannerUGCAdapter.kt", m97638l = {75}, m97639m = "invokeSuspend")
    static final class C148451 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ BannerData $bannerData;
        final /* synthetic */ C14844a $holder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148451(BannerData bannerData, C14844a c14844a, Continuation<? super C148451> continuation) {
            super(2, continuation);
            this.$bannerData = bannerData;
            this.$holder = c14844a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C148451(this.$bannerData, this.$holder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C148451) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String url;
            AssetManager assets;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                Image image = this.$bannerData.getImage();
                if (image != null && (url = image.getUrl()) != null) {
                    C14844a c14844a = this.$holder;
                    Context context = c14844a.getImageView().getContext();
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream((context == null || (assets = context.getAssets()) == null) ? null : assets.open(url));
                    AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
                    BannerUGCAdapter$onBindViewHolder$1$1$1 bannerUGCAdapter$onBindViewHolder$1$1$1 = new BannerUGCAdapter$onBindViewHolder$1$1$1(c14844a, bitmapDecodeStream, null);
                    this.label = 1;
                    if (AbstractC25088i.m98910g(abstractC24917a2M99269c, bannerUGCAdapter$onBindViewHolder$1$1$1, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    public BannerUGCAdapter(List banners, int i11, C14876c bannerProvider, OperateItem operateItem) {
        Intrinsics.m97802h(banners, "banners");
        Intrinsics.m97802h(bannerProvider, "bannerProvider");
        Intrinsics.m97802h(operateItem, "operateItem");
        this.f51926a = banners;
        this.f51927b = i11;
        this.f51928c = bannerProvider;
        this.f51929d = operateItem;
        int iM27489e = AbstractC5806y.m27489e() - (AbstractC5776a0.m27313a(12.0f) * 2);
        this.f51930e = iM27489e;
        this.f51931f = Intrinsics.m97797c(operateItem.getStyleTemplate(), "BANNER_NARROW") ? (iM27489e * 5) / 14 : (iM27489e * 9) / 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m66737i(BannerData bannerData, BannerUGCAdapter bannerUGCAdapter, int i11, View view) {
        String deepLink;
        if (bannerData == null || (deepLink = bannerData.getDeepLink()) == null) {
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_toast);
            return;
        }
        AbstractC5114k.m23924g(deepLink, "&module_name=opt_banner_free&from_opt_id=" + bannerUGCAdapter.f51929d.getOpId() + "&ops=" + bannerData.getOps() + "&tab_id=" + bannerUGCAdapter.f51927b);
        C25648d.f77807c.m100953b(bannerUGCAdapter.f51927b, i11, bannerUGCAdapter.f51929d, bannerData);
    }

    /* JADX INFO: renamed from: k */
    private final void m66738k(BannerData bannerData, int i11) {
        if (this.f51928c.m66822I(bannerData != null ? bannerData.getDeepLink() : null)) {
            C25648d.f77807c.m100952a(this.f51927b, i11, this.f51929d, bannerData);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C14844a holder, int i11) {
        String url;
        String thumbnail;
        Image image;
        Image image2;
        String content;
        Intrinsics.m97802h(holder, "holder");
        if (this.f51926a.isEmpty()) {
            return;
        }
        final int size = i11 % this.f51926a.size();
        final BannerData bannerData = (BannerData) this.f51926a.get(size);
        String str = "";
        if (bannerData == null || !bannerData.getBuiltIn()) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = holder.getImageView().getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            if (bannerData == null || (image2 = bannerData.getImage()) == null || (url = image2.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94474m = bVarM94457m.m94468g(url).m94474m(this.f51930e);
            if (bannerData == null || (image = bannerData.getImage()) == null || (thumbnail = image.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94474m.m94473l(thumbnail).m94465d(holder.getImageView());
        } else {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new C148451(bannerData, holder, null), 3, null);
        }
        TextView textViewM66741f = holder.m66741f();
        if (bannerData != null && (content = bannerData.getContent()) != null) {
            str = content;
        }
        textViewM66741f.setText(str);
        m66738k(bannerData, size);
        holder.getImageView().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerUGCAdapter.m66737i(bannerData, this, size, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C14844a onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_ugc_banner, parent, false);
        Intrinsics.m97799e(viewInflate);
        C14844a c14844a = new C14844a(viewInflate);
        c14844a.getImageView().getLayoutParams().height = this.f51931f;
        return c14844a;
    }
}
