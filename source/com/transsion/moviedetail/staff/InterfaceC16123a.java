package com.transsion.moviedetail.staff;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetail.staff.bean.MovieStaffList;
import com.transsion.moviedetail.staff.bean.MovieStaffSubjectList;
import com.transsion.moviedetailapi.bean.Staff;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import io.reactivex.rxjava3.core.AbstractC24093j;
import kotlin.Metadata;
import okhttp3.RequestBody;
import p978zg.C29182a;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.transsion.moviedetail.staff.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJM\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\t¨\u0006\u0017"}, m97100d2 = {"Lcom/transsion/moviedetail/staff/a;", "", "", "staffId", "host", "Lio/reactivex/rxjava3/core/j;", "Lcom/tn/lib/net/bean/BaseDto;", "Lcom/transsion/moviedetailapi/bean/Staff;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/j;", "", "page", "perPage", "pagerMode", "Lcom/transsion/moviedetail/staff/bean/MovieStaffSubjectList;", "a", "(Ljava/lang/String;IIILjava/lang/String;)Lio/reactivex/rxjava3/core/j;", "Lokhttp3/RequestBody;", "requestBody", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Lokhttp3/RequestBody;Ljava/lang/String;)Lio/reactivex/rxjava3/core/j;", "Lcom/transsion/moviedetail/staff/bean/MovieStaffList;", "c", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public interface InterfaceC16123a {

    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ AbstractC24093j m70730a(InterfaceC16123a interfaceC16123a, String str, String str2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMovieStaffInfo");
            }
            if ((i11 & 2) != 0) {
                str2 = C29182a.f89053a.m111992a();
            }
            return interfaceC16123a.m70729d(str, str2);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ AbstractC24093j m70731b(InterfaceC16123a interfaceC16123a, String str, String str2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMovieStaffRelated");
            }
            if ((i11 & 2) != 0) {
                str2 = C29182a.f89053a.m111992a();
            }
            return interfaceC16123a.m70728c(str, str2);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ AbstractC24093j m70732c(InterfaceC16123a interfaceC16123a, String str, int i11, int i12, int i13, String str2, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMovieStaffSubjectList");
            }
            if ((i14 & 8) != 0) {
                i13 = 1;
            }
            int i15 = i13;
            if ((i14 & 16) != 0) {
                str2 = C29182a.f89053a.m111992a();
            }
            return interfaceC16123a.m70726a(str, i11, i12, i15, str2);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ AbstractC24093j m70733d(InterfaceC16123a interfaceC16123a, RequestBody requestBody, String str, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMovieStaffWantToSee");
            }
            if ((i11 & 2) != 0) {
                str = C29182a.f89053a.m111992a();
            }
            return interfaceC16123a.m70727b(requestBody, str);
        }
    }

    @GET("/wefeed-mobile-bff/subject-api/staff-subject-list")
    /* JADX INFO: renamed from: a */
    AbstractC24093j<BaseDto<MovieStaffSubjectList>> m70726a(@Query("staffId") String staffId, @Query("start") int page, @Query(TtmlNode.END) int perPage, @Query("pagerMode") int pagerMode, @Query("host") String host);

    @POST("/wefeed-mobile-bff/subject-api/want-to-see-staff")
    /* JADX INFO: renamed from: b */
    AbstractC24093j<BaseDto<String>> m70727b(@Body RequestBody requestBody, @Query("host") String host);

    @GET("/wefeed-mobile-bff/subject-api/staff-related")
    /* JADX INFO: renamed from: c */
    AbstractC24093j<BaseDto<MovieStaffList>> m70728c(@Query("staffId") String staffId, @Query("host") String host);

    @GET("/wefeed-mobile-bff/subject-api/staff-info")
    /* JADX INFO: renamed from: d */
    AbstractC24093j<BaseDto<Staff>> m70729d(@Query("staffId") String staffId, @Query("host") String host);
}
