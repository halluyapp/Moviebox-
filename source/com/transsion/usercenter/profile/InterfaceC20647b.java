package com.transsion.usercenter.profile;

import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.usercenter.profile.bean.BffUserProfileData;
import com.transsion.usercenter.profile.bean.MinePageInfo;
import com.transsion.usercenter.profile.bean.ProfileEntranceInfo;
import com.transsion.usercenter.profile.bean.ProfileInfo;
import com.transsion.usercenter.profile.bean.ProfileNewMessage;
import com.transsion.usercenter.profile.see.bean.ProfileSeeData;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import io.reactivex.rxjava3.core.AbstractC24093j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p978zg.C29182a;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.transsion.usercenter.profile.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\bJ,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\bJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015JM\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0016\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0018JM\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0016\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u0018JM\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0016\u001a\u00020\u00112\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\f2\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00052\b\b\u0001\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010\bJ%\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00050\f2\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b$\u0010\u001f¨\u0006%"}, m97100d2 = {"Lcom/transsion/usercenter/profile/b;", "", "", "userId", "host", "Lcom/tn/lib/net/bean/BaseDto;", "Lcom/transsion/usercenter/profile/bean/MinePageInfo;", "e", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/usercenter/profile/bean/BffUserProfileData;", "j", "Lio/reactivex/rxjava3/core/j;", "Lcom/transsion/usercenter/profile/bean/ProfileInfo;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/j;", "page", "", "perPage", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "c", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lio/reactivex/rxjava3/core/j;", NativeComponentConstants.KEY_COMPONENT_TYPE, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/j;", "i", "Lcom/transsion/usercenter/profile/see/bean/ProfileSeeData;", "g", "(Ljava/lang/String;IIILjava/lang/String;)Lio/reactivex/rxjava3/core/j;", "Lcom/transsion/usercenter/profile/bean/ProfileNewMessage;", "h", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/j;", "postId", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "a", "Lcom/transsion/usercenter/profile/bean/ProfileEntranceInfo;", "f", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public interface InterfaceC20647b {

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.b$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ AbstractC24093j m85291a(InterfaceC20647b interfaceC20647b, String str, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkNewMessage");
            }
            if ((i11 & 1) != 0) {
                str = C29182a.f89053a.m111992a();
            }
            return interfaceC20647b.m85287h(str);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ AbstractC24093j m85292b(InterfaceC20647b interfaceC20647b, String str, String str2, int i11, String str3, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLikeSubject");
            }
            if ((i12 & 8) != 0) {
                str3 = C29182a.f89053a.m111992a();
            }
            return interfaceC20647b.m85282c(str, str2, i11, str3);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Object m85293c(InterfaceC20647b interfaceC20647b, String str, String str2, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMineInfo");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = C29182a.f89053a.m111992a();
            }
            return interfaceC20647b.m85284e(str, str2, continuation);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ AbstractC24093j m85294d(InterfaceC20647b interfaceC20647b, String str, String str2, int i11, String str3, String str4, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMyPostSubject");
            }
            if ((i12 & 8) != 0) {
                str3 = "PostRankTypeNew";
            }
            String str5 = str3;
            if ((i12 & 16) != 0) {
                str4 = C29182a.f89053a.m111992a();
            }
            return interfaceC20647b.m85288i(str, str2, i11, str5, str4);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ Object m85295e(InterfaceC20647b interfaceC20647b, String str, String str2, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPostDetail");
            }
            if ((i11 & 2) != 0) {
                str2 = C29182a.f89053a.m111992a();
            }
            return interfaceC20647b.m85280a(str, str2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ AbstractC24093j m85296f(InterfaceC20647b interfaceC20647b, String str, String str2, int i11, String str3, String str4, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPostSubject");
            }
            if ((i12 & 8) != 0) {
                str3 = "PostRankTypeNew";
            }
            String str5 = str3;
            if ((i12 & 16) != 0) {
                str4 = C29182a.f89053a.m111992a();
            }
            return interfaceC20647b.m85283d(str, str2, i11, str5, str4);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ AbstractC24093j m85297g(InterfaceC20647b interfaceC20647b, String str, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProfileEntrance");
            }
            if ((i11 & 1) != 0) {
                str = C29182a.f89053a.m111992a();
            }
            return interfaceC20647b.m85285f(str);
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ AbstractC24093j m85298h(InterfaceC20647b interfaceC20647b, String str, String str2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProfileInfo");
            }
            if ((i11 & 2) != 0) {
                str2 = C29182a.f89053a.m111992a();
            }
            return interfaceC20647b.m85281b(str, str2);
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ AbstractC24093j m85299i(InterfaceC20647b interfaceC20647b, String str, int i11, int i12, int i13, String str2, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSeeList");
            }
            if ((i14 & 8) != 0) {
                i13 = 1;
            }
            int i15 = i13;
            if ((i14 & 16) != 0) {
                str2 = C29182a.f89053a.m111992a();
            }
            return interfaceC20647b.m85286g(str, i11, i12, i15, str2);
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ Object m85300j(InterfaceC20647b interfaceC20647b, String str, String str2, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUGCMineInfo");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = C29182a.f89053a.m111992a();
            }
            return interfaceC20647b.m85290k(str, str2, continuation);
        }

        /* JADX INFO: renamed from: k */
        public static /* synthetic */ Object m85301k(InterfaceC20647b interfaceC20647b, String str, String str2, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserProfileV3");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = C29182a.f89053a.m111992a();
            }
            return interfaceC20647b.m85289j(str, str2, continuation);
        }
    }

    @GET("/wefeed-mobile-bff/post/get")
    /* JADX INFO: renamed from: a */
    Object m85280a(@Query("postId") String str, @Query("host") String str2, Continuation<? super BaseDto<PostSubjectItem>> continuation);

    @GET("/wefeed-mobile-bff/user-api/profile")
    /* JADX INFO: renamed from: b */
    AbstractC24093j<BaseDto<ProfileInfo>> m85281b(@Query("userId") String userId, @Query("host") String host);

    @GET("/wefeed-mobile-bff/post/list/likes")
    /* JADX INFO: renamed from: c */
    AbstractC24093j<BaseDto<PostSubjectBean>> m85282c(@Query("userId") String userId, @Query("page") String page, @Query("perPage") int perPage, @Query("host") String host);

    @GET("/wefeed-mobile-bff/post/list/user")
    /* JADX INFO: renamed from: d */
    AbstractC24093j<BaseDto<PostSubjectBean>> m85283d(@Query("id") String userId, @Query("page") String page, @Query("perPage") int perPage, @Query(NativeComponentConstants.KEY_COMPONENT_TYPE) String type, @Query("host") String host);

    @GET("/wefeed-mobile-bff/user-api/profile/v2")
    /* JADX INFO: renamed from: e */
    Object m85284e(@Query("userId") String str, @Query("host") String str2, Continuation<? super BaseDto<MinePageInfo>> continuation);

    @GET("/wefeed-mobile-bff/activity/entrance")
    /* JADX INFO: renamed from: f */
    AbstractC24093j<BaseDto<ProfileEntranceInfo>> m85285f(@Query("host") String host);

    @GET("/wefeed-mobile-bff/subject-api/see-list-v2")
    /* JADX INFO: renamed from: g */
    AbstractC24093j<BaseDto<ProfileSeeData>> m85286g(@Query("userId") String userId, @Query("page") int page, @Query("perPage") int perPage, @Query("seeType") int type, @Query("host") String host);

    @GET("/wefeed-mobile-bff/message/internal/has-new")
    /* JADX INFO: renamed from: h */
    AbstractC24093j<BaseDto<ProfileNewMessage>> m85287h(@Query("host") String host);

    @GET("/wefeed-mobile-bff/post/list/user/my")
    /* JADX INFO: renamed from: i */
    AbstractC24093j<BaseDto<PostSubjectBean>> m85288i(@Query("id") String userId, @Query("page") String page, @Query("perPage") int perPage, @Query(NativeComponentConstants.KEY_COMPONENT_TYPE) String type, @Query("host") String host);

    @GET("/wefeed-mobile-bff/user-api/profile/v3")
    /* JADX INFO: renamed from: j */
    Object m85289j(@Query("userId") String str, @Query("host") String str2, Continuation<? super BaseDto<BffUserProfileData>> continuation);

    @GET("/wefeed-mobile-bff/user-api/profile/v3")
    /* JADX INFO: renamed from: k */
    Object m85290k(@Query("userId") String str, @Query("host") String str2, Continuation<? super BaseDto<MinePageInfo>> continuation);
}
