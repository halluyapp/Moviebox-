package com.transsion.shorttv.base.image.blurhash;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.transsion.shorttv.base.image.blurhash.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C18765a {

    /* JADX INFO: renamed from: a */
    public static final C18765a f60610a = new C18765a();

    /* JADX INFO: renamed from: b */
    private static final HashMap f60611b = new HashMap();

    /* JADX INFO: renamed from: c */
    private static final HashMap f60612c = new HashMap();

    /* JADX INFO: renamed from: d */
    private static final Map f60613d;

    static {
        List listO = CollectionsKt.m97509o('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '#', '$', '%', '*', '+', ',', '-', '.', ':', ';', '=', '?', '@', '[', ']', '^', '_', '{', '|', '}', '~');
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(listO, 10));
        int i11 = 0;
        for (Object obj : listO) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            Character ch2 = (Character) obj;
            ch2.charValue();
            arrayList.add(TuplesKt.m97108a(ch2, Integer.valueOf(i11)));
            i11 = i12;
        }
        f60613d = MapsKt.m97584s(arrayList);
    }

    private C18765a() {
    }

    /* JADX INFO: renamed from: a */
    private final Bitmap m79081a(int i11, int i12, int i13, int i14, float[][] fArr, boolean z11) {
        int[] iArr = new int[i11 * i12];
        boolean z12 = (z11 && f60611b.containsKey(Integer.valueOf(i11 * i13))) ? false : true;
        double[] dArrM79085f = m79085f(z12, i11, i13);
        boolean z13 = (z11 && f60612c.containsKey(Integer.valueOf(i12 * i14))) ? false : true;
        double[] dArrM79086g = m79086g(z13, i12, i14);
        int i15 = 0;
        while (i15 < i12) {
            int i16 = 0;
            while (i16 < i11) {
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                int i17 = 0;
                while (i17 < i14) {
                    float f14 = f11;
                    float f15 = f12;
                    float f16 = f13;
                    int i18 = 0;
                    while (i18 < i13) {
                        int i19 = i18;
                        int i20 = i17;
                        int i21 = i16;
                        boolean z14 = z13;
                        i15 = i15;
                        float fM79087h = (float) (m79087h(dArrM79086g, z14, i20, i14, i15, i12) * m79087h(dArrM79085f, z12, i19, i13, i21, i11));
                        float[] fArr2 = fArr[(i20 * i13) + i19];
                        f14 += fArr2[0] * fM79087h;
                        f15 += fArr2[1] * fM79087h;
                        f16 += fArr2[2] * fM79087h;
                        i18 = i19 + 1;
                        i17 = i20;
                        i16 = i21;
                        z13 = z14;
                    }
                    i17++;
                    f11 = f14;
                    f12 = f15;
                    f13 = f16;
                }
                int i22 = i16;
                iArr[i22 + (i11 * i15)] = Color.rgb(m79088i(f11), m79088i(f12), m79088i(f13));
                i16 = i22 + 1;
            }
            i15++;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i11, i12, Bitmap.Config.ARGB_8888);
        Intrinsics.m97801g(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: c */
    private final int m79082c(String str, int i11, int i12) {
        int i13 = 0;
        while (i11 < i12) {
            Integer num = (Integer) f60613d.get(Character.valueOf(str.charAt(i11)));
            int iIntValue = num != null ? num.intValue() : -1;
            if (iIntValue != -1) {
                i13 = (i13 * 83) + iIntValue;
            }
            i11++;
        }
        return i13;
    }

    /* JADX INFO: renamed from: d */
    private final float[] m79083d(int i11, float f11) {
        return new float[]{m79089j(((i11 / 361) - 9) / 9.0f) * f11, m79089j((((i11 / 19) % 19) - 9) / 9.0f) * f11, m79089j(((i11 % 19) - 9) / 9.0f) * f11};
    }

    /* JADX INFO: renamed from: e */
    private final float[] m79084e(int i11) {
        return new float[]{m79090k(i11 >> 16), m79090k((i11 >> 8) & 255), m79090k(i11 & 255)};
    }

    /* JADX INFO: renamed from: f */
    private final double[] m79085f(boolean z11, int i11, int i12) {
        if (!z11) {
            Object obj = f60611b.get(Integer.valueOf(i11 * i12));
            Intrinsics.m97799e(obj);
            return (double[]) obj;
        }
        int i13 = i11 * i12;
        double[] dArr = new double[i13];
        f60611b.put(Integer.valueOf(i13), dArr);
        return dArr;
    }

    /* JADX INFO: renamed from: g */
    private final double[] m79086g(boolean z11, int i11, int i12) {
        if (!z11) {
            Object obj = f60612c.get(Integer.valueOf(i11 * i12));
            Intrinsics.m97799e(obj);
            return (double[]) obj;
        }
        int i13 = i11 * i12;
        double[] dArr = new double[i13];
        f60612c.put(Integer.valueOf(i13), dArr);
        return dArr;
    }

    /* JADX INFO: renamed from: h */
    private final double m79087h(double[] dArr, boolean z11, int i11, int i12, int i13, int i14) {
        if (z11) {
            dArr[(i12 * i13) + i11] = Math.cos(((((double) i13) * 3.141592653589793d) * ((double) i11)) / ((double) i14));
        }
        return dArr[i11 + (i12 * i13)];
    }

    /* JADX INFO: renamed from: i */
    private final int m79088i(float f11) {
        float fPow;
        float f12;
        float fK = RangesKt.m97941k(f11, 0.0f, 1.0f);
        if (fK <= 0.0031308f) {
            fPow = fK * 12.92f;
            f12 = 255.0f;
        } else {
            fPow = (((float) Math.pow(fK, 0.41666666f)) * 1.055f) - 0.055f;
            f12 = 255;
        }
        return (int) ((fPow * f12) + 0.5f);
    }

    /* JADX INFO: renamed from: j */
    private final float m79089j(float f11) {
        return Math.copySign((float) Math.pow(f11, 2.0f), f11);
    }

    /* JADX INFO: renamed from: k */
    private final float m79090k(int i11) {
        float f11 = i11 / 255.0f;
        return f11 <= 0.04045f ? f11 / 12.92f : (float) Math.pow((f11 + 0.055f) / 1.055f, 2.4f);
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m79091b(String str, int i11, int i12, float f11, boolean z11) {
        float[] fArrM79083d;
        if (str == null || str.length() < 6) {
            return null;
        }
        int iM79082c = m79082c(str, 0, 1);
        int i13 = (iM79082c % 9) + 1;
        int i14 = (iM79082c / 9) + 1;
        if (str.length() != (i13 * 2 * i14) + 4) {
            return null;
        }
        float fM79082c = (m79082c(str, 1, 2) + 1) / 166.0f;
        int i15 = i13 * i14;
        float[][] fArr = new float[i15][];
        for (int i16 = 0; i16 < i15; i16++) {
            if (i16 == 0) {
                C18765a c18765a = f60610a;
                fArrM79083d = c18765a.m79084e(c18765a.m79082c(str, 2, 6));
            } else {
                int i17 = i16 * 2;
                C18765a c18765a2 = f60610a;
                fArrM79083d = c18765a2.m79083d(c18765a2.m79082c(str, i17 + 4, i17 + 6), fM79082c * f11);
            }
            fArr[i16] = fArrM79083d;
        }
        return m79081a(i11, i12, i13, i14, fArr, z11);
    }
}
