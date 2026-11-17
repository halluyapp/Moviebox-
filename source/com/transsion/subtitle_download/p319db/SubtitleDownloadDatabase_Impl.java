package com.transsion.subtitle_download.p319db;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC4310f0;
import androidx.room.InvalidationTracker;
import androidx.room.util.AbstractC4370b;
import androidx.room.util.C4381m;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p966z3.AbstractC29134a;
import p966z3.InterfaceC29135b;
import ru.C27384i;
import ru.InterfaceC27376a;

/* JADX INFO: loaded from: classes6.dex */
public final class SubtitleDownloadDatabase_Impl extends SubtitleDownloadDatabase {

    /* JADX INFO: renamed from: u */
    private volatile InterfaceC27376a f63052u;

    /* JADX INFO: renamed from: com.transsion.subtitle_download.db.SubtitleDownloadDatabase_Impl$a */
    class C19750a extends AbstractC4310f0 {
        C19750a(int i11, String str, String str2) {
            super(i11, str, str2);
        }

        @Override // androidx.room.AbstractC4310f0
        /* JADX INFO: renamed from: a */
        public void mo21536a(InterfaceC29135b interfaceC29135b) throws Exception {
            AbstractC29134a.m111806a(interfaceC29135b, "CREATE TABLE IF NOT EXISTS `st_download_table` (`id` TEXT NOT NULL, `resourceStreamType` INTEGER NOT NULL, `resourceId` TEXT NOT NULL, `lan` TEXT, `lanName` TEXT, `url` TEXT, `size` INTEGER, `delay` INTEGER, `downloads` INTEGER, `type` INTEGER NOT NULL, `postId` TEXT, `subtitleName` TEXT, `subjectId` TEXT, `ep` INTEGER NOT NULL, `se` INTEGER NOT NULL, `resolution` INTEGER NOT NULL, `subjectName` TEXT, `status` INTEGER NOT NULL, `fileCharsetName` TEXT, `path` TEXT, `zipPath` TEXT NOT NULL, `taskId` TEXT, `failCount` INTEGER NOT NULL, `ugcVideoId` TEXT, `ugcVideoCollectionId` TEXT, `ops` TEXT, PRIMARY KEY(`id`, `resourceStreamType`))");
            AbstractC29134a.m111806a(interfaceC29135b, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            AbstractC29134a.m111806a(interfaceC29135b, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b69203d51150b93b225b86bfd78bf875')");
        }

        @Override // androidx.room.AbstractC4310f0
        /* JADX INFO: renamed from: b */
        public void mo21537b(InterfaceC29135b interfaceC29135b) throws Exception {
            AbstractC29134a.m111806a(interfaceC29135b, "DROP TABLE IF EXISTS `st_download_table`");
        }

        @Override // androidx.room.AbstractC4310f0
        /* JADX INFO: renamed from: f */
        public void mo21541f(InterfaceC29135b interfaceC29135b) {
        }

        @Override // androidx.room.AbstractC4310f0
        /* JADX INFO: renamed from: g */
        public void mo21542g(InterfaceC29135b interfaceC29135b) {
            SubtitleDownloadDatabase_Impl.this.m21318Q(interfaceC29135b);
        }

        @Override // androidx.room.AbstractC4310f0
        /* JADX INFO: renamed from: h */
        public void mo21543h(InterfaceC29135b interfaceC29135b) {
        }

        @Override // androidx.room.AbstractC4310f0
        /* JADX INFO: renamed from: i */
        public void mo21544i(InterfaceC29135b interfaceC29135b) {
            AbstractC4370b.m21687b(interfaceC29135b);
        }

        @Override // androidx.room.AbstractC4310f0
        /* JADX INFO: renamed from: j */
        public AbstractC4310f0.a mo21545j(InterfaceC29135b interfaceC29135b) {
            HashMap map = new HashMap(26);
            map.put("id", new C4381m.a("id", "TEXT", true, 1, null, 1));
            map.put("resourceStreamType", new C4381m.a("resourceStreamType", "INTEGER", true, 2, null, 1));
            map.put("resourceId", new C4381m.a("resourceId", "TEXT", true, 0, null, 1));
            map.put("lan", new C4381m.a("lan", "TEXT", false, 0, null, 1));
            map.put("lanName", new C4381m.a("lanName", "TEXT", false, 0, null, 1));
            map.put("url", new C4381m.a("url", "TEXT", false, 0, null, 1));
            map.put("size", new C4381m.a("size", "INTEGER", false, 0, null, 1));
            map.put("delay", new C4381m.a("delay", "INTEGER", false, 0, null, 1));
            map.put("downloads", new C4381m.a("downloads", "INTEGER", false, 0, null, 1));
            map.put(NativeComponentConstants.KEY_COMPONENT_TYPE, new C4381m.a(NativeComponentConstants.KEY_COMPONENT_TYPE, "INTEGER", true, 0, null, 1));
            map.put("postId", new C4381m.a("postId", "TEXT", false, 0, null, 1));
            map.put("subtitleName", new C4381m.a("subtitleName", "TEXT", false, 0, null, 1));
            map.put("subjectId", new C4381m.a("subjectId", "TEXT", false, 0, null, 1));
            map.put("ep", new C4381m.a("ep", "INTEGER", true, 0, null, 1));
            map.put("se", new C4381m.a("se", "INTEGER", true, 0, null, 1));
            map.put("resolution", new C4381m.a("resolution", "INTEGER", true, 0, null, 1));
            map.put("subjectName", new C4381m.a("subjectName", "TEXT", false, 0, null, 1));
            map.put(NotificationCompat.CATEGORY_STATUS, new C4381m.a(NotificationCompat.CATEGORY_STATUS, "INTEGER", true, 0, null, 1));
            map.put("fileCharsetName", new C4381m.a("fileCharsetName", "TEXT", false, 0, null, 1));
            map.put("path", new C4381m.a("path", "TEXT", false, 0, null, 1));
            map.put("zipPath", new C4381m.a("zipPath", "TEXT", true, 0, null, 1));
            map.put("taskId", new C4381m.a("taskId", "TEXT", false, 0, null, 1));
            map.put("failCount", new C4381m.a("failCount", "INTEGER", true, 0, null, 1));
            map.put("ugcVideoId", new C4381m.a("ugcVideoId", "TEXT", false, 0, null, 1));
            map.put("ugcVideoCollectionId", new C4381m.a("ugcVideoCollectionId", "TEXT", false, 0, null, 1));
            map.put("ops", new C4381m.a("ops", "TEXT", false, 0, null, 1));
            C4381m c4381m = new C4381m("st_download_table", map, new HashSet(0), new HashSet(0));
            C4381m c4381mM21718b = C4381m.m21718b(interfaceC29135b, "st_download_table");
            if (c4381m.equals(c4381mM21718b)) {
                return new AbstractC4310f0.a(true, null);
            }
            return new AbstractC4310f0.a(false, "st_download_table(com.transsion.subtitle_download.db.SubtitleDownloadTable).\n Expected:\n" + c4381m + "\n Found:\n" + c4381mM21718b);
        }
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: C */
    public Set mo21306C() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: F */
    protected Map mo21309F() {
        HashMap map = new HashMap();
        map.put(InterfaceC27376a.class, C27384i.m106557o());
        return map;
    }

    @Override // com.transsion.subtitle_download.p319db.SubtitleDownloadDatabase
    /* JADX INFO: renamed from: l0 */
    public InterfaceC27376a mo82290l0() {
        InterfaceC27376a interfaceC27376a;
        if (this.f63052u != null) {
            return this.f63052u;
        }
        synchronized (this) {
            try {
                if (this.f63052u == null) {
                    this.f63052u = new C27384i(this);
                }
                interfaceC27376a = this.f63052u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC27376a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public AbstractC4310f0 mo21336r() {
        return new C19750a(4, "b69203d51150b93b225b86bfd78bf875", "a207c71dcb7f4328cd120ce375a1f942");
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: q */
    protected InvalidationTracker mo21335q() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "st_download_table");
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: v */
    public List mo21339v(Map map) {
        return new ArrayList();
    }
}
