package com.transsion.transfer.androidasync.http.cache;

import com.transsion.transfer.androidasync.C19944t;
import com.transsion.transfer.androidasync.InterfaceC19931j;
import com.transsion.transfer.androidasync.http.C19873a0;
import com.transsion.transfer.androidasync.http.InterfaceC19889g;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ResponseCacheMiddleware extends C19873a0 {

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.cache.ResponseCacheMiddleware$1 */
    class RunnableC198781 implements Runnable {
        final /* synthetic */ ResponseCacheMiddleware this$0;
        final /* synthetic */ InterfaceC19889g.a val$data;
        final /* synthetic */ C19881a val$socket;

        RunnableC198781(ResponseCacheMiddleware responseCacheMiddleware, InterfaceC19889g.a aVar, C19881a c19881a) {
            this.val$data = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.val$data.f63375c.mo82619a(null, null);
            throw null;
        }
    }

    private static class CachedBodyEmitter extends C19944t {

        /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.cache.ResponseCacheMiddleware$CachedBodyEmitter$1 */
        class RunnableC198791 implements Runnable {
            final /* synthetic */ CachedBodyEmitter this$0;

            RunnableC198791(CachedBodyEmitter cachedBodyEmitter) {
            }

            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.cache.ResponseCacheMiddleware$CachedBodyEmitter$2 */
        class RunnableC198802 implements Runnable {
            final /* synthetic */ CachedBodyEmitter this$0;

            RunnableC198802(CachedBodyEmitter cachedBodyEmitter) {
            }

            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.cache.ResponseCacheMiddleware$a */
    private class C19881a extends CachedBodyEmitter implements InterfaceC19931j {
    }
}
