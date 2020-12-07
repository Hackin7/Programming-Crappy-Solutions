package b.a.a.u.k;

import android.graphics.Paint;
import b.a.a.f;
import b.a.a.s.b.c;
import b.a.a.s.b.r;
import b.a.a.u.j.d;
import java.util.List;

public class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2195a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a.a.u.j.b f2196b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b.a.a.u.j.b> f2197c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a.a.u.j.a f2198d;

    /* renamed from: e  reason: collision with root package name */
    public final d f2199e;

    /* renamed from: f  reason: collision with root package name */
    public final b.a.a.u.j.b f2200f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2201g;
    public final b h;
    public final float i;
    public final boolean j;

    public enum a {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap a() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return Paint.Cap.BUTT;
            }
            if (ordinal != 1) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    public enum b {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join a() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return Paint.Join.MITER;
            }
            if (ordinal == 1) {
                return Paint.Join.ROUND;
            }
            if (ordinal != 2) {
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public p(String name, b.a.a.u.j.b offset, List<b.a.a.u.j.b> list, b.a.a.u.j.a color, d opacity, b.a.a.u.j.b width, a capType, b joinType, float miterLimit, boolean hidden) {
        this.f2195a = name;
        this.f2196b = offset;
        this.f2197c = list;
        this.f2198d = color;
        this.f2199e = opacity;
        this.f2200f = width;
        this.f2201g = capType;
        this.h = joinType;
        this.i = miterLimit;
        this.j = hidden;
    }

    @Override // b.a.a.u.k.b
    public c a(f drawable, b.a.a.u.l.a layer) {
        return new r(drawable, layer, this);
    }

    public String h() {
        return this.f2195a;
    }

    public b.a.a.u.j.a c() {
        return this.f2198d;
    }

    public d i() {
        return this.f2199e;
    }

    public b.a.a.u.j.b j() {
        return this.f2200f;
    }

    public List<b.a.a.u.j.b> f() {
        return this.f2197c;
    }

    public b.a.a.u.j.b d() {
        return this.f2196b;
    }

    public a b() {
        return this.f2201g;
    }

    public b e() {
        return this.h;
    }

    public float g() {
        return this.i;
    }

    public boolean k() {
        return this.j;
    }
}
