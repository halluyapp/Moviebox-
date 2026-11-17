package com.transsion.postdetail.p306ui.activity;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.ViewModelLazy;
import ck.C5127x;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.transsion.baselib.report.C14492k;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.helper.ImmVideoHelper;
import com.transsion.postdetail.p306ui.fragment.PostAudioDetailFragment;
import com.transsion.postdetail.p306ui.fragment.PostDetailFragment;
import com.transsion.postdetail.p306ui.fragment.VideoFragment;
import com.transsion.postdetail.viewmodel.PostDetailViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p415fq.C23420k;
import p415fq.InterfaceC23411b;
import p669p1.AbstractC26781a;
import p743rh.C27287m;
import p844vo.C28142c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\tJ\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\tJ\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\tJ\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010,R\u0016\u00103\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b4\u0010,R\u0016\u00108\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b9\u00102R\u0018\u0010<\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b;\u0010,R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u0010,R\u0016\u0010D\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u00102R\u001b\u0010J\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR\u0016\u0010Q\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010,¨\u0006T"}, m97100d2 = {"Lcom/transsion/postdetail/ui/activity/PostDetailActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lvo/c;", "<init>", "()V", "", "J0", "", "I0", "()Z", "K0", "", "mediaType", "Landroidx/fragment/app/Fragment;", "N0", "(Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "L0", "M0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "onResume", "onStop", "E0", "()Lvo/c;", "f0", "()Ljava/lang/String;", "l0", "m0", "k0", "p0", "isTranslucent", "isChangeStatusBar", "", "statusColor", "()I", "isStatusDark", "o0", "retryLoadData", "getPageName", "a0", "i", "Ljava/lang/String;", "j", "postId", CampaignEx.JSON_KEY_AD_K, "itemType", "l", "Z", "fromComment", "m", "ops", "n", "I", "tabId", "o", "videoLoadMore", TtmlNode.TAG_P, "pageFrom", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", CampaignEx.JSON_KEY_AD_Q, "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "itemObject", CampaignEx.JSON_KEY_AD_R, "commentId", "s", "needBackToRoom", "Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "t", "Lkotlin/Lazy;", "F0", "()Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "viewModel", TmcStartParams.KEY_URL_SHORT, "Landroidx/fragment/app/Fragment;", "mFragment", "v", "target", "w", "emptyDesc", "x", "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PostDetailActivity extends BaseNewActivity<C28142c> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public String mediaType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String postId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public String itemType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean fromComment;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public String ops;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int tabId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public String pageFrom;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public PostSubjectItem itemObject;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public String commentId;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean needBackToRoom;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private Fragment mFragment;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private Fragment target;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean videoLoadMore = true;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private String emptyDesc = "";

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.activity.PostDetailActivity$b */
    static final class C16956b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f56914a;

        C16956b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f56914a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f56914a;
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
            this.f56914a.invoke(obj);
        }
    }

    public PostDetailActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.m97823b(PostDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.activity.PostDetailActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.activity.PostDetailActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<AbstractC26781a>() { // from class: com.transsion.postdetail.ui.activity.PostDetailActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final AbstractC26781a invoke() {
                AbstractC26781a abstractC26781a;
                Function0 function1 = function0;
                return (function1 == null || (abstractC26781a = (AbstractC26781a) function1.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : abstractC26781a;
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    private final PostDetailViewModel m73835F0() {
        return (PostDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final Unit m73836G0(PostDetailActivity postDetailActivity, PostSubjectItem postSubjectItem) {
        if (postSubjectItem == null) {
            postDetailActivity.m65399v0();
        } else {
            Media media = postSubjectItem.getMedia();
            String mediaType = media != null ? media.getMediaType() : null;
            postDetailActivity.mediaType = mediaType;
            if (Intrinsics.m97797c(mediaType, MediaType.VIDEO.getValue())) {
                ImmVideoHelper.f56352h.m73010a().m73007s(postSubjectItem);
            }
            postDetailActivity.itemObject = postSubjectItem;
            postDetailActivity.m65397t0();
            postDetailActivity.m73840K0();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final Unit m73837H0(PostDetailActivity postDetailActivity, String str) {
        if (Intrinsics.m97797c(str, "404")) {
            String string = postDetailActivity.getString(R$string.post_delete_tips);
            Intrinsics.m97801g(string, "getString(...)");
            postDetailActivity.emptyDesc = string;
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: I0 */
    private final boolean m73838I0() {
        return Intrinsics.m97797c(MediaType.VIDEO.getValue(), this.mediaType) || Intrinsics.m97797c(MediaType.AUDIO.getValue(), this.mediaType) || C5127x.f17620a.m23969a();
    }

    /* JADX INFO: renamed from: J0 */
    private final void m73839J0() {
        String str;
        m65400w0();
        if (!C27287m.f83003a.m106330e()) {
            m65402y0();
            return;
        }
        if (this.postId == null || !((str = this.mediaType) == null || str.length() == 0)) {
            m73840K0();
            return;
        }
        PostDetailViewModel postDetailViewModelM73835F0 = m73835F0();
        String str2 = this.postId;
        if (str2 == null) {
            str2 = "";
        }
        postDetailViewModelM73835F0.m75057x(str2);
    }

    /* JADX INFO: renamed from: K0 */
    private final void m73840K0() {
        m73842M0();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        Fragment fragmentM73843N0 = m73843N0(this.mediaType);
        if (fragmentM73843N0 != null) {
            abstractC3168wM14557p.m14813s(R$id.container, fragmentM73843N0);
        } else {
            fragmentM73843N0 = null;
        }
        this.target = fragmentM73843N0;
        abstractC3168wM14557p.mo14671j();
    }

    /* JADX INFO: renamed from: L0 */
    private final void m73841L0() {
        InterfaceC23411b interfaceC23411b;
        if (!TextUtils.equals(MediaType.VIDEO.getValue(), this.mediaType) || (interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0])) == null) {
            return;
        }
        interfaceC23411b.mo23888e();
    }

    /* JADX INFO: renamed from: M0 */
    private final void m73842M0() {
        InterfaceC23411b interfaceC23411b;
        if (!TextUtils.equals(MediaType.VIDEO.getValue(), this.mediaType) || (interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0])) == null) {
            return;
        }
        interfaceC23411b.mo23887d();
    }

    /* JADX INFO: renamed from: N0 */
    private final Fragment m73843N0(String mediaType) {
        Fragment fragmentM74401a;
        if (Intrinsics.m97797c(mediaType, MediaType.VIDEO.getValue())) {
            m65398u0();
            PostSubjectItem postSubjectItem = this.itemObject;
            if (postSubjectItem != null) {
                ImmVideoHelper.f56352h.m73010a().m73007s(postSubjectItem);
            }
            fragmentM74401a = VideoFragment.INSTANCE.m74528a(this.postId, this.itemType, Integer.valueOf(this.tabId), this.videoLoadMore, (704 & 16) != 0 ? true : this.fromComment, (704 & 32) != 0 ? "" : this.ops, (704 & 64) != 0 ? false : false, (704 & 128) != 0 ? "" : this.commentId, (704 & 256) != 0 ? null : this.pageFrom, (704 & 512) != 0 ? false : this.needBackToRoom, (704 & 1024) != 0 ? null : null, (704 & 2048) != 0 ? false : false, (704 & 4096) != 0 ? false : false);
        } else {
            setRequestedOrientation(1);
            fragmentM74401a = PostDetailFragment.INSTANCE.m74401a(this.postId, this.fromComment, this.ops, this.itemObject, this.commentId, this.pageFrom);
        }
        this.mFragment = fragmentM74401a;
        return fragmentM74401a;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public C28142c getViewBinding() {
        C28142c c28142cM109291c = C28142c.m109291c(getLayoutInflater());
        Intrinsics.m97801g(c28142cM109291c, "inflate(...)");
        return c28142cM109291c;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: a0, reason: from getter */
    public String getEmptyDesc() {
        return this.emptyDesc;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return "";
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "postdetail";
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isChangeStatusBar() {
        return m73838I0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isStatusDark() {
        if (m73838I0()) {
            return false;
        }
        return super.isStatusDark();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: k0 */
    public void mo65389k0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: l0 */
    public void mo65390l0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
        m73835F0().m75048A().m14851j(this, new C16956b(new Function1() { // from class: com.transsion.postdetail.ui.activity.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailActivity.m73836G0(this.f56942a, (PostSubjectItem) obj);
            }
        }));
        m73835F0().m75058y().m14851j(this, new C16956b(new Function1() { // from class: com.transsion.postdetail.ui.activity.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailActivity.m73837H0(this.f56943a, (String) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: o0 */
    public boolean mo65393o0() {
        if (Intrinsics.m97797c(MediaType.VIDEO.getValue(), this.mediaType)) {
            return false;
        }
        return super.mo65393o0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.needBackToRoom) {
            C23420k.m92971i(C23420k.f71413a, null, null, null, false, 15, null);
            finish();
            return;
        }
        Fragment fragment = this.mFragment;
        if (fragment instanceof PostAudioDetailFragment) {
            Intrinsics.m97800f(fragment, "null cannot be cast to non-null type com.transsion.postdetail.ui.fragment.PostAudioDetailFragment");
            ((PostAudioDetailFragment) fragment).m74285p1();
        }
        super.onBackPressed();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        super.onCreate(savedInstanceState);
        C14492k.f50955a.m65329w(3, this);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseMusicFloatActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m73842M0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        m73841L0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
        m73839J0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
        if (this.target == null) {
            m73839J0();
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public int statusColor() {
        return m73838I0() ? R$color.gray_0_1 : super.statusColor();
    }
}
