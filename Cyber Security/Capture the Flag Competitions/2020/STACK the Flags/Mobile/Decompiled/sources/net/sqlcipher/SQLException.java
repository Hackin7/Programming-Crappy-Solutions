package net.sqlcipher;

public class SQLException extends RuntimeException {
    public SQLException() {
    }

    public SQLException(String error) {
        super(error);
    }
}
