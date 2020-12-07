package e;

import java.io.Closeable;

public interface k extends Closeable {
    long b(a aVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
