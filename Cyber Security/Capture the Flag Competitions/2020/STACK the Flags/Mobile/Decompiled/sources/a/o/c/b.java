package a.o.c;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0034b f1216a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1217b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f1218c = new ArrayList();

    /* renamed from: a.o.c.b$b  reason: collision with other inner class name */
    public interface AbstractC0034b {
    }

    public b(AbstractC0034b callback) {
        this.f1216a = callback;
    }

    public final void l(View child) {
        this.f1218c.add(child);
        ((RecyclerView.e) this.f1216a).h(child);
    }

    public final boolean t(View child) {
        if (!this.f1218c.remove(child)) {
            return false;
        }
        ((RecyclerView.e) this.f1216a).i(child);
        return true;
    }

    public void b(View child, boolean hidden) {
        a(child, -1, hidden);
    }

    public void a(View child, int index, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = ((RecyclerView.e) this.f1216a).e();
        } else {
            offset = h(index);
        }
        this.f1217b.e(offset, hidden);
        if (hidden) {
            l(child);
        }
        ((RecyclerView.e) this.f1216a).a(child, offset);
    }

    public final int h(int index) {
        if (index < 0) {
            return -1;
        }
        int limit = ((RecyclerView.e) this.f1216a).e();
        int offset = index;
        while (offset < limit) {
            int diff = index - (offset - this.f1217b.b(offset));
            if (diff == 0) {
                while (this.f1217b.d(offset)) {
                    offset++;
                }
                return offset;
            }
            offset += diff;
        }
        return -1;
    }

    public void p(View view) {
        int index = ((RecyclerView.e) this.f1216a).g(view);
        if (index >= 0) {
            if (this.f1217b.f(index)) {
                t(view);
            }
            ((RecyclerView.e) this.f1216a).k(index);
        }
    }

    public void q(int index) {
        int offset = h(index);
        View view = ((RecyclerView.e) this.f1216a).d(offset);
        if (view != null) {
            if (this.f1217b.f(offset)) {
                t(view);
            }
            ((RecyclerView.e) this.f1216a).k(offset);
        }
    }

    public View f(int index) {
        return ((RecyclerView.e) this.f1216a).d(h(index));
    }

    public void o() {
        this.f1217b.g();
        for (int i = this.f1218c.size() - 1; i >= 0; i--) {
            ((RecyclerView.e) this.f1216a).i(this.f1218c.get(i));
            this.f1218c.remove(i);
        }
        ((RecyclerView.e) this.f1216a).j();
    }

    public View e(int position) {
        int count = this.f1218c.size();
        for (int i = 0; i < count; i++) {
            View view = this.f1218c.get(i);
            RecyclerView.b0 holder = ((RecyclerView.e) this.f1216a).f(view);
            if (!(holder.m() != position || holder.s() || holder.u())) {
                return view;
            }
        }
        return null;
    }

    public void c(View child, int index, ViewGroup.LayoutParams layoutParams, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = ((RecyclerView.e) this.f1216a).e();
        } else {
            offset = h(index);
        }
        this.f1217b.e(offset, hidden);
        if (hidden) {
            l(child);
        }
        ((RecyclerView.e) this.f1216a).b(child, offset, layoutParams);
    }

    public int g() {
        return ((RecyclerView.e) this.f1216a).e() - this.f1218c.size();
    }

    public int j() {
        return ((RecyclerView.e) this.f1216a).e();
    }

    public View i(int index) {
        return ((RecyclerView.e) this.f1216a).d(index);
    }

    public void d(int index) {
        int offset = h(index);
        this.f1217b.f(offset);
        ((RecyclerView.e) this.f1216a).c(offset);
    }

    public int m(View child) {
        int index = ((RecyclerView.e) this.f1216a).g(child);
        if (index != -1 && !this.f1217b.d(index)) {
            return index - this.f1217b.b(index);
        }
        return -1;
    }

    public boolean n(View view) {
        return this.f1218c.contains(view);
    }

    public void k(View view) {
        int offset = ((RecyclerView.e) this.f1216a).g(view);
        if (offset >= 0) {
            this.f1217b.h(offset);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public void s(View view) {
        int offset = ((RecyclerView.e) this.f1216a).g(view);
        if (offset < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f1217b.d(offset)) {
            this.f1217b.a(offset);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f1217b.toString() + ", hidden list:" + this.f1218c.size();
    }

    public boolean r(View view) {
        int index = ((RecyclerView.e) this.f1216a).g(view);
        if (index == -1) {
            t(view);
            return true;
        } else if (!this.f1217b.d(index)) {
            return false;
        } else {
            this.f1217b.f(index);
            t(view);
            ((RecyclerView.e) this.f1216a).k(index);
            return true;
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f1219a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f1220b;

        public void h(int index) {
            if (index >= 64) {
                c();
                this.f1220b.h(index - 64);
                return;
            }
            this.f1219a |= 1 << index;
        }

        public final void c() {
            if (this.f1220b == null) {
                this.f1220b = new a();
            }
        }

        public void a(int index) {
            if (index >= 64) {
                a aVar = this.f1220b;
                if (aVar != null) {
                    aVar.a(index - 64);
                    return;
                }
                return;
            }
            this.f1219a &= ~(1 << index);
        }

        public boolean d(int index) {
            if (index < 64) {
                return (this.f1219a & (1 << index)) != 0;
            }
            c();
            return this.f1220b.d(index - 64);
        }

        public void g() {
            this.f1219a = 0;
            a aVar = this.f1220b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void e(int index, boolean value) {
            if (index >= 64) {
                c();
                this.f1220b.e(index - 64, value);
                return;
            }
            boolean lastBit = (this.f1219a & Long.MIN_VALUE) != 0;
            long mask = (1 << index) - 1;
            long j = this.f1219a;
            this.f1219a = (j & mask) | ((j & (~mask)) << 1);
            if (value) {
                h(index);
            } else {
                a(index);
            }
            if (lastBit || this.f1220b != null) {
                c();
                this.f1220b.e(0, lastBit);
            }
        }

        public boolean f(int index) {
            if (index >= 64) {
                c();
                return this.f1220b.f(index - 64);
            }
            long mask = 1 << index;
            boolean value = (this.f1219a & mask) != 0;
            long j = this.f1219a & (~mask);
            this.f1219a = j;
            long mask2 = mask - 1;
            this.f1219a = (j & mask2) | Long.rotateRight(j & (~mask2), 1);
            a aVar = this.f1220b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f1220b.f(0);
            }
            return value;
        }

        public int b(int index) {
            a aVar = this.f1220b;
            if (aVar == null) {
                if (index >= 64) {
                    return Long.bitCount(this.f1219a);
                }
                return Long.bitCount(this.f1219a & ((1 << index) - 1));
            } else if (index < 64) {
                return Long.bitCount(this.f1219a & ((1 << index) - 1));
            } else {
                return aVar.b(index - 64) + Long.bitCount(this.f1219a);
            }
        }

        public String toString() {
            if (this.f1220b == null) {
                return Long.toBinaryString(this.f1219a);
            }
            return this.f1220b.toString() + "xx" + Long.toBinaryString(this.f1219a);
        }
    }
}
