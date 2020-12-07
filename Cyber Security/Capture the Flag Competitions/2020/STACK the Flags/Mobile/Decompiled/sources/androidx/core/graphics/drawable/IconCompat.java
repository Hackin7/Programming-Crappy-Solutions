package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1667a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Object f1668b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1669c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1670d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f1671e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1672f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1673g = null;
    public PorterDuff.Mode h = j;
    public String i = null;

    public String c() {
        if (this.f1667a == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.f1668b);
        }
        if (this.f1667a == 2) {
            return ((String) this.f1668b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int a() {
        if (this.f1667a == -1 && Build.VERSION.SDK_INT >= 23) {
            return b((Icon) this.f1668b);
        }
        if (this.f1667a == 2) {
            return this.f1671e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String toString() {
        if (this.f1667a == -1) {
            return String.valueOf(this.f1668b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=").append(g(this.f1667a));
        switch (this.f1667a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1668b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1668b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(c());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1671e);
                if (this.f1672f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1672f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1668b);
                break;
        }
        if (this.f1673g != null) {
            sb.append(" tint=");
            sb.append(this.f1673g);
        }
        if (this.h != j) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }

    public void f(boolean isStream) {
        this.i = this.h.name();
        switch (this.f1667a) {
            case -1:
                if (!isStream) {
                    this.f1670d = (Parcelable) this.f1668b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (isStream) {
                    ByteArrayOutputStream data = new ByteArrayOutputStream();
                    ((Bitmap) this.f1668b).compress(Bitmap.CompressFormat.PNG, 90, data);
                    this.f1669c = data.toByteArray();
                    return;
                }
                this.f1670d = (Parcelable) this.f1668b;
                return;
            case 2:
                this.f1669c = ((String) this.f1668b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1669c = (byte[]) this.f1668b;
                return;
            case 4:
            case 6:
                this.f1669c = this.f1668b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public void e() {
        this.h = PorterDuff.Mode.valueOf(this.i);
        switch (this.f1667a) {
            case -1:
                Parcelable parcelable = this.f1670d;
                if (parcelable != null) {
                    this.f1668b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f1670d;
                if (parcelable2 != null) {
                    this.f1668b = parcelable2;
                    return;
                }
                byte[] bArr = this.f1669c;
                this.f1668b = bArr;
                this.f1667a = 3;
                this.f1671e = 0;
                this.f1672f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                this.f1668b = new String(this.f1669c, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1668b = this.f1669c;
                return;
        }
    }

    public static String g(int x) {
        switch (x) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static String d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    public static int b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }
}
