package a.f.c;

import a.f.b.i.e;
import a.f.b.i.h;
import a.f.b.i.i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

public abstract class c extends View {

    /* renamed from: b  reason: collision with root package name */
    public int[] f699b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    public int f700c;

    /* renamed from: d  reason: collision with root package name */
    public Context f701d;

    /* renamed from: e  reason: collision with root package name */
    public h f702e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f703f = false;

    /* renamed from: g  reason: collision with root package name */
    public String f704g;
    public HashMap<Integer, String> h = new HashMap<>();

    public c(Context context) {
        super(context);
        this.f701d = context;
        g(null);
    }

    public void g(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a2 = getContext().obtainStyledAttributes(attrs, k.ConstraintLayout_Layout);
            int N = a2.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a2.getIndex(i);
                if (attr == k.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = a2.getString(attr);
                    this.f704g = string;
                    setIds(string);
                }
            }
            a2.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f704g;
        if (str != null) {
            setIds(str);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f699b, this.f700c);
    }

    public void setReferencedIds(int[] ids) {
        this.f704g = null;
        this.f700c = 0;
        for (int i : ids) {
            b(i);
        }
    }

    public final void b(int id) {
        if (id != getId()) {
            int i = this.f700c + 1;
            int[] iArr = this.f699b;
            if (i > iArr.length) {
                this.f699b = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f699b;
            int i2 = this.f700c;
            iArr2[i2] = id;
            this.f700c = i2 + 1;
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f703f) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void m() {
        if (this.f702e != null) {
            ViewGroup.LayoutParams params = getLayoutParams();
            if (params instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) params).m0 = (e) this.f702e;
            }
        }
    }

    public final void a(String idString) {
        if (idString != null && idString.length() != 0 && this.f701d != null) {
            String idString2 = idString.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout parent = (ConstraintLayout) getParent();
            }
            int rscId = f(idString2);
            if (rscId != 0) {
                this.h.put(Integer.valueOf(rscId), idString2);
                b(rscId);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + idString2 + "\"");
        }
    }

    public final int f(String referenceId) {
        ConstraintLayout parent = null;
        if (getParent() instanceof ConstraintLayout) {
            parent = (ConstraintLayout) getParent();
        }
        int rscId = 0;
        if (isInEditMode() && parent != null) {
            Object value = parent.f(0, referenceId);
            if (value instanceof Integer) {
                rscId = ((Integer) value).intValue();
            }
        }
        if (rscId == 0 && parent != null) {
            rscId = e(parent, referenceId);
        }
        if (rscId == 0) {
            try {
                rscId = j.class.getField(referenceId).getInt(null);
            } catch (Exception e2) {
            }
        }
        if (rscId == 0) {
            return this.f701d.getResources().getIdentifier(referenceId, "id", this.f701d.getPackageName());
        }
        return rscId;
    }

    public final int e(ConstraintLayout container, String idString) {
        Resources resources;
        if (idString == null || container == null || (resources = this.f701d.getResources()) == null) {
            return 0;
        }
        int count = container.getChildCount();
        for (int j = 0; j < count; j++) {
            View child = container.getChildAt(j);
            if (child.getId() != -1) {
                String res = null;
                try {
                    res = resources.getResourceEntryName(child.getId());
                } catch (Resources.NotFoundException e2) {
                }
                if (idString.equals(res)) {
                    return child.getId();
                }
            }
        }
        return 0;
    }

    public void setIds(String idList) {
        this.f704g = idList;
        if (idList != null) {
            int begin = 0;
            this.f700c = 0;
            while (true) {
                int end = idList.indexOf(44, begin);
                if (end == -1) {
                    a(idList.substring(begin));
                    return;
                } else {
                    a(idList.substring(begin, end));
                    begin = end + 1;
                }
            }
        }
    }

    public void d(ConstraintLayout container) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f700c; i++) {
            View view = container.h(this.f699b[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }

    public void l(ConstraintLayout container) {
        String candidate;
        int foundId;
        if (isInEditMode()) {
            setIds(this.f704g);
        }
        h hVar = this.f702e;
        if (hVar != null) {
            ((i) hVar).b1();
            for (int i = 0; i < this.f700c; i++) {
                int id = this.f699b[i];
                View view = container.h(id);
                if (view == null && (foundId = e(container, (candidate = this.h.get(Integer.valueOf(id))))) != 0) {
                    this.f699b[i] = foundId;
                    this.h.put(Integer.valueOf(foundId), candidate);
                    view = container.h(foundId);
                }
                if (view != null) {
                    ((i) this.f702e).Y0(container.i(view));
                }
            }
            this.f702e.a(container.f1625d);
        }
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public void h(e widget, boolean isRtl) {
    }
}
