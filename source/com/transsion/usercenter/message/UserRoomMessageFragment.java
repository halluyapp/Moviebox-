package com.transsion.usercenter.message;

import android.os.Bundle;
import android.view.View;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.fragment.BaseListFragment;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.message.UserRoomMessageFragment;
import com.transsion.usercenter.message.adapter.C20617a;
import com.transsion.usercenter.message.adapter.C20618b;
import com.transsion.usercenter.message.bean.MessageEntity;
import com.transsion.usercenter.message.model.PagerEntity;
import com.transsion.usercenter.message.model.ResponseMessage;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
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
@Metadata(m97099d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0004R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!¨\u0006)"}, m97100d2 = {"Lcom/transsion/usercenter/message/UserRoomMessageFragment;", "Lcom/transsion/baseui/fragment/BaseListFragment;", "Lcom/transsion/usercenter/message/bean/MessageEntity;", "<init>", "()V", "", "getPageName", "()Ljava/lang/String;", "s0", "getPageStateLayoutTitle", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "m0", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "initViewData", "initViewModel", "initListener", "G0", "loadMore", "lazyLoadData", "retryLoadData", "receiveArguments", "Luw/d;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "R0", "()Luw/d;", "mViewModel", "c", "Ljava/lang/String;", "allType", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "mPage", "e", "msgType", "f", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class UserRoomMessageFragment extends BaseListFragment<MessageEntity> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mViewModel = LazyKt.m97097b(new Function0() { // from class: tw.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserRoomMessageFragment.m85100U0();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String allType = "ALL";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String mPage = "1";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String msgType;

    /* JADX INFO: renamed from: com.transsion.usercenter.message.UserRoomMessageFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UserRoomMessageFragment m85101a(String str) {
            UserRoomMessageFragment userRoomMessageFragment = new UserRoomMessageFragment();
            Bundle bundle = new Bundle();
            bundle.putString("msgType", str);
            userRoomMessageFragment.setArguments(bundle);
            return userRoomMessageFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.message.UserRoomMessageFragment$b */
    static final class C20616b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65078a;

        C20616b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65078a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65078a;
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
            this.f65078a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private final C28046d m85097R0() {
        return (C28046d) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final void m85098S0(UserRoomMessageFragment userRoomMessageFragment, BaseQuickAdapter adapter, View view, int i11) {
        MessageEntity messageEntity;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = adapter.getItem(i11);
        Intrinsics.m97800f(item, "null cannot be cast to non-null type com.transsion.usercenter.message.bean.MessageEntity");
        MessageEntity messageEntity2 = (MessageEntity) item;
        int id2 = view.getId();
        if (id2 != R$id.clLayout) {
            if (id2 != R$id.iv_avatar || Intrinsics.m97797c(messageEntity2.getType(), C20617a.f65080I)) {
                return;
            }
            Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", messageEntity2.getSendUid()), userRoomMessageFragment.requireContext(), null, 2, null);
            return;
        }
        BaseQuickAdapter mBaseAdapter = userRoomMessageFragment.getMBaseAdapter();
        if (mBaseAdapter == null || (messageEntity = (MessageEntity) mBaseAdapter.getItem(i11)) == null) {
            return;
        }
        if (Intrinsics.m97797c(messageEntity2.getType(), C20617a.f65080I)) {
            Navigator.m61845x(TheRouter.m61773c("/profile/message_detail").m61857K("msg_content", messageEntity.getContent()).m61857K("msg_nickname", messageEntity.getNickname()).m61857K("msg_create_time", messageEntity.getCreatedAt()), userRoomMessageFragment.requireContext(), null, 2, null);
            return;
        }
        boolean z11 = messageEntity.getCommentId().length() == 0;
        if (messageEntity.getCommentId().length() > 0 && Intrinsics.m97797c(messageEntity.getCommentStatus(), "DELETED")) {
            C13806h.f49015a.m62325l(userRoomMessageFragment.getString(R$string.comment_deleted_tips));
        } else if (Intrinsics.m97797c(messageEntity.getTopicType(), "UGC_VIDEO")) {
            Navigator.m61845x(TheRouter.m61773c("/ugc_video/detail").m61857K("id", messageEntity.getTopicId()).m61852F("ugc_bottom_fragment_selected", 1), userRoomMessageFragment.requireContext(), null, 2, null);
        } else {
            Navigator.m61845x(TheRouter.m61773c("/post/detail").m61857K("id", messageEntity.getTopicId()).m61857K(WebConstants.PAGE_FROM, "system_message").m61857K("comment_id", messageEntity.getCommentId()).m61872z("video_load_more", false).m61872z("from_comment", z11), userRoomMessageFragment.requireContext(), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final Unit m85099T0(UserRoomMessageFragment userRoomMessageFragment, ResponseMessage responseMessage) {
        List<MessageEntity> list;
        PagerEntity pager;
        if (responseMessage != null && (pager = responseMessage.getPager()) != null) {
            if (pager.getHasMore()) {
                userRoomMessageFragment.mPage = pager.getNextPage();
                userRoomMessageFragment.m65530B0();
            } else {
                BaseListFragment.m65522D0(userRoomMessageFragment, false, 1, null);
            }
        }
        if (responseMessage == null || (list = responseMessage.getList()) == null) {
            userRoomMessageFragment.m65539N0();
        } else if (userRoomMessageFragment.m65529A0()) {
            userRoomMessageFragment.m65536I0(false);
            if (list.isEmpty()) {
                BaseListFragment.m65523K0(userRoomMessageFragment, null, 1, null);
            } else {
                BaseQuickAdapter mBaseAdapter = userRoomMessageFragment.getMBaseAdapter();
                if (mBaseAdapter != null) {
                    mBaseAdapter.mo36201n1(list);
                }
            }
        } else {
            BaseQuickAdapter mBaseAdapter2 = userRoomMessageFragment.getMBaseAdapter();
            if (mBaseAdapter2 != null) {
                mBaseAdapter2.mo36208q(list);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C28046d m85100U0() {
        return new C28046d();
    }

    private final String getPageName() {
        String str = this.msgType;
        return (!Intrinsics.m97797c(str, "like") && Intrinsics.m97797c(str, "comment")) ? "comment_message" : "like_message";
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
        String string = getString(R$string.user_messaeg_title);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        super.initListener();
        BaseQuickAdapter mBaseAdapter = getMBaseAdapter();
        if (mBaseAdapter != null) {
            mBaseAdapter.m36193l(R$id.clLayout, R$id.iv_avatar);
        }
        BaseQuickAdapter mBaseAdapter2 = getMBaseAdapter();
        if (mBaseAdapter2 != null) {
            mBaseAdapter2.m36216s1(new InterfaceC27564b() { // from class: tw.l
                @Override // p765s6.InterfaceC27564b
                /* JADX INFO: renamed from: a */
                public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    UserRoomMessageFragment.m85098S0(this.f85668a, baseQuickAdapter, view, i11);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        super.initViewData();
        BaseListFragment.m65523K0(this, null, 1, null);
        m65536I0(true);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m85097R0().m109023d().m14851j(this, new C20616b(new Function1() { // from class: tw.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserRoomMessageFragment.m85099T0(this.f85667a, (ResponseMessage) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        m85097R0().m109024f(this.mPage, (Intrinsics.m97797c(this.msgType, "like") ? UserMessageType.LIKE : UserMessageType.COMMENT).getValue());
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
        return new C20618b(0, 1, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        String string;
        super.receiveArguments();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("msgType")) == null) {
            string = "like";
        }
        this.msgType = string;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        loadMore();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: s0 */
    public String mo65546s0() {
        return Intrinsics.m97797c(this.msgType, "like") ? "Likes" : "Comments";
    }
}
