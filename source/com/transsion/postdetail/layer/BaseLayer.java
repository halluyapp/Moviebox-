package com.transsion.postdetail.layer;

import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.postdetail.layer.listener.LayerFlag;
import com.transsion.postdetail.viewmodel.PostDetailViewModel;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseLayer {

    /* JADX INFO: renamed from: a */
    private final String f56391a;

    /* JADX INFO: renamed from: b */
    private InterfaceC16634g f56392b;

    /* JADX INFO: renamed from: c */
    private String f56393c;

    /* JADX INFO: renamed from: d */
    private PostSubjectItem f56394d;

    /* JADX INFO: renamed from: e */
    private final Lazy f56395e;

    /* JADX INFO: renamed from: f */
    private ORPlayerView f56396f;

    /* JADX INFO: renamed from: g */
    private ImageView f56397g;

    /* JADX INFO: renamed from: h */
    private C16780a f56398h;

    /* JADX INFO: renamed from: i */
    private boolean f56399i;

    public BaseLayer(final Fragment fragment) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f56391a = getClass().getSimpleName();
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.postdetail.layer.BaseLayer$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        this.f56395e = FragmentViewModelLazyKt.m14626a(fragment, Reflection.m97823b(PostDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.layer.BaseLayer$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.layer.BaseLayer$special$$inlined$viewModels$default$3
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
                    defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m73084F(LayerFlag flag, Object... params) {
        Intrinsics.m97802h(flag, "flag");
        Intrinsics.m97802h(params, "params");
        C16780a c16780a = this.f56398h;
        if (c16780a != null) {
            c16780a.m73111h(flag, Arrays.copyOf(params, params.length));
        }
    }

    /* JADX INFO: renamed from: G */
    protected final ImageView m73085G() {
        return this.f56397g;
    }

    /* JADX INFO: renamed from: H */
    protected final InterfaceC16634g m73086H() {
        return this.f56392b;
    }

    /* JADX INFO: renamed from: I */
    protected final ORPlayerView m73087I() {
        return this.f56396f;
    }

    /* JADX INFO: renamed from: J */
    protected final boolean m73088J() {
        return this.f56399i;
    }

    /* JADX INFO: renamed from: K */
    protected final void m73089K(ImageView imageView) {
        this.f56397g = imageView;
    }

    /* JADX INFO: renamed from: L */
    public final void m73090L(C16780a c16780a) {
        this.f56398h = c16780a;
    }

    /* JADX INFO: renamed from: M */
    public void mo73091M(InterfaceC16634g orPlayer, ORPlayerView orPlayerView) {
        Intrinsics.m97802h(orPlayer, "orPlayer");
        Intrinsics.m97802h(orPlayerView, "orPlayerView");
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f56391a;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "setPlayer----->", false, 4, null);
        this.f56392b = orPlayer;
        this.f56396f = orPlayerView;
    }

    /* JADX INFO: renamed from: N */
    public final void m73092N(String postId, PostSubjectItem postSubjectItem) {
        Intrinsics.m97802h(postId, "postId");
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f56391a;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "setPostData----->", false, 4, null);
        this.f56393c = postId;
        this.f56394d = postSubjectItem;
    }

    /* JADX INFO: renamed from: O */
    protected final void m73093O(String str) {
        this.f56393c = str;
    }

    /* JADX INFO: renamed from: P */
    protected final void m73094P(boolean z11) {
        this.f56399i = z11;
    }
}
