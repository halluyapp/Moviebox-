package com.transsion.shorttv.p314db;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes6.dex */
public interface ShortTvFavoriteDao {

    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        public static Object m79359a(ShortTvFavoriteDao shortTvFavoriteDao, ShortTvFavoriteStateBean shortTvFavoriteStateBean, Continuation continuation) throws Throwable {
            ShortTvFavoriteDao$insertOrUpdate$1 shortTvFavoriteDao$insertOrUpdate$1;
            if (continuation instanceof ShortTvFavoriteDao$insertOrUpdate$1) {
                shortTvFavoriteDao$insertOrUpdate$1 = (ShortTvFavoriteDao$insertOrUpdate$1) continuation;
                int i11 = shortTvFavoriteDao$insertOrUpdate$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    shortTvFavoriteDao$insertOrUpdate$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    shortTvFavoriteDao$insertOrUpdate$1 = new ShortTvFavoriteDao$insertOrUpdate$1(continuation);
                }
            } else {
                shortTvFavoriteDao$insertOrUpdate$1 = new ShortTvFavoriteDao$insertOrUpdate$1(continuation);
            }
            Object objMo79355a = shortTvFavoriteDao$insertOrUpdate$1.result;
            Object objF = IntrinsicsKt.m97630f();
            int i12 = shortTvFavoriteDao$insertOrUpdate$1.label;
            if (i12 == 0) {
                ResultKt.m97107b(objMo79355a);
                String subjectId = shortTvFavoriteStateBean.getSubjectId();
                shortTvFavoriteDao$insertOrUpdate$1.L$0 = shortTvFavoriteDao;
                shortTvFavoriteDao$insertOrUpdate$1.L$1 = shortTvFavoriteStateBean;
                shortTvFavoriteDao$insertOrUpdate$1.label = 1;
                objMo79355a = shortTvFavoriteDao.mo79355a(subjectId, shortTvFavoriteDao$insertOrUpdate$1);
                if (objMo79355a == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    if (i12 == 2) {
                        ResultKt.m97107b(objMo79355a);
                        return Unit.f75682a;
                    }
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(objMo79355a);
                    return Unit.f75682a;
                }
                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) shortTvFavoriteDao$insertOrUpdate$1.L$1;
                shortTvFavoriteDao = (ShortTvFavoriteDao) shortTvFavoriteDao$insertOrUpdate$1.L$0;
                ResultKt.m97107b(objMo79355a);
            }
            if (objMo79355a == null) {
                shortTvFavoriteDao$insertOrUpdate$1.L$0 = null;
                shortTvFavoriteDao$insertOrUpdate$1.L$1 = null;
                shortTvFavoriteDao$insertOrUpdate$1.label = 2;
                if (shortTvFavoriteDao.mo79357c(shortTvFavoriteStateBean, shortTvFavoriteDao$insertOrUpdate$1) == objF) {
                    return objF;
                }
                return Unit.f75682a;
            }
            shortTvFavoriteDao$insertOrUpdate$1.L$0 = null;
            shortTvFavoriteDao$insertOrUpdate$1.L$1 = null;
            shortTvFavoriteDao$insertOrUpdate$1.label = 3;
            if (shortTvFavoriteDao.mo79356b(shortTvFavoriteStateBean, shortTvFavoriteDao$insertOrUpdate$1) == objF) {
                return objF;
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: a */
    Object mo79355a(String str, Continuation continuation);

    /* JADX INFO: renamed from: b */
    Object mo79356b(ShortTvFavoriteStateBean shortTvFavoriteStateBean, Continuation continuation);

    /* JADX INFO: renamed from: c */
    Object mo79357c(ShortTvFavoriteStateBean shortTvFavoriteStateBean, Continuation continuation);

    /* JADX INFO: renamed from: d */
    Object mo79358d(ShortTvFavoriteStateBean shortTvFavoriteStateBean, Continuation continuation);
}
