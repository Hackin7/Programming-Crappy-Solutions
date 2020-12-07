package a.k.a;

import a.k.a.o;
import a.m.d;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int[] f1029b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<String> f1030c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1031d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1032e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1033f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1034g;
    public final String h;
    public final int i;
    public final int j;
    public final CharSequence k;
    public final int l;
    public final CharSequence m;
    public final ArrayList<String> n;
    public final ArrayList<String> o;
    public final boolean p;

    public b(a bse) {
        int numOps = bse.f1103a.size();
        this.f1029b = new int[(numOps * 5)];
        if (bse.h) {
            this.f1030c = new ArrayList<>(numOps);
            this.f1031d = new int[numOps];
            this.f1032e = new int[numOps];
            int pos = 0;
            int opNum = 0;
            while (opNum < numOps) {
                o.a op = bse.f1103a.get(opNum);
                int pos2 = pos + 1;
                this.f1029b[pos] = op.f1110a;
                ArrayList<String> arrayList = this.f1030c;
                Fragment fragment = op.f1111b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f1029b;
                int pos3 = pos2 + 1;
                iArr[pos2] = op.f1112c;
                int pos4 = pos3 + 1;
                iArr[pos3] = op.f1113d;
                int pos5 = pos4 + 1;
                iArr[pos4] = op.f1114e;
                iArr[pos5] = op.f1115f;
                this.f1031d[opNum] = op.f1116g.ordinal();
                this.f1032e[opNum] = op.h.ordinal();
                opNum++;
                pos = pos5 + 1;
            }
            this.f1033f = bse.f1108f;
            this.f1034g = bse.f1109g;
            this.h = bse.i;
            this.i = bse.t;
            this.j = bse.j;
            this.k = bse.k;
            this.l = bse.l;
            this.m = bse.m;
            this.n = bse.n;
            this.o = bse.o;
            this.p = bse.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public b(Parcel in) {
        this.f1029b = in.createIntArray();
        this.f1030c = in.createStringArrayList();
        this.f1031d = in.createIntArray();
        this.f1032e = in.createIntArray();
        this.f1033f = in.readInt();
        this.f1034g = in.readInt();
        this.h = in.readString();
        this.i = in.readInt();
        this.j = in.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.l = in.readInt();
        this.m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.n = in.createStringArrayList();
        this.o = in.createStringArrayList();
        this.p = in.readInt() != 0;
    }

    public a a(j fm) {
        a bse = new a(fm);
        int pos = 0;
        int num = 0;
        while (pos < this.f1029b.length) {
            o.a op = new o.a();
            int pos2 = pos + 1;
            op.f1110a = this.f1029b[pos];
            boolean z = j.H;
            String fWho = this.f1030c.get(num);
            if (fWho != null) {
                op.f1111b = fm.h.get(fWho);
            } else {
                op.f1111b = null;
            }
            op.f1116g = d.b.values()[this.f1031d[num]];
            op.h = d.b.values()[this.f1032e[num]];
            int[] iArr = this.f1029b;
            int pos3 = pos2 + 1;
            int pos4 = iArr[pos2];
            op.f1112c = pos4;
            int pos5 = pos3 + 1;
            int pos6 = iArr[pos3];
            op.f1113d = pos6;
            int pos7 = pos5 + 1;
            int pos8 = iArr[pos5];
            op.f1114e = pos8;
            int i2 = iArr[pos7];
            op.f1115f = i2;
            bse.f1104b = pos4;
            bse.f1105c = pos6;
            bse.f1106d = pos8;
            bse.f1107e = i2;
            bse.d(op);
            num++;
            pos = pos7 + 1;
        }
        bse.f1108f = this.f1033f;
        bse.f1109g = this.f1034g;
        bse.i = this.h;
        bse.t = this.i;
        bse.h = true;
        bse.j = this.j;
        bse.k = this.k;
        bse.l = this.l;
        bse.m = this.m;
        bse.n = this.n;
        bse.o = this.o;
        bse.p = this.p;
        bse.l(1);
        return bse;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeIntArray(this.f1029b);
        dest.writeStringList(this.f1030c);
        dest.writeIntArray(this.f1031d);
        dest.writeIntArray(this.f1032e);
        dest.writeInt(this.f1033f);
        dest.writeInt(this.f1034g);
        dest.writeString(this.h);
        dest.writeInt(this.i);
        dest.writeInt(this.j);
        TextUtils.writeToParcel(this.k, dest, 0);
        dest.writeInt(this.l);
        TextUtils.writeToParcel(this.m, dest, 0);
        dest.writeStringList(this.n);
        dest.writeStringList(this.o);
        dest.writeInt(this.p ? 1 : 0);
    }

    public static class a implements Parcelable.Creator<b> {
        /* renamed from: a */
        public b createFromParcel(Parcel in) {
            return new b(in);
        }

        /* renamed from: b */
        public b[] newArray(int size) {
            return new b[size];
        }
    }
}
