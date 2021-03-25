package a.i.a;

import a.i.a.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f1010b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1011c;

    /* renamed from: d  reason: collision with root package name */
    public Cursor f1012d;

    /* renamed from: e  reason: collision with root package name */
    public Context f1013e;

    /* renamed from: f  reason: collision with root package name */
    public int f1014f;

    /* renamed from: g  reason: collision with root package name */
    public C0027a f1015g;
    public DataSetObserver h;
    public b i;

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract CharSequence c(Cursor cursor);

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public a(Context context, Cursor c2, boolean autoRequery) {
        e(context, c2, autoRequery ? 1 : 2);
    }

    public void e(Context context, Cursor c2, int flags) {
        boolean cursorPresent = false;
        if ((flags & 1) == 1) {
            flags |= 2;
            this.f1011c = true;
        } else {
            this.f1011c = false;
        }
        if (c2 != null) {
            cursorPresent = true;
        }
        this.f1012d = c2;
        this.f1010b = cursorPresent;
        this.f1013e = context;
        this.f1014f = cursorPresent ? c2.getColumnIndexOrThrow("_id") : -1;
        if ((flags & 2) == 2) {
            this.f1015g = new C0027a();
            this.h = new b();
        } else {
            this.f1015g = null;
            this.h = null;
        }
        if (cursorPresent) {
            C0027a aVar = this.f1015g;
            if (aVar != null) {
                c2.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                c2.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public Cursor d() {
        return this.f1012d;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f1010b || (cursor = this.f1012d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Object getItem(int position) {
        Cursor cursor;
        if (!this.f1010b || (cursor = this.f1012d) == null) {
            return null;
        }
        cursor.moveToPosition(position);
        return this.f1012d;
    }

    public long getItemId(int position) {
        Cursor cursor;
        if (!this.f1010b || (cursor = this.f1012d) == null || !cursor.moveToPosition(position)) {
            return 0;
        }
        return this.f1012d.getLong(this.f1014f);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if (!this.f1010b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f1012d.moveToPosition(position)) {
            if (convertView == null) {
                v = g(this.f1013e, this.f1012d, parent);
            } else {
                v = convertView;
            }
            a(v, this.f1013e, this.f1012d);
            return v;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + position);
        }
    }

    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v;
        if (!this.f1010b) {
            return null;
        }
        this.f1012d.moveToPosition(position);
        if (convertView == null) {
            v = f(this.f1013e, this.f1012d, parent);
        } else {
            v = convertView;
        }
        a(v, this.f1013e, this.f1012d);
        return v;
    }

    public void b(Cursor cursor) {
        Cursor old = i(cursor);
        if (old != null) {
            old.close();
        }
    }

    public Cursor i(Cursor newCursor) {
        if (newCursor == this.f1012d) {
            return null;
        }
        Cursor oldCursor = this.f1012d;
        if (oldCursor != null) {
            C0027a aVar = this.f1015g;
            if (aVar != null) {
                oldCursor.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                oldCursor.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1012d = newCursor;
        if (newCursor != null) {
            C0027a aVar2 = this.f1015g;
            if (aVar2 != null) {
                newCursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.h;
            if (dataSetObserver2 != null) {
                newCursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f1014f = newCursor.getColumnIndexOrThrow("_id");
            this.f1010b = true;
            notifyDataSetChanged();
        } else {
            this.f1014f = -1;
            this.f1010b = false;
            notifyDataSetInvalidated();
        }
        return oldCursor;
    }

    public Filter getFilter() {
        if (this.i == null) {
            this.i = new b(this);
        }
        return this.i;
    }

    public void h() {
        Cursor cursor;
        if (this.f1011c && (cursor = this.f1012d) != null && !cursor.isClosed()) {
            this.f1010b = this.f1012d.requery();
        }
    }

    /* renamed from: a.i.a.a$a  reason: collision with other inner class name */
    public class C0027a extends ContentObserver {
        public C0027a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean selfChange) {
            a.this.h();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f1010b = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f1010b = false;
            aVar.notifyDataSetInvalidated();
        }
    }
}
