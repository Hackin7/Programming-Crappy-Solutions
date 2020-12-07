package a.k.a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public abstract class i {

    /* renamed from: c  reason: collision with root package name */
    public static final g f1050c = new g();

    /* renamed from: b  reason: collision with root package name */
    public g f1051b = null;

    public abstract o a();

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Fragment c(Bundle bundle, String str);

    public abstract List<Fragment> e();

    public abstract void f(int i, int i2);

    public abstract boolean g();

    public abstract void h(Bundle bundle, String str, Fragment fragment);

    public abstract Fragment.g i(Fragment fragment);

    public void j(g fragmentFactory) {
        this.f1051b = fragmentFactory;
    }

    public g d() {
        if (this.f1051b == null) {
            this.f1051b = f1050c;
        }
        return this.f1051b;
    }
}
