package a.b.k;

public class m {

    /* renamed from: d  reason: collision with root package name */
    public static m f67d;

    /* renamed from: a  reason: collision with root package name */
    public long f68a;

    /* renamed from: b  reason: collision with root package name */
    public long f69b;

    /* renamed from: c  reason: collision with root package name */
    public int f70c;

    public static m b() {
        if (f67d == null) {
            f67d = new m();
        }
        return f67d;
    }

    public void a(long time, double latitude, double longitude) {
        float daysSince2000 = ((float) (time - 946728000000L)) / 8.64E7f;
        float meanAnomaly = (0.01720197f * daysSince2000) + 6.24006f;
        double solarLng = 1.796593063d + ((double) meanAnomaly) + (Math.sin((double) meanAnomaly) * 0.03341960161924362d) + (Math.sin((double) (2.0f * meanAnomaly)) * 3.4906598739326E-4d) + (Math.sin((double) (3.0f * meanAnomaly)) * 5.236000106378924E-6d) + 3.141592653589793d;
        double arcLongitude = (-longitude) / 360.0d;
        double solarTransitJ2000 = ((double) (9.0E-4f + ((float) Math.round(((double) (daysSince2000 - 9.0E-4f)) - arcLongitude)))) + arcLongitude + (Math.sin((double) meanAnomaly) * 0.0053d) + (Math.sin(2.0d * solarLng) * -0.0069d);
        double solarDec = Math.asin(Math.sin(solarLng) * Math.sin(0.4092797040939331d));
        double latRad = 0.01745329238474369d * latitude;
        double cosHourAngle = (Math.sin(-0.10471975803375244d) - (Math.sin(latRad) * Math.sin(solarDec))) / (Math.cos(latRad) * Math.cos(solarDec));
        if (cosHourAngle >= 1.0d) {
            this.f70c = 1;
            this.f68a = -1;
            this.f69b = -1;
        } else if (cosHourAngle <= -1.0d) {
            this.f70c = 0;
            this.f68a = -1;
            this.f69b = -1;
        } else {
            float hourAngle = (float) (Math.acos(cosHourAngle) / 6.283185307179586d);
            this.f68a = Math.round((((double) hourAngle) + solarTransitJ2000) * 8.64E7d) + 946728000000L;
            long round = Math.round((solarTransitJ2000 - ((double) hourAngle)) * 8.64E7d) + 946728000000L;
            this.f69b = round;
            if (round >= time || this.f68a <= time) {
                this.f70c = 1;
            } else {
                this.f70c = 0;
            }
        }
    }
}
