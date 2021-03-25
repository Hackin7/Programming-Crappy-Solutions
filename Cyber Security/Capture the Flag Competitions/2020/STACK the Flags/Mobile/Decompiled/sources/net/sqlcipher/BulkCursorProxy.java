package net.sqlcipher;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;

public final class BulkCursorProxy implements IBulkCursor {
    public Bundle mExtras = null;
    public IBinder mRemote;

    public BulkCursorProxy(IBinder remote) {
        this.mRemote = remote;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // net.sqlcipher.IBulkCursor
    public CursorWindow getWindow(int startPos) {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        data.writeInterfaceToken(IBulkCursor.descriptor);
        data.writeInt(startPos);
        this.mRemote.transact(1, data, reply, 0);
        DatabaseUtils.readExceptionFromParcel(reply);
        CursorWindow window = null;
        if (reply.readInt() == 1) {
            window = CursorWindow.newFromParcel(reply);
        }
        data.recycle();
        reply.recycle();
        return window;
    }

    @Override // net.sqlcipher.IBulkCursor
    public void onMove(int position) {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        data.writeInterfaceToken(IBulkCursor.descriptor);
        data.writeInt(position);
        this.mRemote.transact(8, data, reply, 0);
        DatabaseUtils.readExceptionFromParcel(reply);
        data.recycle();
        reply.recycle();
    }

    @Override // net.sqlcipher.IBulkCursor
    public int count() {
        int count;
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        data.writeInterfaceToken(IBulkCursor.descriptor);
        boolean result = this.mRemote.transact(2, data, reply, 0);
        DatabaseUtils.readExceptionFromParcel(reply);
        if (!result) {
            count = -1;
        } else {
            count = reply.readInt();
        }
        data.recycle();
        reply.recycle();
        return count;
    }

    @Override // net.sqlcipher.IBulkCursor
    public String[] getColumnNames() {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        data.writeInterfaceToken(IBulkCursor.descriptor);
        this.mRemote.transact(3, data, reply, 0);
        DatabaseUtils.readExceptionFromParcel(reply);
        int numColumns = reply.readInt();
        String[] columnNames = new String[numColumns];
        for (int i = 0; i < numColumns; i++) {
            columnNames[i] = reply.readString();
        }
        data.recycle();
        reply.recycle();
        return columnNames;
    }

    @Override // net.sqlcipher.IBulkCursor
    public void deactivate() {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        data.writeInterfaceToken(IBulkCursor.descriptor);
        this.mRemote.transact(6, data, reply, 0);
        DatabaseUtils.readExceptionFromParcel(reply);
        data.recycle();
        reply.recycle();
    }

    @Override // net.sqlcipher.IBulkCursor
    public void close() {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        data.writeInterfaceToken(IBulkCursor.descriptor);
        this.mRemote.transact(12, data, reply, 0);
        DatabaseUtils.readExceptionFromParcel(reply);
        data.recycle();
        reply.recycle();
    }

    @Override // net.sqlcipher.IBulkCursor
    public int requery(IContentObserver observer, CursorWindow window) {
        int count;
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        data.writeInterfaceToken(IBulkCursor.descriptor);
        data.writeStrongInterface(observer);
        window.writeToParcel(data, 0);
        boolean result = this.mRemote.transact(7, data, reply, 0);
        DatabaseUtils.readExceptionFromParcel(reply);
        if (!result) {
            count = -1;
        } else {
            count = reply.readInt();
            this.mExtras = reply.readBundle(getClass().getClassLoader());
        }
        data.recycle();
        reply.recycle();
        return count;
    }

    @Override // net.sqlcipher.IBulkCursor
    public boolean updateRows(Map values) {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        data.writeInterfaceToken(IBulkCursor.descriptor);
        data.writeMap(values);
        boolean result = false;
        this.mRemote.transact(4, data, reply, 0);
        DatabaseUtils.readExceptionFromParcel(reply);
        if (reply.readInt() == 1) {
            result = true;
        }
        data.recycle();
        reply.recycle();
        return result;
    }

    @Override // net.sqlcipher.IBulkCursor
    public boolean deleteRow(int position) {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        data.writeInterfaceToken(IBulkCursor.descriptor);
        data.writeInt(position);
        boolean result = false;
        this.mRemote.transact(5, data, reply, 0);
        DatabaseUtils.readExceptionFromParcel(reply);
        if (reply.readInt() == 1) {
            result = true;
        }
        data.recycle();
        reply.recycle();
        return result;
    }

    @Override // net.sqlcipher.IBulkCursor
    public boolean getWantsAllOnMoveCalls() {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        data.writeInterfaceToken(IBulkCursor.descriptor);
        this.mRemote.transact(9, data, reply, 0);
        DatabaseUtils.readExceptionFromParcel(reply);
        int result = reply.readInt();
        data.recycle();
        reply.recycle();
        if (result != 0) {
            return true;
        }
        return false;
    }

    @Override // net.sqlcipher.IBulkCursor
    public Bundle getExtras() {
        if (this.mExtras == null) {
            Parcel data = Parcel.obtain();
            Parcel reply = Parcel.obtain();
            data.writeInterfaceToken(IBulkCursor.descriptor);
            this.mRemote.transact(10, data, reply, 0);
            DatabaseUtils.readExceptionFromParcel(reply);
            this.mExtras = reply.readBundle(getClass().getClassLoader());
            data.recycle();
            reply.recycle();
        }
        return this.mExtras;
    }

    @Override // net.sqlcipher.IBulkCursor
    public Bundle respond(Bundle extras) {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        data.writeInterfaceToken(IBulkCursor.descriptor);
        data.writeBundle(extras);
        this.mRemote.transact(11, data, reply, 0);
        DatabaseUtils.readExceptionFromParcel(reply);
        Bundle returnExtras = reply.readBundle(getClass().getClassLoader());
        data.recycle();
        reply.recycle();
        return returnExtras;
    }
}
