package net.sqlcipher;

public class UnknownTypeException extends RuntimeException {
    public UnknownTypeException() {
    }

    public UnknownTypeException(String error) {
        super(error);
    }
}
