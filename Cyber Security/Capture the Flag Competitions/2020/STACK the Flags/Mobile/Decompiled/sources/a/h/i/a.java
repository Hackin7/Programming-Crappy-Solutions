package a.h.i;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

public final class a {
    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Trace.class.getMethod("isTagEnabled", Long.TYPE);
                Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }

    public static void a(String sectionName) {
        Trace.beginSection(sectionName);
    }

    public static void b() {
        Trace.endSection();
    }
}
