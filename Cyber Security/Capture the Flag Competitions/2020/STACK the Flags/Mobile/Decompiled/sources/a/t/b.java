package a.t;

import a.e.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import net.sqlcipher.BuildConfig;

public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f1475d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f1476e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1477f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1478g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public b(Parcel p) {
        this(p, p.dataPosition(), p.dataSize(), BuildConfig.FLAVOR, new a(), new a(), new a());
    }

    public b(Parcel p, int offset, int end, String prefix, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1475d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.f1476e = p;
        this.f1477f = offset;
        this.f1478g = end;
        this.j = offset;
        this.h = prefix;
    }

    @Override // a.t.a
    public boolean m(int fieldId) {
        while (this.j < this.f1478g) {
            int i2 = this.k;
            if (i2 == fieldId) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(fieldId)) > 0) {
                return false;
            }
            this.f1476e.setDataPosition(this.j);
            int size = this.f1476e.readInt();
            this.k = this.f1476e.readInt();
            this.j += size;
        }
        if (this.k == fieldId) {
            return true;
        }
        return false;
    }

    @Override // a.t.a
    public void w(int fieldId) {
        a();
        this.i = fieldId;
        this.f1475d.put(fieldId, this.f1476e.dataPosition());
        E(0);
        E(fieldId);
    }

    @Override // a.t.a
    public void a() {
        int i2 = this.i;
        if (i2 >= 0) {
            int currentFieldPosition = this.f1475d.get(i2);
            int position = this.f1476e.dataPosition();
            this.f1476e.setDataPosition(currentFieldPosition);
            this.f1476e.writeInt(position - currentFieldPosition);
            this.f1476e.setDataPosition(position);
        }
    }

    @Override // a.t.a
    public a b() {
        Parcel parcel = this.f1476e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f1477f) {
            i2 = this.f1478g;
        }
        return new b(parcel, dataPosition, i2, this.h + "  ", this.f1472a, this.f1473b, this.f1474c);
    }

    @Override // a.t.a
    public void A(byte[] b2) {
        if (b2 != null) {
            this.f1476e.writeInt(b2.length);
            this.f1476e.writeByteArray(b2);
            return;
        }
        this.f1476e.writeInt(-1);
    }

    @Override // a.t.a
    public void E(int val) {
        this.f1476e.writeInt(val);
    }

    @Override // a.t.a
    public void I(String val) {
        this.f1476e.writeString(val);
    }

    @Override // a.t.a
    public void G(Parcelable p) {
        this.f1476e.writeParcelable(p, 0);
    }

    @Override // a.t.a
    public void y(boolean val) {
        this.f1476e.writeInt(val ? 1 : 0);
    }

    @Override // a.t.a
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1476e, 0);
    }

    @Override // a.t.a
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1476e);
    }

    @Override // a.t.a
    public int o() {
        return this.f1476e.readInt();
    }

    @Override // a.t.a
    public String s() {
        return this.f1476e.readString();
    }

    @Override // a.t.a
    public byte[] i() {
        int len = this.f1476e.readInt();
        if (len < 0) {
            return null;
        }
        byte[] bytes = new byte[len];
        this.f1476e.readByteArray(bytes);
        return bytes;
    }

    @Override // a.t.a
    public <T extends Parcelable> T q() {
        return (T) this.f1476e.readParcelable(getClass().getClassLoader());
    }

    @Override // a.t.a
    public boolean g() {
        return this.f1476e.readInt() != 0;
    }
}
