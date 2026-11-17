package com.transsion.shorttv.p314db;

import androidx.room.AbstractC4310f0;
import androidx.room.InvalidationTracker;
import androidx.room.util.AbstractC4370b;
import androidx.room.util.C4381m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p966z3.AbstractC29134a;
import p966z3.InterfaceC29135b;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvDatabase_Impl extends ShortTvDatabase {

    /* JADX INFO: renamed from: s */
    private volatile ShortTvFavoriteDao f60839s;

    /* JADX INFO: renamed from: t */
    private volatile ShortTvAdUnlockDao f60840t;

    /* JADX INFO: renamed from: com.transsion.shorttv.db.ShortTvDatabase_Impl$a */
    class C18840a extends AbstractC4310f0 {
        C18840a(int i11, String str, String str2) {
            super(i11, str, str2);
        }

        @Override // androidx.room.AbstractC4310f0
        /* JADX INFO: renamed from: a */
        public void mo21536a(InterfaceC29135b interfaceC29135b) throws Exception {
            AbstractC29134a.m111806a(interfaceC29135b, "CREATE TABLE IF NOT EXISTS `short_tv_favorite_state` (`subjectId` TEXT NOT NULL, `favoriteNum` TEXT, `hasFavorite` INTEGER NOT NULL, `favoriteTime` TEXT, PRIMARY KEY(`subjectId`))");
            AbstractC29134a.m111806a(interfaceC29135b, "CREATE TABLE IF NOT EXISTS `short_tv_ad_unlock_state` (`subjectId` TEXT NOT NULL, `unlockedEps` TEXT NOT NULL, PRIMARY KEY(`subjectId`))");
            AbstractC29134a.m111806a(interfaceC29135b, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            AbstractC29134a.m111806a(interfaceC29135b, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d0cc9a2b371c1f7329d0d00d8bd31c1')");
        }

        @Override // androidx.room.AbstractC4310f0
        /* JADX INFO: renamed from: b */
        public void mo21537b(InterfaceC29135b interfaceC29135b) throws Exception {
            AbstractC29134a.m111806a(interfaceC29135b, "DROP TABLE IF EXISTS `short_tv_favorite_state`");
            AbstractC29134a.m111806a(interfaceC29135b, "DROP TABLE IF EXISTS `short_tv_ad_unlock_state`");
        }

        @Override // androidx.room.AbstractC4310f0
        /* JADX INFO: renamed from: f */
        public void mo21541f(InterfaceC29135b interfaceC29135b) {
        }

        @Override // androidx.room.AbstractC4310f0
        /* JADX INFO: renamed from: g */
        public void mo21542g(InterfaceC29135b interfaceC29135b) {
            ShortTvDatabase_Impl.this.m21318Q(interfaceC29135b);
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
            HashMap map = new HashMap(4);
            map.put("subjectId", new C4381m.a("subjectId", "TEXT", true, 1, null, 1));
            map.put("favoriteNum", new C4381m.a("favoriteNum", "TEXT", false, 0, null, 1));
            map.put("hasFavorite", new C4381m.a("hasFavorite", "INTEGER", true, 0, null, 1));
            map.put("favoriteTime", new C4381m.a("favoriteTime", "TEXT", false, 0, null, 1));
            C4381m c4381m = new C4381m("short_tv_favorite_state", map, new HashSet(0), new HashSet(0));
            C4381m c4381mM21718b = C4381m.m21718b(interfaceC29135b, "short_tv_favorite_state");
            if (!c4381m.equals(c4381mM21718b)) {
                return new AbstractC4310f0.a(false, "short_tv_favorite_state(com.transsion.shorttv.db.ShortTvFavoriteStateBean).\n Expected:\n" + c4381m + "\n Found:\n" + c4381mM21718b);
            }
            HashMap map2 = new HashMap(2);
            map2.put("subjectId", new C4381m.a("subjectId", "TEXT", true, 1, null, 1));
            map2.put("unlockedEps", new C4381m.a("unlockedEps", "TEXT", true, 0, null, 1));
            C4381m c4381m2 = new C4381m("short_tv_ad_unlock_state", map2, new HashSet(0), new HashSet(0));
            C4381m c4381mM21718b2 = C4381m.m21718b(interfaceC29135b, "short_tv_ad_unlock_state");
            if (c4381m2.equals(c4381mM21718b2)) {
                return new AbstractC4310f0.a(true, null);
            }
            return new AbstractC4310f0.a(false, "short_tv_ad_unlock_state(com.transsion.shorttv.db.ShortTvAdUnlockStateBean).\n Expected:\n" + c4381m2 + "\n Found:\n" + c4381mM21718b2);
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
        map.put(ShortTvFavoriteDao.class, C18849i.m79375h());
        map.put(ShortTvAdUnlockDao.class, C18844d.m79363h());
        return map;
    }

    @Override // com.transsion.shorttv.p314db.ShortTvDatabase
    /* JADX INFO: renamed from: j0 */
    public ShortTvAdUnlockDao mo79348j0() {
        ShortTvAdUnlockDao shortTvAdUnlockDao;
        if (this.f60840t != null) {
            return this.f60840t;
        }
        synchronized (this) {
            try {
                if (this.f60840t == null) {
                    this.f60840t = new C18844d(this);
                }
                shortTvAdUnlockDao = this.f60840t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return shortTvAdUnlockDao;
    }

    @Override // com.transsion.shorttv.p314db.ShortTvDatabase
    /* JADX INFO: renamed from: k0 */
    public ShortTvFavoriteDao mo79349k0() {
        ShortTvFavoriteDao shortTvFavoriteDao;
        if (this.f60839s != null) {
            return this.f60839s;
        }
        synchronized (this) {
            try {
                if (this.f60839s == null) {
                    this.f60839s = new C18849i(this);
                }
                shortTvFavoriteDao = this.f60839s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return shortTvFavoriteDao;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public AbstractC4310f0 mo21336r() {
        return new C18840a(2, "7d0cc9a2b371c1f7329d0d00d8bd31c1", "8d7f57b404f63d2b99b6f547f57644e9");
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: q */
    protected InvalidationTracker mo21335q() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "short_tv_favorite_state", "short_tv_ad_unlock_state");
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: v */
    public List mo21339v(Map map) {
        return new ArrayList();
    }
}
