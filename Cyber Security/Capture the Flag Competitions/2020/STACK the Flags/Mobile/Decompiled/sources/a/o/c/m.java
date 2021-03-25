package a.o.c;

import a.e.d;
import a.h.l.e;
import a.h.l.f;
import androidx.recyclerview.widget.RecyclerView;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public final a.e.a<RecyclerView.b0, a> f1309a = new a.e.a<>();

    /* renamed from: b  reason: collision with root package name */
    public final d<RecyclerView.b0> f1310b = new d<>();

    public interface b {
    }

    public void f() {
        this.f1309a.clear();
        this.f1310b.b();
    }

    public void e(RecyclerView.b0 holder, RecyclerView.l.c info) {
        a record = this.f1309a.get(holder);
        if (record == null) {
            record = a.b();
            this.f1309a.put(holder, record);
        }
        record.f1313b = info;
        record.f1312a |= 4;
    }

    public boolean h(RecyclerView.b0 holder) {
        a record = this.f1309a.get(holder);
        return (record == null || (record.f1312a & 1) == 0) ? false : true;
    }

    public RecyclerView.l.c n(RecyclerView.b0 vh) {
        return l(vh, 4);
    }

    public RecyclerView.l.c m(RecyclerView.b0 vh) {
        return l(vh, 8);
    }

    public final RecyclerView.l.c l(RecyclerView.b0 vh, int flag) {
        a record;
        RecyclerView.l.c info;
        int index = this.f1309a.f(vh);
        if (index >= 0 && (record = this.f1309a.m(index)) != null) {
            int i = record.f1312a;
            if ((i & flag) != 0) {
                record.f1312a = (~flag) & i;
                if (flag == 4) {
                    info = record.f1313b;
                } else if (flag == 8) {
                    info = record.f1314c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((record.f1312a & 12) == 0) {
                    this.f1309a.k(index);
                    a.c(record);
                }
                return info;
            }
        }
        return null;
    }

    public void c(long key, RecyclerView.b0 holder) {
        this.f1310b.j(key, holder);
    }

    public void a(RecyclerView.b0 holder, RecyclerView.l.c info) {
        a record = this.f1309a.get(holder);
        if (record == null) {
            record = a.b();
            this.f1309a.put(holder, record);
        }
        record.f1312a |= 2;
        record.f1313b = info;
    }

    public boolean i(RecyclerView.b0 viewHolder) {
        a record = this.f1309a.get(viewHolder);
        return (record == null || (record.f1312a & 4) == 0) ? false : true;
    }

    public RecyclerView.b0 g(long key) {
        return this.f1310b.f(key);
    }

    public void d(RecyclerView.b0 holder, RecyclerView.l.c info) {
        a record = this.f1309a.get(holder);
        if (record == null) {
            record = a.b();
            this.f1309a.put(holder, record);
        }
        record.f1314c = info;
        record.f1312a |= 8;
    }

    public void b(RecyclerView.b0 holder) {
        a record = this.f1309a.get(holder);
        if (record == null) {
            record = a.b();
            this.f1309a.put(holder, record);
        }
        record.f1312a |= 1;
    }

    public void p(RecyclerView.b0 holder) {
        a record = this.f1309a.get(holder);
        if (record != null) {
            record.f1312a &= -2;
        }
    }

    public void o(b callback) {
        for (int index = this.f1309a.size() - 1; index >= 0; index--) {
            RecyclerView.b0 viewHolder = this.f1309a.i(index);
            a record = this.f1309a.k(index);
            int i = record.f1312a;
            if ((i & 3) == 3) {
                ((RecyclerView.d) callback).d(viewHolder);
            } else if ((i & 1) != 0) {
                RecyclerView.l.c cVar = record.f1313b;
                if (cVar == null) {
                    ((RecyclerView.d) callback).d(viewHolder);
                } else {
                    ((RecyclerView.d) callback).b(viewHolder, cVar, record.f1314c);
                }
            } else if ((i & 14) == 14) {
                ((RecyclerView.d) callback).a(viewHolder, record.f1313b, record.f1314c);
            } else if ((i & 12) == 12) {
                ((RecyclerView.d) callback).c(viewHolder, record.f1313b, record.f1314c);
            } else if ((i & 4) != 0) {
                ((RecyclerView.d) callback).b(viewHolder, record.f1313b, null);
            } else if ((i & 8) != 0) {
                ((RecyclerView.d) callback).a(viewHolder, record.f1313b, record.f1314c);
            }
            a.c(record);
        }
    }

    public void q(RecyclerView.b0 holder) {
        int i = this.f1310b.m() - 1;
        while (true) {
            if (i < 0) {
                break;
            } else if (holder == this.f1310b.n(i)) {
                this.f1310b.l(i);
                break;
            } else {
                i--;
            }
        }
        a info = this.f1309a.remove(holder);
        if (info != null) {
            a.c(info);
        }
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.b0 viewHolder) {
        p(viewHolder);
    }

    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static e<a> f1311d = new f(20);

        /* renamed from: a  reason: collision with root package name */
        public int f1312a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.l.c f1313b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.l.c f1314c;

        public static a b() {
            a record = f1311d.b();
            return record == null ? new a() : record;
        }

        public static void c(a record) {
            record.f1312a = 0;
            record.f1313b = null;
            record.f1314c = null;
            f1311d.a(record);
        }

        public static void a() {
            do {
            } while (f1311d.b() != null);
        }
    }
}
