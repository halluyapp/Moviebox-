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
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.therouter.TheRouter;
import com.transsion.baselib.report.C14492k;
import com.transsion.baseui.R$color;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.helper.ImmVideoHelper;
import com.transsion.postdetail.p306ui.fragment.PostAudioDetailFragment;
import com.transsion.postdetail.p306ui.fragment.PostImageTextDetailFragment;
import com.transsion.postdetail.p306ui.fragment.VideoFragment;
import com.transsion.postdetail.viewmodel.PostDetailViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
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
import p415fq.InterfaceC23411b;
import p669p1.AbstractC26781a;
import p743rh.C27287m;
import p844vo.C28142c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 V2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010\u0015J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010+R\u0016\u00102\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u0010+R\u0016\u00107\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b8\u00101R\u0018\u0010;\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u0010+R*\u0010A\u001a\u0016\u0012\u0004\u0012\u00020=\u0018\u00010<j\n\u0012\u0004\u0012\u00020=\u0018\u0001`>8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u00101R\u0016\u0010E\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u00101R\u0018\u0010H\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bI\u00101R\u001b\u0010P\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010R¨\u0006X"}, m97100d2 = {"Lcom/transsion/postdetail/ui/activity/PostDetailVideoActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lvo/c;", "<init>", "()V", "", "G0", "H0", "", "mediaType", "Landroidx/fragment/app/Fragment;", "K0", "(Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "I0", "J0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "A0", "()Z", "isMonitorNetworkState", "onBackPressed", "onResume", "onStop", "D0", "()Lvo/c;", "f0", "()Ljava/lang/String;", "l0", "m0", "k0", "p0", "isTranslucent", "isStatusDark", "", "statusColor", "()I", "o0", "retryLoadData", "getPageName", "i", "Ljava/lang/String;", "j", "postId", CampaignEx.JSON_KEY_AD_K, "itemType", "l", "Z", "fromComment", "m", "ops", "n", "I", "tabId", "o", "videoLoadMore", TtmlNode.TAG_P, "pageFrom", "Ljava/util/ArrayList;", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "Lkotlin/collections/ArrayList;", CampaignEx.JSON_KEY_AD_Q, "Ljava/util/ArrayList;", "downloadedShortsList", CampaignEx.JSON_KEY_AD_R, "prioritizeDownloaded", "s", "isFromDownloaded", "t", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "itemObject", TmcStartParams.KEY_URL_SHORT, "isBuiltIn", "Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "v", "Lkotlin/Lazy;", "E0", "()Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "viewModel", "w", "Landroidx/fragment/app/Fragment;", "mFragment", "x", "target", "y", "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PostDetailVideoActivity extends BaseNewActivity<C28142c> {

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

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean videoLoadMore = true;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public String pageFrom;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public ArrayList downloadedShortsList;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean prioritizeDownloaded;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean isFromDownloaded;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public PostSubjectItem itemObject;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean isBuiltIn;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private Fragment mFragment;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private Fragment target;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.activity.PostDetailVideoActivity$b */
    static final class C16958b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f56932a;

        C16958b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f56932a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f56932a;
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
            this.f56932a.invoke(obj);
        }
    }

    public PostDetailVideoActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.m97823b(PostDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.activity.PostDetailVideoActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.activity.PostDetailVideoActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<AbstractC26781a>() { // from class: com.transsion.postdetail.ui.activity.PostDetailVideoActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: E0 */
    private final PostDetailViewModel m73846E0() {
        return (PostDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Unit m73847F0(PostDetailVideoActivity postDetailVideoActivity, PostSubjectItem postSubjectItem) {
        if (postSubjectItem == null) {
            postDetailVideoActivity.m65399v0();
        } else {
            Media media = postSubjectItem.getMedia();
            String mediaType = media != null ? media.getMediaType() : null;
            postDetailVideoActivity.mediaType = mediaType;
            if (Intrinsics.m97797c(mediaType, MediaType.VIDEO.getValue())) {
                ImmVideoHelper.f56352h.m73010a().m73007s(postSubjectItem);
            }
            postDetailVideoActivity.itemObject = postSubjectItem;
            postDetailVideoActivity.m73849H0();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: G0 */
    private final void m73848G0() {
        Media media;
        Media media2;
        m65400w0();
        if (!this.isBuiltIn && !this.isFromDownloaded && !C27287m.f83003a.m106330e()) {
            m65402y0();
            return;
        }
        if (this.isFromDownloaded && TextUtils.isEmpty(this.mediaType)) {
            PostSubjectItem postSubjectItem = this.itemObject;
            String mediaType = null;
            if (TextUtils.isEmpty((postSubjectItem == null || (media2 = postSubjectItem.getMedia()) == null) ? null : media2.getMediaType())) {
                mediaType = MediaType.VIDEO.getValue();
            } else {
                PostSubjectItem postSubjectItem2 = this.itemObject;
                if (postSubjectItem2 != null && (media = postSubjectItem2.getMedia()) != null) {
                    mediaType = media.getMediaType();
                }
            }
            this.mediaType = mediaType;
        }
        if (this.postId == null || !TextUtils.isEmpty(this.mediaType)) {
            m73849H0();
            return;
        }
        PostDetailViewModel postDetailViewModelM73846E0 = m73846E0();
        String str = this.postId;
        if (str == null) {
            str = "";
        }
        postDetailViewModelM73846E0.m75057x(str);
    }

    /* JADX INFO: renamed from: H0 */
    private final void m73849H0() {
        m65398u0();
        m73851J0();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        Fragment fragmentM73852K0 = m73852K0(this.mediaType);
        if (fragmentM73852K0 != null) {
            abstractC3168wM14557p.m14813s(R$id.container, fragmentM73852K0);
        } else {
            fragmentM73852K0 = null;
        }
        this.target = fragmentM73852K0;
        abstractC3168wM14557p.mo14671j();
    }

    /* JADX INFO: renamed from: I0 */
    private final void m73850I0() {
        InterfaceC23411b interfaceC23411b;
        if (!TextUtils.equals(MediaType.VIDEO.getValue(), this.mediaType) || (interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0])) == null) {
            return;
        }
        interfaceC23411b.mo23888e();
    }

    /* JADX INFO: renamed from: J0 */
    private final void m73851J0() {
        InterfaceC23411b interfaceC23411b;
        if (!TextUtils.equals(MediaType.VIDEO.getValue(), this.mediaType) || (interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0])) == null) {
            return;
        }
        interfaceC23411b.mo23887d();
    }

    /* JADX INFO: renamed from: K0 */
    private final Fragment m73852K0(String mediaType) {
        Fragment fragmentM74402a;
        if (Intrinsics.m97797c(mediaType, MediaType.AUDIO.getValue())) {
            setRequestedOrientation(1);
            fragmentM74402a = PostAudioDetailFragment.INSTANCE.m74286a(this.postId, this.fromComment, this.ops, this.itemObject);
        } else if (Intrinsics.m97797c(mediaType, MediaType.VIDEO.getValue())) {
            PostSubjectItem postSubjectItem = this.itemObject;
            if (postSubjectItem != null) {
                ImmVideoHelper.f56352h.m73010a().m73007s(postSubjectItem);
            }
            fragmentM74402a = VideoFragment.INSTANCE.m74528a(this.postId, this.itemType, Integer.valueOf(this.tabId), this.videoLoadMore, (704 & 16) != 0 ? true : this.fromComment, (704 & 32) != 0 ? "" : this.ops, (704 & 64) != 0 ? false : false, (704 & 128) != 0 ? "" : null, (704 & 256) != 0 ? null : this.pageFrom, (704 & 512) != 0 ? false : false, (704 & 1024) != 0 ? null : this.downloadedShortsList, (704 & 2048) != 0 ? false : this.prioritizeDownloaded, (704 & 4096) != 0 ? false : this.isFromDownloaded);
        } else {
            setRequestedOrientation(1);
            fragmentM74402a = PostImageTextDetailFragment.INSTANCE.m74402a(this.postId, this.fromComment, this.ops, this.itemObject, this.pageFrom);
        }
        this.mFragment = fragmentM74402a;
        return fragmentM74402a;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: A0 */
    public boolean mo65380A0() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public C28142c getViewBinding() {
        C28142c c28142cM109291c = C28142c.m109291c(getLayoutInflater());
        Intrinsics.m97801g(c28142cM109291c, "inflate(...)");
        return c28142cM109291c;
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

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public boolean isMonitorNetworkState() {
        return (this.isBuiltIn || this.isFromDownloaded) ? false : true;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isStatusDark() {
        return false;
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
        m65396s0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
        m73846E0().m75048A().m14851j(this, new C16958b(new Function1() { // from class: com.transsion.postdetail.ui.activity.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailVideoActivity.m73847F0(this.f56944a, (PostSubjectItem) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: o0 */
    public boolean mo65393o0() {
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
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
        if ((this.isBuiltIn || this.isFromDownloaded) && !C27287m.f83003a.m106330e()) {
            mo65394p0();
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseMusicFloatActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m73851J0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        m73850I0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
        m73848G0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
        if (this.target == null) {
            m73848G0();
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public int statusColor() {
        return R$color.base_color_black;
    }
}
