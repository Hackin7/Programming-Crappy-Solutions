package p000;

import java.io.File;
import java.io.IOException;

/* renamed from: mj */
public interface C0717mj {

    /* renamed from: a */
    public static final C0717mj f3096a = new C0717mj() {
        /* renamed from: a */
        public final void mo2537a(File file) {
            if (!file.delete() && file.exists()) {
                StringBuilder sb = new StringBuilder("failed to delete ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }
    };

    /* renamed from: a */
    void mo2537a(File file);
}
