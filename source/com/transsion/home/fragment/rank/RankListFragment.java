package com.transsion.home.fragment.rank;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import ck.C5123t;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.transsion.baseui.R$string;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.R$mipmap;
import com.transsion.home.bean.RankAllData;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.home.viewmodel.RankAllViewModel;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.usercenter.R$color;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.widget.DownloadView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import mg.C25829f;
import ml.AbstractC25887a;
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p550kj.C24662i;
import p552kl.C24700v;
import p743rh.C27287m;
import p765s6.InterfaceC27568f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import p842vl.AbstractC28126h;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0004R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m97100d2 = {"Lcom/transsion/home/fragment/rank/RankListFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lkl/v;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "e0", "(Landroid/view/LayoutInflater;)Lkl/v;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "Lcom/transsion/home/bean/RankAllData;", "data", "k0", "(Lcom/transsion/home/bean/RankAllData;)V", "errorView", "j0", "(Landroid/view/View;)V", "startLoading", "hideLoading", "Lcom/transsion/home/viewmodel/RankAllViewModel;", "a", "Lcom/transsion/home/viewmodel/RankAllViewModel;", "viewModel", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/Subject;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "mMainAdapter", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "headerView", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class RankListFragment extends BaseFragment<C24700v> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private RankAllViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private BaseQuickAdapter mMainAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private TextView headerView;

    /* JADX INFO: renamed from: com.transsion.home.fragment.rank.RankListFragment$a */
    @Metadata(m97099d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m97100d2 = {"Lcom/transsion/home/fragment/rank/RankListFragment$a;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/Subject;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "<init>", "()V", "", "seconds", "", "E1", "(I)Ljava/lang/String;", WebConstants.FIELD_ITEM, "pos", "", "I1", "(Lcom/transsion/moviedetailapi/bean/Subject;I)V", RequestParameters.POSITION, "H1", "G1", "F1", "(I)I", "holder", "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/Subject;)V", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class C15270a extends BaseQuickAdapter implements InterfaceC27944i {

        /* JADX INFO: renamed from: F */
        public static final int f53025F = 8;

        public C15270a() {
            super(R$layout.item_movie_rank_education_subject, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: D1 */
        public static final void m68044D1(C15270a c15270a, Subject subject, int i11, View view) {
            c15270a.m68049I1(subject, i11);
        }

        /* JADX INFO: renamed from: E1 */
        private final String m68045E1(int seconds) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(seconds / 3600), Integer.valueOf((seconds % 3600) / 60), Integer.valueOf(seconds % 60)}, 3));
            Intrinsics.m97801g(str, "format(...)");
            return str;
        }

        /* JADX INFO: renamed from: F1 */
        private final int m68046F1(int pos) {
            if (pos == 0) {
                return R$mipmap.ic_rank_01;
            }
            if (pos != 1) {
                return pos != 2 ? R$mipmap.ic_rank_defalut : R$mipmap.ic_rank_03;
            }
            return R$mipmap.ic_rank_02;
        }

        /* JADX INFO: renamed from: G1 */
        private final void m68047G1(Subject item, int position) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC25888b.m101682e(item, linkedHashMap);
            linkedHashMap.put("event_type", "rank_item_browse");
            linkedHashMap.put(RequestParameters.POSITION, String.valueOf(position));
            C24662i.f75350a.m96872D("rank_all_page", linkedHashMap);
        }

        /* JADX INFO: renamed from: H1 */
        private final void m68048H1(Subject item, int position) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC25888b.m101682e(item, linkedHashMap);
            linkedHashMap.put(RequestParameters.POSITION, String.valueOf(position));
            linkedHashMap.put("event_type", "rank_item_click");
            linkedHashMap.put("click_type", "poster_click");
            C24662i.f75350a.m96881p("rank_all_page", linkedHashMap);
        }

        /* JADX INFO: renamed from: I1 */
        private final void m68049I1(Subject item, int pos) {
            AbstractC28126h.m109239f(item, "rank_all");
            m68048H1(item, pos);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
        public void mo36106F(BaseViewHolder holder, final Subject item) {
            String url;
            String thumbnail;
            String strValueOf;
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(item, "item");
            ImageView imageView = (ImageView) holder.getView(R$id.rank_item_image);
            C23860f.a aVar = C23860f.f72909a;
            Context context = imageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            Cover cover = item.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            Cover cover2 = item.getCover();
            if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94468g.m94473l(thumbnail).m94465d(imageView);
            final int iM23922e = AbstractC5114k.m23922e(getData(), item);
            AppCompatImageView appCompatImageView = (AppCompatImageView) holder.getViewOrNull(R$id.rank_item_rank_tag);
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(m68046F1(iM23922e));
            }
            if (iM23922e > 2) {
                if (iM23922e < 9) {
                    strValueOf = "0" + (iM23922e + 1);
                } else {
                    strValueOf = String.valueOf(iM23922e + 1);
                }
                holder.setText(R$id.rank_item_tag_rank, strValueOf);
            } else {
                holder.setText(R$id.rank_item_tag_rank, "");
            }
            TextView textView = (TextView) holder.getView(R$id.rank_item_rank_duration);
            Integer durationSeconds = item.getDurationSeconds();
            textView.setText(m68045E1(durationSeconds != null ? durationSeconds.intValue() : 0));
            TextView textView2 = (TextView) holder.getView(R$id.rank_item_title);
            textView2.setText(item.getTitle());
            textView2.setGravity(AbstractC25887a.m101677d());
            ((TextView) holder.getView(R$id.rank_item_des)).setText(item.getViewers() + " students");
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.rank.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RankListFragment.C15270a.m68044D1(this.f53051a, item, iM23922e, view);
                }
            });
            m68047G1(item, iM23922e);
        }

        @Override // p801u6.InterfaceC27944i
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
            return AbstractC27943h.m108679a(this, baseQuickAdapter);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.rank.RankListFragment$b */
    @Metadata(m97099d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m97100d2 = {"Lcom/transsion/home/fragment/rank/RankListFragment$b;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/Subject;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "<init>", "()V", WebConstants.FIELD_ITEM, "", "pos", "", "M1", "(Lcom/transsion/moviedetailapi/bean/Subject;I)V", "N1", RequestParameters.POSITION, "", NativeComponentConstants.KEY_COMPONENT_TYPE, "K1", "(Lcom/transsion/moviedetailapi/bean/Subject;ILjava/lang/String;)V", "J1", "I1", "(I)I", "subject", "Lcom/transsnet/downloader/widget/DownloadView;", "downloadView", "L1", "(Lcom/transsion/moviedetailapi/bean/Subject;Lcom/transsnet/downloader/widget/DownloadView;)V", "holder", "E1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/Subject;)V", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class C15271b extends BaseQuickAdapter implements InterfaceC27944i {

        /* JADX INFO: renamed from: F */
        public static final int f53026F = 8;

        public C15271b() {
            super(R$layout.item_movie_rank_subject, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: F1 */
        public static final void m68054F1(TextView textView, TextView textView2, Subject subject) {
            textView.setMaxLines(textView2.getLineCount() > 1 ? 2 : 3);
            textView.setText(subject.getDescription());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: G1 */
        public static final void m68055G1(C15271b c15271b, Subject subject, int i11, View view) {
            c15271b.m68062N1(subject, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H1 */
        public static final void m68056H1(C15271b c15271b, Subject subject, int i11, View view) {
            c15271b.m68061M1(subject, i11);
        }

        /* JADX INFO: renamed from: I1 */
        private final int m68057I1(int pos) {
            if (pos == 0) {
                return R$mipmap.ic_rank_01;
            }
            if (pos != 1) {
                return pos != 2 ? R$mipmap.ic_rank_defalut : R$mipmap.ic_rank_03;
            }
            return R$mipmap.ic_rank_02;
        }

        /* JADX INFO: renamed from: J1 */
        private final void m68058J1(Subject item, int position) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC25888b.m101682e(item, linkedHashMap);
            linkedHashMap.put("event_type", "rank_item_browse");
            linkedHashMap.put(RequestParameters.POSITION, String.valueOf(position));
            C24662i.f75350a.m96872D("rank_all_page", linkedHashMap);
        }

        /* JADX INFO: renamed from: K1 */
        private final void m68059K1(Subject item, int position, String type) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC25888b.m101682e(item, linkedHashMap);
            linkedHashMap.put(RequestParameters.POSITION, String.valueOf(position));
            linkedHashMap.put("event_type", "rank_item_click");
            linkedHashMap.put("click_type", type);
            C24662i.f75350a.m96881p("rank_all_page", linkedHashMap);
        }

        /* JADX INFO: renamed from: L1 */
        private final void m68060L1(Subject subject, DownloadView downloadView) {
            if (!(subject != null ? Intrinsics.m97797c(subject.getHasResource(), Boolean.TRUE) : false)) {
                AbstractC26006c.m102055h(downloadView);
                return;
            }
            AbstractC26006c.m102058k(downloadView);
            if (C5123t.f17614a.m23960b()) {
                Integer subjectType = subject.getSubjectType();
                int value = SubjectType.SHORT_TV.getValue();
                if (subjectType == null || subjectType.intValue() != value) {
                    downloadView.setShowPlayType();
                    return;
                }
            }
            DownloadView.setShowType$default(downloadView, subject.getSubjectId(), null, null, false, R$string.download_movie, 14, null);
        }

        /* JADX INFO: renamed from: M1 */
        private final void m68061M1(Subject item, int pos) {
            m68059K1(item, pos, AbstractC28126h.m109240g(item, "rank_all_page", getContext(), "rank_all"));
        }

        /* JADX INFO: renamed from: N1 */
        private final void m68062N1(Subject item, int pos) {
            AbstractC28126h.m109239f(item, "rank_all");
            m68059K1(item, pos, "poster_click");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
        public void mo36106F(BaseViewHolder holder, final Subject item) {
            String url;
            String thumbnail;
            String strValueOf;
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(item, "item");
            ImageView imageView = (ImageView) holder.getView(R$id.rank_item_image);
            C23860f.a aVar = C23860f.f72909a;
            Context context = imageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            Cover cover = item.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            Cover cover2 = item.getCover();
            if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94468g.m94473l(thumbnail).m94465d(imageView);
            final int iM23922e = AbstractC5114k.m23922e(getData(), item);
            AppCompatImageView appCompatImageView = (AppCompatImageView) holder.getViewOrNull(R$id.rank_item_rank_tag);
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(m68057I1(iM23922e));
            }
            holder.setText(R$id.rank_item_corner, item.getCorner());
            if (iM23922e > 2) {
                if (iM23922e < 9) {
                    strValueOf = "0" + (iM23922e + 1);
                } else {
                    strValueOf = String.valueOf(iM23922e + 1);
                }
                holder.setText(R$id.rank_item_tag_rank, strValueOf);
            } else {
                holder.setText(R$id.rank_item_tag_rank, "");
            }
            final TextView textView = (TextView) holder.getView(R$id.rank_item_title);
            final TextView textView2 = (TextView) holder.getView(R$id.rank_item_des);
            textView.setText(item.getTitle());
            textView.setGravity(AbstractC25887a.m101677d());
            textView.post(new Runnable() { // from class: com.transsion.home.fragment.rank.o
                @Override // java.lang.Runnable
                public final void run() {
                    RankListFragment.C15271b.m68054F1(textView2, textView, item);
                }
            });
            m68060L1(item, (DownloadView) holder.getView(R$id.rank_item_download));
            holder.setText(R$id.rank_item_imdb, item.getImdbRate());
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.rank.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RankListFragment.C15271b.m68055G1(this.f53057a, item, iM23922e, view);
                }
            });
            holder.getView(R$id.rank_item_download).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.rank.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RankListFragment.C15271b.m68056H1(this.f53060a, item, iM23922e, view);
                }
            });
            m68058J1(item, iM23922e);
        }

        @Override // p801u6.InterfaceC27944i
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
            return AbstractC27943h.m108679a(this, baseQuickAdapter);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.rank.RankListFragment$c */
    static final class C15272c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f53027a;

        C15272c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f53027a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f53027a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53027a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m68036f0(final RankListFragment rankListFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            RankAllViewModel rankAllViewModel = rankListFragment.viewModel;
            if (rankAllViewModel != null) {
                rankAllViewModel.m68983l();
                return;
            }
            return;
        }
        C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
        C24700v mViewBinding = rankListFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f75584b) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.rank.m
            @Override // java.lang.Runnable
            public final void run() {
                RankListFragment.m68037g0(this.f53050a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m68037g0(RankListFragment rankListFragment) {
        C27941f c27941fM36186h0;
        BaseQuickAdapter baseQuickAdapter = rankListFragment.mMainAdapter;
        if (baseQuickAdapter == null || (c27941fM36186h0 = baseQuickAdapter.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final Unit m68038h0(final RankListFragment rankListFragment, final RankAllData rankAllData) {
        ConstraintLayout root;
        C27941f c27941fM36186h0;
        if (rankAllData == null) {
            BaseQuickAdapter baseQuickAdapter = rankListFragment.mMainAdapter;
            if (baseQuickAdapter != null && (c27941fM36186h0 = baseQuickAdapter.m36186h0()) != null) {
                c27941fM36186h0.m108669v();
            }
        } else {
            BaseQuickAdapter baseQuickAdapter2 = rankListFragment.mMainAdapter;
            if (baseQuickAdapter2 != null) {
                List<Subject> subjects = rankAllData.getSubjects();
                baseQuickAdapter2.mo36208q(subjects != null ? subjects : new ArrayList<>());
            }
            C24700v mViewBinding = rankListFragment.getMViewBinding();
            if (mViewBinding != null && (root = mViewBinding.getRoot()) != null) {
                root.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.rank.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        RankListFragment.m68039i0(this.f53048a, rankAllData);
                    }
                }, 300L);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m68039i0(RankListFragment rankListFragment, RankAllData rankAllData) {
        BaseQuickAdapter baseQuickAdapter;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        BaseQuickAdapter baseQuickAdapter2;
        C27941f c27941fM36186h2;
        BaseQuickAdapter baseQuickAdapter3 = rankListFragment.mMainAdapter;
        if (baseQuickAdapter3 != null && (c27941fM36186h1 = baseQuickAdapter3.m36186h0()) != null && c27941fM36186h1.m108666r() && (baseQuickAdapter2 = rankListFragment.mMainAdapter) != null && (c27941fM36186h2 = baseQuickAdapter2.m36186h0()) != null) {
            c27941fM36186h2.m108667s();
        }
        Pager pager = rankAllData.getPager();
        if ((pager != null ? Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE) : false) || (baseQuickAdapter = rankListFragment.mMainAdapter) == null || (c27941fM36186h0 = baseQuickAdapter.m36186h0()) == null) {
            return;
        }
        C27941f.m108652u(c27941fM36186h0, false, 1, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C24700v getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.viewModel = (RankAllViewModel) new C3227v0(activity).m14969a(RankAllViewModel.class);
        }
        C24700v c24700vM97013c = C24700v.m97013c(inflater);
        Intrinsics.m97801g(c24700vM97013c, "inflate(...)");
        return c24700vM97013c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void hideLoading() {
        ConstraintLayout constraintLayout;
        C24700v mViewBinding = getMViewBinding();
        if (mViewBinding == null || (constraintLayout = mViewBinding.f75585c) == null) {
            return;
        }
        AbstractC26006c.m102055h(constraintLayout);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Bundle arguments;
        Intrinsics.m97802h(view, "view");
        Fragment parentFragment = getParentFragment();
        this.mMainAdapter = HomeTabId.INSTANCE.m67539h((parentFragment == null || (arguments = parentFragment.getArguments()) == null) ? null : Integer.valueOf(arguments.getInt("tabId")), true) ? new C15270a() : new C15271b();
        C24700v mViewBinding = getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f75584b) == null) {
            return;
        }
        recyclerView.setAdapter(this.mMainAdapter);
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(0.0f, 16.0f, 0.0f, 5, null));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m68041j0(View errorView) {
        Intrinsics.m97802h(errorView, "errorView");
        BaseQuickAdapter baseQuickAdapter = this.mMainAdapter;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.mo36201n1(null);
        }
        BaseQuickAdapter baseQuickAdapter2 = this.mMainAdapter;
        if (baseQuickAdapter2 != null) {
            baseQuickAdapter2.m36171Y0(errorView);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m68042k0(RankAllData data) {
        C27941f c27941fM36186h0;
        RecyclerView recyclerView;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        Pager pager;
        BaseQuickAdapter baseQuickAdapter = this.mMainAdapter;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.mo36201n1(data != null ? data.getSubjects() : null);
        }
        TextView textView = this.headerView;
        if (textView == null) {
            TextView textView2 = new TextView(getContext());
            textView2.setText(data != null ? data.getTitle() : null);
            textView2.setPadding(AbstractC5776a0.m27313a(12.0f), AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(12.0f), 0);
            textView2.setTextSize(2, 16.0f);
            textView2.setTextColor(AbstractC2397b.getColor(textView2.getContext(), R$color.pair_text_191F2B));
            textView2.setMaxLines(2);
            textView2.setGravity(AbstractC25887a.m101677d());
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setTypeface(Typeface.create("ans-serif", 1));
            BaseQuickAdapter baseQuickAdapter2 = this.mMainAdapter;
            if (baseQuickAdapter2 != null) {
                BaseQuickAdapter.m36130y(baseQuickAdapter2, textView2, 0, 0, 6, null);
            }
            this.headerView = textView2;
        } else if (textView != null) {
            textView.setText(data != null ? data.getTitle() : null);
        }
        if ((data == null || (pager = data.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE)) {
            BaseQuickAdapter baseQuickAdapter3 = this.mMainAdapter;
            if (baseQuickAdapter3 != null && (c27941fM36186h2 = baseQuickAdapter3.m36186h0()) != null) {
                c27941fM36186h2.m108673z(true);
            }
            BaseQuickAdapter baseQuickAdapter4 = this.mMainAdapter;
            if (baseQuickAdapter4 != null && (c27941fM36186h1 = baseQuickAdapter4.m36186h0()) != null) {
                c27941fM36186h1.m108672y(true);
            }
        } else {
            BaseQuickAdapter baseQuickAdapter5 = this.mMainAdapter;
            if (baseQuickAdapter5 != null && (c27941fM36186h0 = baseQuickAdapter5.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h0, false, 1, null);
            }
        }
        C24700v mViewBinding = getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f75584b) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        C3187b0 c3187b0M68980i;
        C27941f c27941fM36186h0;
        BaseQuickAdapter baseQuickAdapter = this.mMainAdapter;
        if (baseQuickAdapter != null && (c27941fM36186h0 = baseQuickAdapter.m36186h0()) != null) {
            c27941fM36186h0.m108656D(new InterfaceC27568f() { // from class: com.transsion.home.fragment.rank.j
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    RankListFragment.m68036f0(this.f53046a);
                }
            });
        }
        RankAllViewModel rankAllViewModel = this.viewModel;
        if (rankAllViewModel == null || (c3187b0M68980i = rankAllViewModel.m68980i()) == null) {
            return;
        }
        c3187b0M68980i.m14851j(this, new C15272c(new Function1() { // from class: com.transsion.home.fragment.rank.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankListFragment.m68038h0(this.f53047a, (RankAllData) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void startLoading() {
        ConstraintLayout constraintLayout;
        C24700v mViewBinding = getMViewBinding();
        if (mViewBinding == null || (constraintLayout = mViewBinding.f75585c) == null) {
            return;
        }
        AbstractC26006c.m102058k(constraintLayout);
    }
}
