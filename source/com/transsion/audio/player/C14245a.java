package com.transsion.audio.player;

import android.text.TextUtils;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.transsion.player.orplayer.PlayError;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.audio.player.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14245a {

    /* JADX INFO: renamed from: a */
    private AudioBean f50474a;

    /* JADX INFO: renamed from: b */
    private final String f50475b;

    /* JADX INFO: renamed from: c */
    private long f50476c;

    /* JADX INFO: renamed from: d */
    private long f50477d;

    /* JADX INFO: renamed from: e */
    private long f50478e;

    /* JADX INFO: renamed from: f */
    private long f50479f;

    /* JADX INFO: renamed from: g */
    private int f50480g;

    /* JADX INFO: renamed from: h */
    private long f50481h;

    /* JADX INFO: renamed from: i */
    private long f50482i;

    /* JADX INFO: renamed from: j */
    private long f50483j;

    /* JADX INFO: renamed from: k */
    private int f50484k;

    /* JADX INFO: renamed from: l */
    private long f50485l;

    /* JADX INFO: renamed from: m */
    private long f50486m;

    /* JADX INFO: renamed from: n */
    private Integer f50487n;

    public C14245a(AudioBean audioBean) {
        Intrinsics.m97802h(audioBean, "audioBean");
        this.f50475b = C14245a.class.getSimpleName();
        this.f50474a = audioBean;
        this.f50476c = System.currentTimeMillis();
        C26866a.a.m104898f(C26866a.f81698a, "video_play", "initView", false, 4, null);
    }

    /* JADX INFO: renamed from: a */
    private final void m64594a() {
        String postId;
        String subjectId;
        Long duration;
        String ops;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AudioBean audioBean = this.f50474a;
        String str = "";
        if (audioBean == null || (postId = audioBean.getPostId()) == null) {
            postId = "";
        }
        linkedHashMap.put("post_id", postId);
        AudioBean audioBean2 = this.f50474a;
        if (audioBean2 == null || (subjectId = audioBean2.getSubjectId()) == null) {
            subjectId = "";
        }
        linkedHashMap.put("subject_id", subjectId);
        AudioBean audioBean3 = this.f50474a;
        if (!TextUtils.isEmpty(audioBean3 != null ? audioBean3.getOps() : null)) {
            AudioBean audioBean4 = this.f50474a;
            if (audioBean4 != null && (ops = audioBean4.getOps()) != null) {
                str = ops;
            }
            linkedHashMap.put("ops", str);
        }
        if (this.f50477d > 0) {
            linkedHashMap.put("is_start", "1");
            linkedHashMap.put("delay_v", String.valueOf(this.f50477d - this.f50476c));
            linkedHashMap.put("buffer_time", String.valueOf(this.f50478e));
            linkedHashMap.put("buffer_count", String.valueOf(this.f50480g));
            float f11 = this.f50481h;
            AudioBean audioBean5 = this.f50474a;
            linkedHashMap.put("play_complete", String.valueOf(((f11 / ((audioBean5 == null || (duration = audioBean5.getDuration()) == null) ? 1L : duration.longValue())) * 100.0f) + (this.f50484k * 100.0f)));
            linkedHashMap.put("play_duration", String.valueOf(this.f50483j));
            linkedHashMap.put("pause_duration", String.valueOf(this.f50486m));
        } else {
            linkedHashMap.put("is_start", "0");
            linkedHashMap.put("delay_v", String.valueOf(System.currentTimeMillis() - this.f50476c));
        }
        Integer num = this.f50487n;
        if (num != null) {
            linkedHashMap.put("error_code", String.valueOf(num));
        }
        C24662i.f75350a.m96875H("postdetail", "audio_play", this.f50483j, linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public final void m64595b() {
        m64594a();
    }

    /* JADX INFO: renamed from: c */
    public final void m64596c() {
        if (this.f50477d > 0) {
            this.f50479f = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m64597d() {
        if (this.f50479f > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f50479f;
            this.f50479f = jCurrentTimeMillis;
            this.f50478e += jCurrentTimeMillis;
            this.f50480g++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m64598e(PlayError errorInfo) {
        Intrinsics.m97802h(errorInfo, "errorInfo");
        this.f50487n = errorInfo.getErrorCode();
    }

    /* JADX INFO: renamed from: f */
    public final void m64599f(long j11) {
        long j12 = this.f50482i;
        long j13 = j11 - j12;
        if (1 <= j13 && j13 < 1000) {
            this.f50483j += j11 - j12;
        }
        this.f50482i = j11;
        if (j11 > this.f50481h) {
            this.f50481h = j11;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m64600g() {
        C26866a.a.m104898f(C26866a.f81698a, "video_play", "onRenderFirstFrame", false, 4, null);
        if (this.f50477d > 0) {
            return;
        }
        this.f50477d = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: h */
    public final void m64601h() {
        this.f50485l = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: i */
    public final void m64602i() {
        if (this.f50485l != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f50485l;
            this.f50485l = jCurrentTimeMillis;
            this.f50486m += jCurrentTimeMillis;
        }
    }
}
