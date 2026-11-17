package com.transsion.ugcvideodetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.ugcvideodetail.R$layout;
import com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment;
import com.transsion.ugcvideodetail.hepler.C20317h;
import com.transsion.ugcvideodetail.widget.UGCLocalVideoDetailInfoView;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.DownloadManagerApi;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p743rh.C27287m;
import p885wv.C28454n;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0018\u0010)\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/widget/UGCLocalVideoDetailInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "res", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "j", "()V", "m", "", "pageName", "setPageName", "(Ljava/lang/String;)V", "Lcom/transsion/ugcvideodetail/fragment/UGCVideoDetailBaseFragment;", "fragment", "setParentFragment", "(Lcom/transsion/ugcvideodetail/fragment/UGCVideoDetailBaseFragment;)V", "Lcom/transsion/baselib/db/download/DownloadBean;", "video", "setData", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "a", "Ljava/lang/String;", "TAG", "Lwv/n;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lwv/n;", "viewBinding", "c", "Lcom/transsion/baselib/db/download/DownloadBean;", "downloadBean", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "e", "Lcom/transsion/ugcvideodetail/fragment/UGCVideoDetailBaseFragment;", "parentFragment", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class UGCLocalVideoDetailInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28454n viewBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private DownloadBean downloadBean;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private UGCVideoDetailBaseFragment parentFragment;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UGCLocalVideoDetailInfoView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UGCLocalVideoDetailInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCLocalVideoDetailInfoView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.TAG = "ResPostDetailInfoView";
        View.inflate(context, R$layout.layout_ugc_local_video_detail_info, this);
        C28454n c28454nM109924a = C28454n.m109924a(this);
        Intrinsics.m97801g(c28454nM109924a, "bind(...)");
        this.viewBinding = c28454nM109924a;
        m84388j();
    }

    /* JADX INFO: renamed from: j */
    private final void m84388j() {
        this.viewBinding.f87370h.setOnClickListener(new View.OnClickListener() { // from class: yv.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCLocalVideoDetailInfoView.m84389k(this.f88753a, view);
            }
        });
        this.viewBinding.f87371i.setOnClickListener(new View.OnClickListener() { // from class: yv.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCLocalVideoDetailInfoView.m84390l(this.f88755a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m84389k(UGCLocalVideoDetailInfoView uGCLocalVideoDetailInfoView, View view) {
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_toast);
            return;
        }
        String str = uGCLocalVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h c20317h = C20317h.f64417a;
            DownloadBean downloadBean = uGCLocalVideoDetailInfoView.downloadBean;
            UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = uGCLocalVideoDetailInfoView.parentFragment;
            String trackId = uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null;
            UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment2 = uGCLocalVideoDetailInfoView.parentFragment;
            String previousTrackId = uGCVideoDetailBaseFragment2 != null ? uGCVideoDetailBaseFragment2.getPreviousTrackId() : null;
            UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment3 = uGCLocalVideoDetailInfoView.parentFragment;
            c20317h.m84105e(str, "details", downloadBean, trackId, previousTrackId, uGCVideoDetailBaseFragment3 != null ? uGCVideoDetailBaseFragment3.getPreviousPageVideoId() : null);
        }
        Navigator navigatorM61773c = TheRouter.m61773c("/ugc_video/detail");
        DownloadBean downloadBean2 = uGCLocalVideoDetailInfoView.downloadBean;
        Navigator navigatorM61857K = navigatorM61773c.m61857K("id", downloadBean2 != null ? downloadBean2.getUgcVideoId() : null);
        DownloadBean downloadBean3 = uGCLocalVideoDetailInfoView.downloadBean;
        Navigator navigatorM61857K2 = navigatorM61857K.m61857K("collection_id", downloadBean3 != null ? downloadBean3.getUgcVideoCollectionId() : null);
        DownloadBean downloadBean4 = uGCLocalVideoDetailInfoView.downloadBean;
        Navigator navigatorM61857K3 = navigatorM61857K2.m61857K("ops", downloadBean4 != null ? downloadBean4.getOps() : null).m61857K(WebConstants.PAGE_FROM, uGCLocalVideoDetailInfoView.pageName);
        DownloadBean downloadBean5 = uGCLocalVideoDetailInfoView.downloadBean;
        Navigator navigatorM61857K4 = navigatorM61857K3.m61857K("parent_video_id", downloadBean5 != null ? downloadBean5.getUgcVideoId() : null);
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment4 = uGCLocalVideoDetailInfoView.parentFragment;
        Navigator.m61845x(navigatorM61857K4.m61857K("parent_track_id", uGCVideoDetailBaseFragment4 != null ? uGCVideoDetailBaseFragment4.getTrackId() : null), uGCLocalVideoDetailInfoView.getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m84390l(UGCLocalVideoDetailInfoView uGCLocalVideoDetailInfoView, View view) {
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_toast);
            return;
        }
        String str = uGCLocalVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h c20317h = C20317h.f64417a;
            DownloadBean downloadBean = uGCLocalVideoDetailInfoView.downloadBean;
            UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = uGCLocalVideoDetailInfoView.parentFragment;
            String trackId = uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null;
            UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment2 = uGCLocalVideoDetailInfoView.parentFragment;
            String previousTrackId = uGCVideoDetailBaseFragment2 != null ? uGCVideoDetailBaseFragment2.getPreviousTrackId() : null;
            UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment3 = uGCLocalVideoDetailInfoView.parentFragment;
            c20317h.m84105e(str, "download", downloadBean, trackId, previousTrackId, uGCVideoDetailBaseFragment3 != null ? uGCVideoDetailBaseFragment3.getPreviousPageVideoId() : null);
        }
        uGCLocalVideoDetailInfoView.m84391m();
    }

    /* JADX INFO: renamed from: m */
    private final void m84391m() {
        Context context = getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        DownloadBean downloadBean = this.downloadBean;
        if (downloadBean == null || fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
        String ugcVideoCollectionId = downloadBean.getUgcVideoCollectionId();
        String ugcVideoId = downloadBean.getUgcVideoId();
        String ugcVideoCollectionName = downloadBean.getUgcVideoCollectionName();
        String ugcVideoType = downloadBean.getUgcVideoType();
        String str = this.pageName;
        String ops = downloadBean.getOps();
        String subjectId = downloadBean.getSubjectId();
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = this.parentFragment;
        String trackId = uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null;
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment2 = this.parentFragment;
        String previousTrackId = uGCVideoDetailBaseFragment2 != null ? uGCVideoDetailBaseFragment2.getPreviousTrackId() : null;
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment3 = this.parentFragment;
        downloadManagerApiM87093a.m87087f0(fragmentActivity, (7940 & 2) != 0 ? null : ugcVideoCollectionId, (7940 & 4) != 0 ? null : ugcVideoId, (7940 & 8) != 0 ? null : ugcVideoCollectionName, (7940 & 16) != 0 ? null : ugcVideoType, (7940 & 32) != 0 ? null : str, (7940 & 64) != 0 ? null : ops, (7940 & 128) != 0 ? null : subjectId, (7940 & 256) != 0 ? null : trackId, (7940 & 512) != 0 ? null : previousTrackId, (7940 & 1024) != 0 ? null : uGCVideoDetailBaseFragment3 != null ? uGCVideoDetailBaseFragment3.getPreviousPageVideoId() : null, (7940 & 2048) != 0 ? false : false, (7940 & 4096) == 0 ? null : null);
    }

    public final void setData(DownloadBean video) {
        Intrinsics.m97802h(video, "video");
        this.downloadBean = video;
        AppCompatTextView appCompatTextView = this.viewBinding.f87372j;
        String ugcVideoName = video.getUgcVideoName();
        if (ugcVideoName == null) {
            ugcVideoName = video.getName();
        }
        appCompatTextView.setText(ugcVideoName);
        if (!video.isInnerRes()) {
            Group groupDetails = this.viewBinding.f87366d;
            Intrinsics.m97801g(groupDetails, "groupDetails");
            AbstractC26006c.m102054g(groupDetails);
            Group groupDownload = this.viewBinding.f87367e;
            Intrinsics.m97801g(groupDownload, "groupDownload");
            AbstractC26006c.m102054g(groupDownload);
        }
        String cover = video.getCover();
        if (cover != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94468g = aVar.m94457m(context).m94468g(cover);
            ShapeableImageView ivAvatar = this.viewBinding.f87368f;
            Intrinsics.m97801g(ivAvatar, "ivAvatar");
            bVarM94468g.m94465d(ivAvatar);
        }
    }

    public final void setPageName(String pageName) {
        Intrinsics.m97802h(pageName, "pageName");
        this.pageName = pageName;
    }

    public final void setParentFragment(UGCVideoDetailBaseFragment fragment) {
        Intrinsics.m97802h(fragment, "fragment");
        this.parentFragment = fragment;
    }
}
