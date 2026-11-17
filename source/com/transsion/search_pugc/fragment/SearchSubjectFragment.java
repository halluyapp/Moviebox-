package com.transsion.search_pugc.fragment;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0190c;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.AbstractC0256u;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3224u;
import com.blankj.utilcode.util.KeyboardUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$string;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.search.R$id;
import com.transsion.search.SearchManager;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.C18674k;
import com.transsion.search_pugc.bean.SearchSuggestItem;
import com.transsion.search_pugc.fragment.hot.SearchHotFragment;
import com.transsion.search_pugc.fragment.result.SearchResultFragment;
import com.transsion.search_pugc.fragment.result.SearchResultViewModel;
import com.transsion.search_pugc.fragment.suggest.SearchSuggestFragment;
import com.transsion.search_pugc.speech.C18682f;
import com.transsion.search_pugc.speech.SpeechRecognizerView;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gr.C23666b;
import java.util.List;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.InterfaceC24998b;
import kotlinx.coroutines.flow.InterfaceC25073w0;
import ng.AbstractC26006c;
import p550kj.C24655b;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p881wq.C28424i;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0004J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010*\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0005¢\u0006\u0004\b,\u0010\u0004J3\u00100\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u001a2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050.¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b2\u0010+J\u0017\u00103\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b3\u0010\u001dJ\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u0010\u0004R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010?\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00107R\u0016\u0010B\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010:R\u0018\u0010G\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010AR\u0016\u0010W\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010AR\u001b\u0010]\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010Z\u001a\u0004\b`\u0010a¨\u0006d"}, m97100d2 = {"Lcom/transsion/search_pugc/fragment/SearchSubjectFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lwq/i;", "<init>", "()V", "", "E0", "v0", "", "withoutKeyboard", "L0", "(Z)V", "C0", "Landroidx/fragment/app/Fragment;", "fragment", "K0", "(Landroidx/fragment/app/Fragment;)V", "Landroidx/lifecycle/u;", "owner", "Lkotlin/Function0;", "onBackPressed", "Landroidx/activity/u;", "w0", "(Landroidx/lifecycle/u;Lkotlin/jvm/functions/Function0;)Landroidx/activity/u;", "H0", "()Z", "", "keyWord", "T0", "(Ljava/lang/String;)V", "x0", "keyword", "U0", "y0", "Landroid/view/LayoutInflater;", "inflater", "A0", "(Landroid/view/LayoutInflater;)Lwq/i;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "S0", "searchFrom", "Lkotlin/Function1;", "callback", "z0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "initData", "I0", "lazyLoadData", "", "a", "I", "page", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "mKeyword", "c", "hintSearchWord", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "hintSearchIndex", "e", "Z", "backExitSearch", "f", "fromUGCVideoId", "g", "Landroidx/fragment/app/Fragment;", "currentPage", "Lcom/transsion/search_pugc/fragment/hot/SearchHotFragment;", "h", "Lcom/transsion/search_pugc/fragment/hot/SearchHotFragment;", "hotFragment", "Lcom/transsion/search_pugc/fragment/suggest/SearchSuggestFragment;", "i", "Lcom/transsion/search_pugc/fragment/suggest/SearchSuggestFragment;", "suggestFragment", "Lcom/transsion/search_pugc/fragment/result/SearchResultFragment;", "j", "Lcom/transsion/search_pugc/fragment/result/SearchResultFragment;", "searchResultFragment", CampaignEx.JSON_KEY_AD_K, "ignoreEditChanged", "l", "isSuggestClick", "Lcom/transsion/search_pugc/g;", "m", "Lkotlin/Lazy;", "getSearchReporter", "()Lcom/transsion/search_pugc/g;", "searchReporter", "Lcom/transsion/search_pugc/fragment/result/SearchResultViewModel;", "n", "B0", "()Lcom/transsion/search_pugc/fragment/result/SearchResultViewModel;", "viewModel", "o", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SearchSubjectFragment extends BaseFragment<C28424i> {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String hintSearchWord;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int hintSearchIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean backExitSearch;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String fromUGCVideoId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Fragment currentPage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private SearchHotFragment hotFragment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private SearchSuggestFragment suggestFragment;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private SearchResultFragment searchResultFragment;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean ignoreEditChanged;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isSuggestClick;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int page = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String mKeyword = "";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy searchReporter = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSubjectFragment.m78252J0(this.f60124a);
        }
    });

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final Lazy viewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSubjectFragment.m78263V0(this.f60125a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.SearchSubjectFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchSubjectFragment m78293a(String str, String str2, boolean z11, String str3) {
            SearchSubjectFragment searchSubjectFragment = new SearchSubjectFragment();
            Bundle bundle = new Bundle();
            bundle.putString("hot_search_word", str);
            bundle.putString("keyword", str2);
            bundle.putString("form_ugc_video_id", str3);
            bundle.putBoolean("back_exit", z11);
            searchSubjectFragment.setArguments(bundle);
            return searchSubjectFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.SearchSubjectFragment$b */
    public static final class C18575b extends AbstractC0256u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function0 f60113a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SearchSubjectFragment f60114b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C18575b(Function0 function0, SearchSubjectFragment searchSubjectFragment) {
            super(true);
            this.f60113a = function0;
            this.f60114b = searchSubjectFragment;
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            if (((Boolean) this.f60113a.invoke()).booleanValue()) {
                return;
            }
            setEnabled(false);
            this.f60114b.requireActivity().getOnBackPressedDispatcher().m944l();
            setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.SearchSubjectFragment$c */
    public static final class C18576c implements SearchSuggestFragment.InterfaceC18661b {
        C18576c() {
        }

        @Override // com.transsion.search_pugc.fragment.suggest.SearchSuggestFragment.InterfaceC18661b
        /* JADX INFO: renamed from: a */
        public void mo78294a(SearchSuggestItem searchSuggestItem, int i11, String keyWord, String mOps) {
            String word;
            EditText editText;
            Intrinsics.m97802h(keyWord, "keyWord");
            Intrinsics.m97802h(mOps, "mOps");
            C28424i mViewBinding = SearchSubjectFragment.this.getMViewBinding();
            if (mViewBinding != null && (editText = mViewBinding.f87193b) != null) {
                KeyboardUtils.m27131e(editText);
            }
            SearchSubjectFragment.this.mKeyword = keyWord;
            SearchSubjectFragment.this.isSuggestClick = true;
            SearchSubjectFragment searchSubjectFragment = SearchSubjectFragment.this;
            if (searchSuggestItem == null || (word = searchSuggestItem.getWord()) == null) {
                word = "";
            }
            searchSubjectFragment.m78261T0(word);
            SearchSubjectFragment.this.m78290I0("suggest");
            SearchSubjectFragment.this.getSearchReporter().m78496E("suggest", SearchSubjectFragment.this.mKeyword);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.SearchSubjectFragment$d */
    public static final class C18577d implements InterfaceC27288n {
        C18577d() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            if (SearchSubjectFragment.this.currentPage instanceof SearchHotFragment) {
                Fragment fragment = SearchSubjectFragment.this.currentPage;
                Intrinsics.m97800f(fragment, "null cannot be cast to non-null type com.transsion.search_pugc.fragment.hot.SearchHotFragment");
                ((SearchHotFragment) fragment).onConnected();
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.SearchSubjectFragment$e */
    static final class C18578e implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f60117a;

        C18578e(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f60117a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f60117a;
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
            this.f60117a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.SearchSubjectFragment$f */
    public static final class C18579f implements TextWatcher {
        C18579f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            SearchSubjectFragment.this.m78245B0().m78405i().mo14855n(Boolean.FALSE);
            if (SearchSubjectFragment.this.ignoreEditChanged) {
                SearchSubjectFragment.this.ignoreEditChanged = false;
                return;
            }
            SearchSubjectFragment.this.mKeyword = String.valueOf(editable);
            SearchSubjectFragment searchSubjectFragment = SearchSubjectFragment.this;
            searchSubjectFragment.m78262U0(searchSubjectFragment.mKeyword);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            TextView textView;
            C28424i mViewBinding = SearchSubjectFragment.this.getMViewBinding();
            if (mViewBinding == null || (textView = mViewBinding.f87201j) == null) {
                return;
            }
            AbstractC26006c.m102058k(textView);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.SearchSubjectFragment$g */
    public static final class C18580g implements TextView.OnEditorActionListener {
        C18580g() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            if (i11 != 0 && i11 != 3) {
                return false;
            }
            SearchSubjectFragment.this.mKeyword = String.valueOf(textView != null ? textView.getText() : null);
            SearchSubjectFragment.this.m78290I0("input");
            SearchSubjectFragment.this.getSearchReporter().m78496E("input", SearchSubjectFragment.this.mKeyword);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.SearchSubjectFragment$initView$3 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.search_pugc.fragment.SearchSubjectFragment$initView$3", m97637f = "SearchSubjectFragment.kt", m97638l = {Sdk$SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m97639m = "invokeSuspend")
    static final class C185813 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.SearchSubjectFragment$initView$3$a */
        static final class a implements InterfaceC24998b {

            /* JADX INFO: renamed from: a */
            public static final a f60120a = new a();

            a() {
            }

            /* JADX INFO: renamed from: a */
            public final Object m78295a(C18674k.a aVar, Continuation continuation) {
                throw new NoWhenBranchMatchedException();
            }

            @Override // kotlinx.coroutines.flow.InterfaceC24998b
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                AbstractC0190c.m883a(obj);
                return m78295a(null, continuation);
            }
        }

        C185813(Continuation<? super C185813> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C185813(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C185813) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC25073w0 interfaceC25073w0M78529a = C18674k.f60296a.m78529a();
                a aVar = a.f60120a;
                this.label = 1;
                if (interfaceC25073w0M78529a.mo12985a(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public final SearchResultViewModel m78245B0() {
        return (SearchResultViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: C0 */
    private final void m78246C0() {
        EditText editText;
        if (this.backExitSearch) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        Fragment fragment = this.currentPage;
        if (fragment instanceof SearchHotFragment) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        if (this.isSuggestClick && !(fragment instanceof SearchSuggestFragment)) {
            if (fragment instanceof SearchResultFragment) {
                m78253K0(this.suggestFragment);
            }
        } else {
            this.isSuggestClick = false;
            C28424i mViewBinding = getMViewBinding();
            if (mViewBinding == null || (editText = mViewBinding.f87193b) == null) {
                return;
            }
            editText.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Unit m78247D0(SearchSubjectFragment searchSubjectFragment, Boolean bool) {
        if (bool.booleanValue()) {
            searchSubjectFragment.m78253K0(searchSubjectFragment.hotFragment);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: E0 */
    private final void m78248E0() {
        C28424i mViewBinding;
        EditText editText;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("hot_search_word") : null;
        this.hintSearchWord = string;
        if (string == null || string.length() <= 0 || (mViewBinding = getMViewBinding()) == null || (editText = mViewBinding.f87193b) == null) {
            return;
        }
        editText.setHint(this.hintSearchWord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Unit m78249F0(final SearchSubjectFragment searchSubjectFragment, String str) {
        EditText editText;
        if (TextUtils.isEmpty(str)) {
            C28424i mViewBinding = searchSubjectFragment.getMViewBinding();
            if (mViewBinding != null && (editText = mViewBinding.f87193b) != null) {
                editText.postDelayed(new Runnable() { // from class: com.transsion.search_pugc.fragment.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchSubjectFragment.m78250G0(this.f60126a);
                    }
                }, 500L);
            }
            C18682f.f60328a.m78585b(SearchSubjectFragment.class.getSimpleName() + " --> mViewBinding?.sRView?.setCallback{} --> onResult = " + str + " --> 拉起键盘");
        } else {
            searchSubjectFragment.m78261T0(str == null ? "" : str);
            searchSubjectFragment.m78290I0("voice");
            searchSubjectFragment.getSearchReporter().m78496E("voice", searchSubjectFragment.mKeyword);
            C18682f.f60328a.m78585b(SearchSubjectFragment.class.getSimpleName() + " --> mViewBinding?.sRView?.setCallback{} --> onResult = " + str + " --> 隐藏键盘");
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m78250G0(SearchSubjectFragment searchSubjectFragment) {
        EditText editText;
        EditText editText2;
        C28424i mViewBinding = searchSubjectFragment.getMViewBinding();
        if (mViewBinding != null && (editText2 = mViewBinding.f87193b) != null) {
            editText2.requestFocus();
        }
        C28424i mViewBinding2 = searchSubjectFragment.getMViewBinding();
        if (mViewBinding2 == null || (editText = mViewBinding2.f87193b) == null) {
            return;
        }
        KeyboardUtils.m27135i(editText);
    }

    /* JADX INFO: renamed from: H0 */
    private final boolean m78251H0() {
        m78246C0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C18670g m78252J0(SearchSubjectFragment searchSubjectFragment) {
        return C18670g.f60281h.m78520a(searchSubjectFragment.getContext());
    }

    /* JADX INFO: renamed from: K0 */
    private final void m78253K0(Fragment fragment) {
        EditText editText;
        EditText editText2;
        if (fragment == null || Intrinsics.m97797c(this.currentPage, fragment) || !isAdded() || isDetached() || isRemoving()) {
            return;
        }
        this.currentPage = fragment;
        AbstractC3168w abstractC3168wM14557p = getChildFragmentManager().m14557p();
        SearchHotFragment searchHotFragment = this.hotFragment;
        if (searchHotFragment != null && !Intrinsics.m97797c(this.currentPage, searchHotFragment)) {
            abstractC3168wM14557p.mo14676p(searchHotFragment);
        }
        SearchSuggestFragment searchSuggestFragment = this.suggestFragment;
        if (searchSuggestFragment != null && !Intrinsics.m97797c(this.currentPage, searchSuggestFragment)) {
            abstractC3168wM14557p.mo14676p(searchSuggestFragment);
        }
        SearchResultFragment searchResultFragment = this.searchResultFragment;
        if (searchResultFragment != null && !Intrinsics.m97797c(this.currentPage, searchResultFragment)) {
            abstractC3168wM14557p.mo14676p(searchResultFragment);
        }
        abstractC3168wM14557p.mo14681y(fragment);
        abstractC3168wM14557p.mo14671j();
        if (Intrinsics.m97797c(fragment, this.searchResultFragment)) {
            C28424i mViewBinding = getMViewBinding();
            if (mViewBinding == null || (editText2 = mViewBinding.f87193b) == null) {
                return;
            }
            editText2.clearFocus();
            KeyboardUtils.m27131e(editText2);
            return;
        }
        C28424i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (editText = mViewBinding2.f87193b) == null) {
            return;
        }
        Boolean bool = (Boolean) m78245B0().m78405i().m14847f();
        if (bool == null || !bool.booleanValue()) {
            editText.requestFocus();
            KeyboardUtils.m27135i(editText);
        }
    }

    /* JADX INFO: renamed from: L0 */
    private final void m78254L0(boolean withoutKeyboard) {
        C28424i mViewBinding;
        EditText editText;
        AppCompatImageView appCompatImageView;
        ImageView imageView;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        TextView textView;
        EditText editText5;
        C28424i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (editText5 = mViewBinding2.f87193b) != null) {
            editText5.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search_pugc.fragment.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchSubjectFragment.m78255M0(this.f60127a, view);
                }
            });
        }
        C28424i mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (textView = mViewBinding3.f87201j) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search_pugc.fragment.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchSubjectFragment.m78256N0(this.f60130a, view);
                }
            });
        }
        C28424i mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (editText4 = mViewBinding4.f87193b) != null) {
            editText4.addTextChangedListener(new C18579f());
        }
        C28424i mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (editText3 = mViewBinding5.f87193b) != null) {
            editText3.setOnEditorActionListener(new C18580g());
        }
        C28424i mViewBinding6 = getMViewBinding();
        if (mViewBinding6 != null && (editText2 = mViewBinding6.f87193b) != null) {
            editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.transsion.search_pugc.fragment.i
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    SearchSubjectFragment.m78257O0(this.f60163a, view, z11);
                }
            });
        }
        C28424i mViewBinding7 = getMViewBinding();
        if (mViewBinding7 != null && (imageView = mViewBinding7.f87198g) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search_pugc.fragment.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchSubjectFragment.m78258P0(this.f60164a, view);
                }
            });
        }
        C28424i mViewBinding8 = getMViewBinding();
        if (mViewBinding8 != null && (appCompatImageView = mViewBinding8.f87195d) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search_pugc.fragment.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchSubjectFragment.m78259Q0(this.f60165a, view);
                }
            });
        }
        if (!withoutKeyboard && (mViewBinding = getMViewBinding()) != null && (editText = mViewBinding.f87193b) != null) {
            editText.requestFocus();
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        m78286w0(this, new Function0() { // from class: com.transsion.search_pugc.fragment.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SearchSubjectFragment.m78260R0(this.f60122a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m78255M0(SearchSubjectFragment searchSubjectFragment, View view) {
        TextView textView;
        C28424i mViewBinding = searchSubjectFragment.getMViewBinding();
        if (mViewBinding == null || (textView = mViewBinding.f87201j) == null) {
            return;
        }
        AbstractC26006c.m102058k(textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m78256N0(SearchSubjectFragment searchSubjectFragment, View view) {
        searchSubjectFragment.m78290I0("input");
        searchSubjectFragment.getSearchReporter().m78496E("input", searchSubjectFragment.mKeyword);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m78257O0(SearchSubjectFragment searchSubjectFragment, View view, boolean z11) {
        EditText editText;
        ViewGroup.LayoutParams layoutParams;
        ImageView imageView;
        TextView textView;
        String string;
        EditText editText2;
        EditText editText3;
        ViewGroup.LayoutParams layoutParams2;
        ImageView imageView2;
        TextView textView2;
        if (!z11) {
            C28424i mViewBinding = searchSubjectFragment.getMViewBinding();
            if (mViewBinding != null && (textView = mViewBinding.f87201j) != null) {
                AbstractC26006c.m102054g(textView);
            }
            C28424i mViewBinding2 = searchSubjectFragment.getMViewBinding();
            if (mViewBinding2 != null && (imageView = mViewBinding2.f87198g) != null) {
                AbstractC26006c.m102058k(imageView);
            }
            C28424i mViewBinding3 = searchSubjectFragment.getMViewBinding();
            if (mViewBinding3 == null || (editText = mViewBinding3.f87193b) == null || (layoutParams = editText.getLayoutParams()) == null || !(layoutParams instanceof RelativeLayout.LayoutParams)) {
                return;
            }
            ((RelativeLayout.LayoutParams) layoutParams).addRule(16, R$id.search_edit_clear);
            return;
        }
        C28424i mViewBinding4 = searchSubjectFragment.getMViewBinding();
        if (mViewBinding4 != null && (textView2 = mViewBinding4.f87201j) != null) {
            AbstractC26006c.m102058k(textView2);
        }
        C28424i mViewBinding5 = searchSubjectFragment.getMViewBinding();
        if (mViewBinding5 != null && (imageView2 = mViewBinding5.f87198g) != null) {
            AbstractC26006c.m102054g(imageView2);
        }
        C28424i mViewBinding6 = searchSubjectFragment.getMViewBinding();
        if (mViewBinding6 != null && (editText3 = mViewBinding6.f87193b) != null && (layoutParams2 = editText3.getLayoutParams()) != null && (layoutParams2 instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) layoutParams2).addRule(16, R$id.tv_search);
        }
        if (searchSubjectFragment.currentPage instanceof SearchResultFragment) {
            C28424i mViewBinding7 = searchSubjectFragment.getMViewBinding();
            Editable text = (mViewBinding7 == null || (editText2 = mViewBinding7.f87193b) == null) ? null : editText2.getText();
            if ((text != null ? text.length() : 0) <= 0) {
                searchSubjectFragment.m78253K0(searchSubjectFragment.hotFragment);
                return;
            }
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            searchSubjectFragment.m78262U0(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m78258P0(SearchSubjectFragment searchSubjectFragment, View view) {
        ImageView imageView;
        EditText editText;
        C28424i mViewBinding = searchSubjectFragment.getMViewBinding();
        if (mViewBinding != null && (editText = mViewBinding.f87193b) != null) {
            editText.setText("");
        }
        C28424i mViewBinding2 = searchSubjectFragment.getMViewBinding();
        if (mViewBinding2 == null || (imageView = mViewBinding2.f87198g) == null) {
            return;
        }
        AbstractC26006c.m102054g(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final void m78259Q0(SearchSubjectFragment searchSubjectFragment, View view) {
        searchSubjectFragment.m78246C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final boolean m78260R0(SearchSubjectFragment searchSubjectFragment) {
        return searchSubjectFragment.m78251H0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public final void m78261T0(String keyWord) {
        Unit unit;
        EditText editText;
        EditText editText2;
        C28424i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (editText2 = mViewBinding.f87193b) != null) {
            editText2.setText(keyWord);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C28424i mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (editText = mViewBinding2.f87193b) == null) {
                unit = null;
            } else {
                editText.setSelection(keyWord.length());
                unit = Unit.f75682a;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public final void m78262U0(String keyword) {
        SearchSuggestFragment searchSuggestFragment;
        if (keyword.length() == 0) {
            m78253K0(this.hotFragment);
        } else if (C27287m.f83003a.m106330e()) {
            if (!TextUtils.isEmpty(keyword) && (searchSuggestFragment = this.suggestFragment) != null) {
                searchSuggestFragment.m78478o0(keyword);
            }
            m78253K0(this.suggestFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final SearchResultViewModel m78263V0(SearchSubjectFragment searchSubjectFragment) {
        FragmentActivity fragmentActivityRequireActivity = searchSubjectFragment.requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        return (SearchResultViewModel) new C3227v0(fragmentActivityRequireActivity).m14969a(SearchResultViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C18670g getSearchReporter() {
        return (C18670g) this.searchReporter.getValue();
    }

    /* JADX INFO: renamed from: v0 */
    private final void m78285v0() {
        if (this.hotFragment == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
            SearchHotFragment searchHotFragmentM78317a = SearchHotFragment.INSTANCE.m78317a(this.hintSearchWord);
            abstractC3168wM14557p.m14805b(R$id.search_fragment_container, searchHotFragmentM78317a);
            this.hotFragment = searchHotFragmentM78317a;
            abstractC3168wM14557p.mo14671j();
        }
    }

    /* JADX INFO: renamed from: w0 */
    private final AbstractC0256u m78286w0(InterfaceC3224u owner, Function0 onBackPressed) {
        C18575b c18575b = new C18575b(onBackPressed, this);
        requireActivity().getOnBackPressedDispatcher().m942i(owner, c18575b);
        return c18575b;
    }

    /* JADX INFO: renamed from: x0 */
    private final void m78287x0() {
        if (this.suggestFragment == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
            SearchSuggestFragment searchSuggestFragmentM78480a = SearchSuggestFragment.INSTANCE.m78480a();
            abstractC3168wM14557p.m14805b(R$id.search_fragment_container, searchSuggestFragmentM78480a);
            this.suggestFragment = searchSuggestFragmentM78480a;
            abstractC3168wM14557p.mo14671j();
            SearchSuggestFragment searchSuggestFragment = this.suggestFragment;
            if (searchSuggestFragment != null) {
                searchSuggestFragment.m78479q0(new C18576c());
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    private final void m78288y0() {
        if (this.searchResultFragment == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
            SearchResultFragment searchResultFragment = new SearchResultFragment();
            abstractC3168wM14557p.m14805b(R$id.search_fragment_container, searchResultFragment);
            this.searchResultFragment = searchResultFragment;
            abstractC3168wM14557p.mo14673l();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public C28424i getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28424i c28424iM109828c = C28424i.m109828c(inflater);
        Intrinsics.m97801g(c28424iM109828c, "inflate(...)");
        return c28424iM109828c;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m78290I0(String searchFrom) {
        C28424i mViewBinding;
        EditText editText;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_toast);
        }
        if (this.mKeyword.length() == 0 && (mViewBinding = getMViewBinding()) != null && (editText = mViewBinding.f87193b) != null && Intrinsics.m97797c(editText.getHint(), this.hintSearchWord)) {
            this.mKeyword = String.valueOf(this.hintSearchWord);
            this.ignoreEditChanged = true;
            editText.setText(String.valueOf(this.hintSearchWord));
            editText.setSelection(editText.getText().length());
            getSearchReporter().m78496E("hint", this.mKeyword);
            searchFrom = "hint";
        }
        if (this.mKeyword.length() == 0) {
            C13806h c13806h = C13806h.f49015a;
            c13806h.m62318e(16);
            c13806h.m62325l(getString(com.transsion.search.R$string.tips_movie));
            return;
        }
        SearchHotFragment searchHotFragment = this.hotFragment;
        if (searchHotFragment != null) {
            searchHotFragment.addHistoryWord(this.mKeyword);
        }
        SearchResultFragment searchResultFragment = this.searchResultFragment;
        if (searchResultFragment != null) {
            searchResultFragment.m78366u0(this.mKeyword, searchFrom, this.fromUGCVideoId);
        }
        m78253K0(this.searchResultFragment);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m78291S0() {
        String str;
        EditText editText;
        C23666b.a aVar = C23666b.f72361a;
        List listM93608a = aVar.m93608a();
        if (listM93608a == null || listM93608a.isEmpty()) {
            return;
        }
        List listM93608a2 = aVar.m93608a();
        int size = listM93608a2 != null ? listM93608a2.size() : 0;
        List listM93608a3 = aVar.m93608a();
        if (listM93608a3 != null) {
            int i11 = this.hintSearchIndex;
            this.hintSearchIndex = i11 + 1;
            str = (String) CollectionsKt.m97362l0(listM93608a3, i11 % size);
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            this.hintSearchWord = str;
        }
        C28424i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (editText = mViewBinding.f87193b) == null) {
            return;
        }
        editText.setHint(this.hintSearchWord);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        String string;
        ImageView imageView;
        EditText editText;
        Intrinsics.m97802h(view, "view");
        super.initData(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("keyword")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        this.fromUGCVideoId = arguments2 != null ? arguments2.getString("form_ugc_video_id") : null;
        Bundle arguments3 = getArguments();
        this.backExitSearch = arguments3 != null ? arguments3.getBoolean("back_exit") : false;
        m78254L0(string.length() > 0);
        if (string.length() > 0) {
            this.mKeyword = string;
            C28424i mViewBinding = getMViewBinding();
            if (mViewBinding != null && (editText = mViewBinding.f87193b) != null) {
                editText.setText(this.mKeyword);
            }
            C28424i mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (imageView = mViewBinding2.f87198g) != null) {
                AbstractC26006c.m102058k(imageView);
            }
            m78290I0("deeplink");
            getSearchReporter().m78496E("deeplink", this.mKeyword);
        }
        m78245B0().m78405i().m14851j(getViewLifecycleOwner(), new C18578e(new Function1() { // from class: com.transsion.search_pugc.fragment.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSubjectFragment.m78247D0(this.f60121a, (Boolean) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        SpeechRecognizerView speechRecognizerView;
        Intrinsics.m97802h(view, "view");
        m78248E0();
        setNetListener(new C18577d());
        C28424i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (speechRecognizerView = mViewBinding.f87197f) != null) {
            speechRecognizerView.setCallback(new Function1() { // from class: com.transsion.search_pugc.fragment.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchSubjectFragment.m78249F0(this.f60123a, (String) obj);
                }
            });
        }
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new C185813(null), 3, null);
        m78285v0();
        m78287x0();
        m78288y0();
        m78253K0(this.hotFragment);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    /* JADX INFO: renamed from: z0 */
    public final void m78292z0(String keyWord, String searchFrom, Function1 callback) {
        EditText editText;
        Intrinsics.m97802h(keyWord, "keyWord");
        Intrinsics.m97802h(callback, "callback");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            KeyboardUtils.m27130d(activity);
        }
        this.mKeyword = keyWord;
        this.ignoreEditChanged = true;
        C28424i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (editText = mViewBinding.f87193b) != null) {
            editText.setText(this.mKeyword);
            try {
                Result.Companion companion = Result.INSTANCE;
                Editable text = editText.getText();
                editText.setSelection(text != null ? RangesKt.m97938h(text.length(), this.mKeyword.length()) : 0);
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
        this.page = 1;
        m78290I0(searchFrom);
        SearchManager.f59668f.m77605a().m77601g(this.mKeyword);
        callback.invoke(keyWord);
    }
}
