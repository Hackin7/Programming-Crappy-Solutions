package b.a.a.w;

import android.graphics.Color;
import android.graphics.Rect;
import b.a.a.u.j.b;
import b.a.a.u.j.j;
import b.a.a.u.j.k;
import b.a.a.u.j.l;
import b.a.a.u.l.d;
import b.a.a.w.k0.c;
import b.a.a.x.h;
import b.a.a.y.a;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f2304a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f2305b = c.a.a("d", "a");

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f2306c = c.a.a("nm");

    public static d a(b.a.a.d composition) {
        Rect bounds = composition.b();
        return new d(Collections.emptyList(), composition, "__container", -1, d.a.PRE_COMP, -1, null, Collections.emptyList(), new l(), 0, 0, 0, 0.0f, 0.0f, bounds.width(), bounds.height(), null, null, Collections.emptyList(), d.b.NONE, null, false);
    }

    public static d b(c reader, b.a.a.d composition) {
        List<ContentModel> shapes;
        List<Mask> masks;
        List<ContentModel> shapes2;
        float inFrame = 0.0f;
        float outFrame = 0.0f;
        d.b matteType = d.b.NONE;
        List<Mask> masks2 = new ArrayList<>();
        List<ContentModel> shapes3 = new ArrayList<>();
        reader.h();
        d.a layerType = null;
        String refId = null;
        long layerId = 0;
        int solidWidth = 0;
        int solidHeight = 0;
        int solidColor = 0;
        int preCompWidth = 0;
        int preCompHeight = 0;
        long parentId = -1;
        float timeStretch = 1.0f;
        float startFrame = 0.0f;
        String cl = null;
        boolean hidden = false;
        d.b matteType2 = matteType;
        l transform = null;
        j text = null;
        k textProperties = null;
        b timeRemapping = null;
        String layerName = "UNSET";
        while (reader.l()) {
            switch (reader.u(f2304a)) {
                case 0:
                    layerName = reader.q();
                    continue;
                case 1:
                    layerId = (long) reader.o();
                    continue;
                case 2:
                    refId = reader.q();
                    continue;
                case 3:
                    int layerTypeInt = reader.o();
                    d.a aVar = d.a.UNKNOWN;
                    if (layerTypeInt < 6) {
                        layerType = d.a.values()[layerTypeInt];
                        masks2 = masks2;
                        shapes3 = shapes3;
                        continue;
                    } else {
                        layerType = d.a.UNKNOWN;
                        masks2 = masks2;
                        shapes3 = shapes3;
                    }
                case 4:
                    parentId = (long) reader.o();
                    continue;
                case 5:
                    solidWidth = (int) (((float) reader.o()) * h.e());
                    continue;
                case 6:
                    solidHeight = (int) (((float) reader.o()) * h.e());
                    continue;
                case 7:
                    solidColor = Color.parseColor(reader.q());
                    continue;
                case 8:
                    transform = c.g(reader, composition);
                    continue;
                case 9:
                    matteType2 = d.b.values()[reader.o()];
                    composition.q(1);
                    continue;
                case 10:
                    shapes = shapes3;
                    reader.g();
                    while (reader.l()) {
                        masks2.add(u.a(reader, composition));
                    }
                    masks = masks2;
                    composition.q(masks.size());
                    reader.i();
                    break;
                case 11:
                    reader.g();
                    while (reader.l()) {
                        b.a.a.u.k.b shape = g.a(reader, composition);
                        if (shape != null) {
                            shapes2 = shapes3;
                            shapes2.add(shape);
                        } else {
                            shapes2 = shapes3;
                        }
                        shapes3 = shapes2;
                    }
                    shapes = shapes3;
                    reader.i();
                    masks = masks2;
                    break;
                case 12:
                    reader.h();
                    while (reader.l()) {
                        int u = reader.u(f2305b);
                        if (u == 0) {
                            text = d.d(reader, composition);
                        } else if (u != 1) {
                            reader.v();
                            reader.w();
                        } else {
                            reader.g();
                            if (reader.l()) {
                                textProperties = b.a(reader, composition);
                            }
                            while (reader.l()) {
                                reader.w();
                            }
                            reader.i();
                        }
                    }
                    reader.j();
                    continue;
                case 13:
                    reader.g();
                    List<String> effectNames = new ArrayList<>();
                    while (reader.l()) {
                        reader.h();
                        while (reader.l()) {
                            if (reader.u(f2306c) != 0) {
                                reader.v();
                                reader.w();
                            } else {
                                effectNames.add(reader.q());
                            }
                        }
                        reader.j();
                    }
                    reader.i();
                    composition.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + effectNames);
                    masks = masks2;
                    shapes = shapes3;
                    break;
                case 14:
                    timeStretch = (float) reader.n();
                    continue;
                case 15:
                    startFrame = (float) reader.n();
                    continue;
                case 16:
                    preCompWidth = (int) (((float) reader.o()) * h.e());
                    continue;
                case 17:
                    preCompHeight = (int) (((float) reader.o()) * h.e());
                    continue;
                case 18:
                    inFrame = (float) reader.n();
                    continue;
                case 19:
                    outFrame = (float) reader.n();
                    continue;
                case 20:
                    timeRemapping = d.f(reader, composition, false);
                    continue;
                case 21:
                    cl = reader.q();
                    continue;
                case 22:
                    hidden = reader.m();
                    continue;
                default:
                    masks = masks2;
                    shapes = shapes3;
                    reader.v();
                    reader.w();
                    break;
            }
            masks2 = masks;
            shapes3 = shapes;
        }
        reader.j();
        float inFrame2 = inFrame / timeStretch;
        float outFrame2 = outFrame / timeStretch;
        List<Keyframe<Float>> inOutKeyframes = new ArrayList<>();
        if (inFrame2 > 0.0f) {
            inOutKeyframes.add(new a<>(composition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(inFrame2)));
        }
        float outFrame3 = outFrame2 > 0.0f ? outFrame2 : composition.f();
        inOutKeyframes.add(new a<>(composition, Float.valueOf(1.0f), Float.valueOf(1.0f), null, inFrame2, Float.valueOf(outFrame3)));
        inOutKeyframes.add(new a<>(composition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, outFrame3, Float.valueOf(Float.MAX_VALUE)));
        if (layerName.endsWith(".ai") || "ai".equals(cl)) {
            composition.a("Convert your Illustrator layers to shape layers.");
        }
        return new d(shapes3, composition, layerName, layerId, layerType, parentId, refId, masks2, transform, solidWidth, solidHeight, solidColor, timeStretch, startFrame, preCompWidth, preCompHeight, text, textProperties, inOutKeyframes, matteType2, timeRemapping, hidden);
    }
}
