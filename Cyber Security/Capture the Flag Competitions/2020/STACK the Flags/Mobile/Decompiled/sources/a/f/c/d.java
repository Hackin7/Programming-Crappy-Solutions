package a.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<a> f705a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<e> f706b = new SparseArray<>();

    public d(Context context, ConstraintLayout layout, int resourceID) {
        a(context, resourceID);
    }

    public void c(g constraintsChangedListener) {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f707a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f708b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f709c = -1;

        /* renamed from: d  reason: collision with root package name */
        public e f710d;

        public a(Context context, XmlPullParser parser) {
            TypedArray a2 = context.obtainStyledAttributes(Xml.asAttributeSet(parser), k.State);
            int N = a2.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a2.getIndex(i);
                if (attr == k.State_android_id) {
                    this.f707a = a2.getResourceId(attr, this.f707a);
                } else if (attr == k.State_constraints) {
                    this.f709c = a2.getResourceId(attr, this.f709c);
                    String type = context.getResources().getResourceTypeName(this.f709c);
                    context.getResources().getResourceName(this.f709c);
                    if ("layout".equals(type)) {
                        e eVar = new e();
                        this.f710d = eVar;
                        eVar.d(context, this.f709c);
                    }
                }
            }
            a2.recycle();
        }

        public void a(b size) {
            this.f708b.add(size);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f711a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f712b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public float f713c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        public float f714d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public int f715e = -1;

        /* renamed from: f  reason: collision with root package name */
        public e f716f;

        public b(Context context, XmlPullParser parser) {
            TypedArray a2 = context.obtainStyledAttributes(Xml.asAttributeSet(parser), k.Variant);
            int N = a2.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a2.getIndex(i);
                if (attr == k.Variant_constraints) {
                    this.f715e = a2.getResourceId(attr, this.f715e);
                    String type = context.getResources().getResourceTypeName(this.f715e);
                    context.getResources().getResourceName(this.f715e);
                    if ("layout".equals(type)) {
                        e eVar = new e();
                        this.f716f = eVar;
                        eVar.d(context, this.f715e);
                    }
                } else if (attr == k.Variant_region_heightLessThan) {
                    this.f714d = a2.getDimension(attr, this.f714d);
                } else if (attr == k.Variant_region_heightMoreThan) {
                    this.f712b = a2.getDimension(attr, this.f712b);
                } else if (attr == k.Variant_region_widthLessThan) {
                    this.f713c = a2.getDimension(attr, this.f713c);
                } else if (attr == k.Variant_region_widthMoreThan) {
                    this.f711a = a2.getDimension(attr, this.f711a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            a2.recycle();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(Context context, int resourceId) {
        XmlPullParser parser = context.getResources().getXml(resourceId);
        a state = null;
        try {
            for (int eventType = parser.getEventType(); eventType != 1; eventType = parser.next()) {
                if (eventType == 0) {
                    parser.getName();
                } else if (eventType == 2) {
                    String tagName = parser.getName();
                    char c2 = 65535;
                    switch (tagName.hashCode()) {
                        case -1349929691:
                            if (tagName.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (tagName.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (tagName.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (tagName.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (tagName.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 == 2) {
                                state = new a(context, parser);
                                this.f705a.put(state.f707a, state);
                            } else if (c2 == 3) {
                                b match = new b(context, parser);
                                if (state != null) {
                                    state.a(match);
                                }
                            } else if (c2 != 4) {
                                Log.v("ConstraintLayoutStates", "unknown tag " + tagName);
                            } else {
                                b(context, parser);
                            }
                        }
                    }
                } else if (eventType != 3) {
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public final void b(Context context, XmlPullParser parser) {
        e set = new e();
        int count = parser.getAttributeCount();
        for (int i = 0; i < count; i++) {
            if ("id".equals(parser.getAttributeName(i))) {
                String s = parser.getAttributeValue(i);
                int id = -1;
                if (s.contains("/")) {
                    id = context.getResources().getIdentifier(s.substring(s.indexOf(47) + 1), "id", context.getPackageName());
                }
                if (id == -1) {
                    if (s.length() > 1) {
                        id = Integer.parseInt(s.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                set.j(context, parser);
                this.f706b.put(id, set);
                return;
            }
        }
    }
}
