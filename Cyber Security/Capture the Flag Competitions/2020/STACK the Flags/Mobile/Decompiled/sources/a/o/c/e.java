package a.o.c;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadLocal<e> f1272f = new ThreadLocal<>();

    /* renamed from: g  reason: collision with root package name */
    public static Comparator<c> f1273g = new a();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<RecyclerView> f1274b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public long f1275c;

    /* renamed from: d  reason: collision with root package name */
    public long f1276d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<c> f1277e = new ArrayList<>();

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1282a;

        /* renamed from: b  reason: collision with root package name */
        public int f1283b;

        /* renamed from: c  reason: collision with root package name */
        public int f1284c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f1285d;

        /* renamed from: e  reason: collision with root package name */
        public int f1286e;

        public void a() {
            this.f1282a = false;
            this.f1283b = 0;
            this.f1284c = 0;
            this.f1285d = null;
            this.f1286e = 0;
        }
    }

    public static class b implements RecyclerView.o.c {

        /* renamed from: a  reason: collision with root package name */
        public int f1278a;

        /* renamed from: b  reason: collision with root package name */
        public int f1279b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f1280c;

        /* renamed from: d  reason: collision with root package name */
        public int f1281d;

        public void e(int dx, int dy) {
            this.f1278a = dx;
            this.f1279b = dy;
        }

        public void c(RecyclerView view, boolean nested) {
            this.f1281d = 0;
            int[] iArr = this.f1280c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o layout = view.m;
            if (view.l != null && layout != null && layout.s0()) {
                if (nested) {
                    if (!view.f1739e.n()) {
                        layout.o(view.l.c(), this);
                    }
                } else if (!view.m0()) {
                    layout.n(this.f1278a, this.f1279b, view.g0, this);
                }
                int i = this.f1281d;
                if (i > layout.l) {
                    layout.l = i;
                    layout.m = nested;
                    view.f1737c.K();
                }
            }
        }

        public void a(int layoutPosition, int pixelDistance) {
            if (layoutPosition < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (pixelDistance >= 0) {
                int storagePosition = this.f1281d * 2;
                int[] iArr = this.f1280c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f1280c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (storagePosition >= iArr.length) {
                    int[] oldArray = this.f1280c;
                    int[] iArr3 = new int[(storagePosition * 2)];
                    this.f1280c = iArr3;
                    System.arraycopy(oldArray, 0, iArr3, 0, oldArray.length);
                }
                int[] oldArray2 = this.f1280c;
                oldArray2[storagePosition] = layoutPosition;
                oldArray2[storagePosition + 1] = pixelDistance;
                this.f1281d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public boolean d(int position) {
            if (this.f1280c == null) {
                return false;
            }
            int count = this.f1281d * 2;
            for (int i = 0; i < count; i += 2) {
                if (this.f1280c[i] == position) {
                    return true;
                }
            }
            return false;
        }

        public void b() {
            int[] iArr = this.f1280c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1281d = 0;
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f1274b.add(recyclerView);
    }

    public void j(RecyclerView recyclerView) {
        this.f1274b.remove(recyclerView);
    }

    public void f(RecyclerView recyclerView, int prefetchDx, int prefetchDy) {
        if (recyclerView.isAttachedToWindow() && this.f1275c == 0) {
            this.f1275c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f0.e(prefetchDx, prefetchDy);
    }

    public static class a implements Comparator<c> {
        /* renamed from: a */
        public int compare(c lhs, c rhs) {
            if ((lhs.f1285d == null) == (rhs.f1285d == null)) {
                boolean z = lhs.f1282a;
                if (z == rhs.f1282a) {
                    int deltaViewVelocity = rhs.f1283b - lhs.f1283b;
                    if (deltaViewVelocity != 0) {
                        return deltaViewVelocity;
                    }
                    int deltaDistanceToItem = lhs.f1284c - rhs.f1284c;
                    if (deltaDistanceToItem != 0) {
                        return deltaDistanceToItem;
                    }
                    return 0;
                } else if (z) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (lhs.f1285d == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public final void b() {
        c task;
        int viewCount = this.f1274b.size();
        int totalTaskCount = 0;
        for (int i = 0; i < viewCount; i++) {
            RecyclerView view = this.f1274b.get(i);
            if (view.getWindowVisibility() == 0) {
                view.f0.c(view, false);
                totalTaskCount += view.f0.f1281d;
            }
        }
        this.f1277e.ensureCapacity(totalTaskCount);
        int totalTaskIndex = 0;
        for (int i2 = 0; i2 < viewCount; i2++) {
            RecyclerView view2 = this.f1274b.get(i2);
            if (view2.getWindowVisibility() == 0) {
                b prefetchRegistry = view2.f0;
                int viewVelocity = Math.abs(prefetchRegistry.f1278a) + Math.abs(prefetchRegistry.f1279b);
                for (int j = 0; j < prefetchRegistry.f1281d * 2; j += 2) {
                    if (totalTaskIndex >= this.f1277e.size()) {
                        task = new c();
                        this.f1277e.add(task);
                    } else {
                        task = this.f1277e.get(totalTaskIndex);
                    }
                    int distanceToItem = prefetchRegistry.f1280c[j + 1];
                    task.f1282a = distanceToItem <= viewVelocity;
                    task.f1283b = viewVelocity;
                    task.f1284c = distanceToItem;
                    task.f1285d = view2;
                    task.f1286e = prefetchRegistry.f1280c[j];
                    totalTaskIndex++;
                }
            }
        }
        Collections.sort(this.f1277e, f1273g);
    }

    public static boolean e(RecyclerView view, int position) {
        int childCount = view.f1740f.j();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.b0 holder = RecyclerView.f0(view.f1740f.i(i));
            if (holder.f1752d == position && !holder.s()) {
                return true;
            }
        }
        return false;
    }

    public final RecyclerView.b0 i(RecyclerView view, int position, long deadlineNs) {
        Throwable th;
        if (e(view, position)) {
            return null;
        }
        RecyclerView.u recycler = view.f1737c;
        try {
            view.F0();
            RecyclerView.b0 holder = recycler.I(position, false, deadlineNs);
            if (holder != null) {
                try {
                    if (!holder.r() || holder.s()) {
                        recycler.a(holder, false);
                    } else {
                        recycler.B(holder.f1750b);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    view.H0(false);
                    throw th;
                }
            }
            view.H0(false);
            return holder;
        } catch (Throwable th3) {
            th = th3;
            view.H0(false);
            throw th;
        }
    }

    public final void h(RecyclerView innerView, long deadlineNs) {
        if (innerView != null) {
            if (innerView.C && innerView.f1740f.j() != 0) {
                innerView.T0();
            }
            b innerPrefetchRegistry = innerView.f0;
            innerPrefetchRegistry.c(innerView, true);
            if (innerPrefetchRegistry.f1281d != 0) {
                try {
                    a.h.i.a.a("RV Nested Prefetch");
                    innerView.g0.e(innerView.l);
                    for (int i = 0; i < innerPrefetchRegistry.f1281d * 2; i += 2) {
                        i(innerView, innerPrefetchRegistry.f1280c[i], deadlineNs);
                    }
                } finally {
                    a.h.i.a.b();
                }
            }
        }
    }

    public final void c(c task, long deadlineNs) {
        RecyclerView.b0 holder = i(task.f1285d, task.f1286e, task.f1282a ? Long.MAX_VALUE : deadlineNs);
        if (holder != null && holder.f1751c != null && holder.r() && !holder.s()) {
            h(holder.f1751c.get(), deadlineNs);
        }
    }

    public final void d(long deadlineNs) {
        for (int i = 0; i < this.f1277e.size(); i++) {
            c task = this.f1277e.get(i);
            if (task.f1285d != null) {
                c(task, deadlineNs);
                task.a();
            } else {
                return;
            }
        }
    }

    public void g(long deadlineNs) {
        b();
        d(deadlineNs);
    }

    public void run() {
        try {
            a.h.i.a.a("RV Prefetch");
            if (!this.f1274b.isEmpty()) {
                int size = this.f1274b.size();
                long latestFrameVsyncMs = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView view = this.f1274b.get(i);
                    if (view.getWindowVisibility() == 0) {
                        latestFrameVsyncMs = Math.max(view.getDrawingTime(), latestFrameVsyncMs);
                    }
                }
                if (latestFrameVsyncMs == 0) {
                    this.f1275c = 0;
                    a.h.i.a.b();
                    return;
                }
                g(TimeUnit.MILLISECONDS.toNanos(latestFrameVsyncMs) + this.f1276d);
                this.f1275c = 0;
                a.h.i.a.b();
            }
        } finally {
            this.f1275c = 0;
            a.h.i.a.b();
        }
    }
}
