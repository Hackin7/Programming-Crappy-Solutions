package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: bb */
public class C0135bb extends DataSetObservable {

    /* renamed from: a */
    static final String f789a = "bb";

    /* renamed from: g */
    private static final Object f790g = new Object();

    /* renamed from: h */
    private static final Map<String, C0135bb> f791h = new HashMap();

    /* renamed from: b */
    public final Object f792b;

    /* renamed from: c */
    public final List<C0136a> f793c;

    /* renamed from: d */
    final Context f794d;

    /* renamed from: e */
    final String f795e;

    /* renamed from: f */
    boolean f796f;

    /* renamed from: i */
    private final List<C0138c> f797i;

    /* renamed from: j */
    private Intent f798j;

    /* renamed from: k */
    private C0137b f799k;

    /* renamed from: l */
    private int f800l;

    /* renamed from: m */
    private boolean f801m;

    /* renamed from: n */
    private boolean f802n;

    /* renamed from: o */
    private boolean f803o;

    /* renamed from: p */
    private C0139d f804p;

    /* renamed from: bb$a */
    public static final class C0136a implements Comparable<C0136a> {

        /* renamed from: a */
        public final ResolveInfo f805a;

        /* renamed from: b */
        public float f806b;

        public C0136a(ResolveInfo resolveInfo) {
            this.f805a = resolveInfo;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return Float.floatToIntBits(((C0136a) obj).f806b) - Float.floatToIntBits(this.f806b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(this.f806b) == Float.floatToIntBits(((C0136a) obj).f806b);
        }

        public final int hashCode() {
            return 31 + Float.floatToIntBits(this.f806b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:");
            sb.append(this.f805a.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f806b));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: bb$b */
    public interface C0137b {
    }

    /* renamed from: bb$c */
    public static final class C0138c {

        /* renamed from: a */
        public final ComponentName f807a;

        /* renamed from: b */
        public final long f808b;

        /* renamed from: c */
        public final float f809c;

        public C0138c(ComponentName componentName, long j, float f) {
            this.f807a = componentName;
            this.f808b = j;
            this.f809c = f;
        }

        public C0138c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0138c cVar = (C0138c) obj;
            if (this.f807a == null) {
                if (cVar.f807a != null) {
                    return false;
                }
            } else if (!this.f807a.equals(cVar.f807a)) {
                return false;
            }
            return this.f808b == cVar.f808b && Float.floatToIntBits(this.f809c) == Float.floatToIntBits(cVar.f809c);
        }

        public final int hashCode() {
            return (31 * ((((this.f807a == null ? 0 : this.f807a.hashCode()) + 31) * 31) + ((int) (this.f808b ^ (this.f808b >>> 32))))) + Float.floatToIntBits(this.f809c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:");
            sb.append(this.f807a);
            sb.append("; time:");
            sb.append(this.f808b);
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f809c));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: bb$d */
    public interface C0139d {
        /* renamed from: a */
        boolean mo909a();
    }

    /* renamed from: bb$e */
    final class C0140e extends AsyncTask<Object, Void, Void> {
        C0140e() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006f, code lost:
            if (r4 != null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0093, code lost:
            if (r4 == null) goto L_0x00d4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b2, code lost:
            if (r4 == null) goto L_0x00d4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d1, code lost:
            if (r4 == null) goto L_0x00d4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d4, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r12) {
            /*
                r11 = this;
                r0 = 0
                r1 = r12[r0]
                java.util.List r1 = (java.util.List) r1
                r2 = 1
                r12 = r12[r2]
                java.lang.String r12 = (java.lang.String) r12
                r3 = 0
                bb r4 = p000.C0135bb.this     // Catch:{ FileNotFoundException -> 0x00df }
                android.content.Context r4 = r4.f794d     // Catch:{ FileNotFoundException -> 0x00df }
                java.io.FileOutputStream r4 = r4.openFileOutput(r12, r0)     // Catch:{ FileNotFoundException -> 0x00df }
                org.xmlpull.v1.XmlSerializer r12 = android.util.Xml.newSerializer()
                r12.setOutput(r4, r3)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                java.lang.String r5 = "UTF-8"
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                r12.startDocument(r5, r6)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                java.lang.String r5 = "historical-records"
                r12.startTag(r3, r5)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                int r5 = r1.size()     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                r6 = r0
            L_0x002d:
                if (r6 >= r5) goto L_0x0063
                java.lang.Object r7 = r1.remove(r0)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                bb$c r7 = (p000.C0135bb.C0138c) r7     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                java.lang.String r8 = "historical-record"
                r12.startTag(r3, r8)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                java.lang.String r8 = "activity"
                android.content.ComponentName r9 = r7.f807a     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                java.lang.String r9 = r9.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                r12.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                java.lang.String r8 = "time"
                long r9 = r7.f808b     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                r12.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                java.lang.String r8 = "weight"
                float r7 = r7.f809c     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                r12.attribute(r3, r8, r7)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                java.lang.String r7 = "historical-record"
                r12.endTag(r3, r7)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                int r6 = r6 + 1
                goto L_0x002d
            L_0x0063:
                java.lang.String r0 = "historical-records"
                r12.endTag(r3, r0)     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                r12.endDocument()     // Catch:{ IllegalArgumentException -> 0x00b5, IllegalStateException -> 0x0096, IOException -> 0x0077 }
                bb r12 = p000.C0135bb.this
                r12.f796f = r2
                if (r4 == 0) goto L_0x00d4
            L_0x0071:
                r4.close()     // Catch:{ IOException -> 0x00d4 }
                return r3
            L_0x0075:
                r12 = move-exception
                goto L_0x00d5
            L_0x0077:
                r12 = move-exception
                java.lang.String r0 = p000.C0135bb.f789a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r1.<init>(r5)     // Catch:{ all -> 0x0075 }
                bb r5 = p000.C0135bb.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f795e     // Catch:{ all -> 0x0075 }
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x0075 }
                bb r12 = p000.C0135bb.this
                r12.f796f = r2
                if (r4 == 0) goto L_0x00d4
                goto L_0x0071
            L_0x0096:
                r12 = move-exception
                java.lang.String r0 = p000.C0135bb.f789a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r1.<init>(r5)     // Catch:{ all -> 0x0075 }
                bb r5 = p000.C0135bb.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f795e     // Catch:{ all -> 0x0075 }
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x0075 }
                bb r12 = p000.C0135bb.this
                r12.f796f = r2
                if (r4 == 0) goto L_0x00d4
                goto L_0x0071
            L_0x00b5:
                r12 = move-exception
                java.lang.String r0 = p000.C0135bb.f789a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r1.<init>(r5)     // Catch:{ all -> 0x0075 }
                bb r5 = p000.C0135bb.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f795e     // Catch:{ all -> 0x0075 }
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x0075 }
                bb r12 = p000.C0135bb.this
                r12.f796f = r2
                if (r4 == 0) goto L_0x00d4
                goto L_0x0071
            L_0x00d4:
                return r3
            L_0x00d5:
                bb r0 = p000.C0135bb.this
                r0.f796f = r2
                if (r4 == 0) goto L_0x00de
                r4.close()     // Catch:{ IOException -> 0x00de }
            L_0x00de:
                throw r12
            L_0x00df:
                r0 = move-exception
                java.lang.String r1 = p000.C0135bb.f789a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "Error writing historical record file: "
                r2.<init>(r4)
                r2.append(r12)
                java.lang.String r12 = r2.toString()
                android.util.Log.e(r1, r12, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0135bb.C0140e.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    /* renamed from: d */
    private boolean m454d() {
        if (this.f799k == null || this.f798j == null || this.f793c.isEmpty() || this.f797i.isEmpty()) {
            return false;
        }
        Collections.unmodifiableList(this.f797i);
        return true;
    }

    /* renamed from: e */
    private void m455e() {
        int size = this.f797i.size() - this.f800l;
        if (size > 0) {
            this.f802n = true;
            for (int i = 0; i < size; i++) {
                this.f797i.remove(0);
            }
        }
    }

    /* renamed from: f */
    private void m456f() {
        try {
            FileInputStream openFileInput = this.f794d.openFileInput(this.f795e);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if (!"historical-records".equals(newPullParser.getName())) {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
                List<C0138c> list = this.f797i;
                list.clear();
                while (true) {
                    int next = newPullParser.next();
                    if (next != 1) {
                        if (!(next == 3 || next == 4)) {
                            if (!"historical-record".equals(newPullParser.getName())) {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                            list.add(new C0138c(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                        }
                    } else if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused) {
                        }
                        return;
                    }
                }
            } catch (XmlPullParserException e) {
                String str = f789a;
                StringBuilder sb = new StringBuilder("Error reading historical recrod file: ");
                sb.append(this.f795e);
                Log.e(str, sb.toString(), e);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (IOException e2) {
                String str2 = f789a;
                StringBuilder sb2 = new StringBuilder("Error reading historical recrod file: ");
                sb2.append(this.f795e);
                Log.e(str2, sb2.toString(), e2);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
            } finally {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        } catch (FileNotFoundException unused5) {
        }
    }

    /* renamed from: a */
    public final int mo895a() {
        int size;
        synchronized (this.f792b) {
            mo901c();
            size = this.f793c.size();
        }
        return size;
    }

    /* renamed from: a */
    public final int mo896a(ResolveInfo resolveInfo) {
        synchronized (this.f792b) {
            mo901c();
            List<C0136a> list = this.f793c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C0136a) list.get(i)).f805a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final ResolveInfo mo897a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f792b) {
            mo901c();
            resolveInfo = ((C0136a) this.f793c.get(i)).f805a;
        }
        return resolveInfo;
    }

    /* renamed from: a */
    public final boolean mo898a(C0138c cVar) {
        boolean add = this.f797i.add(cVar);
        if (add) {
            this.f802n = true;
            m455e();
            if (!this.f801m) {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
            if (this.f802n) {
                this.f802n = false;
                if (!TextUtils.isEmpty(this.f795e)) {
                    new C0140e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f797i), this.f795e});
                }
            }
            m454d();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: b */
    public final Intent mo899b(int i) {
        synchronized (this.f792b) {
            if (this.f798j == null) {
                return null;
            }
            mo901c();
            C0136a aVar = (C0136a) this.f793c.get(i);
            ComponentName componentName = new ComponentName(aVar.f805a.activityInfo.packageName, aVar.f805a.activityInfo.name);
            Intent intent = new Intent(this.f798j);
            intent.setComponent(componentName);
            if (this.f804p != null) {
                new Intent(intent);
                if (this.f804p.mo909a()) {
                    return null;
                }
            }
            mo898a(new C0138c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: b */
    public final ResolveInfo mo900b() {
        synchronized (this.f792b) {
            mo901c();
            if (this.f793c.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C0136a) this.f793c.get(0)).f805a;
            return resolveInfo;
        }
    }

    /* renamed from: c */
    public final void mo901c() {
        boolean z;
        boolean z2 = true;
        if (!this.f803o || this.f798j == null) {
            z = false;
        } else {
            this.f803o = false;
            this.f793c.clear();
            List queryIntentActivities = this.f794d.getPackageManager().queryIntentActivities(this.f798j, 0);
            int size = queryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                this.f793c.add(new C0136a((ResolveInfo) queryIntentActivities.get(i)));
            }
            z = true;
        }
        if (!this.f796f || !this.f802n || TextUtils.isEmpty(this.f795e)) {
            z2 = false;
        } else {
            this.f796f = false;
            this.f801m = true;
            m456f();
        }
        boolean z3 = z | z2;
        m455e();
        if (z3) {
            m454d();
            notifyChanged();
        }
    }
}
