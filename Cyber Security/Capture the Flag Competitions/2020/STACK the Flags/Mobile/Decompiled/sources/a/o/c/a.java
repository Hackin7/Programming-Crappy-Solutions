package a.o.c;

import a.h.l.e;
import a.h.l.f;
import a.o.c.g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class a implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public e<b> f1205a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f1206b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f1207c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC0033a f1208d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1209e;

    /* renamed from: f  reason: collision with root package name */
    public final g f1210f;

    /* renamed from: g  reason: collision with root package name */
    public int f1211g;

    /* renamed from: a.o.c.a$a  reason: collision with other inner class name */
    public interface AbstractC0033a {
    }

    public a(AbstractC0033a callback) {
        this(callback, false);
    }

    public a(AbstractC0033a callback, boolean disableRecycler) {
        this.f1205a = new f(30);
        this.f1206b = new ArrayList<>();
        this.f1207c = new ArrayList<>();
        this.f1211g = 0;
        this.f1208d = callback;
        this.f1209e = disableRecycler;
        this.f1210f = new g(this);
    }

    public void u() {
        t(this.f1206b);
        t(this.f1207c);
        this.f1211g = 0;
    }

    public void r() {
        this.f1210f.b(this.f1206b);
        int count = this.f1206b.size();
        for (int i = 0; i < count; i++) {
            b op = this.f1206b.get(i);
            int i2 = op.f1212a;
            if (i2 == 1) {
                a(op);
            } else if (i2 == 2) {
                d(op);
            } else if (i2 == 4) {
                e(op);
            } else if (i2 == 8) {
                b(op);
            }
        }
        this.f1206b.clear();
    }

    public void g() {
        int count = this.f1207c.size();
        for (int i = 0; i < count; i++) {
            ((RecyclerView.f) this.f1208d).i(this.f1207c.get(i));
        }
        t(this.f1207c);
        this.f1211g = 0;
    }

    public final void b(b op) {
        q(op);
    }

    public final void d(b op) {
        int tmpStart = op.f1213b;
        int tmpCount = 0;
        int tmpEnd = op.f1213b + op.f1215d;
        int type = -1;
        int position = op.f1213b;
        while (position < tmpEnd) {
            boolean typeChanged = false;
            if (((RecyclerView.f) this.f1208d).b(position) != null || f(position)) {
                if (type == 0) {
                    i(p(2, tmpStart, tmpCount, null));
                    typeChanged = true;
                }
                type = 1;
            } else {
                if (type == 1) {
                    q(p(2, tmpStart, tmpCount, null));
                    typeChanged = true;
                }
                type = 0;
            }
            if (typeChanged) {
                position -= tmpCount;
                tmpEnd -= tmpCount;
                tmpCount = 1;
            } else {
                tmpCount++;
            }
            position++;
        }
        if (tmpCount != op.f1215d) {
            s(op);
            op = p(2, tmpStart, tmpCount, null);
        }
        if (type == 0) {
            i(op);
        } else {
            q(op);
        }
    }

    public final void e(b op) {
        int tmpStart = op.f1213b;
        int tmpCount = 0;
        int tmpEnd = op.f1213b + op.f1215d;
        int type = -1;
        for (int position = op.f1213b; position < tmpEnd; position++) {
            if (((RecyclerView.f) this.f1208d).b(position) != null || f(position)) {
                if (type == 0) {
                    i(p(4, tmpStart, tmpCount, op.f1214c));
                    tmpCount = 0;
                    tmpStart = position;
                }
                type = 1;
            } else {
                if (type == 1) {
                    q(p(4, tmpStart, tmpCount, op.f1214c));
                    tmpCount = 0;
                    tmpStart = position;
                }
                type = 0;
            }
            tmpCount++;
        }
        if (tmpCount != op.f1215d) {
            Object payload = op.f1214c;
            s(op);
            op = p(4, tmpStart, tmpCount, payload);
        }
        if (type == 0) {
            i(op);
        } else {
            q(op);
        }
    }

    public final void i(b op) {
        int positionMultiplier;
        int i = op.f1212a;
        if (i == 1 || i == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int tmpStart = v(op.f1213b, i);
        int tmpCnt = 1;
        int offsetPositionForPartial = op.f1213b;
        int i2 = op.f1212a;
        if (i2 == 2) {
            positionMultiplier = 0;
        } else if (i2 == 4) {
            positionMultiplier = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + op);
        }
        for (int p = 1; p < op.f1215d; p++) {
            int updatedPos = v(op.f1213b + (positionMultiplier * p), op.f1212a);
            boolean continuous = false;
            int i3 = op.f1212a;
            boolean z = false;
            if (i3 == 2) {
                if (updatedPos == tmpStart) {
                    z = true;
                }
                continuous = z;
            } else if (i3 == 4) {
                if (updatedPos == tmpStart + 1) {
                    z = true;
                }
                continuous = z;
            }
            if (continuous) {
                tmpCnt++;
            } else {
                b tmp = p(op.f1212a, tmpStart, tmpCnt, op.f1214c);
                j(tmp, offsetPositionForPartial);
                s(tmp);
                if (op.f1212a == 4) {
                    offsetPositionForPartial += tmpCnt;
                }
                tmpStart = updatedPos;
                tmpCnt = 1;
            }
        }
        Object payload = op.f1214c;
        s(op);
        if (tmpCnt > 0) {
            b tmp2 = p(op.f1212a, tmpStart, tmpCnt, payload);
            j(tmp2, offsetPositionForPartial);
            s(tmp2);
        }
    }

    public void j(b op, int offsetStart) {
        ((RecyclerView.f) this.f1208d).h(op);
        int i = op.f1212a;
        if (i == 2) {
            ((RecyclerView.f) this.f1208d).f(offsetStart, op.f1215d);
        } else if (i == 4) {
            ((RecyclerView.f) this.f1208d).c(offsetStart, op.f1215d, op.f1214c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final int v(int pos, int cmd) {
        int end;
        int start;
        for (int i = this.f1207c.size() - 1; i >= 0; i--) {
            b postponed = this.f1207c.get(i);
            int i2 = postponed.f1212a;
            if (i2 == 8) {
                if (postponed.f1213b < postponed.f1215d) {
                    start = postponed.f1213b;
                    end = postponed.f1215d;
                } else {
                    start = postponed.f1215d;
                    end = postponed.f1213b;
                }
                if (pos < start || pos > end) {
                    int i3 = postponed.f1213b;
                    if (pos < i3) {
                        if (cmd == 1) {
                            postponed.f1213b = i3 + 1;
                            postponed.f1215d++;
                        } else if (cmd == 2) {
                            postponed.f1213b = i3 - 1;
                            postponed.f1215d--;
                        }
                    }
                } else {
                    int i4 = postponed.f1213b;
                    if (start == i4) {
                        if (cmd == 1) {
                            postponed.f1215d++;
                        } else if (cmd == 2) {
                            postponed.f1215d--;
                        }
                        pos++;
                    } else {
                        if (cmd == 1) {
                            postponed.f1213b = i4 + 1;
                        } else if (cmd == 2) {
                            postponed.f1213b = i4 - 1;
                        }
                        pos--;
                    }
                }
            } else {
                int i5 = postponed.f1213b;
                if (i5 <= pos) {
                    if (i2 == 1) {
                        pos -= postponed.f1215d;
                    } else if (i2 == 2) {
                        pos += postponed.f1215d;
                    }
                } else if (cmd == 1) {
                    postponed.f1213b = i5 + 1;
                } else if (cmd == 2) {
                    postponed.f1213b = i5 - 1;
                }
            }
        }
        for (int i6 = this.f1207c.size() - 1; i6 >= 0; i6--) {
            b op = this.f1207c.get(i6);
            if (op.f1212a == 8) {
                int i7 = op.f1215d;
                if (i7 == op.f1213b || i7 < 0) {
                    this.f1207c.remove(i6);
                    s(op);
                }
            } else if (op.f1215d <= 0) {
                this.f1207c.remove(i6);
                s(op);
            }
        }
        return pos;
    }

    public final boolean f(int position) {
        int count = this.f1207c.size();
        for (int i = 0; i < count; i++) {
            b op = this.f1207c.get(i);
            int i2 = op.f1212a;
            if (i2 == 8) {
                if (l(op.f1215d, i + 1) == position) {
                    return true;
                }
            } else if (i2 == 1) {
                int end = op.f1213b + op.f1215d;
                for (int pos = op.f1213b; pos < end; pos++) {
                    if (l(pos, i + 1) == position) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void a(b op) {
        q(op);
    }

    public final void q(b op) {
        this.f1207c.add(op);
        int i = op.f1212a;
        if (i == 1) {
            ((RecyclerView.f) this.f1208d).d(op.f1213b, op.f1215d);
        } else if (i == 2) {
            ((RecyclerView.f) this.f1208d).g(op.f1213b, op.f1215d);
        } else if (i == 4) {
            ((RecyclerView.f) this.f1208d).c(op.f1213b, op.f1215d, op.f1214c);
        } else if (i == 8) {
            ((RecyclerView.f) this.f1208d).e(op.f1213b, op.f1215d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + op);
        }
    }

    public boolean n() {
        return this.f1206b.size() > 0;
    }

    public boolean m(int updateTypes) {
        return (this.f1211g & updateTypes) != 0;
    }

    public int k(int position) {
        return l(position, 0);
    }

    public int l(int position, int firstPostponedItem) {
        int count = this.f1207c.size();
        for (int i = firstPostponedItem; i < count; i++) {
            b op = this.f1207c.get(i);
            int i2 = op.f1212a;
            if (i2 == 8) {
                int i3 = op.f1213b;
                if (i3 == position) {
                    position = op.f1215d;
                } else {
                    if (i3 < position) {
                        position--;
                    }
                    if (op.f1215d <= position) {
                        position++;
                    }
                }
            } else {
                int i4 = op.f1213b;
                if (i4 > position) {
                    continue;
                } else if (i2 == 2) {
                    int i5 = op.f1215d;
                    if (position < i4 + i5) {
                        return -1;
                    }
                    position -= i5;
                } else if (i2 == 1) {
                    position += op.f1215d;
                }
            }
        }
        return position;
    }

    public void h() {
        g();
        int count = this.f1206b.size();
        for (int i = 0; i < count; i++) {
            b op = this.f1206b.get(i);
            int i2 = op.f1212a;
            if (i2 == 1) {
                ((RecyclerView.f) this.f1208d).i(op);
                ((RecyclerView.f) this.f1208d).d(op.f1213b, op.f1215d);
            } else if (i2 == 2) {
                ((RecyclerView.f) this.f1208d).i(op);
                ((RecyclerView.f) this.f1208d).f(op.f1213b, op.f1215d);
            } else if (i2 == 4) {
                ((RecyclerView.f) this.f1208d).i(op);
                ((RecyclerView.f) this.f1208d).c(op.f1213b, op.f1215d, op.f1214c);
            } else if (i2 == 8) {
                ((RecyclerView.f) this.f1208d).i(op);
                ((RecyclerView.f) this.f1208d).e(op.f1213b, op.f1215d);
            }
        }
        t(this.f1206b);
        this.f1211g = 0;
    }

    public int c(int position) {
        int size = this.f1206b.size();
        for (int i = 0; i < size; i++) {
            b op = this.f1206b.get(i);
            int i2 = op.f1212a;
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = op.f1213b;
                    if (i3 <= position) {
                        int i4 = op.f1215d;
                        if (i3 + i4 > position) {
                            return -1;
                        }
                        position -= i4;
                    } else {
                        continue;
                    }
                } else if (i2 == 8) {
                    int i5 = op.f1213b;
                    if (i5 == position) {
                        position = op.f1215d;
                    } else {
                        if (i5 < position) {
                            position--;
                        }
                        if (op.f1215d <= position) {
                            position++;
                        }
                    }
                }
            } else if (op.f1213b <= position) {
                position += op.f1215d;
            }
        }
        return position;
    }

    public boolean o() {
        return !this.f1207c.isEmpty() && !this.f1206b.isEmpty();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1212a;

        /* renamed from: b  reason: collision with root package name */
        public int f1213b;

        /* renamed from: c  reason: collision with root package name */
        public Object f1214c;

        /* renamed from: d  reason: collision with root package name */
        public int f1215d;

        public b(int cmd, int positionStart, int itemCount, Object payload) {
            this.f1212a = cmd;
            this.f1213b = positionStart;
            this.f1215d = itemCount;
            this.f1214c = payload;
        }

        public String a() {
            int i = this.f1212a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i == 4) {
                return "up";
            }
            if (i != 8) {
                return "??";
            }
            return "mv";
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f1213b + "c:" + this.f1215d + ",p:" + this.f1214c + "]";
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            b op = (b) o;
            int i = this.f1212a;
            if (i != op.f1212a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f1215d - this.f1213b) == 1 && this.f1215d == op.f1213b && this.f1213b == op.f1215d) {
                return true;
            }
            if (this.f1215d != op.f1215d || this.f1213b != op.f1213b) {
                return false;
            }
            Object obj = this.f1214c;
            if (obj != null) {
                if (!obj.equals(op.f1214c)) {
                    return false;
                }
            } else if (op.f1214c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f1212a * 31) + this.f1213b) * 31) + this.f1215d;
        }
    }

    public b p(int cmd, int positionStart, int itemCount, Object payload) {
        b op = this.f1205a.b();
        if (op == null) {
            return new b(cmd, positionStart, itemCount, payload);
        }
        op.f1212a = cmd;
        op.f1213b = positionStart;
        op.f1215d = itemCount;
        op.f1214c = payload;
        return op;
    }

    public void s(b op) {
        if (!this.f1209e) {
            op.f1214c = null;
            this.f1205a.a(op);
        }
    }

    public void t(List<b> list) {
        int count = list.size();
        for (int i = 0; i < count; i++) {
            s(list.get(i));
        }
        list.clear();
    }
}
