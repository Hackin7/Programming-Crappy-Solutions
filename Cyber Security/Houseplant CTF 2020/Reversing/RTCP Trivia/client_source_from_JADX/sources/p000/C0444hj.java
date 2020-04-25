package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* renamed from: hj */
public abstract class C0444hj extends BaseAdapter implements Filterable, C0448a {

    /* renamed from: b */
    protected boolean f1893b = false;

    /* renamed from: c */
    protected boolean f1894c = true;

    /* renamed from: d */
    protected Cursor f1895d = null;

    /* renamed from: e */
    protected Context f1896e;

    /* renamed from: f */
    protected int f1897f;

    /* renamed from: g */
    protected C0445a f1898g;

    /* renamed from: h */
    protected DataSetObserver f1899h;

    /* renamed from: i */
    protected C0447hk f1900i;

    /* renamed from: j */
    protected FilterQueryProvider f1901j;

    /* renamed from: hj$a */
    class C0445a extends ContentObserver {
        C0445a() {
            super(new Handler());
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            C0444hj.this.mo1885b();
        }
    }

    /* renamed from: hj$b */
    class C0446b extends DataSetObserver {
        C0446b() {
        }

        public final void onChanged() {
            C0444hj.this.f1893b = true;
            C0444hj.this.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            C0444hj.this.f1893b = false;
            C0444hj.this.notifyDataSetInvalidated();
        }
    }

    public C0444hj(Context context) {
        this.f1896e = context;
        this.f1897f = -1;
        this.f1898g = new C0445a();
        this.f1899h = new C0446b();
    }

    /* renamed from: a */
    public final Cursor mo1883a() {
        return this.f1895d;
    }

    /* renamed from: a */
    public Cursor mo1295a(CharSequence charSequence) {
        return this.f1901j != null ? this.f1901j.runQuery(charSequence) : this.f1895d;
    }

    /* renamed from: a */
    public abstract View mo1296a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public void mo1297a(Cursor cursor) {
        Cursor cursor2;
        if (cursor == this.f1895d) {
            cursor2 = null;
        } else {
            Cursor cursor3 = this.f1895d;
            if (cursor3 != null) {
                if (this.f1898g != null) {
                    cursor3.unregisterContentObserver(this.f1898g);
                }
                if (this.f1899h != null) {
                    cursor3.unregisterDataSetObserver(this.f1899h);
                }
            }
            this.f1895d = cursor;
            if (cursor != null) {
                if (this.f1898g != null) {
                    cursor.registerContentObserver(this.f1898g);
                }
                if (this.f1899h != null) {
                    cursor.registerDataSetObserver(this.f1899h);
                }
                this.f1897f = cursor.getColumnIndexOrThrow("_id");
                this.f1893b = true;
                notifyDataSetChanged();
            } else {
                this.f1897f = -1;
                this.f1893b = false;
                notifyDataSetInvalidated();
            }
            cursor2 = cursor3;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: a */
    public abstract void mo1298a(View view, Cursor cursor);

    /* renamed from: b */
    public View mo1884b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo1296a(context, cursor, viewGroup);
    }

    /* renamed from: b */
    public CharSequence mo1299b(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo1885b() {
        if (this.f1894c && this.f1895d != null && !this.f1895d.isClosed()) {
            this.f1893b = this.f1895d.requery();
        }
    }

    public int getCount() {
        if (!this.f1893b || this.f1895d == null) {
            return 0;
        }
        return this.f1895d.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1893b) {
            return null;
        }
        this.f1895d.moveToPosition(i);
        if (view == null) {
            view = mo1884b(this.f1896e, this.f1895d, viewGroup);
        }
        mo1298a(view, this.f1895d);
        return view;
    }

    public Filter getFilter() {
        if (this.f1900i == null) {
            this.f1900i = new C0447hk(this);
        }
        return this.f1900i;
    }

    public Object getItem(int i) {
        if (!this.f1893b || this.f1895d == null) {
            return null;
        }
        this.f1895d.moveToPosition(i);
        return this.f1895d;
    }

    public long getItemId(int i) {
        if (!this.f1893b || this.f1895d == null || !this.f1895d.moveToPosition(i)) {
            return 0;
        }
        return this.f1895d.getLong(this.f1897f);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1893b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (!this.f1895d.moveToPosition(i)) {
            StringBuilder sb = new StringBuilder("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else {
            if (view == null) {
                view = mo1296a(this.f1896e, this.f1895d, viewGroup);
            }
            mo1298a(view, this.f1895d);
            return view;
        }
    }

    public boolean hasStableIds() {
        return true;
    }
}
