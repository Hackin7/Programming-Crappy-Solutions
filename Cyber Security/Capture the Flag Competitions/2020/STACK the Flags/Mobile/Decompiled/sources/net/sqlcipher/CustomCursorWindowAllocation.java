package net.sqlcipher;

public class CustomCursorWindowAllocation implements CursorWindowAllocation {
    public long growthPaddingSize = 0;
    public long initialAllocationSize = 0;
    public long maxAllocationSize = 0;

    public CustomCursorWindowAllocation(long initialSize, long growthPaddingSize2, long maxAllocationSize2) {
        this.initialAllocationSize = initialSize;
        this.growthPaddingSize = growthPaddingSize2;
        this.maxAllocationSize = maxAllocationSize2;
    }

    @Override // net.sqlcipher.CursorWindowAllocation
    public long getInitialAllocationSize() {
        return this.initialAllocationSize;
    }

    @Override // net.sqlcipher.CursorWindowAllocation
    public long getGrowthPaddingSize() {
        return this.growthPaddingSize;
    }

    @Override // net.sqlcipher.CursorWindowAllocation
    public long getMaxAllocationSize() {
        return this.maxAllocationSize;
    }
}
