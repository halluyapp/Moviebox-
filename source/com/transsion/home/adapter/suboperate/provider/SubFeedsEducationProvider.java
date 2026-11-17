package com.transsion.home.adapter.suboperate.provider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$color;
import com.transsion.baselib.helper.C14450a;
import com.transsion.edcation.CourseManager;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.ExplainBean;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.widget.DownloadView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25204t1;
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p000.AbstractC0000a;
import p462hj.C23860f;
import p832v6.AbstractC28078a;
import p842vl.AbstractC28126h;
import p982zk.AbstractC29190a;

/* JADX INFO: loaded from: classes5.dex */
public final class SubFeedsEducationProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52260e;

    /* JADX INFO: renamed from: f */
    private final int f52261f = AbstractC5806y.m27489e();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m97099d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m97100d2 = {"Lcom/transsion/home/adapter/suboperate/provider/SubFeedsEducationProvider$MyViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "tabId", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(ILandroid/view/View;)V", "", CampaignEx.JSON_KEY_AD_K, "()V", "h", "j", "Lcom/transsion/home/bean/OperateItem;", WebConstants.FIELD_ITEM, "i", "(Lcom/transsion/home/bean/OperateItem;)V", "a", "I", "Lkotlinx/coroutines/t1;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlinx/coroutines/t1;", "mObserveJob", "c", "Lcom/transsion/home/bean/OperateItem;", "mCurrentItem", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    static final class MyViewHolder extends BaseViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int tabId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private InterfaceC25204t1 mObserveJob;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private OperateItem mCurrentItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyViewHolder(int i11, View view) {
            super(view);
            Intrinsics.m97802h(view, "view");
            this.tabId = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public final void m67013k() {
            Subject feedsSubject;
            Integer seenStatus;
            OperateItem operateItem = this.mCurrentItem;
            if (operateItem == null || (feedsSubject = operateItem.getFeedsSubject()) == null || (seenStatus = feedsSubject.getSeenStatus()) == null || seenStatus.intValue() != 1) {
                DownloadView downloadView = (DownloadView) getViewOrNull(R$id.ll_download);
                if (downloadView != null) {
                    downloadView.setAddCourse();
                    return;
                }
                return;
            }
            DownloadView downloadView2 = (DownloadView) getViewOrNull(R$id.ll_download);
            if (downloadView2 != null) {
                downloadView2.setCourseAdded();
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m67014h() {
            if (HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.tabId), true)) {
                this.mObserveJob = AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SubFeedsEducationProvider$MyViewHolder$registerCourse$1(this, null), 3, null);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m67015i(OperateItem item) {
            Intrinsics.m97802h(item, "item");
            this.mCurrentItem = item;
        }

        /* JADX INFO: renamed from: j */
        public final void m67016j() {
            InterfaceC25204t1 interfaceC25204t1 = this.mObserveJob;
            if (interfaceC25204t1 != null) {
                InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
            }
            this.mObserveJob = null;
        }
    }

    public SubFeedsEducationProvider(int i11) {
        this.f52260e = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Unit m67003C(Subject subject, boolean z11, boolean z12, long j11) {
        subject.setLoadCoverSuccess(z11);
        subject.setCoverCache(z12);
        subject.setLoadCoverDuration(j11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m67004D(OperateItem operateItem, SubFeedsEducationProvider subFeedsEducationProvider, View view) {
        List<Object> data;
        Subject feedsSubject = operateItem.getFeedsSubject();
        if (feedsSubject != null) {
            AbstractC28126h.m109239f(feedsSubject, "opt_sub_feeds");
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = subFeedsEducationProvider.m36335g();
            subFeedsEducationProvider.m67007G((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? -1 : data.indexOf(operateItem), feedsSubject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m67005E(OperateItem operateItem, Subject subject, SubFeedsEducationProvider subFeedsEducationProvider, View view) {
        CourseManager.m66444u(CourseManager.f51684a, operateItem.getFeedsSubject(), null, 2, null);
        AbstractC29190a.m112005b(subject, SubTabFragment.INSTANCE.m68282a(subFeedsEducationProvider.f52260e), "opt_feeds");
    }

    /* JADX INFO: renamed from: F */
    private final String m67006F(int i11) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11 / 3600), Integer.valueOf((i11 % 3600) / 60), Integer.valueOf(i11 % 60)}, 3));
        Intrinsics.m97801g(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: G */
    private final void m67007G(int i11, Subject subject, boolean z11) {
        HashMap map = new HashMap();
        map.put("event_type", z11 ? "browse_feeds_item" : "click_feeds_item");
        map.put("sequence", String.valueOf(i11));
        map.put("item_type", "rec");
        String ops = subject.getOps();
        if (ops == null) {
            ops = "";
        }
        map.put("ops", ops);
        String subjectId = subject.getSubjectId();
        map.put("subject_id", subjectId != null ? subjectId : "");
        map.put("builtin", subject.getBuiltIn() ? "1" : "0");
        map.put("tabId", String.valueOf(this.f52260e));
        StringBuilder sb2 = new StringBuilder();
        List<ExplainBean> explains = subject.getExplains();
        if (explains != null) {
            Iterator<T> it = explains.iterator();
            while (it.hasNext()) {
                sb2.append(((ExplainBean) it.next()).getType());
                sb2.append(",");
            }
        }
        String string = sb2.toString();
        Intrinsics.m97801g(string, "toString(...)");
        map.put("rec_explain_type", StringsKt.m98163r1(string, ','));
        AbstractC25888b.m101682e(subject, map);
        if (z11) {
            C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.f52260e), map);
        } else {
            C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52260e), map);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        String subjectId;
        List<Object> data;
        Integer seenStatus;
        String url;
        String thumbnail;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        if (helper instanceof MyViewHolder) {
            ((MyViewHolder) helper).m67015i(item);
        }
        final Subject feedsSubject = item.getFeedsSubject();
        if (feedsSubject == null || (subjectId = feedsSubject.getSubjectId()) == null || subjectId.length() == 0) {
            return;
        }
        ShapeableImageView shapeableImageView = (ShapeableImageView) helper.getViewOrNull(R$id.iv_cover);
        if (shapeableImageView != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = shapeableImageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            Cover cover = feedsSubject.getCover();
            String str = "";
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            Cover cover2 = feedsSubject.getCover();
            if (cover2 != null && (thumbnail = cover2.getThumbnail()) != null) {
                str = thumbnail;
            }
            bVarM94468g.m94473l(str).m94470i(R$color.skeleton).m94474m(this.f52261f).m94463b(new Function3() { // from class: com.transsion.home.adapter.suboperate.provider.l
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SubFeedsEducationProvider.m67003C(feedsSubject, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
                }
            }).m94465d(shapeableImageView);
        }
        helper.setText(R$id.tv_subject, feedsSubject.getTitle());
        helper.setText(R$id.tv_subject_year, AbstractC0000a.m1b(m36338k(), feedsSubject));
        TextView textView = (TextView) helper.getView(R$id.tv_duration);
        AbstractC26006c.m102058k(textView);
        Integer durationSeconds = feedsSubject.getDurationSeconds();
        textView.setText(m67006F(durationSeconds != null ? durationSeconds.intValue() : 0));
        helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubFeedsEducationProvider.m67004D(item, this, view);
            }
        });
        DownloadView downloadView = (DownloadView) helper.getViewOrNull(R$id.ll_download);
        if (downloadView != null) {
            if (Intrinsics.m97797c(feedsSubject.getHasResource(), Boolean.TRUE)) {
                AbstractC26006c.m102058k(downloadView);
            } else {
                AbstractC26006c.m102054g(downloadView);
            }
            downloadView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubFeedsEducationProvider.m67005E(item, feedsSubject, this, view);
                }
            });
        }
        Subject feedsSubject2 = item.getFeedsSubject();
        if (feedsSubject2 == null || (seenStatus = feedsSubject2.getSeenStatus()) == null || seenStatus.intValue() != 1) {
            DownloadView downloadView2 = (DownloadView) helper.getViewOrNull(R$id.ll_download);
            if (downloadView2 != null) {
                downloadView2.setAddCourse();
            }
        } else {
            DownloadView downloadView3 = (DownloadView) helper.getViewOrNull(R$id.ll_download);
            if (downloadView3 != null) {
                downloadView3.setCourseAdded();
            }
        }
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        m67007G((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? -1 : data.indexOf(item), feedsSubject, true);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.EDUCATION_SUBJECT.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.post_list_item_subject_education;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: r */
    public BaseViewHolder mo36342r(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        return new MyViewHolder(this.f52260e, AbstractC28078a.m109103a(parent, mo22759m()));
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: t */
    public void mo36344t(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36344t(holder);
        if (holder instanceof MyViewHolder) {
            ((MyViewHolder) holder).m67014h();
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: u */
    public void mo36345u(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.mo36345u(holder);
        if (holder instanceof MyViewHolder) {
            ((MyViewHolder) holder).m67016j();
        }
    }
}
