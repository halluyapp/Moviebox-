package com.transsion.player.shorttv.preload;

import androidx.media3.common.C3331t;
import androidx.media3.common.util.AbstractC3336a1;
import androidx.media3.datasource.cache.C3415a;
import androidx.media3.exoplayer.offline.AbstractC3789b;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.InterfaceC3802o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.player.shorttv.preload.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C16655b extends AbstractC3789b {

    /* JADX INFO: renamed from: d */
    private final C3415a.c f56008d;

    /* JADX INFO: renamed from: e */
    private final Executor f56009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16655b(C3415a.c cacheDataSourceFactory, Executor executor) {
        super(cacheDataSourceFactory, executor);
        Intrinsics.m97802h(cacheDataSourceFactory, "cacheDataSourceFactory");
        Intrinsics.m97802h(executor, "executor");
        this.f56008d = cacheDataSourceFactory;
        this.f56009e = executor;
    }

    @Override // androidx.media3.exoplayer.offline.AbstractC3789b, androidx.media3.exoplayer.offline.InterfaceC3803p
    /* JADX INFO: renamed from: a */
    public InterfaceC3802o mo18421a(DownloadRequest request) {
        Intrinsics.m97802h(request, "request");
        int iM15637A0 = AbstractC3336a1.m15637A0(request.uri, request.mimeType);
        if (iM15637A0 == 0 || iM15637A0 == 1 || iM15637A0 == 2) {
            InterfaceC3802o interfaceC3802oMo18421a = super.mo18421a(request);
            Intrinsics.m97801g(interfaceC3802oMo18421a, "createDownloader(...)");
            return interfaceC3802oMo18421a;
        }
        if (iM15637A0 == 4) {
            return new VideoProgressiveDownloader(new C3331t.c().m15564i(request.uri).m15557b(request.customCacheKey).m15556a(), this.f56008d, this.f56009e);
        }
        throw new IllegalArgumentException("Unsupported type: " + iM15637A0);
    }
}
