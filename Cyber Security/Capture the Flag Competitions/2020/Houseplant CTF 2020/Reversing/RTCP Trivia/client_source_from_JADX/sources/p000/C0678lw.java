package p000;

/* renamed from: lw */
public enum C0678lw {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: l */
    public final int f2916l;

    private C0678lw(int i) {
        this.f2916l = i;
    }

    /* renamed from: a */
    public static C0678lw m2096a(int i) {
        C0678lw[] values;
        for (C0678lw lwVar : values()) {
            if (lwVar.f2916l == i) {
                return lwVar;
            }
        }
        return null;
    }
}
