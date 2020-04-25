package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* renamed from: ht */
public abstract class C0470ht<E> extends C0468hr {

    /* renamed from: a */
    private final int f2037a;

    /* renamed from: b */
    final Activity f2038b;

    /* renamed from: c */
    final Context f2039c;

    /* renamed from: d */
    final Handler f2040d;

    /* renamed from: e */
    final C0472hv f2041e;

    private C0470ht(Activity activity, Context context, Handler handler) {
        this.f2041e = new C0472hv();
        this.f2038b = activity;
        this.f2039c = (Context) C0378gc.m1210a(context, "context == null");
        this.f2040d = (Handler) C0378gc.m1210a(handler, "handler == null");
        this.f2037a = 0;
    }

    C0470ht(C0464hq hqVar) {
        this(hqVar, hqVar, hqVar.f2021a);
    }

    /* renamed from: a */
    public View mo1965a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo1992a(String str, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo1967a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo1993b() {
        return true;
    }

    /* renamed from: c */
    public LayoutInflater mo1994c() {
        return LayoutInflater.from(this.f2039c);
    }

    /* renamed from: d */
    public void mo1995d() {
    }

    /* renamed from: e */
    public boolean mo1996e() {
        return true;
    }

    /* renamed from: f */
    public int mo1997f() {
        return this.f2037a;
    }
}
