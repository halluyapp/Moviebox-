package com.transsion.postdetail.p306ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.Utils;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.noober.background.view.BLView;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$drawable;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.download.DownloadException;
import com.transsion.baseui.util.AbstractC14567m;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.ninegridview.helper.FileHelper;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.R$style;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.postdetail.util.PostSaveHelper;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.manager.C21851p;
import com.transsnet.downloader.manager.DownloadEsHelper;
import com.transsnet.downloader.manager.InterfaceC21842g;
import com.transsnet.downloader.util.DownloadUtil;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p648oj.InterfaceC26269m0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001-\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001f\u0010\u0012R\u0018\u0010\"\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m97100d2 = {"Lcom/transsion/postdetail/ui/view/PostExploreItemView;", "Lcom/transsion/postdetail/ui/view/PostBaseItemView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "res", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", WebConstants.FIELD_ITEM, "", "r0", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "y0", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "s0", "(Landroid/view/View;)V", "postItem", "t0", "u0", "w0", "x0", "setHeaderData", "setSubjectAndRoomContent", "onAttachedToWindow", "onDetachedFromWindow", CampaignEx.JSON_KEY_AD_Q, "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "mItem", "Landroid/animation/ObjectAnimator;", CampaignEx.JSON_KEY_AD_R, "Landroid/animation/ObjectAnimator;", "rotateAnimator", "Lcom/transsnet/downloader/manager/g;", "s", "Lkotlin/Lazy;", "getDownloadManager", "()Lcom/transsnet/downloader/manager/g;", "downloadManager", "com/transsion/postdetail/ui/view/PostExploreItemView$a", "t", "Lcom/transsion/postdetail/ui/view/PostExploreItemView$a;", "downloadListener", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PostExploreItemView extends PostBaseItemView {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private PostSubjectItem mItem;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private ObjectAnimator rotateAnimator;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Lazy downloadManager;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C17335a downloadListener;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.view.PostExploreItemView$a */
    public static final class C17335a implements InterfaceC26269m0 {
        C17335a() {
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: a */
        public void mo24046a(DownloadBean bean, DownloadException downloadException) {
            Intrinsics.m97802h(bean, "bean");
            PostExploreItemView.this.m74814y0();
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: b */
        public void mo24047b(DownloadBean bean) {
            Intrinsics.m97802h(bean, "bean");
            PostExploreItemView.this.m74814y0();
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: c */
        public void mo24048c(DownloadBean bean, long j11, long j12) {
            Intrinsics.m97802h(bean, "bean");
            PostExploreItemView.this.m74814y0();
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: d */
        public void mo24049d(DownloadBean bean) {
            Intrinsics.m97802h(bean, "bean");
            PostExploreItemView.this.m74814y0();
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: e */
        public void mo24050e(DownloadBean bean, String str) {
            Intrinsics.m97802h(bean, "bean");
            PostExploreItemView.this.m74814y0();
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: f */
        public void mo24051f(DownloadBean bean) {
            Intrinsics.m97802h(bean, "bean");
            PostExploreItemView.this.m74814y0();
        }

        @Override // p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: g */
        public void mo24052g(DownloadBean bean) {
            Intrinsics.m97802h(bean, "bean");
            PostExploreItemView.this.m74814y0();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostExploreItemView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostExploreItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostExploreItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.downloadManager = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.view.o1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostExploreItemView.m74806q0();
            }
        });
        this.downloadListener = new C17335a();
    }

    private final InterfaceC21842g getDownloadManager() {
        return (InterfaceC21842g) this.downloadManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final InterfaceC21842g m74806q0() {
        return C21851p.f67672a.m88759a(Utils.m27275a());
    }

    /* JADX INFO: renamed from: r0 */
    private final void m74807r0(PostSubjectItem item) {
        String avatar;
        String nickname;
        ShapeableImageView ivRoomCover = getViewBinding().f86644l;
        Intrinsics.m97801g(ivRoomCover, "ivRoomCover");
        AbstractC26006c.m102054g(ivRoomCover);
        ShapeableImageView ivUserAvatar = getViewBinding().f86645m;
        Intrinsics.m97801g(ivUserAvatar, "ivUserAvatar");
        AbstractC26006c.m102054g(ivUserAvatar);
        AppCompatTextView tvUserNameOrLocation = getViewBinding().f86623A;
        Intrinsics.m97801g(tvUserNameOrLocation, "tvUserNameOrLocation");
        AbstractC26006c.m102054g(tvUserNameOrLocation);
        BLView bLView = getViewBinding().f86631I;
        if (bLView != null) {
            AbstractC26006c.m102054g(bLView);
        }
        ShapeableImageView ivUserAvatar2 = getViewBinding().f86646n;
        Intrinsics.m97801g(ivUserAvatar2, "ivUserAvatar2");
        AbstractC26006c.m102058k(ivUserAvatar2);
        BLView bLView2 = getViewBinding().f86632J;
        if (bLView2 != null) {
            AbstractC26006c.m102058k(bLView2);
        }
        String str = "";
        if (item.getBuiltIn()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new PostExploreItemView$hideGroup$1(item, this, null), 3, null);
        } else {
            C23860f.a aVar = C23860f.f72909a;
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            User user = item.getUser();
            if (user == null || (avatar = user.getAvatar()) == null) {
                avatar = "";
            }
            C23860f.b bVarM94464c = bVarM94457m.m94468g(avatar).m94474m(getDp16()).m94464c(getDp16());
            ShapeableImageView ivUserAvatar3 = getViewBinding().f86646n;
            Intrinsics.m97801g(ivUserAvatar3, "ivUserAvatar2");
            bVarM94464c.m94465d(ivUserAvatar3);
        }
        AppCompatTextView appCompatTextView = getViewBinding().f86658z;
        User user2 = item.getUser();
        if (user2 != null && (nickname = user2.getNickname()) != null) {
            str = nickname;
        }
        appCompatTextView.setText(str);
        if (Build.VERSION.SDK_INT >= 28) {
            getViewBinding().f86658z.setTextAppearance(R$style.newRoomPostTitleTextStyle);
            getViewBinding().f86654v.setTextAppearance(R$style.newRoomPostContentTextStyle);
        } else {
            getViewBinding().f86658z.setTypeface(getViewBinding().f86658z.getTypeface(), 0);
            getViewBinding().f86658z.setTextSize(AbstractC23384a.m92908b(12));
            getViewBinding().f86654v.setTypeface(getViewBinding().f86658z.getTypeface(), 1);
        }
        ViewGroup.LayoutParams layoutParams = getViewBinding().f86654v.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = AbstractC23384a.m92908b(4);
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final void m74808s0(View view) {
        PostSubjectItem postSubjectItem;
        if ((view == null || !C14557c.f51100a.m65671a(view.getId(), 500L)) && (postSubjectItem = this.mItem) != null) {
            String value = MediaType.VIDEO.getValue();
            Media media = postSubjectItem.getMedia();
            if (!TextUtils.equals(value, media != null ? media.getMediaType() : null)) {
                m74809t0(postSubjectItem);
                return;
            }
            DownloadBean downloadBeanM89360G = DownloadUtil.f68079a.m89360G(postSubjectItem);
            if (downloadBeanM89360G == null) {
                return;
            }
            DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
            String resourceId = downloadBeanM89360G.getResourceId();
            if (resourceId == null) {
                resourceId = "";
            }
            DownloadBean downloadBeanM88589q = downloadEsHelperM88598a.m88589q(resourceId);
            if (downloadBeanM88589q != null && downloadBeanM88589q.getStatus() == 5) {
                Navigator.m61845x(TheRouter.m61773c("/download/panel_activity").m61852F("extra_page_index", 0).m61857K("extra_target_resource_id", postSubjectItem.getPostId()), getContext(), null, 2, null);
                return;
            }
            AbstractC14567m.m65696c(R$string.shorts_click_download);
            getDownloadManager().mo88683o(downloadBeanM89360G);
            m74814y0();
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m74809t0(PostSubjectItem postItem) {
        C16768a c16768a = C16768a.f56378a;
        String pageName = getPageName();
        if (pageName == null) {
            pageName = "";
        }
        c16768a.m73074i(postItem, pageName, getPageFrom());
        if (Build.VERSION.SDK_INT >= 29) {
            PostSaveHelper.f57808a.m74905b(postItem);
            return;
        }
        Context context = getContext();
        if (context == null) {
            context = Utils.m27275a();
        }
        if (AbstractC2397b.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            Context context2 = getContext();
            if (context2 == null) {
                context2 = Utils.m27275a();
            }
            if (AbstractC2397b.checkSelfPermission(context2, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                PostSaveHelper.f57808a.m74905b(postItem);
                return;
            }
        }
        m74810u0();
    }

    /* JADX INFO: renamed from: u0 */
    private final void m74810u0() {
        FragmentActivity fragmentActivityM74765E = m74765E();
        if (fragmentActivityM74765E != null) {
            ActivityCompat.m11447g(fragmentActivityM74765E, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, FileHelper.f55226a.m71367l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m74811v0(PostExploreItemView postExploreItemView) {
        postExploreItemView.m74808s0(postExploreItemView.getViewBinding().f86628F);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: w0 */
    private final void m74812w0(View view) {
        ObjectAnimator objectAnimator = this.rotateAnimator;
        if (objectAnimator != null) {
            Intrinsics.m97799e(objectAnimator);
            if (objectAnimator.isRunning()) {
                return;
            }
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, 360.0f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.start();
        this.rotateAnimator = objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: x0 */
    private final void m74813x0(View view) {
        ObjectAnimator objectAnimator = this.rotateAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.rotateAnimator = null;
        view.setRotation(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public final void m74814y0() {
        String postId;
        AppCompatImageView appCompatImageView;
        PostSubjectItem postSubjectItem = this.mItem;
        if (postSubjectItem == null) {
            return;
        }
        String value = MediaType.VIDEO.getValue();
        Media media = postSubjectItem.getMedia();
        if (!TextUtils.equals(value, media != null ? media.getMediaType() : null) || (postId = postSubjectItem.getPostId()) == null || (appCompatImageView = getViewBinding().f86643k) == null) {
            return;
        }
        DownloadBean downloadBeanM88589q = DownloadEsHelper.f67591m.m88598a().m88589q(postId);
        if (downloadBeanM88589q == null) {
            m74813x0(appCompatImageView);
            appCompatImageView.setImageResource(R$drawable.ic_post_download_new);
            appCompatImageView.setEnabled(true);
            return;
        }
        int status = downloadBeanM88589q.getStatus();
        if (status == 1 || status == 2 || status == 3) {
            appCompatImageView.setImageResource(R$drawable.ic_post_downloading);
            appCompatImageView.setEnabled(false);
            m74812w0(appCompatImageView);
        } else if (status != 5) {
            m74813x0(appCompatImageView);
            appCompatImageView.setImageResource(R$drawable.ic_post_download_new);
            appCompatImageView.setEnabled(true);
        } else {
            m74813x0(appCompatImageView);
            appCompatImageView.setImageResource(R$drawable.ic_post_downloaded);
            appCompatImageView.setEnabled(true);
        }
    }

    @Override // com.transsion.postdetail.p306ui.view.PostBaseItemView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getDownloadManager().mo88675g(this.downloadListener);
        m74814y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDownloadManager().mo88686q(this.downloadListener);
    }

    @Override // com.transsion.postdetail.p306ui.view.PostBaseItemView
    public void setHeaderData(PostSubjectItem item) {
        Intrinsics.m97802h(item, "item");
        if (item.isRoomCache()) {
            getViewBinding().getRoot().setBackgroundColor(AbstractC2397b.getColor(getContext(), R$color.room_cache_item_bg_color));
        } else {
            getViewBinding().getRoot().setBackground(null);
        }
        m74807r0(item);
    }

    @Override // com.transsion.postdetail.p306ui.view.PostBaseItemView
    public void setSubjectAndRoomContent(PostSubjectItem item) {
        Intrinsics.m97802h(item, "item");
        this.mItem = item;
        m74814y0();
        m74766a0(new Function0() { // from class: com.transsion.postdetail.ui.view.p1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostExploreItemView.m74811v0(this.f57767a);
            }
        }, item);
        if (item.getSubject() == null) {
            setBottomSubjectAndRoomVisibility(false, false);
        } else {
            setBottomSubjectAndRoomVisibility(true, false);
            setBottomSubjectModuleData(item);
        }
    }
}
