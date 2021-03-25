package b.a.a.s.b;

import android.annotation.TargetApi;
import android.graphics.Path;
import b.a.a.u.k.h;
import com.airbnb.lottie.animation.content.PathContent;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
public class l implements m, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f1994a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f1995b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f1996c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final String f1997d;

    /* renamed from: e  reason: collision with root package name */
    public final List<m> f1998e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final h f1999f;

    public l(h mergePaths) {
        this.f1997d = mergePaths.c();
        this.f1999f = mergePaths;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    @Override // b.a.a.s.b.j
    public void d(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
            while (listIterator.hasPrevious()) {
                while (listIterator.hasPrevious()) {
                }
            }
        }
        while (listIterator.hasPrevious()) {
            c content = listIterator.previous();
            if (content instanceof m) {
                this.f1998e.add((m) content);
                listIterator.remove();
            }
        }
    }

    @Override // b.a.a.s.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i = 0; i < this.f1998e.size(); i++) {
            this.f1998e.get(i).c(list, list2);
        }
    }

    @Override // b.a.a.s.b.m
    public Path h() {
        this.f1996c.reset();
        if (this.f1999f.d()) {
            return this.f1996c;
        }
        int ordinal = this.f1999f.b().ordinal();
        if (ordinal == 0) {
            b();
        } else if (ordinal == 1) {
            e(Path.Op.UNION);
        } else if (ordinal == 2) {
            e(Path.Op.REVERSE_DIFFERENCE);
        } else if (ordinal == 3) {
            e(Path.Op.INTERSECT);
        } else if (ordinal == 4) {
            e(Path.Op.XOR);
        }
        return this.f1996c;
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.f1997d;
    }

    public final void b() {
        for (int i = 0; i < this.f1998e.size(); i++) {
            this.f1996c.addPath(this.f1998e.get(i).h());
        }
    }

    @TargetApi(19)
    public final void e(Path.Op op) {
        this.f1995b.reset();
        this.f1994a.reset();
        for (int i = this.f1998e.size() - 1; i >= 1; i--) {
            m content = this.f1998e.get(i);
            if (content instanceof d) {
                List<PathContent> pathList = ((d) content).k();
                for (int j = pathList.size() - 1; j >= 0; j--) {
                    Path path = ((m) pathList.get(j)).h();
                    path.transform(((d) content).l());
                    this.f1995b.addPath(path);
                }
            } else {
                this.f1995b.addPath(content.h());
            }
        }
        m lastContent = this.f1998e.get(0);
        if (lastContent instanceof d) {
            List<PathContent> pathList2 = ((d) lastContent).k();
            for (int j2 = 0; j2 < pathList2.size(); j2++) {
                Path path2 = ((m) pathList2.get(j2)).h();
                path2.transform(((d) lastContent).l());
                this.f1994a.addPath(path2);
            }
        } else {
            this.f1994a.set(lastContent.h());
        }
        this.f1996c.op(this.f1994a, this.f1995b, op);
    }
}
