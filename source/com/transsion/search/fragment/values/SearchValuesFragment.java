package com.transsion.search.fragment.values;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.gson.JsonObject;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$mipmap;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.R$string;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.widget.DrawableCenterTextView;
import com.transsion.baseui.widget.ResourcesRequestView;
import com.transsion.publish.model.PostEntity;
import com.transsion.pushapi.NoticePermissionFrom;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.fragment.SearchSubjectFragment;
import com.transsion.search.fragment.values.SearchValuesFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dk.C22994g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p349dh.C22982c;
import p355dr.InterfaceC23043g;
import p550kj.C24655b;
import p743rh.C27287m;
import p846vq.C28185c;
import p871wg.AbstractC28362a;
import p880wp.C28415e;
import p881wq.C28426k;
import p978zg.C29182a;
import pg.C26866a;
import tz.AbstractC27875a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u001eJ\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010.R\u0018\u0010?\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001f\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0J8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006R"}, m97100d2 = {"Lcom/transsion/search/fragment/values/SearchValuesFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lwq/k;", "<init>", "()V", "", "keyword", "", "before", "", "w0", "(Ljava/lang/String;Z)V", "Landroid/view/View;", "t0", "()Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "isShowPageStateLayoutTitle", "()Z", "isAudioShowNoNetworkLayout", "isMonitorNetworkState", "Landroid/view/LayoutInflater;", "inflater", "r0", "(Landroid/view/LayoutInflater;)Lwq/k;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", "getEmptyDescText", "isShowTitleLayout", "getEmptyView", "(Z)Landroid/view/View;", "o0", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "", "Lcom/transsion/search/bean/VerticalRank;", "a", "Ljava/util/List;", "mVerticalRanks", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "mKeyWord", "c", "mCopyKeyWord", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "mType", "", "Lcom/transsion/search/bean/SearchValuesRelatedCollectionEntity;", "e", "collectionList", "f", "Ljava/lang/Integer;", "count", "Lcom/transsion/baseui/widget/ResourcesRequestView;", "g", "Lcom/transsion/baseui/widget/ResourcesRequestView;", "requestView", "Ldr/g;", "h", "Lkotlin/Lazy;", "q0", "()Ldr/g;", NotificationCompat.CATEGORY_SERVICE, "Landroidx/lifecycle/b0;", "Lcom/transsion/publish/model/PostEntity;", "i", "Landroidx/lifecycle/b0;", "p0", "()Landroidx/lifecycle/b0;", "postRequestResult", "j", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SearchValuesFragment extends PageStatusFragment<C28426k> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k */
    private static String f59923k = "";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private List mVerticalRanks;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Integer count;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private ResourcesRequestView requestView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String mKeyWord = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String mCopyKeyWord = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mType = 1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List collectionList = new ArrayList();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy service = LazyKt.m97097b(new Function0() { // from class: cr.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchValuesFragment.m77950y0();
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C3187b0 postRequestResult = new C3187b0();

    /* JADX INFO: renamed from: com.transsion.search.fragment.values.SearchValuesFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m77955a() {
            return SearchValuesFragment.f59923k;
        }

        /* JADX INFO: renamed from: b */
        public final void m77956b(String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6) {
            HashMap map = new HashMap();
            if (str2 == null) {
                str2 = "";
            }
            map.put("subject_id", str2);
            if (str == null) {
                str = "";
            }
            map.put("group_id", str);
            map.put("sequence", String.valueOf(i11));
            if (str4 == null) {
                str4 = "";
            }
            map.put("ops", str4);
            if (str3 == null) {
                str3 = "";
            }
            map.put("staff_id", str3);
            map.put(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(i12));
            if (str5 != null && str5.length() > 0) {
                map.put("trid", str5);
            }
            if (str6 != null && str6.length() > 0) {
                map.put("season", str6.toString());
            }
            C14450a.f50860a.m65143f("searchresult", map);
        }

        /* JADX INFO: renamed from: d */
        public final void m77957d(String str, String str2, String str3, String str4, int i11, int i12) {
            HashMap map = new HashMap();
            if (str2 == null) {
                str2 = "";
            }
            map.put("subject_id", str2);
            if (str == null) {
                str = "";
            }
            map.put("group_id", str);
            map.put("sequence", String.valueOf(i11));
            if (str4 == null) {
                str4 = "";
            }
            map.put("ops", str4);
            if (str3 == null) {
                str3 = "";
            }
            map.put("staff_id", str3);
            map.put(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(i12));
            if (m77955a().length() > 0) {
                map.put("trid", m77955a());
            }
            C14450a.f50860a.m65138a("searchresult", map);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.values.SearchValuesFragment$b */
    public static final class C18498b extends AbstractC28362a {
        C18498b() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C26866a.a.m104901l(C26866a.f81698a, "search", "SearchValuesFragment --> postRequestResource --> failed to post request resources " + str2, false, 4, null);
            SearchValuesFragment.this.getPostRequestResult().mo14855n(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(PostEntity postEntity) {
            if (postEntity != null) {
                SearchValuesFragment.this.getPostRequestResult().mo14855n(postEntity);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.values.SearchValuesFragment$c */
    static final class C18499c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59934a;

        C18499c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59934a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59934a;
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
            this.f59934a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final InterfaceC23043g m77943q0() {
        return (InterfaceC23043g) this.service.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final Unit m77944s0(SearchValuesFragment searchValuesFragment, PostEntity postEntity) {
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104899g(aVar, "Post request succeed " + postEntity + ", " + (postEntity != null ? postEntity.getCount() : null), false, 2, null);
        if (postEntity != null && searchValuesFragment.count == null) {
            C26866a.a.m104899g(aVar, "count changed " + postEntity.getCount(), false, 2, null);
            int count = postEntity.getCount();
            if (count == null) {
                count = 0;
            }
            searchValuesFragment.count = count;
            ResourcesRequestView resourcesRequestView = searchValuesFragment.requestView;
            if (resourcesRequestView != null) {
                Integer count2 = postEntity.getCount();
                resourcesRequestView.setCount(count2 != null ? count2.intValue() : 0, false);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: t0 */
    private final View m77945t0() {
        String str;
        DrawableCenterTextView drawableCenterTextView;
        if (!C27287m.f83003a.m106330e()) {
            View viewInflate = getLayoutInflater().inflate(R$layout.view_search_no_network, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R$id.tv_empty_tips);
            ImageView imageView = (ImageView) viewInflate.findViewById(R$id.iv_tips);
            AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(R$id.tv_retry);
            textView.setText(R$string.base_net_err);
            imageView.setImageResource(R$mipmap.ic_no_network);
            appCompatTextView.setVisibility(0);
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: cr.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchValuesFragment.m77947v0(this.f69093a, view);
                }
            });
            Intrinsics.m97799e(viewInflate);
            return viewInflate;
        }
        View viewInflate2 = getLayoutInflater().inflate(R$layout.view_search_empty, (ViewGroup) null);
        final ResourcesRequestView resourcesRequestView = (ResourcesRequestView) viewInflate2.findViewById(R$id.resources_request);
        this.requestView = resourcesRequestView;
        if (this.mKeyWord.length() > 10) {
            String strSubstring = this.mKeyWord.substring(0, 10);
            Intrinsics.m97801g(strSubstring, "substring(...)");
            str = strSubstring + "...";
        } else {
            str = this.mKeyWord;
        }
        String string = getString(com.transsion.search.R$string.search_value_no_result, str);
        Intrinsics.m97801g(string, "getString(...)");
        resourcesRequestView.set(string);
        resourcesRequestView.setGray(true);
        m77948w0(this.mKeyWord, true);
        C22994g mViewBinding = resourcesRequestView.getMViewBinding();
        if (mViewBinding != null && (drawableCenterTextView = mViewBinding.f70213e) != null) {
            drawableCenterTextView.setOnClickListener(new View.OnClickListener() { // from class: cr.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchValuesFragment.m77946u0(this.f69091a, resourcesRequestView, view);
                }
            });
        }
        Intrinsics.m97799e(viewInflate2);
        return viewInflate2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m77946u0(SearchValuesFragment searchValuesFragment, ResourcesRequestView resourcesRequestView, View view) {
        C28415e.f87132a.m109794e(searchValuesFragment, NoticePermissionFrom.DETAIL_NO_RES);
        m77949x0(searchValuesFragment, searchValuesFragment.mKeyWord, false, 2, null);
        Integer num = searchValuesFragment.count;
        if (num != null) {
            Intrinsics.m97799e(num);
            Integer numValueOf = Integer.valueOf(num.intValue() + 1);
            searchValuesFragment.count = numValueOf;
            Intrinsics.m97799e(numValueOf);
            ResourcesRequestView.setCount$default(resourcesRequestView, numValueOf.intValue(), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m77947v0(SearchValuesFragment searchValuesFragment, View view) {
        searchValuesFragment.retryLoadData();
    }

    /* JADX INFO: renamed from: w0 */
    private final void m77948w0(String keyword, boolean before) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(CampaignEx.JSON_KEY_AD_Q, keyword);
        jsonObject.addProperty("before", Boolean.valueOf(before));
        this.count = before ? null : this.count;
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String string = jsonObject.toString();
        Intrinsics.m97801g(string, "toString(...)");
        m77943q0().m91670f(C29182a.f89053a.m111992a(), companion.create(string, MediaType.INSTANCE.parse("application/json"))).m95073E(AbstractC27875a.m108402c()).subscribe(new C18498b());
    }

    /* JADX INFO: renamed from: x0 */
    static /* synthetic */ void m77949x0(SearchValuesFragment searchValuesFragment, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        searchValuesFragment.m77948w0(str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final InterfaceC23043g m77950y0() {
        return (InterfaceC23043g) C22982c.f70163e.m91553a().m91552h(InterfaceC23043g.class);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getEmptyDescText() {
        Context context = getContext();
        return (context != null ? context.getString(com.transsion.search.R$string.user_works_empty) : null) + " \"" + this.mKeyWord + "\"";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getEmptyView(boolean isShowTitleLayout) {
        return m77945t0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        this.postRequestResult.m14851j(this, new C18499c(new Function1() { // from class: cr.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchValuesFragment.m77944s0(this.f69094a, (PostEntity) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isMonitorNetworkState() {
        return true;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("searchresult", false, 2, null);
    }

    /* JADX INFO: renamed from: o0 */
    public final String m77951o0() {
        String string = C28185c.f86800a.m109398b().getString("mCopyKeyWord", "");
        return string == null ? "" : string;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.mCopyKeyWord = savedInstanceState.getString("mCopyKeyWord");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.mKeyWord.length() < 30) {
            outState.putString("mCopyKeyWord", this.mKeyWord);
        }
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final C3187b0 getPostRequestResult() {
        return this.postRequestResult;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C28426k getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28426k c28426kM109836c = C28426k.m109836c(inflater);
        Intrinsics.m97801g(c28426kM109836c, "inflate(...)");
        return c28426kM109836c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        if (this.mVerticalRanks == null) {
            Fragment parentFragment = getParentFragment();
            SearchSubjectFragment searchSubjectFragment = parentFragment instanceof SearchSubjectFragment ? (SearchSubjectFragment) parentFragment : null;
            if (searchSubjectFragment != null) {
                searchSubjectFragment.m77714B0("");
            }
        }
    }
}
