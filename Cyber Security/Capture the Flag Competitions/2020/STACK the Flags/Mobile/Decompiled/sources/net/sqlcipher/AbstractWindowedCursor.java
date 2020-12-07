package net.sqlcipher;

import android.database.CharArrayBuffer;

public abstract class AbstractWindowedCursor extends AbstractCursor {
    public CursorWindow mWindow;

    @Override // net.sqlcipher.AbstractCursor
    public byte[] getBlob(int columnIndex) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(columnIndex)) {
                return this.mWindow.getBlob(this.mPos, columnIndex);
            }
            return (byte[]) getUpdatedField(columnIndex);
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public String getString(int columnIndex) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(columnIndex)) {
                return this.mWindow.getString(this.mPos, columnIndex);
            }
            return (String) getUpdatedField(columnIndex);
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (isFieldUpdated(columnIndex)) {
                super.copyStringToBuffer(columnIndex, buffer);
            }
        }
        this.mWindow.copyStringToBuffer(this.mPos, columnIndex, buffer);
    }

    @Override // net.sqlcipher.AbstractCursor
    public short getShort(int columnIndex) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(columnIndex)) {
                return this.mWindow.getShort(this.mPos, columnIndex);
            }
            return ((Number) getUpdatedField(columnIndex)).shortValue();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public int getInt(int columnIndex) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(columnIndex)) {
                return this.mWindow.getInt(this.mPos, columnIndex);
            }
            return ((Number) getUpdatedField(columnIndex)).intValue();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public long getLong(int columnIndex) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(columnIndex)) {
                return this.mWindow.getLong(this.mPos, columnIndex);
            }
            return ((Number) getUpdatedField(columnIndex)).longValue();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public float getFloat(int columnIndex) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(columnIndex)) {
                return this.mWindow.getFloat(this.mPos, columnIndex);
            }
            return ((Number) getUpdatedField(columnIndex)).floatValue();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public double getDouble(int columnIndex) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(columnIndex)) {
                return this.mWindow.getDouble(this.mPos, columnIndex);
            }
            return ((Number) getUpdatedField(columnIndex)).doubleValue();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean isNull(int columnIndex) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(columnIndex)) {
                return this.mWindow.isNull(this.mPos, columnIndex);
            }
            return getUpdatedField(columnIndex) == null;
        }
    }

    public boolean isBlob(int columnIndex) {
        boolean z;
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(columnIndex)) {
                return this.mWindow.isBlob(this.mPos, columnIndex);
            }
            Object object = getUpdatedField(columnIndex);
            if (object != null) {
                if (!(object instanceof byte[])) {
                    z = false;
                    return z;
                }
            }
            z = true;
            return z;
        }
    }

    public boolean isString(int columnIndex) {
        boolean z;
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(columnIndex)) {
                return this.mWindow.isString(this.mPos, columnIndex);
            }
            Object object = getUpdatedField(columnIndex);
            if (object != null) {
                if (!(object instanceof String)) {
                    z = false;
                    return z;
                }
            }
            z = true;
            return z;
        }
    }

    public boolean isLong(int columnIndex) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(columnIndex)) {
                return this.mWindow.isLong(this.mPos, columnIndex);
            }
            Object object = getUpdatedField(columnIndex);
            return object != null && ((object instanceof Integer) || (object instanceof Long));
        }
    }

    public boolean isFloat(int columnIndex) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(columnIndex)) {
                return this.mWindow.isFloat(this.mPos, columnIndex);
            }
            Object object = getUpdatedField(columnIndex);
            return object != null && ((object instanceof Float) || (object instanceof Double));
        }
    }

    @Override // net.sqlcipher.AbstractCursor, net.sqlcipher.Cursor
    public int getType(int columnIndex) {
        checkPosition();
        return this.mWindow.getType(this.mPos, columnIndex);
    }

    @Override // net.sqlcipher.AbstractCursor
    public void checkPosition() {
        super.checkPosition();
        if (this.mWindow == null) {
            throw new StaleDataException("Access closed cursor");
        }
    }

    @Override // net.sqlcipher.AbstractCursor, net.sqlcipher.AbstractCursor
    public CursorWindow getWindow() {
        return this.mWindow;
    }

    public void setWindow(CursorWindow window) {
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null) {
            cursorWindow.close();
        }
        this.mWindow = window;
    }

    public boolean hasWindow() {
        return this.mWindow != null;
    }
}
