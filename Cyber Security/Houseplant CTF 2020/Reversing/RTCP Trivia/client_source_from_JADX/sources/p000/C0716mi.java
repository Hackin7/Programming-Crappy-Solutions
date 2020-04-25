package p000;

import java.io.IOException;

/* renamed from: mi */
public final class C0716mi extends IOException {

    /* renamed from: a */
    public final C0678lw f3095a;

    public C0716mi(C0678lw lwVar) {
        StringBuilder sb = new StringBuilder("stream was reset: ");
        sb.append(lwVar);
        super(sb.toString());
        this.f3095a = lwVar;
    }
}
