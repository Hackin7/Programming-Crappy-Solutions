package a.s.a.a;

import a.h.f.c;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends f {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public h f1438c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuffColorFilter f1439d;

    /* renamed from: e  reason: collision with root package name */
    public ColorFilter f1440e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1441f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1442g;
    public final float[] h;
    public final Matrix i;
    public final Rect j;

    public g() {
        this.f1442g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f1438c = new h();
    }

    public g(h state) {
        this.f1442g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f1438c = state;
        this.f1439d = j(state.f1466c, state.f1467d);
    }

    public Drawable mutate() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1441f && super.mutate() == this) {
            this.f1438c = new h(this.f1438c);
            this.f1441f = true;
        }
        return this;
    }

    public Object d(String name) {
        return this.f1438c.f1465b.p.get(name);
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f1437b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f1437b.getConstantState());
        }
        this.f1438c.f1464a = getChangingConfigurations();
        return this.f1438c;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() > 0 && this.j.height() > 0) {
            ColorFilter colorFilter = this.f1440e;
            if (colorFilter == null) {
                colorFilter = this.f1439d;
            }
            canvas.getMatrix(this.i);
            this.i.getValues(this.h);
            float canvasScaleX = Math.abs(this.h[0]);
            float canvasScaleY = Math.abs(this.h[4]);
            float canvasSkewX = Math.abs(this.h[1]);
            float canvasSkewY = Math.abs(this.h[3]);
            if (!(canvasSkewX == 0.0f && canvasSkewY == 0.0f)) {
                canvasScaleX = 1.0f;
                canvasScaleY = 1.0f;
            }
            int scaledWidth = Math.min(2048, (int) (((float) this.j.width()) * canvasScaleX));
            int scaledHeight = Math.min(2048, (int) (((float) this.j.height()) * canvasScaleY));
            if (scaledWidth > 0 && scaledHeight > 0) {
                int saveCount = canvas.save();
                Rect rect = this.j;
                canvas.translate((float) rect.left, (float) rect.top);
                if (f()) {
                    canvas.translate((float) this.j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.j.offsetTo(0, 0);
                this.f1438c.c(scaledWidth, scaledHeight);
                if (!this.f1442g) {
                    this.f1438c.j(scaledWidth, scaledHeight);
                } else if (!this.f1438c.b()) {
                    this.f1438c.j(scaledWidth, scaledHeight);
                    this.f1438c.i();
                }
                this.f1438c.d(canvas, colorFilter, this.j);
                canvas.restoreToCount(saveCount);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return a.h.f.l.a.d(drawable);
        }
        return this.f1438c.f1465b.getRootAlpha();
    }

    public void setAlpha(int alpha) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        } else if (this.f1438c.f1465b.getRootAlpha() != alpha) {
            this.f1438c.f1465b.setRootAlpha(alpha);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f1440e = colorFilter;
        invalidateSelf();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return a.h.f.l.a.e(drawable);
        }
        return this.f1440e;
    }

    public PorterDuffColorFilter j(ColorStateList tint, PorterDuff.Mode tintMode) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return new PorterDuffColorFilter(tint.getColorForState(getState(), 0), tintMode);
    }

    public void setTint(int tint) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.h.f.l.a.n(drawable, tint);
        } else {
            setTintList(ColorStateList.valueOf(tint));
        }
    }

    public void setTintList(ColorStateList tint) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.h.f.l.a.o(drawable, tint);
            return;
        }
        h state = this.f1438c;
        if (state.f1466c != tint) {
            state.f1466c = tint;
            this.f1439d = j(tint, state.f1467d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.h.f.l.a.p(drawable, tintMode);
            return;
        }
        h state = this.f1438c;
        if (state.f1467d != tintMode) {
            state.f1467d = tintMode;
            this.f1439d = j(state.f1466c, tintMode);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f1438c) != null && (hVar.g() || ((colorStateList = this.f1438c.f1466c) != null && colorStateList.isStateful())));
    }

    public boolean onStateChange(int[] stateSet) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.setState(stateSet);
        }
        boolean changed = false;
        h state = this.f1438c;
        ColorStateList colorStateList = state.f1466c;
        if (!(colorStateList == null || (mode = state.f1467d) == null)) {
            this.f1439d = j(colorStateList, mode);
            invalidateSelf();
            changed = true;
        }
        if (!state.g() || !state.h(stateSet)) {
            return changed;
        }
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f1438c.f1465b.i;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f1438c.f1465b.j;
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f1437b;
        if (drawable == null) {
            return false;
        }
        a.h.f.l.a.b(drawable);
        return false;
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return a.h.f.l.a.h(drawable);
        }
        return this.f1438c.f1468e;
    }

    public void setAutoMirrored(boolean mirrored) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.h.f.l.a.j(drawable, mirrored);
        } else {
            this.f1438c.f1468e = mirrored;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037 A[Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }] */
    public static g b(Resources res, int resId, Resources.Theme theme) {
        int type;
        if (Build.VERSION.SDK_INT >= 24) {
            g drawable = new g();
            drawable.f1437b = a.h.e.c.f.a(res, resId, theme);
            new i(drawable.f1437b.getConstantState());
            return drawable;
        }
        try {
            XmlPullParser parser = res.getXml(resId);
            AttributeSet attrs = Xml.asAttributeSet(parser);
            while (true) {
                type = parser.next();
                if (type == 2 || type == 1) {
                    if (type != 2) {
                        return c(res, parser, attrs, theme);
                    }
                    throw new XmlPullParserException("No start tag found");
                }
            }
            if (type != 2) {
            }
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (IOException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public static g c(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        g drawable = new g();
        drawable.inflate(r, parser, attrs, theme);
        return drawable;
    }

    public static int a(int color, float alpha) {
        return (color & 16777215) | (((int) (((float) Color.alpha(color)) * alpha)) << 24);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.inflate(res, parser, attrs);
        } else {
            inflate(res, parser, attrs, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.h.f.l.a.g(drawable, res, parser, attrs, theme);
            return;
        }
        h state = this.f1438c;
        state.f1465b = new C0040g();
        TypedArray a2 = a.h.e.c.g.k(res, theme, attrs, a.f1417a);
        i(a2, parser, theme);
        a2.recycle();
        state.f1464a = getChangingConfigurations();
        state.k = true;
        e(res, parser, attrs, theme);
        this.f1439d = j(state.f1466c, state.f1467d);
    }

    public static PorterDuff.Mode g(int value, PorterDuff.Mode defaultMode) {
        if (value == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (value == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (value == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (value) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return defaultMode;
        }
    }

    public final void i(TypedArray a2, XmlPullParser parser, Resources.Theme theme) {
        h state = this.f1438c;
        C0040g pathRenderer = state.f1465b;
        state.f1467d = g(a.h.e.c.g.g(a2, parser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList tint = a.h.e.c.g.c(a2, parser, theme, "tint", 1);
        if (tint != null) {
            state.f1466c = tint;
        }
        state.f1468e = a.h.e.c.g.a(a2, parser, "autoMirrored", 5, state.f1468e);
        pathRenderer.k = a.h.e.c.g.f(a2, parser, "viewportWidth", 7, pathRenderer.k);
        float f2 = a.h.e.c.g.f(a2, parser, "viewportHeight", 8, pathRenderer.l);
        pathRenderer.l = f2;
        if (pathRenderer.k <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f2 > 0.0f) {
            pathRenderer.i = a2.getDimension(3, pathRenderer.i);
            float dimension = a2.getDimension(2, pathRenderer.j);
            pathRenderer.j = dimension;
            if (pathRenderer.i <= 0.0f) {
                throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                pathRenderer.setAlpha(a.h.e.c.g.f(a2, parser, "alpha", 4, pathRenderer.getAlpha()));
                String name = a2.getString(0);
                if (name != null) {
                    pathRenderer.n = name;
                    pathRenderer.p.put(name, pathRenderer);
                }
            } else {
                throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public final void e(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        h state = this.f1438c;
        C0040g pathRenderer = state.f1465b;
        boolean noPathTag = true;
        ArrayDeque<VectorDrawableCompat.VGroup> groupStack = new ArrayDeque<>();
        groupStack.push(pathRenderer.h);
        int eventType = parser.getEventType();
        int innerDepth = parser.getDepth() + 1;
        for (int i2 = 1; eventType != i2 && (parser.getDepth() >= innerDepth || eventType != 3); i2 = 1) {
            if (eventType == 2) {
                String tagName = parser.getName();
                d currentGroup = (d) groupStack.peek();
                if ("path".equals(tagName)) {
                    c path = new c();
                    path.g(res, attrs, theme, parser);
                    currentGroup.f1447b.add(path);
                    if (path.getPathName() != null) {
                        pathRenderer.p.put(path.getPathName(), path);
                    }
                    noPathTag = false;
                    state.f1464a |= path.f1456d;
                } else if ("clip-path".equals(tagName)) {
                    b path2 = new b();
                    path2.e(res, attrs, theme, parser);
                    currentGroup.f1447b.add(path2);
                    if (path2.getPathName() != null) {
                        pathRenderer.p.put(path2.getPathName(), path2);
                    }
                    state.f1464a |= path2.f1456d;
                } else if ("group".equals(tagName)) {
                    d newChildGroup = new d();
                    newChildGroup.c(res, attrs, theme, parser);
                    currentGroup.f1447b.add(newChildGroup);
                    groupStack.push(newChildGroup);
                    if (newChildGroup.getGroupName() != null) {
                        pathRenderer.p.put(newChildGroup.getGroupName(), newChildGroup);
                    }
                    state.f1464a |= newChildGroup.k;
                }
            } else if (eventType == 3 && "group".equals(parser.getName())) {
                groupStack.pop();
            }
            eventType = parser.next();
        }
        if (noPathTag) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public void h(boolean allowCaching) {
        this.f1442g = allowCaching;
    }

    public final boolean f() {
        if (!isAutoMirrored() || a.h.f.l.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f1438c.getChangingConfigurations();
    }

    public void invalidateSelf() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable what, long when) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.scheduleSelf(what, when);
        } else {
            super.scheduleSelf(what, when);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.setVisible(visible, restart);
        }
        return super.setVisible(visible, restart);
    }

    public void unscheduleSelf(Runnable what) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.unscheduleSelf(what);
        } else {
            super.unscheduleSelf(what);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f1471a;

        public i(Drawable.ConstantState state) {
            this.f1471a = state;
        }

        public Drawable newDrawable() {
            g drawableCompat = new g();
            drawableCompat.f1437b = (VectorDrawable) this.f1471a.newDrawable();
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res) {
            g drawableCompat = new g();
            drawableCompat.f1437b = (VectorDrawable) this.f1471a.newDrawable(res);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res, Resources.Theme theme) {
            g drawableCompat = new g();
            drawableCompat.f1437b = (VectorDrawable) this.f1471a.newDrawable(res, theme);
            return drawableCompat;
        }

        public boolean canApplyTheme() {
            return this.f1471a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f1471a.getChangingConfigurations();
        }
    }

    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f1464a;

        /* renamed from: b  reason: collision with root package name */
        public C0040g f1465b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f1466c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f1467d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1468e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f1469f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f1470g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public h(h copy) {
            this.f1466c = null;
            this.f1467d = g.k;
            if (copy != null) {
                this.f1464a = copy.f1464a;
                C0040g gVar = new C0040g(copy.f1465b);
                this.f1465b = gVar;
                if (copy.f1465b.f1461e != null) {
                    gVar.f1461e = new Paint(copy.f1465b.f1461e);
                }
                if (copy.f1465b.f1460d != null) {
                    this.f1465b.f1460d = new Paint(copy.f1465b.f1460d);
                }
                this.f1466c = copy.f1466c;
                this.f1467d = copy.f1467d;
                this.f1468e = copy.f1468e;
            }
        }

        public void d(Canvas canvas, ColorFilter filter, Rect originalBounds) {
            canvas.drawBitmap(this.f1469f, (Rect) null, originalBounds, e(filter));
        }

        public boolean f() {
            return this.f1465b.getRootAlpha() < 255;
        }

        public Paint e(ColorFilter filter) {
            if (!f() && filter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint = new Paint();
                this.l = paint;
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.f1465b.getRootAlpha());
            this.l.setColorFilter(filter);
            return this.l;
        }

        public void j(int width, int height) {
            this.f1469f.eraseColor(0);
            this.f1465b.b(new Canvas(this.f1469f), width, height, null);
        }

        public void c(int width, int height) {
            if (this.f1469f == null || !a(width, height)) {
                this.f1469f = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public boolean a(int width, int height) {
            if (width == this.f1469f.getWidth() && height == this.f1469f.getHeight()) {
                return true;
            }
            return false;
        }

        public boolean b() {
            if (!this.k && this.f1470g == this.f1466c && this.h == this.f1467d && this.j == this.f1468e && this.i == this.f1465b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        public void i() {
            this.f1470g = this.f1466c;
            this.h = this.f1467d;
            this.i = this.f1465b.getRootAlpha();
            this.j = this.f1468e;
            this.k = false;
        }

        public h() {
            this.f1466c = null;
            this.f1467d = g.k;
            this.f1465b = new C0040g();
        }

        public Drawable newDrawable() {
            return new g(this);
        }

        public Drawable newDrawable(Resources res) {
            return new g(this);
        }

        public int getChangingConfigurations() {
            return this.f1464a;
        }

        public boolean g() {
            return this.f1465b.f();
        }

        public boolean h(int[] stateSet) {
            boolean changed = this.f1465b.g(stateSet);
            this.k |= changed;
            return changed;
        }
    }

    /* renamed from: a.s.a.a.g$g  reason: collision with other inner class name */
    public static class C0040g {
        public static final Matrix q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f1457a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f1458b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f1459c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f1460d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f1461e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f1462f;

        /* renamed from: g  reason: collision with root package name */
        public int f1463g;
        public final d h;
        public float i;
        public float j;
        public float k;
        public float l;
        public int m;
        public String n;
        public Boolean o;
        public final a.e.a<String, Object> p;

        public C0040g() {
            this.f1459c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new a.e.a<>();
            this.h = new d();
            this.f1457a = new Path();
            this.f1458b = new Path();
        }

        public void setRootAlpha(int alpha) {
            this.m = alpha;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float alpha) {
            setRootAlpha((int) (255.0f * alpha));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public C0040g(C0040g copy) {
            this.f1459c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            a.e.a<String, Object> aVar = new a.e.a<>();
            this.p = aVar;
            this.h = new d(copy.h, aVar);
            this.f1457a = new Path(copy.f1457a);
            this.f1458b = new Path(copy.f1458b);
            this.i = copy.i;
            this.j = copy.j;
            this.k = copy.k;
            this.l = copy.l;
            this.f1463g = copy.f1463g;
            this.m = copy.m;
            this.n = copy.n;
            String str = copy.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = copy.o;
        }

        public final void c(d currentGroup, Matrix currentMatrix, Canvas canvas, int w, int h2, ColorFilter filter) {
            currentGroup.f1446a.set(currentMatrix);
            currentGroup.f1446a.preConcat(currentGroup.j);
            canvas.save();
            for (int i2 = 0; i2 < currentGroup.f1447b.size(); i2++) {
                e child = currentGroup.f1447b.get(i2);
                if (child instanceof d) {
                    c((d) child, currentGroup.f1446a, canvas, w, h2, filter);
                } else if (child instanceof f) {
                    d(currentGroup, (f) child, canvas, w, h2, filter);
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int w, int h2, ColorFilter filter) {
            c(this.h, q, canvas, w, h2, filter);
        }

        public final void d(d vGroup, f vPath, Canvas canvas, int w, int h2, ColorFilter filter) {
            float len;
            float scaleX = ((float) w) / this.k;
            float scaleY = ((float) h2) / this.l;
            float minScale = Math.min(scaleX, scaleY);
            Matrix groupStackedMatrix = vGroup.f1446a;
            this.f1459c.set(groupStackedMatrix);
            this.f1459c.postScale(scaleX, scaleY);
            float matrixScale = e(groupStackedMatrix);
            if (matrixScale != 0.0f) {
                vPath.d(this.f1457a);
                Path path = this.f1457a;
                this.f1458b.reset();
                if (vPath.c()) {
                    this.f1458b.setFillType(vPath.f1455c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f1458b.addPath(path, this.f1459c);
                    canvas.clipPath(this.f1458b);
                    return;
                }
                c fullPath = (c) vPath;
                if (fullPath.k != 0.0f || fullPath.l != 1.0f) {
                    float f2 = fullPath.k;
                    float f3 = fullPath.m;
                    float start = (f2 + f3) % 1.0f;
                    float end = (fullPath.l + f3) % 1.0f;
                    if (this.f1462f == null) {
                        this.f1462f = new PathMeasure();
                    }
                    this.f1462f.setPath(this.f1457a, false);
                    float len2 = this.f1462f.getLength();
                    float start2 = start * len2;
                    float end2 = end * len2;
                    path.reset();
                    if (start2 > end2) {
                        this.f1462f.getSegment(start2, len2, path, true);
                        len = 0.0f;
                        this.f1462f.getSegment(0.0f, end2, path, true);
                    } else {
                        len = 0.0f;
                        this.f1462f.getSegment(start2, end2, path, true);
                    }
                    path.rLineTo(len, len);
                }
                this.f1458b.addPath(path, this.f1459c);
                if (fullPath.h.l()) {
                    a.h.e.c.b fill = fullPath.h;
                    if (this.f1461e == null) {
                        Paint paint = new Paint(1);
                        this.f1461e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint fillPaint = this.f1461e;
                    if (fill.h()) {
                        Shader shader = fill.f();
                        shader.setLocalMatrix(this.f1459c);
                        fillPaint.setShader(shader);
                        fillPaint.setAlpha(Math.round(fullPath.j * 255.0f));
                    } else {
                        fillPaint.setShader(null);
                        fillPaint.setAlpha(255);
                        fillPaint.setColor(g.a(fill.e(), fullPath.j));
                    }
                    fillPaint.setColorFilter(filter);
                    this.f1458b.setFillType(fullPath.f1455c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f1458b, fillPaint);
                }
                if (fullPath.f1444f.l()) {
                    a.h.e.c.b strokeColor = fullPath.f1444f;
                    if (this.f1460d == null) {
                        Paint paint2 = new Paint(1);
                        this.f1460d = paint2;
                        paint2.setStyle(Paint.Style.STROKE);
                    }
                    Paint strokePaint = this.f1460d;
                    Paint.Join join = fullPath.o;
                    if (join != null) {
                        strokePaint.setStrokeJoin(join);
                    }
                    Paint.Cap cap = fullPath.n;
                    if (cap != null) {
                        strokePaint.setStrokeCap(cap);
                    }
                    strokePaint.setStrokeMiter(fullPath.p);
                    if (strokeColor.h()) {
                        Shader shader2 = strokeColor.f();
                        shader2.setLocalMatrix(this.f1459c);
                        strokePaint.setShader(shader2);
                        strokePaint.setAlpha(Math.round(fullPath.i * 255.0f));
                    } else {
                        strokePaint.setShader(null);
                        strokePaint.setAlpha(255);
                        strokePaint.setColor(g.a(strokeColor.e(), fullPath.i));
                    }
                    strokePaint.setColorFilter(filter);
                    strokePaint.setStrokeWidth(fullPath.f1445g * minScale * matrixScale);
                    canvas.drawPath(this.f1458b, strokePaint);
                }
            }
        }

        public static float a(float v1x, float v1y, float v2x, float v2y) {
            return (v1x * v2y) - (v1y * v2x);
        }

        public final float e(Matrix groupStackedMatrix) {
            float[] unitVectors = {0.0f, 1.0f, 1.0f, 0.0f};
            groupStackedMatrix.mapVectors(unitVectors);
            float crossProduct = a(unitVectors[0], unitVectors[1], unitVectors[2], unitVectors[3]);
            float maxScale = Math.max((float) Math.hypot((double) unitVectors[0], (double) unitVectors[1]), (float) Math.hypot((double) unitVectors[2], (double) unitVectors[3]));
            if (maxScale > 0.0f) {
                return Math.abs(crossProduct) / maxScale;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] stateSet) {
            return this.h.b(stateSet);
        }
    }

    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] stateSet) {
            return false;
        }
    }

    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f1446a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<e> f1447b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public float f1448c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1449d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1450e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1451f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1452g = 1.0f;
        public float h = 0.0f;
        public float i = 0.0f;
        public final Matrix j = new Matrix();
        public int k;
        public int[] l;
        public String m = null;

        public d(d copy, a.e.a<String, Object> aVar) {
            super();
            f newPath;
            this.f1448c = copy.f1448c;
            this.f1449d = copy.f1449d;
            this.f1450e = copy.f1450e;
            this.f1451f = copy.f1451f;
            this.f1452g = copy.f1452g;
            this.h = copy.h;
            this.i = copy.i;
            this.l = copy.l;
            String str = copy.m;
            this.m = str;
            this.k = copy.k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(copy.j);
            ArrayList<VectorDrawableCompat.VObject> children = copy.f1447b;
            for (int i2 = 0; i2 < children.size(); i2++) {
                Object copyChild = children.get(i2);
                if (copyChild instanceof d) {
                    this.f1447b.add(new d((d) copyChild, aVar));
                } else {
                    if (copyChild instanceof c) {
                        newPath = new c((c) copyChild);
                    } else if (copyChild instanceof b) {
                        newPath = new b((b) copyChild);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f1447b.add(newPath);
                    String str2 = newPath.f1454b;
                    if (str2 != null) {
                        aVar.put(str2, newPath);
                    }
                }
            }
        }

        public d() {
            super();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public void c(Resources res, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            TypedArray a2 = a.h.e.c.g.k(res, theme, attrs, a.f1418b);
            e(a2, parser);
            a2.recycle();
        }

        public final void e(TypedArray a2, XmlPullParser parser) {
            this.l = null;
            this.f1448c = a.h.e.c.g.f(a2, parser, "rotation", 5, this.f1448c);
            this.f1449d = a2.getFloat(1, this.f1449d);
            this.f1450e = a2.getFloat(2, this.f1450e);
            this.f1451f = a.h.e.c.g.f(a2, parser, "scaleX", 3, this.f1451f);
            this.f1452g = a.h.e.c.g.f(a2, parser, "scaleY", 4, this.f1452g);
            this.h = a.h.e.c.g.f(a2, parser, "translateX", 6, this.h);
            this.i = a.h.e.c.g.f(a2, parser, "translateY", 7, this.i);
            String groupName = a2.getString(0);
            if (groupName != null) {
                this.m = groupName;
            }
            d();
        }

        public final void d() {
            this.j.reset();
            this.j.postTranslate(-this.f1449d, -this.f1450e);
            this.j.postScale(this.f1451f, this.f1452g);
            this.j.postRotate(this.f1448c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.f1449d, this.i + this.f1450e);
        }

        public float getRotation() {
            return this.f1448c;
        }

        public void setRotation(float rotation) {
            if (rotation != this.f1448c) {
                this.f1448c = rotation;
                d();
            }
        }

        public float getPivotX() {
            return this.f1449d;
        }

        public void setPivotX(float pivotX) {
            if (pivotX != this.f1449d) {
                this.f1449d = pivotX;
                d();
            }
        }

        public float getPivotY() {
            return this.f1450e;
        }

        public void setPivotY(float pivotY) {
            if (pivotY != this.f1450e) {
                this.f1450e = pivotY;
                d();
            }
        }

        public float getScaleX() {
            return this.f1451f;
        }

        public void setScaleX(float scaleX) {
            if (scaleX != this.f1451f) {
                this.f1451f = scaleX;
                d();
            }
        }

        public float getScaleY() {
            return this.f1452g;
        }

        public void setScaleY(float scaleY) {
            if (scaleY != this.f1452g) {
                this.f1452g = scaleY;
                d();
            }
        }

        public float getTranslateX() {
            return this.h;
        }

        public void setTranslateX(float translateX) {
            if (translateX != this.h) {
                this.h = translateX;
                d();
            }
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setTranslateY(float translateY) {
            if (translateY != this.i) {
                this.i = translateY;
                d();
            }
        }

        @Override // a.s.a.a.g.e
        public boolean a() {
            for (int i2 = 0; i2 < this.f1447b.size(); i2++) {
                if (this.f1447b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // a.s.a.a.g.e
        public boolean b(int[] stateSet) {
            boolean changed = false;
            for (int i2 = 0; i2 < this.f1447b.size(); i2++) {
                changed |= this.f1447b.get(i2).b(stateSet);
            }
            return changed;
        }
    }

    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        public c.b[] f1453a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f1454b;

        /* renamed from: c  reason: collision with root package name */
        public int f1455c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1456d;

        public f() {
            super();
        }

        public f(f copy) {
            super();
            this.f1454b = copy.f1454b;
            this.f1456d = copy.f1456d;
            this.f1453a = a.h.f.c.f(copy.f1453a);
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.f1453a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public String getPathName() {
            return this.f1454b;
        }

        public boolean c() {
            return false;
        }

        public c.b[] getPathData() {
            return this.f1453a;
        }

        public void setPathData(c.b[] nodes) {
            if (!a.h.f.c.b(this.f1453a, nodes)) {
                this.f1453a = a.h.f.c.f(nodes);
            } else {
                a.h.f.c.j(this.f1453a, nodes);
            }
        }
    }

    public static class b extends f {
        public b() {
        }

        public b(b copy) {
            super(copy);
        }

        public void e(Resources r, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            if (a.h.e.c.g.j(parser, "pathData")) {
                TypedArray a2 = a.h.e.c.g.k(r, theme, attrs, a.f1420d);
                f(a2, parser);
                a2.recycle();
            }
        }

        public final void f(TypedArray a2, XmlPullParser parser) {
            String pathName = a2.getString(0);
            if (pathName != null) {
                this.f1454b = pathName;
            }
            String pathData = a2.getString(1);
            if (pathData != null) {
                this.f1453a = a.h.f.c.d(pathData);
            }
            this.f1455c = a.h.e.c.g.g(a2, parser, "fillType", 2, 0);
        }

        @Override // a.s.a.a.g.f
        public boolean c() {
            return true;
        }
    }

    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public int[] f1443e;

        /* renamed from: f  reason: collision with root package name */
        public a.h.e.c.b f1444f;

        /* renamed from: g  reason: collision with root package name */
        public float f1445g = 0.0f;
        public a.h.e.c.b h;
        public float i = 1.0f;
        public float j = 1.0f;
        public float k = 0.0f;
        public float l = 1.0f;
        public float m = 0.0f;
        public Paint.Cap n = Paint.Cap.BUTT;
        public Paint.Join o = Paint.Join.MITER;
        public float p = 4.0f;

        public c() {
        }

        public c(c copy) {
            super(copy);
            this.f1443e = copy.f1443e;
            this.f1444f = copy.f1444f;
            this.f1445g = copy.f1445g;
            this.i = copy.i;
            this.h = copy.h;
            this.f1455c = copy.f1455c;
            this.j = copy.j;
            this.k = copy.k;
            this.l = copy.l;
            this.m = copy.m;
            this.n = copy.n;
            this.o = copy.o;
            this.p = copy.p;
        }

        public final Paint.Cap e(int id, Paint.Cap defValue) {
            if (id == 0) {
                return Paint.Cap.BUTT;
            }
            if (id == 1) {
                return Paint.Cap.ROUND;
            }
            if (id != 2) {
                return defValue;
            }
            return Paint.Cap.SQUARE;
        }

        public final Paint.Join f(int id, Paint.Join defValue) {
            if (id == 0) {
                return Paint.Join.MITER;
            }
            if (id == 1) {
                return Paint.Join.ROUND;
            }
            if (id != 2) {
                return defValue;
            }
            return Paint.Join.BEVEL;
        }

        public void g(Resources r, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            TypedArray a2 = a.h.e.c.g.k(r, theme, attrs, a.f1419c);
            h(a2, parser, theme);
            a2.recycle();
        }

        public final void h(TypedArray a2, XmlPullParser parser, Resources.Theme theme) {
            this.f1443e = null;
            if (a.h.e.c.g.j(parser, "pathData")) {
                String pathName = a2.getString(0);
                if (pathName != null) {
                    this.f1454b = pathName;
                }
                String pathData = a2.getString(2);
                if (pathData != null) {
                    this.f1453a = a.h.f.c.d(pathData);
                }
                this.h = a.h.e.c.g.e(a2, parser, theme, "fillColor", 1, 0);
                this.j = a.h.e.c.g.f(a2, parser, "fillAlpha", 12, this.j);
                this.n = e(a.h.e.c.g.g(a2, parser, "strokeLineCap", 8, -1), this.n);
                this.o = f(a.h.e.c.g.g(a2, parser, "strokeLineJoin", 9, -1), this.o);
                this.p = a.h.e.c.g.f(a2, parser, "strokeMiterLimit", 10, this.p);
                this.f1444f = a.h.e.c.g.e(a2, parser, theme, "strokeColor", 3, 0);
                this.i = a.h.e.c.g.f(a2, parser, "strokeAlpha", 11, this.i);
                this.f1445g = a.h.e.c.g.f(a2, parser, "strokeWidth", 4, this.f1445g);
                this.l = a.h.e.c.g.f(a2, parser, "trimPathEnd", 6, this.l);
                this.m = a.h.e.c.g.f(a2, parser, "trimPathOffset", 7, this.m);
                this.k = a.h.e.c.g.f(a2, parser, "trimPathStart", 5, this.k);
                this.f1455c = a.h.e.c.g.g(a2, parser, "fillType", 13, this.f1455c);
            }
        }

        @Override // a.s.a.a.g.e
        public boolean a() {
            return this.h.i() || this.f1444f.i();
        }

        @Override // a.s.a.a.g.e
        public boolean b(int[] stateSet) {
            return this.h.j(stateSet) | this.f1444f.j(stateSet);
        }

        public int getStrokeColor() {
            return this.f1444f.e();
        }

        public void setStrokeColor(int strokeColor) {
            this.f1444f.k(strokeColor);
        }

        public float getStrokeWidth() {
            return this.f1445g;
        }

        public void setStrokeWidth(float strokeWidth) {
            this.f1445g = strokeWidth;
        }

        public float getStrokeAlpha() {
            return this.i;
        }

        public void setStrokeAlpha(float strokeAlpha) {
            this.i = strokeAlpha;
        }

        public int getFillColor() {
            return this.h.e();
        }

        public void setFillColor(int fillColor) {
            this.h.k(fillColor);
        }

        public float getFillAlpha() {
            return this.j;
        }

        public void setFillAlpha(float fillAlpha) {
            this.j = fillAlpha;
        }

        public float getTrimPathStart() {
            return this.k;
        }

        public void setTrimPathStart(float trimPathStart) {
            this.k = trimPathStart;
        }

        public float getTrimPathEnd() {
            return this.l;
        }

        public void setTrimPathEnd(float trimPathEnd) {
            this.l = trimPathEnd;
        }

        public float getTrimPathOffset() {
            return this.m;
        }

        public void setTrimPathOffset(float trimPathOffset) {
            this.m = trimPathOffset;
        }
    }
}
