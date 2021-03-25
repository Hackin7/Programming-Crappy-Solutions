package b.a.a.w;

import b.a.a.u.b;
import b.a.a.w.k0.c;

public class h implements j0<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f2269a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f2270b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // b.a.a.w.j0
    public /* bridge */ /* synthetic */ b a(c cVar, float f2) {
        return b(cVar);
    }

    public b b(c reader) {
        String text = null;
        String fontName = null;
        float size = 0.0f;
        b.a justification = b.a.CENTER;
        int tracking = 0;
        float lineHeight = 0.0f;
        float baselineShift = 0.0f;
        int fillColor = 0;
        int strokeColor = 0;
        float strokeWidth = 0.0f;
        boolean strokeOverFill = true;
        reader.h();
        while (reader.l()) {
            switch (reader.u(f2270b)) {
                case 0:
                    text = reader.q();
                    break;
                case 1:
                    fontName = reader.q();
                    break;
                case 2:
                    size = (float) reader.n();
                    break;
                case 3:
                    int justificationInt = reader.o();
                    b.a aVar = b.a.CENTER;
                    if (justificationInt <= 2 && justificationInt >= 0) {
                        justification = b.a.values()[justificationInt];
                        break;
                    } else {
                        justification = b.a.CENTER;
                        break;
                    }
                case 4:
                    tracking = reader.o();
                    break;
                case 5:
                    lineHeight = (float) reader.n();
                    break;
                case 6:
                    baselineShift = (float) reader.n();
                    break;
                case 7:
                    fillColor = p.d(reader);
                    break;
                case 8:
                    strokeColor = p.d(reader);
                    break;
                case 9:
                    strokeWidth = (float) reader.n();
                    break;
                case 10:
                    strokeOverFill = reader.m();
                    break;
                default:
                    reader.v();
                    reader.w();
                    break;
            }
        }
        reader.j();
        return new b(text, fontName, size, justification, tracking, lineHeight, baselineShift, fillColor, strokeColor, strokeWidth, strokeOverFill);
    }
}
