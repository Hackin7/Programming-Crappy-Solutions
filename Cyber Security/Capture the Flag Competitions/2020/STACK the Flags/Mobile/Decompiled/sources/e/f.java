package e;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import okio.ByteString;

public final class f extends AbstractList<d> implements RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public final d[] f2834b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f2835c;

    public f(d[] byteStrings, int[] trie) {
        this.f2834b = byteStrings;
        this.f2835c = trie;
    }

    public static f d(d... byteStrings) {
        if (byteStrings.length == 0) {
            return new f(new d[0], new int[]{0, -1});
        }
        List<ByteString> list = new ArrayList<>(Arrays.asList(byteStrings));
        Collections.sort(list);
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            indexes.add(-1);
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            indexes.set(Collections.binarySearch(list, byteStrings[i2]), Integer.valueOf(i2));
        }
        if (((d) list.get(0)).j() != 0) {
            for (int a2 = 0; a2 < list.size(); a2++) {
                d prefix = (d) list.get(a2);
                int b2 = a2 + 1;
                while (b2 < list.size()) {
                    d byteString = (d) list.get(b2);
                    if (!byteString.k(prefix)) {
                        continue;
                        break;
                    } else if (byteString.j() == prefix.j()) {
                        throw new IllegalArgumentException("duplicate option: " + byteString);
                    } else if (indexes.get(b2).intValue() > indexes.get(a2).intValue()) {
                        list.remove(b2);
                        indexes.remove(b2);
                    } else {
                        b2++;
                    }
                }
            }
            a trieBytes = new a();
            a(0, trieBytes, 0, list, 0, list.size(), indexes);
            int[] trie = new int[c(trieBytes)];
            for (int i3 = 0; i3 < trie.length; i3++) {
                trie[i3] = trieBytes.q();
            }
            if (trieBytes.h()) {
                return new f((d[]) byteStrings.clone(), trie);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public static void a(long nodeOffset, a node, int byteStringOffset, List<d> list, int fromIndex, int toIndex, List<Integer> indexes) {
        d from;
        int fromIndex2;
        int prefixIndex;
        int rangeEnd;
        a childNodes;
        int selectChoiceCount;
        int rangeEnd2;
        int prefixIndex2;
        List<Integer> list2 = indexes;
        if (fromIndex < toIndex) {
            for (int i = fromIndex; i < toIndex; i++) {
                if (list.get(i).j() < byteStringOffset) {
                    throw new AssertionError();
                }
            }
            d from2 = list.get(fromIndex);
            d to = list.get(toIndex - 1);
            if (byteStringOffset == from2.j()) {
                int prefixIndex3 = list2.get(fromIndex).intValue();
                int fromIndex3 = fromIndex + 1;
                fromIndex2 = fromIndex3;
                from = list.get(fromIndex3);
                prefixIndex = prefixIndex3;
            } else {
                fromIndex2 = fromIndex;
                from = from2;
                prefixIndex = -1;
            }
            if (from.d(byteStringOffset) != to.d(byteStringOffset)) {
                int selectChoiceCount2 = 1;
                for (int i2 = fromIndex2 + 1; i2 < toIndex; i2++) {
                    if (list.get(i2 - 1).d(byteStringOffset) != list.get(i2).d(byteStringOffset)) {
                        selectChoiceCount2++;
                    }
                }
                long childNodesOffset = nodeOffset + ((long) c(node)) + 2 + ((long) (selectChoiceCount2 * 2));
                node.D(selectChoiceCount2);
                node.D(prefixIndex);
                for (int i3 = fromIndex2; i3 < toIndex; i3++) {
                    byte rangeByte = list.get(i3).d(byteStringOffset);
                    if (i3 == fromIndex2 || rangeByte != list.get(i3 - 1).d(byteStringOffset)) {
                        node.D(rangeByte & 255);
                    }
                }
                a childNodes2 = new a();
                int rangeStart = fromIndex2;
                while (rangeStart < toIndex) {
                    byte rangeByte2 = list.get(rangeStart).d(byteStringOffset);
                    int i4 = rangeStart + 1;
                    while (true) {
                        if (i4 >= toIndex) {
                            rangeEnd = toIndex;
                            break;
                        } else if (rangeByte2 != list.get(i4).d(byteStringOffset)) {
                            rangeEnd = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (rangeStart + 1 == rangeEnd && byteStringOffset + 1 == list.get(rangeStart).j()) {
                        node.D(list2.get(rangeStart).intValue());
                        rangeEnd2 = rangeEnd;
                        childNodes = childNodes2;
                        selectChoiceCount = selectChoiceCount2;
                        prefixIndex2 = prefixIndex;
                    } else {
                        node.D((int) ((childNodesOffset + ((long) c(childNodes2))) * -1));
                        rangeEnd2 = rangeEnd;
                        childNodes = childNodes2;
                        selectChoiceCount = selectChoiceCount2;
                        prefixIndex2 = prefixIndex;
                        a(childNodesOffset, childNodes2, byteStringOffset + 1, list, rangeStart, rangeEnd2, indexes);
                    }
                    rangeStart = rangeEnd2;
                    childNodes2 = childNodes;
                    prefixIndex = prefixIndex2;
                    selectChoiceCount2 = selectChoiceCount;
                    list2 = indexes;
                }
                node.A(childNodes2, childNodes2.v());
                return;
            }
            int i5 = byteStringOffset;
            int max = Math.min(from.j(), to.j());
            int scanByteCount = 0;
            while (i5 < max && from.d(i5) == to.d(i5)) {
                scanByteCount++;
                i5++;
            }
            long childNodesOffset2 = nodeOffset + ((long) c(node)) + 2 + ((long) scanByteCount) + 1;
            node.D(-scanByteCount);
            node.D(prefixIndex);
            for (int i6 = byteStringOffset; i6 < byteStringOffset + scanByteCount; i6++) {
                node.D(from.d(i6) & 255);
            }
            if (fromIndex2 + 1 != toIndex) {
                a childNodes3 = new a();
                node.D((int) ((childNodesOffset2 + ((long) c(childNodes3))) * -1));
                a(childNodesOffset2, childNodes3, byteStringOffset + scanByteCount, list, fromIndex2, toIndex, indexes);
                node.A(childNodes3, childNodes3.v());
            } else if (byteStringOffset + scanByteCount == list.get(fromIndex2).j()) {
                node.D(indexes.get(fromIndex2).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public d get(int i) {
        return this.f2834b[i];
    }

    public final int size() {
        return this.f2834b.length;
    }

    public static int c(a trieBytes) {
        return (int) (trieBytes.v() / 4);
    }
}
