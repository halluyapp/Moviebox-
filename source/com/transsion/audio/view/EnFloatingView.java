package com.transsion.audio.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3224u;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.integration.webp.decoder.WebpDrawable;
import com.bumptech.glide.integration.webp.decoder.WebpDrawableTransformation;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.cloud.hisavana.sdk.common.util.AbstractC8112l;
import com.google.android.material.card.MaterialCardView;
import com.therouter.TheRouter;
import com.transsion.audio.R$id;
import com.transsion.audio.R$layout;
import com.transsion.audio.R$mipmap;
import com.transsion.audio.player.AudioPlayer;
import com.transsion.audio.viewmodel.HistoryListManager;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.C14492k;
import com.transsion.moviedetailapi.DownloadItem;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.bean.DownloadListBean;
import com.transsnet.downloader.manager.C21851p;
import java.util.ArrayList;
import java.util.List;
import p380ej.C23159d;
import p415fq.InterfaceC23410a;
import p436gj.AbstractC23579a;
import p648oj.AbstractC26235a;
import p944yh.C28951b;
import sh.C27621h;

/* JADX INFO: loaded from: classes5.dex */
public class EnFloatingView extends FloatingMagnetView implements View.OnClickListener {

    /* JADX INFO: renamed from: h */
    private final C23159d f50503h;

    /* JADX INFO: renamed from: i */
    private List f50504i;

    /* JADX INFO: renamed from: j */
    private int f50505j;

    /* JADX INFO: renamed from: k */
    private InterfaceC14262f f50506k;

    /* JADX INFO: renamed from: l */
    String f50507l;

    /* JADX INFO: renamed from: m */
    private Boolean f50508m;

    /* JADX INFO: renamed from: n */
    DownloadListBean f50509n;

    /* JADX INFO: renamed from: o */
    private final AbstractC26235a f50510o;

    /* JADX INFO: renamed from: com.transsion.audio.view.EnFloatingView$a */
    class C14257a extends AbstractC26235a {
        C14257a() {
        }

