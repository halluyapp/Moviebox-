package com.transsion.videodetail;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.ResourcesSeasonList;
import com.transsion.videodetail.bean.VideoDetailStreamList;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p978zg.C29182a;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.transsion.videodetail.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\t2\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m97100d2 = {"Lcom/transsion/videodetail/b;", "", "", "subjectId", "host", "Lcom/tn/lib/net/bean/BaseDto;", "Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "se", "ep", "Lcom/transsion/videodetail/bean/VideoDetailStreamList;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public interface InterfaceC20941b {

    /* JADX INFO: renamed from: com.transsion.videodetail.b$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m86187a(InterfaceC20941b interfaceC20941b, String str, int i11, int i12, String str2, Continuation continuation, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVideoPlayInfo");
            }
            if ((i13 & 8) != 0) {
                str2 = C29182a.f89053a.m111992a();
            }
            return interfaceC20941b.m86186b(str, i11, i12, str2, continuation);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Object m86188b(InterfaceC20941b interfaceC20941b, String str, String str2, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVideoSeasonInfo");
            }
            if ((i11 & 2) != 0) {
                str2 = C29182a.f89053a.m111992a();
            }
            return interfaceC20941b.m86185a(str, str2, continuation);
        }
    }

    @GET("/wefeed-mobile-bff/subject-api/season-info")
    /* JADX INFO: renamed from: a */
    Object m86185a(@Query("subjectId") String str, @Query("host") String str2, Continuation<? super BaseDto<ResourcesSeasonList>> continuation);

    @GET("/wefeed-mobile-bff/subject-api/play-info")
    /* JADX INFO: renamed from: b */
    Object m86186b(@Query("subjectId") String str, @Query("se") int i11, @Query("ep") int i12, @Query("host") String str2, Continuation<? super BaseDto<VideoDetailStreamList>> continuation);
}
