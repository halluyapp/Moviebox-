package com.transsion.usercenter.message;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.widget.TnTextView;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.fragment.BaseListFragment;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$mipmap;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.message.UserMessageFragment;
import com.transsion.usercenter.message.adapter.C20617a;
import com.transsion.usercenter.message.bean.MessageEntity;
import com.transsion.usercenter.message.model.PagerEntity;
import com.transsion.usercenter.message.model.ResponseMessage;
import com.transsion.usercenter.profile.C20664f;
import com.transsion.usercenter.profile.bean.ProfileNewMessage;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dk.C22989b;
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
import p550kj.C24655b;
import p765s6.InterfaceC27564b;
import p823uw.C28046d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0004R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105¨\u0006;"}, m97100d2 = {"Lcom/transsion/usercenter/message/UserMessageFragment;", "Lcom/transsion/baseui/fragment/BaseListFragment;", "Lcom/transsion/usercenter/message/bean/MessageEntity;", "<init>", "()V", "", "c1", "", "s0", "()Ljava/lang/String;", "getPageStateLayoutTitle", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "m0", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "initViewData", "initViewModel", "initListener", "G0", "loadMore", "lazyLoadData", "retryLoadData", "Luw/d;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "V0", "()Luw/d;", "mViewModel", "Lcom/transsion/usercenter/profile/f;", "c", "W0", "()Lcom/transsion/usercenter/profile/f;", "noticeViewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "allType", "e", "mPage", "Landroid/view/View;", "f", "Landroid/view/View;", "header", "Landroidx/appcompat/widget/LinearLayoutCompat;", "g", "Landroidx/appcompat/widget/LinearLayoutCompat;", "mLikeLL", "h", "mCommentLL", "Landroidx/appcompat/widget/AppCompatTextView;", "i", "Landroidx/appcompat/widget/AppCompatTextView;", "mLikeText", "j", "mCommentText", CampaignEx.JSON_KEY_AD_K, "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class UserMessageFragment extends BaseListFragment<MessageEntity> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mViewModel = LazyKt.m97097b(new Function0() { // from class: tw.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserMessageFragment.m85087a1(this.f85661a);
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy noticeViewModel = LazyKt.m97097b(new Function0() { // from class: tw.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserMessageFragment.m85088b1(this.f85662a);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String allType = "ALL";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mPage = "1";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private View header;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private LinearLayoutCompat mLikeLL;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private LinearLayoutCompat mCommentLL;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private AppCompatTextView mLikeText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private AppCompatTextView mCommentText;

    /* JADX INFO: renamed from: com.transsion.usercenter.message.UserMessageFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UserMessageFragment m85092a() {
            return new UserMessageFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.message.UserMessageFragment$b */
    static final class C20614b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65071a;

        C20614b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65071a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65071a;
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
            this.f65071a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: V0 */
    private final C28046d m85082V0() {
        return (C28046d) this.mViewModel.getValue();
    }

    /* JADX INFO: renamed from: W0 */
    private final C20664f m85083W0() {
        return (C20664f) this.noticeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final void m85084X0(UserMessageFragment userMessageFragment, BaseQuickAdapter adapter, View view, int i11) {
        MessageEntity messageEntity;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = adapter.getItem(i11);
        Intrinsics.m97800f(item, "null cannot be cast to non-null type com.transsion.usercenter.message.bean.MessageEntity");
        MessageEntity messageEntity2 = (MessageEntity) item;
        int id2 = view.getId();
        if (id2 != R$id.rlLayout) {
            if ((id2 == R$id.imAvatar || id2 == R$id.tvNickName) && !Intrinsics.m97797c(messageEntity2.getType(), C20617a.f65080I)) {
                Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", messageEntity2.getSendUid()), userMessageFragment.requireContext(), null, 2, null);
                return;
            }
            return;
        }
        BaseQuickAdapter mBaseAdapter = userMessageFragment.getMBaseAdapter();
        if (mBaseAdapter == null || (messageEntity = (MessageEntity) mBaseAdapter.getItem(i11)) == null) {
            return;
        }
        if (Intrinsics.m97797c(messageEntity2.getType(), C20617a.f65080I)) {
            Navigator.m61845x(TheRouter.m61773c("/profile/message_detail").m61857K("msg_content", messageEntity.getContent()).m61857K("msg_nickname", messageEntity.getNickname()).m61857K("msg_create_time", messageEntity.getCreatedAt()), userMessageFragment.requireContext(), null, 2, null);
        } else {
            Navigator.m61845x(TheRouter.m61773c("/post/detail").m61857K("id", messageEntity.getTopicId()).m61857K(WebConstants.PAGE_FROM, "system_message").m61872z("video_load_more", false), userMessageFragment.requireContext(), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m85085Y0(UserMessageFragment userMessageFragment, ProfileNewMessage profileNewMessage) {
        TitleLayout titleLayout;
        TnTextView tvTitleText;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        if (profileNewMessage != null) {
            if (profileNewMessage.getLikeCnt() > 0 && (appCompatTextView2 = userMessageFragment.mLikeText) != null) {
                appCompatTextView2.setText(userMessageFragment.getString(R$string.profile_like) + "(" + (profileNewMessage.getLikeCnt() < 99 ? String.valueOf(profileNewMessage.getLikeCnt()) : "99+") + ")");
            }
            if (profileNewMessage.getCommentCnt() > 0 && (appCompatTextView = userMessageFragment.mCommentText) != null) {
                appCompatTextView.setText(userMessageFragment.getString(com.transsion.baseui.R$string.name_comments) + "(" + (profileNewMessage.getCommentCnt() < 99 ? String.valueOf(profileNewMessage.getCommentCnt()) : "99+") + ")");
            }
            C22989b c22989b = (C22989b) userMessageFragment.getMViewBinding();
            if (c22989b != null && (titleLayout = c22989b.f70182e) != null && (tvTitleText = titleLayout.getTvTitleText()) != null) {
                if (profileNewMessage.getSystemCnt() + profileNewMessage.getLikeCnt() + profileNewMessage.getCommentCnt() > 0) {
                    tvTitleText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R$mipmap.user_message_icon_new, 0);
                    tvTitleText.setCompoundDrawablePadding(8);
                } else {
                    tvTitleText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final Unit m85086Z0(UserMessageFragment userMessageFragment, ResponseMessage responseMessage) {
        List<MessageEntity> list;
        PagerEntity pager;
        if (responseMessage != null && (pager = responseMessage.getPager()) != null) {
            if (pager.getHasMore()) {
                userMessageFragment.mPage = pager.getNextPage();
                userMessageFragment.m65530B0();
            } else {
                BaseListFragment.m65522D0(userMessageFragment, false, 1, null);
            }
        }
        if (responseMessage == null || (list = responseMessage.getList()) == null) {
            userMessageFragment.m65539N0();
        } else if (userMessageFragment.m65529A0()) {
            userMessageFragment.m65536I0(false);
            if (list.isEmpty()) {
                BaseListFragment.m65523K0(userMessageFragment, null, 1, null);
            } else {
                BaseQuickAdapter mBaseAdapter = userMessageFragment.getMBaseAdapter();
                if (mBaseAdapter != null) {
                    mBaseAdapter.mo36201n1(list);
                }
            }
        } else {
            BaseQuickAdapter mBaseAdapter2 = userMessageFragment.getMBaseAdapter();
            if (mBaseAdapter2 != null) {
                mBaseAdapter2.mo36208q(list);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final C28046d m85087a1(UserMessageFragment userMessageFragment) {
        return (C28046d) new C3227v0(userMessageFragment).m14969a(C28046d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C20664f m85088b1(UserMessageFragment userMessageFragment) {
        return (C20664f) new C3227v0(userMessageFragment).m14969a(C20664f.class);
    }

    /* JADX INFO: renamed from: c1 */
    private final void m85089c1() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.user_message_header_layout, (ViewGroup) null);
        this.header = viewInflate;
        this.mLikeLL = viewInflate != null ? (LinearLayoutCompat) viewInflate.findViewById(R$id.ll_like) : null;
        View view = this.header;
        this.mCommentLL = view != null ? (LinearLayoutCompat) view.findViewById(R$id.ll_comment) : null;
        View view2 = this.header;
        this.mLikeText = view2 != null ? (AppCompatTextView) view2.findViewById(R$id.tv_like) : null;
        View view3 = this.header;
        this.mCommentText = view3 != null ? (AppCompatTextView) view3.findViewById(R$id.tv_comment) : null;
        LinearLayoutCompat linearLayoutCompat = this.mLikeLL;
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: tw.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    UserMessageFragment.m85090d1(this.f85663a, view4);
                }
            });
        }
        LinearLayoutCompat linearLayoutCompat2 = this.mCommentLL;
        if (linearLayoutCompat2 != null) {
            linearLayoutCompat2.setOnClickListener(new View.OnClickListener() { // from class: tw.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    UserMessageFragment.m85091e1(this.f85664a, view4);
                }
            });
        }
        if (this.header != null) {
            BaseQuickAdapter mBaseAdapter = getMBaseAdapter();
            if (mBaseAdapter != null) {
                View view4 = this.header;
                Intrinsics.m97799e(view4);
                BaseQuickAdapter.m36128k1(mBaseAdapter, view4, 0, 0, 6, null);
            }
            BaseQuickAdapter mBaseAdapter2 = getMBaseAdapter();
            if (mBaseAdapter2 != null) {
                mBaseAdapter2.m36198m1(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final void m85090d1(UserMessageFragment userMessageFragment, View view) {
        Navigator.m61845x(TheRouter.m61773c("/profile/user_room_message").m61857K("msgType", "like"), userMessageFragment.requireContext(), null, 2, null);
        AppCompatTextView appCompatTextView = userMessageFragment.mLikeText;
        if (appCompatTextView != null) {
            appCompatTextView.setText(userMessageFragment.getString(R$string.profile_like));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final void m85091e1(UserMessageFragment userMessageFragment, View view) {
        Navigator.m61845x(TheRouter.m61773c("/profile/user_room_message").m61857K("msgType", "comment"), userMessageFragment.requireContext(), null, 2, null);
        AppCompatTextView appCompatTextView = userMessageFragment.mCommentText;
        if (appCompatTextView != null) {
            appCompatTextView.setText(userMessageFragment.getString(com.transsion.baseui.R$string.name_comments));
        }
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: G0 */
    public void mo65534G0() {
        m65536I0(true);
        this.mPage = "1";
        lazyLoadData();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        String string = getString(R$string.messages_title_name);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        super.initListener();
        BaseQuickAdapter mBaseAdapter = getMBaseAdapter();
        if (mBaseAdapter != null) {
            mBaseAdapter.m36193l(R$id.rlLayout, R$id.imAvatar, R$id.tvNickName);
        }
        BaseQuickAdapter mBaseAdapter2 = getMBaseAdapter();
        if (mBaseAdapter2 != null) {
            mBaseAdapter2.m36216s1(new InterfaceC27564b() { // from class: tw.c
                @Override // p765s6.InterfaceC27564b
                /* JADX INFO: renamed from: a */
                public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    UserMessageFragment.m85084X0(this.f85660a, baseQuickAdapter, view, i11);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        super.initViewData();
        m85089c1();
        BaseListFragment.m65523K0(this, null, 1, null);
        m65536I0(true);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m85082V0().m109023d().m14851j(this, new C20614b(new Function1() { // from class: tw.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserMessageFragment.m85086Z0(this.f85665a, (ResponseMessage) obj);
            }
        }));
        m85083W0().m85337g().m14851j(this, new C20614b(new Function1() { // from class: tw.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserMessageFragment.m85085Y0(this.f85666a, (ProfileNewMessage) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        if (Intrinsics.m97797c(this.mPage, "1")) {
            m85083W0().m85335d();
        }
        m85082V0().m109024f(this.mPage, UserMessageType.SYSTEM.getValue());
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    public void loadMore() {
        if (Intrinsics.m97797c(this.mPage, "1")) {
            BaseListFragment.m65522D0(this, false, 1, null);
        } else {
            lazyLoadData();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: m0 */
    public BaseQuickAdapter mo65540m0() {
        return new C20617a(0, 1, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("system_message", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        loadMore();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: s0 */
    public String mo65546s0() {
        String string = getString(R$string.messages_title_name);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }
}
