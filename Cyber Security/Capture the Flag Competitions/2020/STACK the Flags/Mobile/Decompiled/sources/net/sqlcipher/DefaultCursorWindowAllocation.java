package net.sqlcipher;

public class DefaultCursorWindowAllocation implements CursorWindowAllocation {
    public long WindowAllocationUnbounded = 0;
    public long initialAllocationSize = 1048576;

    @Override // net.sqlcipher.CursorWindowAllocation
    public long getInitialAllocationSize() {
        return this.initialAllocationSize;
    }

    @Override // net.sqlcipher.CursorWindowAllocation
    public long getGrowthPaddingSize() {
        return this.initialAllocationSize;
    }

    @Override // net.sqlcipher.CursorWindowAllocation
    public long getMaxAllocationSize() {
        return this.WindowAllocationUnbounded;
    }
}
