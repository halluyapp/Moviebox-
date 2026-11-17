package com.transsion.moviedetail.activity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.integration.event.EventConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.moviedetail.activity.MoviePosterActivity;
import com.transsion.moviedetail.adapter.C15920a;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.ninegridview.ImageInfo;
import com.transsion.ninegridview.helper.FileHelper;
import com.transsion.ninegridview.preview.ImagePreviewActivity;
import com.transsion.web.R$string;
import com.transsion.web.share.ImageShareDialog;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23594b;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.C25220y0;
import mg.C25827d;
import p354dq.AbstractC23036a;
import p384en.C23197j;
import p550kj.C24655b;
import p550kj.C24662i;
import p765s6.InterfaceC27566d;
import p944yh.C28951b;
import sh.C27616c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0004JI\u0010\u0018\u001a\u00020\u000728\u0010\u0017\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, m97100d2 = {"Lcom/transsion/moviedetail/activity/MoviePosterActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lgn/b;", "<init>", "()V", "Lcom/transsion/moviedetailapi/bean/Subject;", "info", "", "s0", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "", "Lcom/transsion/moviedetailapi/bean/Staff;", "staffList", "t0", "(Ljava/util/List;)V", "l0", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "exit", "Ljava/io/File;", "imgFile", "callback", "saveToAlbum", "(Lkotlin/jvm/functions/Function2;)V", "imageShareClick", "Landroid/net/Uri;", "imageUri", "shareImage", "(Landroid/net/Uri;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "j0", "()Lgn/b;", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "isTranslucent", "()Z", "isStatusDark", "a", "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MoviePosterActivity extends BaseActivity<C23594b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX WARN: Multi-variable type inference failed */
    private final void imageShareClick() {
        ((C23594b) getMViewBinding()).f71891e.setEnabled(false);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        saveToAlbum(new Function2() { // from class: en.g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MoviePosterActivity.m70161k0(this.f70739a, jCurrentTimeMillis, ((Boolean) obj).booleanValue(), (File) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public static final Unit m70161k0(MoviePosterActivity moviePosterActivity, long j11, boolean z11, File file) {
        if (file != null) {
            Uri uriForFile = FileProvider.getUriForFile(moviePosterActivity, moviePosterActivity.getApplication().getPackageName() + ".download.fileprovider", file);
            Intrinsics.m97799e(uriForFile);
            moviePosterActivity.shareImage(uriForFile);
        } else {
            C13806h.f49015a.m62324k(R$string.share_failed_tips);
        }
        ((C23594b) moviePosterActivity.getMViewBinding()).f71891e.setEnabled(true);
        long jCurrentTimeMillis = System.currentTimeMillis() - j11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("share: 耗时=");
        sb2.append(jCurrentTimeMillis);
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    private final void m70162l0() {
        ((C23594b) getMViewBinding()).f71889c.setOnClickListener(new View.OnClickListener() { // from class: en.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoviePosterActivity.m70164n0(this.f70735a, view);
            }
        });
        ((C23594b) getMViewBinding()).f71890d.setOnClickListener(new View.OnClickListener() { // from class: en.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoviePosterActivity.m70165o0(this.f70736a, view);
            }
        });
        ((C23594b) getMViewBinding()).f71891e.setOnClickListener(new View.OnClickListener() { // from class: en.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoviePosterActivity.m70167q0(this.f70737a, view);
            }
        });
        ((C23594b) getMViewBinding()).f71888b.setOnClickListener(new View.OnClickListener() { // from class: en.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoviePosterActivity.m70163m0(this.f70738a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final void m70163m0(MoviePosterActivity moviePosterActivity, View view) {
        moviePosterActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m70164n0(MoviePosterActivity moviePosterActivity, View view) {
        Cover cover;
        Subject subject = moviePosterActivity.mMovieDetailBean;
        if (subject == null || (cover = subject.getCover()) == null) {
            return;
        }
        C14450a.f50860a.m65145h("movie_poster", "preview", (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.bigImageUrl = cover.getUrl();
        imageInfo.thumbnailUrl = cover.getThumbnail();
        Integer height = cover.getHeight();
        imageInfo.imageViewHeight = height != null ? height.intValue() : 0.0f;
        Integer width = cover.getWidth();
        imageInfo.imageViewWidth = width != null ? width.intValue() : 0.0f;
        ImagePreviewActivity.INSTANCE.m71396a(moviePosterActivity, 0, CollectionsKt.m97511q(imageInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final void m70165o0(MoviePosterActivity moviePosterActivity, View view) {
        C14450a.f50860a.m65145h("movie_poster", "save_picture", (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
        moviePosterActivity.saveToAlbum(new Function2() { // from class: en.i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MoviePosterActivity.m70166p0(((Boolean) obj).booleanValue(), (File) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final Unit m70166p0(boolean z11, File file) {
        if (z11) {
            C28951b.f88586a.m111454d(com.transsion.ninegridview.R$string.has_been_saved);
        } else {
            C28951b.f88586a.m111454d(com.transsion.ninegridview.R$string.image_save_success);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m70167q0(MoviePosterActivity moviePosterActivity, View view) {
        C14450a.f50860a.m65145h("movie_poster", "share", (60 & 4) != 0 ? "" : "", (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
        moviePosterActivity.imageShareClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final Unit m70168r0(MoviePosterActivity moviePosterActivity, C23197j it) {
        Intrinsics.m97802h(it, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PostEventPlayRecord: ");
        sb2.append(it);
        moviePosterActivity.m70169s0(it.m92275a());
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    private final void m70169s0(Subject info) {
        String url;
        if (info != null) {
            this.mMovieDetailBean = info;
            ((C23594b) getMViewBinding()).f71897k.setText(info.getTitle());
            ((C23594b) getMViewBinding()).f71896j.setText(info.getDescription());
            AppCompatImageView ivCover = ((C23594b) getMViewBinding()).f71889c;
            Intrinsics.m97801g(ivCover, "ivCover");
            Cover cover = info.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            AbstractC23036a.m91645c(ivCover, url, 0.0f, 2, null);
            m70170t0(info.getStaffList());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void saveToAlbum(Function2 callback) {
        Cover cover;
        FileHelper fileHelper = FileHelper.f55226a;
        C27616c.a aVar = C27616c.f84741a;
        AppCompatImageView ivCover = ((C23594b) getMViewBinding()).f71889c;
        Intrinsics.m97801g(ivCover, "ivCover");
        Bitmap bitmapM107447a = aVar.m107447a(ivCover);
        Subject subject = this.mMovieDetailBean;
        fileHelper.m71370r(this, bitmapM107447a, fileHelper.m71366j((subject == null || (cover = subject.getCover()) == null) ? null : cover.getUrl()), callback);
    }

    private final void shareImage(Uri imageUri) {
        try {
            if (getSupportFragmentManager().m14547k0("ImageShareDialog") != null) {
                return;
            }
            ImageShareDialog imageShareDialogM86743a = ImageShareDialog.INSTANCE.m86743a(imageUri);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
            imageShareDialogM86743a.show(supportFragmentManager, "ImageShareDialog");
        } catch (Exception unused) {
            C13806h.f49015a.m62324k(R$string.share_failed_tips);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    private final void m70170t0(final List staffList) {
        if (staffList == null) {
            return;
        }
        ((C23594b) getMViewBinding()).f71898l.setText(getString(com.transsion.moviedetail.R$string.starring) + "(" + staffList.size() + ")");
        ((C23594b) getMViewBinding()).f71893g.setLayoutManager(new LinearLayoutManager(this, 0, false));
        ((C23594b) getMViewBinding()).f71893g.addItemDecoration(new C25827d(AbstractC5776a0.m27313a(8.0f)));
        C15920a c15920a = new C15920a(staffList);
        c15920a.m36227w1(new InterfaceC27566d() { // from class: en.h
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                MoviePosterActivity.m70171u0(staffList, this, baseQuickAdapter, view, i11);
            }
        });
        ((C23594b) getMViewBinding()).f71893g.setAdapter(c15920a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m70171u0(List list, MoviePosterActivity moviePosterActivity, BaseQuickAdapter adapter, View view, int i11) {
        String staffId;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        HashMap map = new HashMap();
        map.put("module_name", "staff");
        map.put(EventConstants.KEY_SOURCE, C24662i.f75350a.m96877i());
        Staff staff = (Staff) CollectionsKt.m97362l0(list, i11);
        if (staff == null || (staffId = staff.getStaffId()) == null) {
            staffId = "";
        }
        map.put("related_staff_id", staffId);
        C14450a.f50860a.m65146i("movie_poster", map);
        Navigator navigatorM61773c = TheRouter.m61773c("/movie/staff");
        Object item = adapter.getItem(i11);
        Intrinsics.m97800f(item, "null cannot be cast to non-null type com.transsion.moviedetailapi.bean.Staff");
        Navigator.m61845x(navigatorM61773c.m61856J("staff", (Staff) item), moviePosterActivity, null, 2, null);
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C23594b getViewBinding() {
        C23594b c23594bM93352c = C23594b.m93352c(getLayoutInflater());
        Intrinsics.m97801g(c23594bM93352c, "inflate(...)");
        return c23594bM93352c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public C24655b newLogViewConfig() {
        return new C24655b("movie_poster", false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Function1 function1 = new Function1() { // from class: en.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoviePosterActivity.m70168r0(this.f70734a, (C23197j) obj);
            }
        };
        AbstractC24917a2 abstractC24917a2Mo98454r = C25220y0.m99269c().mo98454r();
        Lifecycle.State state = Lifecycle.State.STARTED;
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23197j.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, state, abstractC24917a2Mo98454r, true, function1);
        m70162l0();
        ViewGroup.LayoutParams layoutParams = ((C23594b) getMViewBinding()).f71888b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = AbstractC5781d.m27351c();
            ((C23594b) getMViewBinding()).f71888b.setLayoutParams(marginLayoutParams);
        }
    }
}
