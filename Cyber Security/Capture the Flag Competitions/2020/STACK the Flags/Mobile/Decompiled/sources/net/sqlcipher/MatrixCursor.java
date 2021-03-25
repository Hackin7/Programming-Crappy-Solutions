package net.sqlcipher;

import java.util.ArrayList;

public class MatrixCursor extends AbstractCursor {
    public final int columnCount;
    public final String[] columnNames;
    public Object[] data;
    public int rowCount;

    public MatrixCursor(String[] columnNames2, int initialCapacity) {
        this.rowCount = 0;
        this.columnNames = columnNames2;
        this.columnCount = columnNames2.length;
        this.data = new Object[(this.columnCount * (initialCapacity < 1 ? 1 : initialCapacity))];
    }

    public MatrixCursor(String[] columnNames2) {
        this(columnNames2, 16);
    }

    private Object get(int column) {
        int i;
        if (column < 0 || column >= (i = this.columnCount)) {
            throw new CursorIndexOutOfBoundsException("Requested column: " + column + ", # of columns: " + this.columnCount);
        }
        int i2 = this.mPos;
        if (i2 < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        } else if (i2 < this.rowCount) {
            return this.data[(i2 * i) + column];
        } else {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
    }

    public RowBuilder newRow() {
        int i = this.rowCount + 1;
        this.rowCount = i;
        int endIndex = i * this.columnCount;
        ensureCapacity(endIndex);
        return new RowBuilder(endIndex - this.columnCount, endIndex);
    }

    public void addRow(Object[] columnValues) {
        int length = columnValues.length;
        int i = this.columnCount;
        if (length == i) {
            int i2 = this.rowCount;
            this.rowCount = i2 + 1;
            int start = i2 * i;
            ensureCapacity(i + start);
            System.arraycopy(columnValues, 0, this.data, start, this.columnCount);
            return;
        }
        throw new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.length = " + columnValues.length);
    }

    public void addRow(Iterable<?> columnValues) {
        int i = this.rowCount;
        int i2 = this.columnCount;
        int start = i * i2;
        int end = i2 + start;
        ensureCapacity(end);
        if (columnValues instanceof ArrayList) {
            addRow((ArrayList) columnValues, start);
            return;
        }
        int current = start;
        Object[] localData = this.data;
        for (Object columnValue : columnValues) {
            if (current != end) {
                localData[current] = columnValue;
                current++;
            } else {
                throw new IllegalArgumentException("columnValues.size() > columnNames.length");
            }
        }
        if (current == end) {
            this.rowCount++;
            return;
        }
        throw new IllegalArgumentException("columnValues.size() < columnNames.length");
    }

    private void addRow(ArrayList<?> columnValues, int start) {
        int size = columnValues.size();
        if (size == this.columnCount) {
            this.rowCount++;
            Object[] localData = this.data;
            for (int i = 0; i < size; i++) {
                localData[start + i] = columnValues.get(i);
            }
            return;
        }
        throw new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.size() = " + size);
    }

    private void ensureCapacity(int size) {
        Object[] objArr = this.data;
        if (size > objArr.length) {
            Object[] oldData = this.data;
            int newSize = objArr.length * 2;
            if (newSize < size) {
                newSize = size;
            }
            Object[] objArr2 = new Object[newSize];
            this.data = objArr2;
            System.arraycopy(oldData, 0, objArr2, 0, oldData.length);
        }
    }

    public class RowBuilder {
        public final int endIndex;
        public int index;

        public RowBuilder(int index2, int endIndex2) {
            this.index = index2;
            this.endIndex = endIndex2;
        }

        public RowBuilder add(Object columnValue) {
            if (this.index != this.endIndex) {
                Object[] objArr = MatrixCursor.this.data;
                int i = this.index;
                this.index = i + 1;
                objArr[i] = columnValue;
                return this;
            }
            throw new CursorIndexOutOfBoundsException("No more columns left.");
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public int getCount() {
        return this.rowCount;
    }

    @Override // net.sqlcipher.AbstractCursor
    public String[] getColumnNames() {
        return this.columnNames;
    }

    @Override // net.sqlcipher.AbstractCursor
    public String getString(int column) {
        Object value = get(column);
        if (value == null) {
            return null;
        }
        return value.toString();
    }

    @Override // net.sqlcipher.AbstractCursor
    public short getShort(int column) {
        Object value = get(column);
        if (value == null) {
            return 0;
        }
        if (value instanceof Number) {
            return ((Number) value).shortValue();
        }
        return Short.parseShort(value.toString());
    }

    @Override // net.sqlcipher.AbstractCursor
    public int getInt(int column) {
        Object value = get(column);
        if (value == null) {
            return 0;
        }
        if (value instanceof Number) {
            return ((Number) value).intValue();
        }
        return Integer.parseInt(value.toString());
    }

    @Override // net.sqlcipher.AbstractCursor
    public long getLong(int column) {
        Object value = get(column);
        if (value == null) {
            return 0;
        }
        if (value instanceof Number) {
            return ((Number) value).longValue();
        }
        return Long.parseLong(value.toString());
    }

    @Override // net.sqlcipher.AbstractCursor
    public float getFloat(int column) {
        Object value = get(column);
        if (value == null) {
            return 0.0f;
        }
        if (value instanceof Number) {
            return ((Number) value).floatValue();
        }
        return Float.parseFloat(value.toString());
    }

    @Override // net.sqlcipher.AbstractCursor
    public double getDouble(int column) {
        Object value = get(column);
        if (value == null) {
            return 0.0d;
        }
        if (value instanceof Number) {
            return ((Number) value).doubleValue();
        }
        return Double.parseDouble(value.toString());
    }

    @Override // net.sqlcipher.AbstractCursor, net.sqlcipher.Cursor
    public int getType(int column) {
        return DatabaseUtils.getTypeOfObject(get(column));
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean isNull(int column) {
        return get(column) == null;
    }
}
