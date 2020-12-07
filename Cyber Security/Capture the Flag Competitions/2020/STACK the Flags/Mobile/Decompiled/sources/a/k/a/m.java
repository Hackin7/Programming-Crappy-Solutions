package a.k.a;

import a.m.d;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

@SuppressLint({"BanParcelableUsage"})
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f1097b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1098c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1099d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1100e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1101f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1102g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Bundle k;
    public final boolean l;
    public final int m;
    public Bundle n;
    public Fragment o;

    public m(Fragment frag) {
        this.f1097b = frag.getClass().getName();
        this.f1098c = frag.mWho;
        this.f1099d = frag.mFromLayout;
        this.f1100e = frag.mFragmentId;
        this.f1101f = frag.mContainerId;
        this.f1102g = frag.mTag;
        this.h = frag.mRetainInstance;
        this.i = frag.mRemoving;
        this.j = frag.mDetached;
        this.k = frag.mArguments;
        this.l = frag.mHidden;
        this.m = frag.mMaxState.ordinal();
    }

    public m(Parcel in) {
        this.f1097b = in.readString();
        this.f1098c = in.readString();
        boolean z = true;
        this.f1099d = in.readInt() != 0;
        this.f1100e = in.readInt();
        this.f1101f = in.readInt();
        this.f1102g = in.readString();
        this.h = in.readInt() != 0;
        this.i = in.readInt() != 0;
        this.j = in.readInt() != 0;
        this.k = in.readBundle();
        this.l = in.readInt() == 0 ? false : z;
        this.n = in.readBundle();
        this.m = in.readInt();
    }

    public Fragment a(ClassLoader classLoader, g factory) {
        if (this.o == null) {
            Bundle bundle = this.k;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
            Fragment a2 = factory.a(classLoader, this.f1097b);
            this.o = a2;
            a2.setArguments(this.k);
            Bundle bundle2 = this.n;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
                this.o.mSavedFragmentState = this.n;
            } else {
                this.o.mSavedFragmentState = new Bundle();
            }
            Fragment fragment = this.o;
            fragment.mWho = this.f1098c;
            fragment.mFromLayout = this.f1099d;
            fragment.mRestored = true;
            fragment.mFragmentId = this.f1100e;
            fragment.mContainerId = this.f1101f;
            fragment.mTag = this.f1102g;
            fragment.mRetainInstance = this.h;
            fragment.mRemoving = this.i;
            fragment.mDetached = this.j;
            fragment.mHidden = this.l;
            fragment.mMaxState = d.b.values()[this.m];
            boolean z = j.H;
        }
        return this.o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1097b);
        sb.append(" (");
        sb.append(this.f1098c);
        sb.append(")}:");
        if (this.f1099d) {
            sb.append(" fromLayout");
        }
        if (this.f1101f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1101f));
        }
        String str = this.f1102g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1102g);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f1097b);
        dest.writeString(this.f1098c);
        dest.writeInt(this.f1099d ? 1 : 0);
        dest.writeInt(this.f1100e);
        dest.writeInt(this.f1101f);
        dest.writeString(this.f1102g);
        dest.writeInt(this.h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.j ? 1 : 0);
        dest.writeBundle(this.k);
        dest.writeInt(this.l ? 1 : 0);
        dest.writeBundle(this.n);
        dest.writeInt(this.m);
    }

    public static class a implements Parcelable.Creator<m> {
        /* renamed from: a */
        public m createFromParcel(Parcel in) {
            return new m(in);
        }

        /* renamed from: b */
        public m[] newArray(int size) {
            return new m[size];
        }
    }
}
