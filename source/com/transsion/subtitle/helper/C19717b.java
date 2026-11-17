package com.transsion.subtitle.helper;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.blankj.utilcode.util.AbstractC5796o;
import com.cloud.config.utils.ConstantsKt;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.google.firebase.perf.metrics.C11309h;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.transsion.baselib.report.C14482a;
import com.transsion.subtitle.bean.OpenSubtitleData;
import com.transsion.subtitle.bean.OpenSubtitleDownloadInfo;
import com.transsion.subtitle.bean.OpenSubtitleResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p554io.CloseableKt;
import kotlin.text.Regex;
import p550kj.C24662i;
import pg.C26866a;
import sc.C27595e;

/* JADX INFO: renamed from: com.transsion.subtitle.helper.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C19717b {

    /* JADX INFO: renamed from: a */
    public static final C19717b f62943a = new C19717b();

    private C19717b() {
    }

    /* JADX INFO: renamed from: a */
    private final String m82161a(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == 3588) {
            return !str.equals("pt") ? str : "pt-pt";
        }
        if (iHashCode != 3886) {
            return (iHashCode == 100341365 && str.equals("in_id")) ? "id" : str;
        }
        return !str.equals("zh") ? str : "zh-cn";
    }

    /* JADX INFO: renamed from: c */
    private final String m82162c(InputStream inputStream) {
        try {
            try {
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                    char[] cArr = new char[512];
                    StringBuffer stringBuffer = new StringBuffer();
                    Ref.IntRef intRef = new Ref.IntRef();
                    while (true) {
                        int i11 = inputStreamReader.read(cArr);
                        intRef.element = i11;
                        if (i11 == -1) {
                            break;
                        }
                        stringBuffer.append(cArr, 0, i11);
                    }
                    String string = stringBuffer.toString();
                    try {
                        inputStream.close();
                    } catch (Exception unused) {
                    }
                    return string;
                } catch (Throwable th2) {
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                e11.printStackTrace();
                try {
                    inputStream.close();
                    return null;
                } catch (Exception unused3) {
                    return null;
                }
            }
        } catch (UnsupportedEncodingException e12) {
            e12.printStackTrace();
            inputStream.close();
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2 A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final String m82163b(String lan) {
        Intrinsics.m97802h(lan, "lan");
        switch (lan) {
            case "ar":
                return "عربي";
            case "bn":
                return "বাংলা";
            case "en":
                return "English";
            case "fr":
                return "Français";
            case "hi":
                return "हिन्दी";
            case "id":
                return "Indonesia";
            case "ru":
                return "Русский";
            case "sw":
                return "Swahili";
            case "ur":
                return "اردو";
            case "fil":
                return "Filipino";
            case "pt-pt":
                return "Português";
            case "zh-cn":
                return "中文(简体)";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m82164d(String str, Continuation continuation) {
        int i11;
        String strM82162c;
        try {
            C26866a.a aVar = C26866a.f81698a;
            C14482a c14482a = C14482a.f50937a;
            aVar.m104921x(c14482a.m65273a(), "Subtitle new api download info start:" + str + " ", true);
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://vip-api.opensubtitles.com/api/v1/download").openConnection());
            Intrinsics.m97800f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setConnectTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
            httpURLConnection.setReadTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("User-Agent", "player2024");
            httpURLConnection.setRequestProperty("Api-Key", "ZRN9QpqcTxje5UH3bV1RuugwitxkqB53");
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.getDoOutput();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
                outputStreamWriter.write("{\"file_id\":" + str + "}");
                outputStreamWriter.flush();
                Unit unit = Unit.f75682a;
                CloseableKt.m97669a(outputStream, null);
                InputStream inputStream = httpURLConnection.getInputStream();
                Intrinsics.m97801g(inputStream, "getInputStream(...)");
                if (httpURLConnection.getResponseCode() == 200) {
                    aVar.m104912c(c14482a.m65273a(), "Subtitle new api, download info success ", true);
                    strM82162c = m82162c(inputStream);
                } else {
                    aVar.m104921x(c14482a.m65273a(), "Subtitle new api download info fail ", true);
                    strM82162c = null;
                }
                return (OpenSubtitleDownloadInfo) AbstractC5796o.m27441d(strM82162c, OpenSubtitleDownloadInfo.class);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.m97669a(outputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            C11309h c11309hM107329e = C27595e.m107326c().m107329e("https://vip-api.opensubtitles.com/api/v1/download", "GET");
            Intrinsics.m97801g(c11309hM107329e, "newHttpMetric(...)");
            if (th4 instanceof SSLHandshakeException) {
                i11 = 87;
            } else if (th4 instanceof ProtocolException) {
                i11 = 86;
            } else if (th4 instanceof IOException) {
                i11 = 88;
            } else {
                i11 = th4 instanceof TimeoutException ? 85 : 89;
            }
            c11309hM107329e.m51060a(i11);
            th4.printStackTrace();
            C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), "Subtitle new api download info fail: " + th4 + " ", true);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Object m82165e(String str, String str2, Integer num, Integer num2, Continuation continuation) {
        String str3;
        int i11;
        String strM82162c;
        List<OpenSubtitleData> data;
        String lowerCase = new Regex("[\\\\/:#*?\"<>|&,]").replace(str, "").toLowerCase(Locale.ROOT);
        Intrinsics.m97801g(lowerCase, "toLowerCase(...)");
        String strM82161a = m82161a(str2);
        if (num == null && num2 == null) {
            str3 = "https://vip-api.opensubtitles.com/api/v1/subtitles?query=" + lowerCase + "&languages=" + strM82161a;
        } else {
            str3 = "https://vip-api.opensubtitles.com/api/v1/subtitles?query=" + lowerCase + "&languages=" + strM82161a + "&season_number=" + num + "&episode_number=" + num2;
        }
        try {
            C26866a.a aVar = C26866a.f81698a;
            C14482a c14482a = C14482a.f50937a;
            aVar.m104912c(c14482a.m65273a(), "new api getSubtitleInfo url:" + str3, true);
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str3).openConnection());
            Intrinsics.m97800f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setConnectTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
            httpURLConnection.setReadTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("User-Agent", "player2024");
            httpURLConnection.setRequestProperty("Api-Key", "ZRN9QpqcTxje5UH3bV1RuugwitxkqB53");
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            Intrinsics.m97801g(inputStream, "getInputStream(...)");
            if (httpURLConnection.getResponseCode() == 200) {
                aVar.m104912c(c14482a.m65273a(), "Subtitle new api success ", true);
                strM82162c = m82162c(inputStream);
            } else {
                aVar.m104921x(c14482a.m65273a(), "Subtitle new api fail ", true);
                strM82162c = null;
            }
            OpenSubtitleResponse openSubtitleResponse = (OpenSubtitleResponse) AbstractC5796o.m27441d(strM82162c, OpenSubtitleResponse.class);
            if (openSubtitleResponse != null && (data = openSubtitleResponse.getData()) != null && !data.isEmpty()) {
                return CollectionsKt.m97343U0(openSubtitleResponse.getData());
            }
            m82166f(3, ConstantsKt.ERROR_1000_MESSAGE);
            return null;
        } catch (Throwable th2) {
            String message = th2.getMessage();
            m82166f(3, message != null ? message : "");
            th2.printStackTrace();
            C11309h c11309hM107329e = C27595e.m107326c().m107329e(str3, "GET");
            Intrinsics.m97801g(c11309hM107329e, "newHttpMetric(...)");
            if (th2 instanceof SSLHandshakeException) {
                i11 = 87;
            } else if (th2 instanceof ProtocolException) {
                i11 = 86;
            } else if (th2 instanceof IOException) {
                i11 = 88;
            } else {
                i11 = th2 instanceof TimeoutException ? 85 : 89;
            }
            c11309hM107329e.m51060a(i11);
            C26866a.f81698a.m104915i(C14482a.f50937a.m65273a(), "new api getSubtitleInfo FAIL :" + th2, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m82166f(int i11, String msg) {
        Intrinsics.m97802h(msg, "msg");
        HashMap map = new HashMap();
        map.put("from", String.valueOf(i11));
        map.put(OfflineConstantsKt.TRACK_KEY_PRE_ERROR_MSG, msg);
        C24662i.f75350a.m96884s("subtitle_search", "app_perf", map);
    }
}
