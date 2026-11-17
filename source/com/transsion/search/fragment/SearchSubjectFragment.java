package com.transsion.search.fragment;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
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
import androidx.p1004lifecycle.InterfaceC3224u;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.KeyboardUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$string;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14451b;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.search.R$id;
import com.transsion.search.SearchManager;
import com.transsion.search.activity.SearchManagerActivity;
import com.transsion.search.bean.SuggestEntity;
import com.transsion.search.bean.VerticalRank;
import com.transsion.search.fragment.SearchSubjectFragment;
import com.transsion.search.fragment.hot.SearchHotFragment;
import com.transsion.search.fragment.result.SearchResultFragment;
import com.transsion.search.fragment.suggest.SearchSuggestFragment;
import com.transsion.search.speech.C18517f;
import com.transsion.search_pugc.speech.SpeechRecognizerView;
import com.transsnet.downloader.DownloadManagerApi;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import ng.AbstractC26006c;
import p550kj.C24655b;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p846vq.C28185c;
import p881wq.C28424i;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0004J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010*\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0005¢\u0006\u0004\b,\u0010\u0004J3\u00100\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u001a2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050.¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b2\u0010+J\u0017\u00103\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b3\u0010\u001dJ\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\u0005H\u0016¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\u0005H\u0016¢\u0006\u0004\b6\u0010\u0004R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010A\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00109R\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010CR\u0016\u0010W\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010C¨\u0006Y"}, m97100d2 = {"Lcom/transsion/search/fragment/SearchSubjectFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lwq/i;", "<init>", "()V", "", "x0", "q0", "", "withoutKeyboard", "D0", "(Z)V", "w0", "Landroidx/fragment/app/Fragment;", "fragment", "C0", "(Landroidx/fragment/app/Fragment;)V", "Landroidx/lifecycle/u;", "owner", "Lkotlin/Function0;", "onBackPressed", "Landroidx/activity/u;", "r0", "(Landroidx/lifecycle/u;Lkotlin/jvm/functions/Function0;)Landroidx/activity/u;", "A0", "()Z", "", "keyWord", "L0", "(Ljava/lang/String;)V", "s0", "keyword", "M0", "t0", "Landroid/view/LayoutInflater;", "inflater", "v0", "(Landroid/view/LayoutInflater;)Lwq/i;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "K0", "searchFrom", "Lkotlin/Function1;", "callback", "u0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "initData", "B0", "lazyLoadData", "onDestroyView", "onDestroy", "", "a", "I", "page", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "mKeyword", "c", "hintSearchWord", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "hintSearchIndex", "e", "Z", "backExitSearch", "f", "Landroidx/fragment/app/Fragment;", "currentPage", "Lcom/transsion/search/fragment/hot/SearchHotFragment;", "g", "Lcom/transsion/search/fragment/hot/SearchHotFragment;", "hotFragment", "Lcom/transsion/search/fragment/suggest/SearchSuggestFragment;", "h", "Lcom/transsion/search/fragment/suggest/SearchSuggestFragment;", "suggestFragment", "Lcom/transsion/search/fragment/result/SearchResultFragment;", "i", "Lcom/transsion/search/fragment/result/SearchResultFragment;", "searchResultFragment", "j", "ignoreEditChanged", CampaignEx.JSON_KEY_AD_K, "isSuggestClick", "l", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SearchSubjectFragment extends BaseFragment<C28424i> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int page = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String mKeyword = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String hintSearchWord;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int hintSearchIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean backExitSearch;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Fragment currentPage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private SearchHotFragment hotFragment;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private SearchSuggestFragment suggestFragment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private SearchResultFragment searchResultFragment;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean ignoreEditChanged;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isSuggestClick;

    /* JADX INFO: renamed from: com.transsion.search.fragment.SearchSubjectFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchSubjectFragment m77718a(String str, String str2, boolean z11) {
            SearchSubjectFragment searchSubjectFragment = new SearchSubjectFragment();
            Bundle bundle = new Bundle();
            bundle.putString("hot_search_word", str);
            bundle.putString("keyword", str2);
            bundle.putBoolean("back_exit", z11);
            searchSubjectFragment.setArguments(bundle);
            return searchSubjectFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.SearchSubjectFragment$b */
    public static final class C18384b extends AbstractC0256u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function0 f59734a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SearchSubjectFragment f59735b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C18384b(Function0 function0, SearchSubjectFragment searchSubjectFragment) {
            super(true);
            this.f59734a = function0;
            this.f59735b = searchSubjectFragment;
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            if (((Boolean) this.f59734a.invoke()).booleanValue()) {
                return;
            }
            setEnabled(false);
            this.f59735b.requireActivity().getOnBackPressedDispatcher().m944l();
            setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.SearchSubjectFragment$c */
    public static final class C18385c implements SearchSuggestFragment.InterfaceC18489b {
        C18385c() {
        }

        @Override // com.transsion.search.fragment.suggest.SearchSuggestFragment.InterfaceC18489b
        /* JADX INFO: renamed from: a */
        public void mo77719a(SuggestEntity suggestEntity, int i11, String keyWord, String mOps) {
            Staff staff;
            String subjectId;
            Integer subjectType;
            String deeplink;
            EditText editText;
            Intrinsics.m97802h(keyWord, "keyWord");
            Intrinsics.m97802h(mOps, "mOps");
            C28424i mViewBinding = SearchSubjectFragment.this.getMViewBinding();
            if (mViewBinding != null && (editText = mViewBinding.f87193b) != null) {
                KeyboardUtils.m27131e(editText);
            }
            Integer type = suggestEntity != null ? suggestEntity.getType() : null;
            if (type != null && type.intValue() == 2) {
                VerticalRank verticalRank = suggestEntity.getVerticalRank();
                if (verticalRank == null || (deeplink = verticalRank.getDeeplink()) == null) {
                    return;
                }
                Uri uriM65157g = C14451b.f50862a.m65157g(Uri.parse(deeplink + "&ops=" + mOps));
                if (uriM65157g != null) {
                    AbstractC5114k.m23932o(uriM65157g);
                    return;
                }
                return;
            }
            String str = "";
            if (type == null || type.intValue() != 1) {
                if (type == null || type.intValue() != 0) {
                    if (type == null || type.intValue() != 3 || (staff = suggestEntity.getStaff()) == null) {
                        return;
                    }
                    Navigator.m61845x(TheRouter.m61773c("/movie/staff").m61856J("staff", staff), SearchSubjectFragment.this.requireContext(), null, 2, null);
                    return;
                }
                SearchSubjectFragment.this.mKeyword = keyWord;
                SearchSubjectFragment.this.isSuggestClick = true;
                SearchSubjectFragment searchSubjectFragment = SearchSubjectFragment.this;
                String word = suggestEntity.getWord();
                searchSubjectFragment.m77688L0(word != null ? word : "");
                SearchSubjectFragment.this.m77714B0("suggest");
                return;
            }
            try {
                Subject subject = suggestEntity.getSubject();
                if (subject != null) {
                    Integer subjectType2 = subject.getSubjectType();
                    int value = SubjectType.SHORT_TV.getValue();
                    if (subjectType2 != null && subjectType2.intValue() == value) {
                        DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                        Context context = SearchSubjectFragment.this.getContext();
                        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        FragmentActivity fragmentActivity = (FragmentActivity) context;
                        Subject subject2 = suggestEntity.getSubject();
                        downloadManagerApiM87093a.m87086d0(fragmentActivity, "searchpage", (384 & 4) != 0 ? "" : "", subject2 != null ? subject2.getOps() : null, (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : false, (384 & 64) != 0 ? null : suggestEntity.getSubject(), (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                        return;
                    }
                }
                Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
                Subject subject3 = suggestEntity.getSubject();
                Navigator navigatorM61852F = navigatorM61773c.m61852F("subject_type", (subject3 == null || (subjectType = subject3.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue());
                Subject subject4 = suggestEntity.getSubject();
                if (subject4 != null && (subjectId = subject4.getSubjectId()) != null) {
                    str = subjectId;
                }
                Navigator.m61845x(navigatorM61852F.m61857K("id", str).m61857K("ops", mOps), SearchSubjectFragment.this.requireContext(), null, 2, null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.SearchSubjectFragment$d */
    public static final class C18386d implements InterfaceC27288n {
        C18386d() {
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
                Intrinsics.m97800f(fragment, "null cannot be cast to non-null type com.transsion.search.fragment.hot.SearchHotFragment");
                ((SearchHotFragment) fragment).onConnected();
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.SearchSubjectFragment$e */
    public static final class C18387e implements TextWatcher {
        C18387e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (SearchSubjectFragment.this.ignoreEditChanged) {
                SearchSubjectFragment.this.ignoreEditChanged = false;
                return;
            }
            SearchSubjectFragment.this.mKeyword = String.valueOf(editable);
            SearchSubjectFragment searchSubjectFragment = SearchSubjectFragment.this;
            searchSubjectFragment.m77689M0(searchSubjectFragment.mKeyword);
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

    /* JADX INFO: renamed from: com.transsion.search.fragment.SearchSubjectFragment$f */
    public static final class C18388f implements TextView.OnEditorActionListener {
        C18388f() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            if (i11 != 0 && i11 != 3) {
                return false;
            }
            SearchSubjectFragment.this.mKeyword = String.valueOf(textView != null ? textView.getText() : null);
            SearchSubjectFragment.this.m77714B0("input");
            return true;
        }
    }

    /* JADX INFO: renamed from: A0 */
    private final boolean m77679A0() {
        m77710w0();
        return true;
    }

    /* JADX INFO: renamed from: C0 */
    private final void m77680C0(Fragment fragment) {
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
        editText.requestFocus();
        KeyboardUtils.m27135i(editText);
    }

    /* JADX INFO: renamed from: D0 */
    private final void m77681D0(boolean withoutKeyboard) {
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
            editText5.setOnClickListener(new View.OnClickListener() { // from class: yq.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchSubjectFragment.m77682E0(this.f88679a, view);
                }
            });
        }
        C28424i mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (textView = mViewBinding3.f87201j) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: yq.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchSubjectFragment.m77683F0(this.f88680a, view);
                }
            });
        }
        C28424i mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (editText4 = mViewBinding4.f87193b) != null) {
            editText4.addTextChangedListener(new C18387e());
        }
        C28424i mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (editText3 = mViewBinding5.f87193b) != null) {
            editText3.setOnEditorActionListener(new C18388f());
        }
        C28424i mViewBinding6 = getMViewBinding();
        if (mViewBinding6 != null && (editText2 = mViewBinding6.f87193b) != null) {
            editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: yq.d
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    SearchSubjectFragment.m77684G0(this.f88681a, view, z11);
                }
            });
        }
        C28424i mViewBinding7 = getMViewBinding();
        if (mViewBinding7 != null && (imageView = mViewBinding7.f87198g) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: yq.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchSubjectFragment.m77685H0(this.f88682a, view);
                }
            });
        }
        C28424i mViewBinding8 = getMViewBinding();
        if (mViewBinding8 != null && (appCompatImageView = mViewBinding8.f87195d) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: yq.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchSubjectFragment.m77686I0(this.f88683a, view);
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
        m77707r0(this, new Function0() { // from class: yq.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SearchSubjectFragment.m77687J0(this.f88684a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m77682E0(SearchSubjectFragment searchSubjectFragment, View view) {
        TextView textView;
        C28424i mViewBinding = searchSubjectFragment.getMViewBinding();
        if (mViewBinding == null || (textView = mViewBinding.f87201j) == null) {
            return;
        }
        AbstractC26006c.m102058k(textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m77683F0(SearchSubjectFragment searchSubjectFragment, View view) {
        searchSubjectFragment.m77714B0("input");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m77684G0(SearchSubjectFragment searchSubjectFragment, View view, boolean z11) {
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
                searchSubjectFragment.m77680C0(searchSubjectFragment.hotFragment);
                return;
            }
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            searchSubjectFragment.m77689M0(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m77685H0(SearchSubjectFragment searchSubjectFragment, View view) {
        EditText editText;
        C28424i mViewBinding = searchSubjectFragment.getMViewBinding();
        if (mViewBinding == null || (editText = mViewBinding.f87193b) == null) {
            return;
        }
        editText.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m77686I0(SearchSubjectFragment searchSubjectFragment, View view) {
        searchSubjectFragment.m77710w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final boolean m77687J0(SearchSubjectFragment searchSubjectFragment) {
        return searchSubjectFragment.m77679A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public final void m77688L0(String keyWord) {
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
    /* JADX INFO: renamed from: M0 */
    public final void m77689M0(String keyword) {
        SearchSuggestFragment searchSuggestFragment;
        if (keyword.length() == 0) {
            m77680C0(this.hotFragment);
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            SearchManagerActivity.INSTANCE.m77609a("showLinkageSearchFragment --> currently no network does not use linkage");
            return;
        }
        if (!TextUtils.isEmpty(keyword) && (searchSuggestFragment = this.suggestFragment) != null) {
            searchSuggestFragment.m77928n0(keyword);
        }
        m77680C0(this.suggestFragment);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m77706q0() {
        if (this.hotFragment == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
            SearchHotFragment searchHotFragmentM77802a = SearchHotFragment.INSTANCE.m77802a(this.hintSearchWord);
            abstractC3168wM14557p.m14805b(R$id.search_fragment_container, searchHotFragmentM77802a);
            this.hotFragment = searchHotFragmentM77802a;
            abstractC3168wM14557p.mo14671j();
        }
    }

    /* JADX INFO: renamed from: r0 */
    private final AbstractC0256u m77707r0(InterfaceC3224u owner, Function0 onBackPressed) {
        C18384b c18384b = new C18384b(onBackPressed, this);
        requireActivity().getOnBackPressedDispatcher().m942i(owner, c18384b);
        return c18384b;
    }

    /* JADX INFO: renamed from: s0 */
    private final void m77708s0() {
        if (this.suggestFragment == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
            SearchSuggestFragment searchSuggestFragmentM77930a = SearchSuggestFragment.INSTANCE.m77930a();
            abstractC3168wM14557p.m14805b(R$id.search_fragment_container, searchSuggestFragmentM77930a);
            this.suggestFragment = searchSuggestFragmentM77930a;
            abstractC3168wM14557p.mo14671j();
            SearchSuggestFragment searchSuggestFragment = this.suggestFragment;
            if (searchSuggestFragment != null) {
                searchSuggestFragment.m77929o0(new C18385c());
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m77709t0() {
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

    /* JADX INFO: renamed from: w0 */
    private final void m77710w0() {
        EditText editText;
        Fragment fragment = this.currentPage;
        if (fragment instanceof SearchHotFragment) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (this.isSuggestClick && !(fragment instanceof SearchSuggestFragment)) {
            if (fragment instanceof SearchResultFragment) {
                m77680C0(this.suggestFragment);
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

    /* JADX INFO: renamed from: x0 */
    private final void m77711x0() {
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
    /* JADX INFO: renamed from: y0 */
    public static final Unit m77712y0(final SearchSubjectFragment searchSubjectFragment, String str) {
        EditText editText;
        if (TextUtils.isEmpty(str)) {
            C28424i mViewBinding = searchSubjectFragment.getMViewBinding();
            if (mViewBinding != null && (editText = mViewBinding.f87193b) != null) {
                editText.postDelayed(new Runnable() { // from class: yq.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchSubjectFragment.m77713z0(this.f88685a);
                    }
                }, 500L);
            }
            C18517f.f59987a.m78051b(SearchSubjectFragment.class.getSimpleName() + " --> mViewBinding?.sRView?.setCallback{} --> onResult = " + str + " --> 拉起键盘");
        } else {
            searchSubjectFragment.m77688L0(str == null ? "" : str);
            searchSubjectFragment.m77714B0("voice");
            C18517f.f59987a.m78051b(SearchSubjectFragment.class.getSimpleName() + " --> mViewBinding?.sRView?.setCallback{} --> onResult = " + str + " --> 隐藏键盘");
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m77713z0(SearchSubjectFragment searchSubjectFragment) {
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

    /* JADX INFO: renamed from: B0 */
    public final void m77714B0(String searchFrom) {
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
            searchResultFragment.m77856v0(this.mKeyword, searchFrom);
        }
        m77680C0(this.searchResultFragment);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m77715K0() {
        String str;
        EditText editText;
        C28185c.a aVar = C28185c.f86800a;
        List listM109397a = aVar.m109397a();
        if (listM109397a == null || listM109397a.isEmpty()) {
            return;
        }
        List listM109397a2 = aVar.m109397a();
        int size = listM109397a2 != null ? listM109397a2.size() : 0;
        List listM109397a3 = aVar.m109397a();
        if (listM109397a3 != null) {
            int i11 = this.hintSearchIndex;
            this.hintSearchIndex = i11 + 1;
            str = (String) CollectionsKt.m97362l0(listM109397a3, i11 % size);
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
        this.backExitSearch = arguments2 != null ? arguments2.getBoolean("back_exit") : false;
        m77681D0(string.length() > 0);
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
            m77714B0("deeplink");
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        SpeechRecognizerView speechRecognizerView;
        Intrinsics.m97802h(view, "view");
        BaseSearchMainFragment.INSTANCE.m77678b();
        m77711x0();
        setNetListener(new C18386d());
        C28424i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (speechRecognizerView = mViewBinding.f87197f) != null) {
            speechRecognizerView.setCallback(new Function1() { // from class: yq.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchSubjectFragment.m77712y0(this.f88678a, (String) obj);
                }
            });
        }
        m77706q0();
        m77708s0();
        m77709t0();
        m77680C0(this.hotFragment);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.currentPage = null;
        this.hotFragment = null;
        this.suggestFragment = null;
        this.searchResultFragment = null;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.currentPage = null;
        this.hotFragment = null;
        this.suggestFragment = null;
        this.searchResultFragment = null;
        setNetListener(null);
        setMViewBinding(null);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m77716u0(String keyWord, String searchFrom, Function1 callback) {
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
        m77714B0(searchFrom);
        SearchManager.f59668f.m77605a().m77601g(this.mKeyword);
        callback.invoke(keyWord);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public C28424i getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28424i c28424iM109828c = C28424i.m109828c(inflater);
        Intrinsics.m97801g(c28424iM109828c, "inflate(...)");
        return c28424iM109828c;
    }
}
