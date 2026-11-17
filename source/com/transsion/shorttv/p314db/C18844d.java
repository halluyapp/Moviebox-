package com.transsion.shorttv.p314db;

import androidx.room.AbstractC4307e;
import androidx.room.AbstractC4311g;
import androidx.room.RoomDatabase;
import androidx.room.util.AbstractC4370b;
import androidx.room.util.AbstractC4377i;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p966z3.InterfaceC29135b;
import p966z3.InterfaceC29138e;

/* JADX INFO: renamed from: com.transsion.shorttv.db.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C18844d implements ShortTvAdUnlockDao {

    /* JADX INFO: renamed from: a */
    private final RoomDatabase f60847a;

    /* JADX INFO: renamed from: b */
    private final AbstractC4311g f60848b = new a();

    /* JADX INFO: renamed from: c */
    private final AbstractC4307e f60849c = new b();

    /* JADX INFO: renamed from: com.transsion.shorttv.db.d$a */
    class a extends AbstractC4311g {
        a() {
        }

        @Override // androidx.room.AbstractC4311g
        /* JADX INFO: renamed from: b */
        protected String mo21547b() {
            return "INSERT OR REPLACE INTO `short_tv_ad_unlock_state` (`subjectId`,`unlockedEps`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC4311g
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo21546a(InterfaceC29138e interfaceC29138e, C18845e c18845e) {
            if (c18845e.m79369a() == null) {
                interfaceC29138e.mo21482g(1);
            } else {
                interfaceC29138e.mo21481f(1, c18845e.m79369a());
            }
            if (c18845e.m79370b() == null) {
                interfaceC29138e.mo21482g(2);
            } else {
                interfaceC29138e.mo21481f(2, c18845e.m79370b());
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.db.d$b */
    class b extends AbstractC4307e {
        b() {
        }

        @Override // androidx.room.AbstractC4307e
        /* JADX INFO: renamed from: b */
        protected String mo21530b() {
            return "UPDATE OR ABORT `short_tv_ad_unlock_state` SET `subjectId` = ?,`unlockedEps` = ? WHERE `subjectId` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC4307e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo21529a(InterfaceC29138e interfaceC29138e, C18845e c18845e) {
            if (c18845e.m79369a() == null) {
                interfaceC29138e.mo21482g(1);
            } else {
                interfaceC29138e.mo21481f(1, c18845e.m79369a());
            }
            if (c18845e.m79370b() == null) {
                interfaceC29138e.mo21482g(2);
            } else {
                interfaceC29138e.mo21481f(2, c18845e.m79370b());
            }
            if (c18845e.m79369a() == null) {
                interfaceC29138e.mo21482g(3);
            } else {
                interfaceC29138e.mo21481f(3, c18845e.m79369a());
            }
        }
    }

    public C18844d(RoomDatabase roomDatabase) {
        this.f60847a = roomDatabase;
    }

    /* JADX INFO: renamed from: h */
    public static List m79363h() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ Unit m79364i(C18845e c18845e, InterfaceC29135b interfaceC29135b) throws Exception {
        this.f60848b.m21549d(interfaceC29135b, c18845e);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C18845e m79365j(String str, InterfaceC29135b interfaceC29135b) {
        InterfaceC29138e interfaceC29138eMo21493F0 = interfaceC29135b.mo21493F0("SELECT * FROM short_tv_ad_unlock_state WHERE subjectId=?");
        try {
            if (str == null) {
                interfaceC29138eMo21493F0.mo21482g(1);
            } else {
                interfaceC29138eMo21493F0.mo21481f(1, str);
            }
            int iM21710c = AbstractC4377i.m21710c(interfaceC29138eMo21493F0, "subjectId");
            int iM21710c2 = AbstractC4377i.m21710c(interfaceC29138eMo21493F0, "unlockedEps");
            C18845e c18845e = null;
            String strMo21483o0 = null;
            if (interfaceC29138eMo21493F0.mo21478C0()) {
                String strMo21483o1 = interfaceC29138eMo21493F0.isNull(iM21710c) ? null : interfaceC29138eMo21493F0.mo21483o0(iM21710c);
                if (!interfaceC29138eMo21493F0.isNull(iM21710c2)) {
                    strMo21483o0 = interfaceC29138eMo21493F0.mo21483o0(iM21710c2);
                }
                c18845e = new C18845e(strMo21483o1, strMo21483o0);
            }
            interfaceC29138eMo21493F0.close();
            return c18845e;
        } catch (Throwable th2) {
            interfaceC29138eMo21493F0.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ Unit m79366k(C18845e c18845e, InterfaceC29135b interfaceC29135b) throws Exception {
        this.f60849c.m21531c(interfaceC29135b, c18845e);
        return Unit.f75682a;
    }

    @Override // com.transsion.shorttv.p314db.ShortTvAdUnlockDao
    /* JADX INFO: renamed from: a */
    public Object mo79340a(final String str, Continuation continuation) {
        return AbstractC4370b.m21691f(this.f60847a, true, false, new Function1() { // from class: com.transsion.shorttv.db.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C18844d.m79365j(str, (InterfaceC29135b) obj);
            }
        }, continuation);
    }

    @Override // com.transsion.shorttv.p314db.ShortTvAdUnlockDao
    /* JADX INFO: renamed from: b */
    public Object mo79341b(C18845e c18845e, Continuation continuation) {
        return ShortTvAdUnlockDao.DefaultImpls.m79344a(this, c18845e, continuation);
    }

    @Override // com.transsion.shorttv.p314db.ShortTvAdUnlockDao
    /* JADX INFO: renamed from: c */
    public Object mo79342c(final C18845e c18845e, Continuation continuation) {
        c18845e.getClass();
        return AbstractC4370b.m21691f(this.f60847a, false, true, new Function1() { // from class: com.transsion.shorttv.db.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f60843a.m79366k(c18845e, (InterfaceC29135b) obj);
            }
        }, continuation);
    }

    @Override // com.transsion.shorttv.p314db.ShortTvAdUnlockDao
    /* JADX INFO: renamed from: d */
    public Object mo79343d(final C18845e c18845e, Continuation continuation) {
        c18845e.getClass();
        return AbstractC4370b.m21691f(this.f60847a, false, true, new Function1() { // from class: com.transsion.shorttv.db.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f60845a.m79364i(c18845e, (InterfaceC29135b) obj);
            }
        }, continuation);
    }
}
