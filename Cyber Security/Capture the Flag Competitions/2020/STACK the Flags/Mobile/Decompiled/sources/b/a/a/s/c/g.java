package b.a.a.s.c;

import android.graphics.Path;
import b.a.a.u.k.l;
import java.util.ArrayList;
import java.util.List;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<l, Path>> f2048a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a<Integer, Integer>> f2049b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b.a.a.u.k.g> f2050c;

    public g(List<b.a.a.u.k.g> list) {
        this.f2050c = list;
        this.f2048a = new ArrayList(list.size());
        this.f2049b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f2048a.add(list.get(i).b().a());
            this.f2049b.add(list.get(i).c().a());
        }
    }

    public List<b.a.a.u.k.g> b() {
        return this.f2050c;
    }

    public List<a<l, Path>> a() {
        return this.f2048a;
    }

    public List<a<Integer, Integer>> c() {
        return this.f2049b;
    }
}
