package b.d.a.a.w;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public class e {

    /* renamed from: c  reason: collision with root package name */
    public static e f2660c;

    /* renamed from: a  reason: collision with root package name */
    public final Object f2661a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2662b = new Handler(Looper.getMainLooper(), new a());

    public interface b {
        void a(int i);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f2664a;
    }

    public static e b() {
        if (f2660c == null) {
            f2660c = new e();
        }
        return f2660c;
    }

    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e.this.c((c) message.obj);
            return true;
        }
    }

    public void e(b callback) {
        synchronized (this.f2661a) {
            d(callback);
        }
    }

    public void f(b callback) {
        synchronized (this.f2661a) {
            d(callback);
        }
    }

    public final boolean a(c record, int event) {
        b callback = record.f2664a.get();
        if (callback == null) {
            return false;
        }
        this.f2662b.removeCallbacksAndMessages(record);
        callback.a(event);
        return true;
    }

    public final boolean d(b callback) {
        return false;
    }

    public void c(c record) {
        synchronized (this.f2661a) {
            if (record == null || record == null) {
                a(record, 2);
            }
        }
    }
}
