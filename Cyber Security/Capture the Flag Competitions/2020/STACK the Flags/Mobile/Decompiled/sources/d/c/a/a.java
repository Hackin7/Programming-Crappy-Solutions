package d.c.a;

import java.util.Arrays;

public class a {
    public static void f() {
        d.a aVar = new d.a();
        d(aVar);
        throw aVar;
    }

    public static void a(Object value, String expression) {
        if (value == null) {
            IllegalStateException illegalStateException = new IllegalStateException(expression + " must not be null");
            d(illegalStateException);
            throw illegalStateException;
        }
    }

    public static void b(Object value, String paramName) {
        if (value == null) {
            g(paramName);
            throw null;
        }
    }

    public static void g(String paramName) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(c(paramName));
        d(illegalArgumentException);
        throw illegalArgumentException;
    }

    public static String c(String paramName) {
        StackTraceElement caller = Thread.currentThread().getStackTrace()[4];
        String className = caller.getClassName();
        String methodName = caller.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + paramName;
    }

    public static <T extends Throwable> T d(T throwable) {
        e(throwable, a.class.getName());
        return throwable;
    }

    public static <T extends Throwable> T e(T throwable, String classNameToDrop) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int size = stackTrace.length;
        int lastIntrinsic = -1;
        for (int i = 0; i < size; i++) {
            if (classNameToDrop.equals(stackTrace[i].getClassName())) {
                lastIntrinsic = i;
            }
        }
        throwable.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, lastIntrinsic + 1, size));
        return throwable;
    }
}
