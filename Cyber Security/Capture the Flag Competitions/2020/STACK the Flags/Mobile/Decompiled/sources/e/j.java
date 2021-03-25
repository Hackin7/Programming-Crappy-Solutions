package e;

import java.util.Arrays;

public final class j extends d {

    /* renamed from: g  reason: collision with root package name */
    public final transient byte[][] f2848g;
    public final transient int[] h;

    public j(a buffer, int byteCount) {
        super(null);
        m.b(buffer.f2826c, 0, (long) byteCount);
        int offset = 0;
        int segmentCount = 0;
        h s = buffer.f2825b;
        while (offset < byteCount) {
            int i = s.f2841c;
            int i2 = s.f2840b;
            if (i != i2) {
                offset += i - i2;
                segmentCount++;
                s = s.f2844f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f2848g = new byte[segmentCount][];
        this.h = new int[(segmentCount * 2)];
        int offset2 = 0;
        int segmentCount2 = 0;
        h s2 = buffer.f2825b;
        while (offset2 < byteCount) {
            this.f2848g[segmentCount2] = s2.f2839a;
            offset2 += s2.f2841c - s2.f2840b;
            if (offset2 > byteCount) {
                offset2 = byteCount;
            }
            int[] iArr = this.h;
            iArr[segmentCount2] = offset2;
            iArr[this.f2848g.length + segmentCount2] = s2.f2840b;
            s2.f2842d = true;
            segmentCount2++;
            s2 = s2.f2844f;
        }
    }

    @Override // e.d
    public String m() {
        return p().m();
    }

    @Override // e.d
    public String e() {
        return p().e();
    }

    @Override // e.d
    public d l(int beginIndex, int endIndex) {
        return p().l(beginIndex, endIndex);
    }

    @Override // e.d
    public byte d(int pos) {
        m.b((long) this.h[this.f2848g.length - 1], (long) pos, 1);
        int segment = n(pos);
        int segmentOffset = segment == 0 ? 0 : this.h[segment - 1];
        int[] iArr = this.h;
        byte[][] bArr = this.f2848g;
        return bArr[segment][(pos - segmentOffset) + iArr[bArr.length + segment]];
    }

    public final int n(int pos) {
        int i = Arrays.binarySearch(this.h, 0, this.f2848g.length, pos + 1);
        return i >= 0 ? i : ~i;
    }

    @Override // e.d
    public int j() {
        return this.h[this.f2848g.length - 1];
    }

    public byte[] o() {
        int[] iArr = this.h;
        byte[][] bArr = this.f2848g;
        byte[] result = new byte[iArr[bArr.length - 1]];
        int segmentOffset = 0;
        int segmentCount = bArr.length;
        for (int s = 0; s < segmentCount; s++) {
            int[] iArr2 = this.h;
            int segmentPos = iArr2[segmentCount + s];
            int nextSegmentOffset = iArr2[s];
            System.arraycopy(this.f2848g[s], segmentPos, result, segmentOffset, nextSegmentOffset - segmentOffset);
            segmentOffset = nextSegmentOffset;
        }
        return result;
    }

    @Override // e.d
    public boolean h(int offset, d other, int otherOffset, int byteCount) {
        if (offset < 0 || offset > j() - byteCount) {
            return false;
        }
        int s = n(offset);
        while (byteCount > 0) {
            int segmentOffset = s == 0 ? 0 : this.h[s - 1];
            int stepSize = Math.min(byteCount, (segmentOffset + (this.h[s] - segmentOffset)) - offset);
            int[] iArr = this.h;
            byte[][] bArr = this.f2848g;
            if (!other.i(otherOffset, bArr[s], (offset - segmentOffset) + iArr[bArr.length + s], stepSize)) {
                return false;
            }
            offset += stepSize;
            otherOffset += stepSize;
            byteCount -= stepSize;
            s++;
        }
        return true;
    }

    @Override // e.d
    public boolean i(int offset, byte[] other, int otherOffset, int byteCount) {
        if (offset < 0 || offset > j() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int s = n(offset);
        while (byteCount > 0) {
            int segmentOffset = s == 0 ? 0 : this.h[s - 1];
            int stepSize = Math.min(byteCount, (segmentOffset + (this.h[s] - segmentOffset)) - offset);
            int[] iArr = this.h;
            byte[][] bArr = this.f2848g;
            if (!m.a(bArr[s], (offset - segmentOffset) + iArr[bArr.length + s], other, otherOffset, stepSize)) {
                return false;
            }
            offset += stepSize;
            otherOffset += stepSize;
            byteCount -= stepSize;
            s++;
        }
        return true;
    }

    public final d p() {
        return new d(o());
    }

    @Override // e.d
    public byte[] f() {
        return o();
    }

    @Override // e.d
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof d) || ((d) o).j() != j() || !h(0, (d) o, 0, j())) {
            return false;
        }
        return true;
    }

    @Override // e.d
    public int hashCode() {
        int result = this.f2830c;
        if (result != 0) {
            return result;
        }
        int result2 = 1;
        int segmentOffset = 0;
        int segmentCount = this.f2848g.length;
        for (int s = 0; s < segmentCount; s++) {
            byte[] segment = this.f2848g[s];
            int[] iArr = this.h;
            int segmentPos = iArr[segmentCount + s];
            int nextSegmentOffset = iArr[s];
            int limit = segmentPos + (nextSegmentOffset - segmentOffset);
            for (int i = segmentPos; i < limit; i++) {
                result2 = (result2 * 31) + segment[i];
            }
            segmentOffset = nextSegmentOffset;
        }
        this.f2830c = result2;
        return result2;
    }

    @Override // e.d
    public String toString() {
        return p().toString();
    }
}
