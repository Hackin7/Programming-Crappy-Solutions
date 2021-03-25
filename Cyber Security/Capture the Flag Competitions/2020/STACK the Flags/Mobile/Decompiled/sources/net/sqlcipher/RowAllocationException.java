package net.sqlcipher;

public class RowAllocationException extends RuntimeException {
    public RowAllocationException() {
    }

    public RowAllocationException(String error) {
        super(error);
    }
}
