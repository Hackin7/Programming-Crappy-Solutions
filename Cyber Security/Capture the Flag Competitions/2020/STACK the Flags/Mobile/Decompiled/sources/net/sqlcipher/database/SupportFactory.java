package net.sqlcipher.database;

import a.q.a.b;

public class SupportFactory {
    public final boolean clearPassphrase;
    public final SQLiteDatabaseHook hook;
    public final byte[] passphrase;

    public SupportFactory(byte[] passphrase2) {
        this(passphrase2, null);
    }

    public SupportFactory(byte[] passphrase2, SQLiteDatabaseHook hook2) {
        this(passphrase2, hook2, true);
    }

    public SupportFactory(byte[] passphrase2, SQLiteDatabaseHook hook2, boolean clearPassphrase2) {
        this.passphrase = passphrase2;
        this.hook = hook2;
        this.clearPassphrase = clearPassphrase2;
    }

    public b create(b.a configuration) {
        return new SupportHelper(configuration, this.passphrase, this.hook, this.clearPassphrase);
    }
}
