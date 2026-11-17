package com.transsion.postdetail.test;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.moviedetailapi.bean.GifBean;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.player.config.RenderType;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.p1003enum.ScaleMode;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$layout;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.C25832i;
import p683po.C26906c;
import p683po.C26907d;
import p815un.C28026a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m97100d2 = {"Lcom/transsion/postdetail/test/TestActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "R", "initPlayer", "S", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "json", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/transsion/postdetail/test/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/postdetail/test/a;", "mAdapter", "e", "videoUrl", "Lcom/transsion/player/orplayer/g;", "f", "Lcom/transsion/player/orplayer/g;", "mPlayer", "Lun/a;", "g", "Lun/a;", "mItemChange", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class TestActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private RecyclerView recyclerView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C16953a mAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC16634g mPlayer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C28026a mItemChange;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = TestActivity.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String json = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String videoUrl = "https://test-acdn.aoneroom.com/media/video/2022/08/11/5970c1ffed2920c3b2d80da029fe3944-sd.mp4";

    /* JADX INFO: renamed from: com.transsion.postdetail.test.TestActivity$a */
    public static final class C16951a implements InterfaceC16633f {
        C16951a() {
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
            InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void initPlayer() {
            InterfaceC16633f.a.m72424b(this);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
            InterfaceC16633f.a.m72425c(this, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onBufferedPosition(long j11, C23403e c23403e) {
            InterfaceC16633f.a.m72426d(this, j11, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onCompletion(C23403e c23403e) {
            InterfaceC16633f.a.m72427e(this, c23403e);
            C28026a c28026a = TestActivity.this.mItemChange;
            if (c28026a != null) {
                c28026a.m108979q();
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onFocusChange(boolean z11) {
            InterfaceC16633f.a.m72429g(this, z11);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onIsPlayingChanged(boolean z11) {
            InterfaceC16633f.a.m72430h(this, z11);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onLoadingBegin(C23403e c23403e) {
            InterfaceC16633f.a.m72431i(this, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onLoadingEnd(C23403e c23403e) {
            InterfaceC16633f.a.m72433k(this, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
            InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
            C26866a.a aVar = C26866a.f81698a;
            String str = TestActivity.this.TAG;
            Intrinsics.m97801g(str, "access$getTAG$p(...)");
            C26866a.a.m104898f(aVar, str, "percent=" + i11, false, 4, null);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onLoopingStart() {
            InterfaceC16633f.a.m72437o(this);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onMediaItemTransition(String str) {
            InterfaceC16633f.a.m72438p(this, str);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onPlayError(PlayError errorInfo, C23403e c23403e) {
            Intrinsics.m97802h(errorInfo, "errorInfo");
            InterfaceC16633f.a.m72439q(this, errorInfo, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onPlayerRelease(C23403e c23403e) {
            InterfaceC16633f.a.m72442t(this, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onPlayerReset() {
            InterfaceC16633f.a.m72444v(this);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onPrepare(C23403e c23403e) {
            InterfaceC16633f.a.m72445w(this, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onProgress(long j11, C23403e c23403e) {
            InterfaceC16633f.a.m72447y(this, j11, c23403e);
            C26866a.a aVar = C26866a.f81698a;
            String str = TestActivity.this.TAG;
            Intrinsics.m97801g(str, "access$getTAG$p(...)");
            C26866a.a.m104898f(aVar, str, "process=" + j11, false, 4, null);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onRenderFirstFrame() {
            C26866a.a aVar = C26866a.f81698a;
            String str = TestActivity.this.TAG;
            Intrinsics.m97801g(str, "access$getTAG$p(...)");
            C26866a.a.m104898f(aVar, str, "onRenderFirstFrame", false, 4, null);
            C28026a c28026a = TestActivity.this.mItemChange;
            if (c28026a != null) {
                c28026a.m108978p();
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onSetDataSource() {
            InterfaceC16633f.a.m72413B(this);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onTracksAudioBitrateChange(int i11) {
            InterfaceC16633f.a.m72414C(this, i11);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onTracksChange(C26906c c26906c) {
            InterfaceC16633f.a.m72415D(this, c26906c);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onTracksVideoBitrateChange(int i11) {
            InterfaceC16633f.a.m72416E(this, i11);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onVideoPause(C23403e c23403e) {
            InterfaceC16633f.a.m72417F(this, c23403e);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onVideoSizeChanged(int i11, int i12) {
            InterfaceC16633f.a.m72419H(this, i11, i12);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void onVideoStart(C23403e c23403e) {
            InterfaceC16633f.a.m72420I(this, c23403e);
            C26866a.a aVar = C26866a.f81698a;
            String str = TestActivity.this.TAG;
            Intrinsics.m97801g(str, "access$getTAG$p(...)");
            C26866a.a.m104898f(aVar, str, "onVideoStart", false, 4, null);
        }

        @Override // com.transsion.player.orplayer.InterfaceC16633f
        public void setOnSeekCompleteListener() {
            InterfaceC16633f.a.m72422K(this);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.test.TestActivity$b */
    public static final class C16952b extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        private int f56879a;

        /* JADX INFO: renamed from: b */
        private int f56880b;

        C16952b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            C16953a c16953a;
            List<Object> data;
            List<Object> data2;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                throw new RuntimeException("Unsupported layoutManager.");
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.f56879a = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            this.f56880b = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            C28026a c28026a = TestActivity.this.mItemChange;
            int iM108971b = c28026a != null ? c28026a.m108971b() : 0;
            boolean z11 = iM108971b < iFindFirstVisibleItemPosition || iM108971b > iFindLastVisibleItemPosition;
            if (linearLayoutManager.getChildCount() <= 0 || (c16953a = TestActivity.this.mAdapter) == null || (data = c16953a.getData()) == null || !(!data.isEmpty()) || !z11) {
                return;
            }
            View childAt = linearLayoutManager.getChildAt(i12 < 0 ? linearLayoutManager.getChildCount() - 1 : 0);
            if (childAt != null) {
                int position = linearLayoutManager.getPosition(childAt);
                C16953a c16953a2 = TestActivity.this.mAdapter;
                PostSubjectItem postSubjectItem = (c16953a2 == null || (data2 = c16953a2.getData()) == null) ? null : (PostSubjectItem) data2.get(position);
                C28026a c28026a2 = TestActivity.this.mItemChange;
                if (c28026a2 != null) {
                    c28026a2.m108981s(postSubjectItem, childAt, position);
                }
            }
        }
    }

    /* JADX INFO: renamed from: R */
    private final void m73825R() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 21; i11++) {
            ArrayList arrayList2 = new ArrayList();
            Image image = new Image(200, 2000, "https://cdn.shalltry.com/tcmservice/tcmservice/111630622592760357.jpg", 200, null, null, new GifBean("https://test-acdn.aoneroom.com/image/2022/08/16/61e43091d911c7e773efd9189332fadb.webp", "https://test-acdn.aoneroom.com/media/video/2022/08/11/5970c1ffed2920c3b2d80da029fe3944-sd.mp4"), null, null, 0.0f, 0.0f, 0, 0, 0, 16256, null);
            int i12 = i11 % 9;
            if (i12 >= 0) {
                while (true) {
                    arrayList2.add(image);
                    int i13 = i13 != i12 ? i13 + 1 : 0;
                }
            }
            arrayList.add(new PostSubjectItem(null, null, null, null, null, null, new Media(null, null, null, arrayList2, MediaType.IMAGE.getValue(), null, null), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, false, false, false, null, -524288, 1, null));
        }
        this.mAdapter = new C16953a(arrayList);
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.recycler_view);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.addItemDecoration(new C25832i(200, 0, 2, null));
            recyclerView.setAdapter(this.mAdapter);
        } else {
            recyclerView = null;
        }
        this.recyclerView = recyclerView;
    }

    /* JADX INFO: renamed from: S */
    private final void m73826S() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new C16952b());
        }
    }

    private final void initPlayer() {
        ORPlayerView oRPlayerView = new ORPlayerView(this, RenderType.TEXTURE_VIEW);
        InterfaceC16634g interfaceC16634gM72449a = new InterfaceC16634g.a(this).m72449a();
        interfaceC16634gM72449a.setTextureView(oRPlayerView.getTextureView());
        interfaceC16634gM72449a.setScaleMode(ScaleMode.SCALE_ASPECT_FILL);
        this.mItemChange = new C28026a(interfaceC16634gM72449a, oRPlayerView);
        interfaceC16634gM72449a.setPlayerListener(new C16951a());
        this.mPlayer = interfaceC16634gM72449a;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_test);
        m73825R();
        initPlayer();
        m73826S();
    }
}
