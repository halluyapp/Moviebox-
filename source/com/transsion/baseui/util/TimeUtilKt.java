package com.transsion.baseui.util;

import android.app.Application;
import com.blankj.utilcode.util.AbstractC5780c0;
import com.blankj.utilcode.util.Utils;
import com.transsion.baseui.R$plurals;
import com.transsion.baseui.R$string;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.InterfaceC25204t1;
import kotlinx.coroutines.flow.AbstractC25001c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class TimeUtilKt {
    /* JADX INFO: renamed from: a */
    public static final String m65649a(Integer num) {
        String str;
        String strValueOf;
        String strValueOf2;
        if (num == null) {
            return "00:00";
        }
        if (num.intValue() <= 0) {
            return "00:01";
        }
        int iIntValue = num.intValue() / 3600;
        int iIntValue2 = (num.intValue() / 60) % 60;
        int iIntValue3 = num.intValue() % 60;
        if (iIntValue > 0) {
            str = iIntValue + ":";
        } else {
            str = "";
        }
        if (iIntValue2 < 10) {
            strValueOf = "0" + iIntValue2;
        } else {
            strValueOf = String.valueOf(iIntValue2);
        }
        if (iIntValue3 < 10) {
            strValueOf2 = "0" + iIntValue3;
        } else {
            strValueOf2 = String.valueOf(iIntValue3);
        }
        return str + strValueOf + ":" + strValueOf2;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC25204t1 m65650b(int i11, InterfaceC25149n0 scope, Function1 onTick, Function0 function0) {
        Intrinsics.m97802h(scope, "scope");
        Intrinsics.m97802h(onTick, "onTick");
        return AbstractC25001c.m98802u(AbstractC25001c.m98804w(AbstractC25001c.m98805x(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new TimeUtilKt$countdownByFlow$1(i11, null)), C25220y0.m99269c()), new TimeUtilKt$countdownByFlow$2(onTick, null)), new TimeUtilKt$countdownByFlow$3(function0, null)), scope);
    }

    /* JADX INFO: renamed from: c */
    public static final int m65651c() {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(1) * 10000) + ((calendar.get(2) + 1) * 100) + calendar.get(5);
    }

    /* JADX INFO: renamed from: d */
    public static final int m65652d(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        return (calendar.get(1) * 10000) + ((calendar.get(2) + 1) * 100) + calendar.get(5);
    }

    /* JADX INFO: renamed from: e */
    public static final String m65653e(long j11) {
        String strM27344j = AbstractC5780c0.m27344j(j11, AbstractC5780c0.m27338d("yyyy/MM/dd HH:mm:ss"));
        Intrinsics.m97801g(strM27344j, "millis2String(...)");
        return strM27344j;
    }

    /* JADX INFO: renamed from: f */
    public static final String m65654f(int i11) {
        int i12 = i11 / 3600;
        int i13 = (i11 % 3600) / 60;
        int i14 = i11 % 60;
        StringBuilder sb2 = new StringBuilder();
        if (i12 > 0) {
            sb2.append(i13);
            sb2.append(" h ");
        }
        if (i13 > 0) {
            sb2.append(i13);
            sb2.append(" min ");
        }
        if (i14 > 0) {
            sb2.append(i14);
            sb2.append(" sec");
        }
        String string = sb2.toString();
        Intrinsics.m97801g(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: g */
    public static final String m65655g(int i11) {
        int i12 = i11 / 3600;
        int i13 = (i11 % 3600) / 60;
        StringBuilder sb2 = new StringBuilder();
        if (i12 > 0) {
            sb2.append(i12);
            sb2.append("h");
        }
        if (i13 > 0) {
            sb2.append(i13);
            sb2.append("m");
        }
        String string = sb2.toString();
        Intrinsics.m97801g(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: h */
    public static final String m65656h(long j11) {
        long j12 = j11 / ((long) 1000);
        long j13 = 60;
        long j14 = j12 % j13;
        long j15 = (j12 / j13) % j13;
        long j16 = j12 / ((long) 3600);
        if (j16 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j16), Long.valueOf(j15), Long.valueOf(j14)}, 3));
            Intrinsics.m97801g(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.f75910a;
        String str2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j15), Long.valueOf(j14)}, 2));
        Intrinsics.m97801g(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: renamed from: i */
    private static final String m65657i(long j11, Integer num) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j11;
        Application applicationM27275a = Utils.m27275a();
        if (jCurrentTimeMillis < TimeUnit.MINUTES.toMillis(1L)) {
            String string = applicationM27275a.getString(R$string.time_just_now);
            Intrinsics.m97801g(string, "getString(...)");
            return string;
        }
        if (jCurrentTimeMillis < TimeUnit.HOURS.toMillis(1L)) {
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(jCurrentTimeMillis);
            String quantityString = applicationM27275a.getResources().getQuantityString(R$plurals.time_minutes_ago, minutes, Integer.valueOf(minutes));
            Intrinsics.m97799e(quantityString);
            return quantityString;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (jCurrentTimeMillis < timeUnit.toMillis(1L)) {
            int hours = (int) TimeUnit.MILLISECONDS.toHours(jCurrentTimeMillis);
            String quantityString2 = applicationM27275a.getResources().getQuantityString(R$plurals.time_hours_ago, hours, Integer.valueOf(hours));
            Intrinsics.m97799e(quantityString2);
            return quantityString2;
        }
        if (jCurrentTimeMillis < timeUnit.toMillis(7L)) {
            int days = (int) TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis);
            String quantityString3 = applicationM27275a.getResources().getQuantityString(R$plurals.time_days_ago, days, Integer.valueOf(days));
            Intrinsics.m97799e(quantityString3);
            return quantityString3;
        }
        if (jCurrentTimeMillis < timeUnit.toMillis(30L)) {
            int days2 = (int) (TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis) / ((long) 7));
            String quantityString4 = applicationM27275a.getResources().getQuantityString(R$plurals.time_weeks_ago, days2, Integer.valueOf(days2));
            Intrinsics.m97799e(quantityString4);
            return quantityString4;
        }
        int days3 = (int) (TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis) / ((long) 30));
        if (num != null) {
            days3 = RangesKt.m97938h(days3, num.intValue());
        }
        String quantityString5 = applicationM27275a.getResources().getQuantityString(R$plurals.time_months_ago, days3, Integer.valueOf(days3));
        Intrinsics.m97799e(quantityString5);
        return quantityString5;
    }

    /* JADX INFO: renamed from: j */
    public static final String m65658j(long j11) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j11;
        Application applicationM27275a = Utils.m27275a();
        if (jCurrentTimeMillis < TimeUnit.MINUTES.toMillis(1L)) {
            String string = applicationM27275a.getString(R$string.time_just_now);
            Intrinsics.m97801g(string, "getString(...)");
            return string;
        }
        if (jCurrentTimeMillis < TimeUnit.HOURS.toMillis(1L)) {
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(jCurrentTimeMillis);
            String quantityString = applicationM27275a.getResources().getQuantityString(R$plurals.time_minutes_ago, minutes, Integer.valueOf(minutes));
            Intrinsics.m97799e(quantityString);
            return quantityString;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (jCurrentTimeMillis < timeUnit.toMillis(1L)) {
            int hours = (int) TimeUnit.MILLISECONDS.toHours(jCurrentTimeMillis);
            String quantityString2 = applicationM27275a.getResources().getQuantityString(R$plurals.time_hours_ago, hours, Integer.valueOf(hours));
            Intrinsics.m97799e(quantityString2);
            return quantityString2;
        }
        if (jCurrentTimeMillis < timeUnit.toMillis(7L)) {
            int days = (int) TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis);
            String quantityString3 = applicationM27275a.getResources().getQuantityString(R$plurals.time_days_ago, days, Integer.valueOf(days));
            Intrinsics.m97799e(quantityString3);
            return quantityString3;
        }
        if (jCurrentTimeMillis < timeUnit.toMillis(30L)) {
            int days2 = (int) (TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis) / ((long) 7));
            String quantityString4 = applicationM27275a.getResources().getQuantityString(R$plurals.time_weeks_ago, days2, Integer.valueOf(days2));
            Intrinsics.m97799e(quantityString4);
            return quantityString4;
        }
        if (jCurrentTimeMillis < timeUnit.toMillis(365L)) {
            int days3 = (int) (TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis) / ((long) 30));
            String quantityString5 = applicationM27275a.getResources().getQuantityString(R$plurals.time_months_ago, days3, Integer.valueOf(days3));
            Intrinsics.m97799e(quantityString5);
            return quantityString5;
        }
        int days4 = (int) (TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis) / ((long) 365));
        String quantityString6 = applicationM27275a.getResources().getQuantityString(R$plurals.time_years_ago, days4, Integer.valueOf(days4));
        Intrinsics.m97799e(quantityString6);
        return quantityString6;
    }

    /* JADX INFO: renamed from: k */
    public static final String m65659k(long j11) {
        return m65657i(j11, 6);
    }

    /* JADX INFO: renamed from: l */
    public static final String m65660l(long j11) {
        int i11 = Calendar.getInstance().get(1);
        String strM27344j = AbstractC5780c0.m27344j(j11, AbstractC5780c0.m27338d("yyyy-MM-dd HH:mm:ss"));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(AbstractC5780c0.m27345k(strM27344j));
        if (i11 == calendar.get(1)) {
            String strM27344j2 = AbstractC5780c0.m27344j(j11, AbstractC5780c0.m27338d("MM-dd"));
            Intrinsics.m97799e(strM27344j2);
            return strM27344j2;
        }
        String strM27344j3 = AbstractC5780c0.m27344j(j11, AbstractC5780c0.m27338d("yyyy-MM-dd"));
        Intrinsics.m97799e(strM27344j3);
        return strM27344j3;
    }

    /* JADX INFO: renamed from: m */
    public static final String m65661m(String str) {
        long j11;
        if (str != null) {
            try {
                j11 = Long.parseLong(str);
            } catch (Exception unused) {
                return "0";
            }
        } else {
            j11 = 0;
        }
        return m65660l(j11);
    }

    /* JADX INFO: renamed from: n */
    public static final String m65662n(long j11) {
        String strM27344j = AbstractC5780c0.m27344j(j11, AbstractC5780c0.m27338d("yyyy-MM-dd"));
        Intrinsics.m97801g(strM27344j, "millis2String(...)");
        return strM27344j;
    }

    /* JADX INFO: renamed from: o */
    public static final String m65663o(long j11) {
        if (j11 == 0) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = j11 >= 3600000 ? new SimpleDateFormat("HH:mm:ss") : new SimpleDateFormat("mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
        String str = simpleDateFormat.format(Long.valueOf(j11));
        Intrinsics.m97801g(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: p */
    public static final String m65664p(long j11) {
        StringBuilder sb2 = new StringBuilder();
        if (j11 > 3600) {
            long j12 = 3600;
            long j13 = j11 / j12;
            j11 -= j12 * j13;
            if (j13 < 10) {
                sb2.append("0");
            }
            sb2.append(j13);
            sb2.append(":");
        }
        if (j11 > 60) {
            long j14 = 60;
            long j15 = j11 / j14;
            j11 -= j14 * j15;
            if (j15 < 10) {
                sb2.append("0");
            }
            sb2.append(j15);
            sb2.append(":");
        } else {
            sb2.append("00:");
        }
        if (j11 <= 0) {
            sb2.append("00");
        } else if (j11 > 60) {
            sb2.append("59");
        } else if (j11 < 10) {
            sb2.append("0" + j11);
        } else {
            sb2.append(j11);
        }
        String string = sb2.toString();
        Intrinsics.m97801g(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: q */
    public static final int m65665q(long j11) {
        long jCurrentTimeMillis = j11 - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            return -1;
        }
        return (int) TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: r */
    public static final String m65666r(long j11) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j11);
        long j12 = 60;
        long minutes = timeUnit.toMinutes(j11) % j12;
        long j13 = j11 % j12;
        if (hours > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str = String.format(Locale.ROOT, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(j13)}, 3));
            Intrinsics.m97801g(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.f75910a;
        String str2 = String.format(Locale.ROOT, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(j13)}, 2));
        Intrinsics.m97801g(str2, "format(...)");
        return str2;
    }
}
