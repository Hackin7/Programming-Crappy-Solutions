package p000;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* renamed from: m */
final class C0684m {

    /* renamed from: a */
    static C0684m f2950a;

    /* renamed from: b */
    private final Context f2951b;

    /* renamed from: c */
    private final LocationManager f2952c;

    /* renamed from: d */
    private final C0685a f2953d = new C0685a();

    /* renamed from: m$a */
    static class C0685a {

        /* renamed from: a */
        boolean f2954a;

        /* renamed from: b */
        long f2955b;

        /* renamed from: c */
        long f2956c;

        /* renamed from: d */
        long f2957d;

        /* renamed from: e */
        long f2958e;

        /* renamed from: f */
        long f2959f;

        C0685a() {
        }
    }

    C0684m(Context context, LocationManager locationManager) {
        this.f2951b = context;
        this.f2952c = locationManager;
    }

    /* renamed from: a */
    private Location m2118a(String str) {
        try {
            if (this.f2952c.isProviderEnabled(str)) {
                return this.f2952c.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo2479a() {
        long j;
        C0685a aVar = this.f2953d;
        boolean z = false;
        if (this.f2953d.f2959f > System.currentTimeMillis()) {
            return aVar.f2954a;
        }
        Location location = null;
        Location a = C0314ew.m1050a(this.f2951b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m2118a("network") : null;
        if (C0314ew.m1050a(this.f2951b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m2118a("gps");
        }
        if (location == null || a == null ? location != null : location.getTime() > a.getTime()) {
            a = location;
        }
        if (a != null) {
            C0685a aVar2 = this.f2953d;
            long currentTimeMillis = System.currentTimeMillis();
            if (C0644l.f2795a == null) {
                C0644l.f2795a = new C0644l();
            }
            C0644l lVar = C0644l.f2795a;
            lVar.mo2421a(currentTimeMillis - 86400000, a.getLatitude(), a.getLongitude());
            long j2 = lVar.f2796b;
            C0644l lVar2 = lVar;
            lVar.mo2421a(currentTimeMillis, a.getLatitude(), a.getLongitude());
            if (lVar2.f2798d == 1) {
                z = true;
            }
            long j3 = lVar2.f2797c;
            long j4 = lVar2.f2796b;
            long j5 = currentTimeMillis + 86400000;
            double latitude = a.getLatitude();
            double longitude = a.getLongitude();
            C0644l lVar3 = lVar2;
            lVar2.mo2421a(j5, latitude, longitude);
            long j6 = lVar3.f2797c;
            if (j3 == -1 || j4 == -1) {
                j = 43200000 + currentTimeMillis;
            } else {
                long j7 = currentTimeMillis > j4 ? 0 + j6 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3;
                j = j7 + 60000;
            }
            long j8 = j;
            aVar2.f2954a = z;
            aVar2.f2955b = j2;
            aVar2.f2956c = j3;
            aVar2.f2957d = j4;
            aVar2.f2958e = j6;
            aVar2.f2959f = j8;
            return aVar.f2954a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
