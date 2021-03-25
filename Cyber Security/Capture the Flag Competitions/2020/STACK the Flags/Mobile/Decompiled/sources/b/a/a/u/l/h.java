package b.a.a.u.l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import b.a.a.f;
import b.a.a.r;
import b.a.a.s.c.n;
import b.a.a.s.c.p;
import b.a.a.u.b;
import b.a.a.u.c;
import b.a.a.u.d;
import b.a.a.u.j.k;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.model.content.ShapeGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h extends a {
    public final Paint A = new a(this, 1);
    public final Paint B = new b(this, 1);
    public final Map<d, List<b.a.a.s.b.d>> C = new HashMap();
    public final a.e.d<String> D = new a.e.d<>();
    public final n E;
    public final f F;
    public final b.a.a.d G;
    public b.a.a.s.c.a<Integer, Integer> H;
    public b.a.a.s.c.a<Integer, Integer> I;
    public b.a.a.s.c.a<Integer, Integer> J;
    public b.a.a.s.c.a<Integer, Integer> K;
    public b.a.a.s.c.a<Float, Float> L;
    public b.a.a.s.c.a<Float, Float> M;
    public b.a.a.s.c.a<Float, Float> N;
    public b.a.a.s.c.a<Float, Float> O;
    public b.a.a.s.c.a<Float, Float> P;
    public final StringBuilder x = new StringBuilder(2);
    public final RectF y = new RectF();
    public final Matrix z = new Matrix();

    public class a extends Paint {
        public a(h this$0, int arg0) {
            super(arg0);
            setStyle(Paint.Style.FILL);
        }
    }

    public class b extends Paint {
        public b(h this$0, int arg0) {
            super(arg0);
            setStyle(Paint.Style.STROKE);
        }
    }

    public h(f lottieDrawable, d layerModel) {
        super(lottieDrawable, layerModel);
        b.a.a.u.j.b bVar;
        b.a.a.u.j.b bVar2;
        b.a.a.u.j.a aVar;
        b.a.a.u.j.a aVar2;
        this.F = lottieDrawable;
        this.G = layerModel.a();
        n d2 = layerModel.q().a();
        this.E = d2;
        d2.a(this);
        k(this.E);
        k textProperties = layerModel.r();
        if (!(textProperties == null || (aVar2 = textProperties.f2104a) == null)) {
            b.a.a.s.c.a<Integer, Integer> a2 = aVar2.a();
            this.H = a2;
            a2.a(this);
            k(this.H);
        }
        if (!(textProperties == null || (aVar = textProperties.f2105b) == null)) {
            b.a.a.s.c.a<Integer, Integer> a3 = aVar.a();
            this.J = a3;
            a3.a(this);
            k(this.J);
        }
        if (!(textProperties == null || (bVar2 = textProperties.f2106c) == null)) {
            b.a.a.s.c.a<Float, Float> a4 = bVar2.a();
            this.L = a4;
            a4.a(this);
            k(this.L);
        }
        if (textProperties != null && (bVar = textProperties.f2107d) != null) {
            b.a.a.s.c.a<Float, Float> a5 = bVar.a();
            this.N = a5;
            a5.a(this);
            k(this.N);
        }
    }

    @Override // b.a.a.s.b.e, b.a.a.u.l.a
    public void a(RectF outBounds, Matrix parentMatrix, boolean applyParents) {
        super.a(outBounds, parentMatrix, applyParents);
        outBounds.set(0.0f, 0.0f, (float) this.G.b().width(), (float) this.G.b().height());
    }

    @Override // b.a.a.u.l.a
    public void v(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
        canvas.save();
        if (!this.F.j0()) {
            canvas.setMatrix(parentMatrix);
        }
        b.a.a.u.b documentData = (b.a.a.u.b) this.E.h();
        c font = this.G.g().get(documentData.f2073b);
        if (font == null) {
            canvas.restore();
            return;
        }
        b.a.a.s.c.a<Integer, Integer> aVar = this.I;
        if (aVar != null) {
            this.A.setColor(aVar.h().intValue());
        } else {
            b.a.a.s.c.a<Integer, Integer> aVar2 = this.H;
            if (aVar2 != null) {
                this.A.setColor(aVar2.h().intValue());
            } else {
                this.A.setColor(documentData.h);
            }
        }
        b.a.a.s.c.a<Integer, Integer> aVar3 = this.K;
        if (aVar3 != null) {
            this.B.setColor(aVar3.h().intValue());
        } else {
            b.a.a.s.c.a<Integer, Integer> aVar4 = this.J;
            if (aVar4 != null) {
                this.B.setColor(aVar4.h().intValue());
            } else {
                this.B.setColor(documentData.i);
            }
        }
        int alpha = ((this.v.h() == null ? 100 : this.v.h().h().intValue()) * 255) / 100;
        this.A.setAlpha(alpha);
        this.B.setAlpha(alpha);
        b.a.a.s.c.a<Float, Float> aVar5 = this.M;
        if (aVar5 != null) {
            this.B.setStrokeWidth(aVar5.h().floatValue());
        } else {
            b.a.a.s.c.a<Float, Float> aVar6 = this.L;
            if (aVar6 != null) {
                this.B.setStrokeWidth(aVar6.h().floatValue());
            } else {
                this.B.setStrokeWidth(documentData.j * b.a.a.x.h.e() * b.a.a.x.h.g(parentMatrix));
            }
        }
        if (this.F.j0()) {
            T(documentData, parentMatrix, font, canvas);
        } else {
            U(documentData, font, parentMatrix, canvas);
        }
        canvas.restore();
    }

    public final void T(b.a.a.u.b documentData, Matrix parentMatrix, c font, Canvas canvas) {
        float textSize;
        b.a.a.s.c.a<Float, Float> aVar = this.P;
        if (aVar != null) {
            textSize = aVar.h().floatValue();
        } else {
            textSize = documentData.f2074c;
        }
        float fontScale = textSize / 100.0f;
        float parentScale = b.a.a.x.h.g(parentMatrix);
        String text = documentData.f2072a;
        float lineHeight = documentData.f2077f * b.a.a.x.h.e();
        List<String> textLines = X(text);
        int textLineCount = textLines.size();
        int l = 0;
        while (l < textLineCount) {
            String textLine = textLines.get(l);
            float textLineWidth = W(textLine, font, fontScale, parentScale);
            canvas.save();
            L(documentData.f2075d, canvas, textLineWidth);
            canvas.translate(0.0f, (((float) l) * lineHeight) - ((((float) (textLineCount - 1)) * lineHeight) / 2.0f));
            S(textLine, documentData, parentMatrix, font, canvas, parentScale, fontScale);
            canvas.restore();
            l++;
            textLineCount = textLineCount;
            textLines = textLines;
        }
    }

    public final void S(String text, b.a.a.u.b documentData, Matrix parentMatrix, c font, Canvas canvas, float parentScale, float fontScale) {
        for (int i = 0; i < text.length(); i++) {
            d character = this.G.c().e(d.c(text.charAt(i), font.a(), font.c()));
            if (character != null) {
                O(character, parentMatrix, fontScale, documentData, canvas);
                float tx = ((float) character.b()) * fontScale * b.a.a.x.h.e() * parentScale;
                float tracking = ((float) documentData.f2076e) / 10.0f;
                b.a.a.s.c.a<Float, Float> aVar = this.O;
                if (aVar != null) {
                    tracking += aVar.h().floatValue();
                } else {
                    b.a.a.s.c.a<Float, Float> aVar2 = this.N;
                    if (aVar2 != null) {
                        tracking += aVar2.h().floatValue();
                    }
                }
                canvas.translate(tx + (tracking * parentScale), 0.0f);
            }
        }
    }

    public final void U(b.a.a.u.b documentData, c font, Matrix parentMatrix, Canvas canvas) {
        float textSize;
        float parentScale = b.a.a.x.h.g(parentMatrix);
        Typeface typeface = this.F.D(font.a(), font.c());
        if (typeface != null) {
            String text = documentData.f2072a;
            this.F.C();
            r textDelegate = null;
            if (0 == 0) {
                this.A.setTypeface(typeface);
                b.a.a.s.c.a<Float, Float> aVar = this.P;
                if (aVar != null) {
                    textSize = aVar.h().floatValue();
                } else {
                    textSize = documentData.f2074c;
                }
                this.A.setTextSize(b.a.a.x.h.e() * textSize);
                this.B.setTypeface(this.A.getTypeface());
                this.B.setTextSize(this.A.getTextSize());
                float lineHeight = documentData.f2077f * b.a.a.x.h.e();
                List<String> textLines = X(text);
                int textLineCount = textLines.size();
                int l = 0;
                while (l < textLineCount) {
                    String textLine = textLines.get(l);
                    L(documentData.f2075d, canvas, this.B.measureText(textLine));
                    canvas.translate(0.0f, (((float) l) * lineHeight) - ((((float) (textLineCount - 1)) * lineHeight) / 2.0f));
                    Q(textLine, documentData, canvas, parentScale);
                    canvas.setMatrix(parentMatrix);
                    l++;
                    typeface = typeface;
                }
                return;
            }
            textDelegate.a(text);
            throw null;
        }
    }

    public final List<String> X(String text) {
        return Arrays.asList(text.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    public final void Q(String text, b.a.a.u.b documentData, Canvas canvas, float parentScale) {
        int i = 0;
        while (i < text.length()) {
            String charString = M(text, i);
            i += charString.length();
            P(charString, documentData, canvas);
            float charWidth = this.A.measureText(charString, 0, 1);
            float tracking = ((float) documentData.f2076e) / 10.0f;
            b.a.a.s.c.a<Float, Float> aVar = this.O;
            if (aVar != null) {
                tracking += aVar.h().floatValue();
            } else {
                b.a.a.s.c.a<Float, Float> aVar2 = this.N;
                if (aVar2 != null) {
                    tracking += aVar2.h().floatValue();
                }
            }
            canvas.translate((tracking * parentScale) + charWidth, 0.0f);
        }
    }

    public final float W(String textLine, c font, float fontScale, float parentScale) {
        float textLineWidth = 0.0f;
        for (int i = 0; i < textLine.length(); i++) {
            d character = this.G.c().e(d.c(textLine.charAt(i), font.a(), font.c()));
            if (character != null) {
                textLineWidth = (float) (((double) textLineWidth) + (character.b() * ((double) fontScale) * ((double) b.a.a.x.h.e()) * ((double) parentScale)));
            }
        }
        return textLineWidth;
    }

    public final void L(b.a justification, Canvas canvas, float textLineWidth) {
        int ordinal = justification.ordinal();
        if (ordinal == 1) {
            canvas.translate(-textLineWidth, 0.0f);
        } else if (ordinal == 2) {
            canvas.translate((-textLineWidth) / 2.0f, 0.0f);
        }
    }

    public final void O(d character, Matrix parentMatrix, float fontScale, b.a.a.u.b documentData, Canvas canvas) {
        List<ContentGroup> contentGroups = V(character);
        for (int j = 0; j < contentGroups.size(); j++) {
            Path path = ((b.a.a.s.b.d) contentGroups.get(j)).h();
            path.computeBounds(this.y, false);
            this.z.set(parentMatrix);
            this.z.preTranslate(0.0f, (-documentData.f2078g) * b.a.a.x.h.e());
            this.z.preScale(fontScale, fontScale);
            path.transform(this.z);
            if (documentData.k) {
                R(path, this.A, canvas);
                R(path, this.B, canvas);
            } else {
                R(path, this.B, canvas);
                R(path, this.A, canvas);
            }
        }
    }

    public final void R(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    public final void P(String character, b.a.a.u.b documentData, Canvas canvas) {
        if (documentData.k) {
            N(character, this.A, canvas);
            N(character, this.B, canvas);
            return;
        }
        N(character, this.B, canvas);
        N(character, this.A, canvas);
    }

    public final void N(String character, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(character, 0, character.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    public final List<b.a.a.s.b.d> V(d character) {
        if (this.C.containsKey(character)) {
            return this.C.get(character);
        }
        List<ShapeGroup> shapes = character.a();
        int size = shapes.size();
        List<ContentGroup> contents = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            contents.add(new b.a.a.s.b.d(this.F, this, (b.a.a.u.k.n) shapes.get(i)));
        }
        this.C.put(character, contents);
        return contents;
    }

    public final String M(String text, int startIndex) {
        int firstCodePoint = text.codePointAt(startIndex);
        int key = firstCodePoint;
        int index = startIndex + Character.charCount(firstCodePoint);
        while (index < text.length()) {
            int nextCodePoint = text.codePointAt(index);
            if (!Y(nextCodePoint)) {
                break;
            }
            index += Character.charCount(nextCodePoint);
            key = (key * 31) + nextCodePoint;
        }
        if (this.D.d((long) key)) {
            return this.D.f((long) key);
        }
        this.x.setLength(0);
        int i = startIndex;
        while (i < index) {
            int codePoint = text.codePointAt(i);
            this.x.appendCodePoint(codePoint);
            i += Character.charCount(codePoint);
        }
        String str = this.x.toString();
        this.D.j((long) key, str);
        return str;
    }

    public final boolean Y(int codePoint) {
        return Character.getType(codePoint) == 16 || Character.getType(codePoint) == 27 || Character.getType(codePoint) == 6 || Character.getType(codePoint) == 28 || Character.getType(codePoint) == 19;
    }

    @Override // b.a.a.u.l.a, b.a.a.u.f
    public <T> void f(T property, b.a.a.y.c<T> cVar) {
        super.f(property, cVar);
        if (property == b.a.a.k.f1933a) {
            b.a.a.s.c.a<Integer, Integer> aVar = this.I;
            if (aVar != null) {
                E(aVar);
            }
            if (cVar == null) {
                this.I = null;
                return;
            }
            p pVar = new p(cVar);
            this.I = pVar;
            pVar.a(this);
            k(this.I);
        } else if (property == b.a.a.k.f1934b) {
            b.a.a.s.c.a<Integer, Integer> aVar2 = this.K;
            if (aVar2 != null) {
                E(aVar2);
            }
            if (cVar == null) {
                this.K = null;
                return;
            }
            p pVar2 = new p(cVar);
            this.K = pVar2;
            pVar2.a(this);
            k(this.K);
        } else if (property == b.a.a.k.o) {
            b.a.a.s.c.a<Float, Float> aVar3 = this.M;
            if (aVar3 != null) {
                E(aVar3);
            }
            if (cVar == null) {
                this.M = null;
                return;
            }
            p pVar3 = new p(cVar);
            this.M = pVar3;
            pVar3.a(this);
            k(this.M);
        } else if (property == b.a.a.k.p) {
            b.a.a.s.c.a<Float, Float> aVar4 = this.O;
            if (aVar4 != null) {
                E(aVar4);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            p pVar4 = new p(cVar);
            this.O = pVar4;
            pVar4.a(this);
            k(this.O);
        } else if (property == b.a.a.k.B) {
            b.a.a.s.c.a<Float, Float> aVar5 = this.P;
            if (aVar5 != null) {
                E(aVar5);
            }
            if (cVar == null) {
                this.P = null;
                return;
            }
            p pVar5 = new p(cVar);
            this.P = pVar5;
            pVar5.a(this);
            k(this.P);
        }
    }
}
