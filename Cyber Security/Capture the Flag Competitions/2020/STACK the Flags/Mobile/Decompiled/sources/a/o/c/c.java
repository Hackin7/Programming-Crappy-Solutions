package a.o.c;

import a.h.m.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends k {
    public static TimeInterpolator s;
    public ArrayList<RecyclerView.b0> h = new ArrayList<>();
    public ArrayList<RecyclerView.b0> i = new ArrayList<>();
    public ArrayList<j> j = new ArrayList<>();
    public ArrayList<i> k = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.b0>> l = new ArrayList<>();
    public ArrayList<ArrayList<j>> m = new ArrayList<>();
    public ArrayList<ArrayList<i>> n = new ArrayList<>();
    public ArrayList<RecyclerView.b0> o = new ArrayList<>();
    public ArrayList<RecyclerView.b0> p = new ArrayList<>();
    public ArrayList<RecyclerView.b0> q = new ArrayList<>();
    public ArrayList<RecyclerView.b0> r = new ArrayList<>();

    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.b0 f1255a;

        /* renamed from: b  reason: collision with root package name */
        public int f1256b;

        /* renamed from: c  reason: collision with root package name */
        public int f1257c;

        /* renamed from: d  reason: collision with root package name */
        public int f1258d;

        /* renamed from: e  reason: collision with root package name */
        public int f1259e;

        public j(RecyclerView.b0 holder, int fromX, int fromY, int toX, int toY) {
            this.f1255a = holder;
            this.f1256b = fromX;
            this.f1257c = fromY;
            this.f1258d = toX;
            this.f1259e = toY;
        }
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.b0 f1249a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.b0 f1250b;

        /* renamed from: c  reason: collision with root package name */
        public int f1251c;

        /* renamed from: d  reason: collision with root package name */
        public int f1252d;

        /* renamed from: e  reason: collision with root package name */
        public int f1253e;

        /* renamed from: f  reason: collision with root package name */
        public int f1254f;

        public i(RecyclerView.b0 oldHolder, RecyclerView.b0 newHolder) {
            this.f1249a = oldHolder;
            this.f1250b = newHolder;
        }

        public i(RecyclerView.b0 oldHolder, RecyclerView.b0 newHolder, int fromX, int fromY, int toX, int toY) {
            this(oldHolder, newHolder);
            this.f1251c = fromX;
            this.f1252d = fromY;
            this.f1253e = toX;
            this.f1254f = toY;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f1249a + ", newHolder=" + this.f1250b + ", fromX=" + this.f1251c + ", fromY=" + this.f1252d + ", toX=" + this.f1253e + ", toY=" + this.f1254f + '}';
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u() {
        boolean removalsPending = !this.h.isEmpty();
        boolean movesPending = !this.j.isEmpty();
        boolean changesPending = !this.k.isEmpty();
        boolean additionsPending = !this.i.isEmpty();
        if (removalsPending || movesPending || additionsPending || changesPending) {
            Iterator<RecyclerView.b0> it = this.h.iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            this.h.clear();
            if (movesPending) {
                ArrayList<DefaultItemAnimator.MoveInfo> moves = new ArrayList<>();
                moves.addAll(this.j);
                this.m.add(moves);
                this.j.clear();
                a aVar = new a(moves);
                if (removalsPending) {
                    s.V(((j) moves.get(0)).f1255a.f1750b, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (changesPending) {
                ArrayList<DefaultItemAnimator.ChangeInfo> changes = new ArrayList<>();
                changes.addAll(this.k);
                this.n.add(changes);
                this.k.clear();
                b bVar = new b(changes);
                if (removalsPending) {
                    s.V(((i) changes.get(0)).f1249a.f1750b, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (additionsPending) {
                ArrayList<RecyclerView.ViewHolder> additions = new ArrayList<>();
                additions.addAll(this.i);
                this.l.add(additions);
                this.i.clear();
                RunnableC0035c cVar = new RunnableC0035c(additions);
                if (removalsPending || movesPending || changesPending) {
                    long changeDuration = 0;
                    long removeDuration = removalsPending ? o() : 0;
                    long moveDuration = movesPending ? n() : 0;
                    if (changesPending) {
                        changeDuration = m();
                    }
                    s.V(((RecyclerView.b0) additions.get(0)).f1750b, cVar, Math.max(moveDuration, changeDuration) + removeDuration);
                    return;
                }
                cVar.run();
            }
        }
    }

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1221b;

        public a(ArrayList arrayList) {
            this.f1221b = arrayList;
        }

        public void run() {
            Iterator it = this.f1221b.iterator();
            while (it.hasNext()) {
                j moveInfo = (j) it.next();
                c.this.S(moveInfo.f1255a, moveInfo.f1256b, moveInfo.f1257c, moveInfo.f1258d, moveInfo.f1259e);
            }
            this.f1221b.clear();
            c.this.m.remove(this.f1221b);
        }
    }

    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1223b;

        public b(ArrayList arrayList) {
            this.f1223b = arrayList;
        }

        public void run() {
            Iterator it = this.f1223b.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f1223b.clear();
            c.this.n.remove(this.f1223b);
        }
    }

    /* renamed from: a.o.c.c$c  reason: collision with other inner class name */
    public class RunnableC0035c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1225b;

        public RunnableC0035c(ArrayList arrayList) {
            this.f1225b = arrayList;
        }

        public void run() {
            Iterator it = this.f1225b.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.b0) it.next());
            }
            this.f1225b.clear();
            c.this.l.remove(this.f1225b);
        }
    }

    @Override // a.o.c.k
    public boolean z(RecyclerView.b0 holder) {
        Z(holder);
        this.h.add(holder);
        return true;
    }

    public final void T(RecyclerView.b0 holder) {
        View view = holder.f1750b;
        ViewPropertyAnimator animation = view.animate();
        this.q.add(holder);
        animation.setDuration(o()).alpha(0.0f).setListener(new d(holder, animation, view)).start();
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.b0 f1227a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f1228b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f1229c;

        public d(RecyclerView.b0 b0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f1227a = b0Var;
            this.f1228b = viewPropertyAnimator;
            this.f1229c = view;
        }

        public void onAnimationStart(Animator animator) {
            c.this.H(this.f1227a);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1228b.setListener(null);
            this.f1229c.setAlpha(1.0f);
            c.this.G(this.f1227a);
            c.this.q.remove(this.f1227a);
            c.this.V();
        }
    }

    @Override // a.o.c.k
    public boolean w(RecyclerView.b0 holder) {
        Z(holder);
        holder.f1750b.setAlpha(0.0f);
        this.i.add(holder);
        return true;
    }

    public void Q(RecyclerView.b0 holder) {
        View view = holder.f1750b;
        ViewPropertyAnimator animation = view.animate();
        this.o.add(holder);
        animation.alpha(1.0f).setDuration(l()).setListener(new e(holder, view, animation)).start();
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.b0 f1231a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1232b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f1233c;

        public e(RecyclerView.b0 b0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f1231a = b0Var;
            this.f1232b = view;
            this.f1233c = viewPropertyAnimator;
        }

        public void onAnimationStart(Animator animator) {
            c.this.B(this.f1231a);
        }

        public void onAnimationCancel(Animator animator) {
            this.f1232b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1233c.setListener(null);
            c.this.A(this.f1231a);
            c.this.o.remove(this.f1231a);
            c.this.V();
        }
    }

    @Override // a.o.c.k
    public boolean y(RecyclerView.b0 holder, int fromX, int fromY, int toX, int toY) {
        View view = holder.f1750b;
        int fromX2 = fromX + ((int) holder.f1750b.getTranslationX());
        int fromY2 = fromY + ((int) holder.f1750b.getTranslationY());
        Z(holder);
        int deltaX = toX - fromX2;
        int deltaY = toY - fromY2;
        if (deltaX == 0 && deltaY == 0) {
            E(holder);
            return false;
        }
        if (deltaX != 0) {
            view.setTranslationX((float) (-deltaX));
        }
        if (deltaY != 0) {
            view.setTranslationY((float) (-deltaY));
        }
        this.j.add(new j(holder, fromX2, fromY2, toX, toY));
        return true;
    }

    public void S(RecyclerView.b0 holder, int fromX, int fromY, int toX, int toY) {
        View view = holder.f1750b;
        int deltaX = toX - fromX;
        int deltaY = toY - fromY;
        if (deltaX != 0) {
            view.animate().translationX(0.0f);
        }
        if (deltaY != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animation = view.animate();
        this.p.add(holder);
        animation.setDuration(n()).setListener(new f(holder, deltaX, view, deltaY, animation)).start();
    }

    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.b0 f1235a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1236b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f1237c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f1238d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f1239e;

        public f(RecyclerView.b0 b0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f1235a = b0Var;
            this.f1236b = i;
            this.f1237c = view;
            this.f1238d = i2;
            this.f1239e = viewPropertyAnimator;
        }

        public void onAnimationStart(Animator animator) {
            c.this.F(this.f1235a);
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f1236b != 0) {
                this.f1237c.setTranslationX(0.0f);
            }
            if (this.f1238d != 0) {
                this.f1237c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f1239e.setListener(null);
            c.this.E(this.f1235a);
            c.this.p.remove(this.f1235a);
            c.this.V();
        }
    }

    @Override // a.o.c.k
    public boolean x(RecyclerView.b0 oldHolder, RecyclerView.b0 newHolder, int fromX, int fromY, int toX, int toY) {
        if (oldHolder == newHolder) {
            return y(oldHolder, fromX, fromY, toX, toY);
        }
        float prevTranslationX = oldHolder.f1750b.getTranslationX();
        float prevTranslationY = oldHolder.f1750b.getTranslationY();
        float prevAlpha = oldHolder.f1750b.getAlpha();
        Z(oldHolder);
        int deltaX = (int) (((float) (toX - fromX)) - prevTranslationX);
        int deltaY = (int) (((float) (toY - fromY)) - prevTranslationY);
        oldHolder.f1750b.setTranslationX(prevTranslationX);
        oldHolder.f1750b.setTranslationY(prevTranslationY);
        oldHolder.f1750b.setAlpha(prevAlpha);
        if (newHolder != null) {
            Z(newHolder);
            newHolder.f1750b.setTranslationX((float) (-deltaX));
            newHolder.f1750b.setTranslationY((float) (-deltaY));
            newHolder.f1750b.setAlpha(0.0f);
        }
        this.k.add(new i(oldHolder, newHolder, fromX, fromY, toX, toY));
        return true;
    }

    public void R(i changeInfo) {
        RecyclerView.b0 holder = changeInfo.f1249a;
        View newView = null;
        View view = holder == null ? null : holder.f1750b;
        RecyclerView.b0 newHolder = changeInfo.f1250b;
        if (newHolder != null) {
            newView = newHolder.f1750b;
        }
        if (view != null) {
            ViewPropertyAnimator oldViewAnim = view.animate().setDuration(m());
            this.r.add(changeInfo.f1249a);
            oldViewAnim.translationX((float) (changeInfo.f1253e - changeInfo.f1251c));
            oldViewAnim.translationY((float) (changeInfo.f1254f - changeInfo.f1252d));
            oldViewAnim.alpha(0.0f).setListener(new g(changeInfo, oldViewAnim, view)).start();
        }
        if (newView != null) {
            ViewPropertyAnimator newViewAnimation = newView.animate();
            this.r.add(changeInfo.f1250b);
            newViewAnimation.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(changeInfo, newViewAnimation, newView)).start();
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f1241a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f1242b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f1243c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f1241a = iVar;
            this.f1242b = viewPropertyAnimator;
            this.f1243c = view;
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.f1241a.f1249a, true);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1242b.setListener(null);
            this.f1243c.setAlpha(1.0f);
            this.f1243c.setTranslationX(0.0f);
            this.f1243c.setTranslationY(0.0f);
            c.this.C(this.f1241a.f1249a, true);
            c.this.r.remove(this.f1241a.f1249a);
            c.this.V();
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f1245a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f1246b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f1247c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f1245a = iVar;
            this.f1246b = viewPropertyAnimator;
            this.f1247c = view;
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.f1245a.f1250b, false);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1246b.setListener(null);
            this.f1247c.setAlpha(1.0f);
            this.f1247c.setTranslationX(0.0f);
            this.f1247c.setTranslationY(0.0f);
            c.this.C(this.f1245a.f1250b, false);
            c.this.r.remove(this.f1245a.f1250b);
            c.this.V();
        }
    }

    public final void W(List<i> list, RecyclerView.b0 item) {
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            i changeInfo = list.get(i2);
            if (Y(changeInfo, item) && changeInfo.f1249a == null && changeInfo.f1250b == null) {
                list.remove(changeInfo);
            }
        }
    }

    public final void X(i changeInfo) {
        RecyclerView.b0 b0Var = changeInfo.f1249a;
        if (b0Var != null) {
            Y(changeInfo, b0Var);
        }
        RecyclerView.b0 b0Var2 = changeInfo.f1250b;
        if (b0Var2 != null) {
            Y(changeInfo, b0Var2);
        }
    }

    public final boolean Y(i changeInfo, RecyclerView.b0 item) {
        boolean oldItem = false;
        if (changeInfo.f1250b == item) {
            changeInfo.f1250b = null;
        } else if (changeInfo.f1249a != item) {
            return false;
        } else {
            changeInfo.f1249a = null;
            oldItem = true;
        }
        item.f1750b.setAlpha(1.0f);
        item.f1750b.setTranslationX(0.0f);
        item.f1750b.setTranslationY(0.0f);
        C(item, oldItem);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.b0 item) {
        View view = item.f1750b;
        view.animate().cancel();
        int i2 = this.j.size();
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            } else if (this.j.get(i2).f1255a == item) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(item);
                this.j.remove(i2);
            }
        }
        W(this.k, item);
        if (this.h.remove(item)) {
            view.setAlpha(1.0f);
            G(item);
        }
        if (this.i.remove(item)) {
            view.setAlpha(1.0f);
            A(item);
        }
        for (int i3 = this.n.size() - 1; i3 >= 0; i3--) {
            ArrayList<DefaultItemAnimator.ChangeInfo> changes = this.n.get(i3);
            W(changes, item);
            if (changes.isEmpty()) {
                this.n.remove(i3);
            }
        }
        for (int i4 = this.m.size() - 1; i4 >= 0; i4--) {
            ArrayList<DefaultItemAnimator.MoveInfo> moves = this.m.get(i4);
            int j2 = moves.size() - 1;
            while (true) {
                if (j2 < 0) {
                    break;
                } else if (((j) moves.get(j2)).f1255a == item) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(item);
                    moves.remove(j2);
                    if (moves.isEmpty()) {
                        this.m.remove(i4);
                    }
                } else {
                    j2--;
                }
            }
        }
        for (int i5 = this.l.size() - 1; i5 >= 0; i5--) {
            ArrayList<RecyclerView.ViewHolder> additions = this.l.get(i5);
            if (additions.remove(item)) {
                view.setAlpha(1.0f);
                A(item);
                if (additions.isEmpty()) {
                    this.l.remove(i5);
                }
            }
        }
        this.q.remove(item);
        this.o.remove(item);
        this.r.remove(item);
        this.p.remove(item);
        V();
    }

    public final void Z(RecyclerView.b0 holder) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        holder.f1750b.animate().setInterpolator(s);
        j(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    public void V() {
        if (!p()) {
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        for (int i2 = this.j.size() - 1; i2 >= 0; i2--) {
            j item = this.j.get(i2);
            View view = item.f1255a.f1750b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(item.f1255a);
            this.j.remove(i2);
        }
        for (int i3 = this.h.size() - 1; i3 >= 0; i3--) {
            G(this.h.get(i3));
            this.h.remove(i3);
        }
        for (int i4 = this.i.size() - 1; i4 >= 0; i4--) {
            RecyclerView.b0 item2 = this.i.get(i4);
            item2.f1750b.setAlpha(1.0f);
            A(item2);
            this.i.remove(i4);
        }
        for (int i5 = this.k.size() - 1; i5 >= 0; i5--) {
            X(this.k.get(i5));
        }
        this.k.clear();
        if (p()) {
            for (int i6 = this.m.size() - 1; i6 >= 0; i6--) {
                ArrayList<DefaultItemAnimator.MoveInfo> moves = this.m.get(i6);
                for (int j2 = moves.size() - 1; j2 >= 0; j2--) {
                    j moveInfo = (j) moves.get(j2);
                    View view2 = moveInfo.f1255a.f1750b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(moveInfo.f1255a);
                    moves.remove(j2);
                    if (moves.isEmpty()) {
                        this.m.remove(moves);
                    }
                }
            }
            for (int i7 = this.l.size() - 1; i7 >= 0; i7--) {
                ArrayList<RecyclerView.ViewHolder> additions = this.l.get(i7);
                for (int j3 = additions.size() - 1; j3 >= 0; j3--) {
                    RecyclerView.b0 item3 = (RecyclerView.b0) additions.get(j3);
                    item3.f1750b.setAlpha(1.0f);
                    A(item3);
                    additions.remove(j3);
                    if (additions.isEmpty()) {
                        this.l.remove(additions);
                    }
                }
            }
            for (int i8 = this.n.size() - 1; i8 >= 0; i8--) {
                ArrayList<DefaultItemAnimator.ChangeInfo> changes = this.n.get(i8);
                for (int j4 = changes.size() - 1; j4 >= 0; j4--) {
                    X((i) changes.get(j4));
                    if (changes.isEmpty()) {
                        this.n.remove(changes);
                    }
                }
            }
            U(this.q);
            U(this.p);
            U(this.o);
            U(this.r);
            i();
        }
    }

    public void U(List<RecyclerView.b0> list) {
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            list.get(i2).f1750b.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.b0 viewHolder, List<Object> payloads) {
        return !payloads.isEmpty() || super.g(viewHolder, payloads);
    }
}
