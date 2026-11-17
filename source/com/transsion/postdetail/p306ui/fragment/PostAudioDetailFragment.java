package com.transsion.postdetail.p306ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.app.NotificationCompat;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import ck.C5127x;
import com.google.android.material.appbar.AppBarLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$mipmap;
import com.therouter.TheRouter;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.transsion.moviedetailapi.bean.Audio;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.PlayError;
import com.transsion.postdetail.R$dimen;
import com.transsion.postdetail.R$drawable;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.postdetail.util.AbstractC17443m;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p415fq.InterfaceC23410a;
import p415fq.InterfaceC23411b;
import p462hj.C23860f;
import p683po.C26906c;
import p683po.C26907d;
import p844vo.C28164n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0005J!\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010 J\u0019\u0010\"\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u0005J\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\u0005R\u0018\u0010'\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u00100\u001a\u0004\u0018\u00010+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00105\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108¨\u0006>"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/PostAudioDetailFragment;", "Lcom/transsion/postdetail/ui/fragment/PostDetailCommonFragment;", "Lcom/transsion/player/orplayer/f;", "Lfq/b$a;", "<init>", "()V", "", "id", "Lcom/transsion/baselib/db/audio/AudioBean;", "audioBean", "", "q1", "(Ljava/lang/String;Lcom/transsion/baselib/db/audio/AudioBean;)V", "r1", "", NotificationCompat.CATEGORY_PROGRESS, "s1", "(J)V", "l1", "n1", "m1", "getPageName", "()Ljava/lang/String;", "G0", "initAudioListener", "F0", "onDestroy", "Lfo/e;", "mediaSource", "onProgress", "(JLfo/e;)V", "onVideoStart", "(Lfo/e;)V", "onVideoPause", "onCompletion", "onRemove", "p1", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/baselib/db/audio/AudioBean;", "mAudioBean", "l", "J", "realDuration", "Lfq/a;", "m", "Lkotlin/Lazy;", "getMAudioApi", "()Lfq/a;", "mAudioApi", "Lfq/b;", "n", "getMFloatApi", "()Lfq/b;", "mFloatApi", "", "o", "Z", "dealWith80", TtmlNode.TAG_P, "dealWithElse", CampaignEx.JSON_KEY_AD_Q, "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PostAudioDetailFragment extends PostDetailCommonFragment implements InterfaceC16633f, InterfaceC23411b.a {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private AudioBean mAudioBean;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long realDuration;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy mAudioApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.d1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostAudioDetailFragment.mAudioApi_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final Lazy mFloatApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.e1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostAudioDetailFragment.m74279o1();
        }
    });

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean dealWith80;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean dealWithElse;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostAudioDetailFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final PostAudioDetailFragment m74286a(String str, boolean z11, String str2, PostSubjectItem postSubjectItem) {
            PostAudioDetailFragment postAudioDetailFragment = new PostAudioDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putBoolean("from_comment", z11);
            bundle.putString("rec_ops", str2);
            postAudioDetailFragment.setArguments(bundle);
            return postAudioDetailFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostAudioDetailFragment$b */
    public static final class C17031b implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Ref.LongRef f57193a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ PostAudioDetailFragment f57194b;

        C17031b(Ref.LongRef longRef, PostAudioDetailFragment postAudioDetailFragment) {
            this.f57193a = longRef;
            this.f57194b = postAudioDetailFragment;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
            if (z11) {
                this.f57193a.element = (long) (this.f57194b.realDuration * ((long) 1000) * (i11 / 100));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            InterfaceC23410a mAudioApi = this.f57194b.getMAudioApi();
            if (mAudioApi != null) {
                mAudioApi.seekTo(this.f57193a.element);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC23410a getMAudioApi() {
        return (InterfaceC23410a) this.mAudioApi.getValue();
    }

    private final InterfaceC23411b getMFloatApi() {
        return (InterfaceC23411b) this.mFloatApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final void m74274j1(float f11, PostAudioDetailFragment postAudioDetailFragment, AppBarLayout appBarLayout, int i11) {
        if (i11 == 0 || Math.abs(i11) >= appBarLayout.getTotalScrollRange()) {
            return;
        }
        if (Math.abs(i11) <= f11) {
            if (postAudioDetailFragment.dealWithElse) {
                return;
            }
            postAudioDetailFragment.dealWithElse = true;
            postAudioDetailFragment.dealWith80 = false;
            postAudioDetailFragment.m74281r1();
            return;
        }
        if (postAudioDetailFragment.dealWith80) {
            return;
        }
        postAudioDetailFragment.dealWith80 = true;
        postAudioDetailFragment.dealWithElse = false;
        C28164n mViewBinding = postAudioDetailFragment.getMViewBinding();
        if (mViewBinding != null) {
            if (C5127x.f17620a.m23969a()) {
                mViewBinding.f86556u.setBackgroundResource(R$color.bg_01);
                mViewBinding.f86550o.setImageResource(R$mipmap.icon_white_back);
                mViewBinding.f86533A.setTextColor(AbstractC2397b.getColor(postAudioDetailFragment.requireActivity(), R$color.cl38));
            } else {
                mViewBinding.f86556u.setBackgroundResource(R$color.bg_01);
                mViewBinding.f86550o.setImageResource(R$mipmap.libui_ic_back_black);
                mViewBinding.f86533A.setTextColor(AbstractC2397b.getColor(postAudioDetailFragment.requireActivity(), R$color.text_01));
                mViewBinding.f86556u.setBackgroundResource(R$color.white);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final void m74275k1(PostAudioDetailFragment postAudioDetailFragment, AppCompatImageView appCompatImageView, View view) {
        InterfaceC23410a mAudioApi;
        InterfaceC23410a mAudioApi2;
        InterfaceC23410a mAudioApi3;
        AudioBean audioBean = postAudioDetailFragment.mAudioBean;
        if (audioBean == null) {
            InterfaceC23410a mAudioApi4 = postAudioDetailFragment.getMAudioApi();
            if (mAudioApi4 != null && mAudioApi4.mo23882f()) {
                InterfaceC23410a mAudioApi5 = postAudioDetailFragment.getMAudioApi();
                if (mAudioApi5 != null) {
                    mAudioApi5.pause();
                }
                appCompatImageView.setImageResource(R$drawable.post_icon_pro_play);
                C16768a.m73063t(C16768a.f56378a, postAudioDetailFragment.getMPostDetailBean(), postAudioDetailFragment.getPageName(), null, 4, null);
                return;
            }
            InterfaceC23410a mAudioApi6 = postAudioDetailFragment.getMAudioApi();
            if (mAudioApi6 == null || !mAudioApi6.mo23879c()) {
                InterfaceC23410a mAudioApi7 = postAudioDetailFragment.getMAudioApi();
                if (mAudioApi7 != null) {
                    mAudioApi7.prepare();
                }
            } else {
                AudioBean audioBean2 = postAudioDetailFragment.mAudioBean;
                if (audioBean2 != null && (mAudioApi = postAudioDetailFragment.getMAudioApi()) != null) {
                    InterfaceC23410a.a.m92962a(mAudioApi, audioBean2, false, 2, null);
                }
            }
            appCompatImageView.setImageResource(R$drawable.post_icon_pro_pause);
            C16768a.m73064v(C16768a.f56378a, postAudioDetailFragment.getMPostDetailBean(), postAudioDetailFragment.getPageName(), null, 4, null);
            return;
        }
        InterfaceC23410a mAudioApi8 = postAudioDetailFragment.getMAudioApi();
        boolean zMo23878b = mAudioApi8 != null ? mAudioApi8.mo23878b(audioBean) : false;
        InterfaceC23411b mFloatApi = postAudioDetailFragment.getMFloatApi();
        if (mFloatApi != null) {
            mFloatApi.mo23884a(new WeakReference(postAudioDetailFragment.getActivity()), audioBean);
        }
        if (!zMo23878b) {
            AudioBean audioBean3 = postAudioDetailFragment.mAudioBean;
            if (audioBean3 != null && (mAudioApi2 = postAudioDetailFragment.getMAudioApi()) != null) {
                InterfaceC23410a.a.m92962a(mAudioApi2, audioBean3, false, 2, null);
            }
            appCompatImageView.setImageResource(R$drawable.post_icon_pro_pause);
            C16768a.m73064v(C16768a.f56378a, postAudioDetailFragment.getMPostDetailBean(), postAudioDetailFragment.getPageName(), null, 4, null);
            return;
        }
        InterfaceC23410a mAudioApi9 = postAudioDetailFragment.getMAudioApi();
        if (mAudioApi9 != null && mAudioApi9.mo23882f()) {
            InterfaceC23410a mAudioApi10 = postAudioDetailFragment.getMAudioApi();
            if (mAudioApi10 != null) {
                mAudioApi10.pause();
            }
            appCompatImageView.setImageResource(R$drawable.post_icon_pro_play);
            C16768a.m73063t(C16768a.f56378a, postAudioDetailFragment.getMPostDetailBean(), postAudioDetailFragment.getPageName(), null, 4, null);
            return;
        }
        InterfaceC23410a mAudioApi11 = postAudioDetailFragment.getMAudioApi();
        if (mAudioApi11 == null || !mAudioApi11.mo23879c()) {
            InterfaceC23410a mAudioApi12 = postAudioDetailFragment.getMAudioApi();
            if (mAudioApi12 != null) {
                mAudioApi12.prepare();
            }
        } else {
            AudioBean audioBean4 = postAudioDetailFragment.mAudioBean;
            if (audioBean4 != null && (mAudioApi3 = postAudioDetailFragment.getMAudioApi()) != null) {
                InterfaceC23410a.a.m92962a(mAudioApi3, audioBean4, false, 2, null);
            }
        }
        appCompatImageView.setImageResource(R$drawable.post_icon_pro_pause);
        C16768a.m73064v(C16768a.f56378a, postAudioDetailFragment.getMPostDetailBean(), postAudioDetailFragment.getPageName(), null, 4, null);
    }

    /* JADX INFO: renamed from: l1 */
    private final void m74276l1() {
        Media media;
        List<Audio> audio;
        Group group;
        Subject subject;
        Subject subject2;
        PostSubjectItem mPostDetailBean = getMPostDetailBean();
        if (mPostDetailBean == null || (media = mPostDetailBean.getMedia()) == null || (audio = media.getAudio()) == null || audio.size() <= 0) {
            return;
        }
        Audio audio2 = audio.get(0);
        Long duration = audio2.getDuration();
        this.realDuration = duration != null ? duration.longValue() : 0L;
        String url = audio2.getUrl();
        if (url == null) {
            url = "";
        }
        String str = url;
        PostSubjectItem mPostDetailBean2 = getMPostDetailBean();
        String coverUrl$default = mPostDetailBean2 != null ? PostSubjectItem.getCoverUrl$default(mPostDetailBean2, false, 1, null) : null;
        Long duration2 = audio2.getDuration();
        Integer size = audio2.getSize();
        Long lValueOf = size != null ? Long.valueOf(size.intValue()) : null;
        String url2 = audio2.getUrl();
        PostSubjectItem mPostDetailBean3 = getMPostDetailBean();
        String title = mPostDetailBean3 != null ? mPostDetailBean3.getTitle() : null;
        PostSubjectItem mPostDetailBean4 = getMPostDetailBean();
        String content = mPostDetailBean4 != null ? mPostDetailBean4.getContent() : null;
        Integer bitrate = audio2.getBitrate();
        PostSubjectItem mPostDetailBean5 = getMPostDetailBean();
        String rec_ops = mPostDetailBean5 != null ? mPostDetailBean5.getRec_ops() : null;
        PostSubjectItem mPostDetailBean6 = getMPostDetailBean();
        String postId = mPostDetailBean6 != null ? mPostDetailBean6.getPostId() : null;
        PostSubjectItem mPostDetailBean7 = getMPostDetailBean();
        String subjectId = (mPostDetailBean7 == null || (subject2 = mPostDetailBean7.getSubject()) == null) ? null : subject2.getSubjectId();
        PostSubjectItem mPostDetailBean8 = getMPostDetailBean();
        String title2 = (mPostDetailBean8 == null || (subject = mPostDetailBean8.getSubject()) == null) ? null : subject.getTitle();
        PostSubjectItem mPostDetailBean9 = getMPostDetailBean();
        AudioBean audioBean = new AudioBean(str, coverUrl$default, duration2, lValueOf, url2, title, content, bitrate, null, null, null, rec_ops, null, postId, subjectId, (mPostDetailBean9 == null || (group = mPostDetailBean9.getGroup()) == null) ? null : group.getGroupId(), 0, title2, 0, 0, 857856, null);
        this.mAudioBean = audioBean;
        InterfaceC23411b mFloatApi = getMFloatApi();
        if (mFloatApi != null) {
            mFloatApi.mo23884a(new WeakReference(getActivity()), audioBean);
        }
        InterfaceC23411b mFloatApi2 = getMFloatApi();
        if (mFloatApi2 != null) {
            mFloatApi2.mo23891h();
        }
        InterfaceC23411b mFloatApi3 = getMFloatApi();
        if (mFloatApi3 != null) {
            mFloatApi3.mo23885b(this);
        }
        InterfaceC23410a mAudioApi = getMAudioApi();
        if (mAudioApi != null) {
            InterfaceC23410a.a.m92962a(mAudioApi, audioBean, false, 2, null);
        }
        C16768a.m73056b(C16768a.f56378a, getMPostDetailBean(), getPageName(), null, 4, null);
    }

    /* JADX INFO: renamed from: m1 */
    private final void m74277m1() {
        AppCompatSeekBar appCompatSeekBar;
        Ref.LongRef longRef = new Ref.LongRef();
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding == null || (appCompatSeekBar = mViewBinding.f86540e) == null) {
            return;
        }
        appCompatSeekBar.setOnSeekBarChangeListener(new C17031b(longRef, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23410a mAudioApi_delegate$lambda$0() {
        return (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: n1 */
    private final void m74278n1() {
        String thumbnail;
        Integer width;
        String url;
        AppCompatImageView appCompatImageView;
        Media media;
        Subject subject;
        Cover cover;
        Subject subject2;
        Cover cover2;
        Subject subject3;
        Cover cover3;
        Subject subject4;
        Cover cover4;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        PostSubjectItem mPostDetailBean = getMPostDetailBean();
        Integer height = null;
        if (TextUtils.isEmpty(mPostDetailBean != null ? PostSubjectItem.getCoverUrl$default(mPostDetailBean, false, 1, null) : null)) {
            C28164n mViewBinding = getMViewBinding();
            if (mViewBinding != null && (appCompatImageView3 = mViewBinding.f86551p) != null) {
                appCompatImageView3.setImageResource(com.transsion.baseui.R$mipmap.default_audio_ic_9_16);
            }
            C28164n mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (appCompatImageView2 = mViewBinding2.f86548m) == null) {
                return;
            }
            AbstractC26006c.m102054g(appCompatImageView2);
            return;
        }
        PostSubjectItem mPostDetailBean2 = getMPostDetailBean();
        if (mPostDetailBean2 == null || (media = mPostDetailBean2.getMedia()) == null) {
            thumbnail = "";
            width = 0;
            height = null;
            url = thumbnail;
        } else {
            Cover cover5 = media.getCover();
            url = cover5 != null ? cover5.getUrl() : null;
            Cover cover6 = media.getCover();
            thumbnail = cover6 != null ? cover6.getThumbnail() : null;
            Cover cover7 = media.getCover();
            Integer width2 = cover7 != null ? cover7.getWidth() : null;
            Cover cover8 = media.getCover();
            Integer height2 = cover8 != null ? cover8.getHeight() : null;
            if (TextUtils.isEmpty(url)) {
                PostSubjectItem mPostDetailBean3 = getMPostDetailBean();
                url = (mPostDetailBean3 == null || (subject4 = mPostDetailBean3.getSubject()) == null || (cover4 = subject4.getCover()) == null) ? null : cover4.getUrl();
                PostSubjectItem mPostDetailBean4 = getMPostDetailBean();
                thumbnail = (mPostDetailBean4 == null || (subject3 = mPostDetailBean4.getSubject()) == null || (cover3 = subject3.getCover()) == null) ? null : cover3.getThumbnail();
                PostSubjectItem mPostDetailBean5 = getMPostDetailBean();
                width = (mPostDetailBean5 == null || (subject2 = mPostDetailBean5.getSubject()) == null || (cover2 = subject2.getCover()) == null) ? null : cover2.getWidth();
                PostSubjectItem mPostDetailBean6 = getMPostDetailBean();
                if (mPostDetailBean6 != null && (subject = mPostDetailBean6.getSubject()) != null && (cover = subject.getCover()) != null) {
                    height = cover.getHeight();
                }
            } else {
                height = height2;
                width = width2;
            }
        }
        C28164n mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (appCompatImageView = mViewBinding3.f86551p) == null) {
            return;
        }
        C23860f.a aVar = C23860f.f72909a;
        Context context = appCompatImageView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        C23860f.b bVarM94457m = aVar.m94457m(context);
        if (url == null) {
            url = "";
        }
        bVarM94457m.m94468g(url).m94470i(R$color.cl37).m94474m(width != null ? width.intValue() : aVar.m94454c()).m94464c(height != null ? height.intValue() : aVar.m94454c()).m94473l(thumbnail != null ? thumbnail : "").m94465d(appCompatImageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final InterfaceC23411b m74279o1() {
        return (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0]);
    }

    /* JADX INFO: renamed from: q1 */
    private final void m74280q1(String id2, AudioBean audioBean) {
        Intent intent = new Intent();
        intent.putExtra(MimeTypes.BASE_TYPE_AUDIO, audioBean);
        intent.putExtra("id", id2);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
    }

    /* JADX INFO: renamed from: r1 */
    private final void m74281r1() {
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f86550o.setImageResource(R$mipmap.icon_white_back);
            mViewBinding.f86533A.setTextColor(AbstractC2397b.getColor(requireActivity(), R$color.cl38));
            mViewBinding.f86556u.setBackgroundResource(com.p282tn.lib.widget.R$drawable.libui_mask_cl45_0p_to_30p);
        }
    }

    /* JADX INFO: renamed from: s1 */
    private final void m74282s1(long progress) {
        AppCompatImageView appCompatImageView;
        TextView textView;
        AppCompatSeekBar appCompatSeekBar;
        AppCompatSeekBar appCompatSeekBar2;
        long j11 = this.realDuration * ((long) 1000);
        int i11 = (int) ((progress / j11) * 100);
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatSeekBar2 = mViewBinding.f86540e) != null) {
            appCompatSeekBar2.setProgress(i11);
        }
        C28164n mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatSeekBar = mViewBinding2.f86540e) != null) {
            appCompatSeekBar.setProgress(i11);
        }
        String str = AbstractC17443m.m74969d(progress) + "/" + AbstractC17443m.m74969d(j11);
        C28164n mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (textView = mViewBinding3.f86537b) != null) {
            textView.setText(str);
        }
        C28164n mViewBinding4 = getMViewBinding();
        if (mViewBinding4 == null || (appCompatImageView = mViewBinding4.f86539d) == null) {
            return;
        }
        appCompatImageView.setImageResource(R$drawable.post_icon_pro_pause);
    }

    @Override // com.transsion.postdetail.p306ui.fragment.PostDetailCommonFragment
    /* JADX INFO: renamed from: F0 */
    public void mo74283F0() {
        View view;
        Media media;
        List<Audio> audio;
        AppCompatImageView appCompatImageView;
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatImageView = mViewBinding.f86551p) != null) {
            AbstractC26006c.m102058k(appCompatImageView);
        }
        PostSubjectItem mPostDetailBean = getMPostDetailBean();
        if (mPostDetailBean != null && (media = mPostDetailBean.getMedia()) != null && (audio = media.getAudio()) != null && (!audio.isEmpty())) {
            m74276l1();
            m74278n1();
        }
        C28164n mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (view = mViewBinding2.f86535C) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.transsion.postdetail.p306ui.fragment.PostDetailCommonFragment
    /* JADX INFO: renamed from: G0 */
    public void mo74284G0() {
        AppBarLayout appBarLayout;
        androidx.constraintlayout.widget.Group group;
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (group = mViewBinding.f86547l) != null) {
            group.setVisibility(0);
        }
        m74281r1();
        final float dimension = getResources().getDimension(R$dimen.post_surface_height);
        C28164n mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (appBarLayout = mViewBinding2.f86541f) == null) {
            return;
        }
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.InterfaceC9956g() { // from class: com.transsion.postdetail.ui.fragment.b1
            @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC9951b
            public final void onOffsetChanged(AppBarLayout appBarLayout2, int i11) {
                PostAudioDetailFragment.m74274j1(dimension, this, appBarLayout2, i11);
            }
        });
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    @Override // com.transsion.postdetail.p306ui.fragment.PostDetailCommonFragment
    public String getPageName() {
        return "postdetail_audio";
    }

    @Override // com.transsion.postdetail.p306ui.fragment.PostDetailCommonFragment
    public void initAudioListener() {
        final AppCompatImageView appCompatImageView;
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatImageView = mViewBinding.f86539d) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PostAudioDetailFragment.m74275k1(this.f57300a, appCompatImageView, view);
                }
            });
        }
        InterfaceC23410a mAudioApi = getMAudioApi();
        if (mAudioApi != null) {
            mAudioApi.addPlayerListener(this);
        }
        m74277m1();
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
    public void onCompletion(C23403e mediaSource) {
        boolean zM97797c;
        C28164n mViewBinding;
        AppCompatImageView appCompatImageView;
        InterfaceC16633f.a.m72427e(this, mediaSource);
        AudioBean audioBean = this.mAudioBean;
        if (audioBean != null) {
            InterfaceC23410a mAudioApi = getMAudioApi();
            zM97797c = Intrinsics.m97797c(mAudioApi != null ? Boolean.valueOf(mAudioApi.mo23878b(audioBean)) : null, Boolean.TRUE);
        } else {
            zM97797c = false;
        }
        if (!zM97797c || (mViewBinding = getMViewBinding()) == null || (appCompatImageView = mViewBinding.f86539d) == null) {
            return;
        }
        appCompatImageView.setImageResource(R$drawable.post_icon_play);
    }

    @Override // com.transsion.postdetail.p306ui.fragment.PostDetailCommonFragment, com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC23410a mAudioApi = getMAudioApi();
        if (mAudioApi != null) {
            mAudioApi.removePlayerListener(this);
        }
        InterfaceC23411b mFloatApi = getMFloatApi();
        if (mFloatApi != null) {
            mFloatApi.mo23893j(this);
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
    public void onPlayError(PlayError playError, C23403e c23403e) {
        InterfaceC16633f.a.m72439q(this, playError, c23403e);
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
    public void onProgress(long progress, C23403e mediaSource) {
        boolean zM97797c;
        AppCompatImageView appCompatImageView;
        InterfaceC16633f.a.m72447y(this, progress, mediaSource);
        AudioBean audioBean = this.mAudioBean;
        if (audioBean != null) {
            InterfaceC23410a mAudioApi = getMAudioApi();
            zM97797c = Intrinsics.m97797c(mAudioApi != null ? Boolean.valueOf(mAudioApi.mo23878b(audioBean)) : null, Boolean.TRUE);
        } else {
            zM97797c = false;
        }
        if (zM97797c) {
            m74282s1(progress);
            return;
        }
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding == null || (appCompatImageView = mViewBinding.f86539d) == null) {
            return;
        }
        appCompatImageView.setImageResource(R$drawable.post_icon_play);
    }

    @Override // p415fq.InterfaceC23411b.a
    public void onRemove() {
        AppCompatImageView appCompatImageView;
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding == null || (appCompatImageView = mViewBinding.f86539d) == null) {
            return;
        }
        appCompatImageView.setImageResource(R$drawable.post_icon_pro_play);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        InterfaceC16633f.a.m72412A(this);
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
    public void onVideoPause(C23403e mediaSource) {
        boolean zM97797c;
        C28164n mViewBinding;
        AppCompatImageView appCompatImageView;
        InterfaceC16633f.a.m72417F(this, mediaSource);
        AudioBean audioBean = this.mAudioBean;
        if (audioBean != null) {
            InterfaceC23410a mAudioApi = getMAudioApi();
            zM97797c = Intrinsics.m97797c(mAudioApi != null ? Boolean.valueOf(mAudioApi.mo23878b(audioBean)) : null, Boolean.TRUE);
        } else {
            zM97797c = false;
        }
        if (!zM97797c || (mViewBinding = getMViewBinding()) == null || (appCompatImageView = mViewBinding.f86539d) == null) {
            return;
        }
        appCompatImageView.setImageResource(R$drawable.post_icon_play);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        boolean zM97797c;
        C28164n mViewBinding;
        AppCompatImageView appCompatImageView;
        InterfaceC16633f.a.m72420I(this, mediaSource);
        AudioBean audioBean = this.mAudioBean;
        if (audioBean != null) {
            InterfaceC23410a mAudioApi = getMAudioApi();
            zM97797c = Intrinsics.m97797c(mAudioApi != null ? Boolean.valueOf(mAudioApi.mo23878b(audioBean)) : null, Boolean.TRUE);
        } else {
            zM97797c = false;
        }
        if (!zM97797c || (mViewBinding = getMViewBinding()) == null || (appCompatImageView = mViewBinding.f86539d) == null) {
            return;
        }
        appCompatImageView.setImageResource(R$drawable.post_icon_pro_pause);
    }

    /* JADX INFO: renamed from: p1 */
    public final void m74285p1() {
        InterfaceC23410a mAudioApi = getMAudioApi();
        if (mAudioApi == null || !mAudioApi.mo23882f()) {
            return;
        }
        m74280q1(null, this.mAudioBean);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }
}
