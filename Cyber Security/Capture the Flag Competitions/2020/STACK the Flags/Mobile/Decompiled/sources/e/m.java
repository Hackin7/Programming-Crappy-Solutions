package e;

import java.nio.charset.Charset;
import net.sqlcipher.database.SQLiteDatabase;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f2849a = Charset.forName(SQLiteDatabase.KEY_ENCODING);

    public static void b(long size, long offset, long byteCount) {
        if ((offset | byteCount) < 0 || offset > size || size - offset < byteCount) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(size), Long.valueOf(offset), Long.valueOf(byteCount)));
        }
    }

    public static boolean a(byte[] a2, int aOffset, byte[] b2, int bOffset, int byteCount) {
        for (int i = 0; i < byteCount; i++) {
            if (a2[i + aOffset] != b2[i + bOffset]) {
                return false;
            }
        }
        return true;
    }
}
