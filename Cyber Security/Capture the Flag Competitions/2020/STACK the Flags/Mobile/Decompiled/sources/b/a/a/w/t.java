package b.a.a.w;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import b.a.a.d;
import b.a.a.g;
import b.a.a.u.l.d;
import b.a.a.w.k0.c;
import b.a.a.x.h;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f2307a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b  reason: collision with root package name */
    public static c.a f2308b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f2309c = c.a.a("list");

    /* renamed from: d  reason: collision with root package name */
    public static final c.a f2310d = c.a.a("cm", "tm", "dr");

    public static d a(c reader) {
        SparseArrayCompat<FontCharacter> characters;
        List<Marker> markers;
        c cVar = reader;
        float scale = h.e();
        float startFrame = 0.0f;
        float endFrame = 0.0f;
        float frameRate = 0.0f;
        LongSparseArray<Layer> layerMap = new a.e.d<>();
        List<Layer> layers = new ArrayList<>();
        Map<String, List<Layer>> precomps = new HashMap<>();
        Map<String, LottieImageAsset> images = new HashMap<>();
        Map<String, Font> fonts = new HashMap<>();
        List<Marker> markers2 = new ArrayList<>();
        SparseArrayCompat<FontCharacter> characters2 = new a.e.h<>();
        d composition = new d();
        reader.h();
        int width = 0;
        int height = 0;
        while (reader.l()) {
            switch (cVar.u(f2307a)) {
                case 0:
                    width = reader.o();
                    frameRate = frameRate;
                    cVar = reader;
                    continue;
                case 1:
                    height = reader.o();
                    frameRate = frameRate;
                    cVar = reader;
                    continue;
                case 2:
                    startFrame = (float) reader.n();
                    markers2 = markers2;
                    characters2 = characters2;
                    frameRate = frameRate;
                    cVar = reader;
                    continue;
                case 3:
                    endFrame = ((float) reader.n()) - 0.01f;
                    markers2 = markers2;
                    characters2 = characters2;
                    frameRate = frameRate;
                    cVar = reader;
                    continue;
                case 4:
                    markers2 = markers2;
                    characters2 = characters2;
                    frameRate = (float) reader.n();
                    cVar = reader;
                    continue;
                case 5:
                    String[] versions = reader.q().split("\\.");
                    if (h.j(Integer.parseInt(versions[0]), Integer.parseInt(versions[1]), Integer.parseInt(versions[2]), 4, 4, 0)) {
                        characters = characters2;
                        markers = markers2;
                        break;
                    } else {
                        composition.a("Lottie only supports bodymovin >= 4.4.0");
                        characters = characters2;
                        markers = markers2;
                        break;
                    }
                case 6:
                    e(cVar, composition, layers, layerMap);
                    characters = characters2;
                    markers = markers2;
                    break;
                case 7:
                    b(cVar, composition, precomps, images);
                    characters = characters2;
                    markers = markers2;
                    break;
                case 8:
                    d(cVar, fonts);
                    characters = characters2;
                    markers = markers2;
                    break;
                case 9:
                    c(cVar, composition, characters2);
                    characters = characters2;
                    markers = markers2;
                    break;
                case 10:
                    f(cVar, markers2);
                    characters = characters2;
                    markers = markers2;
                    break;
                default:
                    characters = characters2;
                    markers = markers2;
                    reader.v();
                    reader.w();
                    break;
            }
            markers2 = markers;
            characters2 = characters;
            frameRate = frameRate;
            cVar = reader;
        }
        composition.r(new Rect(0, 0, (int) (((float) width) * scale), (int) (((float) height) * scale)), startFrame, endFrame, frameRate, layers, layerMap, precomps, images, characters2, fonts, markers2);
        return composition;
    }

    public static void e(c reader, d composition, List<b.a.a.u.l.d> list, a.e.d<b.a.a.u.l.d> dVar) {
        int imageCount = 0;
        reader.g();
        while (reader.l()) {
            b.a.a.u.l.d layer = s.b(reader, composition);
            if (layer.d() == d.a.IMAGE) {
                imageCount++;
            }
            list.add(layer);
            dVar.j(layer.b(), layer);
            if (imageCount > 4) {
                b.a.a.x.d.c("You have " + imageCount + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        reader.i();
    }

    public static void b(c reader, b.a.a.d composition, Map<String, List<b.a.a.u.l.d>> map, Map<String, g> map2) {
        reader.g();
        while (reader.l()) {
            String id = null;
            List<Layer> layers = new ArrayList<>();
            LongSparseArray<Layer> layerMap = new a.e.d<>();
            int width = 0;
            int height = 0;
            String imageFileName = null;
            String relativeFolder = null;
            reader.h();
            while (reader.l()) {
                int u = reader.u(f2308b);
                if (u == 0) {
                    id = reader.q();
                } else if (u == 1) {
                    reader.g();
                    while (reader.l()) {
                        b.a.a.u.l.d layer = s.b(reader, composition);
                        layerMap.j(layer.b(), layer);
                        layers.add(layer);
                    }
                    reader.i();
                } else if (u == 2) {
                    width = reader.o();
                } else if (u == 3) {
                    height = reader.o();
                } else if (u == 4) {
                    imageFileName = reader.q();
                } else if (u != 5) {
                    reader.v();
                    reader.w();
                } else {
                    relativeFolder = reader.q();
                }
            }
            reader.j();
            if (imageFileName != null) {
                g image = new g(width, height, id, imageFileName, relativeFolder);
                map2.put(image.d(), image);
            } else {
                map.put(id, layers);
            }
        }
        reader.i();
    }

    public static void d(c reader, Map<String, b.a.a.u.c> map) {
        reader.h();
        while (reader.l()) {
            if (reader.u(f2309c) != 0) {
                reader.v();
                reader.w();
            } else {
                reader.g();
                while (reader.l()) {
                    b.a.a.u.c font = k.a(reader);
                    map.put(font.b(), font);
                }
                reader.i();
            }
        }
        reader.j();
    }

    public static void c(c reader, b.a.a.d composition, a.e.h<b.a.a.u.d> hVar) {
        reader.g();
        while (reader.l()) {
            b.a.a.u.d character = j.a(reader, composition);
            hVar.i(character.hashCode(), character);
        }
        reader.i();
    }

    /* JADX WARN: Incorrect args count in method signature: (Lb/a/a/w/k0/c;Lb/a/a/d;Ljava/util/List<Lb/a/a/u/h;>;)V */
    public static void f(c reader, List list) {
        reader.g();
        while (reader.l()) {
            String comment = null;
            float frame = 0.0f;
            float durationFrames = 0.0f;
            reader.h();
            while (reader.l()) {
                int u = reader.u(f2310d);
                if (u == 0) {
                    comment = reader.q();
                } else if (u == 1) {
                    frame = (float) reader.n();
                } else if (u != 2) {
                    reader.v();
                    reader.w();
                } else {
                    durationFrames = (float) reader.n();
                }
            }
            reader.j();
            list.add(new b.a.a.u.h(comment, frame, durationFrames));
        }
        reader.i();
    }
}
