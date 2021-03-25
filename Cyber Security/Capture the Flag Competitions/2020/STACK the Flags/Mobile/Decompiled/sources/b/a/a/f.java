package b.a.a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import b.a.a.w.s;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.KeyPath;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class f extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f1894b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public d f1895c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a.a.x.e f1896d = new b.a.a.x.e();

    /* renamed from: e  reason: collision with root package name */
    public float f1897e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1898f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1899g = false;
    public final ArrayList<o> h;
    public final ValueAnimator.AnimatorUpdateListener i;
    public ImageView.ScaleType j;
    public b.a.a.t.b k;
    public String l;
    public b m;
    public b.a.a.t.a n;
    public a o;
    public r p;
    public boolean q;
    public b.a.a.u.l.b r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;

    public interface o {
        void a(d dVar);
    }

    static {
        f.class.getSimpleName();
    }

    /* renamed from: b.a.a.f$f  reason: collision with other inner class name */
    public class C0044f implements ValueAnimator.AnimatorUpdateListener {
        public C0044f() {
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            if (f.this.r != null) {
                f.this.r.I(f.this.f1896d.h());
            }
        }
    }

    public f() {
        new HashSet();
        this.h = new ArrayList<>();
        C0044f fVar = new C0044f();
        this.i = fVar;
        this.s = 255;
        this.v = true;
        this.w = false;
        this.f1896d.addUpdateListener(fVar);
    }

    public boolean k() {
        return this.q;
    }

    public void j(boolean enable) {
        if (this.q != enable) {
            this.q = enable;
            if (this.f1895c != null) {
                d();
            }
        }
    }

    public void P(String imageAssetsFolder) {
        this.l = imageAssetsFolder;
    }

    public String s() {
        return this.l;
    }

    public boolean L(d composition) {
        if (this.f1895c == composition) {
            return false;
        }
        this.w = false;
        f();
        this.f1895c = composition;
        d();
        this.f1896d.v(composition);
        Z(this.f1896d.getAnimatedFraction());
        d0(this.f1897e);
        i0();
        Iterator<LottieDrawable.LazyCompositionTask> it = new ArrayList(this.h).iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(composition);
            it.remove();
        }
        this.h.clear();
        composition.u(this.t);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ((ImageView) callback).setImageDrawable(null);
        ((ImageView) callback).setImageDrawable(this);
        return true;
    }

    public void Y(boolean enabled) {
        this.t = enabled;
        d dVar = this.f1895c;
        if (dVar != null) {
            dVar.u(enabled);
        }
    }

    public n w() {
        d dVar = this.f1895c;
        if (dVar != null) {
            return dVar.m();
        }
        return null;
    }

    public void K(boolean isApplyingOpacityToLayersEnabled) {
        this.u = isApplyingOpacityToLayersEnabled;
    }

    public boolean F() {
        return this.u;
    }

    public final void d() {
        this.r = new b.a.a.u.l.b(this, s.a(this.f1895c), this.f1895c.j(), this.f1895c);
    }

    public void f() {
        if (this.f1896d.isRunning()) {
            this.f1896d.cancel();
        }
        this.f1895c = null;
        this.r = null;
        this.k = null;
        this.f1896d.f();
        invalidateSelf();
    }

    public void c0(boolean safeMode) {
        this.f1899g = safeMode;
    }

    public void invalidateSelf() {
        if (!this.w) {
            this.w = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public void setAlpha(int alpha) {
        this.s = alpha;
        invalidateSelf();
    }

    public int getAlpha() {
        return this.s;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        b.a.a.x.d.c("Use addColorFilter instead.");
    }

    public int getOpacity() {
        return -3;
    }

    public void draw(Canvas canvas) {
        this.w = false;
        c.a("Drawable#draw");
        if (this.f1899g) {
            try {
                g(canvas);
            } catch (Throwable e2) {
                b.a.a.x.d.b("Lottie crashed in draw!", e2);
            }
        } else {
            g(canvas);
        }
        c.b("Drawable#draw");
    }

    public final void g(Canvas canvas) {
        if (ImageView.ScaleType.FIT_XY == this.j) {
            h(canvas);
        } else {
            i(canvas);
        }
    }

    public void start() {
        H();
    }

    public void stop() {
        l();
    }

    public boolean isRunning() {
        return E();
    }

    public class g implements o {
        public g() {
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.H();
        }
    }

    public void H() {
        if (this.r == null) {
            this.h.add(new g());
            return;
        }
        if (this.f1898f || y() == 0) {
            this.f1896d.p();
        }
        if (!this.f1898f) {
            N((int) (B() < 0.0f ? v() : t()));
            this.f1896d.g();
        }
    }

    public void l() {
        this.h.clear();
        this.f1896d.g();
    }

    public class h implements o {
        public h() {
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.J();
        }
    }

    public void J() {
        if (this.r == null) {
            this.h.add(new h());
            return;
        }
        if (this.f1898f || y() == 0) {
            this.f1896d.t();
        }
        if (!this.f1898f) {
            N((int) (B() < 0.0f ? v() : t()));
            this.f1896d.g();
        }
    }

    public class i implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1916a;

        public i(int i) {
            this.f1916a = i;
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.V(this.f1916a);
        }
    }

    public void V(int minFrame) {
        if (this.f1895c == null) {
            this.h.add(new i(minFrame));
        } else {
            this.f1896d.z(minFrame);
        }
    }

    public float v() {
        return this.f1896d.l();
    }

    public class j implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f1918a;

        public j(float f2) {
            this.f1918a = f2;
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.X(this.f1918a);
        }
    }

    public void X(float minProgress) {
        d dVar = this.f1895c;
        if (dVar == null) {
            this.h.add(new j(minProgress));
        } else {
            V((int) b.a.a.x.g.j(dVar.o(), this.f1895c.f(), minProgress));
        }
    }

    public class k implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1920a;

        public k(int i) {
            this.f1920a = i;
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.Q(this.f1920a);
        }
    }

    public void Q(int maxFrame) {
        if (this.f1895c == null) {
            this.h.add(new k(maxFrame));
        } else {
            this.f1896d.x(((float) maxFrame) + 0.99f);
        }
    }

    public float t() {
        return this.f1896d.k();
    }

    public class l implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f1922a;

        public l(float f2) {
            this.f1922a = f2;
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.S(this.f1922a);
        }
    }

    public void S(float maxProgress) {
        d dVar = this.f1895c;
        if (dVar == null) {
            this.h.add(new l(maxProgress));
        } else {
            Q((int) b.a.a.x.g.j(dVar.o(), this.f1895c.f(), maxProgress));
        }
    }

    public class m implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1924a;

        public m(String str) {
            this.f1924a = str;
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.W(this.f1924a);
        }
    }

    public void W(String markerName) {
        d dVar = this.f1895c;
        if (dVar == null) {
            this.h.add(new m(markerName));
            return;
        }
        b.a.a.u.h marker = dVar.k(markerName);
        if (marker != null) {
            V((int) marker.f2097b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + markerName + ".");
    }

    public class n implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1926a;

        public n(String str) {
            this.f1926a = str;
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.R(this.f1926a);
        }
    }

    public void R(String markerName) {
        d dVar = this.f1895c;
        if (dVar == null) {
            this.h.add(new n(markerName));
            return;
        }
        b.a.a.u.h marker = dVar.k(markerName);
        if (marker != null) {
            Q((int) (marker.f2097b + marker.f2098c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + markerName + ".");
    }

    public class a implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1900a;

        public a(String str) {
            this.f1900a = str;
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.U(this.f1900a);
        }
    }

    public void U(String markerName) {
        d dVar = this.f1895c;
        if (dVar == null) {
            this.h.add(new a(markerName));
            return;
        }
        b.a.a.u.h marker = dVar.k(markerName);
        if (marker != null) {
            int startFrame = (int) marker.f2097b;
            T(startFrame, ((int) marker.f2098c) + startFrame);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + markerName + ".");
    }

    public class b implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1902a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1903b;

        public b(int i, int i2) {
            this.f1902a = i;
            this.f1903b = i2;
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.T(this.f1902a, this.f1903b);
        }
    }

    public void T(int minFrame, int maxFrame) {
        if (this.f1895c == null) {
            this.h.add(new b(minFrame, maxFrame));
        } else {
            this.f1896d.y((float) minFrame, ((float) maxFrame) + 0.99f);
        }
    }

    public void f0(float speed) {
        this.f1896d.A(speed);
    }

    public float B() {
        return this.f1896d.m();
    }

    public class c implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1905a;

        public c(int i) {
            this.f1905a = i;
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.N(this.f1905a);
        }
    }

    public void N(int frame) {
        if (this.f1895c == null) {
            this.h.add(new c(frame));
        } else {
            this.f1896d.w((float) frame);
        }
    }

    public int p() {
        return (int) this.f1896d.i();
    }

    public class d implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f1907a;

        public d(float f2) {
            this.f1907a = f2;
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.Z(this.f1907a);
        }
    }

    public void Z(float progress) {
        if (this.f1895c == null) {
            this.h.add(new d(progress));
            return;
        }
        c.a("Drawable#setProgress");
        this.f1896d.w(b.a.a.x.g.j(this.f1895c.o(), this.f1895c.f(), progress));
        c.b("Drawable#setProgress");
    }

    public void b0(int mode) {
        this.f1896d.setRepeatMode(mode);
    }

    public int z() {
        return this.f1896d.getRepeatMode();
    }

    public void a0(int count) {
        this.f1896d.setRepeatCount(count);
    }

    public int y() {
        return this.f1896d.getRepeatCount();
    }

    public boolean E() {
        b.a.a.x.e eVar = this.f1896d;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    public void g0(Boolean areEnabled) {
        this.f1898f = areEnabled.booleanValue();
    }

    public void d0(float scale) {
        this.f1897e = scale;
        i0();
    }

    public void O(b assetDelegate) {
        this.m = assetDelegate;
        b.a.a.t.b bVar = this.k;
        if (bVar != null) {
            bVar.d(assetDelegate);
        }
    }

    public void M(a assetDelegate) {
        this.o = assetDelegate;
        b.a.a.t.a aVar = this.n;
        if (aVar != null) {
            aVar.c(assetDelegate);
        }
    }

    public void h0(r textDelegate) {
        this.p = textDelegate;
    }

    public void C() {
    }

    public boolean j0() {
        return this.f1895c.c().k() > 0;
    }

    public float A() {
        return this.f1897e;
    }

    public d m() {
        return this.f1895c;
    }

    public final void i0() {
        if (this.f1895c != null) {
            float scale = A();
            setBounds(0, 0, (int) (((float) this.f1895c.b().width()) * scale), (int) (((float) this.f1895c.b().height()) * scale));
        }
    }

    public void e() {
        this.h.clear();
        this.f1896d.cancel();
    }

    public void G() {
        this.h.clear();
        this.f1896d.o();
    }

    public float x() {
        return this.f1896d.h();
    }

    public int getIntrinsicWidth() {
        d dVar = this.f1895c;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.b().width()) * A());
    }

    public int getIntrinsicHeight() {
        d dVar = this.f1895c;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.b().height()) * A());
    }

    public List<b.a.a.u.e> I(b.a.a.u.e keyPath) {
        if (this.r == null) {
            b.a.a.x.d.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        List<KeyPath> keyPaths = new ArrayList<>();
        this.r.e(keyPath, 0, keyPaths, new b.a.a.u.e(new String[0]));
        return keyPaths;
    }

    public class e implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b.a.a.u.e f1909a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f1910b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b.a.a.y.c f1911c;

        public e(b.a.a.u.e eVar, Object obj, b.a.a.y.c cVar) {
            this.f1909a = eVar;
            this.f1910b = obj;
            this.f1911c = cVar;
        }

        @Override // b.a.a.f.o
        public void a(d composition) {
            f.this.c(this.f1909a, this.f1910b, this.f1911c);
        }
    }

    public <T> void c(b.a.a.u.e keyPath, T property, b.a.a.y.c<T> cVar) {
        boolean invalidate;
        if (this.r == null) {
            this.h.add(new e(keyPath, property, cVar));
            return;
        }
        if (keyPath.d() != null) {
            keyPath.d().f(property, cVar);
            invalidate = true;
        } else {
            List<KeyPath> elements = I(keyPath);
            for (int i2 = 0; i2 < elements.size(); i2++) {
                ((b.a.a.u.e) elements.get(i2)).d().f(property, cVar);
            }
            invalidate = !elements.isEmpty();
        }
        if (invalidate) {
            invalidateSelf();
            if (property == k.A) {
                Z(x());
            }
        }
    }

    public Bitmap q(String id) {
        b.a.a.t.b bm = r();
        if (bm != null) {
            return bm.a(id);
        }
        return null;
    }

    public final b.a.a.t.b r() {
        if (getCallback() == null) {
            return null;
        }
        b.a.a.t.b bVar = this.k;
        if (bVar != null && !bVar.b(n())) {
            this.k = null;
        }
        if (this.k == null) {
            this.k = new b.a.a.t.b(getCallback(), this.l, this.m, this.f1895c.i());
        }
        return this.k;
    }

    public Typeface D(String fontFamily, String style) {
        b.a.a.t.a assetManager = o();
        if (assetManager != null) {
            return assetManager.b(fontFamily, style);
        }
        return null;
    }

    public final b.a.a.t.a o() {
        if (getCallback() == null) {
            return null;
        }
        if (this.n == null) {
            this.n = new b.a.a.t.a(getCallback());
        }
        return this.n;
    }

    public final Context n() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void invalidateDrawable(Drawable who) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, what, when);
        }
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, what);
        }
    }

    public void e0(ImageView.ScaleType scaleType) {
        this.j = scaleType;
    }

    public final float u(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f1895c.b().width()), ((float) canvas.getHeight()) / ((float) this.f1895c.b().height()));
    }

    public final void h(Canvas canvas) {
        if (this.r != null) {
            int saveCount = -1;
            Rect bounds = getBounds();
            float scaleX = ((float) bounds.width()) / ((float) this.f1895c.b().width());
            float scaleY = ((float) bounds.height()) / ((float) this.f1895c.b().height());
            if (this.v) {
                float maxScale = Math.min(scaleX, scaleY);
                float extraScale = 1.0f;
                if (maxScale < 1.0f) {
                    extraScale = 1.0f / maxScale;
                    scaleX /= extraScale;
                    scaleY /= extraScale;
                }
                if (extraScale > 1.0f) {
                    saveCount = canvas.save();
                    float halfWidth = ((float) bounds.width()) / 2.0f;
                    float halfHeight = ((float) bounds.height()) / 2.0f;
                    float scaledHalfWidth = halfWidth * maxScale;
                    float scaledHalfHeight = halfHeight * maxScale;
                    canvas.translate(halfWidth - scaledHalfWidth, halfHeight - scaledHalfHeight);
                    canvas.scale(extraScale, extraScale, scaledHalfWidth, scaledHalfHeight);
                }
            }
            this.f1894b.reset();
            this.f1894b.preScale(scaleX, scaleY);
            this.r.g(canvas, this.f1894b, this.s);
            if (saveCount > 0) {
                canvas.restoreToCount(saveCount);
            }
        }
    }

    public final void i(Canvas canvas) {
        if (this.r != null) {
            float scale = this.f1897e;
            float extraScale = 1.0f;
            float maxScale = u(canvas);
            if (scale > maxScale) {
                scale = maxScale;
                extraScale = this.f1897e / scale;
            }
            int saveCount = -1;
            if (extraScale > 1.0f) {
                saveCount = canvas.save();
                float halfWidth = ((float) this.f1895c.b().width()) / 2.0f;
                float halfHeight = ((float) this.f1895c.b().height()) / 2.0f;
                float scaledHalfWidth = halfWidth * scale;
                float scaledHalfHeight = halfHeight * scale;
                canvas.translate((A() * halfWidth) - scaledHalfWidth, (A() * halfHeight) - scaledHalfHeight);
                canvas.scale(extraScale, extraScale, scaledHalfWidth, scaledHalfHeight);
            }
            this.f1894b.reset();
            this.f1894b.preScale(scale, scale);
            this.r.g(canvas, this.f1894b, this.s);
            if (saveCount > 0) {
                canvas.restoreToCount(saveCount);
            }
        }
    }
}
