package com.transsion.transfer.androidasync.http;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.transsion.transfer.androidasync.ByteBufferList;
import com.transsion.transfer.androidasync.C19939r;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p439gv.InterfaceC23680d;

/* JADX INFO: loaded from: classes6.dex */
abstract class HybiParser {

    /* JADX INFO: renamed from: w */
    private static final List f63304w = Arrays.asList(0, 1, 2, 8, 9, 10);

    /* JADX INFO: renamed from: x */
    private static final List f63305x = Arrays.asList(0, 1, 2);

    /* JADX INFO: renamed from: c */
    private int f63308c;

    /* JADX INFO: renamed from: d */
    private boolean f63309d;

    /* JADX INFO: renamed from: e */
    private boolean f63310e;

    /* JADX INFO: renamed from: f */
    private boolean f63311f;

    /* JADX INFO: renamed from: g */
    private int f63312g;

    /* JADX INFO: renamed from: h */
    private int f63313h;

    /* JADX INFO: renamed from: i */
    private int f63314i;

    /* JADX INFO: renamed from: j */
    private int f63315j;

    /* JADX INFO: renamed from: v */
    private C19939r f63327v;

    /* JADX INFO: renamed from: a */
    private boolean f63306a = true;

    /* JADX INFO: renamed from: b */
    private boolean f63307b = false;

    /* JADX INFO: renamed from: k */
    private byte[] f63316k = new byte[0];

    /* JADX INFO: renamed from: l */
    private byte[] f63317l = new byte[0];

    /* JADX INFO: renamed from: m */
    private boolean f63318m = false;

    /* JADX INFO: renamed from: n */
    private ByteArrayOutputStream f63319n = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: o */
    private Inflater f63320o = new Inflater(true);

    /* JADX INFO: renamed from: p */
    private byte[] f63321p = new byte[4096];

    /* JADX INFO: renamed from: q */
    InterfaceC23680d f63322q = new C19862a();

    /* JADX INFO: renamed from: r */
    InterfaceC23680d f63323r = new C19863b();

    /* JADX INFO: renamed from: s */
    InterfaceC23680d f63324s = new C19864c();

    /* JADX INFO: renamed from: t */
    InterfaceC23680d f63325t = new C19865d();

    /* JADX INFO: renamed from: u */
    InterfaceC23680d f63326u = new C19866e();

