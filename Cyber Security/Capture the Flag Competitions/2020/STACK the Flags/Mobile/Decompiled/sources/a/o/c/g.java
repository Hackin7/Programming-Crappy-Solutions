package a.o.c;

import a.o.c.a;
import java.util.List;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final a f1294a;

    public interface a {
    }

    public g(a callback) {
        this.f1294a = callback;
    }

    public void b(List<a.b> list) {
        while (true) {
            int badMove = a(list);
            if (badMove != -1) {
                d(list, badMove, badMove + 1);
            } else {
                return;
            }
        }
    }

    public final void d(List<a.b> list, int badMove, int next) {
        a.b moveOp = list.get(badMove);
        a.b nextOp = list.get(next);
        int i = nextOp.f1212a;
        if (i == 1) {
            c(list, badMove, moveOp, next, nextOp);
        } else if (i == 2) {
            e(list, badMove, moveOp, next, nextOp);
        } else if (i == 4) {
            f(list, badMove, moveOp, next, nextOp);
        }
    }

    public void e(List<a.b> list, int movePos, a.b moveOp, int removePos, a.b removeOp) {
        boolean moveIsBackwards;
        a.b extraRm = null;
        boolean revertedMove = false;
        int i = moveOp.f1213b;
        int i2 = moveOp.f1215d;
        if (i < i2) {
            moveIsBackwards = false;
            if (removeOp.f1213b == i && removeOp.f1215d == i2 - i) {
                revertedMove = true;
            }
        } else {
            moveIsBackwards = true;
            if (removeOp.f1213b == i2 + 1 && removeOp.f1215d == i - i2) {
                revertedMove = true;
            }
        }
        int i3 = moveOp.f1215d;
        int i4 = removeOp.f1213b;
        if (i3 < i4) {
            removeOp.f1213b = i4 - 1;
        } else {
            int i5 = removeOp.f1215d;
            if (i3 < i4 + i5) {
                removeOp.f1215d = i5 - 1;
                moveOp.f1212a = 2;
                moveOp.f1215d = 1;
                if (removeOp.f1215d == 0) {
                    list.remove(removePos);
                    ((a) this.f1294a).s(removeOp);
                    return;
                }
                return;
            }
        }
        int i6 = moveOp.f1213b;
        int i7 = removeOp.f1213b;
        if (i6 <= i7) {
            removeOp.f1213b = i7 + 1;
        } else {
            int i8 = removeOp.f1215d;
            if (i6 < i7 + i8) {
                int remaining = (i7 + i8) - i6;
                extraRm = ((a) this.f1294a).p(2, i6 + 1, remaining, null);
                removeOp.f1215d = moveOp.f1213b - removeOp.f1213b;
            }
        }
        if (revertedMove) {
            list.set(movePos, removeOp);
            list.remove(removePos);
            ((a) this.f1294a).s(moveOp);
            return;
        }
        if (moveIsBackwards) {
            if (extraRm != null) {
                int i9 = moveOp.f1213b;
                if (i9 > extraRm.f1213b) {
                    moveOp.f1213b = i9 - extraRm.f1215d;
                }
                int i10 = moveOp.f1215d;
                if (i10 > extraRm.f1213b) {
                    moveOp.f1215d = i10 - extraRm.f1215d;
                }
            }
            int i11 = moveOp.f1213b;
            if (i11 > removeOp.f1213b) {
                moveOp.f1213b = i11 - removeOp.f1215d;
            }
            int i12 = moveOp.f1215d;
            if (i12 > removeOp.f1213b) {
                moveOp.f1215d = i12 - removeOp.f1215d;
            }
        } else {
            if (extraRm != null) {
                int i13 = moveOp.f1213b;
                if (i13 >= extraRm.f1213b) {
                    moveOp.f1213b = i13 - extraRm.f1215d;
                }
                int i14 = moveOp.f1215d;
                if (i14 >= extraRm.f1213b) {
                    moveOp.f1215d = i14 - extraRm.f1215d;
                }
            }
            int i15 = moveOp.f1213b;
            if (i15 >= removeOp.f1213b) {
                moveOp.f1213b = i15 - removeOp.f1215d;
            }
            int i16 = moveOp.f1215d;
            if (i16 >= removeOp.f1213b) {
                moveOp.f1215d = i16 - removeOp.f1215d;
            }
        }
        list.set(movePos, removeOp);
        if (moveOp.f1213b != moveOp.f1215d) {
            list.set(removePos, moveOp);
        } else {
            list.remove(removePos);
        }
        if (extraRm != null) {
            list.add(movePos, extraRm);
        }
    }

    public final void c(List<a.b> list, int move, a.b moveOp, int add, a.b addOp) {
        int offset = 0;
        if (moveOp.f1215d < addOp.f1213b) {
            offset = 0 - 1;
        }
        if (moveOp.f1213b < addOp.f1213b) {
            offset++;
        }
        int i = addOp.f1213b;
        int i2 = moveOp.f1213b;
        if (i <= i2) {
            moveOp.f1213b = i2 + addOp.f1215d;
        }
        int i3 = addOp.f1213b;
        int i4 = moveOp.f1215d;
        if (i3 <= i4) {
            moveOp.f1215d = i4 + addOp.f1215d;
        }
        addOp.f1213b += offset;
        list.set(move, addOp);
        list.set(add, moveOp);
    }

    public void f(List<a.b> list, int move, a.b moveOp, int update, a.b updateOp) {
        a.b extraUp1 = null;
        a.b extraUp2 = null;
        int i = moveOp.f1215d;
        int i2 = updateOp.f1213b;
        if (i < i2) {
            updateOp.f1213b = i2 - 1;
        } else {
            int i3 = updateOp.f1215d;
            if (i < i2 + i3) {
                updateOp.f1215d = i3 - 1;
                extraUp1 = ((a) this.f1294a).p(4, moveOp.f1213b, 1, updateOp.f1214c);
            }
        }
        int i4 = moveOp.f1213b;
        int i5 = updateOp.f1213b;
        if (i4 <= i5) {
            updateOp.f1213b = i5 + 1;
        } else {
            int i6 = updateOp.f1215d;
            if (i4 < i5 + i6) {
                int remaining = (i5 + i6) - i4;
                extraUp2 = ((a) this.f1294a).p(4, i4 + 1, remaining, updateOp.f1214c);
                updateOp.f1215d -= remaining;
            }
        }
        list.set(update, moveOp);
        if (updateOp.f1215d > 0) {
            list.set(move, updateOp);
        } else {
            list.remove(move);
            ((a) this.f1294a).s(updateOp);
        }
        if (extraUp1 != null) {
            list.add(move, extraUp1);
        }
        if (extraUp2 != null) {
            list.add(move, extraUp2);
        }
    }

    public final int a(List<a.b> list) {
        boolean foundNonMove = false;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).f1212a != 8) {
                foundNonMove = true;
            } else if (foundNonMove) {
                return i;
            }
        }
        return -1;
    }
}
