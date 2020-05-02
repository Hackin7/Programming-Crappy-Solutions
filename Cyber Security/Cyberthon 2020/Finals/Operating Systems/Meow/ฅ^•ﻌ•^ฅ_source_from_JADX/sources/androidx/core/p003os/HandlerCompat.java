package androidx.core.p003os;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;

/* renamed from: androidx.core.os.HandlerCompat */
public final class HandlerCompat {
    public static boolean postDelayed(Handler handler, Runnable runnable, Object obj, long j) {
        if (VERSION.SDK_INT >= 28) {
            return handler.postDelayed(runnable, obj, j);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j);
    }

    private HandlerCompat() {
    }
}
