package net.sqlcipher;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

public interface IBulkCursor extends IInterface {
    public static final int CLOSE_TRANSACTION = 12;
    public static final int COUNT_TRANSACTION = 2;
    public static final int DEACTIVATE_TRANSACTION = 6;
    public static final int DELETE_ROW_TRANSACTION = 5;
    public static final int GET_COLUMN_NAMES_TRANSACTION = 3;
    public static final int GET_CURSOR_WINDOW_TRANSACTION = 1;
    public static final int GET_EXTRAS_TRANSACTION = 10;
    public static final int ON_MOVE_TRANSACTION = 8;
    public static final int REQUERY_TRANSACTION = 7;
    public static final int RESPOND_TRANSACTION = 11;
    public static final int UPDATE_ROWS_TRANSACTION = 4;
    public static final int WANTS_ON_MOVE_TRANSACTION = 9;
    public static final String descriptor = "android.content.IBulkCursor";

    void close();

    int count();

    void deactivate();

    boolean deleteRow(int i);

    String[] getColumnNames();

    Bundle getExtras();

    boolean getWantsAllOnMoveCalls();

    CursorWindow getWindow(int i);

    void onMove(int i);

    int requery(IContentObserver iContentObserver, CursorWindow cursorWindow);

    Bundle respond(Bundle bundle);

    boolean updateRows(Map<? extends Long, ? extends Map<String, Object>> map);
}
