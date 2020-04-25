package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ez */
public final class C0317ez {

    /* renamed from: ez$a */
    public interface C0318a {
    }

    /* renamed from: ez$b */
    public static final class C0319b implements C0318a {

        /* renamed from: a */
        public final C0320c[] f1597a;

        public C0319b(C0320c[] cVarArr) {
            this.f1597a = cVarArr;
        }
    }

    /* renamed from: ez$c */
    public static final class C0320c {

        /* renamed from: a */
        public final String f1598a;

        /* renamed from: b */
        public int f1599b;

        /* renamed from: c */
        public boolean f1600c;

        /* renamed from: d */
        public String f1601d;

        /* renamed from: e */
        public int f1602e;

        /* renamed from: f */
        public int f1603f;

        public C0320c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f1598a = str;
            this.f1599b = i;
            this.f1600c = z;
            this.f1601d = str2;
            this.f1602e = i2;
            this.f1603f = i3;
        }
    }

    /* renamed from: ez$d */
    public static final class C0321d implements C0318a {

        /* renamed from: a */
        public final C0356fv f1604a;

        /* renamed from: b */
        public final int f1605b;

        /* renamed from: c */
        public final int f1606c;

        public C0321d(C0356fv fvVar, int i, int i2) {
            this.f1604a = fvVar;
            this.f1606c = i;
            this.f1605b = i2;
        }
    }

    /* renamed from: a */
    public static C0318a m1060a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m1064b(xmlPullParser, resources);
        }
        m1063a(xmlPullParser);
        return null;
    }

    /* renamed from: a */
    public static List<List<byte[]>> m1061a(Resources resources, int i) {
        int i2;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (VERSION.SDK_INT >= 21) {
                i2 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i2 = typedValue.type;
            }
            if (i2 == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(m1062a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m1062a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m1062a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m1063a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    /* renamed from: b */
    private static C0318a m1064b(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0305c.FontFamily);
        String string = obtainAttributes.getString(C0305c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0305c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0305c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0305c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0305c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0305c.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m1065c(xmlPullParser, resources));
                    } else {
                        m1063a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0319b((C0320c[]) arrayList.toArray(new C0320c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m1063a(xmlPullParser);
        }
        return new C0321d(new C0356fv(string, string2, string3, m1061a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: c */
    private static C0320c m1065c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0305c.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0305c.FontFamilyFont_fontWeight) ? C0305c.FontFamilyFont_fontWeight : C0305c.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0305c.FontFamilyFont_fontStyle) ? C0305c.FontFamilyFont_fontStyle : C0305c.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C0305c.FontFamilyFont_ttcIndex) ? C0305c.FontFamilyFont_ttcIndex : C0305c.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0305c.FontFamilyFont_fontVariationSettings) ? C0305c.FontFamilyFont_fontVariationSettings : C0305c.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0305c.FontFamilyFont_font) ? C0305c.FontFamilyFont_font : C0305c.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m1063a(xmlPullParser);
        }
        C0320c cVar = new C0320c(string2, i, z, string, i3, resourceId);
        return cVar;
    }
}
