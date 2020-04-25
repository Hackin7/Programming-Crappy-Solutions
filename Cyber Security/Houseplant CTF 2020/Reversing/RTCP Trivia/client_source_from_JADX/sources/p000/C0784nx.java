package p000;

import android.content.res.Resources;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import wtf.riceteacatpanda.quiz.R;

/* renamed from: nx */
public final class C0784nx {

    /* renamed from: c */
    private static final char[] f3313c = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    private Resources f3314a;

    /* renamed from: b */
    private String f3315b;

    public C0784nx(String str, Resources resources) {
        this.f3315b = str;
        this.f3314a = resources;
    }

    /* renamed from: a */
    public static byte[] m2603a(String str) {
        return MessageDigest.getInstance("SHA-256").digest(str.getBytes());
    }

    /* renamed from: b */
    public static byte[] m2604b(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* renamed from: c */
    private String m2605c(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(this.f3315b);
        byte[] digest = instance.digest(new String(sb.toString()).getBytes());
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : digest) {
            String hexString = Integer.toHexString(255 & b);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        return String.valueOf(stringBuffer);
    }

    /* renamed from: a */
    public final String mo2708a() {
        InputStream openRawResource = this.f3314a.openRawResource(R.raw.correct);
        byte[] bArr = new byte[openRawResource.available()];
        byte[] bArr2 = new byte[openRawResource.available()];
        openRawResource.read(bArr);
        openRawResource.close();
        new ArrayList();
        for (int i = 0; i < bArr.length; i++) {
            double d = (double) i;
            if (Math.sqrt(d) % 1.0d == 0.0d) {
                bArr2[(int) Math.sqrt(d)] = bArr[i];
            }
        }
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr2);
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : digest) {
            String hexString = Integer.toHexString(255 & b);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        return m2605c(String.valueOf(stringBuffer));
    }
}
