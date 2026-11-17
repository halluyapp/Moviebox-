package com.transsion.baseui.music;

import android.text.TextUtils;
import com.blankj.utilcode.util.AbstractC5796o;
import com.google.common.reflect.TypeToken;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.player.mediasession.C16625i;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p550kj.C24662i;

/* JADX INFO: loaded from: classes5.dex */
public final class MusicReport {

    /* JADX INFO: renamed from: a */
    public static final MusicReport f51069a = new MusicReport();

    private MusicReport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final List m65626b() {
        String string = C14496b.f50966a.m65344b().getString("music_play_duration", "");
        if (TextUtils.isEmpty(string)) {
            return new ArrayList();
        }
        Type type = new TypeToken<List<C14553n>>() { // from class: com.transsion.baseui.music.MusicReport$getLocalHistoryList$personListType$1
        }.getType();
        Intrinsics.m97801g(type, "getType(...)");
        Object objM27442e = AbstractC5796o.m27442e(string, type);
        Intrinsics.m97799e(objM27442e);
        return (List) objM27442e;
    }

    /* JADX INFO: renamed from: c */
    public final void m65627c() {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            List<C14553n> listM65626b = f51069a.m65626b();
            if (listM65626b.isEmpty()) {
                return;
            }
            for (C14553n c14553n : listM65626b) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("subject_id", String.valueOf(c14553n.m65636h()));
                linkedHashMap.put("trace_id", String.valueOf(c14553n.m65632d()));
                linkedHashMap.put("ops", String.valueOf(c14553n.m65633e()));
                linkedHashMap.put("play_duration", String.valueOf(c14553n.m65634f()));
                linkedHashMap.put("total_duration", String.valueOf(c14553n.m65637i()));
                linkedHashMap.put("video_bitrate", String.valueOf(c14553n.m65638j()));
                linkedHashMap.put("audio_bitrate", String.valueOf(c14553n.m65629a()));
                linkedHashMap.put("float_play_duration", String.valueOf(c14553n.m65630b()));
                linkedHashMap.put("in_bg_play_duration", String.valueOf(c14553n.m65631c()));
                C24662i.f75350a.m96875H("music_play", "music_play", c14553n.m65634f(), linkedHashMap);
                C16625i.f55907a.m72389a("MusicReport --> report() --> 上报播放时长 = " + linkedHashMap);
                C14496b.f50966a.m65344b().remove("music_play_duration");
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C16625i.f55907a.m72390b("MusicReport --> report() --> it = " + thM112710exceptionOrNullimpl);
    }

    /* JADX INFO: renamed from: d */
    public final void m65628d(C14553n musicPlayDurationBean) {
        Intrinsics.m97802h(musicPlayDurationBean, "musicPlayDurationBean");
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new MusicReport$saveLocal$1(musicPlayDurationBean, null), 3, null);
    }
}
