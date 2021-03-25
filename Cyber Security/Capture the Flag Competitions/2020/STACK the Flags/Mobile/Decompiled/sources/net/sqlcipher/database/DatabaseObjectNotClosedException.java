package net.sqlcipher.database;

public class DatabaseObjectNotClosedException extends RuntimeException {
    public static final String s = "Application did not close the cursor or database object that was opened here";

    public DatabaseObjectNotClosedException() {
        super(s);
    }
}
