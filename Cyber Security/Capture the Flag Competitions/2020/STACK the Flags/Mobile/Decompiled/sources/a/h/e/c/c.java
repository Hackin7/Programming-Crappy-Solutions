package a.h.e.c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.content.res.FontResourcesParserCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c {

    public interface a {
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final a.h.j.a f799a;

        /* renamed from: b  reason: collision with root package name */
        public final int f800b;

        /* renamed from: c  reason: collision with root package name */
        public final int f801c;

        public d(a.h.j.a request, int strategy, int timeoutMs) {
            this.f799a = request;
            this.f801c = strategy;
            this.f800b = timeoutMs;
        }

        public a.h.j.a b() {
            return this.f799a;
        }

        public int a() {
            return this.f801c;
        }

        public int c() {
            return this.f800b;
        }
    }

    /* renamed from: a.h.e.c.c$c  reason: collision with other inner class name */
    public static final class C0016c {

        /* renamed from: a  reason: collision with root package name */
        public final String f793a;

        /* renamed from: b  reason: collision with root package name */
        public int f794b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f795c;

        /* renamed from: d  reason: collision with root package name */
        public String f796d;

        /* renamed from: e  reason: collision with root package name */
        public int f797e;

        /* renamed from: f  reason: collision with root package name */
        public int f798f;

        public C0016c(String fileName, int weight, boolean italic, String variationSettings, int ttcIndex, int resourceId) {
            this.f793a = fileName;
            this.f794b = weight;
            this.f795c = italic;
            this.f796d = variationSettings;
            this.f797e = ttcIndex;
            this.f798f = resourceId;
        }

        public String a() {
            return this.f793a;
        }

        public int e() {
            return this.f794b;
        }

        public boolean f() {
            return this.f795c;
        }

        public String d() {
            return this.f796d;
        }

        public int c() {
            return this.f797e;
        }

        public int b() {
            return this.f798f;
        }
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final C0016c[] f792a;

        public b(C0016c[] entries) {
            this.f792a = entries;
        }

        public C0016c[] a() {
            return this.f792a;
        }
    }

    public static a b(XmlPullParser parser, Resources resources) {
        int type;
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type == 2) {
            return d(parser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static a d(XmlPullParser parser, Resources resources) {
        parser.require(2, null, "font-family");
        if (parser.getName().equals("font-family")) {
            return e(parser, resources);
        }
        g(parser);
        return null;
    }

    public static a e(XmlPullParser parser, Resources resources) {
        TypedArray array = resources.obtainAttributes(Xml.asAttributeSet(parser), a.h.c.FontFamily);
        String authority = array.getString(a.h.c.FontFamily_fontProviderAuthority);
        String providerPackage = array.getString(a.h.c.FontFamily_fontProviderPackage);
        String query = array.getString(a.h.c.FontFamily_fontProviderQuery);
        int certsId = array.getResourceId(a.h.c.FontFamily_fontProviderCerts, 0);
        int strategy = array.getInteger(a.h.c.FontFamily_fontProviderFetchStrategy, 1);
        int timeoutMs = array.getInteger(a.h.c.FontFamily_fontProviderFetchTimeout, 500);
        array.recycle();
        if (authority == null || providerPackage == null || query == null) {
            List<FontResourcesParserCompat.FontFileResourceEntry> fonts = new ArrayList<>();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    if (parser.getName().equals("font")) {
                        fonts.add(f(parser, resources));
                    } else {
                        g(parser);
                    }
                }
            }
            if (fonts.isEmpty()) {
                return null;
            }
            return new b((C0016c[]) fonts.toArray(new C0016c[fonts.size()]));
        }
        while (parser.next() != 3) {
            g(parser);
        }
        return new d(new a.h.j.a(authority, providerPackage, query, c(resources, certsId)), strategy, timeoutMs);
    }

    public static int a(TypedArray typedArray, int index) {
        return typedArray.getType(index);
    }

    public static List<List<byte[]>> c(Resources resources, int certsId) {
        if (certsId == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArray = resources.obtainTypedArray(certsId);
        try {
            if (typedArray.length() == 0) {
                return Collections.emptyList();
            }
            List<List<byte[]>> result = new ArrayList<>();
            if (a(typedArray, 0) == 1) {
                for (int i = 0; i < typedArray.length(); i++) {
                    int certId = typedArray.getResourceId(i, 0);
                    if (certId != 0) {
                        result.add(h(resources.getStringArray(certId)));
                    }
                }
            } else {
                result.add(h(resources.getStringArray(certsId)));
            }
            typedArray.recycle();
            return result;
        } finally {
            typedArray.recycle();
        }
    }

    public static List<byte[]> h(String[] stringArray) {
        List<byte[]> result = new ArrayList<>();
        for (String item : stringArray) {
            result.add(Base64.decode(item, 0));
        }
        return result;
    }

    public static C0016c f(XmlPullParser parser, Resources resources) {
        int weightAttr;
        int styleAttr;
        int ttcIndexAttr;
        int variationSettingsAttr;
        int resourceAttr;
        TypedArray array = resources.obtainAttributes(Xml.asAttributeSet(parser), a.h.c.FontFamilyFont);
        if (array.hasValue(a.h.c.FontFamilyFont_fontWeight)) {
            weightAttr = a.h.c.FontFamilyFont_fontWeight;
        } else {
            weightAttr = a.h.c.FontFamilyFont_android_fontWeight;
        }
        int weight = array.getInt(weightAttr, 400);
        if (array.hasValue(a.h.c.FontFamilyFont_fontStyle)) {
            styleAttr = a.h.c.FontFamilyFont_fontStyle;
        } else {
            styleAttr = a.h.c.FontFamilyFont_android_fontStyle;
        }
        boolean isItalic = 1 == array.getInt(styleAttr, 0);
        if (array.hasValue(a.h.c.FontFamilyFont_ttcIndex)) {
            ttcIndexAttr = a.h.c.FontFamilyFont_ttcIndex;
        } else {
            ttcIndexAttr = a.h.c.FontFamilyFont_android_ttcIndex;
        }
        if (array.hasValue(a.h.c.FontFamilyFont_fontVariationSettings)) {
            variationSettingsAttr = a.h.c.FontFamilyFont_fontVariationSettings;
        } else {
            variationSettingsAttr = a.h.c.FontFamilyFont_android_fontVariationSettings;
        }
        String variationSettings = array.getString(variationSettingsAttr);
        int ttcIndex = array.getInt(ttcIndexAttr, 0);
        if (array.hasValue(a.h.c.FontFamilyFont_font)) {
            resourceAttr = a.h.c.FontFamilyFont_font;
        } else {
            resourceAttr = a.h.c.FontFamilyFont_android_font;
        }
        int resourceId = array.getResourceId(resourceAttr, 0);
        String filename = array.getString(resourceAttr);
        array.recycle();
        while (parser.next() != 3) {
            g(parser);
        }
        return new C0016c(filename, weight, isItalic, variationSettings, ttcIndex, resourceId);
    }

    public static void g(XmlPullParser parser) {
        int depth = 1;
        while (depth > 0) {
            int next = parser.next();
            if (next == 2) {
                depth++;
            } else if (next == 3) {
                depth--;
            }
        }
    }
}