    public static class ProtocolError extends IOException {
        public ProtocolError(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.HybiParser$a */
    class C19862a implements InterfaceC23680d {
        C19862a() {
        }

        @Override // p439gv.InterfaceC23680d
        /* JADX INFO: renamed from: F */
        public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            try {
                HybiParser.this.m82650F(byteBufferList.m82501e());
            } catch (ProtocolError e11) {
                HybiParser.this.mo82678H(e11);
                e11.printStackTrace();
            }
            HybiParser.this.m82676C();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.HybiParser$b */
    class C19863b implements InterfaceC23680d {
        C19863b() {
        }

        @Override // p439gv.InterfaceC23680d
        /* JADX INFO: renamed from: F */
        public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            HybiParser.this.m82649E(byteBufferList.m82501e());
            HybiParser.this.m82676C();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.HybiParser$c */
    class C19864c implements InterfaceC23680d {
        C19864c() {
        }

        @Override // p439gv.InterfaceC23680d
        /* JADX INFO: renamed from: F */
        public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            byte[] bArr = new byte[HybiParser.this.f63313h];
            byteBufferList.m82504h(bArr);
            try {
                HybiParser.this.m82648D(bArr);
            } catch (ProtocolError e11) {
                HybiParser.this.mo82678H(e11);
                e11.printStackTrace();
            }
            HybiParser.this.m82676C();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.HybiParser$d */
    class C19865d implements InterfaceC23680d {
        C19865d() {
        }

        @Override // p439gv.InterfaceC23680d
        /* JADX INFO: renamed from: F */
        public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            HybiParser.this.f63316k = new byte[4];
            byteBufferList.m82504h(HybiParser.this.f63316k);
            HybiParser.this.f63308c = 4;
            HybiParser.this.m82676C();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.HybiParser$e */
    class C19866e implements InterfaceC23680d {
        C19866e() {
        }

        @Override // p439gv.InterfaceC23680d
        /* JADX INFO: renamed from: F */
        public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            HybiParser hybiParser = HybiParser.this;
            hybiParser.f63317l = new byte[hybiParser.f63314i];
            byteBufferList.m82504h(HybiParser.this.f63317l);
            try {
                HybiParser.this.m82666n();
            } catch (IOException e11) {
                HybiParser.this.mo82678H(e11);
                e11.printStackTrace();
            }
            HybiParser.this.f63308c = 0;
            HybiParser.this.m82676C();
        }
    }

    public HybiParser(InterfaceC19937p interfaceC19937p) {
        C19939r c19939r = new C19939r();
        this.f63327v = c19939r;
        interfaceC19937p.mo82426v(c19939r);
        m82676C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m82648D(byte[] bArr) {
        this.f63314i = m82671u(bArr);
        this.f63308c = this.f63310e ? 3 : 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public void m82649E(byte b11) {
        boolean z11 = (b11 & 128) == 128;
        this.f63310e = z11;
        int i11 = b11 & 127;
        this.f63314i = i11;
        if (i11 >= 0 && i11 <= 125) {
            this.f63308c = z11 ? 3 : 4;
        } else {
            this.f63313h = i11 == 126 ? 2 : 8;
            this.f63308c = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m82650F(byte b11) throws ProtocolError {
        boolean z11 = (b11 & 64) == 64;
        boolean z12 = (b11 & 32) == 32;
        boolean z13 = (b11 & 16) == 16;
        if ((!this.f63307b && z11) || z12 || z13) {
            throw new ProtocolError("RSV not zero");
        }
        this.f63309d = (b11 & 128) == 128;
        int i11 = b11 & 15;
        this.f63312g = i11;
        this.f63311f = z11;
        this.f63316k = new byte[0];
        this.f63317l = new byte[0];
        if (!f63304w.contains(Integer.valueOf(i11))) {
            throw new ProtocolError("Bad opcode");
        }
        if (!f63305x.contains(Integer.valueOf(this.f63312g)) && !this.f63309d) {
            throw new ProtocolError("Expected non-final packet");
        }
        this.f63308c = 1;
    }

    /* JADX INFO: renamed from: I */
    private void m82651I() {
        this.f63315j = 0;
        this.f63319n.reset();
    }

    /* JADX INFO: renamed from: M */
    private byte[] m82652M(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[bArr.length - i11];
        System.arraycopy(bArr, i11, bArr2, 0, bArr.length - i11);
        return bArr2;
    }

    /* JADX INFO: renamed from: l */
    private static long m82664l(byte[] bArr, int i11, int i12) {
        if (bArr.length < i12) {
            throw new IllegalArgumentException("length must be less than or equal to b.length");
        }
        long j11 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            j11 += (long) ((bArr[i13 + i11] & 255) << (((i12 - 1) - i13) * 8));
        }
        return j11;
    }

    /* JADX INFO: renamed from: m */
    private byte[] m82665m(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m82666n() throws IOException {
        int i11 = 0;
        byte[] bArrM82673w = m82673w(this.f63317l, this.f63316k, 0);
        if (this.f63311f) {
            try {
                bArrM82673w = m82672v(bArrM82673w);
            } catch (DataFormatException unused) {
                throw new IOException("Invalid deflated data");
            }
        }
        int i12 = this.f63312g;
        if (i12 == 0) {
            if (this.f63315j == 0) {
                throw new ProtocolError("Mode was not set.");
            }
            this.f63319n.write(bArrM82673w);
            if (this.f63309d) {
                byte[] byteArray = this.f63319n.toByteArray();
                if (this.f63315j == 1) {
                    mo82685y(m82667o(byteArray));
                } else {
                    mo82686z(byteArray);
                }
                m82651I();
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (this.f63309d) {
                mo82685y(m82667o(bArrM82673w));
                return;
            } else {
                this.f63315j = 1;
                this.f63319n.write(bArrM82673w);
                return;
            }
        }
        if (i12 == 2) {
            if (this.f63309d) {
                mo82686z(bArrM82673w);
                return;
            } else {
                this.f63315j = 2;
                this.f63319n.write(bArrM82673w);
                return;
            }
        }
        if (i12 == 8) {
            if (bArrM82673w.length >= 2) {
                i11 = (bArrM82673w[1] & 255) + ((bArrM82673w[0] & 255) * 256);
            }
            mo82684x(i11, bArrM82673w.length > 2 ? m82667o(m82652M(bArrM82673w, 2)) : null);
        } else if (i12 != 9) {
            if (i12 == 10) {
                mo82675B(m82667o(bArrM82673w));
            }
        } else {
            if (bArrM82673w.length > 125) {
                throw new ProtocolError("Ping payload too large");
            }
            String strM82667o = m82667o(bArrM82673w);
            mo82679J(m82669q(10, bArrM82673w, -1));
            mo82674A(strM82667o);
        }
    }

    /* JADX INFO: renamed from: o */
    private String m82667o(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: p */
    private byte[] m82668p(int i11, String str, int i12) {
        return m82669q(i11, m82665m(str), i12);
    }

    /* JADX INFO: renamed from: q */
    private byte[] m82669q(int i11, byte[] bArr, int i12) {
        return m82670r(i11, bArr, i12, 0, bArr.length);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dd  */
    /* JADX INFO: renamed from: r */
    private byte[] m82670r(int i11, byte[] bArr, int i12, int i13, int i14) {
        int i15;
        if (this.f63318m) {
            return null;
        }
        int i16 = i12 > 0 ? 2 : 0;
        int i17 = (i14 + i16) - i13;
        if (i17 <= 125) {
            i15 = 2;
        } else {
            i15 = i17 <= 65535 ? 4 : 10;
        }
        boolean z11 = this.f63306a;
        int i18 = (z11 ? 4 : 0) + i15;
        int i19 = z11 ? 128 : 0;
        byte[] bArr2 = new byte[i17 + i18];
        bArr2[0] = (byte) (((byte) i11) | (-128));
        if (i17 > 125) {
            if (i17 <= 65535) {
                bArr2[1] = (byte) (i19 | 126);
                bArr2[2] = (byte) (i17 / 256);
                bArr2[3] = (byte) (i17 & 255);
            } else {
                bArr2[1] = (byte) (i19 | 127);
                long j11 = i17;
                bArr2[2] = (byte) ((j11 / 72057594037927936L) & 255);
                bArr2[3] = (byte) ((j11 / 281474976710656L) & 255);
                bArr2[4] = (byte) ((j11 / 1099511627776L) & 255);
                bArr2[5] = (byte) ((j11 / TmcConstants.TEMP_FILE_RUNTIME_MAX_SIZE) & 255);
                bArr2[6] = (byte) ((j11 / 16777216) & 255);
                bArr2[7] = (byte) ((j11 / PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) & 255);
                bArr2[8] = (byte) ((j11 / 256) & 255);
                bArr2[9] = (byte) (i17 & 255);
            }
            if (i12 > 0) {
                bArr2[i18] = (byte) ((i12 / 256) & 255);
                bArr2[i18 + 1] = (byte) (i12 & 255);
            }
            System.arraycopy(bArr, i13, bArr2, i18 + i16, i14 - i13);
            if (this.f63306a) {
                byte[] bArr3 = {(byte) Math.floor(Math.random() * 256.0d), (byte) Math.floor(Math.random() * 256.0d), (byte) Math.floor(Math.random() * 256.0d), (byte) Math.floor(Math.random() * 256.0d)};
                System.arraycopy(bArr3, 0, bArr2, i15, 4);
                m82673w(bArr2, bArr3, i18);
            }
            return bArr2;
        }
        bArr2[1] = (byte) (i19 | i17);
        if (i12 > 0) {
            bArr2[i18] = (byte) ((i12 / 256) & 255);
            bArr2[i18 + 1] = (byte) (i12 & 255);
        }
        System.arraycopy(bArr, i13, bArr2, i18 + i16, i14 - i13);
        if (this.f63306a) {
            byte[] bArr4 = {(byte) Math.floor(Math.random() * 256.0d), (byte) Math.floor(Math.random() * 256.0d), (byte) Math.floor(Math.random() * 256.0d), (byte) Math.floor(Math.random() * 256.0d)};
            System.arraycopy(bArr4, 0, bArr2, i15, 4);
            m82673w(bArr2, bArr4, i18);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: u */
    private int m82671u(byte[] bArr) throws ProtocolError {
        long jM82664l = m82664l(bArr, 0, bArr.length);
        if (jM82664l >= 0 && jM82664l <= 2147483647L) {
            return (int) jM82664l;
        }
        throw new ProtocolError("Bad integer: " + jM82664l);
    }

    /* JADX INFO: renamed from: v */
    private byte[] m82672v(byte[] bArr) throws DataFormatException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f63320o.setInput(bArr);
        while (!this.f63320o.needsInput()) {
            byteArrayOutputStream.write(this.f63321p, 0, this.f63320o.inflate(this.f63321p));
        }
        this.f63320o.setInput(new byte[]{0, 0, -1, -1});
        while (!this.f63320o.needsInput()) {
            byteArrayOutputStream.write(this.f63321p, 0, this.f63320o.inflate(this.f63321p));
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: w */
    private static byte[] m82673w(byte[] bArr, byte[] bArr2, int i11) {
        if (bArr2.length == 0) {
            return bArr;
        }
        for (int i12 = 0; i12 < bArr.length - i11; i12++) {
            int i13 = i11 + i12;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i12 % 4]);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: A */
    protected abstract void mo82674A(String str);

    /* JADX INFO: renamed from: B */
    protected abstract void mo82675B(String str);

    /* JADX INFO: renamed from: C */
    void m82676C() {
        int i11 = this.f63308c;
        if (i11 == 0) {
            this.f63327v.m82882b(1, this.f63322q);
            return;
        }
        if (i11 == 1) {
            this.f63327v.m82882b(1, this.f63323r);
            return;
        }
        if (i11 == 2) {
            this.f63327v.m82882b(this.f63313h, this.f63324s);
        } else if (i11 == 3) {
            this.f63327v.m82882b(4, this.f63325t);
        } else {
            if (i11 != 4) {
                return;
            }
            this.f63327v.m82882b(this.f63314i, this.f63326u);
        }
    }

    /* JADX INFO: renamed from: G */
    public byte[] m82677G(String str) {
        return m82668p(9, str, -1);
    }

    /* JADX INFO: renamed from: H */
    protected abstract void mo82678H(Exception exc);

    /* JADX INFO: renamed from: J */
    protected abstract void mo82679J(byte[] bArr);

    /* JADX INFO: renamed from: K */
    public void m82680K(boolean z11) {
        this.f63307b = z11;
    }

    /* JADX INFO: renamed from: L */
    public void m82681L(boolean z11) {
        this.f63306a = z11;
    }

    protected void finalize() throws Throwable {
        Inflater inflater = this.f63320o;
        if (inflater != null) {
            try {
                inflater.end();
            } catch (Exception e11) {
                Log.e("HybiParser", "inflater.end failed", e11);
            }
        }
        super.finalize();
    }

    /* JADX INFO: renamed from: s */
    public byte[] m82682s(String str) {
        return m82668p(1, str, -1);
    }

    /* JADX INFO: renamed from: t */
    public byte[] m82683t(byte[] bArr) {
        return m82669q(2, bArr, -1);
    }

    /* JADX INFO: renamed from: x */
    protected abstract void mo82684x(int i11, String str);

    /* JADX INFO: renamed from: y */
    protected abstract void mo82685y(String str);

    /* JADX INFO: renamed from: z */
    protected abstract void mo82686z(byte[] bArr);
}
