package p000;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveData.C0097a;
import androidx.lifecycle.LiveData.LifecycleBoundObserver;
import java.io.PrintWriter;

/* renamed from: jd */
final class C0546jd extends C0544jc {

    /* renamed from: a */
    static boolean f2238a = false;

    /* renamed from: b */
    private final C0526ip f2239b;

    /* renamed from: c */
    private final C0549c f2240c;

    /* renamed from: jd$a */
    public static class C0547a<D> extends C0533iu<D> implements C0552a<D> {

        /* renamed from: g */
        final int f2241g;

        /* renamed from: h */
        final Bundle f2242h;

        /* renamed from: i */
        final C0551je<D> f2243i;

        /* renamed from: j */
        C0548b<D> f2244j;

        /* renamed from: k */
        private C0526ip f2245k;

        /* renamed from: l */
        private C0551je<D> f2246l;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo808a() {
            if (C0546jd.f2238a) {
                StringBuilder sb = new StringBuilder("  Starting: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            C0551je<D> jeVar = this.f2243i;
            jeVar.f2255c = true;
            jeVar.f2257e = false;
            jeVar.f2256d = false;
        }

        /* renamed from: a */
        public final void mo810a(C0534iv<? super D> ivVar) {
            super.mo810a(ivVar);
            this.f2245k = null;
            this.f2244j = null;
        }

        /* renamed from: a */
        public final void mo811a(D d) {
            super.mo811a(d);
            if (this.f2246l != null) {
                this.f2246l.mo2146a();
                this.f2246l = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo812b() {
            if (C0546jd.f2238a) {
                StringBuilder sb = new StringBuilder("  Stopping: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f2243i.f2255c = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo2142c() {
            C0526ip ipVar = this.f2245k;
            C0548b<D> bVar = this.f2244j;
            if (ipVar != null && bVar != null) {
                super.mo810a((C0534iv<? super T>) bVar);
                LiveData.m323a("observe");
                if (ipVar.mo1688c().mo2120a() != C0524b.DESTROYED) {
                    LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(ipVar, bVar);
                    C0097a aVar = (C0097a) this.f688c.mo1351a(bVar, lifecycleBoundObserver);
                    if (aVar != null && !aVar.mo815a(ipVar)) {
                        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
                    } else if (aVar == null) {
                        ipVar.mo1688c().mo2121a(lifecycleBoundObserver);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final C0551je<D> mo2143d() {
            if (C0546jd.f2238a) {
                StringBuilder sb = new StringBuilder("  Destroying: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f2243i.f2256d = true;
            C0548b<D> bVar = this.f2244j;
            if (bVar != null) {
                mo810a((C0534iv<? super D>) bVar);
                if (bVar.f2248b && C0546jd.f2238a) {
                    StringBuilder sb2 = new StringBuilder("  Resetting: ");
                    sb2.append(bVar.f2247a);
                    Log.v("LoaderManager", sb2.toString());
                }
            }
            C0551je<D> jeVar = this.f2243i;
            if (jeVar.f2254b == null) {
                throw new IllegalStateException("No listener register");
            } else if (jeVar.f2254b != this) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            } else {
                jeVar.f2254b = null;
                this.f2243i.mo2146a();
                return this.f2246l;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2241g);
            sb.append(" : ");
            C0374fz.m1183a(this.f2243i, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: jd$b */
    static class C0548b<D> implements C0534iv<D> {

        /* renamed from: a */
        final C0551je<D> f2247a;

        /* renamed from: b */
        boolean f2248b;

        /* renamed from: c */
        private final C0545a<D> f2249c;

        /* renamed from: a */
        public final void mo2128a(D d) {
            if (C0546jd.f2238a) {
                StringBuilder sb = new StringBuilder("  onLoadFinished in ");
                sb.append(this.f2247a);
                sb.append(": ");
                sb.append(C0551je.m1728a(d));
                Log.v("LoaderManager", sb.toString());
            }
            this.f2248b = true;
        }

        public final String toString() {
            return this.f2249c.toString();
        }
    }

    /* renamed from: jd$c */
    static class C0549c extends C0538iy {

        /* renamed from: b */
        private static final C0540a f2250b = new C0540a() {
            /* renamed from: a */
            public final <T extends C0538iy> T mo2137a() {
                return new C0549c();
            }
        };

        /* renamed from: a */
        C0257dl<C0547a> f2251a = new C0257dl<>();

        /* renamed from: c */
        private boolean f2252c = false;

        C0549c() {
        }

        /* renamed from: a */
        static C0549c m1725a(C0542ja jaVar) {
            C0539iz izVar = new C0539iz(jaVar, f2250b);
            Class<C0549c> cls = C0549c.class;
            String canonicalName = cls.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            StringBuilder sb = new StringBuilder("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            String sb2 = sb.toString();
            C0538iy iyVar = (C0538iy) izVar.f2228b.f2237a.get(sb2);
            if (!cls.isInstance(iyVar)) {
                iyVar = izVar.f2227a.mo2137a();
                C0538iy iyVar2 = (C0538iy) izVar.f2228b.f2237a.put(sb2, iyVar);
                if (iyVar2 != null) {
                    iyVar2.mo2136a();
                }
            }
            return (C0549c) iyVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo2136a() {
            super.mo2136a();
            int b = this.f2251a.mo1491b();
            for (int i = 0; i < b; i++) {
                ((C0547a) this.f2251a.mo1494c(i)).mo2143d();
            }
            C0257dl<C0547a> dlVar = this.f2251a;
            int i2 = dlVar.f1214c;
            Object[] objArr = dlVar.f1213b;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            dlVar.f1214c = 0;
            dlVar.f1212a = false;
        }
    }

    C0546jd(C0526ip ipVar, C0542ja jaVar) {
        this.f2239b = ipVar;
        this.f2240c = C0549c.m1725a(jaVar);
    }

    /* renamed from: a */
    public final void mo2139a() {
        C0549c cVar = this.f2240c;
        int b = cVar.f2251a.mo1491b();
        for (int i = 0; i < b; i++) {
            ((C0547a) cVar.f2251a.mo1494c(i)).mo2142c();
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo2140a(String str, PrintWriter printWriter) {
        C0549c cVar = this.f2240c;
        if (cVar.f2251a.mo1491b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            String sb2 = sb.toString();
            for (int i = 0; i < cVar.f2251a.mo1491b(); i++) {
                C0547a aVar = (C0547a) cVar.f2251a.mo1494c(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.f2251a.mo1492b(i));
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                printWriter.print(sb2);
                printWriter.print("mId=");
                printWriter.print(aVar.f2241g);
                printWriter.print(" mArgs=");
                printWriter.println(aVar.f2242h);
                printWriter.print(sb2);
                printWriter.print("mLoader=");
                printWriter.println(aVar.f2243i);
                C0551je<D> jeVar = aVar.f2243i;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("  ");
                String sb4 = sb3.toString();
                printWriter.print(sb4);
                printWriter.print("mId=");
                printWriter.print(jeVar.f2253a);
                printWriter.print(" mListener=");
                printWriter.println(jeVar.f2254b);
                if (jeVar.f2255c || jeVar.f2258f || jeVar.f2259g) {
                    printWriter.print(sb4);
                    printWriter.print("mStarted=");
                    printWriter.print(jeVar.f2255c);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(jeVar.f2258f);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(jeVar.f2259g);
                }
                if (jeVar.f2256d || jeVar.f2257e) {
                    printWriter.print(sb4);
                    printWriter.print("mAbandoned=");
                    printWriter.print(jeVar.f2256d);
                    printWriter.print(" mReset=");
                    printWriter.println(jeVar.f2257e);
                }
                if (aVar.f2244j != null) {
                    printWriter.print(sb2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVar.f2244j);
                    C0548b<D> bVar = aVar.f2244j;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb2);
                    sb5.append("  ");
                    printWriter.print(sb5.toString());
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.f2248b);
                }
                printWriter.print(sb2);
                printWriter.print("mData=");
                Object obj = aVar.f690e;
                if (obj == LiveData.f686b) {
                    obj = null;
                }
                printWriter.println(C0551je.m1728a(obj));
                printWriter.print(sb2);
                printWriter.print("mStarted=");
                printWriter.println(aVar.f689d > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0374fz.m1183a(this.f2239b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
