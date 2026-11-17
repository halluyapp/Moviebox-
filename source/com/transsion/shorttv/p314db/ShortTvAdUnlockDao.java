package com.transsion.shorttv.p314db;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes6.dex */
public interface ShortTvAdUnlockDao {

    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        public static Object m79344a(ShortTvAdUnlockDao shortTvAdUnlockDao, C18845e c18845e, Continuation continuation) throws Throwable {
            ShortTvAdUnlockDao$insertOrUpdate$1 shortTvAdUnlockDao$insertOrUpdate$1;
            if (continuation instanceof ShortTvAdUnlockDao$insertOrUpdate$1) {
                shortTvAdUnlockDao$insertOrUpdate$1 = (ShortTvAdUnlockDao$insertOrUpdate$1) continuation;
                int i11 = shortTvAdUnlockDao$insertOrUpdate$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    shortTvAdUnlockDao$insertOrUpdate$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    shortTvAdUnlockDao$insertOrUpdate$1 = new ShortTvAdUnlockDao$insertOrUpdate$1(continuation);
                }
            } else {
                shortTvAdUnlockDao$insertOrUpdate$1 = new ShortTvAdUnlockDao$insertOrUpdate$1(continuation);
            }
            Object objMo79340a = shortTvAdUnlockDao$insertOrUpdate$1.result;
            Object objF = IntrinsicsKt.m97630f();
            int i12 = shortTvAdUnlockDao$insertOrUpdate$1.label;
            if (i12 == 0) {
                ResultKt.m97107b(objMo79340a);
                String strM79369a = c18845e.m79369a();
                shortTvAdUnlockDao$insertOrUpdate$1.L$0 = shortTvAdUnlockDao;
                shortTvAdUnlockDao$insertOrUpdate$1.L$1 = c18845e;
                shortTvAdUnlockDao$insertOrUpdate$1.label = 1;
                objMo79340a = shortTvAdUnlockDao.mo79340a(strM79369a, shortTvAdUnlockDao$insertOrUpdate$1);
                if (objMo79340a == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    if (i12 == 2) {
                        ResultKt.m97107b(objMo79340a);
                        return Unit.f75682a;
                    }
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(objMo79340a);
                    return Unit.f75682a;
                }
                c18845e = (C18845e) shortTvAdUnlockDao$insertOrUpdate$1.L$1;
                shortTvAdUnlockDao = (ShortTvAdUnlockDao) shortTvAdUnlockDao$insertOrUpdate$1.L$0;
                ResultKt.m97107b(objMo79340a);
            }
            if (objMo79340a == null) {
                shortTvAdUnlockDao$insertOrUpdate$1.L$0 = null;
                shortTvAdUnlockDao$insertOrUpdate$1.L$1 = null;
                shortTvAdUnlockDao$insertOrUpdate$1.label = 2;
                if (shortTvAdUnlockDao.mo79343d(c18845e, shortTvAdUnlockDao$insertOrUpdate$1) == objF) {
                    return objF;
                }
                return Unit.f75682a;
            }
            shortTvAdUnlockDao$insertOrUpdate$1.L$0 = null;
            shortTvAdUnlockDao$insertOrUpdate$1.L$1 = null;
            shortTvAdUnlockDao$insertOrUpdate$1.label = 3;
            if (shortTvAdUnlockDao.mo79342c(c18845e, shortTvAdUnlockDao$insertOrUpdate$1) == objF) {
                return objF;
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: a */
    Object mo79340a(String str, Continuation continuation);

    /* JADX INFO: renamed from: b */
    Object mo79341b(C18845e c18845e, Continuation continuation);

    /* JADX INFO: renamed from: c */
    Object mo79342c(C18845e c18845e, Continuation continuation);

    /* JADX INFO: renamed from: d */
    Object mo79343d(C18845e c18845e, Continuation continuation);
}
