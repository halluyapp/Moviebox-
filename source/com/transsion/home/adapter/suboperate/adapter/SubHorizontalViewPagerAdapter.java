package com.transsion.home.adapter.suboperate.adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5123t;
import com.p282tn.lib.widget.R$string;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.helper.C14451b;
import com.transsion.edcation.CourseManager;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.downloader.widget.DownloadView;
import is.AbstractC24222c;
import java.util.HashMap;
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
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p842vl.AbstractC28126h;
import p982zk.AbstractC29190a;

/* JADX INFO: loaded from: classes5.dex */
public final class SubHorizontalViewPagerAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private final List f52177a;

    /* JADX INFO: renamed from: b */
    private final int f52178b;

    /* JADX INFO: renamed from: c */
    private final OperateItem f52179c;

    /* JADX INFO: renamed from: d */
    private final int f52180d;

    /* JADX INFO: renamed from: e */
    private final int f52181e;

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.adapter.SubHorizontalViewPagerAdapter$a */
    public static final class C14923a extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        private final ImageView f52182a;

        /* JADX INFO: renamed from: b */
        private final DownloadView f52183b;

        /* JADX INFO: renamed from: c */
        private final TextView f52184c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14923a(View itemView) {
            super(itemView);
            Intrinsics.m97802h(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.home_sub_pager_item_image);
            Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
            this.f52182a = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.sub_operation_banner_download);
            Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
            this.f52183b = (DownloadView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.sub_operation_banner_title);
            Intrinsics.m97801g(viewFindViewById3, "findViewById(...)");
            this.f52184c = (TextView) viewFindViewById3;
        }

        /* JADX INFO: renamed from: f */
        public final DownloadView m66951f() {
            return this.f52183b;
        }

        /* JADX INFO: renamed from: g */
        public final TextView m66952g() {
            return this.f52184c;
        }

        public final ImageView getImageView() {
            return this.f52182a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.adapter.SubHorizontalViewPagerAdapter$onBindViewHolder$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.home.adapter.suboperate.adapter.SubHorizontalViewPagerAdapter$onBindViewHolder$1", m97637f = "SubHorizontalViewPagerAdapter.kt", m97638l = {67}, m97639m = "invokeSuspend")
    static final class C149241 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ BannerData $bannerData;
        final /* synthetic */ C14923a $holder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C149241(BannerData bannerData, C14923a c14923a, Continuation<? super C149241> continuation) {
            super(2, continuation);
            this.$bannerData = bannerData;
            this.$holder = c14923a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C149241(this.$bannerData, this.$holder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C149241) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
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
                    C14923a c14923a = this.$holder;
                    Context context = c14923a.getImageView().getContext();
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream((context == null || (assets = context.getAssets()) == null) ? null : assets.open(url));
                    AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
                    SubHorizontalViewPagerAdapter$onBindViewHolder$1$1$1 subHorizontalViewPagerAdapter$onBindViewHolder$1$1$1 = new SubHorizontalViewPagerAdapter$onBindViewHolder$1$1$1(c14923a, bitmapDecodeStream, null);
                    this.label = 1;
                    if (AbstractC25088i.m98910g(abstractC24917a2M99269c, subHorizontalViewPagerAdapter$onBindViewHolder$1$1$1, this) == objF) {
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

    public SubHorizontalViewPagerAdapter(List banners, int i11, OperateItem operateItem, int i12, int i13) {
        Intrinsics.m97802h(banners, "banners");
        Intrinsics.m97802h(operateItem, "operateItem");
        this.f52177a = banners;
        this.f52178b = i11;
        this.f52179c = operateItem;
        this.f52180d = i12;
        this.f52181e = i13;
    }

    /* JADX INFO: renamed from: i */
    private final Subject m66941i(BannerData bannerData) {
        if (bannerData == null) {
            return null;
        }
        return new Subject(bannerData.getSubjectId(), Integer.valueOf(bannerData.getSubjectType()), null, null, null, null, null, null, null, null, null, null, null, null, null, bannerData.getSeenStatus(), null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -32772, 67108863, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m66942l(BannerData bannerData, SubHorizontalViewPagerAdapter subHorizontalViewPagerAdapter, int i11, View view) {
        String deepLink;
        if (bannerData == null || (deepLink = bannerData.getDeepLink()) == null) {
            return;
        }
        Uri uriM65157g = C14451b.f50862a.m65157g(Uri.parse(deepLink + "&module_name=opt_banner_free&autoPlay=true&ops=" + bannerData.getOps()));
        if (uriM65157g != null) {
            AbstractC24222c.m95245j(uriM65157g);
        }
        subHorizontalViewPagerAdapter.m66945p(bannerData, i11, DownloadManagerApi.m87075x0(DownloadManagerApi.f66480j.m87093a(), bannerData.getSubjectId(), null, false, false, 12, null) ? "play_subject" : "download_subject");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m66943m(C14923a c14923a, BannerData bannerData, SubHorizontalViewPagerAdapter subHorizontalViewPagerAdapter, Context context, int i11, View view) {
        if (c14923a.m66951f().getCom.cloud.tmc.kernel.minicover.NativeComponentConstants.KEY_COMPONENT_TYPE java.lang.String() == 2 || c14923a.m66951f().getCom.cloud.tmc.kernel.minicover.NativeComponentConstants.KEY_COMPONENT_TYPE java.lang.String() == 3) {
            if (bannerData != null) {
                CourseManager.f51684a.m66455v(bannerData.getSubjectId(), bannerData.getSeenStatus());
                AbstractC29190a.m112005b(subHorizontalViewPagerAdapter.m66941i(bannerData), SubTabFragment.INSTANCE.m68282a(subHorizontalViewPagerAdapter.f52178b), "opt_rank_list");
                return;
            }
            return;
        }
        String strM68282a = SubTabFragment.INSTANCE.m68282a(subHorizontalViewPagerAdapter.f52178b);
        Subject subject = new Subject(bannerData != null ? bannerData.getSubjectId() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -2, 67108863, null);
        Intrinsics.m97799e(context);
        subHorizontalViewPagerAdapter.m66944o(bannerData, i11, AbstractC28126h.m109240g(subject, strM68282a, context, "opt_rank_list"));
    }

    /* JADX INFO: renamed from: o */
    private final void m66944o(BannerData bannerData, int i11, String str) {
        HashMap map = new HashMap();
        map.put("event_type", "click_banner");
        map.put("sequence", String.valueOf(i11));
        map.put("module_name", str);
        map.put("tabId", String.valueOf(this.f52178b));
        if (bannerData != null) {
            AbstractC25888b.m101680c(bannerData, map);
        }
        AbstractC25888b.m101678a(this.f52179c, map);
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52178b), map);
    }

    /* JADX INFO: renamed from: p */
    private final void m66945p(BannerData bannerData, int i11, String str) {
        HashMap map = new HashMap();
        map.put("event_type", "click_banner_poster");
        map.put("sequence", String.valueOf(i11));
        map.put("module_name", str);
        map.put("tabId", String.valueOf(this.f52178b));
        if (bannerData != null) {
            AbstractC25888b.m101680c(bannerData, map);
        }
        AbstractC25888b.m101678a(this.f52179c, map);
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52178b), map);
    }

    /* JADX INFO: renamed from: q */
    private final void m66946q(BannerData bannerData, DownloadView downloadView) {
        Integer seenStatus;
        boolean z11 = false;
        if ((bannerData != null ? Intrinsics.m97797c(bannerData.getHasResource(), Boolean.TRUE) : false) && HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.f52178b), true)) {
            AbstractC26006c.m102058k(downloadView);
        } else {
            if (bannerData != null ? Intrinsics.m97797c(bannerData.getHasResource(), Boolean.TRUE) : false) {
                AbstractC26006c.m102058k(downloadView);
            } else {
                AbstractC26006c.m102054g(downloadView);
            }
        }
        if (HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.f52178b), true)) {
            if (bannerData != null && (seenStatus = bannerData.getSeenStatus()) != null && seenStatus.intValue() == 1) {
                z11 = true;
            }
            if (z11) {
                downloadView.setCourseAdded();
                return;
            } else {
                downloadView.setAddCourse();
                return;
            }
        }
        if (C5123t.f17614a.m23960b()) {
            if (bannerData != null && bannerData.getSubjectType() == SubjectType.SHORT_TV.getValue()) {
                z11 = true;
            }
            if (!z11) {
                downloadView.setShowPlayType();
                return;
            }
        }
        DownloadView.setShowType$default(downloadView, bannerData != null ? bannerData.getSubjectId() : null, null, null, false, R$string.download_now, 14, null);
    }

    /* JADX INFO: renamed from: r */
    private final void m66947r(C14923a c14923a, int i11) {
        if (HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.f52178b), true)) {
            if (i11 == 1) {
                c14923a.m66951f().setCourseAdded();
            } else {
                c14923a.m66951f().setAddCourse();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final C14923a holder, final int i11) {
        String url;
        String thumbnail;
        Image image;
        Image image2;
        String content;
        Intrinsics.m97802h(holder, "holder");
        final Context context = holder.getImageView().getContext();
        final BannerData bannerData = (BannerData) this.f52177a.get(i11 % this.f52177a.size());
        holder.getImageView().getLayoutParams().height = this.f52181e;
        String str = "";
        if (bannerData == null || !bannerData.getBuiltIn()) {
            C23860f.a aVar = C23860f.f72909a;
            Intrinsics.m97799e(context);
            C23860f.b bVarM94457m = aVar.m94457m(context);
            if (bannerData == null || (image2 = bannerData.getImage()) == null || (url = image2.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94474m = bVarM94457m.m94468g(url).m94474m(this.f52180d);
            if (bannerData == null || (image = bannerData.getImage()) == null || (thumbnail = image.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94474m.m94473l(thumbnail).m94465d(holder.getImageView());
        } else {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new C149241(bannerData, holder, null), 3, null);
        }
        TextView textViewM66952g = holder.m66952g();
        if (bannerData != null && (content = bannerData.getContent()) != null) {
            str = content;
        }
        textViewM66952g.setText(str);
        m66946q(bannerData, holder.m66951f());
        holder.getImageView().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.adapter.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubHorizontalViewPagerAdapter.m66942l(bannerData, this, i11, view);
            }
        });
        holder.m66951f().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.adapter.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubHorizontalViewPagerAdapter.m66943m(holder, bannerData, this, context, i11, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C14923a holder, int i11, List payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i11);
            return;
        }
        Object obj = payloads.get(payloads.size() - 1);
        if (obj instanceof Integer) {
            m66947r(holder, ((Number) obj).intValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C14923a onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_sub_horizontal_view_pager, parent, false);
        Intrinsics.m97799e(viewInflate);
        return new C14923a(viewInflate);
    }
}
