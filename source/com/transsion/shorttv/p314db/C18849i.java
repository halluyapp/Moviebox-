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

/* JADX INFO: renamed from: com.transsion.shorttv.db.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C18849i implements ShortTvFavoriteDao {

    /* JADX INFO: renamed from: a */
    private final RoomDatabase f60859a;

    /* JADX INFO: renamed from: b */
    private final AbstractC4311g f60860b = new a();

    /* JADX INFO: renamed from: c */
    private final AbstractC4307e f60861c = new b();

    /* JADX INFO: renamed from: com.transsion.shorttv.db.i$a */
    class a extends AbstractC4311g {
        a() {
        }

        @Override // androidx.room.AbstractC4311g
        /* JADX INFO: renamed from: b */
        protected String mo21547b() {
            return "INSERT OR REPLACE INTO `short_tv_favorite_state` (`subjectId`,`favoriteNum`,`hasFavorite`,`favoriteTime`) VALUES (?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC4311g
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo21546a(InterfaceC29138e interfaceC29138e, ShortTvFavoriteStateBean shortTvFavoriteStateBean) {
            if (shortTvFavoriteStateBean.getSubjectId() == null) {
                interfaceC29138e.mo21482g(1);
            } else {
                interfaceC29138e.mo21481f(1, shortTvFavoriteStateBean.getSubjectId());
            }
            if (shortTvFavoriteStateBean.getFavoriteNum() == null) {
                interfaceC29138e.mo21482g(2);
            } else {
                interfaceC29138e.mo21481f(2, shortTvFavoriteStateBean.getFavoriteNum());
            }
            interfaceC29138e.mo21480c(3, shortTvFavoriteStateBean.getHasFavorite() ? 1L : 0L);
            if (shortTvFavoriteStateBean.getFavoriteTime() == null) {
                interfaceC29138e.mo21482g(4);
            } else {
                interfaceC29138e.mo21481f(4, shortTvFavoriteStateBean.getFavoriteTime());
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.db.i$b */
    class b extends AbstractC4307e {
        b() {
        }

        @Override // androidx.room.AbstractC4307e
        /* JADX INFO: renamed from: b */
        protected String mo21530b() {
            return "UPDATE OR ABORT `short_tv_favorite_state` SET `subjectId` = ?,`favoriteNum` = ?,`hasFavorite` = ?,`favoriteTime` = ? WHERE `subjectId` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC4307e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo21529a(InterfaceC29138e interfaceC29138e, ShortTvFavoriteStateBean shortTvFavoriteStateBean) {
            if (shortTvFavoriteStateBean.getSubjectId() == null) {
                interfaceC29138e.mo21482g(1);
            } else {
                interfaceC29138e.mo21481f(1, shortTvFavoriteStateBean.getSubjectId());
            }
            if (shortTvFavoriteStateBean.getFavoriteNum() == null) {
                interfaceC29138e.mo21482g(2);
            } else {
                interfaceC29138e.mo21481f(2, shortTvFavoriteStateBean.getFavoriteNum());
            }
            interfaceC29138e.mo21480c(3, shortTvFavoriteStateBean.getHasFavorite() ? 1L : 0L);
            if (shortTvFavoriteStateBean.getFavoriteTime() == null) {
                interfaceC29138e.mo21482g(4);
            } else {
                interfaceC29138e.mo21481f(4, shortTvFavoriteStateBean.getFavoriteTime());
            }
            if (shortTvFavoriteStateBean.getSubjectId() == null) {
                interfaceC29138e.mo21482g(5);
            } else {
                interfaceC29138e.mo21481f(5, shortTvFavoriteStateBean.getSubjectId());
            }
        }
    }

    public C18849i(RoomDatabase roomDatabase) {
        this.f60859a = roomDatabase;
    }

    /* JADX INFO: renamed from: h */
    public static List m79375h() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ Unit m79376i(ShortTvFavoriteStateBean shortTvFavoriteStateBean, InterfaceC29135b interfaceC29135b) throws Exception {
        this.f60860b.m21549d(interfaceC29135b, shortTvFavoriteStateBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ ShortTvFavoriteStateBean m79377j(String str, InterfaceC29135b interfaceC29135b) {
        InterfaceC29138e interfaceC29138eMo21493F0 = interfaceC29135b.mo21493F0("SELECT * FROM short_tv_favorite_state WHERE subjectId=?");
        boolean z11 = true;
        try {
            if (str == null) {
                interfaceC29138eMo21493F0.mo21482g(1);
            } else {
                interfaceC29138eMo21493F0.mo21481f(1, str);
            }
            int iM21710c = AbstractC4377i.m21710c(interfaceC29138eMo21493F0, "subjectId");
            int iM21710c2 = AbstractC4377i.m21710c(interfaceC29138eMo21493F0, "favoriteNum");
            int iM21710c3 = AbstractC4377i.m21710c(interfaceC29138eMo21493F0, "hasFavorite");
            int iM21710c4 = AbstractC4377i.m21710c(interfaceC29138eMo21493F0, "favoriteTime");
            ShortTvFavoriteStateBean shortTvFavoriteStateBean = null;
            String strMo21483o0 = null;
            if (interfaceC29138eMo21493F0.mo21478C0()) {
                String strMo21483o1 = interfaceC29138eMo21493F0.isNull(iM21710c) ? null : interfaceC29138eMo21493F0.mo21483o0(iM21710c);
                String strMo21483o2 = interfaceC29138eMo21493F0.isNull(iM21710c2) ? null : interfaceC29138eMo21493F0.mo21483o0(iM21710c2);
                if (((int) interfaceC29138eMo21493F0.getLong(iM21710c3)) == 0) {
                    z11 = false;
                }
                if (!interfaceC29138eMo21493F0.isNull(iM21710c4)) {
                    strMo21483o0 = interfaceC29138eMo21493F0.mo21483o0(iM21710c4);
                }
                shortTvFavoriteStateBean = new ShortTvFavoriteStateBean(strMo21483o1, strMo21483o2, z11, strMo21483o0);
            }
            interfaceC29138eMo21493F0.close();
            return shortTvFavoriteStateBean;
        } catch (Throwable th2) {
            interfaceC29138eMo21493F0.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ Unit m79378k(ShortTvFavoriteStateBean shortTvFavoriteStateBean, InterfaceC29135b interfaceC29135b) throws Exception {
        this.f60861c.m21531c(interfaceC29135b, shortTvFavoriteStateBean);
        return Unit.f75682a;
    }

    @Override // com.transsion.shorttv.p314db.ShortTvFavoriteDao
    /* JADX INFO: renamed from: a */
    public Object mo79355a(final String str, Continuation continuation) {
        return AbstractC4370b.m21691f(this.f60859a, true, false, new Function1() { // from class: com.transsion.shorttv.db.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C18849i.m79377j(str, (InterfaceC29135b) obj);
            }
        }, continuation);
    }

    @Override // com.transsion.shorttv.p314db.ShortTvFavoriteDao
    /* JADX INFO: renamed from: b */
    public Object mo79356b(final ShortTvFavoriteStateBean shortTvFavoriteStateBean, Continuation continuation) {
        shortTvFavoriteStateBean.getClass();
        return AbstractC4370b.m21691f(this.f60859a, false, true, new Function1() { // from class: com.transsion.shorttv.db.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f60855a.m79378k(shortTvFavoriteStateBean, (InterfaceC29135b) obj);
            }
        }, continuation);
    }

    @Override // com.transsion.shorttv.p314db.ShortTvFavoriteDao
    /* JADX INFO: renamed from: c */
    public Object mo79357c(final ShortTvFavoriteStateBean shortTvFavoriteStateBean, Continuation continuation) {
        shortTvFavoriteStateBean.getClass();
        return AbstractC4370b.m21691f(this.f60859a, false, true, new Function1() { // from class: com.transsion.shorttv.db.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f60857a.m79376i(shortTvFavoriteStateBean, (InterfaceC29135b) obj);
            }
        }, continuation);
    }

    @Override // com.transsion.shorttv.p314db.ShortTvFavoriteDao
    /* JADX INFO: renamed from: d */
    public Object mo79358d(ShortTvFavoriteStateBean shortTvFavoriteStateBean, Continuation continuation) {
        return ShortTvFavoriteDao.DefaultImpls.m79359a(this, shortTvFavoriteStateBean, continuation);
    }
}
