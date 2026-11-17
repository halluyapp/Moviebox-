package com.transsion.shorttv.p314db;

import android.content.Context;
import androidx.room.C4335s;
import androidx.room.RoomDatabase;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p006a4.InterfaceC0033d;
import p931y3.AbstractC28852b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m97100d2 = {"Lcom/transsion/shorttv/db/ShortTvDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/transsion/shorttv/db/ShortTvFavoriteDao;", "k0", "()Lcom/transsion/shorttv/db/ShortTvFavoriteDao;", "Lcom/transsion/shorttv/db/ShortTvAdUnlockDao;", "j0", "()Lcom/transsion/shorttv/db/ShortTvAdUnlockDao;", TtmlNode.TAG_P, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public abstract class ShortTvDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q */
    private static final AbstractC28852b f60837q = new C18838a();

    /* JADX INFO: renamed from: r */
    private static volatile ShortTvDatabase f60838r;

    /* JADX INFO: renamed from: com.transsion.shorttv.db.ShortTvDatabase$a */
    public static final class C18838a extends AbstractC28852b {
        C18838a() {
            super(1, 2);
        }

        @Override // p931y3.AbstractC28852b
        /* JADX INFO: renamed from: a */
        public void mo22482a(InterfaceC0033d db2) {
            Intrinsics.m97802h(db2, "db");
            db2.mo228E("CREATE TABLE IF NOT EXISTS `short_tv_ad_unlock_state` (`subjectId` TEXT NOT NULL, `unlockedEps` TEXT NOT NULL, PRIMARY KEY(`subjectId`))");
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.db.ShortTvDatabase$b, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.transsion.shorttv.db.ShortTvDatabase$b$a */
        public static final class a extends RoomDatabase.AbstractC4265b {
            a() {
            }

            @Override // androidx.room.RoomDatabase.AbstractC4265b
            /* JADX INFO: renamed from: a */
            public void mo21352a(InterfaceC0033d db2) {
                Intrinsics.m97802h(db2, "db");
                super.mo21352a(db2);
            }

            @Override // androidx.room.RoomDatabase.AbstractC4265b
            /* JADX INFO: renamed from: e */
            public void mo21356e(InterfaceC0033d db2) {
                Intrinsics.m97802h(db2, "db");
                super.mo21356e(db2);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final ShortTvDatabase m79350a(Context context) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.m97801g(applicationContext, "getApplicationContext(...)");
            return (ShortTvDatabase) C4335s.m21601a(applicationContext, ShortTvDatabase.class, "or-short-tv-db").m21346c().m21345b(m79352c()).m21344a(new a()).m21347d();
        }

        /* JADX INFO: renamed from: b */
        public final ShortTvDatabase m79351b(Context context) {
            Intrinsics.m97802h(context, "context");
            ShortTvDatabase shortTvDatabase = ShortTvDatabase.f60838r;
            if (shortTvDatabase == null) {
                synchronized (this) {
                    shortTvDatabase = ShortTvDatabase.f60838r;
                    if (shortTvDatabase == null) {
                        ShortTvDatabase shortTvDatabaseM79350a = ShortTvDatabase.INSTANCE.m79350a(context);
                        ShortTvDatabase.f60838r = shortTvDatabaseM79350a;
                        shortTvDatabase = shortTvDatabaseM79350a;
                    }
                }
            }
            return shortTvDatabase;
        }

        /* JADX INFO: renamed from: c */
        public final AbstractC28852b m79352c() {
            return ShortTvDatabase.f60837q;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public abstract ShortTvAdUnlockDao mo79348j0();

    /* JADX INFO: renamed from: k0 */
    public abstract ShortTvFavoriteDao mo79349k0();
}
