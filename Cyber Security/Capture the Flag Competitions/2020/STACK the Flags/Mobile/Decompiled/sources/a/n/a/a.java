package a.n.a;

import a.m.g;
import a.m.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();

    public static <T extends g & s> a b(T owner) {
        return new b(owner, owner.getViewModelStore());
    }
}
