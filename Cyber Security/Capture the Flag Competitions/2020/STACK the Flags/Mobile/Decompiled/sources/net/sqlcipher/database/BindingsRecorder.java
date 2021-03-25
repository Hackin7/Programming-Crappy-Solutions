package net.sqlcipher.database;

import a.q.a.c;
import android.util.SparseArray;
import net.sqlcipher.BuildConfig;

public class BindingsRecorder implements c {
    public SparseArray<Object> bindings = new SparseArray<>();

    public void bindNull(int index) {
        this.bindings.put(index, null);
    }

    public void bindLong(int index, long value) {
        this.bindings.put(index, Long.valueOf(value));
    }

    public void bindDouble(int index, double value) {
        this.bindings.put(index, Double.valueOf(value));
    }

    public void bindString(int index, String value) {
        this.bindings.put(index, value);
    }

    public void bindBlob(int index, byte[] value) {
        this.bindings.put(index, value);
    }

    public void clearBindings() {
        this.bindings.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        clearBindings();
    }

    public String[] getBindings() {
        String[] result = new String[this.bindings.size()];
        for (int i = 0; i < this.bindings.size(); i++) {
            int key = this.bindings.keyAt(i);
            if (this.bindings.get(key) != null) {
                result[i] = this.bindings.get(key).toString();
            } else {
                result[i] = BuildConfig.FLAVOR;
            }
        }
        return result;
    }
}
