package com.transsion.usercenter.profile.see;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.p1004lifecycle.Lifecycle;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.fragment.BaseListFragment;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.publish.bean.SubjectCollection;
import com.transsion.share.bean.PostType;
import com.transsion.usercenter.profile.see.adapter.C20753a;
import com.transsion.usercenter.profile.see.bean.ProfileSeeMultiItemData;
import com.transsion.usercenter.profile.see.bean.ProfileSeeSubjectItem;
import com.transsion.usercenter.profile.see.bean.ProfileSeeTimeItem;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.AddToDownloadEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import p550kj.C24655b;
import p697q6.InterfaceC27022a;
import p801u6.C27941f;
import p888wy.C28465b;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J%\u0010\u000b\u001a\u00020\u00052\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, m97100d2 = {"Lcom/transsion/usercenter/profile/see/ProfileSeeListFragment;", "Lcom/transsion/baseui/fragment/BaseListFragment;", "Lq6/a;", "<init>", "()V", "", "W0", "Lkotlin/Pair;", "", "Lcom/transsion/share/bean/PostType;", "data", "T0", "(Lkotlin/Pair;)V", "a1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initViewData", "initViewModel", "initListener", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "m0", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "G0", "s0", "()Ljava/lang/String;", "loadMore", "getPageStateLayoutTitle", "retryLoadData", "lazyLoadData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/transsion/usercenter/profile/see/h;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "U0", "()Lcom/transsion/usercenter/profile/see/h;", "mProfileSeeViewModel", "c", "Ljava/lang/String;", "mUserId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "mTitleTxt", "", "e", "I", "mType", "f", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ProfileSeeListFragment extends BaseListFragment<InterfaceC27022a> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mProfileSeeViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String mUserId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String mTitleTxt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mType;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.see.ProfileSeeListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ProfileSeeListFragment m85505a(int i11, String str, String str2) {
            ProfileSeeListFragment profileSeeListFragment = new ProfileSeeListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("load_type", i11);
            bundle.putString("load_user_id", str);
            bundle.putString("load_title_txt", str2);
            profileSeeListFragment.setArguments(bundle);
            return profileSeeListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.see.ProfileSeeListFragment$b */
    static final class C20751b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65333a;

        C20751b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65333a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65333a;
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
            this.f65333a.invoke(obj);
        }
    }

    public ProfileSeeListFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.usercenter.profile.see.ProfileSeeListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.mProfileSeeViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C20762h.class), new Function0<C3231x0>() { // from class: com.transsion.usercenter.profile.see.ProfileSeeListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.usercenter.profile.see.ProfileSeeListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                Object objInvoke = function0.invoke();
                InterfaceC3208m interfaceC3208m = objInvoke instanceof InterfaceC3208m ? (InterfaceC3208m) objInvoke : null;
                C3227v0.c defaultViewModelProviderFactory = interfaceC3208m != null ? interfaceC3208m.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.mType = 1;
    }

    /* JADX INFO: renamed from: T0 */
    private final void m85496T0(Pair data) {
        List<Object> data2;
        BaseQuickAdapter mBaseAdapter;
        BaseQuickAdapter mBaseAdapter2 = getMBaseAdapter();
        if (mBaseAdapter2 == null || (data2 = mBaseAdapter2.getData()) == null) {
            return;
        }
        Iterator<Object> it = data2.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            Object obj = (InterfaceC27022a) it.next();
            if ((data.getSecond() == PostType.STAFF_TYPE && (obj instanceof Staff) && Intrinsics.m97797c(((Staff) obj).getStaffId(), data.getFirst())) || ((obj instanceof ProfileSeeSubjectItem) && Intrinsics.m97797c(((ProfileSeeSubjectItem) obj).getSubjectId(), data.getFirst()))) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 > 0) {
            if (data.getSecond() != PostType.STAFF_TYPE) {
                C28465b.f87467a.m109954a().m109953i(0, (String) data.getFirst());
            }
            BaseQuickAdapter mBaseAdapter3 = getMBaseAdapter();
            if (mBaseAdapter3 != null) {
                mBaseAdapter3.mo36138G0(i11);
            }
            int i12 = i11 - 1;
            if ((data2.get(i12) instanceof ProfileSeeTimeItem) && ((i11 >= data2.size() || (data2.get(i11) instanceof ProfileSeeTimeItem)) && (mBaseAdapter = getMBaseAdapter()) != null)) {
                mBaseAdapter.mo36138G0(i12);
            }
            BaseQuickAdapter mBaseAdapter4 = getMBaseAdapter();
            if ((mBaseAdapter4 != null ? mBaseAdapter4.getItemCount() : 0) <= 0) {
                BaseListFragment.m65523K0(this, null, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    private final C20762h m85497U0() {
        return (C20762h) this.mProfileSeeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final Unit m85498V0(ProfileSeeListFragment profileSeeListFragment, SubjectCollection value) {
        Intrinsics.m97802h(value, "value");
        String subjectId = value.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        profileSeeListFragment.m85496T0(new Pair(subjectId, null));
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: W0 */
    private final void m85499W0() {
        m85497U0().m85529n().m14851j(this, new C20751b(new Function1() { // from class: com.transsion.usercenter.profile.see.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileSeeListFragment.m85500X0(this.f65351a, (ProfileSeeMultiItemData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m85500X0(ProfileSeeListFragment profileSeeListFragment, ProfileSeeMultiItemData profileSeeMultiItemData) {
        List<InterfaceC27022a> items;
        Pager pager;
        if (profileSeeMultiItemData != null && (pager = profileSeeMultiItemData.getPager()) != null) {
            if (Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE)) {
                profileSeeListFragment.m65530B0();
            } else {
                BaseListFragment.m65522D0(profileSeeListFragment, false, 1, null);
            }
        }
        if (profileSeeMultiItemData == null || (items = profileSeeMultiItemData.getItems()) == null) {
            profileSeeListFragment.m65539N0();
        } else if (profileSeeListFragment.m65529A0()) {
            profileSeeListFragment.m65536I0(false);
            if (items.isEmpty()) {
                BaseListFragment.m65523K0(profileSeeListFragment, null, 1, null);
            } else {
                BaseQuickAdapter mBaseAdapter = profileSeeListFragment.getMBaseAdapter();
                if (mBaseAdapter != null) {
                    mBaseAdapter.mo36201n1(items);
                }
            }
        } else {
            BaseQuickAdapter mBaseAdapter2 = profileSeeListFragment.getMBaseAdapter();
            if (mBaseAdapter2 != null) {
                mBaseAdapter2.mo36208q(items);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m85501Y0(ProfileSeeListFragment profileSeeListFragment, Pair pair) {
        if (pair != null) {
            profileSeeListFragment.m85496T0(pair);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final Unit m85502Z0(ProfileSeeListFragment profileSeeListFragment, Integer num) {
        FragmentActivity fragmentActivityRequireActivity = profileSeeListFragment.requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        if ((fragmentActivityRequireActivity instanceof ProfileSeeActivity) && profileSeeListFragment.mType == 1) {
            Intrinsics.m97799e(num);
            ((ProfileSeeActivity) fragmentActivityRequireActivity).m85490H0(num.intValue());
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: a1 */
    private final void m85503a1() {
        Function1 function1 = new Function1() { // from class: com.transsion.usercenter.profile.see.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileSeeListFragment.m85504b1(this.f65350a, (AddToDownloadEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = AddToDownloadEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final Unit m85504b1(ProfileSeeListFragment profileSeeListFragment, AddToDownloadEvent value) {
        BaseQuickAdapter mBaseAdapter;
        List<Object> data;
        Intrinsics.m97802h(value, "value");
        try {
            BaseQuickAdapter mBaseAdapter2 = profileSeeListFragment.getMBaseAdapter();
            int i11 = -1;
            if (mBaseAdapter2 != null && (data = mBaseAdapter2.getData()) != null) {
                Iterator<Object> it = data.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    InterfaceC27022a interfaceC27022a = (InterfaceC27022a) it.next();
                    if ((interfaceC27022a instanceof ProfileSeeSubjectItem) && Intrinsics.m97797c(((ProfileSeeSubjectItem) interfaceC27022a).getSubjectId(), value.getSubjectId())) {
                        i11 = i12;
                        break;
                    }
                    i12++;
                }
            }
            if (i11 >= 0 && (mBaseAdapter = profileSeeListFragment.getMBaseAdapter()) != null) {
                mBaseAdapter.notifyItemChanged(i11);
            }
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: G0 */
    public void mo65534G0() {
        C20762h c20762hM85497U0 = m85497U0();
        String str = this.mUserId;
        if (str == null) {
            str = "";
        }
        c20762hM85497U0.m85531q(str, this.mType);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        String str = this.mTitleTxt;
        return str == null ? "" : str;
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        super.initListener();
        Function1 function1 = new Function1() { // from class: com.transsion.usercenter.profile.see.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileSeeListFragment.m85498V0(this.f65349a, (SubjectCollection) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = SubjectCollection.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        C27941f c27941fM36186h0;
        super.initViewData();
        m65536I0(true);
        BaseQuickAdapter mBaseAdapter = getMBaseAdapter();
        if (mBaseAdapter == null || (c27941fM36186h0 = mBaseAdapter.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108657E(4);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m85499W0();
        m85497U0().m85528l().m14851j(this, new C20751b(new Function1() { // from class: com.transsion.usercenter.profile.see.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileSeeListFragment.m85501Y0(this.f65347a, (Pair) obj);
            }
        }));
        m85497U0().m85527k().m14851j(this, new C20751b(new Function1() { // from class: com.transsion.usercenter.profile.see.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileSeeListFragment.m85502Z0(this.f65348a, (Integer) obj);
            }
        }));
        m85503a1();
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        C20762h c20762hM85497U0 = m85497U0();
        String str = this.mUserId;
        if (str == null) {
            str = "";
        }
        c20762hM85497U0.m85530o(str, this.mType);
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    public void loadMore() {
        lazyLoadData();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: m0 */
    public BaseQuickAdapter mo65540m0() {
        return new C20753a();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("movie_audio_archies", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.mUserId = arguments != null ? arguments.getString("load_user_id") : null;
        Bundle arguments2 = getArguments();
        this.mTitleTxt = arguments2 != null ? arguments2.getString("load_title_txt") : null;
        Bundle arguments3 = getArguments();
        this.mType = arguments3 != null ? arguments3.getInt("load_type", this.mType) : this.mType;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        m65533F0();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: s0 */
    public String mo65546s0() {
        String str = this.mTitleTxt;
        return str == null ? "" : str;
    }
}
