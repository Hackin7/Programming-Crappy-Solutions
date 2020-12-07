package net.sqlcipher;

public class CursorWrapper extends android.database.CursorWrapper implements Cursor {
    public final Cursor mCursor;

    public CursorWrapper(Cursor cursor) {
        super(cursor);
        this.mCursor = cursor;
    }

    @Override // net.sqlcipher.Cursor
    public int getType(int columnIndex) {
        return this.mCursor.getType(columnIndex);
    }

    public Cursor getWrappedCursor() {
        return this.mCursor;
    }
}
