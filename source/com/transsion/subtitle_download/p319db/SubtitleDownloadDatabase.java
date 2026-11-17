package com.transsion.subtitle_download.p319db;

import android.content.Context;
import androidx.room.C4335s;
import androidx.room.RoomDatabase;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.subtitle_download.utils.C19771b;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p006a4.InterfaceC0033d;
import p931y3.AbstractC28852b;
import ru.InterfaceC27376a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m97100d2 = {"Lcom/transsion/subtitle_download/db/SubtitleDownloadDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lru/a;", "l0", "()Lru/a;", TtmlNode.TAG_P, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "SubtitleDownload_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public abstract class SubtitleDownloadDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: q */
    private static volatile SubtitleDownloadDatabase f63048q;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r */
    private static final C19746a f63049r = new C19746a();

    /* JADX INFO: renamed from: s */
    private static final C19747b f63050s = new C19747b();

    /* JADX INFO: renamed from: t */
    private static final C19748c f63051t = new C19748c();

    /* JADX INFO: renamed from: com.transsion.subtitle_download.db.SubtitleDownloadDatabase$a */
    public static final class C19746a extends AbstractC28852b {
        C19746a() {
            super(1, 2);
        }

        @Override // p931y3.AbstractC28852b
        /* JADX INFO: renamed from: a */
        public void mo22482a(InterfaceC0033d database) {
            Intrinsics.m97802h(database, "database");
            database.mo228E("ALTER TABLE ST_DOWNLOAD_TABLE ADD COLUMN failCount INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle_download.db.SubtitleDownloadDatabase$b */
    public static final class C19747b extends AbstractC28852b {
        C19747b() {
            super(2, 3);
        }

        @Override // p931y3.AbstractC28852b
        /* JADX INFO: renamed from: a */
        public void mo22482a(InterfaceC0033d database) {
            Intrinsics.m97802h(database, "database");
            database.mo228E("ALTER TABLE ST_DOWNLOAD_TABLE ADD COLUMN ugcVideoId TEXT");
            database.mo228E("ALTER TABLE ST_DOWNLOAD_TABLE ADD COLUMN ugcVideoCollectionId TEXT");
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle_download.db.SubtitleDownloadDatabase$c */
    public static final class C19748c extends AbstractC28852b {
        C19748c() {
            super(3, 4);
        }

        @Override // p931y3.AbstractC28852b
        /* JADX INFO: renamed from: a */
        public void mo22482a(InterfaceC0033d database) {
            Intrinsics.m97802h(database, "database");
            database.mo228E("ALTER TABLE ST_DOWNLOAD_TABLE ADD COLUMN ops TEXT");
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle_download.db.SubtitleDownloadDatabase$d, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.transsion.subtitle_download.db.SubtitleDownloadDatabase$d$a */
        public static final class a extends RoomDatabase.AbstractC4265b {
            a() {
            }

            @Override // androidx.room.RoomDatabase.AbstractC4265b
            /* JADX INFO: renamed from: a */
            public void mo21352a(InterfaceC0033d db2) {
                Intrinsics.m97802h(db2, "db");
                super.mo21352a(db2);
                C19771b.f63088a.m82366b("SubtitleDownloadDataBase --> getInstance() --> buildDatabase() --> onCreate() --> db_name is = " + db2.getPath());
            }

            @Override // androidx.room.RoomDatabase.AbstractC4265b
            /* JADX INFO: renamed from: e */
            public void mo21356e(InterfaceC0033d db2) {
                Intrinsics.m97802h(db2, "db");
                super.mo21356e(db2);
                C19771b.f63088a.m82366b("SubtitleDownloadDataBase --> getInstance() --> buildDatabase() --> onOpen()");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final SubtitleDownloadDatabase m82291a(Context context) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.m97801g(applicationContext, "getApplicationContext(...)");
            return (SubtitleDownloadDatabase) C4335s.m21601a(applicationContext, SubtitleDownloadDatabase.class, "oneroom-subtitle-db").m21346c().m21345b(SubtitleDownloadDatabase.f63049r, SubtitleDownloadDatabase.f63050s, SubtitleDownloadDatabase.f63051t).m21344a(new a()).m21347d();
        }

        /* JADX INFO: renamed from: b */
        public final SubtitleDownloadDatabase m82292b(Context context) {
            Intrinsics.m97802h(context, "context");
            SubtitleDownloadDatabase subtitleDownloadDatabase = SubtitleDownloadDatabase.f63048q;
            if (subtitleDownloadDatabase == null) {
                synchronized (this) {
                    subtitleDownloadDatabase = SubtitleDownloadDatabase.f63048q;
                    if (subtitleDownloadDatabase == null) {
                        SubtitleDownloadDatabase subtitleDownloadDatabaseM82291a = SubtitleDownloadDatabase.INSTANCE.m82291a(context);
                        SubtitleDownloadDatabase.f63048q = subtitleDownloadDatabaseM82291a;
                        subtitleDownloadDatabase = subtitleDownloadDatabaseM82291a;
                    }
                }
            }
            return subtitleDownloadDatabase;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public abstract InterfaceC27376a mo82290l0();
}
