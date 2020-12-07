package e;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import net.sqlcipher.BuildConfig;

public final class a implements c, b, Cloneable, ByteChannel {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public h f2825b;

    /* renamed from: c  reason: collision with root package name */
    public long f2826c;

    public /* bridge */ /* synthetic */ b C(int i) {
        B(i);
        return this;
    }

    public /* bridge */ /* synthetic */ b G(String str) {
        E(str);
        return this;
    }

    public /* bridge */ /* synthetic */ b H(String str, int i, int i2) {
        F(str, i, i2);
        return this;
    }

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    }

    public final long v() {
        return this.f2826c;
    }

    @Override // e.c
    public a d() {
        return this;
    }

    public boolean h() {
        return this.f2826c == 0;
    }

    @Override // e.c
    public boolean c(long byteCount) {
        return this.f2826c >= byteCount;
    }

    /* JADX INFO: Multiple debug info for r3v1 byte: [D('pos' int), D('b' byte)] */
    public byte l() {
        long j = this.f2826c;
        if (j != 0) {
            h segment = this.f2825b;
            int pos = segment.f2840b;
            int limit = segment.f2841c;
            int pos2 = pos + 1;
            byte b2 = segment.f2839a[pos];
            this.f2826c = j - 1;
            if (pos2 == limit) {
                this.f2825b = segment.b();
                i.a(segment);
            } else {
                segment.f2840b = pos2;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public final byte i(long pos) {
        m.b(this.f2826c, pos, 1);
        long j = this.f2826c;
        if (j - pos > pos) {
            h s = this.f2825b;
            while (true) {
                int i = s.f2841c;
                int i2 = s.f2840b;
                int segmentByteCount = i - i2;
                if (pos < ((long) segmentByteCount)) {
                    return s.f2839a[i2 + ((int) pos)];
                }
                pos -= (long) segmentByteCount;
                s = s.f2844f;
            }
        } else {
            long pos2 = pos - j;
            h s2 = this.f2825b.f2845g;
            while (true) {
                int i3 = s2.f2841c;
                int i4 = s2.f2840b;
                pos2 += (long) (i3 - i4);
                if (pos2 >= 0) {
                    return s2.f2839a[i4 + ((int) pos2)];
                }
                s2 = s2.f2845g;
            }
        }
    }

    public int q() {
        long j = this.f2826c;
        if (j >= 4) {
            h segment = this.f2825b;
            int pos = segment.f2840b;
            int limit = segment.f2841c;
            if (limit - pos < 4) {
                return ((l() & 255) << 24) | ((l() & 255) << 16) | ((l() & 255) << 8) | (l() & 255);
            }
            byte[] data = segment.f2839a;
            int pos2 = pos + 1;
            int pos3 = pos2 + 1;
            int i = ((data[pos] & 255) << 24) | ((data[pos2] & 255) << 16);
            int pos4 = pos3 + 1;
            int i2 = i | ((data[pos3] & 255) << 8);
            int pos5 = pos4 + 1;
            int i3 = i2 | (data[pos4] & 255);
            this.f2826c = j - 4;
            if (pos5 == limit) {
                this.f2825b = segment.b();
                i.a(segment);
            } else {
                segment.f2840b = pos5;
            }
            return i3;
        }
        throw new IllegalStateException("size < 4: " + this.f2826c);
    }

    public d o() {
        return new d(m());
    }

    @Override // e.c
    public int e(f options) {
        int index = u(options, false);
        if (index == -1) {
            return -1;
        }
        try {
            w((long) options.f2834b[index].j());
            return index;
        } catch (EOFException e2) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: Multiple debug info for r9v2 int: [D('scanOrSelect' int), D('triePos' int)] */
    /* JADX INFO: Multiple debug info for r11v1 int: [D('triePos' int), D('possiblePrefixIndex' int)] */
    public int u(f options, boolean selectTruncated) {
        int triePos;
        h head = this.f2825b;
        if (head != null) {
            h s = head;
            byte[] data = head.f2839a;
            int pos = head.f2840b;
            int limit = head.f2841c;
            int[] trie = options.f2835c;
            int scanOrSelect = 0;
            int prefixIndex = -1;
            loop0:
            while (true) {
                int triePos2 = scanOrSelect + 1;
                int triePos3 = trie[scanOrSelect];
                int triePos4 = triePos2 + 1;
                int possiblePrefixIndex = trie[triePos2];
                if (possiblePrefixIndex != -1) {
                    prefixIndex = possiblePrefixIndex;
                }
                if (s == null) {
                    break;
                }
                if (triePos3 < 0) {
                    int trieLimit = triePos4 + (triePos3 * -1);
                    while (true) {
                        int pos2 = pos + 1;
                        int triePos5 = triePos4 + 1;
                        if ((data[pos] & 255) != trie[triePos4]) {
                            return prefixIndex;
                        }
                        boolean scanComplete = triePos5 == trieLimit;
                        if (pos2 == limit) {
                            s = s.f2844f;
                            pos2 = s.f2840b;
                            data = s.f2839a;
                            limit = s.f2841c;
                            if (s == head) {
                                if (!scanComplete) {
                                    break loop0;
                                }
                                s = null;
                            }
                        }
                        if (scanComplete) {
                            pos = pos2;
                            triePos = trie[triePos5];
                            break;
                        }
                        triePos4 = triePos5;
                        pos = pos2;
                    }
                } else {
                    int pos3 = pos + 1;
                    int b2 = data[pos] & 255;
                    int selectLimit = triePos4 + triePos3;
                    while (triePos4 != selectLimit) {
                        if (b2 == trie[triePos4]) {
                            int nextStep = trie[triePos4 + triePos3];
                            if (pos3 == limit) {
                                s = s.f2844f;
                                int pos4 = s.f2840b;
                                data = s.f2839a;
                                limit = s.f2841c;
                                if (s == head) {
                                    s = null;
                                    pos = pos4;
                                    triePos = nextStep;
                                } else {
                                    pos = pos4;
                                    triePos = nextStep;
                                }
                            } else {
                                pos = pos3;
                                triePos = nextStep;
                            }
                        } else {
                            triePos4++;
                        }
                    }
                    return prefixIndex;
                }
                if (triePos >= 0) {
                    return triePos;
                }
                scanOrSelect = -triePos;
            }
            if (selectTruncated) {
                return -2;
            }
            return prefixIndex;
        } else if (selectTruncated) {
            return -2;
        } else {
            return options.indexOf(d.f2828f);
        }
    }

    public String s() {
        try {
            return r(this.f2826c, m.f2849a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public String t(long byteCount) {
        return r(byteCount, m.f2849a);
    }

    public String r(long byteCount, Charset charset) {
        m.b(this.f2826c, 0, byteCount);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (byteCount > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + byteCount);
        } else if (byteCount == 0) {
            return BuildConfig.FLAVOR;
        } else {
            h s = this.f2825b;
            if (((long) s.f2840b) + byteCount > ((long) s.f2841c)) {
                return new String(n(byteCount), charset);
            }
            String result = new String(s.f2839a, s.f2840b, (int) byteCount, charset);
            int i = (int) (((long) s.f2840b) + byteCount);
            s.f2840b = i;
            this.f2826c -= byteCount;
            if (i == s.f2841c) {
                this.f2825b = s.b();
                i.a(s);
            }
            return result;
        }
    }

    public byte[] m() {
        try {
            return n(this.f2826c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public byte[] n(long byteCount) {
        m.b(this.f2826c, 0, byteCount);
        if (byteCount <= 2147483647L) {
            byte[] result = new byte[((int) byteCount)];
            p(result);
            return result;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + byteCount);
    }

    public void p(byte[] sink) {
        int offset = 0;
        while (offset < sink.length) {
            int read = k(sink, offset, sink.length - offset);
            if (read != -1) {
                offset += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int k(byte[] sink, int offset, int byteCount) {
        m.b((long) sink.length, (long) offset, (long) byteCount);
        h s = this.f2825b;
        if (s == null) {
            return -1;
        }
        int toCopy = Math.min(byteCount, s.f2841c - s.f2840b);
        System.arraycopy(s.f2839a, s.f2840b, sink, offset, toCopy);
        int i = s.f2840b + toCopy;
        s.f2840b = i;
        this.f2826c -= (long) toCopy;
        if (i == s.f2841c) {
            this.f2825b = s.b();
            i.a(s);
        }
        return toCopy;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        h s = this.f2825b;
        if (s == null) {
            return -1;
        }
        int toCopy = Math.min(sink.remaining(), s.f2841c - s.f2840b);
        sink.put(s.f2839a, s.f2840b, toCopy);
        int i = s.f2840b + toCopy;
        s.f2840b = i;
        this.f2826c -= (long) toCopy;
        if (i == s.f2841c) {
            this.f2825b = s.b();
            i.a(s);
        }
        return toCopy;
    }

    public final void f() {
        try {
            w(this.f2826c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public void w(long byteCount) {
        while (byteCount > 0) {
            h hVar = this.f2825b;
            if (hVar != null) {
                int toSkip = (int) Math.min(byteCount, (long) (hVar.f2841c - hVar.f2840b));
                this.f2826c -= (long) toSkip;
                byteCount -= (long) toSkip;
                h hVar2 = this.f2825b;
                int i = hVar2.f2840b + toSkip;
                hVar2.f2840b = i;
                if (i == hVar2.f2841c) {
                    h toRecycle = this.f2825b;
                    this.f2825b = toRecycle.b();
                    i.a(toRecycle);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public a E(String string) {
        F(string, 0, string.length());
        return this;
    }

    public a F(String string, int beginIndex, int endIndex) {
        if (string == null) {
            throw new IllegalArgumentException("string == null");
        } else if (beginIndex < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + beginIndex);
        } else if (endIndex < beginIndex) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + endIndex + " < " + beginIndex);
        } else if (endIndex <= string.length()) {
            int runSize = beginIndex;
            while (runSize < endIndex) {
                int c2 = string.charAt(runSize);
                if (c2 < 128) {
                    h tail = z(1);
                    byte[] data = tail.f2839a;
                    int segmentOffset = tail.f2841c - runSize;
                    int runLimit = Math.min(endIndex, 8192 - segmentOffset);
                    int i = runSize + 1;
                    data[runSize + segmentOffset] = (byte) c2;
                    while (i < runLimit) {
                        int c3 = string.charAt(i);
                        if (c3 >= 128) {
                            break;
                        }
                        data[i + segmentOffset] = (byte) c3;
                        i++;
                    }
                    int i2 = tail.f2841c;
                    int runSize2 = (i + segmentOffset) - i2;
                    tail.f2841c = i2 + runSize2;
                    this.f2826c += (long) runSize2;
                    runSize = i;
                } else if (c2 < 2048) {
                    B((c2 >> 6) | 192);
                    B(128 | (c2 & 63));
                    runSize++;
                } else if (c2 < 55296 || c2 > 57343) {
                    B((c2 >> 12) | 224);
                    B(((c2 >> 6) & 63) | 128);
                    B(128 | (c2 & 63));
                    runSize++;
                } else {
                    int low = runSize + 1 < endIndex ? string.charAt(runSize + 1) : 0;
                    if (c2 > 56319 || low < 56320 || low > 57343) {
                        B(63);
                        runSize++;
                    } else {
                        int codePoint = (((-55297 & c2) << 10) | (-56321 & low)) + 65536;
                        B((codePoint >> 18) | 240);
                        B(((codePoint >> 12) & 63) | 128);
                        B(((codePoint >> 6) & 63) | 128);
                        B(128 | (codePoint & 63));
                        runSize += 2;
                    }
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + endIndex + " > " + string.length());
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        if (source != null) {
            int byteCount = source.remaining();
            int remaining = byteCount;
            while (remaining > 0) {
                h tail = z(1);
                int toCopy = Math.min(remaining, 8192 - tail.f2841c);
                source.get(tail.f2839a, tail.f2841c, toCopy);
                remaining -= toCopy;
                tail.f2841c += toCopy;
            }
            this.f2826c += (long) byteCount;
            return byteCount;
        }
        throw new IllegalArgumentException("source == null");
    }

    public a B(int b2) {
        h tail = z(1);
        byte[] bArr = tail.f2839a;
        int i = tail.f2841c;
        tail.f2841c = i + 1;
        bArr[i] = (byte) b2;
        this.f2826c++;
        return this;
    }

    public a D(int i) {
        h tail = z(4);
        byte[] data = tail.f2839a;
        int limit = tail.f2841c;
        int limit2 = limit + 1;
        data[limit] = (byte) ((i >>> 24) & 255);
        int limit3 = limit2 + 1;
        data[limit2] = (byte) ((i >>> 16) & 255);
        int limit4 = limit3 + 1;
        data[limit3] = (byte) ((i >>> 8) & 255);
        data[limit4] = (byte) (i & 255);
        tail.f2841c = limit4 + 1;
        this.f2826c += 4;
        return this;
    }

    public h z(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException();
        }
        h hVar = this.f2825b;
        if (hVar == null) {
            h b2 = i.b();
            this.f2825b = b2;
            b2.f2845g = b2;
            b2.f2844f = b2;
            return b2;
        }
        h tail = hVar.f2845g;
        if (tail.f2841c + minimumCapacity > 8192 || !tail.f2843e) {
            return tail.c(i.b());
        }
        return tail;
    }

    /* JADX INFO: Multiple debug info for r0v7 e.h: [D('segmentToMove' e.h), D('tail' e.h)] */
    public void A(a source, long byteCount) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        } else if (source != this) {
            m.b(source.f2826c, 0, byteCount);
            while (byteCount > 0) {
                h hVar = source.f2825b;
                if (byteCount < ((long) (hVar.f2841c - hVar.f2840b))) {
                    h hVar2 = this.f2825b;
                    h tail = hVar2 != null ? hVar2.f2845g : null;
                    if (tail != null && tail.f2843e) {
                        if ((((long) tail.f2841c) + byteCount) - ((long) (tail.f2842d ? 0 : tail.f2840b)) <= 8192) {
                            source.f2825b.f(tail, (int) byteCount);
                            source.f2826c -= byteCount;
                            this.f2826c += byteCount;
                            return;
                        }
                    }
                    source.f2825b = source.f2825b.e((int) byteCount);
                }
                h tail2 = source.f2825b;
                long movedByteCount = (long) (tail2.f2841c - tail2.f2840b);
                source.f2825b = tail2.b();
                h hVar3 = this.f2825b;
                if (hVar3 == null) {
                    this.f2825b = tail2;
                    tail2.f2845g = tail2;
                    tail2.f2844f = tail2;
                } else {
                    hVar3.f2845g.c(tail2).a();
                }
                source.f2826c -= movedByteCount;
                this.f2826c += movedByteCount;
                byteCount -= movedByteCount;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    @Override // e.k
    public long b(a sink, long byteCount) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (byteCount >= 0) {
            long j = this.f2826c;
            if (j == 0) {
                return -1;
            }
            if (byteCount > j) {
                byteCount = this.f2826c;
            }
            sink.A(this, byteCount);
            return byteCount;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        }
    }

    @Override // e.c
    public long a(d targetBytes) {
        return j(targetBytes, 0);
    }

    public long j(d targetBytes, long fromIndex) {
        long offset;
        a aVar = this;
        if (fromIndex >= 0) {
            h s = aVar.f2825b;
            if (s == null) {
                return -1;
            }
            if (aVar.f2826c - fromIndex >= fromIndex) {
                offset = 0;
                while (true) {
                    long nextOffset = ((long) (s.f2841c - s.f2840b)) + offset;
                    if (nextOffset >= fromIndex) {
                        break;
                    }
                    s = s.f2844f;
                    offset = nextOffset;
                }
            } else {
                offset = aVar.f2826c;
                while (offset > fromIndex) {
                    s = s.f2845g;
                    offset -= (long) (s.f2841c - s.f2840b);
                }
            }
            int i = 0;
            if (targetBytes.j() == 2) {
                byte b0 = targetBytes.d(0);
                byte b1 = targetBytes.d(1);
                long offset2 = offset;
                long fromIndex2 = fromIndex;
                while (offset2 < aVar.f2826c) {
                    byte[] data = s.f2839a;
                    int limit = s.f2841c;
                    for (int pos = (int) ((((long) s.f2840b) + fromIndex2) - offset2); pos < limit; pos++) {
                        byte b2 = data[pos];
                        if (b2 == b0 || b2 == b1) {
                            return ((long) (pos - s.f2840b)) + offset2;
                        }
                    }
                    offset2 += (long) (s.f2841c - s.f2840b);
                    fromIndex2 = offset2;
                    s = s.f2844f;
                }
                return -1;
            }
            byte[] targetByteArray = targetBytes.f();
            long offset3 = offset;
            long fromIndex3 = fromIndex;
            while (offset3 < aVar.f2826c) {
                byte[] data2 = s.f2839a;
                int pos2 = (int) ((((long) s.f2840b) + fromIndex3) - offset3);
                int limit2 = s.f2841c;
                while (pos2 < limit2) {
                    byte b3 = data2[pos2];
                    int length = targetByteArray.length;
                    while (i < length) {
                        if (b3 == targetByteArray[i]) {
                            return ((long) (pos2 - s.f2840b)) + offset3;
                        }
                        i++;
                    }
                    pos2++;
                    i = 0;
                }
                offset3 += (long) (s.f2841c - s.f2840b);
                fromIndex3 = offset3;
                s = s.f2844f;
                aVar = this;
                i = 0;
            }
            return -1;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public boolean isOpen() {
        return true;
    }

    @Override // e.k, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        a that = (a) o;
        long j = this.f2826c;
        if (j != that.f2826c) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        h sa = this.f2825b;
        h sb = that.f2825b;
        int posA = sa.f2840b;
        int posB = sb.f2840b;
        long pos = 0;
        while (pos < this.f2826c) {
            long count = (long) Math.min(sa.f2841c - posA, sb.f2841c - posB);
            int i = 0;
            while (((long) i) < count) {
                int posA2 = posA + 1;
                int posB2 = posB + 1;
                if (sa.f2839a[posA] != sb.f2839a[posB]) {
                    return false;
                }
                i++;
                posA = posA2;
                posB = posB2;
            }
            if (posA == sa.f2841c) {
                sa = sa.f2844f;
                posA = sa.f2840b;
            }
            if (posB == sb.f2841c) {
                sb = sb.f2844f;
                posB = sb.f2840b;
            }
            pos += count;
        }
        return true;
    }

    public int hashCode() {
        h s = this.f2825b;
        if (s == null) {
            return 0;
        }
        int result = 1;
        do {
            int limit = s.f2841c;
            for (int pos = s.f2840b; pos < limit; pos++) {
                result = (result * 31) + s.f2839a[pos];
            }
            s = s.f2844f;
        } while (s != this.f2825b);
        return result;
    }

    public String toString() {
        return x().toString();
    }

    /* renamed from: g */
    public a clone() {
        a result = new a();
        if (this.f2826c == 0) {
            return result;
        }
        h d2 = this.f2825b.d();
        result.f2825b = d2;
        d2.f2845g = d2;
        d2.f2844f = d2;
        for (h s = this.f2825b.f2844f; s != this.f2825b; s = s.f2844f) {
            result.f2825b.f2845g.c(s.d());
        }
        result.f2826c = this.f2826c;
        return result;
    }

    public final d x() {
        long j = this.f2826c;
        if (j <= 2147483647L) {
            return y((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f2826c);
    }

    public final d y(int byteCount) {
        if (byteCount == 0) {
            return d.f2828f;
        }
        return new j(this, byteCount);
    }
}
