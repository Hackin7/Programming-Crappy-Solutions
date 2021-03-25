package b.a.a.u;

public class h {

    /* renamed from: d  reason: collision with root package name */
    public static String f2095d = "\r";

    /* renamed from: a  reason: collision with root package name */
    public final String f2096a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2097b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2098c;

    public h(String name, float startFrame, float durationFrames) {
        this.f2096a = name;
        this.f2098c = durationFrames;
        this.f2097b = startFrame;
    }

    public boolean a(String name) {
        if (this.f2096a.equalsIgnoreCase(name)) {
            return true;
        }
        if (this.f2096a.endsWith("\r")) {
            String str = this.f2096a;
            if (str.substring(0, str.length() - 1).equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
