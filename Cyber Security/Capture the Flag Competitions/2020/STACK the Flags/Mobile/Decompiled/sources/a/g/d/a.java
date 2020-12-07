package a.g.d;

import a.e.g;
import a.h.l.e;
import a.h.l.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final e<ArrayList<T>> f758a = new f(10);

    /* renamed from: b  reason: collision with root package name */
    public final g<T, ArrayList<T>> f759b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<T> f760c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<T> f761d = new HashSet<>();

    public void b(T node) {
        if (!this.f759b.containsKey(node)) {
            this.f759b.put(node, null);
        }
    }

    public boolean d(T node) {
        return this.f759b.containsKey(node);
    }

    public void a(T node, T incomingEdge) {
        if (!this.f759b.containsKey(node) || !this.f759b.containsKey(incomingEdge)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> edges = this.f759b.get(node);
        if (edges == null) {
            edges = f();
            this.f759b.put(node, edges);
        }
        edges.add(incomingEdge);
    }

    public List g(T node) {
        return this.f759b.get(node);
    }

    public List<T> h(T node) {
        ArrayList<T> result = null;
        int size = this.f759b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f759b.m(i);
            if (edges != null && edges.contains(node)) {
                if (result == null) {
                    result = new ArrayList<>();
                }
                result.add(this.f759b.i(i));
            }
        }
        return result;
    }

    public boolean j(T node) {
        int size = this.f759b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f759b.m(i);
            if (edges != null && edges.contains(node)) {
                return true;
            }
        }
        return false;
    }

    public void c() {
        int size = this.f759b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f759b.m(i);
            if (edges != null) {
                k(edges);
            }
        }
        this.f759b.clear();
    }

    public ArrayList<T> i() {
        this.f760c.clear();
        this.f761d.clear();
        int size = this.f759b.size();
        for (int i = 0; i < size; i++) {
            e(this.f759b.i(i), this.f760c, this.f761d);
        }
        return this.f760c;
    }

    public final void e(T node, ArrayList<T> result, HashSet<T> tmpMarked) {
        if (!result.contains(node)) {
            if (!tmpMarked.contains(node)) {
                tmpMarked.add(node);
                ArrayList<T> edges = this.f759b.get(node);
                if (edges != null) {
                    int size = edges.size();
                    for (int i = 0; i < size; i++) {
                        e(edges.get(i), result, tmpMarked);
                    }
                }
                tmpMarked.remove(node);
                result.add(node);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public final ArrayList<T> f() {
        ArrayList<T> list = this.f758a.b();
        if (list == null) {
            return new ArrayList<>();
        }
        return list;
    }

    public final void k(ArrayList<T> list) {
        list.clear();
        this.f758a.a(list);
    }
}
