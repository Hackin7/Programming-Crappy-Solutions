package b.a.a.w;

import b.a.a.d;
import b.a.a.u.j.h;
import b.a.a.u.k.g;
import b.a.a.w.k0.c;

public class u {
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b2, code lost:
        if (r5.equals("a") != false) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e8  */
    public static g a(c reader, d composition) {
        char c2;
        g.a maskMode = null;
        h maskPath = null;
        b.a.a.u.j.d opacity = null;
        boolean inverted = false;
        reader.h();
        while (reader.l()) {
            String mode = reader.p();
            int hashCode = mode.hashCode();
            char c3 = 0;
            if (hashCode != 111) {
                if (hashCode != 3588) {
                    if (hashCode != 104433) {
                        if (hashCode == 3357091 && mode.equals("mode")) {
                            c2 = 0;
                            if (c2 == 0) {
                                String q = reader.q();
                                int hashCode2 = q.hashCode();
                                if (hashCode2 != 97) {
                                    if (hashCode2 != 105) {
                                        if (hashCode2 != 110) {
                                            if (hashCode2 == 115 && q.equals("s")) {
                                                c3 = 1;
                                                if (c3 != 0) {
                                                    maskMode = g.a.MASK_MODE_ADD;
                                                } else if (c3 == 1) {
                                                    maskMode = g.a.MASK_MODE_SUBTRACT;
                                                } else if (c3 == 2) {
                                                    maskMode = g.a.MASK_MODE_NONE;
                                                } else if (c3 != 3) {
                                                    b.a.a.x.d.c("Unknown mask mode " + mode + ". Defaulting to Add.");
                                                    maskMode = g.a.MASK_MODE_ADD;
                                                } else {
                                                    composition.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                    maskMode = g.a.MASK_MODE_INTERSECT;
                                                }
                                            }
                                        } else if (q.equals("n")) {
                                            c3 = 2;
                                            if (c3 != 0) {
                                            }
                                        }
                                    } else if (q.equals("i")) {
                                        c3 = 3;
                                        if (c3 != 0) {
                                        }
                                    }
                                }
                                c3 = 65535;
                                if (c3 != 0) {
                                }
                            } else if (c2 == 1) {
                                maskPath = d.k(reader, composition);
                            } else if (c2 == 2) {
                                opacity = d.h(reader, composition);
                            } else if (c2 != 3) {
                                reader.w();
                            } else {
                                inverted = reader.m();
                            }
                        }
                    } else if (mode.equals("inv")) {
                        c2 = 3;
                        if (c2 == 0) {
                        }
                    }
                } else if (mode.equals("pt")) {
                    c2 = 1;
                    if (c2 == 0) {
                    }
                }
            } else if (mode.equals("o")) {
                c2 = 2;
                if (c2 == 0) {
                }
            }
            c2 = 65535;
            if (c2 == 0) {
            }
        }
        reader.j();
        return new g(maskMode, maskPath, opacity, inverted);
    }
}
