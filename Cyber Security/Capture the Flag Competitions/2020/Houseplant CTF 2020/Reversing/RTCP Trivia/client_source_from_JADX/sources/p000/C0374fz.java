package p000;

/* renamed from: fz */
public final class C0374fz {
    /* renamed from: a */
    public static void m1183a(Object obj, StringBuilder sb) {
        String hexString;
        if (obj == null) {
            hexString = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName == null || simpleName.length() <= 0) {
                simpleName = obj.getClass().getName();
                int lastIndexOf = simpleName.lastIndexOf(46);
                if (lastIndexOf > 0) {
                    simpleName = simpleName.substring(lastIndexOf + 1);
                }
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }
}
