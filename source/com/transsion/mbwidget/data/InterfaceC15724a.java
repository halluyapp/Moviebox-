package com.transsion.mbwidget.data;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.net.bean.BaseDto;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p978zg.C29182a;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.transsion.mbwidget.data.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m97100d2 = {"Lcom/transsion/mbwidget/data/a;", "", "Lcom/transsion/mbwidget/data/WidgetRequestBody;", "requestBody", "", "host", "Lcom/tn/lib/net/bean/BaseDto;", "Lcom/transsion/mbwidget/data/DeskWidgetResp;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Lcom/transsion/mbwidget/data/WidgetRequestBody;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "count", "Lcom/transsion/mbwidget/data/BffMatchData;", "a", "(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DeskWidget_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public interface InterfaceC15724a {

    /* JADX INFO: renamed from: com.transsion.mbwidget.data.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m69695a(InterfaceC15724a interfaceC15724a, Integer num, String str, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSubUpcomingMatch");
            }
            if ((i11 & 1) != 0) {
                num = null;
            }
            if ((i11 & 2) != 0) {
                str = C29182a.f89053a.m111992a();
            }
            return interfaceC15724a.m69693a(num, str, continuation);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Object m69696b(InterfaceC15724a interfaceC15724a, WidgetRequestBody widgetRequestBody, String str, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWidgetData");
            }
            if ((i11 & 2) != 0) {
                str = C29182a.f89053a.m111992a();
            }
            return interfaceC15724a.m69694b(widgetRequestBody, str, continuation);
        }
    }

    @GET("/wefeed-mobile-bff/live/sub-upcomming-match")
    /* JADX INFO: renamed from: a */
    Object m69693a(@Query("count") Integer num, @Query("host") String str, Continuation<? super BaseDto<BffMatchData>> continuation);

    @POST("/wefeed-mobile-bff/subject-api/widget")
    /* JADX INFO: renamed from: b */
    Object m69694b(@Body WidgetRequestBody widgetRequestBody, @Query("host") String str, Continuation<? super BaseDto<DeskWidgetResp>> continuation);
}
