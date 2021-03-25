package net.sqlcipher.database;

public class SQLiteFullException extends SQLiteException {
    public SQLiteFullException() {
    }

    public SQLiteFullException(String error) {
        super(error);
    }
}