        @Override // p648oj.AbstractC26235a, p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: e */
        public void mo24050e(DownloadBean downloadBean, String str) {
            if (downloadBean.isVideo()) {
                return;
            }
            AudioBean audioBeanM64670m = C14266d.m64662k().m64670m();
            if (TextUtils.equals(audioBeanM64670m.getResourceId(), downloadBean.getResourceId()) && audioBeanM64670m.getUrl() != null && downloadBean.getPath() != null && audioBeanM64670m.getUrl().startsWith("http")) {
                audioBeanM64670m.setUrl(downloadBean.getPath());
                audioBeanM64670m.setChangeToLocalPath(true);
                HistoryListManager.f50535e.m64709b().m64700k(audioBeanM64670m);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.view.EnFloatingView$b */
    class AnimationAnimationListenerC14258b implements Animation.AnimationListener {
        AnimationAnimationListenerC14258b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            EnFloatingView.this.f50503h.f70643c.setVisibility(8);
            EnFloatingView.this.f50508m = Boolean.FALSE;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            EnFloatingView.this.f50508m = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.view.EnFloatingView$c */
    class AnimationAnimationListenerC14259c implements Animation.AnimationListener {
        AnimationAnimationListenerC14259c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            EnFloatingView.this.f50503h.f70642b.setVisibility(0);
            EnFloatingView enFloatingView = EnFloatingView.this;
            enFloatingView.setLayoutParams(enFloatingView.m64636q(true));
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.view.EnFloatingView$d */
    class AnimationAnimationListenerC14260d implements Animation.AnimationListener {
        AnimationAnimationListenerC14260d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            EnFloatingView.this.f50503h.f70643c.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.view.EnFloatingView$e */
    class AnimationAnimationListenerC14261e implements Animation.AnimationListener {
        AnimationAnimationListenerC14261e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            EnFloatingView.this.f50503h.f70642b.setVisibility(8);
            EnFloatingView enFloatingView = EnFloatingView.this;
            enFloatingView.setLayoutParams(enFloatingView.m64636q(false));
            EnFloatingView.this.f50508m = Boolean.FALSE;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            EnFloatingView.this.f50508m = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.view.EnFloatingView$f */
    interface InterfaceC14262f {
        /* JADX INFO: renamed from: a */
        void mo64646a(ViewGroup viewGroup);

        /* JADX INFO: renamed from: b */
        void mo64647b(ViewGroup viewGroup);
    }

    public EnFloatingView(@NonNull Context context) {
        this(context, R$layout.new_en_floating_view);
    }

    public EnFloatingView(@NonNull Context context, int i11) {
        super(context, null);
        this.f50504i = new ArrayList();
        this.f50505j = 0;
        this.f50508m = Boolean.FALSE;
        this.f50509n = null;
        this.f50510o = new C14257a();
        View.inflate(context, i11, this);
        this.f50503h = C23159d.m92206a((ConstraintLayout) findViewById(R$id.clRoot));
        m64637r();
        m64638s();
        setLayoutParams(m64636q(true));
    }

    /* JADX INFO: renamed from: A */
    private void m64628A() {
        if (this.f50503h == null) {
            return;
        }
        CenterInside centerInside = new CenterInside();
        Glide.with(getContext().getApplicationContext()).load(Integer.valueOf(R$mipmap.libui_audio_playing_2)).optionalTransform(centerInside).optionalTransform(WebpDrawable.class, new WebpDrawableTransformation(centerInside)).into(this.f50503h.f70647g);
        this.f50503h.f70648h.setImageResource(R$mipmap.ic_audio_ctl_play);
    }

    /* JADX INFO: renamed from: o */
    private void m64634o() {
        if (this.f50503h == null) {
            return;
        }
        AudioPlayer.C14244a c14244a = AudioPlayer.f50463i;
        if (c14244a.m64593a().m64573J()) {
            c14244a.m64593a().m64582T();
            this.f50503h.f70648h.setImageResource(R$mipmap.ic_audio_ctl_pause);
            return;
        }
        AudioBean audioBeanM64670m = C14266d.m64662k().m64670m();
        if (audioBeanM64670m.getIsChangeToLocalPath()) {
            audioBeanM64670m.setChangeToLocalPath(false);
            c14244a.m64593a().m64575L(audioBeanM64670m);
        } else {
            c14244a.m64593a().m64574K();
        }
        this.f50503h.f70648h.setImageResource(R$mipmap.ic_audio_ctl_play);
    }

    /* JADX INFO: renamed from: p */
    private int m64635p() {
        return (int) TypedValue.applyDimension(1, 80.0f, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public FrameLayout.LayoutParams m64636q(boolean z11) {
        FrameLayout.LayoutParams layoutParams = z11 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_START;
        layoutParams.setMargins(0, layoutParams.topMargin, layoutParams.rightMargin, m64635p());
        return layoutParams;
    }

    /* JADX INFO: renamed from: r */
    private void m64637r() {
        HistoryListManager.f50535e.m64709b().m64704r();
    }

    /* JADX INFO: renamed from: s */
    private void m64638s() {
        C23159d c23159d = this.f50503h;
        if (c23159d != null) {
            c23159d.f70648h.setOnClickListener(this);
            this.f50503h.f70646f.setOnClickListener(this);
            this.f50503h.f70645e.setOnClickListener(this);
            this.f50503h.f70649i.setOnClickListener(this);
            this.f50503h.f70643c.setOnClickListener(this);
        }
        C21851p.f67672a.m88759a(Utils.m27275a()).mo88675g(this.f50510o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m64639t(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f50504i = list;
        this.f50505j = 0;
        this.f50503h.f70646f.setImageResource(list.size() + (-1) > this.f50505j ? R$mipmap.ic_audio_next_enable : R$mipmap.ic_audio_next_disable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m64640u(DownloadListBean downloadListBean) {
        if (downloadListBean == null || downloadListBean.getItems() == null || downloadListBean.getItems().size() <= 0) {
            return;
        }
        this.f50509n = downloadListBean;
    }

    /* JADX INFO: renamed from: v */
    private void m64641v() {
        C23159d c23159d = this.f50503h;
        if (c23159d == null) {
            return;
        }
        c23159d.f70648h.setImageResource(R$mipmap.ic_audio_ctl_pause);
        this.f50503h.f70647g.setImageResource(R$mipmap.ic_audio_right);
    }

    /* JADX INFO: renamed from: w */
    private void m64642w() {
        DownloadListBean downloadListBean;
        AudioPlayer.f50463i.m64593a().m64582T();
        AudioBean audioBeanM64670m = C14266d.m64662k().m64670m();
        if (audioBeanM64670m == null || TextUtils.isEmpty(audioBeanM64670m.getSubjectId()) || (downloadListBean = this.f50509n) == null || downloadListBean.getItems().isEmpty()) {
            int size = this.f50504i.size() - 1;
            int i11 = this.f50505j;
            if (size > i11) {
                List list = this.f50504i;
                int i12 = i11 + 1;
                this.f50505j = i12;
                AudioBean audioBean = (AudioBean) list.get(i12);
                if (audioBean != null) {
                    ((InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0])).mo23880d(audioBean, true);
                    return;
                }
                return;
            }
            return;
        }
        List<DownloadItem> items = this.f50509n.getItems();
        int i13 = 0;
        while (true) {
            if (i13 >= items.size()) {
                i13 = -1;
                break;
            } else if (TextUtils.equals(audioBeanM64670m.getPostId(), items.get(i13).getPostId())) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 == -1 || i13 >= items.size() - 2) {
            return;
        }
        DownloadItem downloadItem = items.get(i13 + 1);
        String url = downloadItem.getUrl();
        String url2 = this.f50509n.getCover().getUrl();
        if (TextUtils.isEmpty(url)) {
            url = "";
        }
        ((InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0])).mo23880d(new AudioBean(url, url2, 0L, downloadItem.getSize(), downloadItem.getUrl(), downloadItem.getName(), "", 0, 0L, 0L, "", "", downloadItem.getResourceId(), downloadItem.getPostId(), this.f50509n.getSubjectId(), this.f50509n.getGroupId(), 0, "", downloadItem.getSe(), downloadItem.getEp()), true);
    }

    /* JADX INFO: renamed from: x */
    private void m64643x() {
        InterfaceC14262f interfaceC14262f = this.f50506k;
        if (interfaceC14262f != null) {
            interfaceC14262f.mo64646a(this);
        }
        AudioPlayer.f50463i.m64593a().m64585q();
        C21851p.f67672a.m88759a(Utils.m27275a()).mo88686q(this.f50510o);
    }

    /* JADX INFO: renamed from: y */
    private void m64644y(boolean z11) {
        String str;
        AudioBean audioBeanM64670m = C14266d.m64662k().m64670m();
        if (audioBeanM64670m == null || this.f50503h == null) {
            return;
        }
        try {
            String title = audioBeanM64670m.getTitle();
            if (TextUtils.isEmpty(title)) {
                title = audioBeanM64670m.getDesc();
            }
            this.f50503h.f70651k.setText(title);
            Long readProcess = audioBeanM64670m.getReadProcess();
            Long duration = audioBeanM64670m.getDuration();
            if (readProcess != null && duration != null) {
                if (z11) {
                    str = "00:00/00:00";
                } else {
                    str = AbstractC23579a.m93319a(readProcess.longValue()) + "/" + AbstractC23579a.m93319a(duration.longValue());
                }
                this.f50503h.f70652l.setText(str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: z */
    private void m64645z() {
        InterfaceC14262f interfaceC14262f = this.f50506k;
        if (interfaceC14262f != null) {
            interfaceC14262f.mo64647b(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.audio.view.FloatingMagnetView
    public void attach(Context context) {
        if (this.f50503h == null) {
            return;
        }
        HistoryListManager.C14268a c14268a = HistoryListManager.f50535e;
        c14268a.m64709b().m64703p().m14851j((InterfaceC3224u) context, new InterfaceC3189c0() { // from class: com.transsion.audio.view.a
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                this.f50523a.m64639t((List) obj);
            }
        });
        c14268a.m64709b().m64706v().m14851j((InterfaceC3224u) getContext(), new InterfaceC3189c0() { // from class: com.transsion.audio.view.b
            @Override // androidx.p1004lifecycle.InterfaceC3189c0
            public final void onChanged(Object obj) {
                this.f50524a.m64640u((DownloadListBean) obj);
            }
        });
        c14268a.m64709b().m64704r();
    }

    @Override // com.transsion.audio.view.FloatingMagnetView
    public void expanded() {
        C23159d c23159d = this.f50503h;
        if (c23159d == null) {
            return;
        }
        c23159d.f70643c.setVisibility(8);
        this.f50503h.f70642b.setVisibility(0);
        setLayoutParams(m64636q(true));
    }

    public void expandedAnimation() {
        if (this.f50503h == null || this.f50508m.booleanValue()) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC14258b());
        this.f50503h.f70643c.setAnimation(alphaAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(-C27621h.f84745a.m107455e(getContext()), 0.0f, 0.0f, 0.0f);
        translateAnimation.setAnimationListener(new AnimationAnimationListenerC14259c());
        translateAnimation.setDuration(300L);
        this.f50503h.f70642b.startAnimation(translateAnimation);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.startNow();
    }

    @Override // com.transsion.audio.view.FloatingMagnetView
    public boolean isPackUp() {
        C23159d c23159d = this.f50503h;
        return c23159d != null && c23159d.f70642b.getVisibility() == 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.iv_play) {
            m64634o();
            return;
        }
        if (view.getId() == R$id.iv_next) {
            m64642w();
            return;
        }
        if (view.getId() == R$id.iv_history) {
            m64645z();
        } else if (view.getId() == R$id.iv_remove) {
            m64643x();
        } else if (view.getId() == R$id.clPackUp) {
            expandedAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.transsion.audio.view.FloatingMagnetView
    public void onProgress(int i11) {
        C23159d c23159d = this.f50503h;
        if (c23159d == null) {
            return;
        }
        c23159d.f70650j.setProgress(i11);
        m64644y(false);
    }

    @Override // com.transsion.audio.view.FloatingMagnetView
    public void onSlideTheLeft() {
        packUpAnimation();
    }

    @Override // com.transsion.audio.view.FloatingMagnetView
    public void onStateChanged(int i11) {
        if (i11 == 3) {
            m64628A();
            return;
        }
        if (i11 == 4 || i11 == 5) {
            m64641v();
        } else {
            if (i11 != 6) {
                return;
            }
            m64641v();
            m64642w();
        }
    }

    @Override // com.transsion.audio.view.FloatingMagnetView
    public void onViewClick() {
        AudioBean audioBeanM64670m;
        Activity activityM65321o = C14492k.f50955a.m65321o();
        if (activityM65321o == null || activityM65321o.getClass().getSimpleName().contains("PostDetailActivity") || (audioBeanM64670m = C14266d.m64662k().m64670m()) == null) {
            return;
        }
        if (TextUtils.isEmpty(audioBeanM64670m.getPostId())) {
            C28951b.f88586a.m111455e("This page is unavailable");
        } else {
            TheRouter.m61773c("/post/detail").m61857K(WebConstants.PAGE_FROM, "audio_list").m61857K("id", audioBeanM64670m.getPostId()).m61857K("media_type", MediaType.AUDIO.getValue()).m61872z("from_comment", false).m61867r(getContext());
        }
    }

    @Override // com.transsion.audio.view.FloatingMagnetView
    public void packUp() {
        C23159d c23159d = this.f50503h;
        if (c23159d == null) {
            return;
        }
        c23159d.f70643c.setVisibility(0);
        this.f50503h.f70642b.setVisibility(8);
        setLayoutParams(m64636q(false));
    }

    @Override // com.transsion.audio.view.FloatingMagnetView
    public void packUpAnimation() {
        C23159d c23159d = this.f50503h;
        if (c23159d == null || c23159d.f70642b.getVisibility() == 8 || this.f50508m.booleanValue() || C14266d.m64662k().m64671o().booleanValue()) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC14260d());
        this.f50503h.f70643c.setAnimation(alphaAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -C27621h.f84745a.m107455e(getContext()), 0.0f, 0.0f);
        translateAnimation.setAnimationListener(new AnimationAnimationListenerC14261e());
        translateAnimation.setDuration(300L);
        this.f50503h.f70642b.startAnimation(translateAnimation);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.startNow();
    }

    @Override // com.transsion.audio.view.FloatingMagnetView
    public void prepare() {
        AudioBean audioBeanM64670m = C14266d.m64662k().m64670m();
        if (audioBeanM64670m == null || this.f50503h == null) {
            return;
        }
        this.f50507l = audioBeanM64670m.getCover();
        Long readProcess = audioBeanM64670m.getReadProcess();
        Long duration = audioBeanM64670m.getDuration();
        if (readProcess == null || duration == null) {
            return;
        }
        if (duration.longValue() <= 0) {
            duration = 1L;
        }
        this.f50503h.f70650j.setProgress(AbstractC8112l.m37944a((readProcess.longValue() / duration.longValue()) * 100));
        this.f50503h.f70646f.setImageResource(this.f50504i.size() - 1 > this.f50505j ? R$mipmap.ic_audio_next_enable : R$mipmap.ic_audio_next_disable);
        m64644y(true);
    }

    @Override // com.transsion.audio.view.FloatingMagnetView
    public void setOnOptionListener(InterfaceC14262f interfaceC14262f) {
        this.f50506k = interfaceC14262f;
    }
}
