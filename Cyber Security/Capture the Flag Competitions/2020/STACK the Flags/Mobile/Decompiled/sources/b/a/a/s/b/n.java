package b.a.a.s.b;

import android.graphics.Path;
import android.graphics.PointF;
import b.a.a.f;
import b.a.a.k;
import b.a.a.s.c.a;
import b.a.a.u.e;
import b.a.a.u.k.i;
import b.a.a.u.k.q;
import b.a.a.x.g;
import b.a.a.y.c;
import java.util.List;

public class n implements m, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f2000a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f2001b;

    /* renamed from: c  reason: collision with root package name */
    public final f f2002c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a f2003d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2004e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, Float> f2005f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, PointF> f2006g;
    public final a<?, Float> h;
    public final a<?, Float> i;
    public final a<?, Float> j;
    public final a<?, Float> k;
    public final a<?, Float> l;
    public b m = new b();
    public boolean n;

    public n(f lottieDrawable, b.a.a.u.l.a layer, i polystarShape) {
        this.f2002c = lottieDrawable;
        this.f2001b = polystarShape.d();
        this.f2003d = polystarShape.j();
        this.f2004e = polystarShape.k();
        this.f2005f = polystarShape.g().a();
        this.f2006g = polystarShape.h().a();
        this.h = polystarShape.i().a();
        this.j = polystarShape.e().a();
        this.l = polystarShape.f().a();
        if (this.f2003d == i.a.STAR) {
            this.i = polystarShape.b().a();
            this.k = polystarShape.c().a();
        } else {
            this.i = null;
            this.k = null;
        }
        layer.k(this.f2005f);
        layer.k(this.f2006g);
        layer.k(this.h);
        layer.k(this.j);
        layer.k(this.l);
        if (this.f2003d == i.a.STAR) {
            layer.k(this.i);
            layer.k(this.k);
        }
        this.f2005f.a(this);
        this.f2006g.a(this);
        this.h.a(this);
        this.j.a(this);
        this.l.a(this);
        if (this.f2003d == i.a.STAR) {
            this.i.a(this);
            this.k.a(this);
        }
    }

    @Override // b.a.a.s.c.a.b
    public void b() {
        k();
    }

    public final void k() {
        this.n = false;
        this.f2002c.invalidateSelf();
    }

    @Override // b.a.a.s.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            c content = list.get(i2);
            if ((content instanceof s) && ((s) content).k() == q.a.SIMULTANEOUSLY) {
                s trimPath = (s) content;
                this.m.a(trimPath);
                trimPath.d(this);
            }
        }
    }

    @Override // b.a.a.s.b.m
    public Path h() {
        if (this.n) {
            return this.f2000a;
        }
        this.f2000a.reset();
        if (this.f2004e) {
            this.n = true;
            return this.f2000a;
        }
        int ordinal = this.f2003d.ordinal();
        if (ordinal == 0) {
            j();
        } else if (ordinal == 1) {
            d();
        }
        this.f2000a.close();
        this.m.b(this.f2000a);
        this.n = true;
        return this.f2000a;
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.f2001b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x023c  */
    public final void j() {
        float x;
        float y;
        float halfAnglePerPoint;
        float outerRadius;
        double currentAngle;
        float radius;
        float dTheta;
        float outerRadius2;
        float anglePerPoint;
        float radius2;
        float dTheta2;
        float outerRoundedness;
        float innerRoundedness;
        float innerRadius;
        n nVar;
        float cp2y;
        float cp2x;
        float cp2Dx;
        float cp2Theta;
        float dTheta3;
        float points = this.f2005f.h().floatValue();
        a<?, Float> aVar = this.h;
        double currentAngle2 = Math.toRadians((aVar == null ? 0.0d : (double) aVar.h().floatValue()) - 90.0d);
        float anglePerPoint2 = (float) (6.283185307179586d / ((double) points));
        float halfAnglePerPoint2 = anglePerPoint2 / 2.0f;
        float partialPointAmount = points - ((float) ((int) points));
        if (partialPointAmount != 0.0f) {
            currentAngle2 += (double) ((1.0f - partialPointAmount) * halfAnglePerPoint2);
        }
        float outerRadius3 = this.j.h().floatValue();
        float innerRadius2 = this.i.h().floatValue();
        float innerRoundedness2 = 0.0f;
        a<?, Float> aVar2 = this.k;
        if (aVar2 != null) {
            innerRoundedness2 = aVar2.h().floatValue() / 100.0f;
        }
        float outerRoundedness2 = 0.0f;
        a<?, Float> aVar3 = this.l;
        if (aVar3 != null) {
            outerRoundedness2 = aVar3.h().floatValue() / 100.0f;
        }
        float partialPointRadius = 0.0f;
        if (partialPointAmount != 0.0f) {
            partialPointRadius = innerRadius2 + ((outerRadius3 - innerRadius2) * partialPointAmount);
            x = (float) (((double) partialPointRadius) * Math.cos(currentAngle2));
            y = (float) (((double) partialPointRadius) * Math.sin(currentAngle2));
            this.f2000a.moveTo(x, y);
            currentAngle = currentAngle2 + ((double) ((anglePerPoint2 * partialPointAmount) / 2.0f));
            outerRadius = outerRadius3;
            halfAnglePerPoint = halfAnglePerPoint2;
        } else {
            outerRadius = outerRadius3;
            x = (float) (((double) outerRadius) * Math.cos(currentAngle2));
            float y2 = (float) (((double) outerRadius) * Math.sin(currentAngle2));
            this.f2000a.moveTo(x, y2);
            halfAnglePerPoint = halfAnglePerPoint2;
            currentAngle = currentAngle2 + ((double) halfAnglePerPoint);
            y = y2;
        }
        boolean longSegment = false;
        double currentAngle3 = currentAngle;
        double numPoints = Math.ceil((double) points) * 2.0d;
        int i2 = 0;
        while (((double) i2) < numPoints) {
            float radius3 = longSegment ? outerRadius : innerRadius2;
            if (partialPointRadius != 0.0f) {
                radius = radius3;
                dTheta3 = halfAnglePerPoint;
                if (((double) i2) == numPoints - 2.0d) {
                    dTheta = (anglePerPoint2 * partialPointAmount) / 2.0f;
                    if (partialPointRadius == 0.0f) {
                        anglePerPoint = anglePerPoint2;
                        outerRadius2 = outerRadius;
                        if (((double) i2) == numPoints - 1.0d) {
                            radius2 = partialPointRadius;
                            x = (float) (((double) radius2) * Math.cos(currentAngle3));
                            y = (float) (((double) radius2) * Math.sin(currentAngle3));
                            if (innerRoundedness2 == 0.0f || outerRoundedness2 != 0.0f) {
                                nVar = this;
                                innerRadius = innerRadius2;
                                innerRoundedness = innerRoundedness2;
                                float cp1Theta = (float) (Math.atan2((double) y, (double) x) - 1.5707963267948966d);
                                float cp1Dx = (float) Math.cos((double) cp1Theta);
                                float cp1Dy = (float) Math.sin((double) cp1Theta);
                                outerRoundedness = outerRoundedness2;
                                dTheta2 = dTheta;
                                float cp2Theta2 = (float) (Math.atan2((double) y, (double) x) - 1.5707963267948966d);
                                float cp2Dx2 = (float) Math.cos((double) cp2Theta2);
                                float cp2Dy = (float) Math.sin((double) cp2Theta2);
                                float cp1Roundedness = longSegment ? innerRoundedness : outerRoundedness;
                                float cp2Roundedness = longSegment ? outerRoundedness : innerRoundedness;
                                float cp1Radius = longSegment ? innerRadius : outerRadius2;
                                float cp2Radius = longSegment ? outerRadius2 : innerRadius;
                                float cp1x = cp1Radius * cp1Roundedness * 0.47829f * cp1Dx;
                                float cp1y = cp1Radius * cp1Roundedness * 0.47829f * cp1Dy;
                                float cp2x2 = cp2Radius * cp2Roundedness * 0.47829f * cp2Dx2;
                                float cp2y2 = cp2Radius * cp2Roundedness * 0.47829f * cp2Dy;
                                if (partialPointAmount != 0.0f) {
                                    if (i2 == 0) {
                                        cp2Theta = cp1x * partialPointAmount;
                                        cp2Dx = cp1y * partialPointAmount;
                                        cp2x = cp2x2;
                                        cp2y = cp2y2;
                                    } else if (((double) i2) == numPoints - 1.0d) {
                                        cp2Theta = cp1x;
                                        cp2Dx = cp1y;
                                        cp2x = cp2x2 * partialPointAmount;
                                        cp2y = cp2y2 * partialPointAmount;
                                    }
                                    nVar.f2000a.cubicTo(x - cp2Theta, y - cp2Dx, x + cp2x, y + cp2y, x, y);
                                }
                                cp2Theta = cp1x;
                                cp2Dx = cp1y;
                                cp2x = cp2x2;
                                cp2y = cp2y2;
                                nVar.f2000a.cubicTo(x - cp2Theta, y - cp2Dx, x + cp2x, y + cp2y, x, y);
                            } else {
                                nVar = this;
                                nVar.f2000a.lineTo(x, y);
                                dTheta2 = dTheta;
                                innerRadius = innerRadius2;
                                innerRoundedness = innerRoundedness2;
                                outerRoundedness = outerRoundedness2;
                            }
                            currentAngle3 += (double) dTheta2;
                            longSegment = !longSegment;
                            i2++;
                            anglePerPoint2 = anglePerPoint;
                            points = points;
                            outerRadius = outerRadius2;
                            numPoints = numPoints;
                            innerRadius2 = innerRadius;
                            innerRoundedness2 = innerRoundedness;
                            outerRoundedness2 = outerRoundedness;
                        }
                    } else {
                        anglePerPoint = anglePerPoint2;
                        outerRadius2 = outerRadius;
                    }
                    radius2 = radius;
                    x = (float) (((double) radius2) * Math.cos(currentAngle3));
                    y = (float) (((double) radius2) * Math.sin(currentAngle3));
                    if (innerRoundedness2 == 0.0f) {
                    }
                    nVar = this;
                    innerRadius = innerRadius2;
                    innerRoundedness = innerRoundedness2;
                    float cp1Theta2 = (float) (Math.atan2((double) y, (double) x) - 1.5707963267948966d);
                    float cp1Dx2 = (float) Math.cos((double) cp1Theta2);
                    float cp1Dy2 = (float) Math.sin((double) cp1Theta2);
                    outerRoundedness = outerRoundedness2;
                    dTheta2 = dTheta;
                    float cp2Theta22 = (float) (Math.atan2((double) y, (double) x) - 1.5707963267948966d);
                    float cp2Dx22 = (float) Math.cos((double) cp2Theta22);
                    float cp2Dy2 = (float) Math.sin((double) cp2Theta22);
                    if (longSegment) {
                    }
                    if (longSegment) {
                    }
                    if (longSegment) {
                    }
                    if (longSegment) {
                    }
                    float cp1x2 = cp1Radius * cp1Roundedness * 0.47829f * cp1Dx2;
                    float cp1y2 = cp1Radius * cp1Roundedness * 0.47829f * cp1Dy2;
                    float cp2x22 = cp2Radius * cp2Roundedness * 0.47829f * cp2Dx22;
                    float cp2y22 = cp2Radius * cp2Roundedness * 0.47829f * cp2Dy2;
                    if (partialPointAmount != 0.0f) {
                    }
                    cp2Theta = cp1x2;
                    cp2Dx = cp1y2;
                    cp2x = cp2x22;
                    cp2y = cp2y22;
                    nVar.f2000a.cubicTo(x - cp2Theta, y - cp2Dx, x + cp2x, y + cp2y, x, y);
                    currentAngle3 += (double) dTheta2;
                    longSegment = !longSegment;
                    i2++;
                    anglePerPoint2 = anglePerPoint;
                    points = points;
                    outerRadius = outerRadius2;
                    numPoints = numPoints;
                    innerRadius2 = innerRadius;
                    innerRoundedness2 = innerRoundedness;
                    outerRoundedness2 = outerRoundedness;
                }
            } else {
                radius = radius3;
                dTheta3 = halfAnglePerPoint;
            }
            dTheta = dTheta3;
            if (partialPointRadius == 0.0f) {
            }
            radius2 = radius;
            x = (float) (((double) radius2) * Math.cos(currentAngle3));
            y = (float) (((double) radius2) * Math.sin(currentAngle3));
            if (innerRoundedness2 == 0.0f) {
            }
            nVar = this;
            innerRadius = innerRadius2;
            innerRoundedness = innerRoundedness2;
            float cp1Theta22 = (float) (Math.atan2((double) y, (double) x) - 1.5707963267948966d);
            float cp1Dx22 = (float) Math.cos((double) cp1Theta22);
            float cp1Dy22 = (float) Math.sin((double) cp1Theta22);
            outerRoundedness = outerRoundedness2;
            dTheta2 = dTheta;
            float cp2Theta222 = (float) (Math.atan2((double) y, (double) x) - 1.5707963267948966d);
            float cp2Dx222 = (float) Math.cos((double) cp2Theta222);
            float cp2Dy22 = (float) Math.sin((double) cp2Theta222);
            if (longSegment) {
            }
            if (longSegment) {
            }
            if (longSegment) {
            }
            if (longSegment) {
            }
            float cp1x22 = cp1Radius * cp1Roundedness * 0.47829f * cp1Dx22;
            float cp1y22 = cp1Radius * cp1Roundedness * 0.47829f * cp1Dy22;
            float cp2x222 = cp2Radius * cp2Roundedness * 0.47829f * cp2Dx222;
            float cp2y222 = cp2Radius * cp2Roundedness * 0.47829f * cp2Dy22;
            if (partialPointAmount != 0.0f) {
            }
            cp2Theta = cp1x22;
            cp2Dx = cp1y22;
            cp2x = cp2x222;
            cp2y = cp2y222;
            nVar.f2000a.cubicTo(x - cp2Theta, y - cp2Dx, x + cp2x, y + cp2y, x, y);
            currentAngle3 += (double) dTheta2;
            longSegment = !longSegment;
            i2++;
            anglePerPoint2 = anglePerPoint;
            points = points;
            outerRadius = outerRadius2;
            numPoints = numPoints;
            innerRadius2 = innerRadius;
            innerRoundedness2 = innerRoundedness;
            outerRoundedness2 = outerRoundedness;
        }
        PointF position = this.f2006g.h();
        this.f2000a.offset(position.x, position.y);
        this.f2000a.close();
    }

    public final void d() {
        float anglePerPoint;
        double currentAngle;
        double numPoints;
        int points;
        int points2 = (int) Math.floor((double) this.f2005f.h().floatValue());
        a<?, Float> aVar = this.h;
        double currentAngle2 = Math.toRadians((aVar == null ? 0.0d : (double) aVar.h().floatValue()) - 90.0d);
        float anglePerPoint2 = (float) (6.283185307179586d / ((double) points2));
        float roundedness = this.l.h().floatValue() / 100.0f;
        float radius = this.j.h().floatValue();
        float x = (float) (((double) radius) * Math.cos(currentAngle2));
        float y = (float) (((double) radius) * Math.sin(currentAngle2));
        this.f2000a.moveTo(x, y);
        double currentAngle3 = currentAngle2 + ((double) anglePerPoint2);
        double numPoints2 = Math.ceil((double) points2);
        int i2 = 0;
        while (((double) i2) < numPoints2) {
            x = (float) (((double) radius) * Math.cos(currentAngle3));
            y = (float) (((double) radius) * Math.sin(currentAngle3));
            if (roundedness != 0.0f) {
                numPoints = numPoints2;
                float cp1Theta = (float) (Math.atan2((double) y, (double) x) - 1.5707963267948966d);
                float cp1Dx = (float) Math.cos((double) cp1Theta);
                points = points2;
                currentAngle = currentAngle3;
                anglePerPoint = anglePerPoint2;
                float cp2Theta = (float) (Math.atan2((double) y, (double) x) - 1.5707963267948966d);
                this.f2000a.cubicTo(x - (((radius * roundedness) * 0.25f) * cp1Dx), y - (((radius * roundedness) * 0.25f) * ((float) Math.sin((double) cp1Theta))), x + (radius * roundedness * 0.25f * ((float) Math.cos((double) cp2Theta))), y + (radius * roundedness * 0.25f * ((float) Math.sin((double) cp2Theta))), x, y);
            } else {
                points = points2;
                currentAngle = currentAngle3;
                anglePerPoint = anglePerPoint2;
                numPoints = numPoints2;
                this.f2000a.lineTo(x, y);
            }
            currentAngle3 = currentAngle + ((double) anglePerPoint);
            i2++;
            anglePerPoint2 = anglePerPoint;
            points2 = points;
            numPoints2 = numPoints;
        }
        PointF position = this.f2006g.h();
        this.f2000a.offset(position.x, position.y);
        this.f2000a.close();
    }

    @Override // b.a.a.u.f
    public void e(e keyPath, int depth, List<e> list, e currentPartialKeyPath) {
        g.l(keyPath, depth, list, currentPartialKeyPath, this);
    }

    @Override // b.a.a.u.f
    public <T> void f(T property, c<T> cVar) {
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (property == k.s) {
            this.f2005f.m(cVar);
        } else if (property == k.t) {
            this.h.m(cVar);
        } else if (property == k.j) {
            this.f2006g.m(cVar);
        } else if (property == k.u && (aVar2 = this.i) != null) {
            aVar2.m(cVar);
        } else if (property == k.v) {
            this.j.m(cVar);
        } else if (property == k.w && (aVar = this.k) != null) {
            aVar.m(cVar);
        } else if (property == k.x) {
            this.l.m(cVar);
        }
    }
}
