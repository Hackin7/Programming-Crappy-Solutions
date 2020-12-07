package b.a.a.w.k0;

public final class d {
    public static String a(int stackSize, int[] stack, String[] pathNames, int[] pathIndices) {
        StringBuilder result = new StringBuilder().append('$');
        for (int i = 0; i < stackSize; i++) {
            int i2 = stack[i];
            if (i2 == 1 || i2 == 2) {
                result.append('[');
                result.append(pathIndices[i]);
                result.append(']');
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                result.append('.');
                if (pathNames[i] != null) {
                    result.append(pathNames[i]);
                }
            }
        }
        return result.toString();
    }
}
