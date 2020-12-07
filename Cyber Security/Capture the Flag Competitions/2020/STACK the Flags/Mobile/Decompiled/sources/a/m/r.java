package a.m;

import java.util.HashMap;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, p> f1199a = new HashMap<>();

    public final void c(String key, p viewModel) {
        p oldViewModel = this.f1199a.put(key, viewModel);
        if (oldViewModel != null) {
            oldViewModel.c();
        }
    }

    public final p b(String key) {
        return this.f1199a.get(key);
    }

    public final void a() {
        for (p vm : this.f1199a.values()) {
            vm.a();
        }
        this.f1199a.clear();
    }
}
