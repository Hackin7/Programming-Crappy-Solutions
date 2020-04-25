package p000;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: kb */
public interface C0598kb {

    /* renamed from: a */
    public static final C0598kb f2570a = new C0598kb() {
        /* renamed from: a */
        public final List<InetAddress> mo2318a(String str) {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e) {
                StringBuilder sb = new StringBuilder("Broken system behaviour for dns lookup of ");
                sb.append(str);
                UnknownHostException unknownHostException = new UnknownHostException(sb.toString());
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
    };

    /* renamed from: a */
    List<InetAddress> mo2318a(String str);
}
